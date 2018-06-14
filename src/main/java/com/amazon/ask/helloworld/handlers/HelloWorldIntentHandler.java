package com.amazon.ask.helloworld.handlers;
  
 import com.amazon.ask.dispatcher.request.handler.HandlerInput;
 import com.amazon.ask.dispatcher.request.handler.RequestHandler;
 import com.amazon.ask.model.Response;
 import com.amazon.ask.request.Predicates;

 import java.util.Optional;
  
 public class HelloWorldIntentHandler implements RequestHandler {
  
      @Override
      public boolean canHandle(HandlerInput input) {
         return input.matches(Predicates.intentName("HelloWorldIntent"));
      }
  
      @Override
      public Optional<Response> handle(HandlerInput input) {
          String speechText = "Hello Mira. this is appa. how are you doing?";
          return input.getResponseBuilder()
                  .withSpeech(speechText)
                  .withSimpleCard("HelloWorld", speechText)
                  .build();
      }
  
 }