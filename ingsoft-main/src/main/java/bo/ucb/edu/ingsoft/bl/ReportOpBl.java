package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.ReportDao;
import bo.ucb.edu.ingsoft.dao.ReportOptionsDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.CategoryRequest;
import bo.ucb.edu.ingsoft.dto.ReportOpRequest;
import bo.ucb.edu.ingsoft.model.Report;
import bo.ucb.edu.ingsoft.model.ReportOptions;
import bo.ucb.edu.ingsoft.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportOpBl {
    private ReportOptionsDao reportOptionsDao;
    private TransactionDao transactionDao;

    //Constructor de la clase ReportOpBl recibe dos parametros de tipo reportOpionsDao y transactionDao
    @Autowired
    public ReportOpBl(ReportOptionsDao reportOptionsDao, TransactionDao transactionDao) {
        this.reportOptionsDao = reportOptionsDao;
        this.transactionDao = transactionDao;
    }

    //Metodo que a traves del objeto reportOptionsDao llama al metodo para encontrar una
    //opcion de reporte por medio del ID
    public ReportOptions findReportOpById(ReportOptions reportOptions) {

        return  reportOptionsDao.findReportOpById(reportOptions);
    }

    //Metodo que a traves del objeto reportOptionsDao llama al metodo para encontrar una
    //opcion de reporte por medio del ID
    public ReportOpRequest findReportOpReqById(ReportOpRequest reportOpRequest) {

        return  reportOptionsDao.findReportOpReqById(reportOpRequest);
    }

    //Metodo que a traves del objeto reportOptionsDao llama al metodo para agregar una
    //opcion de reporte
    public ReportOptions insertReportOp(ReportOptions reportOptions, Transaction transaction) {
        reportOptions.setTransaction(transaction);
        reportOptionsDao.reportOpInsert(reportOptions);
        Integer reportOpId = transactionDao.getLastInsertId();
        reportOptions.setTransaction(transaction);
        reportOptions.setReportOpId(reportOpId);
        return reportOptions;
    }

    //Metodo que a traves del objeto reportOptionsDao llama al metodo para actualizar una
    //opcion de reporte por medio del ID
    public ReportOptions updateReportOp(ReportOptions  reportOptions, Transaction transaction) {
        reportOptions.setTransaction(transaction);
        reportOptionsDao.reportOpUpdate(reportOptions);
        return reportOptions;
    }

    //Metodo que a traves del objeto reportOptionsDao llama al metodo para eliminar una
    //opcion de reporte por medio del ID
    public ReportOptions deleteReportOp(ReportOptions reportOptions) {
        reportOptionsDao.reportOpDelete(reportOptions);
        return reportOptions;
    }

    public List<ReportOpRequest> reportOptions(){

        List<ReportOpRequest> reportOp=reportOptionsDao.reportOptions();
        return reportOp;
    }
}
