package com.bonifacio.my_ksa.services.category;

import com.bonifacio.my_ksa.controller.dto.category.CategoryOutDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICategoryService {
    Page<CategoryOutDto> getAll(Pageable pageable);
}
