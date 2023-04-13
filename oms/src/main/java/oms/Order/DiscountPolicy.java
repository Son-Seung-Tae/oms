package oms.Order;

import oms.Member.Member;

public interface DiscountPolicy {
    /**
     *
     * @return  할인 대상 금액
     */
    int discountPrice(Member member, int price);
}
