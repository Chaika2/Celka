/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
 */
package celestial;

import celestial.MM;
import celestial.Mm_1;
import celestial.Mz_1;
import celestial.rcd_3;
import celestial.xc_3;
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MW
extends MM {
    private static String[] id_break;
    private static boolean[] id_protected;
    private static short[] id_throws;

    public MW(rcd_3 rcd_32) {
        int n;
        Object i;
        int n2;
        xc_3[][][] xc_3Array;
        Integer n3 = rcd_32.id_private(id_break[0]);
        this.id_class[MW.id_throws[0]] = n3;
        Integer n4 = rcd_32.id_private(id_break[1]);
        this.id_class[MW.id_throws[1]] = n4;
        Integer n5 = rcd_32.id_private(id_break[2]);
        this.id_class[MW.id_throws[2]] = n5;
        this.id_byte[MW.id_throws[6]] = xc_3Array = new xc_3[((Integer)this.id_class[id_throws[3]]).intValue()][((Integer)this.id_class[id_throws[4]]).intValue()][((Integer)this.id_class[id_throws[5]]).intValue()];
        Int2ObjectArrayMap int2ObjectArrayMap = new Int2ObjectArrayMap();
        rcd_3 rcd_33 = rcd_32.id_int(id_break[3]);
        for (String object22 : rcd_33.id_protected()) {
            n2 = rcd_33.id_private(object22);
            Mz_1 n6 = Mz_1.id_break(object22);
            if (n6 == null) {
                throw new IllegalArgumentException(id_break[4]);
            }
            i = n6.id_byte();
            if (i == null) {
                throw new IllegalArgumentException(id_break[5]);
            }
            int2ObjectArrayMap.put(n2, i);
        }
        Object object3 = rcd_32.id_volatile(id_break[6]);
        int[] nArray = new int[(Integer)this.id_class[id_throws[7]] * (Integer)this.id_class[id_throws[8]] * (Integer)this.id_class[id_throws[9]]];
        n2 = id_protected[0];
        for (n = id_protected[1]; n < nArray.length; ++n) {
            if (n2 >= ((Object)object3).length) {
                throw new IllegalArgumentException(id_break[7]);
            }
            i = Mm_1.id_class((byte[])object3, n2);
            nArray[n] = ((Mm_1)i).id_byte();
            n2 += ((Mm_1)i).id_break();
        }
        for (n = id_protected[2]; n < (Integer)this.id_class[id_throws[10]]; ++n) {
            for (int j = id_protected[3]; j < (Integer)this.id_class[id_throws[11]]; ++j) {
                for (int k = id_protected[4]; k < (Integer)this.id_class[id_throws[12]]; ++k) {
                    int n7 = (n * (Integer)this.id_class[id_throws[13]] + j) * (Integer)this.id_class[id_throws[14]] + k;
                    xc_3 xc_32 = (xc_3)int2ObjectArrayMap.get(nArray[n7]);
                    if (xc_32 == null) {
                        throw new IllegalArgumentException("Invalid Palette Index " + n7);
                    }
                    ((xc_3[][][])this.id_byte[MW.id_throws[15]])[k][j][n] = xc_32;
                }
            }
        }
    }

    static {
        MW.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCADFD31F;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3E7DCFBC9461AD70L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-102, -14, -82, -94, 12, -107, -10, 73}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_break = new String[]{new String("Width"), new String("Height"), new String("Length"), new String("Palette"), new String("Unable to parse palette tag"), new String("Unable to deserialize palette tag"), new String("BlockData"), new String("No remaining bytes in BlockData for complete schematic")};
    }

    private static /* synthetic */ void ntfClinit() {
        MW.id_case();
        MW.id_throws();
        MW.id_catch();
    }

    private static void id_catch() {
        short[] sArray = new short[16];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 2;
        sArray[5] = 1;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[13] = 2;
        id_throws = sArray;
    }

    private static void id_case() {
        id_protected = new boolean[5];
    }
}

