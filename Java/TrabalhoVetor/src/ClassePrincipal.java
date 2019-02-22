import java.util.Random;
import java.util.Scanner;

public class ClassePrincipal {

    int tamanhoVet = 5;
    static int[] vetor;
    static Scanner entrada = new Scanner(System.in);
    static Random rand = new Random();
    static boolean sairDoPrograma = false;

    public ClassePrincipal(){
        vetor = new int[tamanhoVet];
        System.out.println("Vetor inicialilzado");
        System.out.println("----------------------------------");
    }

    public ClassePrincipal(int _tamanhoVet){
        this.tamanhoVet = _tamanhoVet;
        vetor = new int[tamanhoVet];
        System.out.println("Vetor inicialilzado");
        System.out.println("----------------------------------");
    }

    public static void inserir(){
        System.out.println("Digite o valor a ser inserido");
        int valor = entrada.nextInt();
        System.out.println("Digite o index do valor");
        int index = entrada.nextInt();

        int[] vetorAux = vetor.clone();
        if(vetor[index] == valor){
            System.out.println("O valor " +valor+ " já está no index " + index);
        }else{
            System.out.println("Deseja inserir o valor " + valor  + " no lugar de " + vetor[index] + " ?");
            String permissao = entrada.next();
            if(permissao.equals("sim")){
                vetor[index] = valor;
                System.out.println("Inserção realizada com sucesso");
                System.out.print("Vetor antes da inserção: ");
                printarVetor(vetorAux);
                System.out.print("Vetor depois da inserção: ");
                printarVetor(vetor);
            }else{
                System.out.println("Inserção cancelada");
            }
        }
        System.out.println("----------------------------------");
    }

    public static void printarVetor(int[] _vetor){
        for(int numero:_vetor){
            System.out.print(" " + numero);
        }
        System.out.println("");
    }

    public static void printarVetorMarcado(int[] _vetor){
        System.out.print("Vetor: ");
        for(int numero:_vetor){
            System.out.print(" " + numero);
        }
        System.out.println("");
        System.out.println("----------------------------------");
    }

    public static void getTamanho(){
        System.out.println("O vetor possui " + vetor.length + " posições" );
        System.out.println("----------------------------------");
    }

    public static void randomizarVetor(){
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = rand.nextInt(10);
        }
        System.out.println("O vetor foi randomizado");
        System.out.println("----------------------------------");
    }

    public static void rodarPrograma(){
        System.out.println("1- Printar vetor");
        System.out.println("2- Tamanho do vetor");
        System.out.println("3- Inserir no vetor");
        System.out.println("4- Randomizar vetor");
        System.out.println("5- Sair");

        int instrucao = entrada.nextInt();

        switch (instrucao){
            case 1: printarVetorMarcado(vetor); break;
            case 2: getTamanho(); break;
            case 3: inserir(); break;
            case 4: randomizarVetor(); break;
            case 5: sairDoPrograma = true; break;
        }
    }

    public static void main(String[] args) {
        ClassePrincipal cp = new ClassePrincipal(5);
        while(!sairDoPrograma){
            rodarPrograma();
        }
    }
}
