package com.amazon.ask.helloworld.handlers;
  
 import com.amazon.ask.dispatcher.request.handler.HandlerInput;
 import com.amazon.ask.dispatcher.request.handler.RequestHandler;
 import com.amazon.ask.model.Response;
 import com.amazon.ask.request.Predicates;
import com.amazonaws.AmazonClientException;
import com.amazonaws.lambda.demo.TestContext;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

import java.util.Optional;
  
 public class TimerIntentHandler implements RequestHandler {
  
      @Override
      public boolean canHandle(HandlerInput input) {
         return input.matches(Predicates.intentName("TimerIntent"));
      }
  
      @Override
      public Optional<Response> handle(HandlerInput input) {
          String speechText = "Setting Timer to 30 secs"; 
          return input.getResponseBuilder()
                  .withSpeech(speechText)
                  .withSimpleCard("TimerIntent", speechText)
                  .build();
      }
  
 }