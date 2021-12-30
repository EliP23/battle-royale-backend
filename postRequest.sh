
#!/bin/bash

curl -X POST -H "Content-Type: application/json" -d @src/test/resources/data/position.json "http://localhost:8080/position"  -vvv
curl -X POST -H "Content-Type: application/json" -d @src/test/resources/data/position2.json "http://localhost:8080/position"  -vvv
curl -X POST -H "Content-Type: application/json" -d @src/test/resources/data/position3.json "http://localhost:8080/position"  -vvv
curl -X GET -H "Conteny-Type: application/json" http://localhost:8080/position
