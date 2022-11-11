package enums;

enum Beer{
    KF, KO, RC, FO;
}

public class EnumDemo {
    public static void main(String[] args) {

        Beer beer1 = Beer.KF;
        System.out.println(beer1);

        Beer[] beer = Beer.values();

        for(Beer beer2 : beer){
            System.out.println(beer2 +"----"+beer2.ordinal());

        }


       /* // stream api
        System.out.println("Iterating using stream api");
        Arrays.stream(beer).forEach(System.out::println);

        System.out.println();
        List<Beer> b = List.of(beer);
        b.forEach(System.out::println);*/
    }
}
