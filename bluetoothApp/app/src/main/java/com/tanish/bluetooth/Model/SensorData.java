package com.tanish.bluetooth.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SensorData {

    @SerializedName("device_id")
    @Expose
    private String deviceId;
    @SerializedName("humidity_in_rh")
    @Expose
    private Double humidityInRh;
    @SerializedName("temperature_in_celsius")
    @Expose
    private Double temperatureInCelsius;
    @SerializedName("ppm_level")
    @Expose
    private Integer ppmLevel;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Double getHumidityInRh() {
        return humidityInRh;
    }

    public void setHumidityInRh(Double humidityInRh) {
        this.humidityInRh = humidityInRh;
    }

    public Double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(Double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public Integer getPpmLevel() {
        return ppmLevel;
    }

    public void setPpmLevel(Integer ppmLevel) {
        this.ppmLevel = ppmLevel;
    }

}
