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
	    //TODO
        return 1000.00;
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
