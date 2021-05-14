package Atividade5;

public class Inteiro {
    int a;
    Inteiro (int x) {
        this.a = x;
    }
    void add (int x) {
        this.a = this.a + x;
    }
    void inc () {
        this.a = this.a + 1;
    }
    void print () {
        System.out.println(this.a);
    }
}
