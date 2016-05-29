COMPILADOR = javac
EXECUTADOR = java
DOCUMENTADOR = javadoc
DIR_FONTES = src/
DIR_BINARIO = bin/
DIR_DOCUMENTACAO = Javadoc/
DIR_EXTERN_JAR = /home/rodrigo/Dropbox/UnB/UnB\ 2016.1/ICS/Trabalhos/*.jar
TAGS_DOCUMENTACAO = -author -version
TAGS_MEMORIA = -Xms1024M -Xmx1624M
ARQ_PRINCIPAL = principal.Principal

compilar: clear
	$(COMPILADOR) -d $(DIR_BINARIO) -cp $(DIR_EXTERN_JAR) -sourcepath $(DIR_FONTES):. $(DIR_FONTES)*/*.java
	
executar: compilar
	clear	
	$(EXECUTADOR) $(TAGS_MEMORIA) -cp $(DIR_BINARIO) $(ARQ_PRINCIPAL)
	
documentar: compilar
	clear
	$(DOCUMENTADOR) -d $(DIR_DOCUMENTACAO) -sourcepath $(DIR_FONTES):. $(DIR_FONTES)principal/*.java -docencoding UTF-8 $(TAGS_DOCUMENTACAO)

clear:
	rm -rf $(DIR_BINARIO)/*
	rm -rf $(DIR_DOCUMENTACAO)/
	clear


