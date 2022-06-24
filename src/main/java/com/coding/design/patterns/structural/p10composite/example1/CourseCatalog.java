package com.coding.design.patterns.structural.p10composite.example1;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<>();

    private String name;
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent comp) {
        items.add(comp);
    }

    @Override
    public void remove(CatalogComponent comp) {
        items.remove(comp);
    }

    @Override
    public String getName(CatalogComponent comp) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent item : items) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
            }
            item.print();
        }
    }
}
