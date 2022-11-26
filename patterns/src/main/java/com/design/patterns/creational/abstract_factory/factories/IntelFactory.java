package com.design.patterns.creational.abstract_factory.factories;

import com.design.patterns.creational.abstract_factory.products.*;

public class IntelFactory implements ProcessorFactory {
    @Override
    public CPU createCPU() {
        return new IntelCPU();
    }

    @Override
    public GPU createGPU() {
        return new AmdGPU();
    }
}
