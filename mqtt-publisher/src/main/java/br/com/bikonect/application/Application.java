package br.com.bikonect.application;

import br.com.bikonect.publisher.MQTTPublisher;
import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * Created by danilopereira on 19/08/17.
 */
public class Application {

    public static void main(String[] args){
        MQTTPublisher publisher = new MQTTPublisher();
        try {
            publisher.publish("Teste local java");
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
}
