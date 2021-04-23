package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class StuffedCrustDecorator extends BasePizzaDecorator {
  public StuffedCrustDecorator(Pizza pizza) {
    super(pizza);
  }

  @Override
  public Float getPrice() {
    return super.getPrice() * 1.20f;
  }

  @Override
  public String getName() {
    return super.getName() + " (stuffed crust)";
  }
}
