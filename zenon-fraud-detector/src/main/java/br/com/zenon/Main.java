package br.com.zenon;

import java.math.BigDecimal;

public class Main {
    void main() {
        TransactionCustomer origin1 = new TransactionCustomer("C1231006815", new BigDecimal("170136.0"), new BigDecimal("160296.36"));
        TransactionCustomer recipient1 = new TransactionCustomer("M1979787155", BigDecimal.ZERO, BigDecimal.ZERO);
        Transaction transaction1 = new Transaction(
                1L,
                TransactionType.TRANSFER,
                BigDecimal.valueOf(9839.64),
                origin1,
                recipient1,
                false,
                false);

        TransactionCustomer origin2 = new TransactionCustomer("C1280323807", new BigDecimal("850002.52"), BigDecimal.ZERO);
        TransactionCustomer recipient2 = new TransactionCustomer("C873221189", new BigDecimal("6510099.11"), new BigDecimal("7360101.63"));
        Transaction transaction2 = new Transaction(
                743L,
                TransactionType.CASH_OUT,
                BigDecimal.valueOf(850002.52),
                origin2,
                recipient2,
                true,
                false);

        IO.println(transaction1);

        IO.println(transaction2);
    }
}