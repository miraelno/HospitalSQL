package com.solvd.hospital.models.documents;

public class ProcedureToBill {
    private int billId;
    private int procedureId;

    public ProcedureToBill() {
    }

    public ProcedureToBill(int billId, int procedureId) {
        this.billId = billId;
        this.procedureId = procedureId;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(int procedureId) {
        this.procedureId = procedureId;
    }

    @Override
    public String toString() {
        return "ProcedureToBill{" +
                "billId=" + billId +
                ", procedureId=" + procedureId +
                '}';
    }
}
