/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rrdJ {
    private static final Logger id_class = LogManager.getLogger();
    private static final String id_break = "[Shaders] ";

    public static void id_byte(String string) {
    }

    public static void id_byte(String string, Object ... objectArray) {
        String string2 = String.format(string, objectArray);
        id_class.info(id_break + string2);
    }

    public static void id_class(String string, Object ... objectArray) {
        String string2 = String.format(string, objectArray);
        id_class.error(id_break + string2);
    }

    public static void id_class(String string) {
        id_class.error(id_break + string);
    }

    public static void id_break(String string) {
        id_class.warn(id_break + string);
    }

    public static void id_break(String string, Object ... objectArray) {
        String string2 = String.format(string, objectArray);
        id_class.warn(id_break + string2);
    }

    public static void id_protected(String string, Object ... objectArray) {
        String string2 = String.format(string, objectArray);
        id_class.debug(id_break + string2);
    }

    public static void id_protected(String string) {
        id_class.debug(id_break + string);
    }
}

