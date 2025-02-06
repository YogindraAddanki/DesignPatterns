package FactoryPattern;

import FactoryPattern.Factory.AndroidFactory;
import FactoryPattern.Factory.Factory;
import FactoryPattern.Factory.IosFactory;

public class FactoryUtil {

    public Factory factoryType(OSType type){

        if(type == OSType.ANDROID)
            return new AndroidFactory();
        else if(type == OSType.IOS)
            return new IosFactory();
        return null;
    }
}
