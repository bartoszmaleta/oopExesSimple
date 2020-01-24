package exercise006.exercises.java;

import java.util.HashMap;
import java.util.Map;


public class Exercise6 {
    public static void main(String[] args) {
        DataObject[] arrayOfDataObjects = new DataObject[5];
        DataObject firstDataObject = new DataObject();
        DataObject secondDataObject = new DataObject();
        DataObject thirdDataObject = new DataObject();
        DataObject fourthDataObject = new DataObject();
        DataObject fifthDataObject = new DataObject();
        
        arrayOfDataObjects[0] = firstDataObject;
        arrayOfDataObjects[1] = secondDataObject;
        arrayOfDataObjects[2] = thirdDataObject;
        arrayOfDataObjects[3] = fourthDataObject;
        arrayOfDataObjects[4] = fifthDataObject;

        firstDataObject.code = "friday";
        secondDataObject.code = "friday";

        thirdDataObject.code = "saturday";
        fourthDataObject.code = "saturday";
        fifthDataObject.code = "saturday";

        countWord(arrayOfDataObjects);

        // for (DataObject dataObject : arrayOfDataObjects) {
            // if (dataObject.code.equals("friday")) {
                // sum += dataObject.count;
            // }
        // }
        // System.out.println("The sum is = " + sum);
    }

    public static void countWord(DataObject[] arrayDataObjects) {
        Map<String, Integer> sumsForCodes = new HashMap<String, Integer>();
        for (DataObject dataObject : arrayDataObjects) {
            Integer count = 0;
            String key = dataObject.code;

            if (sumsForCodes.containsKey(key)) {
                continue;
            }

            for (DataObject object : arrayDataObjects) {
                if (dataObject.code.equals(object.code)) {
                    count += 1;
                }
            }
            sumsForCodes.put(dataObject.code, count);
        }

        for (String keyString : sumsForCodes.keySet()) {
            System.out.println(keyString + " = " + sumsForCodes.get(keyString));
        }
    }
}