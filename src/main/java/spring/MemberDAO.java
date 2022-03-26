package spring;

import java.util.List;

public interface MemberDAO {
	public List<Member> list();
	public void insert(Member member);
	
}
