package com.miao;

/**
 * @ClassName OperatorEnum
 * @Description
 * @Author wangzhen
 * @Date 2018/11/14 下午5:31
 **/
public enum  OperatorEnum {
    EMPTY(-1,""),
    PLUS(0,"+"),
    LESS(1,"-"),
    MULTIPLY(2,"*"),
    EXCEPT(3,"/"),
    EQUAL(4,"="),
    GREATERTHAN(5,">"),
    LESSTHAN(6,"<")
    ;

    private int code;
    private String msg;

    OperatorEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    /**
     * 根据code获取msg
     * @param index
     * @return
     */
    public static String getMsgByCode(int index) {
        for (OperatorEnum c : OperatorEnum.values()) {
            if (c.getCode() == index) {
                return c.getMsg();
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
