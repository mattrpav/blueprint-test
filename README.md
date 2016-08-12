# blueprint-test
A library for running OSGi blueprint files in unit tests


	import org.junit.Test;
	import com.mediadriver.osgi.blueprint.test.BlueprintTestSupport;

	public class BlueprintBeanRouteTest extends BlueprintTestSupport {
	
    	@Override
    	protected String getBlueprintDescriptor() {
        	return "/OSGI-INF/blueprint/blueprint-bean.xml";
    	}

    	@Test
    	public void testBlueprint() throws Exception {
    		Hello helloService = BlueprintHelper.getOsgiService(getBundleContext(), Hello.class);
    	
    		for(int i=0; i < 10; i++) {
    			System.out.println("\t\t hello says: " + helloService.hello());
    		}
    	}
	}


References:

Created an issue with Apache Aries to contribute the library back into Apache Aries upstream: https://issues.apache.org/jira/browse/ARIES-1592
