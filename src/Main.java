import br.com.alura.cadastrocompras.classes.Cartao;
import br.com.alura.cadastrocompras.classes.Itens;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o limite do cartão: ");
        Cartao cartao = new Cartao();
        Scanner entrada = new Scanner(System.in);
        List<Itens> itensList = new ArrayList<>();
        cartao.setLimite(entrada.nextDouble());
        entrada.nextLine();
        externo:
        while (true){
            System.out.println("Digite a descrição da compra:");
            Itens item = new Itens();
            item.setItem(entrada.nextLine());
            System.out.println("Digite o valor da compra:");
            item.setValor(entrada.nextDouble());
            if (cartao.getLimite() > item.getValor()){
                entrada.nextLine();
                itensList.add(item);
                System.out.println("Compra Realizada!");
                cartao.setLimite(cartao.getLimite() - item.getValor());
                while (true) {
                    System.out.println("Continuar? (S/N)");
                    String opc = entrada.nextLine();
                    if (opc.equalsIgnoreCase("S")) {
                        break;
                    } else if (opc.equalsIgnoreCase("n")) {
                        break externo;
                    } else {
                        System.out.println("RESPOSTA INVALIDA. TENTE NOVAMENTE!");
                    }
                }
            }else{
                System.out.println("Saldo Insuficiente!");
                break;
            }
        }
        System.out.println("*********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        itensList.sort(Comparator.comparing(Itens::getValor));
        if (itensList.isEmpty()) {
            System.out.println("NÃO FOI REALIZADA NENHUMA COMPRA");
        } else {
        for (Itens itens : itensList){
                System.out.println(itens);
            }
        }
        System.out.println("\n*********************\n");
        System.out.println("Limite restante cartão: R$"+String.format(Locale.forLanguageTag("pt-BR"), "%.2f",cartao.getLimite()));
    }
}
