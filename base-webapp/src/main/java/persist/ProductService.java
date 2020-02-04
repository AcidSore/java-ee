package persist;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class ProductService {

    @EJB
    private ProductDaoJpaImp dao;


    @TransactionAttribute
    public void insert(Product product){
        try {
            dao.insert(product);
        }
        catch (Exception e){e.printStackTrace();}
    }

    @TransactionAttribute
    public void update(Product product){
        try {
            dao.update(product);
        }
        catch (Exception e){e.printStackTrace();}
    }

    @TransactionAttribute
    public void delete(Product product){
        try {
            dao.delete(product);
        }
        catch (Exception e){e.printStackTrace();}
    }

    @TransactionAttribute
    public List<Product> findAll(){
        List<Product> products = new ArrayList<>();
        try {
            products = dao.findAll();
        }
        catch (Exception e){e.printStackTrace();}
        return products;
    }
}
