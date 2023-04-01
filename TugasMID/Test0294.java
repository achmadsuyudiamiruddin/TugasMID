//nama : Achmad Suyudi Amiruddin
//stambuk : 13020180294

    // class Balok
    class Balok extends PersegiPanjang {
        int t;

        public Balok() {
            // (h) berisi nilai panjang & lebar yang diperoleh dari konstruktor superclass
            // persegi panjang serta tinggi=15
            this.t = 15;
        }

        public Balok(int p, int l, int t) {
            // (i) berisi nilai pada saat runtime p p, l=l dari konstruktor superclass
            // persegi panjang t t;
            this.p = p;
            this.l = l;
            this.t = t;
        }

        // (j) buat getter setter class balok
        public int volume() {
            // (k) fungsi untuk menghitung volume balok : p x l x t
            return p*l*t;
        }

        public void info() {
            // (l)fungsi untuk tampil nilai panjang, lebar, tinggi,Luas, dan volume balok
            System.out.println("Panjang = "+p);
            System.out.println("Lebar   = "+l);
            System.out.println("Tinggi  = "+t);
            System.out.println("Luas    = "+luas());
            System.out.println("Volume  = "+volume());
        }
    }

    // class Persegi Panjang
    class PersegiPanjang {
        int p, l;
        //setter
        public PersegiPanjang() {
            // (m) berisi nilai panjang=30 & lebar=20
            this.p = 30;
            this.l = 20;
        }
        //getter
        public PersegiPanjang(int p, int l) {
            // (n) berisi nilai pada saat runtime p p, l=l
            this.p = p;
            this.l = l;
        }

        // (o) buat getter setter class Persegi Panjang
        public int luas() {
            // (q) fungsi untuk menghitung luas persegi panjang : p x l
            return p*l;
        }

        public int keliling() {
            // (r) fungsi untuk menghitung keliling persegi panjang : 2x (p+l)
            return 2*(p+l);
        }
    }

    //soal3
    class kubus extends PersegiPanjang{
        int s;
        public kubus(){
            this.s = p;
        }
        public kubus(int s){
            this.s = s;
        }
        //getter
        public int sisi(){
            return s;
        }
        //setter
        public void sisi(int newSisi){
            this.s = newSisi;
        }
        public int volume(){
            return s*s*s;
        }
        public void info(){
            System.out.println("Sisi   = "+s);
            System.out.println("Volume = "+volume());
        }
    }

public class Test0294 {
    public static void main(String[] args) {
        Balok balok1 = new Balok();
        Balok balok2 = new Balok(20,35,15);
        balok1.l = 5;
        balok1.p = 25;
        balok1.t = 10;
        System.out.println("Info balok1");
        balok1.info();
        System.out.println("Info balok2");
        balok2.info();

        //soal3
        kubus Kubus1 = new kubus();
        kubus Kubus2 = new kubus(5);
        Kubus1.s = 7;
        System.out.println("Info Kubus1");
        Kubus1.info();
        System.out.println("Info Kubus2");
        Kubus2.info();
    }
}