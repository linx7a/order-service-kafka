package linx7a.order_service;

public record Order(
        String orderId,
        String product,
        Integer quantity
) {
}
