package org.kossowski.integration;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.messaging.support.MessageBuilder;

public class PostTranformationChannelInterceptor implements ChannelInterceptor {

	
	
	@Override
	public void afterReceiveCompletion(Message<?> arg0, MessageChannel arg1, Exception arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSendCompletion(Message<?> arg0, MessageChannel arg1, boolean arg2, Exception arg3) {
		// TODO Auto-generated method stub

	}

	@Override
	public Message<?> postReceive(Message<?> arg0, MessageChannel arg1) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void postSend(Message<?> arg0, MessageChannel arg1, boolean arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preReceive(MessageChannel arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Message<?> preSend(Message<?> m, MessageChannel arg1)  {
		// TODO Auto-generated method stub
		
		
		
		System.out.println( "Kanal - obiekt wejsciowy "  + m.getPayload().getClass() );
		
		return MessageBuilder.withPayload(  m.getPayload().toString()  ).
				setHeader("typ", "APP").
				setHeader("ident", "2").build();
	}

}
