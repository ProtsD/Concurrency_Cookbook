package ru.git.a7_concurrent_collections.a7_6_using_thread_safe_hashmaps;

import java.util.Date;

public class Operation
{
    private String user;
    private String operation;
    private Date time;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
