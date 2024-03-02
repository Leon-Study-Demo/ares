package jp.tokyo.leon.cloud.exception;

import jp.tokyo.leon.cloud.response.ResponseResult;
import jp.tokyo.leon.cloud.response.ReturnCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author leon
 * @date 2024/3/2 17:33
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseResult<String> runtimeException(Exception e) {
        log.error("error", e);
        return ResponseResult.fail(ReturnCodeEnum.RC500.getCode(), e.getMessage());
    }
}
