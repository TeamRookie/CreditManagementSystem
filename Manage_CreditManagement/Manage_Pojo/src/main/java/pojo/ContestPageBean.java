package pojo;

import java.util.List;

public class ContestPageBean
{
    private  Integer pageSize;
    private  Integer currentPage;
    private  Integer totalPage;
    private  Integer totalCount;
    private  Integer start;
    private  String searchDate;
    private  String theme;
    private  String rank;
    private  String StuNum;

    private List pageList;

    public ContestPageBean(Integer pageSize, Integer currentPage, Integer totalCount)
    {

        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.totalCount = totalCount;
        if(this.pageSize==null)
        {
            this.pageSize=3;
        }
        if(this.currentPage==null)
        {
            this.currentPage=1;
        }
        this.totalPage=(this.totalCount+this.pageSize-1)/this.pageSize;
        if(this.currentPage<1||this.currentPage>this.totalPage)
        {
            this.currentPage=1;
        }
    }

    public String getSearchDate()
    {
        return searchDate;
    }

    public void setSearchDate(String searchDate)
    {
        this.searchDate = searchDate;
    }

    public String getTheme()
    {
        return theme;
    }

    public void setTheme(String theme)
    {
        this.theme = theme;
    }

    public String getRank()
    {
        return rank;
    }

    public void setRank(String rank)
    {
        this.rank = rank;
    }

    public String getStuNum()
    {
        return StuNum;
    }

    public void setStuNum(String stuNum)
    {
        StuNum = stuNum;
    }

    public Integer getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
    }

    public Integer getStart()
    {
        return start;
    }

    public void setStart(Integer start)
    {
        this.start = start;
    }

    public Integer getCurrentPage()
    {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage)
    {
        this.currentPage = currentPage;
    }

    public Integer getTotalPage()
    {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage)
    {
        this.totalPage = totalPage;
    }

    public Integer getTotalCount()
    {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount)
    {
        this.totalCount = totalCount;
    }

    public List getPageList()
    {
        return pageList;
    }

    public void setPageList(List pageList)
    {
        this.pageList = pageList;
    }
}
