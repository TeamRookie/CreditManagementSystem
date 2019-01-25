package service;

import javax.servlet.ServletOutputStream;

public interface DownloadService
{
    void export(String[] title, ServletOutputStream outputStream);
}
