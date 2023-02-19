# Path to Makefile and decompiler.jar (should be in the project root)
DECOMPILER_JAR := $(realpath $(dir $(lastword $(MAKEFILE_LIST))))/decompiler.jar
MAKEFILE := $(realpath $(firstword $(MAKEFILE_LIST)))

compile_scala:
	for file in *.scala; do \
		scalac "$$file"; \
	done

from_class_to_java:
	for file in *.class; do \
		java -jar $(DECOMPILER_JAR) "$$file" > "$${file%.class}.java"; \
	done

remove_non_source_files:
	find . -type f ! -name "*.scala" ! -name "*.java" -delete

convert_scala_to_java:
	$(MAKE) -f $(MAKEFILE) compile_scala 
	$(MAKE) -f $(MAKEFILE) from_class_to_java 
	$(MAKE) -f $(MAKEFILE) remove_non_source_files

convert_scala_to_java_for_dir:
	$(MAKE) -C $(DIR) -f $(MAKEFILE) convert_scala_to_java

convert_scala_to_java_all:
	for dir in */; do \
		$(MAKE) -C $$dir -f $(MAKEFILE) convert_scala_to_java; \
	done