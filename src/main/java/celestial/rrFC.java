/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.cb_3;
import celestial.iB_2;
import celestial.rrfD_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFC
implements MinecraftAccessor {
    private static short[] id_byte;
    private static byte[] id_protected;
    private static boolean[] id_throws;
    public Object[] id_class;
    public static Object[] id_break;
    private static float[] id_case;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[rrFC.id_throws[11]] = id_throws[12];
            objectArray[rrFC.id_protected[1]] = id_throws[13];
        }
    }

    public rrFC() {
        this.id_byte();
    }

    static {
        rrFC.ntfClinit();
    }

    private boolean id_class(iB_2 iB_22) {
        float f;
        if ((cb_3)rrFC.id_import.id_class[id_byte[10]] == null) {
            return id_throws[2];
        }
        float f2 = ((cb_3)rrFC.id_import.id_class[id_byte[11]]).u_() + ((cb_3)rrFC.id_import.id_class[id_byte[12]]).Sd();
        return f2 >= (f = iB_22.u_() + iB_22.Sd()) ? id_throws[3] : id_throws[4];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{33, -93, -86, -27, 60, 84, -97, -13}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(Ml_1 ml_1, iB_2 iB_22, float f, float f2, int n, int n2, float f3, float f4, float f5) {
        int n3 = (Integer)iB_22.id_private[id_byte[0]];
        if (iB_22 != (iB_2)this.id_class[id_byte[1]] || n3 > (Integer)this.id_class[id_byte[2]]) {
            Boolean bl = iB_22 != (cb_3)rrFC.id_import.id_class[id_byte[3]] && this.id_class(iB_22) ? id_throws[0] : id_throws[1];
            this.id_class[rrFC.id_byte[4]] = bl;
        }
        Integer n4 = n3;
        this.id_class[rrFC.id_byte[5]] = n4;
        iB_2 iB_23 = iB_22;
        this.id_class[rrFC.id_byte[6]] = iB_23;
        int n5 = (Boolean)this.id_class[id_byte[7]] != false ? ((Integer)id_break[id_byte[8]]).intValue() : ((Integer)id_break[id_byte[9]]).intValue();
        rrfD_2.id_class(ml_1, iB_22, f, f2, n, n2, f3, f4, id_case[0] * f5 / id_case[1], n5);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4FED69351A2A9CBAL;
    }

    private static void id_class() {
        Object[] objectArray = new Object[]{-16718336, -65536};
        id_break = objectArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x35501864;
    }

    private static void id_break() {
        short[] sArray = new short[15];
        sArray[0] = 10;
        sArray[2] = 1;
        sArray[3] = 57;
        sArray[4] = 2;
        sArray[5] = 1;
        sArray[7] = 2;
        sArray[9] = 1;
        sArray[10] = 57;
        sArray[11] = 57;
        sArray[12] = 57;
        sArray[13] = 230;
        sArray[14] = 255;
        id_byte = sArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[18];
        blArray[0] = true;
        blArray[3] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[16] = true;
        id_throws = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrFC.id_throws();
        rrFC.id_break();
        rrFC.id_protected();
        rrFC.id_case();
        rrFC.id_class();
    }

    private static void id_case() {
        id_protected = new byte[]{3, 2, 2};
    }

    private static void id_protected() {
        id_case = new float[]{1.0f, 255.0f};
    }
}

