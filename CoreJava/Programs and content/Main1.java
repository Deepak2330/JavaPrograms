// Java code for string concatenation with 
// primitive data type values

public class Main1 {
    public static void main(String[] args) {
        boolean isMarried = false;
        boolean isQualified = true;
        int age = 21;
        double weight = 67.85;
        char gender = 'M';
        String name = "Shivang Yadav";
        String result = null;

        result = "isMarried: " + isMarried;
        System.out.println(result);

        result = "isQualified: " + isQualified;
        System.out.println(result);

        result = name + " is " + age + " years old.";
        System.out.println(result);

        result = name + " weight is " + weight + " kg.";
        System.out.println(result);

        result = "His gender is: " + gender;
        System.out.println(result);
    }
}