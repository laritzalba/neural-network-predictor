public final class BloomFilter {

      boolean [] bf ;
      int n, m,  k, l;

    public BloomFilter(int n, int m, int k){
        this.n = n; // 20*m
        this.m = m;
        this.k = k;
        //this.l = 20*m;
        this.bf= new boolean[n];
    }

    public void add(double [] k){
        int pos = 0;
        for (int i=0; i<k.length; i++ ){
         pos = (int)( n * k[i]);
         bf[pos] = true;
        }

    }

    public  boolean isInBloomF(double [] k){
        int pos = 0;
        int count =0;
        for (int i=0; i<k.length; i++ ){
            pos = (int)( n * k[i]);
            if (bf[pos]) count ++;
        }
        if (count == this.k) return true;
              else return false;

    }

    public void clearBloomF(){
        bf = null;
        this.bf= new boolean[n];
    }


    public static void main(String [] args){
        System.out.println("Bloom Filter");
    }

}