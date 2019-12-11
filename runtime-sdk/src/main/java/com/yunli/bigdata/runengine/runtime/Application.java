package com.yunli.bigdata.runengine.runtime;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.apache.commons.cli.*;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/**
 * @author wangpengfei
 * @date 2019/12/5
 */
public class Application {
    private static final String CLASSNAME = "processor_class_name";
    private static final String CONF = "conf";
    public static void main(String[] args) {
        Options options = new Options();
        options.addOption(new Option(CLASSNAME, true, "qualified class name of the processor."));
        options.addOption(new Option(CONF, true, "A json map object, configurations of the processor."));
        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            if (!cmd.hasOption(CLASSNAME)) {
                System.err.println(CLASSNAME + " argument is not provided.");
                System.exit(11);
            }
            String className = cmd.getOptionValue(CLASSNAME);
            HashMap<String, Object> conf = null;
            if (cmd.hasOption(CONF)) {
                conf = new Gson().fromJson(cmd.getOptionValue(CONF), new TypeToken<HashMap<String, Object>>(){}.getType());
            }

            Class<?> clazz = Class.forName(className);
            Constructor<?> ctor = clazz.getConstructor();
            Processor processor = (Processor)ctor.newInstance();
            processor.init(conf);
            processor.main();
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
            System.exit(2);
        } catch (InstantiationException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
            System.exit(3);
        } catch (InvocationTargetException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
            System.exit(4);
        } catch (NoSuchMethodException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
            System.exit(5);
        } catch (IllegalAccessException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
            System.exit(6);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
            System.exit(7);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
            System.exit(8);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
            System.exit(9);
        }
    }
}
