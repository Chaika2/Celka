/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package celestial;

import celestial.Ml_1;
import celestial.rgc_3;
import celestial.rpv_3;
import celestial.rrZM;
import celestial.rrZO;
import celestial.util.ColorHelper;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZh_1
implements rpv_3 {
    private static float[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;
    private static byte[] id_protected;
    private static int[] id_throws;
    private static short[] id_case;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[1]];
            objectArray[rrZh_1.id_byte[1]] = Float.valueOf(id_break[0]);
            objectArray[rrZh_1.id_byte[2]] = Float.valueOf(id_break[1]);
            objectArray[rrZh_1.id_protected[2]] = id_byte[3];
            objectArray[rrZh_1.id_protected[3]] = Float.valueOf(id_break[2]);
            objectArray[rrZh_1.id_protected[4]] = id_byte[4];
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rrZh_1(rrZO rrZO2, float f, int n, Ml_1 ml_1, float f2, int n2) {
        this.id_byte();
        rrZO rrZO3 = rrZO2;
        this.id_class[rrZh_1.id_case[0]] = rrZO3;
        Float f3 = Float.valueOf(f);
        this.id_class[rrZh_1.id_case[1]] = f3;
        Integer n3 = n;
        this.id_class[rrZh_1.id_case[2]] = n3;
        Ml_1 ml_12 = ml_1;
        this.id_class[rrZh_1.id_case[3]] = ml_12;
        Float f4 = Float.valueOf(f2);
        this.id_class[rrZh_1.id_case[4]] = f4;
        Integer n4 = n2;
        this.id_class[rrZh_1.id_case[5]] = n4;
        Float f5 = Float.valueOf(((Float)this.id_class[id_case[6]]).floatValue());
        this.id_class[rrZh_1.id_case[7]] = f5;
    }

    static {
        rrZh_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-104, 8, -73, 13, -22, -92, -19, 69}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA1B256B8;
    }

    private static void id_class() {
        id_protected = new byte[]{8, 7, 2, 4, 5};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC994E789CECD0433L;
    }

    @Override
    public boolean accept(int n, rgc_3 rgc_32, int n2) {
        int n3 = rgc_32.id_class() != null ? rgc_32.id_class().id_class() : ((Integer)this.id_class[id_case[8]]).intValue();
        char c = (char)n2;
        rrZM rrZM2 = (rrZM)((Int2ObjectOpenHashMap)((rrZO)this.id_class[rrZh_1.id_case[9]]).id_class[id_case[10]]).getOrDefault((int)c, (Object)((rrZM)((rrZO)this.id_class[rrZh_1.id_case[11]]).id_class[id_case[12]]));
        if (rrZM2 != null) {
            ((rrZO)this.id_class[id_case[13]]).id_class((Ml_1)this.id_class[id_case[14]], c, ((Float)this.id_class[id_case[15]]).floatValue(), ((Float)this.id_class[id_case[16]]).floatValue(), ColorHelper.id_break(n3 | id_throws[0], (Integer)this.id_class[id_case[17]]));
            rrZh_1 rrZh_12 = this;
            Float f = Float.valueOf(((Float)rrZh_12.id_class[id_case[18]]).floatValue() + (float)((Integer)rrZM2.id_class[id_case[19]] - id_protected[0]));
            rrZh_12.id_class[rrZh_1.id_case[20]] = f;
        }
        return id_byte[0];
    }

    private static void id_break() {
        id_break = new float[3];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrZh_1.id_throws();
        rrZh_1.id_case();
        rrZh_1.id_break();
        rrZh_1.id_class();
        rrZh_1.id_protected();
    }

    private static void id_case() {
        short[] sArray = new short[21];
        sArray[0] = 6;
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 4;
        sArray[5] = 5;
        sArray[6] = 1;
        sArray[8] = 2;
        sArray[9] = 6;
        sArray[10] = 1;
        sArray[11] = 6;
        sArray[12] = 2;
        sArray[13] = 6;
        sArray[14] = 3;
        sArray[16] = 4;
        sArray[17] = 5;
        sArray[19] = 2;
        id_case = sArray;
    }

    private static void id_protected() {
        id_throws = new int[]{-16777216};
    }
}

