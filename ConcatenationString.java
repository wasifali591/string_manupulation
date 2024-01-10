public class ConcatenationString {
    public static void main(String[] args) {

        String firstString = "Ali";
        String secondString = "AlI";

        //Concatenation
        System.out.println("Output: " + firstString.concat(secondString));
        //Length
        System.out.println("Length: " + firstString.length());
        //Compare
        System.out.println("Compare: " + firstString.equals(secondString));
        System.out.println("Compare: " + firstString == secondString);
        System.out.println("Compare: " + firstString.compareTo(secondString));
        System.out.println("Compare: " + firstString.equalsIgnoreCase(secondString));
    }

}
