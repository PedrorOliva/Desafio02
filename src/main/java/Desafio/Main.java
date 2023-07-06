package Desafio;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    UsuarioService usuarioService;
    boolean menu = true;

    do {
      menuUsuario();

      int opcao = inputUsuario.nextInt();
      switch (opcao) {
        case 1:
          UsuarioService.cadastrarCliente();
          break;
        case 2:
          UsuarioService.registroDeClientes();
          break;
        case 3:
          UsuarioService.registraVendedor();
          break;
        case 4:
          UsuarioService.vendedoresRegistrados();
          break;
        case 5:
          UsuarioService.registraVenda();
          break;
        case 6:
          UsuarioService.vendasRegistradas();
          break;
        case 7:
          UsuarioService.buscaCompraPorCPF();
          break;
        case 8:
          UsuarioService.buscaCompraPorEmail();
          break;
        case 9:
          menu = false;
          System.out.println("Encerrando aplicação...");
          break;
        default:
          System.out.println("Opção inválida!! Tente novamente\n");
      }
    } while (menu);
  }

  public static void menuUsuario() {
    System.out.println("Qual operação deseja realizar? " +
        "\n1 - Cadastrar cliente " +
        "\n2 - Mostrar clientes " +
        "\n3 - Cadastrar vendedor " +
        "\n4 - mostrar vendedores " +
        "\n5 - Cadastrar venda" +
        "\n6 - Mostrar vendas" +
        "\n7 - Pesquisa por cpf" +
        "\n8 - Pesquisa por email" +
        "\n9 - Encerrar programa");
  }
}
