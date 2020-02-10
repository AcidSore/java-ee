package persist;

import javax.ejb.Local;
import java.util.List;


@Local
public interface Dao<T> {
    void insert(T t);
    void update(T t);
    void delete(T t);
    List<T> findAll();
}
