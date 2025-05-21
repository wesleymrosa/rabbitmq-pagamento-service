package br.wesley.rabbitmq.pagamento.dto;

public class PedidoDTO {
    private Long id;
    private String nomeCliente;
    private Double valorTotal;

    public PedidoDTO() {
    }

    public PedidoDTO(Long id, String nomeCliente, Double valorTotal) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "PedidoDTO{" +
                "id=" + id +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
