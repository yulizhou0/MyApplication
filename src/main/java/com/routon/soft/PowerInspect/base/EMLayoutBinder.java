package com.routon.soft.PowerInspect.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *     这里的@Target，@Retention和@interface，先来简单的介绍下这几个内容吧。
    @Target：说明了Annotation修饰的对象范围，Annotation可被用于packages、types等类，接口，枚举，Annotation类型；还可以是类成员方法，构造方法，成员变量，枚举值；方法参数和本地变量等。其一般有如下几种类型：
    ElementType.CONSTRUCTOR：  构造器声明；
    ElementType.FIELD：                    成员变量、对象、属性；
    ElementType.LOCAL_VARIABLE:  局部变量声明；
    ElementType.METHOD:                 方法声明；
    ElementType.PACKAGE:                包声明；
    ElementType.PARAMETER:           参数声明；
    ElementType.TYPE:                        类、接口（包括注解类型)或enum声明；
    这用到了TYPE。
     @Retention：表示在什么级别保存该注解信息。其一般级别如下：
    RetentionPolicy.SOURCE:    停留在java源文件，编译器被丢掉。
    RetentionPolicy.CLASS：     停留在class文件中，但会被VM丢弃。
    RetentionPolicy.RUNTIME：内存中的字节码，VM将在运行时也保留注解，因此可以通过反射机制读取注解的信息。
    这里给了最高级别RUNTIME。
    @interface：这个就表示注解了，和interface很像，不过多了一个@符号。
    int value()：表示传入的参数是int类型的。
 * */



@Target(ElementType.TYPE)  
@Retention(RetentionPolicy.RUNTIME)  
public @interface EMLayoutBinder {  
    int value();  
} 
