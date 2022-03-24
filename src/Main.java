import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main<sair> {

    public static void main(String[] args) {
    ListaLigada lista = new ListaLigada<>();

    int escolha;
    boolean sair = true;
    Scanner opcao = new Scanner(System.in);

        do{
                escolha = opcao.nextInt();

                switch (escolha) {
                case 1:
                Integer  item = opcao.nextInt();
                lista.insereOrdenado(item);
                break;

                case 2:
                int  elemento = opcao.nextInt();
                lista.inserirFinal(elemento);
                break;
                case 3:
              int  n = opcao.nextInt();
                lista.buscar(n);

                break;
                case 4:
                lista.imprime();
                break;
                case 5:
                sair = false;
                break;
default:
        System.err.println("opção inválida");


        } }while (sair);}}