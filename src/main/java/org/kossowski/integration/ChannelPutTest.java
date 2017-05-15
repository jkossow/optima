package org.kossowski.integration;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public class ChannelPutTest {

	@Autowired
	@Qualifier("chChainsOut")
	protected MessageChannel ch;
	
	public void dummy() {
		
	}
}
