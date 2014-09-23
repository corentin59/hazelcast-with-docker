## CAPGEMINI FLASH30 : Hazelcast with Docker ##
Session start in Capgemini : 18.09.2014 @ 12:30

### Sample
This is a web application for display V'Lille stations in a browser.

### Technical
* Tomcat 8 is the servlet container
* Java is the language
* Docker for deployment
* Gradle for dependencies
* Sprint Boot for injection and provide
* AngularJS for front
* Hazelcast for cache and data replication

### Boot

#### 1. Build image :
You can build your own container :

`docker build -t flash30 .`

#### 2. Launch instances :
You can launch somes instances :

`docker run -p 4001:8080 -p 5701:5701 -d flash30`

`docker run -p 4002:8080 -p 5702:5701 -d flash30`

`docker run -p 4003:8080 -p 5703:5701 -d flash30`

`docker run -p 4004:8080 -p 5704:5701 -d flash30`

`docker run -p 4005:8080 -p 5705:5701 -d flash30`

#### 3. Launch instances :
You can check startup with docker logs :


`docker logs [container-id]`

#### 4. Display webapp :
You can open the following URI :

`http://SERVERIP:4001/vlille-2.0.0/web/index.html`

`http://SERVERIP:4002/vlille-2.0.0/web/index.html`

`http://SERVERIP:4003/vlille-2.0.0/web/index.html`

`http://SERVERIP:4004/vlille-2.0.0/web/index.html`

`http://SERVERIP:4005/vlille-2.0.0/web/index.html`

## License

```
            DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
                    Version 2, December 2004

 Copyright (C) 2015 <corentin@azelart.fr>

 Everyone is permitted to copy and distribute verbatim or modified
 copies of this license document, and changing it is allowed as long
 as the name is changed.

            DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
   TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION

  0. You just DO WHAT THE FUCK YOU WANT TO.
```

```
 This program is free software. It comes without any warranty, to
 the extent permitted by applicable law. You can redistribute it
 and/or modify it under the terms of the Do What The Fuck You Want
 To Public License, Version 2, as published by Corentin A. See
 http://www.wtfpl.net/ for more details.
```
