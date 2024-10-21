package com.bonifacio.my_ksa.controller.dto.category;

import java.util.UUID;

public record CategoryOutDto(
        UUID id,
        String name,
        String description,
        String slug
        ) {
}
