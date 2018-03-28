package com.wmhou.chapter5.enumdemo;

/**
 * Description:
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date: 2018-03-25
 *
 * @author 侯伟民
 * @version 1.0
 */
public enum ProductStatusHasValueEnum {
    FINISH_PAY("已支付", 1), NOT_PAY("未支付", 2), FINISH_CONSIGNMENT("已发货", 3),
    NOT_CONSIGNMENT("未发货", 4), FINISI_RECIVE("已签收", 5), NOT_RECIVE("未签收", 6);

    private String status;
    private int index;

    ProductStatusHasValueEnum(String status, int index) {
        this.status = status;
        this.index = index;
    }



    public static String getStatus(int index) {
        for (ProductStatusHasValueEnum status : ProductStatusHasValueEnum.values()) {
            if (status.getIndex() == index) {
                return status.getStatus();
            }
        }
        return null;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    public static void main(String[] args) {
        int index = 2;
        String status = ProductStatusHasValueEnum.getStatus(index);
        System.out.println("index = " + index + "的商品状态是：" + status);

    }
}
