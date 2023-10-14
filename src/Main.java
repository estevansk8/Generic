import java.util.ArrayList;

public class Main {
    public static <List> void main(String[] args) {

        //Simulador do banco de dados
        ClientDAO clientDAO = new ClientDAO();

        //Criando cliente
        Client estevan = new Client("123", "Estevan");

        clientDAO.insert(estevan);

        // Buscando o cliente por CPF
        Client retrievedClient = clientDAO.findOne("123");
        System.out.println("Cliente encontrado: " + retrievedClient.getName());

        // Atualizando o nome do cliente
        retrievedClient.setName("Miguel da Silva");
        clientDAO.update(retrievedClient);
        
    }
}