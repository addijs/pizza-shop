package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PanPizzaDecorator extends BasePizzaDecorator {
  public PanPizzaDecorator(Pizza pizza) {
    super(pizza);
  }

  @Override
  public Float getPrice() {
    return super.getPrice() * 1.15f;
  }

  @Override
  public String getName() {
    return super.getName() + " (pan pizza)";
  }
}
