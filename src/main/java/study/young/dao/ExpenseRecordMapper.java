package study.young.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import study.young.entity.ExpenseRecord;

public interface ExpenseRecordMapper {
    int deleteByPrimaryKey(@Param("expenseId") Long expenseId, @Param("memberMemberId") Long memberMemberId);

    int insert(ExpenseRecord record);

    ExpenseRecord selectByPrimaryKey(@Param("expenseId") Long expenseId, @Param("memberMemberId") Long memberMemberId);

    List<ExpenseRecord> selectAll();

    int updateByPrimaryKey(ExpenseRecord record);
}