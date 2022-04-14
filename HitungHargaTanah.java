public class HitungHargaTanah {
    public static void main(String[] args) {
    //deklarasi nilai
    int p = 12;
    int l = 8;
    int L, T, htanah = 500000;
    
    //proses
    L = p*l;
    T = L * htanah;
    
    //output  
    System.out.println("Total harga tanah untuk luas: "+ L + " adalah "+T);
       
    }
}
