package io.codelex.oop.Execise78Computers;

import java.util.Objects;

public class Computer {
    String processor;
    String ram;
    String graphicsGard;
    String company;
    String model;

    public Computer(String processor, String ram, String graphicsGard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsGard = graphicsGard;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicsGard() {
        return graphicsGard;
    }

    public void setGraphicsGard(String graphicsGard) {
        this.graphicsGard = graphicsGard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsGard='" + graphicsGard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(processor, computer.processor) && Objects.equals(ram, computer.ram) && Objects.equals(graphicsGard, computer.graphicsGard) && Objects.equals(company, computer.company) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicsGard, company, model);
    }
}
