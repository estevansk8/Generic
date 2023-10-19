import java.util.List;

public interface GenericDAO<K, T> {

    void insert(T object);

    T findOne(K key);

    List<T> findAll();

    void update(T client);

    void remove(K key);
}

