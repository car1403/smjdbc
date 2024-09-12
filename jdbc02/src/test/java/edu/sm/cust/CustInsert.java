package edu.sm.cust;

import edu.sm.dto.Cust;
import edu.sm.service.CustService;

public class CustInsert {
    public static void main(String[] args) {
        CustService custService = new CustService();
        Cust cust = Cust.builder()
                .id("id88")
                .pwd("pwd88")
                .name("이말자")
                .build();

        try {
            custService.add(cust);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
