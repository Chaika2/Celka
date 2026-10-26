/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap
 */
package celestial;

import celestial.EZ;
import celestial.PP;
import celestial.Ps_1;
import celestial.a_1;
import celestial.be_3;
import celestial.rU_2;
import it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bi_3 {
    private static short[] id_break;
    private static double[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;

    private static void id_byte() {
        id_byte = new double[]{1.0, 1.0};
    }

    public bi_3(Ps_1 ps_1, a_1 a_12, EZ eZ) {
        this(a_12, eZ);
        for (be_3 be_32 : be_3.id_class(ps_1)) {
            be_32.id_class((Long2DoubleOpenHashMap)this.id_class[id_break[0]]);
        }
        PP.a_.id_byte("Favoring size: " + ((Long2DoubleOpenHashMap)this.id_class[id_break[1]]).size());
    }

    public bi_3(a_1 a_12, EZ eZ) {
        this.id_protected();
        Long2DoubleOpenHashMap long2DoubleOpenHashMap = new Long2DoubleOpenHashMap();
        this.id_class[bi_3.id_break[2]] = long2DoubleOpenHashMap;
        ((Long2DoubleOpenHashMap)this.id_class[id_break[3]]).defaultReturnValue(id_byte[0]);
        double d = (Double)eZ.id_break[id_break[4]];
        if (d != id_byte[1] && a_12 != null) {
            a_12.id_break().forEach(rU_22 -> ((Long2DoubleOpenHashMap)this.id_class[id_break[7]]).put(rU_2.id_class(rU_22), d));
        }
    }

    static {
        bi_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4F2E7156;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{32, 22, -103, 62, 106, 124, -105, 91}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public double id_class(long l) {
        return ((Long2DoubleOpenHashMap)this.id_class[id_break[6]]).get(l);
    }

    public boolean id_class() {
        return ((Long2DoubleOpenHashMap)this.id_class[id_break[5]]).isEmpty();
    }

    private static void id_break() {
        short[] sArray = new short[8];
        sArray[4] = 25;
        id_break = sArray;
    }

    private static long id_break(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8E7962178F97496L;
    }

    private static void id_throws() {
        id_protected = new boolean[]{true};
    }

    private static /* synthetic */ void ntfClinit() {
        bi_3.id_throws();
        bi_3.id_break();
        bi_3.id_byte();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }
}

