package com.acme;

import org.springframework.messaging.Message;
import org.springframework.xd.reactor.EnableReactorModule;
import org.springframework.xd.reactor.ReactiveOutput;
import org.springframework.xd.reactor.ReactiveProcessor;
import reactor.rx.Stream;

/**
 * @author Stephane Maldini
 */
@EnableReactorModule
public class Sample implements ReactiveProcessor<Message, Message> {

	@Override
	public void accept(Stream<Message> messageStream, ReactiveOutput<Message> output) {
		output.writeOutput(messageStream);
	}
}