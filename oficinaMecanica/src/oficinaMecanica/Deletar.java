package oficinaMecanica;
import   java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexao = null;
		PreparedStatement comando = null;
		try {
			conexao = ClasseConexao.Conectar();
			
			string sql = "DELETE FROM clientes WHERE cpf=?";
			
					
			comando = conexao.prepareStatement(sql);		
			comando.setString(1, 39296989000);
			
			if(comando.executeUpdate()>0 ) {
				System.out.println("Dados excluidos");
			}
		
			} 
		catch (SQLException e) {
				e.printStackTrace();
			}
		finally {
				ClasseConexao.FecharConexao(conexao);
				try {
					comando.close();
				
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	    }

   }
