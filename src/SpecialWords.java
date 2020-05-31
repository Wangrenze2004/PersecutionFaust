
import java.util.Random;
import java.util.Scanner;
public class SpecialWords implements Runnable {
    SpecialWords() {}
    private static void Words(String DetectionWords) {
        int NumberOfElements = 2;
        int ArraySubscript =0;
        boolean wordsDetection=false;
        String[] SpecialWords =new String[NumberOfElements];
        SpecialWords[1] = "我是鱼丸";
        String[] KeyPair= new String[NumberOfElements];
        KeyPair[1] = "浮世德:你过来，让我榨♂干你。\n你:不！！！";
        String[] CommonWords=new String[7];
        CommonWords[1] = "你能R我吗？";
        CommonWords[2] = "我想上你";
        CommonWords[3] = "又一个想R我的人来了。";
        for (String Element: SpecialWords) {
            if (DetectionWords.equals(Element)) {
                System.out.println(KeyPair[ArraySubscript]);
                wordsDetection = true;
                break;
            }
            ArraySubscript++;
        }
        if (wordsDetection == false) {
            SendTextAtRandomTime SendTextAtRandomTime=new SendTextAtRandomTime();
            System.out.println("浮世德:"+CommonWords[SendTextAtRandomTime.Random(1, 3)]);
        }
    }

    @Override
    public void run() {
        while (true) {
            Scanner inSpecialWords=new Scanner(System.in);
            Words(inSpecialWords.next());
        }
        
    }
}
