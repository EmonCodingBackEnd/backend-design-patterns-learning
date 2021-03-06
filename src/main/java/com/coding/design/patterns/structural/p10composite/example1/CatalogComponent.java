package com.coding.design.patterns.structural.p10composite.example1;

public abstract class CatalogComponent {

    public void add(CatalogComponent comp) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponent comp) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CatalogComponent comp) {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CatalogComponent comp) {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
