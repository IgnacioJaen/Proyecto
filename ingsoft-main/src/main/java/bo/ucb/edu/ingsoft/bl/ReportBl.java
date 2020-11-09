package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.ReportDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.model.Report;
import bo.ucb.edu.ingsoft.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportBl {
    private ReportDao reportDao;
    private TransactionDao transactionDao;

    @Autowired
    public ReportBl(ReportDao reportDao, TransactionDao transactionDao) {
        this.reportDao = reportDao;
        this.transactionDao = transactionDao;
    }

    public Report findReportById(Report report) {
        return  reportDao.findReportById(report);
    }

    public Report insertReport(Report report, Transaction transaction) {
        report.setTransaction(transaction);
        reportDao.reportInsert(report);
        Integer categoryId = transactionDao.getLastInsertId();
        report.setReportId(categoryId);
        return report;
    }

    public Report updateReport(Report  report, Transaction transaction) {
        report.setTransaction(transaction);
        reportDao.reportUpdate(report);
        return report;
    }

    public Report deleteReport(Report report) {
        reportDao.reportDelete(report);
        return report;
    }
}
