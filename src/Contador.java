import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt() ;
        int parametroDois = terminal.nextInt() ;
        
        try {
            contar(parametroUm, parametroDois);
        
        }catch (ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }
     
    }
    static void contar (int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;

        if (parametroUm > parametroDois) {
           throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");

        } else {
            for(int x=0; x<contagem; x++){
                System.out.println("imprimindo o numero" + x);
                
            }
        }
    }
}