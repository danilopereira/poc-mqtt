package br.com.bikonect.application;

import br.com.bikonect.consumer.MqttConsumer;
import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * Created by danilopereira on 19/08/17.
 */
public class Application {

    public static void main(String[] args){

        MqttConsumer mqttConsumer = new MqttConsumer();
        try {
            mqttConsumer.consume();
        } catch (MqttException e) {
            e.printStackTrace();
        }

    }
}
