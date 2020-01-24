package exercise004.exercises.java;

public class Exercise3 {
    public static void main(String[] args) {
        DataObject[] arrayOfDataObjects = new DataObject[3];
        DataObject firstDataObject = new DataObject();
        DataObject secondDataObject = new DataObject();
        DataObject thirdDataObject = new DataObject();
        
        arrayOfDataObjects[0] = firstDataObject;
        arrayOfDataObjects[1] = secondDataObject;
        arrayOfDataObjects[2] = thirdDataObject;
        
        int sum = 0;

        for (DataObject dataObject : arrayOfDataObjects) {
            sum += dataObject.count;
        }
        System.out.println("The sum is = " + sum);
    }
}