/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package celestial;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjp_3 {
    private static byte[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;
    public static Object[] id_break;
    private static short[] id_throws;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    public rrjp_3(String string, BooleanSupplier booleanSupplier, Runnable runnable) {
        this(string, booleanSupplier, runnable, null);
    }

    public rrjp_3(String string, BooleanSupplier booleanSupplier, Runnable runnable, Consumer<List<ProtocolVersion>> consumer) {
        Consumer<List<ProtocolVersion>> consumer2;
        this.id_byte();
        String string2 = string;
        this.id_class[rrjp_3.id_throws[0]] = string2;
        BooleanSupplier booleanSupplier2 = booleanSupplier;
        this.id_class[rrjp_3.id_throws[1]] = booleanSupplier2;
        Runnable runnable2 = runnable;
        this.id_class[rrjp_3.id_throws[2]] = runnable2;
        this.id_class[rrjp_3.id_throws[3]] = consumer2 = consumer;
    }

    static {
        rrjp_3.ntfClinit();
    }

    public void id_class(Logger logger) {
        if (((BooleanSupplier)this.id_class[id_throws[7]]).getAsBoolean()) {
            try {
                ((Runnable)this.id_class[id_throws[8]]).run();
                logger.info("Loaded Platform " + (String)this.id_class[id_throws[9]]);
                Integer n = (Integer)id_break[id_throws[10]] + id_protected[0];
                rrjp_3.id_break[rrjp_3.id_throws[11]] = n;
            }
            catch (Throwable throwable) {
                logger.severe("An error occurred while loading Platform " + (String)this.id_class[id_throws[12]] + ":");
                throwable.printStackTrace();
            }
            return;
        }
        logger.severe("Platform " + (String)this.id_class[id_throws[13]] + " is not present");
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7BE79B56;
    }

    public void id_class() {
        if ((Consumer)this.id_class[id_throws[4]] != null) {
            ((Consumer)this.id_class[id_throws[5]]).accept((List)id_break[id_throws[6]]);
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{121, -18, -14, -7, -21, 9, 127, 57}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAC3E6D67086A4E70L;
    }

    public String id_break() {
        return (String)this.id_class[id_throws[14]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrjp_3.id_throws();
        rrjp_3.id_case();
        rrjp_3.id_catch();
        rrjp_3.id_protected();
    }

    private static void id_catch() {
        id_byte = new byte[]{4, 2};
    }

    private static void id_case() {
        short[] sArray = new short[15];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 3;
        sArray[5] = 3;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[8] = 2;
        id_throws = sArray;
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{0, new ArrayList()};
        id_break = objectArray;
    }
}

