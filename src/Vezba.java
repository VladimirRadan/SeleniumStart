public class Vezba {


    public static void main(String[] args) {

        String ime = "Per\nta"; //ime.length()-1
        System.out.println(ime);

        String a = "      120  $  rewre  ewerfewf   fsdf       ";
        String b = "2";


        //int a1 = Integer.parseInt(a);
        double b1 = Double.parseDouble(b);

        int a2 = Integer.parseInt(a.replaceAll("\\s", ""));
        System.out.println(a2);


        //System.out.println(a1 + b1);


    }




}
