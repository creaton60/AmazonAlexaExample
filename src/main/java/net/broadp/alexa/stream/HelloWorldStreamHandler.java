package net.broadp.alexa.stream;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import net.broadp.alexa.LaunchRequestHandler;
import net.broadp.alexa.SessionEndedRequestHandler;
import net.broadp.alexa.intent.CancelAndStopIntentHandler;
import net.broadp.alexa.intent.FallbackIntentHandler;
import net.broadp.alexa.intent.HelloWorldIntentHandler;
import net.broadp.alexa.intent.HelpIntentHandler;

public class HelloWorldStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelAndStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new FallbackIntentHandler()
                ).build();
    }

    public HelloWorldStreamHandler() {
        super(getSkill());
    }
}
