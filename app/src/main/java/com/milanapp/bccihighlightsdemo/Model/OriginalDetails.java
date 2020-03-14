
package com.milanapp.bccihighlightsdemo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OriginalDetails {

    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("aspectRatio")
    @Expose
    private Double aspectRatio;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Double getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

}
