import java.util.Scanner;

public class switch {
    public static void main(String[] args) {
    
// O'zbekcha: kirilgan harfni 'sesli harf' yoki 'sezziz harf' ekanligini aniqlaydigan program.
//'Sesli harflar' turkchada(a,u,o,e,i,ö,ü) bulardir, ozbekchadaki unli harflar kabi

// Turkce: Girilen harfi seli yada sezziz e=oldugununu soyleydigen program

        Scanner d =new Scanner(System.in);
        System.out.println("harfi gir");

        char tur = d.next().charAt(0);



        switch(tur) {
            case 'a':
                System.out.println("kalin sesli harf");
                break;
            case 'u':
                System.out.println("kalin sesli harf");
                break;
            case 'o':
                System.out.println("kalin sesli harf");
                break;
            case 'e':
                System.out.println("ınce sesli harf");
                break;
            case 'i':
                System.out.println("ınce sesli harf");
                break;
            case 'ö':
                System.out.println("ınce sesli harf");
                break;
            case 'ü':
                System.out.println("ınce sesli harf");
                break;

            default:
                System.out.println("hicbiri degil");
        }

    }
}

// java dasturlash tilini biz bilan birgalikda youtube da bepul shakilda organaolasiz
