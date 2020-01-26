package controller;

import persist.Cart;
import persist.CartRepository;
import persist.Product;

import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class CartController implements Serializable {

    @Inject
    private CartRepository cartRepository;

    private Cart cart;

    public List<Product> getAllProducts(){
        List<Product> res = new ArrayList<>();
        res = cart.getOrderList();
        return res;
    }

    public String validate(){
        return "validation.xhtml";
    }
}
