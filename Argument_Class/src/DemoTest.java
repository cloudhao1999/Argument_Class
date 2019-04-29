import org.*;
public class DemoTest {

   
	public static void main(String[] args){
        String number = "12+8";
        try {
            System.out.println("½á¹ûÎª£º" + Tool.parseInt(number));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
