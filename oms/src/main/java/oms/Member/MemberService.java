package oms.Member;

public interface MemberService {

    void join(Member member);
    Member findById(Long memberId);
}
