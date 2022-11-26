package com.design.patterns.creational.abstract_factory.factories;

import com.design.patterns.creational.abstract_factory.products.AmdCPU;
import com.design.patterns.creational.abstract_factory.products.AmdGPU;
import com.design.patterns.creational.abstract_factory.products.CPU;
import com.design.patterns.creational.abstract_factory.products.GPU;

public class AmdFactory implements ProcessorFactory {
    @Override
    public CPU createCPU() {
        return new AmdCPU();
    }

    @Override
    public GPU createGPU() {
        return new AmdGPU();
    }
}
