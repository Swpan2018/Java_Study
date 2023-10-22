package com.test.SqlTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SqlTest {
    public static void main(String[] args) throws ParseException {
        final String INSERT_INTO_SC_ORDERS_M = "insert into sc_orders_m (oid,tid, province_code, phone, status, platform, created_date, last_modified_date, goods_code, number_opr_type,biz_status )(SELECT oid,tid, province_code, phone, status, platform, created_date, last_modified_date, goods_code, number_opr_type ,biz_status FROM orders  where last_modified_date >= {startDate} AND last_modified_date < {endDate})";
        String sql = INSERT_INTO_SC_ORDERS_M;
        sql = sql.replace("{startDate}", "2023-10.19 or 1=1 ;#")
                .replace("{endDate}", "2023-10.20");
        System.out.println(sql);

        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.parse("1=1 or 2=2");


    }
}
