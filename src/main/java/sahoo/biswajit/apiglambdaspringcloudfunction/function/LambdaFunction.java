package sahoo.biswajit.apiglambdaspringcloudfunction.function;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import sahoo.biswajit.apiglambdaspringcloudfunction.models.ResponseMessage;

@Component
public class LambdaFunction implements Function<String, ResponseMessage> {
	
	private final Logger LOGGER = LoggerFactory.getLogger(LambdaFunction.class);

	@Override
	public ResponseMessage apply(String payload) {
		
		LOGGER.info("Got a request with payload :: {}", payload);
		
		ResponseMessage responseMessage = new ResponseMessage(200, "Echo Payload : " + payload);
		
		LOGGER.info("Returning response Status Code :: {}, Message :: {}", 
				responseMessage.getStatusCode(), responseMessage.getMessage());
		
		return responseMessage;
	}

}
