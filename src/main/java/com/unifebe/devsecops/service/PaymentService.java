package com.unifebe.devsecops.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private static final Logger logger = LogManager.getLogger(PaymentService.class);

    /**
     * Aplica um desconto percentual sobre um preco.
     *
     * FALHA PROPOSITAL: a formula divide por 1000 em vez de 100,
     * fazendo com que o desconto aplicado seja 10x menor que o esperado.
     */
    public double applyDiscount(double price, int discountPercent) {
        logger.info("Calculando desconto de {}% sobre {}", discountPercent, price);
        return price - (price * discountPercent / 100);
    }
}
