public class Main {
    public static void main(String[] args) {


        String a = "12";
        Integer b = new Integer(a);
        int c = b.intValue();
   System.out.println(c);
//Varianta II
        String u = "12";
        int j = new Integer(u);
        System.out.println(j);

        String a1 = "tRue";
        Boolean b1 = new Boolean(a1);
        boolean c1 = b1.booleanValue();
        System.out.println(c1);

        String a2 = "120";
        Byte b2 = new Byte(a2);
        byte c2 = b2.byteValue();
        System.out.println(c2);

        String a3 = "32000";
        Short b3 = new Short(a3);
        short c3 = b3.shortValue();
        System.out.println(c3);

        String a4 = "987654321987654321";
        Long b4 = new Long(a4);
        long c4 = b4.longValue();
        System.out.println(c4);

        String a5 = "4444.5d";
        Double b5 = new Double(a5);
        double c5 = b5.doubleValue();
        System.out.println(c5);

        String a6 = "2354.56f";
        Float b6 = new Float(a6);
        float c6 = b6.floatValue();
        System.out.println(c6);
    }
}