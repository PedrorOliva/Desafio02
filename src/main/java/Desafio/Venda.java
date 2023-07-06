package Desafio;
public class Venda {
  private String nomeCliente;

  private String cpfCliente;
  private String nomeVendedor;

  private String emailVendedor;
  private double valorAPagar;
  private String dataDeRegistro;

  public Venda(String nomeCliente, String cpfCliente, String nomeVendedor, String emailVendedor,
               double valorAPagar, String dataDeRegistro) {
    this.nomeCliente = nomeCliente;
    this.cpfCliente = cpfCliente;
    this.nomeVendedor = nomeVendedor;
    this.emailVendedor = emailVendedor;
    this.valorAPagar = valorAPagar;
    this.dataDeRegistro = dataDeRegistro;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public String getCpfCliente() {
    return cpfCliente;
  }

  public void setCpfCliente(String cpfCliente) {
    this.cpfCliente = cpfCliente;
  }

  public String getNomeVendedor() {
    return nomeVendedor;
  }

  public void setNomeVendedor(String nomeVendedor) {
    this.nomeVendedor = nomeVendedor;
  }

  public String getEmailVendedor() {
    return emailVendedor;
  }

  public void setEmailVendedor(String emailVendedor) {
    this.emailVendedor = emailVendedor;
  }

  public double getValorAPagar() {
    return valorAPagar;
  }

  public void setValorAPagar(double valorAPagar) {
    this.valorAPagar = valorAPagar;
  }

  public String getDataDeRegistro() {
    return dataDeRegistro;
  }

  public void setDataDeRegistro(String dataDeRegistro) {
    this.dataDeRegistro = dataDeRegistro;
  }

  @Override
  public String toString() {
    return "Venda" +
        "\nNome do cliente: " + this.nomeCliente +
        "\nNome do vendedor: " + this.nomeVendedor +
        "\nValor a pagar: " + this.valorAPagar +
        "\nData do Registro: " + this.dataDeRegistro + "\n";
  }
}
