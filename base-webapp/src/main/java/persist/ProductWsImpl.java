package persist;


import services.ProductServiceWs;
import services.ProductService;

import javax.ejb.EJB;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "AcidSore//base-webapp/ProductRepositoryWs")
public class ProductWsImpl implements ProductServiceWs {
    @EJB
    private ProductService service;

    @Override
    public List<Product> findAll() {
        return service.findAll();
    }
}
