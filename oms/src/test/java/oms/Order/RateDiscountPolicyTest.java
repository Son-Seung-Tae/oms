package oms.Order;

import oms.Member.Grade;
import oms.Member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class RateDiscountPolicyTest {
    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다.")
    void vip_sale_o() {
        Member member = new Member(1L, "SON", Grade.VIP);
        int discount = rateDiscountPolicy.discountPrice(member, 10000);
        Assertions.assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아닌 경우에는 할인 x")
    void non_vip() {
        Member member = new Member(1L, "SON", Grade.BASIC);
        int discount = rateDiscountPolicy.discountPrice(member, 10000);
        Assertions.assertThat(discount).isEqualTo(0);
    }
}
