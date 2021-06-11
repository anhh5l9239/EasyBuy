import cn.yunhe.dao.NewsDao;
import cn.yunhe.entity.News;
import cn.yunhe.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

public class ceshi {
    @Test
  public  void test(){
      SqlSession sqlSession = SqlSessionFactoryUtil.getSession();
      NewsDao newsDao= sqlSession.getMapper(NewsDao.class);
        List<News> list= newsDao.getAllNews();
      System.out.println(list.size());
  }



}
