package org.mmonge;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SharedMapExample {

    private final Map<String, String> sharedMap = new HashMap<>();

    public static void main(String[] args) {
        SharedMapExample testObj = new SharedMapExample();
        testObj.addToMap("one", "first value");

        testObj.addToMap(null, "second value");
        testObj.addToMap(null, "third value");
        testObj.addToMap(null, "fourth value");

        testObj.printSharedMap();
    }

    /**
     * Add an element to the shared map
     */
    public Map<String, String> addToMap(String key, String value) {
        sharedMap.put(key, value);

        return sharedMap;
    }

    private void printSharedMap() {
        System.out.println(">Printing values in shared map of size " + sharedMap.size());
        for (Object value : sharedMap.values()) {
            System.out.println(value);
        }
    }

    public Map<String, String> getSharedMap() {
        return Collections.unmodifiableMap(sharedMap);
    }
}
