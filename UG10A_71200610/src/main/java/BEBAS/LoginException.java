package BEBAS;

public class LoginException {
    private int errCode;
    private String errMessage;
    public LoginException(int errCode) {
        super();
        this.errCode = errCode;
        if (errCode==1){
            this.errMessage = "input usename tidak boleh kososng";
        }
        else if(errCode==2){
            this.errMessage = "input password tidak boleh kososng";
        }
        else if(errCode==3){
            this.errMessage = "Username dan password harus sesuai dengan object user yang dibuat ketika melakukan register";
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
