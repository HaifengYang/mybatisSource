package yang.mybatis.simple.dao;

import java.util.List;

import yang.mybatis.simple.model.Country;

public interface CountryMapper {
   List<Country> selectAll();
}
