public class InsertSubstringInString {

    //Fundtion to insert a string 
    public static void insertSubstringInString( String mainString, String subString, int index){
        //insert subString at index position of mainString

        StringBuilder string = new StringBuilder(mainString);
        string.insert(index, subString);
        String modifiedString = string.toString();

        System.out.println("Modified String: " + modifiedString);
    }

    public static void main(String[] args) {
        String mainString = "Md Ali";
        String subString = "Wasif ";
        int index = 3;

        System.out.println("Original String: " + mainString);
        insertSubstringInString(mainString, subString, index);
    }
    
}
