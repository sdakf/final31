package com.sda.final31;

import org.junit.jupiter.api.Test;

import java.util.List;

class CategoryDaoTest {

    @Test
    void readCategories() {
        List<String> strings = CategoryDao.readCategories();
        System.out.println(strings);
    }

    @Test
    void createCategories() {
        List<Category> categories = CategoryDao.getInstance().createCategories();
        System.out.println(categories);
    }
}