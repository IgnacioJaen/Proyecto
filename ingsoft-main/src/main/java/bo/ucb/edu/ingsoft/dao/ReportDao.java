package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Report;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReportDao {
    //Metodos de la clase ReportDao que seran utilizadas por los .xml de la
    //carpeta resources/dao que utilicen como mapper esta clase

    //Metodo para encontrar un reporte y tiene un parametro de tipo report
    public Report findReportById(Report report);

    //Metodo para agregar un reporte y tiene un parametro de tipo report
    public void reportInsert(Report report);

    //Metodo para actualizar un reporte y tiene un parametro de tipo report
    public void reportUpdate(Report report);

    //Metodo para eliminar un reporte y tiene un parametro de tipo report
    public void reportDelete(Report report);
}
