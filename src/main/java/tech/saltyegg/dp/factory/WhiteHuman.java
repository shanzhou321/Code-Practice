/**
 * Copyright (c) 2015 hzhou, All rights reserved.
 */
package tech.saltyegg.dp.factory;

import org.apache.log4j.Logger;

/**
 * Description:
 *
 * @author hzhou
 */
public class WhiteHuman implements Human {

	private static final Logger log = Logger.getLogger(WhiteHuman.class);

	@Override
	public void getColor() {
		log.info("I am white");
	}

	@Override
	public void talk() {
		log.info("I like social");
	}
}