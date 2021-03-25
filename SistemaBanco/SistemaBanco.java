package SistemaBanco;

public class SistemaBanco {
    public static void main(String[] args) {
        
        Conta pessoaA,pessoaB;

        pessoaA = new Conta(1,"Lucas Dias",1500,750);
        pessoaB = new Conta(2,"Mauricio Mucci",2500,1000);

        pessoaA.deposita(500.0);
        pessoaB.saca(200);

        System.out.printf("Dono: %s\n", pessoaA.getDono());
        System.out.printf("Saldo: %2f\n", pessoaA.getSaldo());

        System.out.printf("Dono: %s\n", pessoaB.getDono());
        System.out.printf("Saldo: %2f\n", pessoaB.getSaldo());
        
        pessoaB.transfere(450, pessoaA);

        pessoaA.imprime();
        pessoaB.imprime();
        
        /*ArrayList <Teu obejto> Nome da var = new ArrayList<teu objeto>();
        ArrayList <Conta> minhaconta = new ArrayList <Conta>();
        minhaconta.add(new Conta(1,"Lucas Dias",1500,750));
        for (Conta user : minhaconta){
            user.imprime();
        }
        */  

        
    }
}
