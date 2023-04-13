package oms.Order;

import oms.Member.Grade;
import oms.Member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    private OrderService orderService = new OrderServiceImpl();
    private DiscountPolicy discountPolicy = new DiscountPriceImpl();
    private int itemPrice = 10000;
    private String itemName = "홈런볼";
    private int discountPrice = 1000;
    @Test
    public void OrderCreateTest() {
        Member member = new Member(1L, "SON", Grade.VIP);
        Order order = orderService.orderCreate(member.getId(), itemName, itemPrice);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(discountPrice);
    }

}
