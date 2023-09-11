package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;

import java.util.List;

public interface CategotyService {

   PageResult pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    void updateStatus(Integer status,Long id);

    /**
     * 新增分类
     * @param categoryDTO
     */
    void save(CategoryDTO categoryDTO);

    void  update(CategoryDTO categoryDTO);

    void delete(Long id);

    List<Category> list(Integer type);
}
