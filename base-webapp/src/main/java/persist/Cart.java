package persist;

import java.util.List;

public class Cart {
    private Long id;

    List<Long> orderList;

    public Cart() {
    }

    public Cart(Long id, List<Long> orderList) {
        this.id = id;
        this.orderList = orderList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Long> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Long> orderList) {
        this.orderList = orderList;
    }

}
