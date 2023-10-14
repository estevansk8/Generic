import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ClientDAO implements GenericDAO<String, Client>{
    private Map<String, Client> databaseSimulator = new LinkedHashMap<>();

    @Override
    public void insert(Client client) {
        databaseSimulator.put(client.getCpf(), client);
        System.out.println("Inserido com sucesso!!!");
    }

    @Override
    public Client findOne(String cpf) {
        if (databaseSimulator.containsKey(cpf)) return databaseSimulator.get(cpf);
        return null;
    }

    @Override
    public List<Client> findAll() {
        return new ArrayList<>(databaseSimulator.values());
    }

    @Override
    public void update(Client client) {
        if (!databaseSimulator.containsKey(client.getCpf())){
            System.out.println("Impossible to update");
        }
        for (Client value : databaseSimulator.values()){
            if (value.getCpf().equals(client.getCpf())){
                value = client;
                System.out.println("Updated");
            }
        }
    }

    @Override
    public void remove(String key) {
        databaseSimulator.remove(key);
    }
}

