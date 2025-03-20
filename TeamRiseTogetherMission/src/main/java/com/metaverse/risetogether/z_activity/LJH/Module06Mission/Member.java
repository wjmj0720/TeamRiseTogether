package com.metaverse.risetogether.z_activity.LJH.Module06Mission;

public class Member {
    private String memberId;
    private String memberName;

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    public String getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public Member(String memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }
}
