package com.design.patterns.creational.abstract_factory;

import com.design.patterns.creational.abstract_factory.factories.ProcessorFactory;
import com.design.patterns.creational.abstract_factory.factories.AmdFactory;
import com.design.patterns.creational.abstract_factory.factories.IntelFactory;

public class FactoryMaker {
    private static final IntelFactory INTEL_FACTORY = new IntelFactory();
    private static final AmdFactory AMD_FACTORY = new AmdFactory();

    public static ProcessorFactory getFactory(ProcessorType processorType) {
        ProcessorFactory factory = null;
        switch (processorType) {
            case INTEL:
                factory = INTEL_FACTORY;
                break;
            case AMD:
                factory = AMD_FACTORY;
                break;
            default:
                throw new IllegalArgumentException("Processor type not supported.");
        }
        return factory;
    }
}
