package org.dcistudent.Factories.Models;

import org.dcistudent.Models.Responses.Person;

public class Responses {
    /**
     * Constructor.
     */
    private Responses() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * Get a new Person object.
     *
     * @return Person
     */
    public static Person getPerson() {
        return new Person();
    }
}
