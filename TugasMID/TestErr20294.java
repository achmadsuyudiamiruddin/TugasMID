//nama : Achmad Suyudi Amiruddin
//stambuk : 13020180294
public class TestErr20294 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            int j =+ i;
            if (i < j) {
                System.out.println(i);
            } else {
                System.out.println(j);
            }

            do {
                j++;
            } while (j < 10);
        }
    }
}