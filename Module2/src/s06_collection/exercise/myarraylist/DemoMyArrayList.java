package s06_collection.exercise.myarraylist;

public class DemoMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>(String.class);
        myArrayList.add("First");
        myArrayList.add("Second");
        String deleteElement = myArrayList.remove(3);
        System.out.println(deleteElement);
        System.out.println("Print ArrayList");
        for (int index = 0; index < myArrayList.size(); index++) {
            System.out.println(index + ". " + myArrayList.get(index));
        }

        MyArrayList<String> cloneList = myArrayList.clone();
        System.out.println("Print clone List");
        for (int index = 0; index < cloneList.size(); index++) {
            System.out.println(index + ". " + cloneList.get(index));
        }

        myArrayList.clear();
        System.out.println("Print ArrayList");
        for (int index = 0; index < myArrayList.size(); index++) {
            System.out.println(index + ". " + myArrayList.get(index));
        }
    }
}
