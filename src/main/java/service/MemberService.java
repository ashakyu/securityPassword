package service;

import java.util.List;

import spring.Member;

public interface MemberService {
	public abstract List<Member> list();
	public abstract void write(Member member);
}
