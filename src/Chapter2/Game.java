package Chapter2;

import java.util.Scanner;

/*

在一场名为Game的游戏中，作为玩家的你手头拥有若干个金币。为增加生命力，你需要购买仙女草和银河梭两件宝物
，仙女草每件售价20个金币可增加玩家30个单位的生命力。银河梭每件售价16个金币，能够增加玩家20个单位的生命力。
编程求出一种最佳购买方案。使得你的金币购买的宝物能最大限度的增加你的生命力（不一定要用完所有金币）
 并输出最佳方案中每件宝物的购买数量
 */
public class Game {
    static final int FGVALUE =20;
    static final int GSVALUE =16;
    static final int FGLIFE =30;
    static final int GSLIFE =20;

    public static void main(String[] args) {
        int goldcoin = 100;
        int fg_num = 0,gs_num = 0;
        int max_life = 0;
        System.out.println("请输入金币的数量：");
        Scanner in = new Scanner(System.in);
        goldcoin = in.nextInt();
        for (int fg_loop = 0;fg_loop<=(goldcoin/FGVALUE);fg_loop++){
            for (int gs_loop = 0;gs_loop<=goldcoin/GSVALUE;gs_loop++){
                if( (fg_loop*FGVALUE +gs_loop*GSVALUE <= goldcoin)
                        &&((FGLIFE*fg_loop + gs_loop*GSLIFE >max_life))){
                    fg_num =fg_loop;
                    gs_num =gs_loop;
                    max_life =fg_loop*FGLIFE+gs_loop*GSLIFE;
                }
            }
        }
        System.out.println("购买的宝物最多能增加你"+max_life+"个生命力");
        System.out.println("购买仙女草的数量为："+fg_num+"个");
        System.out.println("购买银河梭的数量为："+gs_num+"个");
    }
}
