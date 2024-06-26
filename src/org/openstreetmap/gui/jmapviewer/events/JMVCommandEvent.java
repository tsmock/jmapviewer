// License: GPL. For details, see Readme.txt file.
package org.openstreetmap.gui.jmapviewer.events;

import java.util.EventObject;

/**
 * Used for passing events between UI components and other
 * objects that register as a JMapViewerEventListener
 *
 * @author Jason Huntley
 *
 */
public class JMVCommandEvent extends EventObject {
    public enum COMMAND {
        MOVE,
        ZOOM
    }

    /**
     *
     */
    private static final long serialVersionUID = 8701544867914969620L;

    private COMMAND command;

    public JMVCommandEvent(COMMAND cmd, Object source) {
        super(source);

        setCommand(cmd);
    }

    /**
     * @return the command
     */
    public COMMAND getCommand() {
        return command;
    }

    /**
     * @param command the command to set
     */
    public void setCommand(COMMAND command) {
        this.command = command;
    }
}
