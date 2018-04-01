package com.wmhou.chapter5.enumdemo;
/**
 * Description:枚举表示：商品状态
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-03-17
 *
 * @author 侯伟民
 * @version 1.0
 */
public enum ProductStatusEnum {
    FINISH_PAY, NOT_PAY, FINISH_CONSIGNMENT,
    NOT_CONSIGNMENT, FINISI_RECIVE, NOT_RECIVE
}
class ProductStatusEnumMethods{
    public static void main(String[] args) {

        // 创建枚举类数组
        ProductStatusEnum[] status = new ProductStatusEnum[]{ProductStatusEnum.FINISH_PAY, ProductStatusEnum.NOT_PAY,
                ProductStatusEnum.FINISH_CONSIGNMENT, ProductStatusEnum.NOT_CONSIGNMENT,
                ProductStatusEnum.FINISI_RECIVE, ProductStatusEnum.NOT_RECIVE};

        for (int i = 0; i < status.length; i++){
            System.out.println("status[" + i + "].ordinal(): " + status[i].ordinal());
        }

        System.out.println("----------------------------------");

        //通过compareTo方法比较,实际上其内部是通过ordinal()值比较的
        System.out.println("status[0].compareTo(status[1]): " + status[0].compareTo(status[1]));
        System.out.println("status[0].compareTo(status[2]): " + status[0].equals(status[2]));

        Class<?> clazz = status[0].getDeclaringClass();
        System.out.println("clazz: " + clazz);

        System.out.println("----------------------------------");

        // name()
        System.out.println("status[0].name(): " + status[0].name());
        System.out.println("status[1].name(): " + status[1].name());

        //toString()
        System.out.println("status[2].toString(): " + status[2].toString());
        System.out.println("status[3].toString(): " + status[3].toString());

        System.out.println("----------------------------------");

        ProductStatusEnum statusEnum = Enum.valueOf(ProductStatusEnum.class, status[4].name());
        System.out.println("statusEnum：" + statusEnum);
    }
}

