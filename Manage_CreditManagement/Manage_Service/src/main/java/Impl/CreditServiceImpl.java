package Impl;


import mapper.CreditMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.CreditItem;
import service.CreditService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class CreditServiceImpl implements CreditService
{
	
	@Autowired
	private CreditMapper creditMapper;

	public List<CreditItem> getItems(String type, String num) {
		List<CreditItem> items = new ArrayList<CreditItem>();
		List<Map<String, Object>> list = creditMapper.selectByStunum(type+"time", type+"name", "credit", type, num);
		for(Map<String, Object> map : list){
			CreditItem item = new CreditItem();
			item.setItemtime((String) map.get("a"));
			String name = (String) map.get("b");
			StringBuffer str = new StringBuffer("");
			for(int i = 0; i < name.length(); ++i){
				str.append(name.charAt(i));
				if(0==(i+1)%15){
					str.append("\r\n<br/>");
				}
			}
			item.setItemname(str.toString());
			item.setItemscore((Float)map.get("c"));
			if(map.get("d")!=null){
				item.setLevel((String) map.get("d"));
			}
			items.add(item);
		}
		return items;
	}

}
