package onboarding;

import java.util.List;

public class Problem2 {
    public static String solution(String line) {
        while(duplicationString(line)){
            line = removeDuplicationLine(line);
        }
        return line;
    }

    //중복되는게 있는지 확인
    public static boolean duplicationString(String line){
        for(int i = 0 ; i < line.length()-1;i++){
            if(line.charAt(i) == line.charAt(i+1)){
                return true;
            }
        }
        return  false;
    }
    public static String removeDuplicationLine(String line){
        int start = duplicationStartNum(line);
        int end = duplicationEndNum(line, start);
        return duplicationDelete(line,start,end);
    }
    public static int duplicationStartNum(String line){
        for(int i = 0 ; i < line.length()-1; i++){
            if(line.charAt(i) == line.charAt(i+1)){
                return i;
            }
        }
        return -1;
    }
    public static int duplicationEndNum(String line, int start){
        if(line.length()==2){
            return start+1;
        }

        for(int i = start ; i < line.length()-1 ; i++){
            if(line.charAt(start) != line.charAt(i+1)){
                return i;
            }
        }
        return start;
    }

    public static String duplicationDelete(String line , int start ,int end){
        StringBuilder sb = new StringBuilder();
        sb.append(line);
        sb.replace(start,end+1,"");
        return sb.toString();
    }


}
