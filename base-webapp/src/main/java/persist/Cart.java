package persist;

import javax.faces.bean.SessionScoped;
import java.util.List;

@SessionScoped
public class Cart {
    private Long id;

    private List<Product> orderList;

    public Cart() {
    }

    public Cart(Long id, List<Product> orderList) {
        this.id = id;
        this.orderList = orderList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Product> orderList) {
        this.orderList = orderList;
    }

}
