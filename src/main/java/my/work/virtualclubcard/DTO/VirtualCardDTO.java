package my.work.virtualclubcard.DTO;

import my.work.virtualclubcard.model.PrivilegeLevel;
import my.work.virtualclubcard.model.StatusMember;

import java.util.UUID;

public record VirtualCardDTO(
        String id,
        String firstName,
        String lastNAme,
        PrivilegeLevel privilegeLevel,
        StatusMember statusMember
) {
}
