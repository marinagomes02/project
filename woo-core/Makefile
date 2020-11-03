JARNAME=woo-core

all:
	(cd src; javac -cp ../po-uuilib/po-uuilib.jar:../woo-core/woo-core.jar:../woo-app/woo-app.jar: -encoding UTF-8 `find . -name \*.java`)
	(cd src; jar cf ../$(JARNAME).jar `find . -name \*.class -o -name \*.java`)

clean:
	$(RM) $(JARNAME).jar `find . -name \*.class`
