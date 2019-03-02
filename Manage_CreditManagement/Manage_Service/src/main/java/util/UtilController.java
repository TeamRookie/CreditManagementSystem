package util;

import java.util.List;

import pojo.Credit;
import pojo.CreditItem;
import pojo.Type;
import service.CreditService;

public class UtilController {
	
	/**
	 * 
	 * @param creditService 传creditService服务层
	 * @param num  学生学号 进行查询
	 * @param typeList 类型列表 遍历类型列表统计学分
	 * @param creditList 学分列表 再调用函数创建空的即可
	 * @return 总成绩
	 */
	public static float creditData(CreditService creditService, String num, List<Type> typeList, List<Credit> creditList){
		for(Type type: typeList){
			Credit cr = new Credit();
			cr.setTypename(type.getTypename());
			List<CreditItem> items = creditService.getItems(type.getInformationurl(), num);//type获得对应的mapper, 通过学号查找所有项
			if(items != null && items.size() > 0){
				if(type.getInformationurl().equals("contest") || type.getInformationurl().equals("production")){
					float itemsSum = 0.0f;
					float limit = 0.0f;
					for(CreditItem item : items){
						if(item.getLevel().equals("报纸")){
							item.setItemname(item.getItemname()+"(报纸)");
							limit += item.getItemscore();
						}else if(item.getLevel().equals("大连大学报")){
							item.setItemname(item.getItemname()+"(大连大学报)");
							limit += item.getItemscore();
						}else if(item.getLevel().equals("校级")){
							item.setItemname(item.getItemname()+"(校级)");
							limit += item.getItemscore();
						}else{
							itemsSum += item.getItemscore();
						}
					}
					itemsSum += limit>2f?2f:limit;
					cr.setCredit(itemsSum);
				}else{
					float itemsSum = 0.0f;
					for(CreditItem item : items){
						itemsSum += item.getItemscore();
					}
					if(type.getTypename().contains("社团") || type.getTypename().contains("工作室") || type.getTypename().contains("暑期")){
						itemsSum = itemsSum > 2?2.0f:itemsSum;
					}
					cr.setCredit(itemsSum);
				}
				cr.setCreditItem(items);
				creditList.add(cr);
			}else{
				;//不进行操作
			}
		}
		float sum = 0.0f;
		for(Credit credit:creditList){
			sum += credit.getCredit();
		}
		return sum;
	}
	
}
