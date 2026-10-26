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

public class rrMP {
    private static final Logger id_break = LogManager.getLogger();
    public static final boolean id_class = System.getProperty("log.detail", "false").equals("true");

    public static void id_byte(String string) {
        id_break.warn("[OptiFine] " + string);
    }

    public static void id_class(String string, Throwable throwable) {
        id_break.warn("[OptiFine] " + string, throwable);
    }

    public static void id_class(String string) {
        if (id_class) {
            id_break.info("[OptiFine] " + string);
        }
    }

    public static void id_break(String string, Throwable throwable) {
        id_break.error("[OptiFine] " + string, throwable);
    }

    public static void id_break(String string) {
    }

    public static void id_throws(String string) {
    }

    public static void id_protected(String string) {
        id_break.error("[OptiFine] " + string);
    }
}

