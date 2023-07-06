package Desafio;

import java.util.ArrayList;
import java.util.List;

public class VendaService {
  private static List<Venda> registroVendas = new ArrayList<>();

  public static Venda registraVenda(String nomeCliente, String cpfCliente, String nomeVendedor,
                                    String emailVendedor, double valorAPagar, String dataRegistro) {
    Venda venda = new Venda(nomeCliente, cpfCliente, nomeVendedor, emailVendedor, valorAPagar, dataRegistro);
    registroVendas.add(venda);

    return null;
  }

  public static List<Venda> buscaCompraClienteCPF(String cpf) {
    for (Venda venda : registroVendas) {
      venda.getCpfCliente().equals(cpf);
      System.out.println(venda);
    }
    return null;
  }

  public static List<Venda> buscaVendaVendedorEmail(String email) {
    for (Venda venda : registroVendas) {
      venda.getEmailVendedor().equals(email);
      System.out.println(venda);
    }
    return null;
  }

  public static double validaEntradapgmto(double valorAPagar) {
    if (valorAPagar != (double) valorAPagar) {
      System.out.println("O valor precisa ser digitado com ponto!");
    }
    return valorAPagar;
  }

  public static void vendasRegistradas() {
    if (registroVendas.isEmpty()) {
      System.out.println("Não existe nenhuma venda registrada!");
    }
    registroVendas.forEach(System.out::println);
  }
}