package com.yunli.bigdata.eventbus.example.runtime;

import com.yunli.bigdata.eventbus.apis.common.Common;
import com.yunli.bigdata.runengine.runtime.Processor;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

/**
 * @author wangpengfei
 * @date 2019/12/7
 */

/**
 * this processor assumes Event.data is some csv lines, it log down bad records(units sold, index = 4, less than 1000)
 * but forwards all records as they are. you can change this behavior by modifying process method.
 * schema of Financial Sample:
 *  Segment,Country,Product,Discount Band,Units Sold,Manufacturing Price,Sale Price,Gross Sales,Discounts,Sales,COGS,Profit,Date,Month Number,Month Name,Year
 */
public class CsvProcessor extends Processor {
    public static final String BAD_RECORDS_DUMP_FILE = "bad-records-dump-file";
    private CSVPrinter badRecords;

    @Override
    public void init(Map<String, Object> conf) throws Exception {
        badRecords = new CSVPrinter(Files.newBufferedWriter(Paths.get(conf.getOrDefault(BAD_RECORDS_DUMP_FILE, "bad.dat").toString())),
                CSVFormat.DEFAULT);
    }

    @Override
    protected void process(Common.Event event) throws Exception {
        System.err.println("CsvProcessor.process - " + event);
        String csv = event.getData().toStringUtf8();
        for (CSVRecord record : CSVParser.parse(csv, CSVFormat.DEFAULT)) {
            if (Double.parseDouble(record.get(4)) < 1000) {
                badRecords.printRecord(record);
            }
        }
        badRecords.flush();
        collector.collect(event);
    }
}
