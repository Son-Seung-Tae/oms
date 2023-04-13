package oms.Order;

public interface OrderService {
    Order orderCreate(Long memberId, String itemName, int itemPrice);
}
