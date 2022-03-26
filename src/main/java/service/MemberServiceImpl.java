package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.Member;
import spring.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	public MemberDAO memberDao;

	@Override
	public List<Member> list() {
		// TODO Auto-generated method stub
		return memberDao.list();
	}

	@Override
	public void write(Member member) {
		// TODO Auto-generated method stub
		memberDao.insert(member);
	}
	
	
}
