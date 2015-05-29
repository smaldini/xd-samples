package com.acme;

import org.reactivestreams.Subscriber;
import org.springframework.messaging.Message;
import org.springframework.xd.reactor.EnableReactorModule;
import org.springframework.xd.reactor.ReactiveProcessor;
import reactor.fn.Supplier;
import reactor.rx.Stream;

/**
 * @author Stephane Maldini
 */
@EnableReactorModule(concurrency = 4)
public class Sample implements ReactiveProcessor<Message, Message> {

	@Override
	public void accept(Stream<Message> messageStream, Supplier<Subscriber<Message>> subscriberSupplier) {
		messageStream
				.subscribe(subscriberSupplier.get());
	}
}