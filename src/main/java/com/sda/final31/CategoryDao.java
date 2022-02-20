package com.sda.final31;

import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

//SINGLETON z palca
public class CategoryDao {

    private List<Category> categoryList;

    private CategoryDao INSTANCE;

    private CategoryDao() {
    }

    CategoryDao getInstance() {
        if (INSTANCE == null) {
            synchronized (CategoryDao.class) {
                if (INSTANCE == null) {
                    INSTANCE = new CategoryDao();
                }
            }
        }
        return INSTANCE;
    }

    public static List<String> readCategories() {
        URL url = CategoryDao.class.getClassLoader()
                .getResource("kategorie.txt");
        try {
            return Resources.readLines(url, Charset.defaultCharset());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
