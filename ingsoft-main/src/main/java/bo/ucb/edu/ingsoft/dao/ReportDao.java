package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Report;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReportDao {
    public Report findReportById(Report report);

    public void reportInsert(Report report);

    public void reportUpdate(Report report);

    public void reportDelete(Report report);
}
