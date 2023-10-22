import java.util.ArrayList;

public class Canil {

    public static void main(String[] args) {

        registrarCachorros();

    }

    public static ArrayList<Cachorro> registrarCachorros() {
        CachorroBuilder builder= new CachorroBuilder();
        Cachorro cachorro1 = builder.comNome("Bob").comRaca("Poodle").comIdade(5).comGenero("Macho").comCor("Branco").construir();
        Cachorro cachorro2 = builder.construir();
        Cachorro cachorro3 = builder.comNome("Kiara").comRaca("Rottweiler").comIdade(3).comGenero("Fêmea").comCor("Preto").construir();
        Cachorro cachorro4 = builder.comNome("Lua").comRaca("Yorkshire").comIdade(8).comGenero("Fêmea").comCor("Marrom").construir();
        Cachorro cachorro5 = builder.comNome("Scooby").comRaca("Pastor Alemão").comIdade(4).comGenero("Macho").comCor("Marrom com preto").construir();

        ArrayList<Cachorro> listaDeCachorros = new ArrayList<>();
        listaDeCachorros.add(cachorro1);
        listaDeCachorros.add(cachorro2);
        listaDeCachorros.add(cachorro3);
        listaDeCachorros.add(cachorro4);
        listaDeCachorros.add(cachorro5);

        return listaDeCachorros;
    }
}

