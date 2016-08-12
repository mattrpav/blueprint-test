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
        	        // Do testing here
    	}

	}
