package computeronix;

import java.util.Date;

public class ComputerOnix {

    public static void main(String[] args) {
        
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
    
}
