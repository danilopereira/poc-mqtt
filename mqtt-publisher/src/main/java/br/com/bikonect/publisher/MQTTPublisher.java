package br.com.bikonect.publisher;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * Created by danilopereira on 19/08/17.
 */
public class MQTTPublisher {

    public void publish(String payload) throws MqttException {
        MqttClient client = new MqttClient("tcp://localhost:1883", MqttClient.generateClientId());
        client.connect();
        MqttMessage message = new MqttMessage();
        message.setPayload(payload.getBytes());
        client.publish("iot_data", message);
        client.disconnect();
    }

}
