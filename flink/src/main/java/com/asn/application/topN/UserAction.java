package com.asn.application.topN;

/**
 * @Author: wangsen
 * @Date: 2021/1/25 10:52
 * @Description:
 **/
public class UserAction {
    public long userId; //用户id
    public long itemId; //商品id
    public int categoryId; //商品分类id
    public String behavior; //用户行为（pv, buy, cart, fav)
    public long timestamp; //操作时间戳

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
