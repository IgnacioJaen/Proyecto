package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.ReportBl;
import bo.ucb.edu.ingsoft.bl.ReportOpBl;
import bo.ucb.edu.ingsoft.dto.CategoryRequest;
import bo.ucb.edu.ingsoft.dto.ReportOpRequest;
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
import java.util.List;

@RestController
@RequestMapping(value = "/v1/reportOptions")
public class ReportOpApi {
    private ReportOpBl reportOpBl;

    //Constructor de la clase ReportOpApi recibe un parametro de tipo ReportOpBl
    @Autowired
    public ReportOpApi(ReportOpBl reportOpBl) {
        this.reportOpBl = reportOpBl;
    }

    //Metodo que obtiene una opcion de reporte por el ID a traves del
    // requestMethod GET con los parametros para la vista del usuario de
    // tipo admin
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ReportOptions findById(@RequestBody ReportOptions reportOptions, HttpServletRequest request) {
        return reportOpBl.findReportOpById(reportOptions);
    }

    //Metodo que obtiene una opcion de reporte por el ID a traves del
    // requestMethod GET con los parametros para la vista del usuario de
    // tipo cliente
    @RequestMapping(value="/request", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ReportOpRequest findById(@RequestBody ReportOpRequest reportOpRequest, HttpServletRequest request) {
        return reportOpBl.findReportOpReqById(reportOpRequest);
    }

    //Metodo que agrega una opcion de reporte a traves del requestMethod POST
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ReportOptions insertReportOp(@RequestBody ReportOptions reportOptions, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        reportOpBl.insertReportOp(reportOptions,transaction);
        return reportOptions;

    }

    //Metodo que actualiza una opcion de reporte a traves del requestMethod PUT
    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ReportOptions updateReport(@RequestBody ReportOptions reportOptions, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        reportOpBl.updateReportOp(reportOptions,transaction);
        return  reportOptions;
    }

    //Metodo que actualiza una opcion de reporte a traves del requestMethod PUT
    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ReportOptions deleteReport(@RequestBody ReportOptions reportOptions, HttpServletRequest request) {
        return reportOpBl.deleteReportOp(reportOptions);
    }

    @RequestMapping(path="/reports",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ReportOpRequest> reportOptions(HttpServletRequest request) {
        List<ReportOpRequest> reportOp=reportOpBl.reportOptions();
        return reportOp;
    }
}
