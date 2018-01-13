package com.infotech.clients;

import com.infotech.workers.MyThread;
import com.infotech.workers.MyThreadGroup;
/* This example demonstrates use of Thread Group exception handler
 * @author Kishan
 */
public class ThreadGroupUncaughtExceptionHandlerTest {

	public static void main(String[] args) {
		MyThreadGroup myThreadGroup = new MyThreadGroup("MyThreadGroup");
		
		// Create a thread and assign it to myThreadGroup
		Thread t1 = new Thread(myThreadGroup,new MyThread(), "T1");
		t1.start();
	}
}
