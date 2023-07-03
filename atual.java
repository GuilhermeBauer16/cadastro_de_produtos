import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class atual {
       public static void main(String[] args ){
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String senha = "0910";
        String nomeBancoDados = "Produtos";

        try {
            Connection connection = DriverManager.getConnection(url , user , senha);
            Statement statement = connection.createStatement();
            String sqlCriaBanco = "CREATE DATABASE IF NOT EXISTS " + nomeBancoDados + "DEFAULT CHARACTER SET 'utf8mb4' DEFAULT COLLATE utf8mb4_general_ci" ;
            statement.executeUpdate(sqlCriaBanco);
            System.out.println("Banco de dados criado com sucesso");
            statement.close();
            connection.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        while (true) {
        // System.out.println("Cadrastro de produtos");
            String titular = titulo("Cadrastro de produto", 50) ;
            String linha = "=".repeat(50);
            System.out.println( titular);
            System.out.println("[1]Cadrastro de usuario");
            System.out.println("[2]Login");
            System.out.println("[3]Sair");
            System.out.println(linha);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Sua opção: ");
            int valorOpcao = scanner.nextInt();
            if (valorOpcao == 1){
                
            }else if ( valorOpcao == 2){

            }else if ( valorOpcao == 3){

            }else{
                System.out.println("Por favor imforme uma opção valida");
            }
            System.out.println("A opção escolhida foi :" + valorOpcao);
        }
    }
    public static String titulo (String mensagem, int numero ) {
        String linha = "=".repeat(numero);
        return linha + "\n" + mensagem  + "\n" + linha ;
    }
}


    

