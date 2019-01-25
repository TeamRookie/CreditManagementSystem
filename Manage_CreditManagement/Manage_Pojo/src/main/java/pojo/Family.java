package pojo;

public class Family {
    //家庭编号
    private String jtbh;
    //姓名
    private String xm;
    //行业
    private String hy;
    //备注
    private String bz;

    /*
     * 提供set和get，toString方法
     */

    @Override
    public String toString()
    {
        return "Family{" +
                "jtbh='" + jtbh + '\'' +
                ", xm='" + xm + '\'' +
                ", hy='" + hy + '\'' +
                ", bz='" + bz + '\'' +
                '}';
    }

    public String getJtbh()
    {
        return jtbh;
    }

    public void setJtbh(String jtbh)
    {
        this.jtbh = jtbh;
    }

    public String getXm()
    {
        return xm;
    }

    public void setXm(String xm)
    {
        this.xm = xm;
    }

    public String getHy()
    {
        return hy;
    }

    public void setHy(String hy)
    {
        this.hy = hy;
    }

    public String getBz()
    {
        return bz;
    }

    public void setBz(String bz)
    {
        this.bz = bz;
    }
}