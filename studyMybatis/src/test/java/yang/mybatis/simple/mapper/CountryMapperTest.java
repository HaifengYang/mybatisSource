package yang.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import yang.mybatis.simple.model.Country;

import java.util.List;

/**
 * @Title: yang.mybatis.simple.mapper.CountryMapperTest
 * @Package: yang.mybatis.simple.mapper
 * @Description:
 * @author: Haifeng Yang
 * @date Date: 2020年07月03日 11:03
 */
public class CountryMapperTest extends BaseMapperTest{
   private static SqlSessionFactory sqlSessionFactory;


   @Test
   public void selectAllTest(){
      try (SqlSession sqlSession = getSqlSession()) {
         List<Country> countries = sqlSession.selectList("yang.mybatis.simple.dao.CountryMapper.selectAll");
         printCountList(countries);
      }
   }

   private void printCountList(List<Country> countries) {
      for (Country country: countries) {
         System.out.printf("%-4d%4s%4s\n", country.getId(), country.getCountryName(), country.getCountryCode());
      }
   }
}
