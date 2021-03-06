package de.seism0saurus.design.pattern.abstractfactory.after.korean;

import de.seism0saurus.design.pattern.abstractfactory.after.Dessert;
import de.seism0saurus.design.pattern.abstractfactory.after.FirstCourse;
import de.seism0saurus.design.pattern.abstractfactory.after.MainCourse;
import de.seism0saurus.design.pattern.abstractfactory.after.MenuFactory;

public class KoreanMenuFactory implements MenuFactory {

    @Override
    public FirstCourse getFirstCourse() {
        return new KoreanSpringRoll();
    }

    @Override
    public MainCourse getMainCourse() {
        return new TofuWithVegetables();
    }

    @Override
    public Dessert getDesert() {
        return new HoneyCakeFromRice();
    }
}
