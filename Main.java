import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("mat: ");
        float mat = input.nextFloat();

        System.out.println("fizik: ");
        float fizik = input.nextFloat();

        System.out.println("türk: ");
        float turk = input.nextFloat();

        System.out.println("tarih: ");
        float tarih = input.nextFloat();

        System.out.println("kimya: ");
        float kimya = input.nextFloat();

        float toplam = mat + fizik + turk + tarih + kimya;
        float ort = toplam / 5;
        int gecmeDurumu = ort >= 60 ? 1 : 0;

        switch (gecmeDurumu) {
            case 1:
                System.out.println("Sınıfı Geçti");
                break;
            case 0:
                System.out.println("Sınıfta Kaldı");
                break;
        }

    }
}
