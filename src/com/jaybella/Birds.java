package com.jaybella;

/**
 * @author momondi  on 9/20/2021
 **/
public class Birds {
    private String birdName;
    private String origin;
    private Integer estimatedPopulation;

    public Birds(String birdName, String origin, Integer estimatedPopulation) {
        this.birdName = birdName;
        this.origin = origin;
        this.estimatedPopulation = estimatedPopulation;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getEstimatedPopulation() {
        return estimatedPopulation;
    }

    public void setEstimatedPopulation(Integer estimatedPopulation) {
        this.estimatedPopulation = estimatedPopulation;
    }

    public String toString(){

        return "Birds{ birdName = '"+birdName+ "\'"+"origin ='"+origin+" \'" +" estimatedPopulation='"+estimatedPopulation+" \'"+
                "}";
    }
}
