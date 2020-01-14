package study.young.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExpenseRecord {
    private Long expenseId;

    private Long memberMemberId;

    private String expenseItem;

    private Integer expenseAmount;

    private LocalDate expenseDate;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    public Long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Long expenseId) {
        this.expenseId = expenseId;
    }

    public Long getMemberMemberId() {
        return memberMemberId;
    }

    public void setMemberMemberId(Long memberMemberId) {
        this.memberMemberId = memberMemberId;
    }

    public String getExpenseItem() {
        return expenseItem;
    }

    public void setExpenseItem(String expenseItem) {
        this.expenseItem = expenseItem;
    }

    public Integer getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(Integer expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public LocalDate getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(LocalDate expenseDate) {
        this.expenseDate = expenseDate;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}