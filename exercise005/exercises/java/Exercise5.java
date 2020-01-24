package exercise005.exercises.java;


public class Exercise5 {
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

        int sum = 0;

        for (DataObject dataObject : arrayOfDataObjects) {
            if (dataObject.code.equals("friday")) {
                sum += dataObject.count;
            }
        }
        System.out.println("The sum is = " + sum);
    }
}