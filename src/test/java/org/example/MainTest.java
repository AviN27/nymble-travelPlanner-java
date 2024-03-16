package org.example;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;
import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.engine.discovery.PackageSelector;

public class MainTest {

    /**
     * This class can be used to execute all the test cases.
     * The output will be displayed in the console.
     */
    public static void main(String[] args) {

        Launcher launcher = LauncherFactory.create();

        SummaryGeneratingListener listener = new SummaryGeneratingListener();

        PackageSelector packageSelector = DiscoverySelectors.selectPackage("org.example");

        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(packageSelector)
                .build();

        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);

        TestExecutionSummary summary = listener.getSummary();
        System.out.println("__________________________________________________");
        System.out.println("                 Test case summary");
        System.out.println("__________________________________________________");
        System.out.println(summary.getTestsFoundCount() + " tests found.");
        System.out.println(summary.getTestsSucceededCount() + " tests passed.");
        System.out.println(summary.getTestsFailedCount() + " tests failed.");
        System.out.println("__________________________________________________");
        System.out.println("__________________________________________________");

    }
}
