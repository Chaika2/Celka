/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.cG_2;
import celestial.iB_2;
import celestial.rEJ;
import celestial.rVi_1;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rql_3;
import celestial.rrQX;
import celestial.rrZW;
import celestial.rrfQ_2;
import celestial.rsE_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjZ_2
implements MinecraftAccessor {
    private static String[] id_class;
    private static float[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;

    public static rgP_2 id_byte(an_3 an_32) {
        if (an_32 instanceof rsE_2) {
            rsE_2 rsE_22 = (rsE_2)an_32;
            rdn_3 rdn_32 = rsE_22.id_protected();
            rVi_1 rVi_12 = rdn_32.id_continue().id_case();
            int n = rdn_32.id_char();
            if (n > id_byte[0]) {
                rVi_12.id_break(rgF_2.RED + " x" + n);
            }
            return rVi_12;
        }
        String string = rrjZ_2.id_protected(an_32);
        rgP_2 rgP_22 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[0]]).id_private().id_throws().id_class(an_32.L_());
        if (string.isEmpty()) {
            return rgP_22;
        }
        rgN_2 rgN_22 = new rgN_2(string);
        rgN_22.id_class(rgP_22);
        return rgN_22;
    }

    public static boolean id_byte(iB_2 iB_22) {
        return (Boolean)iB_22.id_private[id_protected[14]];
    }

    private static void id_byte() {
        short[] sArray = new short[15];
        sArray[2] = 34;
        sArray[3] = 35;
        sArray[4] = 36;
        sArray[5] = 34;
        sArray[6] = 35;
        sArray[7] = 36;
        sArray[8] = 15;
        sArray[9] = 17;
        sArray[10] = 15;
        sArray[11] = 16;
        sArray[12] = 18;
        sArray[13] = 16;
        sArray[14] = 75;
        id_protected = sArray;
    }

    public static double id_byte(an_3 an_32, float f) {
        return rrfQ_2.id_class(an_32.BO(), (double)((Double)an_32.id_throws[id_protected[4]]), f);
    }

    static {
        rrjZ_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2DB483E6F5E5E311L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x225DCE60;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{60, -118, -102, 21, 39, 36, 53, -10}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static boolean id_class(rEJ rEJ2) {
        return rEJ2.L() == id_byte[1] || rEJ2.id_throw(id_break[6]) > id_break[7] ? id_byte[2] : id_byte[3];
    }

    public static boolean id_class(an_3 an_32) {
        return an_32.BC().id_throws().id_private();
    }

    private static void id_class() {
        id_class = new String[]{new String("[F] "), new String("[BOT] "), new String("")};
    }

    public static String id_class(float f) {
        return "" + (int)(f * id_break[3]);
    }

    public static float id_class(iB_2 iB_22) {
        if (iB_22 == null) {
            return id_break[0];
        }
        return rfU_2.id_class(iB_22.u_() / iB_22.SK(), id_break[1], id_break[2]);
    }

    public static double id_class(an_3 an_32, float f) {
        return rrfQ_2.id_class(an_32.BO(), (double)((Double)an_32.id_throws[id_protected[7]]), f) - id_void.id_private();
    }

    public static boolean id_break(an_3 an_32) {
        return an_32.BC().id_throws().id_throws();
    }

    public static double id_break(an_3 an_32, float f) {
        return rrfQ_2.id_class(an_32.re(), (double)((Double)an_32.id_throws[id_protected[3]]), f);
    }

    private static void id_break() {
        float[] fArray = new float[8];
        fArray[2] = 1.0f;
        fArray[3] = 100.0f;
        fArray[4] = 1.0f;
        fArray[5] = 1.0f;
        fArray[6] = 1.0f;
        id_break = fArray;
    }

    public static String id_break(iB_2 iB_22) {
        return rql_3.id_class(iB_22.u_() + iB_22.Sd());
    }

    public static double id_throws(an_3 an_32, float f) {
        return rrfQ_2.id_class(an_32.rx(), (double)((Double)an_32.id_throws[id_protected[5]]), f) - id_void.id_case();
    }

    private static /* synthetic */ void ntfClinit() {
        rrjZ_2.id_protected();
        rrjZ_2.id_class();
        rrjZ_2.id_byte();
        rrjZ_2.id_break();
    }

    public static float id_catch(an_3 an_32, float f) {
        if (f == id_break[4]) {
            return ((Float)an_32.id_throws[id_protected[8]]).floatValue();
        }
        return rrfQ_2.id_break(((Float)an_32.id_throws[id_protected[9]]).floatValue(), ((Float)an_32.id_throws[id_protected[10]]).floatValue(), f);
    }

    public static float id_case(an_3 an_32, float f) {
        if (f == id_break[5]) {
            return ((Float)an_32.id_throws[id_protected[11]]).floatValue();
        }
        return rrfQ_2.id_break(((Float)an_32.id_throws[id_protected[12]]).floatValue(), ((Float)an_32.id_throws[id_protected[13]]).floatValue(), f);
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    public static double id_protected(an_3 an_32, float f) {
        return rrfQ_2.id_class(an_32.rx(), (double)((Double)an_32.id_throws[id_protected[2]]), f);
    }

    public static String id_protected(an_3 an_32) {
        if (an_32 instanceof cG_2) {
            cG_2 cG_22 = (cG_2)an_32;
            StringBuilder stringBuilder = new StringBuilder();
            if (((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_protected[1]]).id_class(cG_22)) {
                stringBuilder.append((Object)rgF_2.GREEN).append(id_class[0]);
            }
            if (cG_22.sc()) {
                stringBuilder.append((Object)rgF_2.RED).append(id_class[1]);
            }
            return stringBuilder.toString();
        }
        return id_class[2];
    }

    public static double id_private(an_3 an_32, float f) {
        return rrfQ_2.id_class(an_32.re(), (double)((Double)an_32.id_throws[id_protected[6]]), f) - id_void.id_catch();
    }
}

