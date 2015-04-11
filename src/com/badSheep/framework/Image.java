package com.badSheep.framework;

import com.badSheep.framework.Graphics.ImageFormat;

public interface Image {
	public int getWidth();

	public int getHeight();

	public ImageFormat getFormat();

	public void dispose();
}
