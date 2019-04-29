public class Tool {
    public static int parseInt(String str) throws ParseException {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                num = num * 10 +  ch - '0';
            } else {
                throw new ParseException(str);
            }
        }
        return num;
    }
}
