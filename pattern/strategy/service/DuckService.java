package pattern.strategy.service;

import pattern.strategy.model.DuckModel;

public interface DuckService {
    void performFly(DuckModel duck);
    void performQuack(DuckModel duck);
}

