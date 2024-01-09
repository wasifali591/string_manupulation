public class AccessCharByIndex {

    //Function to demonstrate accessCharByIndex
    public static char accessCharByIndex( String str, int k){
        //return the character at the k-th index
        return str.charAt(k);
    }

    public static void main(String[] args) {
        String str = "Md Wasif Ali";
        int k = 2;

        System.out.println(accessCharByIndex(str, k));
    }
    
}
