package br.edu.ifpb.padroes.api.damenos.proxy;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.damenos.DamenosServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class DamenosServiceProxy implements DamenosService {
    DamenosService damenosService = new DamenosServiceImpl();
    List<DamenosPizza> cache = new ArrayList<>();

    @Override
    public List<DamenosPizza> getPizzas() {
        if (cache.isEmpty()) {
            cache = damenosService.getPizzas();
        }

        return cache;
    }
}
