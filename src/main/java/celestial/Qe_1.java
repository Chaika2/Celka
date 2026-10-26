/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.bridge.game.PerformanceMetrics
 */
package celestial;

import com.mojang.bridge.game.PerformanceMetrics;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Qe_1
implements PerformanceMetrics {
    private static byte[] id_break;
    private static short[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[2] = true;
        id_protected = blArray;
    }

    public Qe_1(int n, int n2, int n3, int n4) {
        this.id_class();
        Integer n5 = n;
        this.id_class[Qe_1.id_byte[0]] = n5;
        Integer n6 = n2;
        this.id_class[Qe_1.id_byte[1]] = n6;
        Integer n7 = n3;
        this.id_class[Qe_1.id_byte[2]] = n7;
        Integer n8 = n4;
        this.id_class[Qe_1.id_byte[3]] = n8;
    }

    static {
        Qe_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAD2C08089FE83D90L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x72A4E7E;
    }

    private void id_class() {
        if (this.id_class == null) {
            this.id_class = new Object[4];
            this.id_class[0] = 0;
            this.id_class[1] = 0;
            this.id_class[2] = 0;
            this.id_class[3] = 0;
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{111, -40, 116, 52, 34, -35, -70, -88}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_break = new byte[]{4, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        Qe_1.id_byte();
        Qe_1.id_protected();
        Qe_1.id_break();
    }

    private static void id_protected() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 3;
        id_byte = sArray;
    }

    public int getMinTime() {
        return (Integer)this.id_class[id_byte[4]];
    }

    public int getMaxTime() {
        return (Integer)this.id_class[id_byte[5]];
    }

    public int getAverageTime() {
        return (Integer)this.id_class[id_byte[6]];
    }

    public int getSampleCount() {
        return (Integer)this.id_class[id_byte[7]];
    }
}

