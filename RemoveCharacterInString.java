public class RemoveCharacterInString {

    public static void main(String[] args) {
        String mainString = "Md Wasir Ali";
        int index = 7;

        System.out.println("Original String: " + mainString);

        mainString = mainString.substring(0, index) + mainString.substring(index + 1);
        System.out.println("Modified String: " + mainString);
    }
    
}
