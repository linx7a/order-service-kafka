package linx7a.order_service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private static final Logger log = LoggerFactory.getLogger(OrderService.class);

    public void saveOrder(Order order){
        // saving to Database ...
        log.info("Order successfully saved: id={}", order.orderId());
    }
}
