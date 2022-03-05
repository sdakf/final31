package com.sda.final31.finalapp.categories;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CategoryService {

    public List<CategoryDto> findCategories() {
        CategoryDao categoryDao = CategoryDao.getInstance();

        return Collections.emptyList();
    }
}
