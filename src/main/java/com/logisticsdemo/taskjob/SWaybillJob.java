package com.logisticsdemo.taskjob;

import com.logisticsdemo.common.WaybillDate;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import javax.annotation.Resource;
import java.util.Date;

public class SWaybillJob implements Job {
    @Resource
    private WaybillDate waybillDate;
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        System.out.println(jobExecutionContext.getTrigger().getJobKey()+" quart定时任务"+new Date());
        waybillDate.check();
    }
}
