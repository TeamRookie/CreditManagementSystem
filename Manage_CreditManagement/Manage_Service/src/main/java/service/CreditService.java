package service;

import java.util.List;

import pojo.CreditItem;

public interface CreditService {

	List<CreditItem> getItems(String type, String num);

}
