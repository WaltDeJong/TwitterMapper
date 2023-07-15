package ui;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.Layer;
import org.openstreetmap.gui.jmapviewer.MapMarkerCircle;
import org.openstreetmap.gui.jmapviewer.interfaces.MapMarker;
import twitter4j.Status;

import java.awt.*;
import java.awt.image.BufferedImage;

public class MapMarkerComplex extends MapMarkerCircle implements MapMarker {

    public static final double defaultMarkerSize = 20.0;
    public Status status;
    BufferedImage image;

    public MapMarkerComplex(Layer layer, Coordinate coord, Color color, BufferedImage image, Status status) {
        super(layer, null, coord, defaultMarkerSize, STYLE.FIXED, getDefaultStyle());
        this.image = image;
        this.status = status;
        setColor(color);
        setBackColor(color);

    }

    public Status getStatus() {
        return status;
    }

    @Override
    public void paint(Graphics g, Point position, int radius) {
        super.paint(g, position, radius);
        double r = this.getRadius();
        int width = 20;
        int height = 20;
        int w2 = width / 2;
        int h2 = height / 2;
        g.drawImage(this.image, position.x - w2, position.y - h2, width, height, null);
        this.paintText(g, position);
    }

    public BufferedImage getImage() {
        return image;
    }

    public static double getDefaultMarkerSize() {
        return defaultMarkerSize;
    }


}
