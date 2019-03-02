package pojo;

import java.io.Serializable;
import java.util.List;

public class Credit  implements Serializable{
	
	private String typename;
	private List<CreditItem> creditItem;
	private Float credit;
	private String comment;
	
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public List<CreditItem> getCreditItem() {
		return creditItem;
	}
	public void setCreditItem(List<CreditItem> creditItem) {
		this.creditItem = creditItem;
	}
	public Float getCredit() {
		return credit;
	}
	public void setCredit(Float credit) {
		this.credit = credit;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
