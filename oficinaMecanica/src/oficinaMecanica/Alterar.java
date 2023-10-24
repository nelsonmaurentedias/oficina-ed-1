package oficinaMecanica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Alterar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexao = null;
		PreparedStatement comando = null;
		try {
			conexao = ClasseConexao.Conectar();
			string sql = "UPDATE clientes SET nome=? WHERE cpf=?";
			
			comando = conexao.prepareStatement(sql);
			comando.setString(2, Nelson);
			comando.setString(3, 39296989000);
			
			if(comando.executeUpdate()>0 ) {
				System.out.println("Dados alterados");
				
			} catch (SQLException e) {
				e.printStackTrace();
				
			}finally {
				ClasseConexao.FecharConexao(conexao);
				
				try {
					comando.close();
					resultado.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
		
}
	


