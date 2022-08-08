package InterviewTodays;

public class ReverseString {

    public static char[] reverseWords(char [] input) {
        String str = "";
        int filledIndex=0;
        for(int i  = 0 ; i < input.length ; i++){
            if(input[i]==32 || i==input.length-1){
                if(i == input.length-1){
                    str = str+input[i];
                }
                for(int j = str.length()-1 ; j >= 0; j--){
                    input[filledIndex] = str.charAt(j);
                    filledIndex++;
                }
                str="";
                if( input.length > filledIndex ){
                    input[filledIndex] = 32;
                }
                filledIndex++;
            }else{
                str = str+input[i];
            }
        }
        return input;
    }
   // ['I',' ','e','v','i','r','d',' ','h','t','i','w',' ','t','l','o','B'];
    public static void main(String[] args) {
        char[] input = {'I',' ','d','r','i','v','e',' ','w','i','t','h',' ','B','o','l','t'};
        System.out.println(reverseWords(input));
    }
}
