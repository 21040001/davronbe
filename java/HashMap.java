import java.util.HashMap;

public class HashMap {
    public static void main(String[] args){
        HashMap<String,String> hash=new HashMap<>();
        // bushaklda qiymatlarni tenglaymiz
        hash.put("key"," kalit");
        hash.put("hello"," salom");
        //bu shakilda hashmapin barcha elemanlarini yozdira olamiz
        for (String i: hash.keySet()){
            System.out.println(i +"-"+ hash.get(i));
        }
        System.out.println("------------------------------------------------------");
        // bu shakilda yani "remove" yordami bilan biron bir qiymatni o'chirib tashlashimiz mumkin
        hash.remove("hello"); // bundan songra hello degan soz yoq chunki remove yordamiyla ochirib tashladik
        for (String i: hash.keySet()){
            System.out.println(i +"-"+ hash.get(i));// .get() yordami bilan biron bir qiymat tengligini olishimz mumkin
        }
        System.out.println("------------------------------------------------------");
        // bu shakilda yani "clear" yordami bilan barcha qiymatlarni o'chirib tashlashimiz mumkin
        hash.clear(); // bundan songra  qiymatlarimiz qolmadi   chunki clear yordamiyla barchasini ochirib tashladik
        for (String i: hash.keySet()){
            System.out.println(i +"-"+ hash.get(i));}
    }
}
