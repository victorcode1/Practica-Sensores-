package com.victorcode1.ejemplosensores;

import static android.content.Context.SENSOR_SERVICE;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ListandoSensoresJava {
    private Context context;

    public ListandoSensoresJava(Context context) {
        this.context = context;
    }

    public ArrayAdapter listaSensores(){
        SensorManager sensorManager = (SensorManager)context.getSystemService(SENSOR_SERVICE);
        List<Sensor> sensors = sensorManager.getSensorList(Sensor.TYPE_ALL);
          ArrayAdapter<Sensor>sensorArrayAdapter = new ArrayAdapter<Sensor>
                (context, android.R.layout.simple_list_item_1,sensors);
          return sensorArrayAdapter;

    }

    public String getCodigo(){
        return "public class ListandoSensoresJava {\n" +
                "  private  Context context;\n" +
                "\n" +
                "    public ListandoSensoresJava(Context context) {\n" +
                "        this.context = context;\n" +
                "    }\n" +
                "\n" +
                "    public ArrayAdapter listaSensores(){\n" +
                "        SensorManager sensorManager = (SensorManager)context.getSystemService(SENSOR_SERVICE);\n" +
                "        List<Sensor> sensors = sensorManager.getSensorList(Sensor.TYPE_ALL);\n" +
                "          ArrayAdapter<Sensor>sensorArrayAdapter = new ArrayAdapter<Sensor>\n" +
                "                (context, android.R.layout.simple_list_item_1,sensors);\n" +
                "          return sensorArrayAdapter;\n" +
                "\n" +
                "    }\n" +
                "}";
    }


}
