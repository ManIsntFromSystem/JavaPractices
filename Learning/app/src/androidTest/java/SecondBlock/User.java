package SecondBlock;

import java.io.Serializable;

public class User implements Serializable {
    int LifeLevel;
    static int ser;
    transient Sord sord;// поле не будет сериализоватся  // эти обьекты не должны учавствовать в hashCode()
    //static не сериализуется
}
