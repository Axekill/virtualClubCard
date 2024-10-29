package my.work.virtualclubcard.model;

import lombok.Data;

import java.util.UUID;

@Data
public class VirtualCard {
    private final String id;
    private final Member member;
    private final PrivilegeLevel privilegeLevel;
    private final StatusMember statusMember;

    public VirtualCard(Member member, PrivilegeLevel privilegeLevel, StatusMember statusMember) {
        this.id = generateUniqueId();
        this.member = member;
        this.privilegeLevel = privilegeLevel;
        this.statusMember = statusMember;
    }

    private static String generateUniqueId() {
        return UUID.randomUUID().toString();
    }
}