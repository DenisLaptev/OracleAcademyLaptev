package HomeWork.Programming.Practice2.JUNIT_Calculator2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by lapte on 14.08.2016.
 */
public class TestSuiteRunner {

        public static void main(String[] args) {
            Result result = JUnitCore.runClasses(FeatureTestSuite.class);

        }

}
