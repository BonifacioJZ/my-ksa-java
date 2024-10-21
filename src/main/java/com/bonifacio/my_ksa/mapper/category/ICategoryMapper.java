package com.bonifacio.my_ksa.mapper.category;

import com.bonifacio.my_ksa.controller.dto.category.CategoryOutDto;
import com.bonifacio.my_ksa.persistence.entities.Category;

public interface ICategoryMapper {
    CategoryOutDto categoryToCategoryOutDto(Category category);
}
