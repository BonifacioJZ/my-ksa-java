package com.bonifacio.my_ksa.services.category;

import com.bonifacio.my_ksa.controller.dto.category.CategoryOutDto;
import com.bonifacio.my_ksa.mapper.category.ICategoryMapper;
import com.bonifacio.my_ksa.persistence.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImplemets implements ICategoryService{

    private final ICategoryRepository repository;
    private final ICategoryMapper mapper;

    @Autowired
    public CategoryServiceImplemets(ICategoryRepository repository,ICategoryMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Page<CategoryOutDto> getAll(Pageable pageable) {
        var data  = this.repository.findAll(pageable)
                .map(this.mapper::categoryToCategoryOutDto);
        return data;
    }
}
