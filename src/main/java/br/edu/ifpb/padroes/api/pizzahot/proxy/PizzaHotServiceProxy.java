package br.edu.ifpb.padroes.api.pizzahot.proxy;

import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class PizzaHotServiceProxy implements PizzaHotService {
    PizzaHotService pizzaHotService = new PizzaHotServiceImpl();
    List<PizzaHotPizza> cache = new ArrayList<>();

    @Override
    public List<PizzaHotPizza> getPizzas() {
        if (cache.isEmpty()) {
            cache = pizzaHotService.getPizzas();
        }

        return cache;
    }
}
