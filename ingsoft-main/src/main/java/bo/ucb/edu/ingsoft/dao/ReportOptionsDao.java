package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.ReportOpRequest;
import bo.ucb.edu.ingsoft.model.Category;
import bo.ucb.edu.ingsoft.model.ReportOptions;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReportOptionsDao {
    //Metodos de la clase ReportOptionsDao que seran utilizadas por los .xml de la
    //carpeta resources/dao que utilicen como mapper esta clase

    //Metodo para encontrar una opcion de reporte y tiene un parametro de tipo reportOptions
    public ReportOptions findReportOpById(ReportOptions reportOptions);

    //Metodo para encontrar una opcion de reporte y tiene un parametro de tipo reportOpRequest
    //ya que es el request para la vista del usuario de tipo cliente
    public ReportOpRequest findReportOpReqById(ReportOpRequest reportOpRequest);

    //Metodo para agregar una opcion de reporte y tiene un parametro de tipo reportOptions
    public void reportOpInsert(ReportOptions reportOptions);

    //Metodo para actualizar una opcion de reporte y tiene un parametro de tipo reportOptions
    public void reportOpUpdate(ReportOptions reportOptions);

    //Metodo para eliminar una opcion de reporte y tiene un parametro de tipo reportOptions
    public void reportOpDelete(ReportOptions reportOptions);
}
