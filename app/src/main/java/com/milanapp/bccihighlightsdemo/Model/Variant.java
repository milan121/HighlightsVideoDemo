
package com.milanapp.bccihighlightsdemo.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Variant {

    @SerializedName("aspectRatio")
    @Expose
    private Double aspectRatio;
    @SerializedName("displayAspectRatio")
    @Expose
    private Object displayAspectRatio;
    @SerializedName("bitRate")
    @Expose
    private Integer bitRate;
    @SerializedName("codec")
    @Expose
    private Object codec;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("format")
    @Expose
    private Object format;
    @SerializedName("frameRate")
    @Expose
    private Double frameRate;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("mediaId")
    @Expose
    private String mediaId;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;
    @SerializedName("width")
    @Expose
    private Integer width;

    public Double getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public Object getDisplayAspectRatio() {
        return displayAspectRatio;
    }

    public void setDisplayAspectRatio(Object displayAspectRatio) {
        this.displayAspectRatio = displayAspectRatio;
    }

    public Integer getBitRate() {
        return bitRate;
    }

    public void setBitRate(Integer bitRate) {
        this.bitRate = bitRate;
    }

    public Object getCodec() {
        return codec;
    }

    public void setCodec(Object codec) {
        this.codec = codec;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Object getFormat() {
        return format;
    }

    public void setFormat(Object format) {
        this.format = format;
    }

    public Double getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(Double frameRate) {
        this.frameRate = frameRate;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

}
