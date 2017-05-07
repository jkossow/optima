package org.kossowski.integration;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.stereotype.Component;


@Component
public class TestChannelInterceptor implements ChannelInterceptor {

	@Override
	public void afterReceiveCompletion(Message<?> arg0, MessageChannel arg1, Exception arg2) {

	}

	@Override
	public void afterSendCompletion(Message<?> arg0, MessageChannel arg1, boolean arg2, Exception arg3) {
		// TODO Auto-generated method stub

	}

	@Override
	public Message<?> postReceive(Message<?> arg0, MessageChannel arg1) {
		// TODO Auto-generated method stub
		//System.out.println( arg0.getHeaders() );
		return arg0;
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
	public Message<?> preSend(Message<?> arg0, MessageChannel arg1) {
		// TODO Auto-generated method stub
		System.out.println("Intercepor: " +  arg0.getHeaders().entrySet().toString() );
		
		return arg0;
	}

}
