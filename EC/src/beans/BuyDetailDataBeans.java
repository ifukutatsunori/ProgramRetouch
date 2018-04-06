package beans;

import java.io.Serializable;

public class BuyDetailDataBeans  implements Serializable {
	private int id;
	private int buyId;
	private int itemId;
	private int BuyTotalPrice;

	public BuyDetailDataBeans(int buyId) {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public BuyDetailDataBeans() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public int getId() {
		return id;
	}
	public void setId(int buyDetailId) {
		this.id = buyDetailId;
	}
	public int getBuyId() {
		return buyId;
	}
	public void setBuyId(int buyId) {
		this.buyId = buyId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getBuyTotalPrice() {
		return BuyTotalPrice;
	}
	public void setBuyTotalPrice(int buyTotalPrice) {
		BuyTotalPrice = buyTotalPrice;
	}

}
