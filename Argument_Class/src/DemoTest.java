import org.*;
public class DemoTest {

   
	public static void main(String[] args){
        String number = "12+8";
        try {
            System.out.println("���Ϊ��" + Tool.parseInt(number));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
