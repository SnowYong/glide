/*
 * Copyright (c) 2012. Bump Technologies Inc. All Rights Reserved.
 */

package com.bumptech.photos.imagemanager.loader;

import com.bumptech.photos.imagemanager.LoadedCallback;
import com.bumptech.photos.imagemanager.ImageManager;

/**
 * Created with IntelliJ IDEA.
 * User: sam
 * Date: 12/25/12
 * Time: 10:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Approximate<T> extends PhotoManagerLoader<T> {

    public Approximate(ImageManager imageManager) {
        super(imageManager);
    }

    @Override
    protected Object doFetchImage(String path, int width, int height, LoadedCallback cb) {
        return imageManager.getImageApproximate(path, width, height, cb);
    }
}