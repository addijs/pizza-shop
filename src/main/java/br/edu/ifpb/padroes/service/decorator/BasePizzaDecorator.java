package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public abstract class BasePizzaDecorator implements Pizza {
  Pizza pizza;

  BasePizzaDecorator(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public Float getPrice() {
    return pizza.getPrice();
  }

  @Override
  public String getName() {
    return pizza.getName();
  }
}
