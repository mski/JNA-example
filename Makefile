dollar.so: c_src/dollar.c c_src/dollar.h
	gcc -Wall -shared -c -o $@ $<

clean:
	-rm lib/*.so

