package my.work.virtualclubcard.model;

import lombok.Data;

import java.util.UUID;

@Data
public class VirtualCard {
    private final String id;
    private final Member member;
    private final PrivilegeLevel privilegeLevel;
    private final StatusMember statusMember;
    private final Template template;


    public VirtualCard(Member member, PrivilegeLevel privilegeLevel, StatusMember statusMember, Template template) {
        this.id = generateUniqueId();
        this.member = member;
        this.privilegeLevel = privilegeLevel;
        this.statusMember = statusMember;
        this.template = template;
    }

    private static String generateUniqueId() {
        return UUID.randomUUID().toString();
    }
}