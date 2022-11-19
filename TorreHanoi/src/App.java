public class App {
    public static void main(String[] args){

        Pilha Torre = new Pilha();
        
            //Torre.pilhaInicio.push(41);
            //Torre.pilhaInicio.push(40);
            //Torre.pilhaInicio.push(39);
            //Torre.pilhaInicio.push(38);
            //Torre.pilhaInicio.push(37);
            //Torre.pilhaInicio.push(36);
            //Torre.pilhaInicio.push(35);
            //Torre.pilhaInicio.push(34);
            //Torre.pilhaInicio.push(33);
            //Torre.pilhaInicio.push(32);
            //Torre.pilhaInicio.push(31);
            Torre.pilhaInicio.push(30);
            Torre.pilhaInicio.push(29);
            Torre.pilhaInicio.push(28);
            Torre.pilhaInicio.push(27);
            Torre.pilhaInicio.push(26);
            Torre.pilhaInicio.push(25);
            Torre.pilhaInicio.push(24);
            Torre.pilhaInicio.push(23);
            Torre.pilhaInicio.push(22);
            Torre.pilhaInicio.push(21);
            Torre.pilhaInicio.push(20);
            Torre.pilhaInicio.push(19);
            Torre.pilhaInicio.push(18);
            Torre.pilhaInicio.push(17);
            Torre.pilhaInicio.push(16);
            Torre.pilhaInicio.push(15);
            Torre.pilhaInicio.push(14);
            Torre.pilhaInicio.push(13);
            Torre.pilhaInicio.push(12);
            Torre.pilhaInicio.push(11);
            Torre.pilhaInicio.push(10);
            Torre.pilhaInicio.push(9);
            Torre.pilhaInicio.push(8);
            Torre.pilhaInicio.push(7);
            Torre.pilhaInicio.push(6);
            Torre.pilhaInicio.push(5);
            Torre.pilhaInicio.push(4);
            Torre.pilhaInicio.push(3);
            Torre.pilhaInicio.push(2);
            Torre.pilhaInicio.push(1);

        System.out.println("Inicio: " + Torre.pilhaInicio);
        System.out.println("Final: " + Torre.pilhaFinal);
        System.out.println("Suporte: " + Torre.pilhaSup);
        System.out.println("----------------------");
        
        Torre.TorreHanoi(Torre.pilhaInicio.size()-1, Torre.pilhaInicio, Torre.pilhaFinal, Torre.pilhaSup);
        System.out.println("O numero de jogadas total foi: " + Torre.jogadas);
        System.out.println("----------------------");
        System.out.println("Inicio: " + Torre.pilhaInicio);
        System.out.println("Final: " + Torre.pilhaFinal);
        System.out.println("Suporte: " + Torre.pilhaSup);
    }
}
