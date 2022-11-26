package com.design.patterns.creational.abstract_factory;

import com.design.patterns.creational.abstract_factory.factories.ProcessorFactory;
import com.design.patterns.creational.abstract_factory.products.CPU;
import com.design.patterns.creational.abstract_factory.products.GPU;

public class Main {

    // Provide an interface for creating families of related or dependent objects
    // without specifying their concrete classes.
    // https://www.baeldung.com/java-abstract-factory-pattern
    public static void main(String[] args) {
        ProcessorFactory factoryIntel = FactoryMaker.getFactory(ProcessorType.INTEL);
        CPU cpuIntel = factoryIntel.createCPU();
        GPU gpuIntel = factoryIntel.createGPU();

        ProcessorFactory factoryAmd = FactoryMaker.getFactory(ProcessorType.AMD);
        CPU cpuAmd = factoryAmd.createCPU();
        GPU gpuAmd = factoryAmd.createGPU();
    }
}
