package jp.tokyo.leon.cloud.resp;

import lombok.Data;
import lombok.experimental.Accessors; /**
 * @author leon
 * @date 2024/3/2 17:22
 */
@Data
@Accessors(chain = true)
public class ResponseResult<T> {

    private String code;

    private String message;

    private T data;

    private long timestamp ;


    public ResponseResult (){
        this.timestamp = System.currentTimeMillis();
    }

    public static <T> ResponseResult<T> success(T data) {
        ResponseResult<T> resultData = new ResponseResult<>();
        resultData.setCode(ReturnCodeEnum.RC200.getCode());
        resultData.setMessage(ReturnCodeEnum.RC200.getMessage());
        resultData.setData(data);
        return resultData;
    }

    public static <T> ResponseResult<T> fail(String code, String message) {
        ResponseResult<T> resultData = new ResponseResult<>();
        resultData.setCode(code);
        resultData.setMessage(message);
        return resultData;
    }
}









