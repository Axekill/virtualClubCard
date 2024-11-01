package my.work.virtualclubcard.DTO;

import my.work.virtualclubcard.model.Privilege;
import my.work.virtualclubcard.model.Role;
import my.work.virtualclubcard.model.Template;

import java.time.LocalDateTime;


public record ClubMembersDTO(
        Long id,
        String email,
        String password,
        LocalDateTime birthday,
        String firstName,
        String lastName,
        Privilege privilege,
        Role role,
        boolean isLocked,
        Template template
) {
}