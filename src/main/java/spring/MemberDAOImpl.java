package spring;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO{
	private SqlSessionTemplate sqlSessionTemplate;
	public MemberDAOImpl(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	@Override
	public List<Member> list() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("list");
	}
	@Override
	public void insert(Member member) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.insert("insert", member);
	}

}
