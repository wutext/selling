package com.up.selling.service.impl;

import com.up.selling.entity.Category;
import com.up.selling.repository.CategoryRepository;
import com.up.selling.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category getCategoryById() {
        return categoryRepository.findOne((long) 1);
    }
}
