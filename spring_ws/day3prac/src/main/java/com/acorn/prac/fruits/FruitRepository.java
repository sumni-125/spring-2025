package com.acorn.prac.fruits;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.prac.Member;

@Repository
public class FruitRepository {
	
	@Autowired
	SqlSession session;
	
	public List<Fruit> selectAll(){
		List<Fruit> list = session.selectList("com.acorn.FruitMapper.selectAll");
		return list;
	}
	
	public Fruit selectOne(String fruit_name) {
		Fruit f = session.selectOne("com.acorn.FruitMapper.selectOne", fruit_name);
		return f;
	}
	
	public int insert(Fruit f) {
		int result = session.insert("com.acorn.FruitMapper.insert", f);
		return result;
	}

	public int update(Fruit f) {
		int result = session.update("com.acorn.FruitMapper.update", f);
		return result;
	}

	public int deleteOne(String fruit_name) {
		return session.delete("com.acorn.FruitMapper.delete", fruit_name);
	}
	
	
}
