
package com.milanapp.bccihighlightsdemo.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("accountId")
    @Expose
    private Integer accountId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("coordinates")
    @Expose
    private Object coordinates;
    @SerializedName("commentsOn")
    @Expose
    private Boolean commentsOn;
    @SerializedName("copyright")
    @Expose
    private Object copyright;
    @SerializedName("publishFrom")
    @Expose
    private Double publishFrom;
    @SerializedName("publishTo")
    @Expose
    private Integer publishTo;
    @SerializedName("tags")
    @Expose
    private List<Tag> tags = null;
    @SerializedName("platform")
    @Expose
    private String platform;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("additionalInfo")
    @Expose
    private AdditionalInfo additionalInfo;
    @SerializedName("canonicalUrl")
    @Expose
    private String canonicalUrl;
    @SerializedName("references")
    @Expose
    private List<Object> references = null;
    @SerializedName("related")
    @Expose
    private List<Object> related = null;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("titleTranslations")
    @Expose
    private Object titleTranslations;
    @SerializedName("lastModified")
    @Expose
    private Double lastModified;
    @SerializedName("titleUrlSegment")
    @Expose
    private Object titleUrlSegment;
    @SerializedName("thumbnailUrl")
    @Expose
    private String thumbnailUrl;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("variants")
    @Expose
    private List<Variant> variants = null;
    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;
    @SerializedName("mediaId")
    @Expose
    private String mediaId;
    @SerializedName("mediaGuid")
    @Expose
    private String mediaGuid;
    @SerializedName("subtitle")
    @Expose
    private Object subtitle;
    @SerializedName("closedCaptioned")
    @Expose
    private Boolean closedCaptioned;
    @SerializedName("hotlinkUrl")
    @Expose
    private Object hotlinkUrl;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("onDemandUrl")
    @Expose
    private Object onDemandUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Object getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    public Boolean getCommentsOn() {
        return commentsOn;
    }

    public void setCommentsOn(Boolean commentsOn) {
        this.commentsOn = commentsOn;
    }

    public Object getCopyright() {
        return copyright;
    }

    public void setCopyright(Object copyright) {
        this.copyright = copyright;
    }

    public Double getPublishFrom() {
        return publishFrom;
    }

    public void setPublishFrom(Double publishFrom) {
        this.publishFrom = publishFrom;
    }

    public Integer getPublishTo() {
        return publishTo;
    }

    public void setPublishTo(Integer publishTo) {
        this.publishTo = publishTo;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    public void setCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
    }

    public List<Object> getReferences() {
        return references;
    }

    public void setReferences(List<Object> references) {
        this.references = references;
    }

    public List<Object> getRelated() {
        return related;
    }

    public void setRelated(List<Object> related) {
        this.related = related;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Object getTitleTranslations() {
        return titleTranslations;
    }

    public void setTitleTranslations(Object titleTranslations) {
        this.titleTranslations = titleTranslations;
    }

    public Double getLastModified() {
        return lastModified;
    }

    public void setLastModified(Double lastModified) {
        this.lastModified = lastModified;
    }

    public Object getTitleUrlSegment() {
        return titleUrlSegment;
    }

    public void setTitleUrlSegment(Object titleUrlSegment) {
        this.titleUrlSegment = titleUrlSegment;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getMediaGuid() {
        return mediaGuid;
    }

    public void setMediaGuid(String mediaGuid) {
        this.mediaGuid = mediaGuid;
    }

    public Object getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Object subtitle) {
        this.subtitle = subtitle;
    }

    public Boolean getClosedCaptioned() {
        return closedCaptioned;
    }

    public void setClosedCaptioned(Boolean closedCaptioned) {
        this.closedCaptioned = closedCaptioned;
    }

    public Object getHotlinkUrl() {
        return hotlinkUrl;
    }

    public void setHotlinkUrl(Object hotlinkUrl) {
        this.hotlinkUrl = hotlinkUrl;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Object getOnDemandUrl() {
        return onDemandUrl;
    }

    public void setOnDemandUrl(Object onDemandUrl) {
        this.onDemandUrl = onDemandUrl;
    }

}
