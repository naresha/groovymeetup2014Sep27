class MyClass implements Runnable{
	public void run(){
		println "Hello"
	}
}

new Thread({ println "hello from Thread"}).start()

