package oms.Member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    public void joinTest() {

        long l = 1L;

        Member member = new Member( l, "son", Grade.VIP );
        memberService.join(member);

        Member findmember = memberService.findById(l);

        Assertions.assertThat(member).isEqualTo(findmember);
    }
}
