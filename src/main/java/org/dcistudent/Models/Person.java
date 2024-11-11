package org.dcistudent.Models;

public class Person extends Human {
    private String name = "";
    private int age = 0;
    private String job = "";

    /**
     * Set the person's name.
     *
     * @param name Set the person's name
     * @return Person
     */
    public Person setName(String name) {
        this.name = name;

        return this;
    }

    /**
     * Set the person's age.
     *
     * @param age Set the person's age
     * @return Person
     */
    public Person setAge(int age) {
        this.age = age;

        return this;
    }

    /**
     * Set the person's job.
     *
     * @param job Set the person's job
     * @return Person
     */
    public Person setJob(String job) {
        this.job = job;

        return this;
    }

    /**
     * Get the person's name.
     *
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Get the person's age.
     *
     * @return int
     */
    public int getAge() {
        return age;
    }

    /**
     * Get the person's job.
     *
     * @return String
     */
    public String getJob() {
        return job;
    }
}
