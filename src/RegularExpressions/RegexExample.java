package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

public class RegexExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Core Java");
        Matcher matcher = pattern.matcher("We are learning Core Java");
        Boolean matchFound = matcher.find();
        System.out.println(matchFound);
        if(matchFound){
            System.out.println("Correct Match Found");
        }
        else{
            System.out.println("Match not Found");
        }
    }
}
