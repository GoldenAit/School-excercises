public class JavaSwitch {
    public static void main(String[] args) {
        int keuze = 1;
        String result = " je koos";
        switch ( keuze){
            case 1:
                result = result + "1";
                break;
            case 2:
                result = result + "2";
            case 3: result= result + "3";
            case 4: result = result + "4";
            default:
                result= result +" resultaat is anders";
        }
        System.out.println(result);
    }
}
