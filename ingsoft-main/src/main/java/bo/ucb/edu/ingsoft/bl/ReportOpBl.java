package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.ReportDao;
import bo.ucb.edu.ingsoft.dao.ReportOptionsDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.ReportOpRequest;
import bo.ucb.edu.ingsoft.model.Report;
import bo.ucb.edu.ingsoft.model.ReportOptions;
import bo.ucb.edu.ingsoft.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportOpBl {
    private ReportOptionsDao reportOptionsDao;
    private TransactionDao transactionDao;

    @Autowired
    public ReportOpBl(ReportOptionsDao reportOptionsDao, TransactionDao transactionDao) {
        this.reportOptionsDao = reportOptionsDao;
        this.transactionDao = transactionDao;
    }

    public ReportOptions findReportOpById(ReportOptions reportOptions) {

        return  reportOptionsDao.findReportOpById(reportOptions);
    }

    public ReportOpRequest findReportOpReqById(ReportOpRequest reportOpRequest) {

        return  reportOptionsDao.findReportOpReqById(reportOpRequest);
    }

    public ReportOptions insertReportOp(ReportOptions reportOptions, Transaction transaction) {
        reportOptions.setTransaction(transaction);
        reportOptionsDao.reportOpInsert(reportOptions);
        Integer reportOpId = transactionDao.getLastInsertId();
        reportOptions.setTransaction(transaction);
        reportOptions.setReportOpId(reportOpId);
        return reportOptions;
    }

    public ReportOptions updateReportOp(ReportOptions  reportOptions, Transaction transaction) {
        reportOptions.setTransaction(transaction);
        reportOptionsDao.reportOpUpdate(reportOptions);
        return reportOptions;
    }

    public ReportOptions deleteReportOp(ReportOptions reportOptions) {
        reportOptionsDao.reportOpDelete(reportOptions);
        return reportOptions;
    }
}
