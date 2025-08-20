package pattern.strategy.controller;

import pattern.strategy.model.DuckModel;
import pattern.strategy.service.DuckService;
import pattern.strategy.service.FlyBehavior;
import pattern.strategy.service.QuackBehavior;

public class DuckController {
    private DuckService duckService;
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public DuckController(DuckService duckService, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.duckService = duckService;
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void performActions(DuckModel duck) {
        System.out.println("Duck: " + duck.getName() + " (" + duck.getType() + ")");
        flyBehavior.fly();
        quackBehavior.quack();
    }
}

