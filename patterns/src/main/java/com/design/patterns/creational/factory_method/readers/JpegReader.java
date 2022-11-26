package com.design.patterns.creational.factory_method.readers;

import com.design.patterns.creational.factory_method.DecodedImage;

public class JpegReader implements ImageReader {
    private DecodedImage decodedImage;

    public JpegReader(String image) {
        decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}