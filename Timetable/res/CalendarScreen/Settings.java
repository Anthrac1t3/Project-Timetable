package application.model;

/**
 * The type Settings.
 */
public class Settings {
    /**
     * The constant desktopNotifi.
     */
    public static Boolean desktopNotifi;
    /**
     * The constant isMuted.
     */
    public static Boolean isMuted;
    /**
     * The constant alarmSound.
     */
    public static String alarmSound; // Path to audio file; Add default

    public static int priorityInterval;

    /**
     * Instantiates a new Settings.
     */
    public Settings() {
        return;
    }

    /**
     * Gets alarm sound.
     *
     * @return the alarmSound
     */
    public String getAlarmSound() {
        return alarmSound;
    }

    /**
     * Sets alarm sound.
     *
     * @param alarmSound the alarmSound to set
     */
    public void setAlarmSound(String alarmSound) {
        Settings.alarmSound = alarmSound;
    }

    /**
     * Gets is muted.
     *
     * @return the isMuted
     */
    public Boolean getIsMuted() {
        return isMuted;
    }

    /**
     * Sets is muted.
     *
     * @param isMuted the isMuted to set
     */
    public void setIsMuted(Boolean isMuted) {
        Settings.isMuted = isMuted;
    }

    /**
     * Gets priority interval.
     *
     * @return the priorityInterval
     */
    public int getPriorityInterval() {
        return priorityInterval;
    }

    /**
     * Sets priority interval.
     *
     * @param priorityInterval the priorityInterval to set
     */
    public void setPriorityInterval(int priorityInterval) {
        Settings.priorityInterval = priorityInterval;
    }

    /**
     * Gets desktop notifi.
     *
     * @return the desktopNotifi
     */
    public Boolean getDesktopNotifi() {
        return desktopNotifi;
    }

    /**
     * Sets desktop notifi.
     *
     * @param desktopNotifi the desktopNotifi to set
     */
    public void setDesktopNotifi(Boolean desktopNotifi) {
        Settings.desktopNotifi = desktopNotifi;
    }

}