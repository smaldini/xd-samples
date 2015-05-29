package com.acme;

import org.springframework.context.annotation.Import;
import org.springframework.xd.rxjava.Processor;
import rx.Observable;

/**
 * @author Stephane Maldini
 */
public class Sample implements Processor<Object, Object> {
	@Override
	public Observable<Object> process(Observable<Object> inputStream) {
		return inputStream;
	}
}