package towers.factories;

import models.DriverModel;
import towers.implementations.LightningTower;
import utilities.Position;
import views.TowerBuyButton;

public class LightningTowerFactory implements TowerFactory<LightningTower> {
    @Override
    public LightningTower create(Position pos, DriverModel driver) {
        return new LightningTower(pos, driver);
    }

    @Override
    public TowerBuyButton getBuyButton() {
        return new TowerBuyButton("Lightning Tower", "", "LightningTower.png");
    }

    @Override
    public int getPrice() {
        return LightningTower.TOWER_COST;
    }
}
