package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.ReportDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.CategoryRequest;
import bo.ucb.edu.ingsoft.dto.ReportRequest;
import bo.ucb.edu.ingsoft.model.Report;
import bo.ucb.edu.ingsoft.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportBl {
    private ReportDao reportDao;
    private TransactionDao transactionDao;

    //Constructor de la clase ReportBl recibe dos parametros de tipo reportDao y transactionDao
    @Autowired
    public ReportBl(ReportDao reportDao, TransactionDao transactionDao) {
        this.reportDao = reportDao;
        this.transactionDao = transactionDao;
    }

    //Metodo que a traves del objeto reportDao llama al metodo para encontrar un
    //reporte por medio del ID
    public Report findReportById(Report report) {
        return  reportDao.findReportById(report);
    }

    //Metodo que a traves del objeto reportDao llama al metodo para agregar un
    //reporte
    public Report insertReport(Report report, Transaction transaction) {
        report.setTransaction(transaction);
        reportDao.reportInsert(report);
        Integer reportId = transactionDao.getLastInsertId();
        report.setReportId(reportId);
        return report;
    }

    //Metodo que a traves del objeto reportDao llama al metodo para actualizar un
    //reporte por medio del ID
    public Report updateReport(Report  report, Transaction transaction) {
        report.setTransaction(transaction);
        reportDao.reportUpdate(report);
        return report;
    }

    //Metodo que a traves del objeto reportDao llama al metodo para eliminar un
    //reporte por medio del ID
    public Report deleteReport(Report report) {
        reportDao.reportDelete(report);
        return report;
    }

    public List<ReportRequest> reports(){

        List<ReportRequest> reports=reportDao.reports();
        return reports;
    }
}
