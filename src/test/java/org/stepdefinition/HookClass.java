package org.stepdefinition;

import org.base.BaseClass;
import org.junit.After;
import org.junit.Before;

public class HookClass extends BaseClass {
	@Before
//pre
	private void Precondition() {
		browserlaunch();
		Windowmaximize();

	}

	@After
//post
	private void Postcondition() {
		closeEntireBrowser();
	}

}
