
package javatreesaula;

public class Musica  implements Comparable<Musica>{
    private int ranking;
    private String nomeMusica;
    private String nomeCantor;
    private String genero;
    private String album;
    private int anoLancamento;
    


    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    
    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getNomeCantor() {
        return nomeCantor;
    }

    public void setNomeCantor(String nomeCantor) {
        this.nomeCantor = nomeCantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    
    
    @Override
    public int compareTo(Musica outro){
         return Integer.compare(this.ranking, outro.ranking);
    }
    
    @Override
    public String toString(){
        return "\nRanking: "+this.ranking+"\nNome da música:"+this.nomeMusica+"\nCantor: " +this.nomeCantor+" \n_______________________";
    }
}
