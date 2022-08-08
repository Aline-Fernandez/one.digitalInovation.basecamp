package Digital.Inovation.dio;

public class Saudacao {

    public static void obterSaudacao(int hora){

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                saudacaoBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                saudacaoBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                saudacaoBoaNoite();
                break;
            default:
            System.out.println("Hora Inválida.");
            break;
        }
    }

    public static void saudacaoBomDia(){
        System.out.println("Bom Dia!");
    }

    public static void saudacaoBoaTarde(){
        System.out.println("Boa Tarde!");
    }
    public static void saudacaoBoaNoite() {
        System.out.println("Boa Noite!");
    }
}
