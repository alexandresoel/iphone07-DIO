import com.alexandresoel.modelo.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        System.out.println("Iniciando a demonstração do Iphone");
        System.out.println("######### Navegador ###########");
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println("######### Camera ###########");
        iphone.fotografar();
        iphone.filmar();
        System.out.println("######### Aparelho Telefonico ###########");
        iphone.atender();
        iphone.ligar("97987678678");
        iphone.iniciarCorreioVoz();
        System.out.println("######### Reprodutor Musical ###########");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("No Tomorrow");
    }
}