package onboarding;

public class Problem4 {
    public static String solution(String line) {
        StringBuilder sb= new StringBuilder();
        for(int i = 0 ; i <line.length(); i++){
            if(isCaseString(line.charAt(i))){ //소문자
                sb.append(isLowerCaseChange(line.charAt(i)));
                continue;
            }

            sb.append(isUpperCaseChange(line.charAt(i)));

        }
        return sb.toString();
    }
    public static boolean isCaseString (char c){
        if (Character.isLowerCase(c)) {
            return true;
        }
        return false;
    }
    public static char isLowerCaseChange(char c){
        return (char) ('z' - (c - 'a'));
    }
    public static char isUpperCaseChange(char c){
        return (char) ('Z' - (c - 'A'));
    }
}
