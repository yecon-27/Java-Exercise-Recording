package com.ava.Generics;
//Ye Cong 1306248
public class GenericType<T> {
    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        // 创建泛型对象
        GenericType<String> type = new GenericType<>();
        type.set("Kean");
        System.out.println(type.get());

        // 创建非泛型对象
        GenericType<Object> type1 = new GenericType<>();
        type1.set("Ken");
        System.out.println(type1.get());
        type1.set(10);//valid and autoboxing support
        System.out.println(type1.get());
    }
}