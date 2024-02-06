package rafael.victorio.uolhostbackend.controller.dtos;

import rafael.victorio.uolhostbackend.model.GroupType;

public record PlayerDto(
        String name,
        String email,
        String phoneNumber,
        GroupType groupType
) {
}
