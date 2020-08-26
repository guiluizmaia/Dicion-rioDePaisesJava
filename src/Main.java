import java.io.*;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;

public class Main {
    
    public static void main(String[] args) throws IOException, ParseException{
    try{
        JSONArray arrayJson;
        JSONParser convert = new JSONParser();
               
        Object obj = convert.parse(new FileReader("data.json"));
        arrayJson = (JSONArray) obj;
        int tam = arrayJson.size();
        //Pais[] pais = new Pais[tam];
        List<Pais> listaPais = new ArrayList<>();
        for (int i = 0; i < tam; i++) {
            JSONObject rec = (JSONObject) arrayJson.get(i);
            
            String nome = (String) rec.get("name");
            String capital = (String) rec.get("capital");
            String regiao = (String) rec.get("region");
            String subregiao = (String) rec.get("subregion");
            String nomenativo = (String) rec.get("nativeName");
            //Pais p = new Pais(nome, capital, regiao, subregiao, nomenativo);
            listaPais.add(new Pais(nome, capital, regiao, subregiao, nomenativo));
            System.out.println(listaPais.get(i));
        }
                       
        
    } catch(FileNotFoundException e){
        e.printStackTrace();
    } catch(IOException e){
        e.printStackTrace();
    }     
         
}

   
}
