package org.dcistudent.Models;

public class Human {
    private int id = 0;
    private boolean isAlive = true;
    private boolean hasLeftArm = true;
    private boolean hasRightArm = true;
    private boolean hasLeftLeg = true;
    private boolean hasRightLeg = true;

    /**
     * Set the human's ID.
     *
     * @param id Set the human's ID
     * @return Human
     */
    public Human setId(int id) {
        this.id = id;

        return this;
    }

    /**
     * Set the human alive or dead.
     *
     * @param isAlive Set the human alive or dead
     * @return Human
     */
    public Human setAlive(boolean isAlive) {
        this.isAlive = isAlive;

        return this;
    }

    /**
     * Set the human's left arm.
     *
     * @param hasLeftArm Set the human's left arm
     * @return Human
     */
    public Human setLeftArm(boolean hasLeftArm) {
        this.hasLeftArm = hasLeftArm;

        return this;
    }

    /**
     * Set the human's right arm.
     *
     * @param hasRightArm Set the human's right arm
     * @return Human
     */
    public Human setRightArm(boolean hasRightArm) {
        this.hasRightArm = hasRightArm;

        return this;
    }

    /**
     * Set the human's left leg.
     *
     * @param hasLeftLeg Set the human's left leg
     * @return Human
     */
    public Human setLeftLeg(boolean hasLeftLeg) {
        this.hasLeftLeg = hasLeftLeg;

        return this;
    }

    /**
     * Set the human's right leg.
     *
     * @param hasRightLeg Set the human's right leg
     * @return Human
     */
    public Human setRightLeg(boolean hasRightLeg) {
        this.hasRightLeg = hasRightLeg;

        return this;
    }

    /**
     * Get the human's ID.
     *
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Check if the human exists.
     *
     * @return boolean
     */
    public boolean exists() {
        return this.id > 0;
    }

    /**
     * Check if the human is alive.
     *
     * @return boolean
     */
    public boolean isAlive() {
        return isAlive;
    }

    /**
     * Check if the human has a left arm.
     *
     * @return boolean
     */
    public boolean hasLeftArm() {
        return hasLeftArm;
    }

    /**
     * Check if the human has a right arm.
     *
     * @return boolean
     */
    public boolean hasRightArm() {
        return hasRightArm;
    }

    /**
     * Check if the human has a left leg.
     *
     * @return boolean
     */
    public boolean hasLeftLeg() {
        return hasLeftLeg;
    }

    /**
     * Check if the human has a right leg.
     *
     * @return boolean
     */
    public boolean hasRightLeg() {
        return hasRightLeg;
    }
}
