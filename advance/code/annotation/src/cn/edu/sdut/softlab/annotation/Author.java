package cn.edu.sdut.softlab.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@Documented
@Inherited
public @interface Author {
    String name();
    String created();
    int version() default 1;
}
