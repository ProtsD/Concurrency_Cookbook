package ru.git.a8_customizing_concurrency_classes.a8_12_implementing_your_own_asynchronous_stream;

import java.util.Date;

public class News {
    private String title;
    private String content;
    private Date date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
