
package com.milanapp.bccihighlightsdemo.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Thumbnail {

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
    private Object date;
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
    private List<Object> tags = null;
    @SerializedName("platform")
    @Expose
    private String platform;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("additionalInfo")
    @Expose
    private AdditionalInfo_ additionalInfo;
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
    private Metadata_ metadata;
    @SerializedName("titleTranslations")
    @Expose
    private Object titleTranslations;
    @SerializedName("lastModified")
    @Expose
    private Double lastModified;
    @SerializedName("titleUrlSegment")
    @Expose
    private Object titleUrlSegment;
    @SerializedName("subtitle")
    @Expose
    private Object subtitle;
    @SerializedName("variants")
    @Expose
    private List<Variant_> variants = null;
    @SerializedName("onDemandUrl")
    @Expose
    private String onDemandUrl;
    @SerializedName("originalDetails")
    @Expose
    private OriginalDetails originalDetails;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;

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

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
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

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
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

    public AdditionalInfo_ getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(AdditionalInfo_ additionalInfo) {
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

    public Metadata_ getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata_ metadata) {
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

    public Object getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Object subtitle) {
        this.subtitle = subtitle;
    }

    public List<Variant_> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant_> variants) {
        this.variants = variants;
    }

    public String getOnDemandUrl() {
        return onDemandUrl;
    }

    public void setOnDemandUrl(String onDemandUrl) {
        this.onDemandUrl = onDemandUrl;
    }

    public OriginalDetails getOriginalDetails() {
        return originalDetails;
    }

    public void setOriginalDetails(OriginalDetails originalDetails) {
        this.originalDetails = originalDetails;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
