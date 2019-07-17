package Exam_2019;

public class CutName {
    public static void main(String[] args) {
        System.out.println(fileName("c:\\WebServers\\home\\testsite\\www\\myfile.txt"));
    }


    public static String fileName(String str) {
        int dotInd = str.lastIndexOf(".");
        int slashInd = str.lastIndexOf("\\");
        if(dotInd != -1 && slashInd != -1)
            return str.substring(slashInd + 1, dotInd);
        return str;
    }

}
