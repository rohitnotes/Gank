package com.example.chen.gank.data.bean;

import java.io.Serializable;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/**
 * @author : chenshuaiyu
 * @date : 2019/4/14 9:24
 */
@Entity(tableName = "Ganks")
public class Gank implements Serializable {
    private static final long serialVersionUID = 3064468536540085893L;
    /**
     * _id : 5bbb01af9d21226111b86f0d
     * createdAt : 2018-10-08T07:05:19.297Z
     * desc : 适用于Android的灵活，强大且轻量级的插件框架【爱奇艺】
     * publishedAt : 2019-03-26T09:36:34.302Z
     * source : chrome
     * type : Android
     * url : https://github.com/iqiyi/Neptune
     * used : true
     * who : 潇湘剑雨
     * images : ["https://ww1.sinaimg.cn/large/0073sXn7ly1g1p96mf7zlj308c0pfjtm","https://ww1.sinaimg.cn/large/0073sXn7ly1g1p96mlxyxj308c0go748","https://ww1.sinaimg.cn/large/0073sXn7ly1g1p96mw2gaj30k30bv406","https://ww1.sinaimg.cn/large/0073sXn7ly1g1p96n3bp6j308c0et0tm","https://ww1.sinaimg.cn/large/0073sXn7ly1g1p96n9715j308c0goq3f"]
     */

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    private String _id;
    @Ignore
    private String createdAt;
    @ColumnInfo(name = "title")
    private String desc;
    @ColumnInfo(name = "date")
    private String publishedAt;
    @Ignore
    private String source;
    @Ignore
    private String type;
    @ColumnInfo(name = "url")
    private String url;
    @Ignore
    private boolean used;
    @ColumnInfo(name = "author")
    private String who;
    @Ignore
    private List<String> images;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
