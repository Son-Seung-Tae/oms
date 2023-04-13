package oms.Order;

import oms.Member.Grade;
import oms.Member.Member;

public class DiscountPriceImpl implements DiscountPolicy {


    private int discountFixPrice = 1000;
    @Override
    public int discountPrice(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return discountFixPrice;
        }
        return 0;
    }
}
