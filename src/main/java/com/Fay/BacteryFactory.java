package com.Fay;

import java.util.HashMap;
import java.util.Map;

public class BacteryFactory {
    static Map<String, BacteryType> bacteryTypes = new HashMap<>();

    public static BacteryType getBacteryType(String type) {
        BacteryType result = bacteryTypes.get(type);
        if (result == null) {
            result = new BacteryType(type);
            bacteryTypes.put(type, result);
        }
        return result;
    }


}
