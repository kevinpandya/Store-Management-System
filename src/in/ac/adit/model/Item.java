package in.ac.adit.model;

public class Item {
			private int item_id;
			private String item_name;
			private String item_company;
			private int item_price;
			private int item_quantity;
			
			public int getItem_id() {
				return item_id;
			}
			public void setItem_id(int item_id) {
				this.item_id = item_id;
			}
			public String getItem_name() {
				return item_name;
			}
			public void setItem_name(String item_name) {
				this.item_name = item_name;
			}
			public String getItem_company() {
				return item_company;
			}
			public void setItem_company(String item_company) {
				this.item_company = item_company;
			}
			public int getItem_price() {
				return item_price;
			}
			public void setItem_price(int item_price) {
				this.item_price = item_price;
			}
			public int getItem_quantity() {
				return item_quantity;
			}
			public void setItem_quantity(int item_quantity) {
				this.item_quantity = item_quantity;
			}
			@Override
			public String toString() {
				return "Item [item_id=" + item_id + ", item_name=" + item_name + ", item_company=" + item_company
						+ ", item_price=" + item_price + ", item_quantity=" + item_quantity + ", getItem_id()="
						+ getItem_id() + ", getItem_name()=" + getItem_name() + ", getItem_company()="
						+ getItem_company() + ", getItem_price()=" + getItem_price() + ", getItem_quantity()="
						+ getItem_quantity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
						+ ", toString()=" + super.toString() + "]";
			}
			
}
