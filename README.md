# meecrowave-example
Simple and quick getting started for one more fancy MicroProfile implementation...

_using windows OS with it's standard cmd shell_

## build

```batch
gradlew
```

## run

```batch
call build\install\meecrowave-example\bin\meecrowave-example.bat
```

## test

```batch
http :8080/kitchen
```

_expected response_

```bash
HTTP/1.1 200
Content-Length: 11
Content-Type: application/octet-stream
Date: Wed, 27 Mar 2019 01:06:51 GMT

good things
```

## resources

* [getting started guide from official page](http://openwebbeans.apache.org/meecrowave/start.html)
