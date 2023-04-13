package oms;

import oms.Member.MemberService;
import oms.Member.MemberServiceImpl;
import oms.Member.MemoryMemberRepository;
import oms.Order.DiscountPolicy;
import oms.Order.DiscountPriceImpl;
import oms.Order.OrderService;
import oms.Order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(
                new MemoryMemberRepository(),
                new DiscountPriceImpl());
    }
}
