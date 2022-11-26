package com.design.patterns.creational.factory_method;

import com.design.patterns.creational.factory_method.readers.GifReader;
import com.design.patterns.creational.factory_method.readers.ImageReader;
import com.design.patterns.creational.factory_method.readers.JpegReader;

public class Main {

    public static void main(String[] args) {
        String image = "Content";

        DecodedImage gif = new GifReader(image).getDecodeImage();
        System.out.println(gif);

        DecodedImage jpeg = new JpegReader(image).getDecodeImage();
        System.out.println(jpeg);
    }
}
