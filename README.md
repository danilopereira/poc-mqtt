# poc-mqtt
Java Maven Project using MQTT protocol to communicate by Mosquitto broker.

## Execution

To execute this project run the follow command on the root of poc-mqtt project:

```
  mvn clean install package
```
The command will generate the executable jars of modules

### Running the Subscriber
  To run the mqtt-subscriber project, go to the /target folder on mqtt-consumer folder and execute the command:
  ```
    java -jar mqtt-consumer-1.0-SNAPSHOT-jar-with-dependencies.jar
  ```
  
### Running the Publisher
  To run the mqtt-publisher project, go to the /target folder on mqtt-publisher folder and execute the command:
  ```
    java -jar mqtt-publisher-1.0-SNAPSHOT-jar-with-dependencies.jar
  ```
