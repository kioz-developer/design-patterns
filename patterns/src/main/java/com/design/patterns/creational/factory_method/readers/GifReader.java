package com.design.patterns.creational.factory_method.readers;

import com.design.patterns.creational.factory_method.DecodedImage;

public class GifReader implements ImageReader {
    private DecodedImage decodedImage;

    public GifReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}