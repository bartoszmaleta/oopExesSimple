package exercise006.exercises.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise6nat {
    public static void main(String[] args) throws Exception {

        String printer = "The sum of friday form the list equal ";

        DataObject element1 = new DataObject();
        DataObject element2 = new DataObject();
        DataObject element3 = new DataObject();
        DataObject element4 = new DataObject();
        DataObject element5 = new DataObject();

        List<DataObject> arrayDataObjects = new ArrayList<>(Arrays.asList(element1, element2, element3, element4, element5));

        element1.code = "friday";
        element2.code = "friday";
        element3.code = "saturday";
        element4.code = "saturday";
        element5.code = "saturday";
        countWords(arrayDataObjects);
    }

    public static void countWords(List<DataObject> arrayOfDataObjects) {
        Map<String, Integer> sumsForCoders = new HashMap<String, Integer>();

        for (DataObject object : arrayOfDataObjects) {
            Integer count = 0;
            String key = object.code;

            if(sumsForCoders.containsKey(key)) {
                continue;
            }

            for (DataObject name : arrayOfDataObjects) {
                if(object.code.equals(name.code)) {
                    count += 1;
                }
            }
            sumsForCoders.put(object.code, count);
        }
        for (String item: sumsForCoders.keySet())    {
            System.out.println(item + " : " + sumsForCoders.get(item));
        }

    }
}

