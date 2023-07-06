package Desafio;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {
  private static List<Cliente> registroClientes = new ArrayList<>();

  public static Cliente cadastraCliente(String nome, String cpf, String email) {
    Cliente cliente = new Cliente(nome, cpf, email);
    registroClientes.add(cliente);
    return cliente;
  }

  public static boolean clienteExisteCpf(String cpf) {
    for (Cliente dado : registroClientes) {
      if (dado.getCpf().equals(cpf)) {
        System.out.println("CPF ja foi cadastrado!");
        return false;
      }
    }
    return true;
  }

  public static boolean existeClienteCadastrado(String cpf) {
    for (Cliente dado : registroClientes) {
      if (dado.getCpf().equals(cpf)) {
        return true;
      }
    }
    return false;
  }

  public static boolean clienteExisteEmail(String email) {
    for (Cliente dado : registroClientes) {
      if (dado.getEmail().equals(email)) {
        System.out.println("Email já cadastrado!");
        return false;
      }
    }
    if(!email.contains("@")){
      System.out.println("Insira um email válido!");
      return false;
    }
    return true;
  }

  public static void clientesRegistrados() {
    if (registroClientes.isEmpty()) {
      System.out.println("Nenhum cliente registrado!");
    }
    registroClientes.forEach(System.out::println);
  }
}
