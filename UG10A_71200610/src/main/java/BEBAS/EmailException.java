package BEBAS;

public class EmailException extends User{
    private int errCode;
    private String errMessage;
    public EmailException(int errCode) {
        super();
        this.errCode = errCode;
        if (errCode==1){
            this.errMessage = "input email tidak boleh kososng";
        }
        else if(errCode==2){
            this.errMessage = "Format email harus valid (cth:email@ukdw.com)";
        }
    }

    public PasswordException(String errorMessage){
        super(errorMessage);
    }

    public int getErrCode() {
        return errCode;
    }

    public String getErrMessage() {
        return errMessage;
    }
}

