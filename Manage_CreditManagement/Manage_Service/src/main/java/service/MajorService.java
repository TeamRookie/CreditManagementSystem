package service;

import pojo.Faculty;
import pojo.Major;

import java.util.List;

public interface MajorService
{
    List<Major> getMajorByFaculty(String faculty);
}
