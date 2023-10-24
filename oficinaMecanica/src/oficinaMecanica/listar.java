package oficinaMecanica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
	

public class listar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexao = null;
		Statement comando = null;
		ResultSet resultado = null;
		try {
			conexao = ClasseConexao.Conexao();
			comando = conexao.createStatement();
			string meu_sql = "SELECT * FROM clientes";
			resultado = comando.executeQuery(meu_sql);
			While(resultado.next()); {
				System.out.println(resultado.getString("cpf") + "  " + resultado.getString("nome"));
			
			}
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
