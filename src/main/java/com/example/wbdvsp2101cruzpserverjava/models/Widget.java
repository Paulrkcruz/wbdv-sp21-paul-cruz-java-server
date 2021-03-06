package com.example.wbdvsp2101cruzpserverjava.models;


import javax.persistence.*;

@Entity
@Table(name="widgets")
public class Widget {
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private Integer widgetOrder;
    private String text;
    private String url;
    private Integer size;
    private Integer width;
    private Integer height;
    private String cssClass;
    private String style;
    private String value;
    private String topicId;
    private Boolean ordered;
    private String src;


    public Widget(String name, Long id, String type, Integer widgetOrder, String text, String url, Integer size,
                  Integer width, Integer height, String cssClass, String style, String value, String topicId,
                  Boolean ordered, String src) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.widgetOrder = widgetOrder;
        this.text = text;
        this.url = url;
        this.size = size;
        this.width = width;
        this.height = height;
        this.cssClass = cssClass;
        this.style = style;
        this.value = value;
        this.topicId = topicId;
        this.ordered = ordered;
        this.src = src;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getWidgetOrder() {
        return widgetOrder;
    }

    public void setWidgetOrder(Integer widgetOrder) {
        this.widgetOrder = widgetOrder;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

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

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Widget() {
    }

    public Boolean getOrdered() {
        return ordered;
    }

    public void setOrdered(Boolean ordered) {
        this.ordered = ordered;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}

/*
    create table widgets (
       id bigint not null auto_increment,
        css_class varchar(255),
        name varchar(255),
        size integer,
        style varchar(255),
        text varchar(255),
        topic_id varchar(255),
        type varchar(255),
        url varchar(255),
        value varchar(255),
        widget_order integer,
        width integer,
        primary key (id)
    ) engine=InnoDB

 */