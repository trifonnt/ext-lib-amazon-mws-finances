[![Build Status](https://travis-ci.org/trifonnt/ext-lib-amazon-mws-finances.png?branch=master)](https://travis-ci.org/trifonnt/ext-lib-amazon-mws-finances)
[![](https://jitpack.io/v/trifonnt/ext-lib-amazon-mws-finances.svg)](https://jitpack.io/#trifonnt/ext-lib-amazon-mws-finances)


Amazon MWS(Marketplace Web Service) Finances Java Library - Version 2015-05-01.V312120320
=============================================================================== 
The project is mavenised unofficial copy of Java library provided by Amazon for dealing with Amazon Marketplace Web Service API.

 - https://developer.amazonservices.com/doc/finances/finances/v20150501/java.html/165-0971396-8482360

 - https://docs.developer.amazonservices.com/en_US/finances/index.html


Current CI status: https://travis-ci.org/trifonnt/ext-lib-amazon-mws-finances


About this Library
=============================================================================== 

Based on the 2015-05-01 API version.
Refers only to the [MWSFinancesJavaClientLibrary-2015-05-01._V312120320_.zip](https://images-na.ssl-images-amazon.com/images/G/01/mwsportal/clientlib/Finances/2015-05-01/MWSFinancesJavaClientLibrary-2015-05-01._V312120320_.zip) file.


Prerequisites
=============================================================================== 

- Amazon Pro Merchant seller account or another Amazon account that makes you eligible to use Amazon Marketplace Web Service (Amazon MWS). For more information, see the [Amazon MWS FAQ](https://developer.amazonservices.com/gp/mws/faq.html).

- Registering for Amazon MWS. For more information see the [Amazon MWS FAQ](https://developer.amazonservices.com/gp/mws/faq.html).

- Java Platform Standard Edition 6.0 Development Kit (JDK 1.6.0_19) or newer. If your version of the JDK is older than 6.0, you must install the newer version. For more information, go to the Java SE Downloads page. 


## How to

### Migrate to new version of Amazon MWS Finances library version
```shell
$ git clone https://github.com/trifonnt/ext-lib-amazon-mws-finances.git

$ cd ext-lib-amazon-mws-finances

$ mkdir orig-library

$ cd orig-library

$ wget https://images-na.ssl-images-amazon.com/images/G/01/mwsportal/clientlib/Finances/2015-05-01/MWSFinancesJavaClientLibrary-2015-05-01._V312120320_.zip

$ unzip MWSFinancesJavaClientLibrary-2015-05-01._V312120320_.zip


$ mv src/com/amazon/mws/finances/_2015_05_01/mock/*.xml ../src/test/resources/

$ mkdir -p ../src/test/java/com/amazon/mws/finances/_2015_05_01/mock/
$ mv src/com/amazon/mws/finances/_2015_05_01/mock/MWSFinancesServiceMock.java ../src/test/java/com/amazon/mws/finances/_2015_05_01/mock/
$ rm src/com/amazon/mws/finances/_2015_05_01/mock -r

$ mkdir -p ../src/test/java/com/amazon/mws/finances/_2015_05_01/samples/
$ mv src/com/amazon/mws/finances/_2015_05_01/samples/*.java ../src/test/java/com/amazon/mws/finances/_2015_05_01/samples/
$ rm src/com/amazon/mws/finances/_2015_05_01/samples -r

$ mkdir -p ../src/main/java/com/amazon/mws/finances/_2015_05_01/model
$ mv src/com/amazon/mws/finances/_2015_05_01/*.java ../src/main/java/com/amazon/mws/finances/_2015_05_01

$ mv src/com/amazon/mws/finances/_2015_05_01/model/*.java ../src/main/java/com/amazon/mws/finances/_2015_05_01/model
$ rm -r src/com/amazon/mws/finances/_2015_05_01/model


$ mvn clean install -Dmaven.javadoc.skip=true -DskipTests=true
```

### Publish new version to JitPack

 - Create new Release in GitHub

 - Open below URL in order to start JitPack build process

```shell
https://jitpack.io/com/github/trifonnt/ext-lib-amazon-mws-finances/1.0.0
```

### Get this project into your Maven build(pom.xml)
```xml
...
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
 ...
 ...
 	<dependency>
	    <groupId>com.github.trifonnt</groupId>
	    <artifactId>ext-lib-amazon-mws-finances</artifactId>
	    <version>1.0.0</version>
	</dependency>
...
```

Licensing
=============================================================================== 

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
