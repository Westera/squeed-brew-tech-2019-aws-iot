package lambdas;

import com.amazonaws.services.iotdata.AWSIotData;
import com.amazonaws.services.iotdata.AWSIotDataClientBuilder;
import com.amazonaws.services.iotdata.model.PublishRequest;
import com.amazonaws.services.iotdata.model.PublishResult;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import models.Sensor;

import java.nio.ByteBuffer;

public class SvensLillaLambda {
    public String svenHandler(Sensor payload, Context context) {
        return "Hello World!";
    }
}
