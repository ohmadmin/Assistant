package com.amazonaws.lambda.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazon.ask.helloworld.handlers.HelloWorldStreamHandler;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.util.StringInputStream;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class HelloWorldStreamHandlerTest {

    private static Object input;

    @BeforeClass
    public static void createInput() throws IOException {
        // TODO: set up your sample input object here.
        input = null;
    }

    private Context createContext() {
        TestContext ctx = new TestContext();

        // TODO: customize your context here if needed.
       // ctx.setFunctionName("Your Function Name");
        ctx.setFunctionName("handle");

        return ctx;
    }

    @Test
    public void testHelloworld() {
    	HelloWorldStreamHandler handler = new HelloWorldStreamHandler();
    	String output = "";
    	//handler.canHandle(HandlerInput.input);
    	try {
    	 StringInputStream inputStream = new StringInputStream(TestData.getRequestContent());
         ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    	Context ctx = createContext();
    	handler.handleRequest(inputStream, outputStream, ctx);
    	output = outputStream.toString();
    	System.out.println("optional output..."+output);
    	}
    	catch (IOException e) {
            e.printStackTrace();
        }
    	Assert.assertNotNull(output);      
    }
    
}
