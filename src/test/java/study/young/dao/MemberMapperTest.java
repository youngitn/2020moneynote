package study.young.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import org.junit.Assert;
import study.young.app.MoneynoteApplication;
import study.young.entity.Member;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { MoneynoteApplication.class })
@Transactional
public class MemberMapperTest {

	@Autowired
	private MemberMapper mapper;

	// 資料庫的moneynote.member資料表會發現並沒有資料，因為剛才的新增動作已經被rollback了。
	// 這是因為設定Spring的@Transactional搭配@Rollback
	// annotation的效果。
	// 你可試著把@Transactional拿掉，便會發現交易不會被rollback，因此在資料表中可以看到新增的資料。
	@Test
	@Rollback
	public void testInsert() {
		Member member = new Member();
		member.setMemberAccount("john@abc.com");
		member.setMemberName("John");
		member.setMemberPassword("12345");
		member.setMemberStatus("1");

		mapper.insert(member); // 新增member
		Member result = mapper.selectByNaturalKey(member.getMemberAccount()); // 查詢member
		Assert.assertEquals(result.getMemberAccount(), member.getMemberAccount()); // 斷言相同
	}

}
