package TestCase;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransform implements IAnnotationTransformer {
	@Override
	public void transform(ITestAnnotation annotation,Class testclass,
			Constructor testconstructor, Method testmethod) {
			annotation.setRetryAnalyzer(MyRetry.class);{
			
				
				annotation.setRetryAnalyzer(MyRetry.class);
			}

}
}

















//annotation,Class testclass,
//Constructor testconstructor, Method testmethod) {
//annotation.setRetryAnalyzer(MyRetry.class);