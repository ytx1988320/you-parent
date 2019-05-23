package com.you.you.page.server.consul.exception;

import com.you.you.page.common.dto.result.Result;
import com.you.you.page.common.dto.result.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	/**
	 * 自定义异常处理
	 * @param req
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value = GlobalException.class)
    @ResponseBody
    public Result jsonErrorHandler(HttpServletRequest req, GlobalException e) throws Exception {
		logger.error("error:", e);
		Result r = Result.create();
        r.fail(ResultCode.SYSTEM_ERROR.getCode(),ResultCode.SYSTEM_ERROR.getMessage());
        r.setData(null);
        return r;
    }
	/**
	 * 自定义异常处理
	 * @param req
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value = AuthException.class)
	@ResponseBody
	public Result jsonErrorHandler(HttpServletRequest req, AuthException e) throws Exception {
		logger.error("error:", e);
		Result r = Result.create();
		r.fail(ResultCode.AUTH_ERROR.getCode(),e.getMsg());
		r.setData(null);
		return r;
	}

	/**
	 * 自定义异常处理
	 * @param req
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value = ServiceException.class)
	@ResponseBody
	public Result jsonErrorHandler(HttpServletRequest req, ServiceException e) throws Exception {
		logger.error("error:", e);
		Result r = Result.create();
		r.fail(ResultCode.DATA_ERROR.getCode(),e.getMessage());
		r.setData(null);
		return r;
	}


	/**
	 * 系统异常处理，比如：404,500
	 * @param req
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
		logger.error("error:", e);
		Result r = Result.create();
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
			r.fail(ResultCode.UNKNOWN_ERROR.getCode(),ResultCode.UNKNOWN_ERROR.getMessage());
		} else {
			r.fail(ResultCode.SYSTEM_ERROR.getCode(),ResultCode.SYSTEM_ERROR.getMessage());
		}
        r.setData(null);
        return r;
    }
}
