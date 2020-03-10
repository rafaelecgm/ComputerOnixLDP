package computeronix;

import comum.Le;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class ComputerOnix {

    public static void main(String[] args) {
        //uma alteração qualquer
        
        //Alterei algo com a minha conta
        
    }
        
    public class venda {
            private int numVenda;
            private Date data;
            private float valor;
            
            public venda(int nv) {
            numVenda = nv;
            data = new Date();
        }
            public void setDate(Date d) {
            data = d;
        }
            public Date getDate(){
                return data;
            }
            public int getNumVenda() {
            return numVenda;
        }
            public float getValor(){
                return valor;
            }
            public void setValor(float val){
                valor = val;
            }
    }
    
    public class vendaArtigo extends venda{
        private venda[] artigo;

        public vendaArtigo(int nv) {
            super(nv);
        }
        
        
    }
    
    public class ColVendas{
        venda v ;
        int count=0;
        ArrayList<venda> list;   //Criar uma arrayList 
        
        public ColVendas(){
            
           
            list=new ArrayList<venda>();
            
        }
        
        public void adicionarVenda(venda v){
            Date d = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            
            if(list.contains(v)){
                System.out.println("Não Pode adicionar");
            }else{
                
                v = new venda(count++);
                System.out.println("Adicionar uma venda");
                
                System.out.println("Qual o valor da venda?");
                int valor= Le.umInt();
                v.setValor(valor);
                System.out.println(dateFormat.format(d));
                
                
            }
        }
        
        
    }
    
    
    
    
    
}
