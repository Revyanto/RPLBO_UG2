package BEBAS;

public class UsernameException extends User{
    private int errCode;
    private String errMessage;
    public UsernameException(int errCode) {
        super();
        this.errCode = errCode;
        if (errCode==1){
            this.errMessage = "input username tidak boleh kososng";
        }
        else if(errCode==2){
            this.errMessage = "Username minimal harus terdiri dari 6 karakter";
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

