package oms.Order;

import oms.Member.Grade;
import oms.Member.Member;

public class RateDiscountPolicy implements DiscountPolicy{
    private int discountPercent = 10;
    @Override
    public int discountPrice(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return price * 10 / 100;
        }
        return 0;
    }
}
