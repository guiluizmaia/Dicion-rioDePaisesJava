
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class Pais {
    private String nome, capital, regiao, subregiao, nativeName;

    public Pais(String nome, String capital, String região, String subregião, String nativeName) {
        this.nome = nome;
        this.capital = capital;
        this.regiao = região;
        this.subregiao = subregião;
        this.nativeName = nativeName;
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String região) {
        this.regiao = região;
    }

    public String getSubregiao() {
        return subregiao;
    }

    public void setSubregiao(String subregião) {
        this.subregiao = subregião;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }
    
    @Override
    public String toString() {
        return String.format("-----------------\n"
                + "Nome: %s\n"
                + "Nome Nativo: %s\n"
                + "Capital: %s\n"
                + "Região: %s\n"
                + "Sub Região: %s\n-----------------\n", nome, nativeName, capital, regiao, subregiao); 
    }
}
