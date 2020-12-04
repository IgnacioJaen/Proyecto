package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.CategoryBl;
import bo.ucb.edu.ingsoft.bl.ReportBl;
import bo.ucb.edu.ingsoft.dto.ChatRequest;
import bo.ucb.edu.ingsoft.dto.ReportRequest;
import bo.ucb.edu.ingsoft.model.Category;
import bo.ucb.edu.ingsoft.model.Report;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/v1/report")
public class ReportApi {
    private ReportBl reportBl;

    //Constructor de la clase ReportApi recibe un parametro de tipo ReportBl
    @Autowired
    public ReportApi(ReportBl reportBl) {
        this.reportBl = reportBl;
    }

    //Metodo que obtiene un reporte por el ID a traves del
    // requestMethod GET con los parametros para la vista del usuario de
    // tipo admin
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Report findById(@RequestBody Report report, HttpServletRequest request) {
        return reportBl.findReportById(report);
    }

    //Metodo que agrega una opcion de reporte a traves del requestMethod POST
    @RequestMapping(value = "/post", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Report insertReport(@RequestBody Report report, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        reportBl.insertReport(report,transaction);
        return report;

    }

    //Metodo que actualiza una opcion de reporte a traves del requestMethod PUT
    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Report updateReport(@RequestBody Report report, HttpServletRequest request) {
        TransactionUtil transactionUtil= new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        reportBl.updateReport(report,transaction);
        return  report;
    }

    //Metodo que elimina una opcion de reporte a traves del requestMethod DELETE es decir cambia el status a 0
    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Report deleteReport(@RequestBody Report report, HttpServletRequest request) {
        return reportBl.deleteReport(report);
    }

    @RequestMapping(path="/reports",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ReportRequest> reportList(HttpServletRequest request) {
        List<ReportRequest> report=reportBl.reports();
        return report;
    }
}
