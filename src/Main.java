import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        Geçme Notu : 55
        Ödev
        Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
         */
        int mat, fizik, turkce, kimya, muzik, lectureNumber=0 , sum=0;
        double ortalama;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik : ");
        mat = input.nextInt();
        if(mat>=0 && mat<=100){
            sum += mat;
            lectureNumber++;
        }
        System.out.print("Fizik : ");
        fizik = input.nextInt();
        if(fizik>=0 && fizik<=100){
            sum += fizik;
            lectureNumber++;
        }
        System.out.print("Türkçe : ");
        turkce = input.nextInt();
        if(turkce>=0 && turkce<=100){
            sum += turkce;
            lectureNumber++;
        }
        System.out.print("Kimya : ");
        kimya = input.nextInt();
        if(kimya>=0 && kimya<=100){
            sum += kimya;
            lectureNumber++;
        }
        System.out.print("Müzik : ");
        muzik = input.nextInt();
        if(muzik>=0 && muzik<=100){
            sum += muzik;
            lectureNumber++;
        }

        ortalama = sum/lectureNumber;

        if(ortalama>=55){
            System.out.println("Hadi iyisin Sınıfı Geçtin...");
        }
        else{
            System.out.println("Maalesef çift dikiş yapacaksın ..:(..");
        }
        System.out.println("Ders Sayısı: " + lectureNumber + " Ortalama : " + ortalama);
    }
}