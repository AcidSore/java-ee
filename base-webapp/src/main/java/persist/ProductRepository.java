package persist;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class ProductRepository implements Serializable {

    @Inject
    private Product product;
    

    @PersistenceContext(unitName = "ds")
    protected EntityManager em;

    public ProductRepository() {
    }

    public void inser() {
        em.persist(product);
    }

    public void update() {
        em.merge(product);
    }

    public void delete() {
        Product product = em.find(Product.class, id);
        if (product != null) {
            em.remove(product);
        }
    }

    public List<Product> findALL() {
        return em.createQuery("from Product ", Product.class).getResultList();
    }
}




