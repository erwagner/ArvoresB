package complexidade;

public class Complexidade {

    public static void main(String[] args) {

        int N = 100000;
        
        int vet1[] = new int[N];
        int vet2[];
        int vet3[];
        int vet4[];

        for(int i=0; i<N; i++)
            vet1[i] = ((int) (Math.random()*N*N))+1;

        vet2 = vet1.clone();
        vet3 = vet1.clone();
        vet4 = vet1.clone();
        

        long inicio = System.currentTimeMillis();
        bubble_ruim(vet1,N);
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo Bubble Ruim: "+tempo);
        
        
        inicio = System.currentTimeMillis();
        bubble_bom(vet2,N);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo Bubble BOM: "+tempo);

        inicio = System.currentTimeMillis();
        bubble_bom_plus(vet3,N);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo Bubble BOM Plus: "+tempo);


      /*  inicio = System.currentTimeMillis();
        selection(vet4,N);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo Selection: "+tempo);
        */
        
        
      /*  System.out.println("\nOrdenado:");
        for(int i=0; i<N; i++){
            System.out.println(vet2[i]);
        }*/

        
    }
    
    
   /* public static void selection(int[] vet, int N) {
        for (int fixo = 0; fixo < (N - 1); fixo++) {
            int menor = fixo;
            for (int i = menor + 1; i < N; i++) {
                if (vet[i] < vet[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                troca(vet,fixo,menor);
            }
        }
    }*/
    
    
    static void bubble_ruim(int vet[], int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<(N-1); j++){
                if(vet[j]>vet[j+1]){
                   troca(vet,j,j+1);
                }
            }
        }
    }
    
    static void bubble_bom(int vet[], int N){
        for(int i=N-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(vet[j]>vet[j+1]){
                   troca(vet,j,j+1);
                }
            }
        }
    }
    
    static void bubble_bom_plus(int vet[], int N){
        boolean trocou = true;
        int i = N-1;
        while(trocou){
            trocou = false;
            for(int j=0; j<i; j++){
                if(vet[j]>vet[j+1]){
                    trocou = true;
                   troca(vet,j,j+1);
                }
            }
            i--;
        }
    }

    
    static void troca(int vet[],int i, int j){
        int aux = vet[i];
        vet[i] = vet[j];
        vet[j] = aux;
    }
    
    
}
