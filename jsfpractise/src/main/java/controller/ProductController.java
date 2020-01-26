package controller;

import persist.Cart;
import persist.CartRepository;
import persist.Product;
import persist.ProductRepository;

import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class ProductController implements Serializable {

    @Inject
    private ProductRepository productRepository;


    private Product product;
    private List<Product> orderList;

    private Cart cart;

    public String addToCart(Product product){
        orderList.add(product);
        return "/index.xhtml?faces-redirect=true";
    }

    public String goToCart(){
        cart = new Cart();
        cart.setOrderList(orderList);
        return "cart.xhtml";
    }

}
