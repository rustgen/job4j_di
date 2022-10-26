package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();

        Store store = context.getBean(Store.class);
        store.add("John");
        store.add("Mark");
        Store storeAnother = context.getBean(Store.class);
        storeAnother.add("Wesley");
        storeAnother.getAll().forEach(System.out::println);

        StartUI ui = context.getBean(StartUI.class);
        String name = ui.getAskStr("Put your name");
        ui.add(name);
        ui.add("Zena");
        ui.add("Ivan");
        ui.print();
        StartUI uiAnother = context.getBean(StartUI.class);
        String nameAnother = uiAnother.getAskStr("Put your name");
        uiAnother.add(name);
        uiAnother.add("Ashley");
        uiAnother.print();
    }
}
