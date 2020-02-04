package controller;

import persist.Cart;
import persist.Logger;
import persist.Product;
import persist.ProductService;
import services.CartService;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.interceptor.Interceptors;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class ProductController implements Serializable {

    @EJB
    private ProductService productService;

    @Inject
    private CartService cartService;

    private Product product;


    private Cart cart;

    private List<Product> products;

    public void preloadProducts(ComponentSystemEvent cse){
        this.products = productService.findAll();
    }

    @Interceptors({Logger.class})
    public String addToCart(Product product){
        cartService.addProductQty(product,"green",1);
        return "/index.xhtml?faces-redirect=true";
    }

    @Interceptors({Logger.class})
    public String goToCart(){
        cart = new Cart();
        return "cart.xhtml";
    }

}
