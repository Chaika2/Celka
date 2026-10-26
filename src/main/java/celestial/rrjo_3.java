/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjo_3
extends Logger {
    private static short[] id_break;
    public Object[] id_class;
    private static String[] id_byte;
    private static boolean[] id_protected;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }

    public rrjo_3(org.apache.logging.log4j.Logger logger) {
        super(id_byte[0], null);
        this.id_byte();
        org.apache.logging.log4j.Logger logger2 = logger;
        this.id_class[rrjo_3.id_break[0]] = logger2;
    }

    static {
        rrjo_3.ntfClinit();
    }

    @Override
    public void log(Level level, String string, Object[] objectArray) {
        this.log(level, MessageFormat.format(string, objectArray));
    }

    @Override
    public void log(Level level, String string) {
        if (level == Level.FINE) {
            ((org.apache.logging.log4j.Logger)this.id_class[id_break[1]]).debug(string);
        } else if (level == Level.WARNING) {
            ((org.apache.logging.log4j.Logger)this.id_class[id_break[2]]).warn(string);
        } else if (level == Level.SEVERE) {
            ((org.apache.logging.log4j.Logger)this.id_class[id_break[3]]).error(string);
        } else if (level == Level.INFO) {
            ((org.apache.logging.log4j.Logger)this.id_class[id_break[4]]).info(string);
        } else {
            ((org.apache.logging.log4j.Logger)this.id_class[id_break[5]]).trace(string);
        }
    }

    @Override
    public void log(LogRecord logRecord) {
        this.log(logRecord.getLevel(), logRecord.getMessage());
    }

    @Override
    public void log(Level level, String string, Object object) {
        if (level == Level.FINE) {
            ((org.apache.logging.log4j.Logger)this.id_class[id_break[6]]).debug(string, object);
        } else if (level == Level.WARNING) {
            ((org.apache.logging.log4j.Logger)this.id_class[id_break[7]]).warn(string, object);
        } else if (level == Level.SEVERE) {
            ((org.apache.logging.log4j.Logger)this.id_class[id_break[8]]).error(string, object);
        } else if (level == Level.INFO) {
            ((org.apache.logging.log4j.Logger)this.id_class[id_break[9]]).info(string, object);
        } else {
            ((org.apache.logging.log4j.Logger)this.id_class[id_break[10]]).trace(string, object);
        }
    }

    @Override
    public void log(Level level, String string, Throwable throwable) {
        if (level == Level.FINE) {
            ((org.apache.logging.log4j.Logger)this.id_class[id_break[11]]).debug(string, throwable);
        } else if (level == Level.WARNING) {
            ((org.apache.logging.log4j.Logger)this.id_class[id_break[12]]).warn(string, throwable);
        } else if (level == Level.SEVERE) {
            ((org.apache.logging.log4j.Logger)this.id_class[id_break[13]]).error(string, throwable);
        } else if (level == Level.INFO) {
            ((org.apache.logging.log4j.Logger)this.id_class[id_break[14]]).info(string, throwable);
        } else {
            ((org.apache.logging.log4j.Logger)this.id_class[id_break[15]]).trace(string, throwable);
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-20, -110, 82, -49, -61, -53, 121, 121}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x511C58C2;
    }

    private static void id_class() {
        id_break = new short[16];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x57A94DE194780AD2L;
    }

    private static void id_break() {
        id_byte = new String[]{new String("logger")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrjo_3.id_protected();
        rrjo_3.id_break();
        rrjo_3.id_class();
    }

    private static void id_protected() {
        id_protected = new boolean[]{true};
    }
}

