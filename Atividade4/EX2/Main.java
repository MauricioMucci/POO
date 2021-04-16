package Atividade4.EX2;

public class Main {
    public static void main(String[] args) {
        Vendedor a = new Vendedor("Matheus", "Masculino", 22);
        a.setSalario(987.66);
        a.setQntVendas(20);
        a.setValorVendas(3201.12);

        Gerente b = new Gerente("Leonardo", "Masculino", 23, "Departamento de Games");
        b.setSalario(1221.76);
        b.setMatricula("ABC987XYZ");

        Cliente d = new Cliente("Thais", "Feminino", 37, 1983);
        d.setValorDivida(57.99);
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(d.toString());
    }
    
}
