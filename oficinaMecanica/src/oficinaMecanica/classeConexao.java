package oficinaMecanica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class classeConexao {
       private static Connection conexao = null;
       //Método para conectar com MySQL
       public static Connection Conectar() {
    	   try {
    	//verificar se a conexão já foi feita	   
    		   if(conexao==null) {
    			   //String com o caminho para o Banco de dados
    			   
    			   String url = "jdbc:mysql://localhost:3306/oficina mecanica";
    			   
    					  
    			 //conexao  
    			   		
    			   conexao = DriverManager.getConnection("url","root","vertrigo");
    		   }
    	   }catch (SQLException erro) {
    		   erro.printStackTrace();
    	   }
    	   return conexao;
    	   
       }
       public static void FecharConexao(Connection c) {
    	   try {
    		   if(c!=null)  {
    			   c.close();
    			   conexao = null;
    		   }
    		   
    	   }catch(SQLException e ){
    		   e.printStackTrace();
    	   }
       }
       
}