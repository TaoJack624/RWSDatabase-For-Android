package com.codingdie.rwsdatabase.orm.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

/**
 * Created by xupen on 2016/8/22.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Colum {
    public  String[] alias()   default {};
    public  boolean ignore() default  false    ;
    public  boolean isKey() default  false;

}
