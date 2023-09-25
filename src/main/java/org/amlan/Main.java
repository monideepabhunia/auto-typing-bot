package org.amlan;
// solved maven issue by : <mirrorOf>external:http:*</mirrorOf> -> <mirrorOf>external:https:*</mirrorOf>
// in settings.xml
//

public class Main {
    public static void main(String[] args) {

//        TypingRobot robot = new TypingRobot("C:\\Users\\Pavilion\\Desktop\\test\\4201.txt");
        TypingRobot robot = new TypingRobot();
        String s = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
//        s = "aA";
//        System.out.println(s.length());
        robot.setFileContents(s);
        robot.startTyping();
//        createFiles("C:\\Users\\Pavilion\\Desktop\\textFiles");
    }
//
//
//    public static void createFiles(String sourceFolder){
//         for(int i=4201; i<=4400; i++){
//            try {
//                File myObj = new File(sourceFolder + "\\" + i + ".txt");
//                if (myObj.createNewFile()) {
//                    System.out.println("File created: " + myObj.getName());
//                } else {
//                    System.out.println("File "+  myObj.getName() +" already exists.");
//                }
//            } catch (IOException e) {
//                System.out.println("An error occurred.");
//                e.printStackTrace();
//            }
//        }
//    }
}


