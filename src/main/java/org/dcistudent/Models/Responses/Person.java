package org.dcistudent.Models.Responses;

public class Person {
    public String toString(org.dcistudent.Models.Person person) {
        StringBuilder sb = new StringBuilder();

        sb
            .append("{ \"name\": \"")
            .append(person.getName())
            .append("\", \"age\": ")
            .append(person.getAge())
            .append(", \"job\": \"")
            .append(person.getJob())
            .append("\" }");

        return sb.toString();
    }
}
