package com.example.themovieapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {
    @SerializedName("page")
    @Expose
    private Integer pages;
    @SerializedName("total_pages")
    @Expose
    private Integer totalpages;
    @SerializedName("total_results")
    @Expose
    private Integer totalresult;
    @SerializedName("results")
    @Expose
    private List<Movie> result;

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getTotal_pages() {
        return totalpages;
    }

    public void setTotal_pages(Integer total_pages) {
        this.totalpages = total_pages;
    }

    public Integer getTotal_result() {
        return totalresult;
    }

    public void setTotal_result(Integer total_result) {
        this.totalresult = total_result;
    }

    public List<Movie> getResult() {
        return result;
    }

    public void setResult(List<Movie> result) {
        this.result = result;
    }

    public Result() {
    }
}
