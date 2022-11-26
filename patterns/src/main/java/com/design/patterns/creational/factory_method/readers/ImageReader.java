package com.design.patterns.creational.factory_method.readers;

import com.design.patterns.creational.factory_method.DecodedImage;

public interface ImageReader {
    DecodedImage getDecodeImage();
}
