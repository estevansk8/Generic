import java.util.List;

public interface GenericDAO<K, T> {

    default void insert(T client){

    }

    public default Client findOne(K key){
        return null;
    }

    public default List<Client> findAll(){
        return null;
    }

    public default void update(T client){

    }

    public default void remove(K key){

    }
}

