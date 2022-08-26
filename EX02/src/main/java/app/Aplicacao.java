package app;

import java.util.List;
import java.util.Scanner;

import dao.DAO;
import dao.UsuarioDAO;
import model.Usuario;

public class Aplicacao {
	//Objetos 
	static private Scanner sc = new Scanner(System.in);
	static private UsuarioDAO usuarioDAO = new UsuarioDAO();
	static private Usuario usuario = new Usuario();
	
	public static void main(String[] args) throws Exception {
		
		int t;
		
		do {
			Menu();
			int opcaoMenu = sc.nextInt();
			t = opcaoMenu;
			
			switch (opcaoMenu){
			case 5:
				usuarioDAO.finalize();
				break;
			case 1:
				Listar();
				break;
			case 2:
				Inserir();
				break;
			case 3:
				Excluir();
				break;
			case 4:
				Atualizar();
				break;
				
			}
		}while(t != 5);

	}
	
	public static void Menu() {
		System.out.println("\n ========== Menu =========");
		System.out.println(  " |   \5 Listar    - [1]   | ");
		System.out.println(  " |   \5 Inserir   - [2]   | ");
		System.out.println(  " |   \5 Excluir   - [3]   | ");
		System.out.println(  " |   \5 Atualizar - [4]   | ");
		System.out.println(  " |   \5 Sair      - [5]   | ");
		System.out.println(  " =========================  ");
	}
	
	public static void Listar() {
		System.out.println(" === Mostrando Usuários Cadastrados === ");
		List<Usuario> usuarioTemporario = usuarioDAO.get();
		for (Usuario u: usuarioTemporario) {
			System.out.println(u.toString());
		}
	}
	
	public static void Inserir() {	
		System.out.println(" === Inserir Usuário === ");
		System.out.print(    " ID: ");
		usuario.setID(sc.nextInt());
		System.out.print(    " Professor: ");
		usuario.setLogin(sc.next());
		System.out.print(    " Materia: ");
		usuario.setSenha(sc.next());
		System.out.print(    " Disponivel: ");
		usuario.setSexo(sc.next().charAt(0));
		boolean status = usuarioDAO.insert(usuario);
	}
	
	public static void Excluir() {
		System.out.println(" === Excluir Usuário ===");
		Listar();
		System.out.println("\n Qual Usuário deseja excluir? ");
		System.out.print(" Digite o ID:");
		int excluirID = sc.nextInt();
		boolean status = usuarioDAO.delete(excluirID, usuario);
	}
	
	public static void Atualizar() {
		System.out.println(" === Atualizar Usuário ===");
		Listar();
		System.out.println("\n Qual Usuário deseja Atualizar? ");
		System.out.print(" Digite o ID:");
		//int atualizarID = sc.nextInt();
		usuario.setID(sc.nextInt());
		System.out.println("\n Atualizando...");
		System.out.print(    " Professor: ");
		usuario.setLogin(sc.next());
		System.out.print(    " Materia: ");
		usuario.setSenha(sc.next());
		System.out.print(    " Disponivel: ");
		usuario.setSexo(sc.next().charAt(0));
		boolean status = usuarioDAO.update(usuario);
	}
	
	
	
}