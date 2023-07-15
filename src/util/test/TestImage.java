package util.test;

import org.junit.jupiter.api.Test;
import util.Util;

import java.awt.image.BufferedImage;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class TestImage {
    @Test
    public void testImageExists() {
        BufferedImage norm = Util.imageFromURL("http://png-2.findicons.com/files/icons/1995/web_application/48/smiley.png");
        assertFalse(norm.equals(null));
    }

    @Test
    public void drawTestImage() {
        BufferedImage norm = Util.imageFromURL("https://homepages.cae.wisc.edu/~ece533/images/airplane.png");

    }

}


