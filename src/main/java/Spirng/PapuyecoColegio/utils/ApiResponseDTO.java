package Spirng.PapuyecoColegio.utils;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

@Data
public class ApiResponseDTO<T> implements Serializable {

    @SerializedName(value = "state", alternate = {"status"})
    private boolean state = false;
    private String message = null;
    private String code = null;
    private T data = null;

    public void setSuccesTrasaction(T data) {
        this.setMessage(Constants.MESSAGES.SUCCESS_TRANSACTION.getTag());
        this.setCode(Constants.MESSAGES.SUCCESS_TRANSACTION.getCode());
        this.setState(Boolean.TRUE);
        this.setData(data);
    }

    public void setSuccesTrasaction() {
        this.setMessage(Constants.MESSAGES.SUCCESS_TRANSACTION.getTag());
        this.setCode(Constants.MESSAGES.SUCCESS_TRANSACTION.getCode());
        this.setState(Boolean.TRUE);
    }

    public void setSuccesQuery(T data) {
        this.setMessage(Constants.MESSAGES.SUCCESSFUL_QUERY.getTag());
        this.setCode(Constants.MESSAGES.SUCCESSFUL_QUERY.getCode());
        this.setState(Boolean.TRUE);
        this.setData(data);
    }

    public void setSuccesQuery() {
        this.setMessage(Constants.MESSAGES.SUCCESSFUL_QUERY.getTag());
        this.setCode(Constants.MESSAGES.SUCCESSFUL_QUERY.getCode());
        this.setState(Boolean.TRUE);
    }

    public void setSuccessUpdate(T data) {
        this.setMessage(Constants.MESSAGES.SUCCESSFUL_UPDATE.getTag());
        this.setCode(Constants.MESSAGES.SUCCESSFUL_UPDATE.getCode());
        this.setState(Boolean.TRUE);
        this.setData(data);
    }

    public void setSuccessUpdate() {
        this.setMessage(Constants.MESSAGES.SUCCESSFUL_UPDATE.getTag());
        this.setCode(Constants.MESSAGES.SUCCESSFUL_UPDATE.getCode());
        this.setState(Boolean.TRUE);
    }

    public void setSuccessCreation(T data) {
        this.setMessage(Constants.MESSAGES.SUCCESSFUL_REGISTRATION.getTag());
        this.setCode(Constants.MESSAGES.SUCCESSFUL_REGISTRATION.getCode());
        this.setState(Boolean.TRUE);
        this.setData(data);
    }

    public void setSuccessCreation() {
        this.setMessage(Constants.MESSAGES.SUCCESSFUL_REGISTRATION.getTag());
        this.setCode(Constants.MESSAGES.SUCCESSFUL_REGISTRATION.getCode());
        this.setState(Boolean.TRUE);
    }

    public void setIncompleteData() {
        this.setMessage(Constants.MESSAGES.INCOMPLETE_DATA.getTag());
        this.setCode(Constants.MESSAGES.INCOMPLETE_DATA.getCode());
        this.setState(Boolean.FALSE);
    }

    public void setFailService() {
        this.setMessage(Constants.MESSAGES.SYSTEM_FAILURE.getTag());
        this.setCode(Constants.MESSAGES.SYSTEM_FAILURE.getCode());
        this.setState(Boolean.FALSE);
    }

    public void setFailUpdate() {
        this.setMessage(Constants.MESSAGES.FAIL_UPDATE.getTag());
        this.setCode(Constants.MESSAGES.FAIL_UPDATE.getCode());
        this.setState(Boolean.FALSE);
    }

    public void setFailUpdate(T data) {
        this.setMessage(Constants.MESSAGES.FAIL_UPDATE.getTag());
        this.setCode(Constants.MESSAGES.FAIL_UPDATE.getCode());
        this.setState(Boolean.FALSE);
        this.setData(data);
    }

    public void setFailQuery() {
        this.setMessage(Constants.MESSAGES.FAIL_QUERY.getTag());
        this.setCode(Constants.MESSAGES.FAIL_QUERY.getCode());
        this.setState(Boolean.FALSE);
    }

    public void setFailQuery(T data) {
        this.setMessage(Constants.MESSAGES.FAIL_QUERY.getTag());
        this.setCode(Constants.MESSAGES.FAIL_QUERY.getCode());
        this.setState(Boolean.FALSE);
        this.setData(data);
    }

    public void setFailRequestParams() {
        this.setMessage(Constants.MESSAGES.INCORRECT_REQUEST.getTag());
        this.setCode(Constants.MESSAGES.INCORRECT_REQUEST.getCode());
        this.setState(Boolean.FALSE);
    }

    public void setFailRequestParams(String message) {
        this.setMessage(message);
        this.setCode(Constants.MESSAGES.INCORRECT_REQUEST.getCode());
        this.setState(Boolean.FALSE);
    }

    public void setForbiddenAccess() {
        this.setMessage(Constants.MESSAGES.FORBIDDEN_ACCESS.getTag());
        this.setCode(Constants.MESSAGES.FORBIDDEN_ACCESS.getCode());
        this.setState(Boolean.FALSE);
    }

    public void setWrongCredentials() {
        this.setMessage(Constants.MESSAGES.UNAUTHORIZED_ACCESS.getTag());
        this.setCode(Constants.MESSAGES.UNAUTHORIZED_ACCESS.getCode());
        this.setState(Boolean.FALSE);
    }

    public void setDeclinedTrasaction(T data) {
        this.setMessage(Constants.MESSAGES.TRANSACTION_DECLINED.getTag());
        this.setCode(Constants.MESSAGES.TRANSACTION_DECLINED.getCode());
        this.setState(Boolean.FALSE);
        this.setData(data);
    }

    public void setDeclinedTransaction(String message) {
        this.setMessage(message);
        this.setCode(Constants.MESSAGES.TRANSACTION_DECLINED.getCode());
        this.setState(Boolean.FALSE);
    }

    public void setDeclinedTrasaction() {
        this.setMessage(Constants.MESSAGES.TRANSACTION_DECLINED.getTag());
        this.setCode(Constants.MESSAGES.TRANSACTION_DECLINED.getCode());
        this.setState(Boolean.FALSE);
    }

    public void setFailAgreement() {
        this.setMessage(Constants.MESSAGES.FAIL_QUERY_AGREEMENT_BDI.getTag());
        this.setCode(Constants.MESSAGES.FAIL_QUERY_AGREEMENT_BDI.getCode());
        this.setState(Boolean.FALSE);
    }

    public void setNoResultsFound() {
        this.setMessage(Constants.MESSAGES.NO_RESULTS_FOUND.getTag());
        this.setCode(Constants.MESSAGES.NO_RESULTS_FOUND.getCode());
        this.setState(Boolean.FALSE);
        this.setData(null);
    }

    public void setTimeOutConnection(T data) {
        this.setMessage(Constants.MESSAGES.TIME_OUT.getTag());
        this.setCode(Constants.MESSAGES.TIME_OUT.getCode());
        this.setState(Boolean.TRUE);
        this.setData(data);
    }

    public void setTimeOutConnection() {
        this.setMessage(Constants.MESSAGES.TIME_OUT.getTag());
        this.setCode(Constants.MESSAGES.TIME_OUT.getCode());
        this.setState(Boolean.TRUE);
    }

    public void setQuoteExpired() {
        this.setMessage(Constants.MESSAGES.REDIS_QUERY_ID_ERROR.getTag());
        this.setCode(Constants.MESSAGES.REDIS_QUERY_ID_ERROR.getCode());
        this.setState(Boolean.FALSE);
    }

    private static final long serialVersionUID = -4545344227922434810L;


}
