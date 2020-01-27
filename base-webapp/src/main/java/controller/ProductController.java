package controller;

import persist.Cart;
import persist.Product;
import persist.ProductRepository;
import services.CartService;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class ProductController implements Serializable {

    @Inject
    private ProductRepository productRepository;

    @Inject
    private CartService cartService;

    private Product product;


    private Cart cart;

    private List<Product> products;

    public void preloadProducts(ComponentSystemEvent cse){
        this.products = productRepository.findALL();
    }

    public String addToCart(Product product){
        cartService.addProductQty(product,"green",1);
        return "/index.xhtml?faces-redirect=true";
    }

    public String goToCart(){
        cart = new Cart();
        return "cart.xhtml";
    }

}
