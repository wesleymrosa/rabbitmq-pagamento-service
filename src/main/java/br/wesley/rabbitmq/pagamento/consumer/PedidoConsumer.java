package br.wesley.rabbitmq.pagamento.consumer;

import br.wesley.rabbitmq.pagamento.dto.PedidoDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PedidoConsumer {

    private static final Logger log = LoggerFactory.getLogger(PedidoConsumer.class);

    @RabbitListener(queues = "pagamento.pedido")
    public void receberPedido(PedidoDTO pedido) {
        log.info("Recebido pedido: {}", pedido);

        // Simulação de processamento
        try {
            Thread.sleep(1000); // simula delay
            log.info("Pedido processado com sucesso: ID={} | Cliente={} | Valor=R$ {}",
                    pedido.getId(), pedido.getNomeCliente(), pedido.getValorTotal());
        } catch (InterruptedException e) {
            log.error("Erro ao processar pedido: {}", pedido, e);
        }
    }
}