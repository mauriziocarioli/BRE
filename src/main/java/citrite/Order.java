package citrite;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {

	private static final long serialVersionUID = 6810510455129323181L;
	
	private OrderHeader OrderHeader;
	private List<OrderLineItem> OrderLineItems;

	public OrderHeader getOrderHeader() {
		return this.OrderHeader;
	}

	public void setOrderHeader(OrderHeader OrderHeader) {
		this.OrderHeader = OrderHeader;
	}

	public List<OrderLineItem> getOrderLineItems() {
		return this.OrderLineItems;
	}

	public void setOrderLineItems(List<OrderLineItem> OrderLineItems) {
		this.OrderLineItems = OrderLineItems;
	}

	public double getOrderTotalSRP() {
		
		double total = 0;
	    for(int i = 0; i < this.getOrderLineItems().size(); i++) {
	    	double srp = this.getOrderLineItems().get(i).getSRP_USD();
	    	System.out.println("BRE|Order.getOrderTotalSRP> SRP for order line item "+this.getOrderLineItems().get(i).getOrderLine_ID()+" = "+srp);
	    	total += this.getOrderLineItems().get(i).getSRP_USD();
	    }
	    System.out.println("BRE|Order.getOrderTotalSRP> total order SRP = "+total);
        return total;
        
	}
	
	public boolean isFollowOn() {
		//TODO
		return true;
	}

	public Order(OrderHeader OrderHeader, List<OrderLineItem> OrderLineItems) {
		this.OrderHeader = OrderHeader;
		this.OrderLineItems = OrderLineItems;
	}

	public Order() {
	}

}
