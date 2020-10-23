package Chapter3;
import java.util.Calendar;
public class Time {
    private Calendar t;
    private  final int y,m,d,hh,mm,ss;
    Time(){
        t = Calendar.getInstance();
        y = t.get(t.YEAR);
        m = t.get(t.MONTH)+1;
        d = t.get(t.DATE);
        hh = t.get(t.HOUR);
        mm = t.get(t.MINUTE);
        ss = t.get(t.SECOND);

    }
    public String getData(){
        return y+"年"+m+"月"+d+"日";
    }
    public String getTime(){
        return hh+"时"+mm+"分"+ss+"秒";
    }

    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time.getData());
        System.out.println(time.getTime());
    }
}
