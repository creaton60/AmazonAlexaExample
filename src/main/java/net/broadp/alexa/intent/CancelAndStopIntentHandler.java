package net.broadp.alexa.intent;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import net.broadp.alexa.common.BasicCard;
import net.broadp.alexa.common.BasicResponse;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class CancelAndStopIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AMAZON.StopIntent").or(intentName("AMAZON.CancelIntent")));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = BasicResponse.CANCEL.getMessage();
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard(BasicCard.HELLO_WORLD.getCard(), speechText)
                .build();
    }
}
