package oficinaMecanica;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.Statement;

public class Inserir {

	public static void main(String[] args) {
		Connection conexao = null;
		PreparedStatement comando = null;
		
		try {
			conexao = ClasseConexao.Conexao();
		
			string sql = "INSERT INTO clientes(nome,cpf,fone,e-mail,endereço) VALUES(?,?,?,?,?)";
			comando = conexao.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

			comando.setString(1, 00003);
			comando.setString(2, Manoel);
			comando.setstring(3, 88888888888);
			comando.setString(4, 53999666666);
			comando.setString(5, ruayyyyyyy111);
			
			
			if(comando.executeUpdate()>0 ) {
				System.out.println("Dados gravados");
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
		

	


