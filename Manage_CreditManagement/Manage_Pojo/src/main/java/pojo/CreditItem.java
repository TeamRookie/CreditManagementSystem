package pojo;

import java.io.Serializable;

public class CreditItem implements Serializable{
	
	private String itemtime;
	private String itemname;
	private Float itemscore;
	private String level;
	
	public String getItemtime() {
		return itemtime;
	}
	public void setItemtime(String itemtime) {
		this.itemtime = itemtime;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public Float getItemscore() {
		return itemscore;
	}
	public void setItemscore(Float itemscore) {
		this.itemscore = itemscore;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

}
