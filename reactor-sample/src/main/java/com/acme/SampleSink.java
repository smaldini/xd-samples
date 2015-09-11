package com.acme;

import org.springframework.messaging.Message;
import org.springframework.xd.reactor.EnableReactorModule;
import org.springframework.xd.reactor.ReactiveOutput;
import org.springframework.xd.reactor.ReactiveProcessor;
import org.springframework.xd.reactor.ReactiveSink;
import reactor.core.reactivestreams.SubscriberFactory;
import reactor.core.reactivestreams.SubscriptionWithContext;
import reactor.fn.BiConsumer;
import reactor.rx.Stream;

/**
 * @author Stephane Maldini
 */
@EnableReactorModule
public class SampleSink implements ReactiveSink<Message> {

	@Override
	public void accept(Stream<Message> messageStream) {
		messageStream.subscribe(SubscriberFactory.unbounded(new BiConsumer<Message, SubscriptionWithContext<Void>>() {
			@Override
			public void accept(Message message, SubscriptionWithContext<Void> voidSubscriptionWithContext) {

			}
		}));
	}
}