import java.util.List;

import dao.UserDAO;
import model.User;

public class App {
    public static void main(String[] args) throws Exception {
        
        /* Connection connection = ConnectBd.getConnection();

        if (connection == null) {
        System.out.println("Erro de conexão...");
        return;
        }
        System.out.println("Conectado xD");

        connection.close();
        */

        // CRIANDO USER NO BANCO
        // User usuario = new User("Pedrao", "56aaaqq@1234.com", "testete");
        // UserDAO dao = new UserDAO();
        // if(dao.insertUser(usuario)){
        //     System.out.println("User criado");
        // } else {
        //     System.out.println("Erro ao criar");
        // }
        // dao.close();

        // ATUALIZANDO USER NO BANCO
        // User usuario = new User(1,"Jota", "teste@testando.com", "544444");
        // UserDAO dao = new UserDAO();
        // if(dao.updateUser(usuario)){
        //     System.out.println("Dados atualizados!!!");
        // } else {
        //     System.out.println("Erro ao atualizar!!!");
        // }
        // dao.close();
        
        //DELETANDO USER
        // UserDAO dao = new UserDAO();
        // if(dao.deletUser(2)){
        //     System.out.println("Deletado!!!");
        // } else {
        //     System.out.println("Erro ao deletar ");
        // }
        // dao.close();

        //BUSCANDO USUARIO
        // UserDAO dao = new UserDAO();
        // User user = dao.findUser(4);
        // if(user != null){
        //     System.out.println(user);
        // } else {
        //     System.out.println("Usuario não encontrado...");
        // }
        // dao.close();

        UserDAO dao = new UserDAO();
        List<User> users = dao.listUser();

        for (User user : users) {
            System.out.println(user);
        }
        
        dao.close();


    }

}
