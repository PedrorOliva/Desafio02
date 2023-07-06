package Desafio;

import java.util.ArrayList;
import java.util.List;

public class VendedorService {
  private static List<Vendedor> registroVendedores = new ArrayList<>();

  public static Vendedor registraVendedor(String nome, String cpf, String email) {
    Vendedor vendedor = new Vendedor(nome, cpf, email);
    registroVendedores.add(vendedor);
    return vendedor;
  }

  public static boolean vendedorExisteCpf(String cpf) {
    for (Vendedor dado : registroVendedores) {
      if (dado.getCpf().equals(cpf)) {
        System.out.println("CPF já cadastrado!");
        return false;
      }
    }
    return true;
  }

  public static boolean existeVendedorCadastrado(String email) {
    for (Vendedor dado : registroVendedores) {
      if (dado.getEmail().equals(email)) {
        return false;
      }
    }
    return true;
  }

  public static boolean vendedorExisteEmail(String email) {
    for (Vendedor dado : registroVendedores) {
      if (dado.getEmail().equals(email)) {
        System.out.println("Email já cadastrado!");
        return false;
      }
    }
    if (!email.contains("@")) {
      System.out.println("Insira um email válido");
      return false;
    }
    return true;
  }

  public static void vendedoresRegistrados() {
    if (registroVendedores.isEmpty()) {
      System.out.println("Nenhum vendedor registrado!");
    }
    registroVendedores.forEach(System.out::println);
  }
}
