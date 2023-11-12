package com.demo.ConstructorInjection.example1;

public class Author {

    private Integer authorId;
    private String authorName;
    private String authorAddress;

    public Integer getAuthorId() { return authorId; }
    public void setAuthorId(Integer authorId) { this.authorId = authorId; }

    public String getAuthorName() { return authorName; }
    public void setAuthorName(String authorName) { this.authorName = authorName; }

    public String getAuthorAddress() { return authorAddress; }
    public void setAuthorAddress(String authorAddress) { this.authorAddress = authorAddress; }

}
