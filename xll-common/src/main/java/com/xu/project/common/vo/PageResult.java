package com.xu.project.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PageResult<T> {
    private Long total;// 总条数
    private Long totalPage;// 总页数
    private List<T> items;// 当前页数据

    public PageResult(){

    }

    public PageResult(Long total, List<T> items) {
        this.total = total;
        this.items = items;
    }

}
