
import java.util.Random;
public class SendTextAtRandomTime implements Runnable {

    SendTextAtRandomTime() {}

    static int Random(int Min, int Max) {
        Random Random=new Random();
        return Random.nextInt(Max - Min + 1) + Min;
    }
    private static void SendText() {

        String[] SendText=new String[9];
        SendText[1] = "我是RBQ，快来R我！";
        SendText[2] = "好无聊啊，好想被R...";
        SendText[3] = "鱼丸在哪，我想榨干他。。。";
        SendText[4] = "每日一R更精彩！";
        SendText[5] = "R！舒♂服";
        SendText[6] = "R,好无聊啊！";
        SendText[7] = "有时候，榨干鱼丸比榨干其他人更爽。";
        SendText[8] = "你想R我吗？";
        System.out.println("浮世德:" + SendText[Random(1, 8)]);
    }

    @Override
    public void run() {
        while (true) {
            try {
                SendText();
                Thread.sleep(Random(10000, 60000));
            } catch (InterruptedException e) {}
        }
    }
}
