package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.ReportBl;
import bo.ucb.edu.ingsoft.bl.ReportOpBl;
import bo.ucb.edu.ingsoft.model.Report;
import bo.ucb.edu.ingsoft.model.ReportOptions;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/v1/reportOptions")
public class ReportOpApi {
    private ReportOpBl reportOpBl;

    @Autowired
    public ReportOpApi(ReportOpBl reportOpBl) {
        this.reportOpBl = reportOpBl;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ReportOptions findById(@RequestBody ReportOptions reportOptions, HttpServletRequest request) {
        return reportOpBl.findReportOpById(reportOptions);
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ReportOptions insertReportOp(@RequestBody ReportOptions reportOptions, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        reportOpBl.insertReportOp(reportOptions,transaction);
        return reportOptions;

    }

    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ReportOptions updateReport(@RequestBody ReportOptions reportOptions, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        reportOpBl.updateReportOp(reportOptions,transaction);
        return  reportOptions;
    }

    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ReportOptions deleteReport(@RequestBody ReportOptions reportOptions, HttpServletRequest request) {
        return reportOpBl.deleteReportOp(reportOptions);
    }
}
