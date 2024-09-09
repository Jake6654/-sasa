package enumeration.test.http;

public enum HttpsStatus {
    // enum class 의 필드(대문자)는 상수를
    OK(200,"OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private int code;
    private String message;

    HttpsStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    public boolean isSuccess(){
        return this.code >= 200 && this.code < 300;
    }

    public static HttpsStatus findByCode(int code){
        if (code == 200) {
            return HttpsStatus.OK;
        } else if (code == 400) {
            return HttpsStatus.BAD_REQUEST;
        } else if (code == 404) {
            return HttpsStatus.NOT_FOUND;
        } else if (code == 500) {
            return  HttpsStatus.INTERNAL_SERVER_ERROR;
        }else return null;

    }

}
