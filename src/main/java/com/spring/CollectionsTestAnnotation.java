package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
@Component("injectCollectionAnnotation")
public class CollectionsTestAnnotation {
    @Value("#{map}")
    private Map<String, Object> map;
    @Value("#{props}")
    private Properties props;
    @Value("#{set}")
    private Set<String> set;
    @Value("#{list}")
    private List<String> list;

    public void displayInfo() {
        System.out.println("Map content: ");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }
        System.out.println("------------------------------------------------------------------");

        System.out.println("Property content: ");
        for (Map.Entry<Object, Object> entry : props.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }
        System.out.println("------------------------------------------------------------------");

        System.out.println("Set content: ");
        for (Object o : set) {
            System.out.println("Value: " + o);
        }
        System.out.println("------------------------------------------------------------------");

        System.out.println("List content: ");
        for (Object o : list) {
            System.out.println("Value: " + o);
        }
        System.out.println("------------------------------------------------------------------");
    }
}
