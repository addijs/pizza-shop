package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class ExtraCheeseDecorator extends BasePizzaDecorator {
  public ExtraCheeseDecorator(Pizza pizza) {
    super(pizza);
  }

  @Override
  public Float getPrice() {
    return super.getPrice() * 1.10f;
  }

  @Override
  public String getName() {
    return super.getName() + " (extra cheese)";
  }
}
