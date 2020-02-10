package persist;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ProductDaoJpaImp implements Dao<Product> {
    @Inject
    private Product product;


    @PersistenceContext(unitName = "ds")
    protected EntityManager em;

    public ProductDaoJpaImp() {
    }

    @Override
    public void insert(Product product) {
            em.persist(product);

    }

    @Override
    public void update(Product product) {
        em.merge(product);
    }

    @Override
    public void delete(Product product) {
         product = em.find(Product.class, id);
        if (product != null) {
            em.remove(product);
        }
    }

    @Override
    public List<Product> findAll() {
            return em.createQuery("from Product ", Product.class).getResultList();
    }
}
