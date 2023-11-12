package com.demo.ConstructorInjection.example1;

import org.springframework.stereotype.Component;

@Component
public class Page {

    private Integer pageId;
    private Integer pageNumber;
    private String pageText;
    private String pageHeader;

    public Integer getPageId() { return pageId; }
    public void setPageId(Integer pageId) { this.pageId = pageId; }

    public Integer getPageNumber() { return pageNumber; }
    public void setPageNumber(Integer pageNumber) { this.pageNumber = pageNumber; }

    public String getPageText() { return pageText; }
    public void setPageText(String pageText) { this.pageText = pageText; }

    public String getPageHeader() { return pageHeader; }
    public void setPageHeader(String pageHeader) { this.pageHeader = pageHeader; }

}
