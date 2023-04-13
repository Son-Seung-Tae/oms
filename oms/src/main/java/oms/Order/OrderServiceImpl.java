package oms.Order;

import oms.Member.Member;
import oms.Member.MemberRepository;
import oms.Member.MemoryMemberRepository;

import java.util.HashMap;
import java.util.Map;

public class OrderServiceImpl implements OrderService {

//    private MemberRepository memberRepository = new MemoryMemberRepository();
//    private DiscountPolicy discountPolicy = new RateDiscountPolicy();
//    private DiscountPolicy discountPolicy = new DiscountPriceImpl();
    private DiscountPolicy discountPolicy;
    private MemberRepository memberRepository;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;

    }

    @Override
    public Order orderCreate(Long memberId, String itemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discountPrice(member, itemPrice);

//        Order order = new Order(memberId, itemPrice, itemName, discountPrice);
        return new Order(memberId, itemPrice, itemName, discountPrice);
    }
}
