package Desafio;

import java.util.Scanner;

public class UsuarioService {
  public static void cadastrarCliente() {
    Scanner inputUsuario = new Scanner(System.in);
    System.out.println("--- Cadastro de clientes ---");

    System.out.println("Nome: ");
    String nome = inputUsuario.next();

    String cpf;
    boolean cpfJaExiste;
    do {
      System.out.println("CPF: ");
      cpf = inputUsuario.next();
      cpfJaExiste = ClienteService.clienteExisteCpf(cpf);
    } while (!cpfJaExiste);

    String email;
    boolean emailJaExiste;
    do {
      System.out.println("Email: ");
      email = inputUsuario.next();
      emailJaExiste = ClienteService.clienteExisteEmail(email);
    } while (!emailJaExiste);

    ClienteService.cadastraCliente(nome, cpf, email);
  }

  public static void registroDeClientes() {
    ClienteService.clientesRegistrados();
  }

  public static void registraVendedor() {
    Scanner inputUsuario = new Scanner(System.in);
    System.out.println("--- Cadastro de vendedor ---");

    System.out.println("Nome: ");
    String nome = inputUsuario.next();

    String cpf;
    boolean cpfJaExiste;
    do {
      System.out.println("CPF: ");
      cpf = inputUsuario.next();
      cpfJaExiste = VendedorService.vendedorExisteCpf(cpf);
    } while (!cpfJaExiste);


//    System.out.println("CPF: ");
//    String cpf = inputUsuario.next();
//    VendedorService.vendedorExisteCpf(cpf);

    String email;
    boolean emailJaExiste;
    do {
      System.out.println("Email: ");
      email = inputUsuario.next();
      emailJaExiste = VendedorService.vendedorExisteEmail(email);
    } while (!emailJaExiste);


    VendedorService.registraVendedor(nome, cpf, email);
  }

  public static void vendedoresRegistrados() {
    VendedorService.vendedoresRegistrados();
  }

  public static void registraVenda() {
    Scanner inputUsuario = new Scanner(System.in);
    System.out.println("--- Registrando venda ---");
    System.out.println("Nome do cliente: ");
    String nomeCliente = inputUsuario.next();

    String cpfCliente;
    boolean existeCliente;
    do {
      System.out.println("Cpf do cliente: ");
      cpfCliente = inputUsuario.next();
      existeCliente = ClienteService.existeClienteCadastrado(cpfCliente);
    } while (!existeCliente);

    System.out.println("Nome do vendedor: ");
    String nomeVendedor = inputUsuario.next();


    String emailVendedor;
    boolean existeVendedor;
    do {
      System.out.println("Email do vendedor: ");
      emailVendedor = inputUsuario.next();
      existeVendedor = VendedorService.existeVendedorCadastrado(emailVendedor);
    } while (existeVendedor);


    System.out.println("Valor a ser pago: ");
    double valorAPagar = inputUsuario.nextDouble();
    VendaService.validaEntradapgmto(valorAPagar);

    System.out.println("Data de registro: ");
    String dataRegistro = inputUsuario.next();

    VendaService.registraVenda(nomeCliente, cpfCliente, nomeVendedor, emailVendedor, valorAPagar,
        dataRegistro);
  }

  public static void vendasRegistradas() {
    VendaService.vendasRegistradas();
  }

  public static void buscaCompraPorCPF() {
    Scanner inputUsuario = new Scanner(System.in);
    System.out.println("---- Encontre as compras pelo CPF ----");

    System.out.println("CPF: ");
    String cpf = inputUsuario.next();
    VendaService.buscaCompraClienteCPF(cpf);
  }


  public static void buscaCompraPorEmail() {
    Scanner inputUsuario = new Scanner(System.in);
    System.out.println("--- Econtre as compras pelo Email ----");

    System.out.println("Email: ");
    String email = inputUsuario.next();
    VendaService.buscaVendaVendedorEmail(email);
  }
}