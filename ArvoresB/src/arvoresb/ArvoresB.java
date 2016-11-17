package arvoresb;

public class ArvoresB {

    static NoA raiz = null;
    
    public static void main(String[] args) {
        
        insereIterativo(28);
        insereIterativo(6);
        insereIterativo(12);
        insereIterativo(19);
        insereIterativo(36);
        insereIterativo(5);
        insereIterativo(13);
        insereIterativo(30);
        insereIterativo(57);
        
        exibe(raiz);
        
        
    }
    
    public static void insereIterativo(int v){
        NoA novo = new NoA(v);
        
        if(raiz == null){
            raiz = novo;
        }else{
            boolean inseriu = false;
            NoA temp = raiz;
            
            while(!inseriu){
                if(novo.valor <= temp.valor){
                    if(temp.esq == null){
                        temp.esq = novo;
                        inseriu = true;
                    }else{
                        temp = temp.esq;
                    }
                }else{
                    if(temp.dir == null){
                        temp.dir = novo;
                        inseriu = true;
                    }else{
                        temp = temp.dir;
                    }
                    
                }
            }
        }
    }
    
    public static void exibe(NoA temp){
        if(temp != null){
            exibe(temp.esq);
            System.out.println(temp.valor);
            exibe(temp.dir);
        }
    }
}
