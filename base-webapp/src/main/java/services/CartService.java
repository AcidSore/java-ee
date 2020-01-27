package services;

import persist.LineItem;
import persist.Product;
import persist.ProductRepository;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Named
@SessionScoped
public class CartService implements Serializable {
    private Map<LineItem, Integer> lineItems;


    public CartService(){
        lineItems = new HashMap<>();
    }

    @Transactional
    public void addProductQty(Product product, String color, Integer qty){
        LineItem lineItem = new LineItem(product,color);
        lineItems.put(lineItem,lineItems.getOrDefault(lineItem,0+qty));
    }

    @Transactional
    public void removeProductQty(Product product, String color, int qty){
        LineItem lineItem = new LineItem(product,color);
        int currentQty  = lineItems.getOrDefault(lineItems,0);
        if((currentQty -qty) >0){
            lineItems.put(lineItem, currentQty-qty);
        }
    }

    @Transactional
    public List<LineItem> getLineItems(){
        lineItems.forEach(((lineItem, qty) -> lineItem.setQty(qty)));
        return new ArrayList<>(lineItems.keySet());
    }
}
