package Exam_2019;

import java.util.ArrayList;
import java.util.List;

public class ConvertToSnakeCase {
        public static void main(String args[])
        {
            List<String> list =new ArrayList<>();
            list.add("myAwsomePhrase");
            list.add("iLoveJustinBieber");
            list.add("captainJackSparrow");
            String regex = "([a-z])([A-Z]+)";
            String replacement = "$1_$2";
            for (String list2 : list)
            System.out.println(list2
                    .replaceAll(regex, replacement)
                    .toLowerCase());
        }

}
