import java.util.*;

public class Main {

	public static void main(String[] args) {
        println();
        Thread runSendTextAtRandomTime=new Thread(new SendTextAtRandomTime());
        runSendTextAtRandomTime.start();
        Thread SpecialWords=new Thread(new SpecialWords());
        SpecialWords.start();
    }
private static void println(){
    System.out.println("正在加载");
    try {
        Thread.sleep(2);

    } catch (InterruptedException e) {}
    System.out.println("加载成功");//这两个其实就是我拿来拉距离用的。
    try {
        Thread.sleep(2);
    } catch (InterruptedException e) {}
    System.out.println("欢迎使用浮世德第一代交互设备");
    
}
}
