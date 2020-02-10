package persist;

import services.ProductService;

import javax.ejb.EJB;
import javax.ejb.Local;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Local
@Path("/products")
public class ProductServiceRs {
    @EJB
    private ProductService service;


    @PUT
    @Path("/insert")
    @Produces(MediaType.APPLICATION_JSON)
    public void insert(Product product){
        service.insert(product);
    }

    @GET
    @Path("/upd")
    @Produces(MediaType.APPLICATION_JSON)
    public void update(Product product){
       service.update(product);
    }

    @DELETE
    @Path("/delete")
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(Product product){
      service.delete(product);
    }

    @GET
    @Path("/all_products")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> findAll(){
        return service.findAll();
    }



}
