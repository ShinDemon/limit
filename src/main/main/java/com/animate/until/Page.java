package com.animate.until;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by Administrator on 2017/1/11.
 */
public class Page<T> implements Serializable {

    public static final int PAGE_SIZE_DEFAULT = 10;
    public static final int CUR_PAGE_DEFAULT = 1;
    //当前页数
    private int curPage = CUR_PAGE_DEFAULT;
    //每页显示数
    private int pageSize = PAGE_SIZE_DEFAULT;
    //总页数
    private int sumPages;
    //总记录数
    private int sumRecords;
    //记录
    private List<T> items;

    public Page() {
    }

    public Page(List<T> items) {
        this.items = items;
        this.sumRecords = items.size();
        this.sumPages = (int)Math.ceil((double)items.size() / this.pageSize);
    }

    public Page(int pageSize, List<T> items) {
        this.pageSize = pageSize;
        this.items = items;
        this.sumRecords = items.size();
        this.sumPages = (int)Math.ceil((double)items.size() / this.pageSize);
    }

    public List<T> getCurItems(int currentPage) {
        if(currentPage != this.curPage) {
            if(currentPage < 1) {
                return null;
            }
            if(currentPage > this.sumPages) {
                return null;
            }
            this.curPage = currentPage;
        }
        int startIndex = (this.curPage - 1) * this.pageSize;
        int endIndex = this.curPage * this.pageSize;
        List<T> curItems = this.items.subList(startIndex, endIndex);
        return curItems;
    }

    public int getPrePage() {
        if(this.curPage > 1)
            return this.curPage - 1;
        else
            return 0;
    }

    public int getNextPage() {
        if(this.curPage < this.sumPages)
            return this.curPage + 1;
        else
            return 0;
    }

    public int getCurPage() {
        return curPage;
    }

    public Page setCurPage(int curPage) {
        this.curPage = curPage;
        return this;
    }

    public int getPageSize() {
        return pageSize;
    }

    public Page setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public int getSumPages() {
        return sumPages;
    }

    public Page setSumPages(int sumPages) {
        this.sumPages = sumPages;
        return this;
    }

    public int getSumRecords() {
        return sumRecords;
    }

    public Page setSumRecords(int sumRecords) {
        this.sumRecords = sumRecords;
        return this;
    }

    public List<T> getItems() {
        return items;
    }

    public Page setItems(List<T> items) {
        this.items = items;
        return this;
    }
}
