package cn.com.djin.springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.com.djin.springboot.service.BaseService;

/**
 * 
 * @author djin
 *    基础控制器层
 * @param <T>
 */
public class BaseController<T> {

	//访问数据成功的常量
	protected static final Integer SUCCESSCODE = 0;
	//访问数据失败的常量
	protected static final Integer FAILCODE = 200;
	//访问数据失败的数据条数
	protected static final Integer FAILCOUNT = 0;
	//访问数据失败时的提示
	protected static final String FAILMSG = "数据访问失败！！！";
	//操作成功的常量
	protected static final String SUCCESS = "success";
	//操作失败的常量
	protected static final String FAIL = "fail";
	//操作异常的常量
	protected static final String ERROR = "error";
	
	//基础业务层对象
	@Autowired
	protected BaseService<T> baseService;

	/**
	 * 
	 * @param code  1 成功  0 失败  
	 * @param msg   消息内容
	 * @param count 最大条数
	 * @param data  具体内容
	 * @return
	 */
	public Map<String,Object> putMsgToJsonString(int code,String msg,int count ,Object data){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", code);
		map.put("msg", msg);
		map.put("count", count);
		map.put("data", data);
		return map;
	}

	/**
	 * 加载所有
	 */
	@ApiOperation(value = "查询所有", notes = "查询所有")
	@RequestMapping("/loadAll")
	@ResponseBody
	public List<T> loadAll(){
		List<T> list = new ArrayList<T>();
		try {
			return baseService.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 模糊查询
	 */
	@ApiOperation(value = "模糊查询",notes = "模糊查询")
	@RequestMapping("/loadObject")
	@ResponseBody
	public List<T> findObject(){
		try {
			return baseService.findObject();
		}catch ( Exception e){
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 根据主键id加载单个数据
	 */
	@ApiOperation(value = "根据主键查询", notes = "根据主键查询")
	@ApiImplicitParam(value = "主键id", name = "id", dataType = "int", paramType = "query")
	@RequestMapping("/loadTById")
	@ResponseBody
	public T loadTById(Integer id){
		try {
			return baseService.findTById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 加载（分页） 根据是否存在条件加载
	 */
	@ApiOperation(value = "根据是否存在条件分页查询", notes = "根据是否存在条件分页查询")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "page", value = "起始页码", defaultValue = "1", required = true, dataType = "int", paramType = "query"),
			@ApiImplicitParam(name = "limit", value = "每页记录条数", defaultValue = "10", required = true, dataType = "int", paramType = "query"),
	})
	@RequestMapping("/listByPramas")
	@ResponseBody
	public Map<String, Object> listByPramas(Integer page,Integer limit,T t){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			map = baseService.findListByPramas(page, limit, t);
			map.put("code", SUCCESSCODE);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return putMsgToJsonString(FAILCODE,FAILMSG,FAILCOUNT,null);
		}
	}

	/**
	 * 加载（分页） 根据是否存在条件加载
	 */
	@ApiOperation(value = "根据是否存在条件分页查询（常用）", notes = "根据是否存在条件分页查询（常用）")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "page", value = "起始页码", defaultValue = "1", required = true, dataType = "int", paramType = "query"),
			@ApiImplicitParam(name = "limit", value = "每页记录条数", defaultValue = "10", required = true, dataType = "int", paramType = "query")
	})
	@RequestMapping("/pageByPramas")
	@ResponseBody
	public PageInfo<T> pageByPramas(Integer page, Integer limit, T t){
		try {
			return baseService.findPageByPramas(page,limit,t);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 根据条件查询单个结果
	 * 
	 */
	@ApiOperation(value = "根据条件查询单个数据", notes = "根据条件查询单个数据")
	@RequestMapping("/loadObjectByPramas")
	@ResponseBody
	public T loadObjectByPramas(T t){
		try {
			return baseService.findObjectByPramas(t);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}

	//获取表的数据记录条数
	@ApiOperation(value = "根据条件获取数据条数", notes = "根据条件获取数据条数")
	@RequestMapping("/getTotalByPramas")
	@ResponseBody
	public Long getTotalByPramas(T t){
		try {
			return baseService.getTotalByPramas(t);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	};
	
	/**
	 * 根据条件删除
	 * 
	 */
	@ApiOperation(value = "根据条件删除数据", notes = "根据条件删除数据")
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(T t){
		try {
			return baseService.remove(t);
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	
	/**
	 * 批量删除
	 */
	@ApiOperation(value = "根据主键id批量删除", notes = "根据主键id批量删除")
	@ApiImplicitParam(value = "主键id数组参数", name = "ids", required = true, paramType = "delete")
	@RequestMapping("/deletes")
	@ResponseBody
	public String deletes(Integer[] ids){
		try {
			return baseService.removeBatch(ids);
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		
	}
	
	/**
	 * 添加
	 */
	 @ApiOperation(value = "添加数据", notes = "添加数据")
	 @RequestMapping("/saveT")
	 @ResponseBody
	 public String saveT(T entity){
		try {
			return baseService.save(entity);
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}	 
	 }
	 
	 /**
	 * 修改
	 */
	 @ApiOperation(value = "修改数据", notes = "修改数据")
	 @RequestMapping("/updT")
	 @ResponseBody
	 public String updT(T entity){
		try {
			return baseService.upd(entity);
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}	 
	 }
	
}
