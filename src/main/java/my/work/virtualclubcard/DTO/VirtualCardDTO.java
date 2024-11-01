package my.work.virtualclubcard.DTO;

import my.work.virtualclubcard.model.ClubMembers;

public record VirtualCardDTO(
        Long id,
        ClubMembers clubMembers
        ) {
}
