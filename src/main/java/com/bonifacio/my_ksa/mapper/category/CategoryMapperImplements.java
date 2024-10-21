package com.bonifacio.my_ksa.mapper.category;

import com.bonifacio.my_ksa.controller.dto.category.CategoryOutDto;
import com.bonifacio.my_ksa.persistence.entities.Category;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapperImplements implements ICategoryMapper{

    private  final ModelMapper modelMapper;

    @Autowired
    public CategoryMapperImplements(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }
    @Override
    public CategoryOutDto categoryToCategoryOutDto(Category category) {
        var out = modelMapper.map(category,CategoryOutDto.class);
        return out;
    }
}
