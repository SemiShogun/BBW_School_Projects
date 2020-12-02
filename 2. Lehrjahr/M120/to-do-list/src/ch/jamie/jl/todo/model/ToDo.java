package ch.jamie.jl.todo.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ToDo {

    private StringProperty date;
    private StringProperty priority;
    private StringProperty keyword;
    private StringProperty memo;

    public ToDo(String date, String priority, String keyword, String memo) {
        this.date = new SimpleStringProperty(date);
        this.priority = new SimpleStringProperty(priority);
        this.keyword = new SimpleStringProperty(keyword);
        this.memo = new SimpleStringProperty(memo);
    }

    public String getDate() {
        return date.get();
    }

    public StringProperty dateProperty() {
        return date;
    }

    public void setDate(String date) {
        this.date.set(date);
    }

    public String getPriority() {
        return priority.get();
    }

    public StringProperty priorityProperty() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority.set(priority);
    }

    public String getKeyword() {
        return keyword.get();
    }

    public StringProperty keywordProperty() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword.set(keyword);
    }

    public String getMemo() {
        return memo.get();
    }

    public StringProperty memoProperty() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo.set(memo);
    }
}
