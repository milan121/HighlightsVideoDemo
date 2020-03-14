
package com.milanapp.bccihighlightsdemo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PageInfo {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("numPages")
    @Expose
    private Integer numPages;
    @SerializedName("pageSize")
    @Expose
    private Integer pageSize;
    @SerializedName("numEntries")
    @Expose
    private Integer numEntries;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getNumEntries() {
        return numEntries;
    }

    public void setNumEntries(Integer numEntries) {
        this.numEntries = numEntries;
    }

}
