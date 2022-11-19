public class App {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa01 = new Pessoa("01 Maria", "(86) 2961-3504", "980 Haley Club Apt. 333 - Dover, NE", "986.819.183-11");
            Pessoa pessoa02 = new Pessoa("02 José", "(48) 3758-1667", "11452 Ethyl Street Apt. 482 - Rio Rancho, AZ", "126.839.844-64");
        Pessoa pessoa03 = new Pessoa("03 Antônio", "(68) 2011-5928", "99273 Grant Fields Suite 880 - Fort Pierce, OH", "104.980.873-87");
            Pessoa pessoa04 = new Pessoa("04 João", "(21) 3882-4747", "454 Olaf Mall Apt. 355 - Mount Prospect, ID", "501.686.351-27");
        Pessoa pessoa05 = new Pessoa("05 Francisco", "(64) 2462-6233", "09224 Mills Way Suite 671 - Washington, IA", "204.613.187-84");
            Pessoa pessoa06 = new Pessoa("06 Ana", "(68) 3175-2942", "03391 Edd Court Apt. 977 - Grand Island, AL", "790.973.726-23");
        Pessoa pessoa07 = new Pessoa("07 Luiz", "(87) 2688-2132", "87252 Abshire Extensions Apt. 155 - Great Falls, WI", "630.796.597-59");
            Pessoa pessoa08 = new Pessoa("08 Paulo", "(69) 2604-8075", "74952 Marcellus Viaduct Suite 977 - East Providence, MO", "026.022.556-88");
        Pessoa pessoa09 = new Pessoa("09 Carlos", "(19) 3896-9818", "2698 Kshlerin Turnpike Suite 867 - Hoover, AL", "372.126.846-60");
            Pessoa pessoa10 = new Pessoa("10 Manoel", "(28) 2335-4551", "398 Klocko Circle Apt. 914 - Gulfport, IN", "711.951.344-36");
        Pessoa pessoa11 = new Pessoa("11 Pedro", "(95) 2680-4331", "574 Armstrong Point Apt. 009 - Bartlett, NY ", "958.744.470-16");
            Pessoa pessoa12 = new Pessoa("12 Francisca", "(17) 3228-5580", "2205 Brando Glens Suite 671 - Huntington, VA", "228.768.334-84");
        Pessoa pessoa13 = new Pessoa("13 Marcos", "(68) 3073-6183", "8032 Sporer Ferry Suite 610 - Kansas City, WI ", "624.903.617-24");
            Pessoa pessoa14 = new Pessoa("14 Raimundo", "(14) 2718-0768", "63305 Adrien Club Apt. 400 - Jackson, OR ", "266.004.136-97");
        Pessoa pessoa15 = new Pessoa("15 Sebastião", "(61) 2676-5514", "485 Rachael Plains Apt. 558 - Nashua, ND", "043.986.626-00");
            Pessoa pessoa16 = new Pessoa("16 Antônia", "(68) 2867-3543", "01292 Bennie Ways Apt. 270 - Minot, MD", "857.809.485-93");
        Pessoa pessoa17 = new Pessoa("17 Marcelo", "(96) 2727-8549", "6827 Halvorson Road Suite 291 - Casper, GA", "914.127.888-70");
            Pessoa pessoa18 = new Pessoa("18  Jorge", "(94) 2337-4244", "17059 Emile Lights Apt. 387 - O'Fallon, IA", "467.451.124-00");
        Pessoa pessoa19 = new Pessoa("19  Márcia", "(27) 2671-7547", "5319 Bartholome Mills Suite 878 - Dover, IN", "034.180.636-67");
            Pessoa pessoa20 = new Pessoa("20  Geraldo", "(19) 3808-6176", "238 Larkin Lodge Apt. 272 - Gulfport, IL", "933.771.118-40");

        Lista lista = new Lista();

        lista.addFinal(pessoa01);
            lista.addFinal(pessoa02);
        lista.addFinal(pessoa03);
            lista.addFinal(pessoa04);
        lista.addFinal(pessoa05);
            lista.addFinal(pessoa06);
        lista.addFinal(pessoa07);
            lista.addFinal(pessoa08);
        lista.addFinal(pessoa09);
            lista.addFinal(pessoa10);
        lista.addFinal(pessoa11);
            lista.addFinal(pessoa12);
        lista.addFinal(pessoa13);
            lista.addFinal(pessoa14);
        lista.addFinal(pessoa15);
            lista.addFinal(pessoa16);
        lista.addFinal(pessoa17);
            lista.addFinal(pessoa18);
        lista.addFinal(pessoa19);
            lista.addFinal(pessoa20);

        lista.sortear();
        System.out.println(lista.Tamanho);

    }

}
