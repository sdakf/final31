package com.sda.final31.finalapp.categories;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    public List<CategoryDto> findCategories(String searchText) {
        CategoryDao categoryDao = CategoryDao.getInstance();
        List<Category> categoryList = categoryDao.getCategoryList();
        List<CategoryDto> dtos = categoryList.stream()
                .map(x -> buildDto(x))
                .collect(Collectors.toList());

        if (searchText == null) {
            return dtos;
        }
        for (CategoryDto dto : dtos) {
            if (dto.getCategoryName().toUpperCase().contains(searchText.toUpperCase())) {
                dto.getState().setSelected(true);
            }
        }
        return dtos;
    }

    private CategoryDto buildDto(Category category) {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setCategoryName(category.getCategoryName());
        categoryDto.setId(category.getId());
        categoryDto.setParentId(category.getParentId());
        categoryDto.setState(new CategoryState());
        return categoryDto;
    }
}
