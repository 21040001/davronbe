import java.util.Scanner;

public class project1 {
    public static void main(String[] args){
    
        // o'zbekcha: foydalanuvchi tarafindan kirilgan sonlarni birbiriga oxshamaganlarini (unique), shakilda yozdiradigan program.
        //Kullanıcıdan alınan dizi elemanlarından sadece tekrar etmeyen (unique),
        // tek adet bulunan elemanları ekrana yazanprogramı yazınız.
        
        
        int n=3;
        Scanner el=new Scanner(System.in);

        String[] elemanlar=new String[n];
        for (int i=0; i<n;i++){
            System.out.println("elemani gir"+i);
            String a =el.nextLine();
            elemanlar[i]=a;

        }
        for (int k=1;k<=elemanlar.length;k++){
                for (int j=0;j<elemanlar.length;j++){
                    if (elemanlar[k]!=elemanlar[j]){
                        System.out.println("unique"+elemanlar[k]);
                    }else{System.out.println("olamaz");}

                }


            }
        }
    }
