/*
    Classe com métodos usados nos três jogos
 */
package jogos;

public class MetodosGerais {
    public int sorteiaNum(int nInicial, int nFim){
        int defineLim = (nFim - nInicial) + 1;
        int numSort;
        
        numSort = (int) ((Math.random() * defineLim) + nInicial); // Sorteia um número entre 1 e 100
        //JOptionPane.showMessageDialog(null, dados[0);
        return numSort;
    }
}
