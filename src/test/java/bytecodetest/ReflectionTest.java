package bytecodetest;

import java.lang.reflect.Constructor;
import java.util.HashMap;

import org.junit.Test;

import com.blazebit.persistence.view.entity.Person;
import com.blazebit.persistence.view.proxy.model.UnsafeDocumentClassView;
import com.blazebit.persistence.view.proxy.model.UnsafeDocumentClassView_$$_javassist_entityview_0;
import com.blazebit.persistence.view.proxy.model.UnsafeDocumentClassView_$$_javassist_entityview_0_unsafe;

import bytecodetest.SunReflectionFactoryHelper;

public class ReflectionTest {
    
	@Test
    public void test() throws Exception {
        Constructor<UnsafeDocumentClassView> c1 = (Constructor<UnsafeDocumentClassView>) (Constructor<?>) SunReflectionFactoryHelper.newConstructorForSerialization(UnsafeDocumentClassView_$$_javassist_entityview_0.class, UnsafeDocumentClassView_$$_javassist_entityview_0_unsafe.class.getDeclaredConstructors()[0]);
        c1.setAccessible(true);
        UnsafeDocumentClassView o1 = c1.newInstance(getValues("B"));
    }

	public static Object[] getValues(String type) {
		return new Object[] { Long.valueOf(1L), new HashMap<>(), new Person("p1"), new Person("p2"), "doc", Long.valueOf(10L), Integer.valueOf(2) };
	}
}
