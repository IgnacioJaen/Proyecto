package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Category;
import bo.ucb.edu.ingsoft.model.ReportOptions;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReportOptionsDao {
    public ReportOptions findReportOpById(ReportOptions reportOptions);

    public void reportOpInsert(ReportOptions reportOptions);

    public void reportOpUpdate(ReportOptions reportOptions);

    public void reportOpDelete(ReportOptions reportOptions);
}
