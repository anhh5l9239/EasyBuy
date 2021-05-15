package cn.yunhe.util;

/**
 * 分页工具类
 */
public class PageUtil {
    public static final int PAGE_SIZE = 3;   //每页显示的条数

    /**
     * 计算总页数
     *
     * @param totalDatas
     * @return
     */
    public static int getTotalPages(int totalDatas) {
        return totalDatas % PAGE_SIZE == 0 ? totalDatas / PAGE_SIZE : totalDatas / PAGE_SIZE + 1;

    }

}
