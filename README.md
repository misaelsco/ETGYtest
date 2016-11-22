# **FAST**

**Documento de configuração de ambiente de desenvolvimento**


| **AUTOR** | **VERSÃO** | **DATA** | **COMENTÁRIOS** |
| --- | --- | --- | --- |
| Dimas | 1.0 | 07/11/2016 | Criação do documento |
| Misael | 1.1 | 17/11/2016 | Inclusão de links e screenshot |
| Madeira | 1.2 | 17/11/2016 | Variáveis de ambiente |




* [Introdução] (#Introducao)
* [AWS](#AWS)
**GIT**  
**JAVA**  
**MAVEN**  
**DOCKER**  
**ECLIPSE**  
**TFS no Eclipse**  


# Introdução #

Este guia tem como objetivo apresentar os procedimentos necessários para configurar a estação de trabalho de desenvolvimento.

----

# AWS
~~1. Configurar conexão com o AWS~~
~~2. URL para trocar senha: [https://alelofast.signin.aws.amazon.com/console](https://alelofast.signin.aws.amazon.com/console)~~


----
	
# GIT #
  1. [https://github.com/git-for-windows/git/releases/tag/v2.10.1.windows.1](https://github.com/git-for-windows/git/releases/tag/v2.10.1.windows.1)
  2. Instalar o Git 2.10.1  
  ![Imagem 1](../DevEnvironmentConfigImages/GIT1.png)  
  ![Imagem 2](../DevEnvironmentConfigImages/GIT2.png)  
  ![Imagem 3](../DevEnvironmentConfigImages/GIT3.png)  
  ![Imagem 4](../DevEnvironmentConfigImages/GIT4.png)  
  ![Imagem 5](../DevEnvironmentConfigImages/GIT5.png)
  3. Desmarcar a opção "Enable Git Credencial Manager"  
  ![Imagem 6](../DevEnvironmentConfigImages/GIT6.png)
  
----

# JAVA #
  1. Instalar **java 1.8 - jdk-8u112-windows-x64**
  2. Configurar variáveis de ambiente:
    1. **JAVA\_HOME** : C:\Program Files\Java\jdk1.8.0\_112
    2. **JDK\_HOME**  : %JAVA\_HOME%
    3. **JRE\_HOME**  : %JAVA\_HOME%\jre
    4. **CLASSPATH** : .;%JAVA\_HOME%\lib;%JAVA\_HOME%\jre\lib
    5. **PATH**      : your-unique-entries;%JAVA\_HOME%\bin
  3. Após configurar abra um terminal e digite 'java -version'  
  ![Imagem 7](../DevEnvironmentConfigImages/JAVA1.png)
  
  ----
  
  # MAVEN #
  1. Baixe o [Maven!][maven]. 
  2. Instalar maven 3.3.9 no diretório c:\apps  
  ![Imagem 8](../DevEnvironmentConfigImages/MAVEN1.png)
  3. Configurar as variáveis de ambiente do Maven:
    1. **M2_HOME** :C:\apps\apache-maven-3.3.9
    2. **M2** : %M2_HOME%\bin
    3. **MAVEN_OPTS** : -Xms256m –Xmx512m
    4. **PATH** :your-unique-entries; %M2%
  4. Após configurar abra um terminal e digite mvn -version  
  ![Imagem 9](../DevEnvironmentConfigImages/MAVEN2.png)

[maven]: http://ftp.unicamp.br/pub/apache/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.zip

----

# DOCKER #

  1. Baixar o docker em [Docker!][Docker] 
  2. Extrair o zip DockerToolbox-1.12.2.zip  
  ![Imagem 10](../DevEnvironmentConfigImages/DOCKER1.png)
  3. Instalar o Docker em *C:\Program Files\Docker Toolbox  
  ![Imagem 11](../DevEnvironmentConfigImages/DOCKER2.png)
  4. Selecione as opções conforme imagem abaixo e prossiga  
  ![Imagem 12](../DevEnvironmentConfigImages/DOCKER3.png)
  5. Selecione as opções conforme imagem abaixo e prossiga  
  ![Imagem 13](../DevEnvironmentConfigImages/DOCKER4.png)
  6. Clique em 'Install'  
  ![Imagem 14](../DevEnvironmentConfigImages/DOCKER5.png)
  7. Clique em 'Finish'  
  ![Imagem 15](../DevEnvironmentConfigImages/DOCKER6.png)

[Docker]: https://github.com/docker/toolbox/releases/tag/v1.12.2

----

# Eclipse #
  1. Baixar o [Eclipse Neon][eclipse!]
  2. Descompactar o Eclipse no c:\
  3. Configurar o git no Eclipse  
  ![Imagem 16](../DevEnvironmentConfigImages/ECLIPSE1.png)  
  ![Imagem 17](../DevEnvironmentConfigImages/ECLIPSE2.png)  
  ![Imagem 18](../DevEnvironmentConfigImages/ECLIPSE3.png)  
  ![Imagem 19](../DevEnvironmentConfigImages/ECLIPSE4.png)  
  4. Configurar o JDK no Eclipse  
  ![Imagem 20](../DevEnvironmentConfigImages/ECLIPSE5.png)
  5. Configurar o Maven no Eclipse  
  ![Imagem 21](../DevEnvironmentConfigImages/ECLIPSE6.png)
  ![Imagem 22](../DevEnvironmentConfigImages/ECLIPSE7.png)
  
[eclipse]: https://www.eclipse.org/downloads/download.php?file=/oomph/epp/neon/R1/eclipse-inst-win64.exe

----

# Configurando o TFS no Eclipse #
  1. No eclipse, clique no menu Help>Eclipse Marketplace
  2. Pesquisar por TFS no campo “Find” e instalar o plugin “Team Explorer Everywhere …” e cliqe em "Install"  
  ![Imagem 23](../DevEnvironmentConfigImages/TFS1.png)  
  ![Imagem 24](../DevEnvironmentConfigImages/TFS2.png)
  3. Aceitar os termos da licença e clique em "Finish"  
  ![Imagem 25](../DevEnvironmentConfigImages/TFS3.png)
  4. Reinicie o elcipse
  5. Clicar no botão “Perspectiva” e selecionar a perspectiva “Exploração do Team Foundation Server”
  ![Imagem 26](../DevEnvironmentConfigImages/TFS4.png)
  6. Clicar no botão “Conectar a projetos da equipe”  
  ![Imagem 27](../DevEnvironmentConfigImages/TFS5.png)
  7. Clique em "Servidores"  
  ![Imagem 28](../DevEnvironmentConfigImages/TFS6.png)
  8. Adicione a URL do projeto  
  ![Imagem 29](../DevEnvironmentConfigImages/TFS7.png)
  9. faça login com suas credenciais  
  10. Clique em “Next”  
  ![Imagem 30](../DevEnvironmentConfigImages/TFS8.png)
  11. Selecione o projeto  
  12. Clique em "Finish"
