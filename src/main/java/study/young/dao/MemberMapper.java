package study.young.dao;

import java.util.List;
import study.young.entity.Member;

public interface MemberMapper {
    int deleteByPrimaryKey(Long memberId);

    int insert(Member record);

    Member selectByPrimaryKey(Long memberId);
    
    Member selectByNaturalKey(String memberAccount); 

    List<Member> selectAll();

    int updateByPrimaryKey(Member record);
}