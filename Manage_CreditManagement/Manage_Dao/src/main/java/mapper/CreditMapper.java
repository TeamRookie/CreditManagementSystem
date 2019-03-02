package mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CreditMapper {
	
	 List<Map<String, Object>> selectByStunum(@Param("itemtime") String itemtime, @Param("itemname") String itemname, @Param("itemscore") String itemscore, @Param("table") String table, @Param("stunum") String stunum);

}
