package com.coding.design.patterns.behavioral.p18memento.example1;

public class Test {

    public static void main(String[] args) {
        ArticleMementoManager amm = new ArticleMementoManager();

        Article article = new Article("如影随形的设计模型A", "手记内容A", "手记图片A");
        ArticleMemento am = article.saveToMemento();
        amm.addMemento(am);
        System.out.println("标题：" + article.getTitle() + " 内容：" + article.getContent() + " 图片：" + article.getImgs());
        System.out.println("手记完整信息：" + article);

        System.out.println("修改手记start");
        article.setTitle("如影随形的设计模型B");
        article.setContent("手记内容B");
        article.setImgs("手机图片B");
        System.out.println("修改手记end");
        System.out.println("手记完成信息：" + article);
        am = article.saveToMemento();
        amm.addMemento(am);

        System.out.println("修改手记start");
        article.setTitle("如影随形的设计模型C");
        article.setContent("手记内容C");
        article.setImgs("手记图片C");
        System.out.println("修改手记end");
        System.out.println("手记完整信息：" + article);

        System.out.println("暂存回退start");
        System.out.println("回退出栈1次");
        am = amm.getMemento();
        article.undoFromMemento(am);
        System.out.println("手记完整信息：" + article);

        System.out.println("回退出栈2次");
        am = amm.getMemento();
        article.undoFromMemento(am);
        System.out.println("手记完整信息：" + article);
    }
}
