package com.acme;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.reactivestreams.Publisher;
import org.springframework.xd.reactor.Processor;
import reactor.rx.Stream;

/**
 * @author Stephane Maldini
 */
public class Sample implements Processor<Object, Object> {
	@Override
	public Publisher<Object> process(Stream<Object> inputStream) {
		return inputStream;
	}
}