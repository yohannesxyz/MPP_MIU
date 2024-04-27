package prob2B;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Order {
  private LocalDate orderDate;
  private List<OrderLine> orderLines;

  Order(LocalDate orderDate) {
    if (orderDate == null) throw new IllegalArgumentException("Order Date cannot be null");
    this.orderDate = orderDate;
  }

  public LocalDate getOrderDate() {
    return orderDate;
  }

  public List<OrderLine> getOrderLines() {
    return orderLines;
  }

  public void addOrderLines(List<OrderLine> orderLines) {
    if (this.orderLines == null) {
      this.orderLines = new ArrayList<>();
    }
    this.orderLines.addAll(orderLines);
  }

  public void addOrderLine(OrderLine orderLine) {
    if (this.orderLines == null) {
      this.orderLines = new ArrayList<>();
    }
    this.orderLines.add(orderLine);
  }
}
