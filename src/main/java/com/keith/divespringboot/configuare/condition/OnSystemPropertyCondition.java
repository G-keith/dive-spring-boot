package com.keith.divespringboot.configuare.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-08
 */
public class OnSystemPropertyCondition implements Condition{
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Map<String, Object>  attributes= metadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());
        String propertyName=String.valueOf(attributes.get("name"));
        String propertyValue=String.valueOf(attributes.get("value"));

        String javaPropertyValue=System.getProperty(propertyName);
        System.out.println(propertyName);
        return propertyValue.equals(javaPropertyValue);
    }
}
