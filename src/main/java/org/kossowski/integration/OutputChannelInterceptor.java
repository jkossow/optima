package org.kossowski.integration;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptor;

public class OutputChannelInterceptor implements ChannelInterceptor {

	@Override
	public void afterReceiveCompletion(Message<?> arg0, MessageChannel arg1, Exception arg2) {
	}

	@Override
	public void afterSendCompletion(Message<?> arg0, MessageChannel arg1, boolean arg2, Exception arg3) {
	}

	@Override
	public Message<?> postReceive(Message<?> arg0, MessageChannel arg1) {
		return null;
	}

	@Override
	public void postSend(Message<?> arg0, MessageChannel arg1, boolean arg2) {
	}

	@Override
	public boolean preReceive(MessageChannel arg0) {
		return false;
	}

	@Override
	public Message<?> preSend(Message<?> m, MessageChannel arg1) {
		System.out.println( "Output channel typ obiektu:" + m.getPayload().getClass().getName());
		System.out.println( m.getPayload() );
		return m;
	}
	
	
	

}
