package com.design.patterns.creational.abstract_factory.factories;

import com.design.patterns.creational.abstract_factory.products.CPU;
import com.design.patterns.creational.abstract_factory.products.GPU;

public interface ProcessorFactory {

    CPU createCPU();

    GPU createGPU();

}
