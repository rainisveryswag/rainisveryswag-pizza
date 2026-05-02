package com.example.rainisveryswag.classes;

public class PizzaEntity {
    private static long counter = 100; // On commence à 100 pour changer

    private long uid;
    private String label;
    private double cost;
    private int thumbnail;
    private String prepTime;
    private String components;
    private String summary;
    private String instructions;

    public PizzaEntity() {
        this.uid = counter++;
    }

    public PizzaEntity(String label, double cost, int thumbnail, String prepTime,
                       String components, String summary, String instructions) {
        this.uid = counter++;
        this.label = label;
        this.cost = cost;
        this.thumbnail = thumbnail;
        this.prepTime = prepTime;
        this.components = components;
        this.summary = summary;
        this.instructions = instructions;
    }

    // Getters et Setters (Renommés selon les nouveaux noms de variables)
    public long getUid() { return uid; }
    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }
    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }
    public int getThumbnail() { return thumbnail; }
    public void setThumbnail(int thumbnail) { this.thumbnail = thumbnail; }
    public String getPrepTime() { return prepTime; }
    public void setPrepTime(String prepTime) { this.prepTime = prepTime; }
    public String getComponents() { return components; }
    public void setComponents(String components) { this.components = components; }
    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }
    public String getInstructions() { return instructions; }
    public void setInstructions(String instructions) { this.instructions = instructions; }
}
