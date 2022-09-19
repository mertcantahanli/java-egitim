package recapDemo;

public class main {
    public static void main(String[] args) {
        int sayi1 = 266;
        int sayi2 = 25;
        int sayi3 = 26;
        int enbuyuk = sayi1;

        if (enbuyuk < sayi2) {
            enbuyuk = sayi2;

        }
        if (enbuyuk < sayi3) {
            enbuyuk = sayi3;
        }
        System.out.println("en büyük= " + enbuyuk);
    }

}
