//nama : Achmad Suyudi Amiruddin
//stambuk : 13020180294
interface A {
    public void aaa();
}

interface B extends A {
    public void aaa();
}

class Central0294 implements A, B {

    public void aaa() {
        System.out.println("aaa");
    }
}

public class TestErr30294 {
    public static void main(String[] args) {
        System.out.println("main");
        Central0294 myObj = new Central0294();
        myObj.aaa();
    }
}