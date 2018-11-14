package com.miao;

/**
 * @ClassName TestEnum
 * @Description
 * @Author wangzhen
 * @Date 2018/11/14 下午5:32
 **/
public class TestEnum {
    public static void main(String[] args) {
        System.out.println(OperatorEnum.EQUAL.getMsg()); // =


        // 项目中的字符串分割
        String str = "ss<ccc";
        String [] array = new String[]{};
        String [] delimiter = {OperatorEnum.EQUAL.getMsg(),OperatorEnum.GREATERTHAN.getMsg(),OperatorEnum.LESSTHAN.getMsg()};
        for (int i = 0; i < delimiter.length; i++) {
            if(str.contains(delimiter[i])){
                array = str.split(delimiter[i]);
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
