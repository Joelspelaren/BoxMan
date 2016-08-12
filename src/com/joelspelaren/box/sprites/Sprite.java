package com.joelspelaren.box.sprites;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Sprite {

    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean vis;
    protected List<Image> imageList;
    public int imageIndex = 0;

    public Sprite(int x, int y) {

        this.x = x;
        this.y = y;
        vis = true;
        imageList = new ArrayList<Image>();
    }

    protected void getImageDimensions() {

        width = imageList.get(0).getWidth(null);
        height = imageList.get(0).getHeight(null);
    }

    protected void loadImage(String imageName) {

        ImageIcon ii = new ImageIcon(imageName);
        imageList.add(ii.getImage());
    }

    public Image getImage() {
        return imageList.get(imageIndex);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisible() {
        return vis;
    }

    public void setVisible(Boolean visible) {
        vis = visible;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
}