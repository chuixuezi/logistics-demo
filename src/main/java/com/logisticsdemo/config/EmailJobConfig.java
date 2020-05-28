package com.logisticsdemo.config;

import com.logisticsdemo.taskjob.SWaybillJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling  //激活自动调度
public class EmailJobConfig {
    @Bean
    public JobDetail myJobDetail(){
        JobDetail jobDetail = JobBuilder.newJob(SWaybillJob.class)
                .withIdentity("myJob1", "myJobGroup1")
                //JobDataMap可以给任务execute传递参数
                //.usingJobData
                .storeDurably()
                .build();
        return jobDetail;
    }

    @Bean
    public Trigger myTrigger(){
        Trigger trigger = TriggerBuilder.newTrigger()
                .forJob(myJobDetail()) //把任务详情告诉触发器
                //.usingJobData("job_trigger_param","job_trigger_param1")
                .startNow()
                //使用简单触发器来设置调度规则
//                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2)
                //.repeatForever())
                //使用cron表达式来设置调度规则
                //.withSchedule(CronScheduleBuilder.cronSchedule("0 0 1 * * ?"))//每天凌晨执行一次
                .withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ?"))//每隔两秒执行一次
//                .withSchedule(CronScheduleBuilder.cronSchedule("0 0/5 * * * ?"))//每隔五分钟执行一次
                //每月5号 17号 25号 8点到12点之间每隔一个小时执行一次
//                .withSchedule(CronScheduleBuilder.cronSchedule("0/2 17-18 5,17,25 * ?"))
                .build();
        return trigger;
    }
}
