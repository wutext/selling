package com.up.selling.repository;

import com.up.selling.entity.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void category_save() {
        Category category = new Category("xiaoqing", "type5");
        categoryRepository.save(category);
        System.out.println(category);
    }

    @Test
    public void category_update() {
        Category category = categoryRepository.findOne((long) 2);
        System.out.println(category.getId());
        category.setName("panda");
        categoryRepository.save(category);
        System.out.println(category);
    }
}