
package com.milanapp.bccihighlightsdemo.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Highlights {

    @SerializedName("pageInfo")
    @Expose
    private PageInfo pageInfo;
    @SerializedName("content")
    @Expose
    private List<Content> content = null;

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

}
