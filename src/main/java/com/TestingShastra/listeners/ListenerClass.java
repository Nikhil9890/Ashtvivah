package com.TestingShastra.listeners;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.IClass;
import org.testng.IRetryAnalyzer;
import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.ITestOrConfiguration;
import org.testng.internal.ConstructorOrMethod;
import org.testng.xml.XmlTest;

public class ListenerClass implements ITestListener,ITestResult,ITestOrConfiguration,WebDriverListener {
	public void onFinish(ITestContext Result)
	{
	 
	}
	 
	public void onStart(ITestContext Result)
	{
	 
	}
	 
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result)
	{
	 
	}
	 
	// When Test case get failed, this method is called.
	public void onTestFailure(ITestResult Result)
	{
	System.out.println("The name of the testcase failed is :"+Result.getName());
	}
	 
	// When Test case get Skipped, this method is called.
	public void onTestSkipped(ITestResult Result)
	{
	System.out.println("The name of the testcase Skipped is :"+Result.getName());
	}
	 
	// When Test case get Started, this method is called.
	public void onTestStart(ITestResult Result)
	{
	System.out.println(Result.getName()+" test case started");
	}
	 
	// When Test case get passed, this method is called.
	public void onTestSuccess(ITestResult Result)
	{
	System.out.println("The name of the testcase passed is :"+Result.getName());
	}

	public Class getRealClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public ITestClass getTestClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTestClass(ITestClass cls) {
		// TODO Auto-generated method stub
		
	}

	public String getMethodName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	public long[] getInstanceHashCodes() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getGroupsDependedUpon() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMissingGroup() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMissingGroup(String group) {
		// TODO Auto-generated method stub
		
	}

	public String[] getBeforeGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getAfterGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getMethodsDependedUpon() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addMethodDependedUpon(String methodName) {
		// TODO Auto-generated method stub
		
	}

	public boolean isTest() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isBeforeMethodConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAfterMethodConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isBeforeClassConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAfterClassConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isBeforeSuiteConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAfterSuiteConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isBeforeTestConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAfterTestConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isBeforeGroupsConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAfterGroupsConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	public long getTimeOut() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setTimeOut(long timeOut) {
		// TODO Auto-generated method stub
		
	}

	public int getInvocationCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setInvocationCount(int count) {
		// TODO Auto-generated method stub
		
	}

	public int getSuccessPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(String id) {
		// TODO Auto-generated method stub
		
	}

	public long getDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setDate(long date) {
		// TODO Auto-generated method stub
		
	}

	public boolean canRunFromClass(IClass testClass) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAlwaysRun() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getThreadPoolSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setThreadPoolSize(int threadPoolSize) {
		// TODO Auto-generated method stub
		
	}

	public boolean getEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDescription(String description) {
		// TODO Auto-generated method stub
		
	}

	public void incrementCurrentInvocationCount() {
		// TODO Auto-generated method stub
		
	}

	public int getCurrentInvocationCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setParameterInvocationCount(int n) {
		// TODO Auto-generated method stub
		
	}

	public int getParameterInvocationCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setMoreInvocationChecker(Callable<Boolean> moreInvocationChecker) {
		// TODO Auto-generated method stub
		
	}

	public boolean hasMoreInvocation() {
		// TODO Auto-generated method stub
		return false;
	}

	public IRetryAnalyzer getRetryAnalyzer(ITestResult result) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setRetryAnalyzerClass(Class<? extends IRetryAnalyzer> clazz) {
		// TODO Auto-generated method stub
		
	}

	public Class<? extends IRetryAnalyzer> getRetryAnalyzerClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean skipFailedInvocations() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setSkipFailedInvocations(boolean skip) {
		// TODO Auto-generated method stub
		
	}

	public long getInvocationTimeOut() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean ignoreMissingDependencies() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setIgnoreMissingDependencies(boolean ignore) {
		// TODO Auto-generated method stub
		
	}

	public List<Integer> getInvocationNumbers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setInvocationNumbers(List<Integer> numbers) {
		// TODO Auto-generated method stub
		
	}

	public void addFailedInvocationNumber(int number) {
		// TODO Auto-generated method stub
		
	}

	public List<Integer> getFailedInvocationNumbers() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setPriority(int priority) {
		// TODO Auto-generated method stub
		
	}

	public int getInterceptedPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setInterceptedPriority(int priority) {
		// TODO Auto-generated method stub
		
	}

	public XmlTest getXmlTest() {
		// TODO Auto-generated method stub
		return null;
	}

	public ConstructorOrMethod getConstructorOrMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, String> findMethodParameters(XmlTest test) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getQualifiedName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAttribute(String name, Object value) {
		// TODO Auto-generated method stub
		
	}

	public Set<String> getAttributeNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object removeAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public int compareTo(ITestResult o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getStatus() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setStatus(int status) {
		// TODO Auto-generated method stub
		
	}

	public ITestNGMethod getMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] getParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setParameters(Object[] parameters) {
		// TODO Auto-generated method stub
		
	}

	public Throwable getThrowable() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setThrowable(Throwable throwable) {
		// TODO Auto-generated method stub
		
	}

	public long getStartMillis() {
		// TODO Auto-generated method stub
		return 0;
	}

	public long getEndMillis() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setEndMillis(long millis) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isSuccess() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getHost() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] getFactoryParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTestName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getInstanceName() {
		// TODO Auto-generated method stub
		return null;
	}

	public ITestContext getTestContext() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTestName(String name) {
		// TODO Auto-generated method stub
		
	}

	public boolean wasRetried() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setWasRetried(boolean wasRetried) {
		// TODO Auto-generated method stub
		
	}

	public String id() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		
	}

	public void setGroups(String[] groups) {
		// TODO Auto-generated method stub
		
	}

	public String[] getDependsOnGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDependsOnGroups(String[] groups) {
		// TODO Auto-generated method stub
		
	}

	public String[] getDependsOnMethods() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDependsOnMethods(String[] dependsOnMethods) {
		// TODO Auto-generated method stub
		
	}
	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		System.out.println("Before Alert Dismiss");
		
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		 System.out.println("Before Find By"+element);
		
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Before Click on"+element);
		
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("After Click on"+element);
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		 System.out.println("Before Change Value of"+element);
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("Before Change Value of"+windowName);
		
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {

		System.out.println("After Change Value of"+windowName);
	}

	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}

}

