package services;

import persist.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface ProductServiceWs {
    @WebMethod
    List<Product> findAll();
}
