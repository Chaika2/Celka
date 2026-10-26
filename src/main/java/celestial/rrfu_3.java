/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PP;
import celestial.cb_3;
import celestial.cq_3;
import celestial.module.Module;
import celestial.rVa_1;
import celestial.rVe_1;
import celestial.rVi_1;
import celestial.rfU_2;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgc_3;
import celestial.rrfy_3;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.ui.hud.NotificationStyle;
import celestial.util.ColorHelper;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfu_3
implements MinecraftAccessor {
    private static byte[] id_byte;
    private static short[] id_protected;
    private static float[] id_throws;
    public static Object[] id_class;
    private static String[] id_case;
    private static boolean[] id_catch;
    public Object[] id_break;

    private static void id_byte() {
        float[] fArray = new float[8];
        fArray[1] = 255.0f;
        fArray[3] = 255.0f;
        fArray[5] = 255.0f;
        fArray[7] = 255.0f;
        id_throws = fArray;
    }

    public static void id_byte(Object object) {
        if ((cb_3)rrfu_3.id_import.id_class[id_protected[8]] == null) {
            return;
        }
        ((cq_3)rrfu_3.id_import.id_class[id_protected[9]]).id_throws().id_break(rrfu_3.id_break(object).id_break());
    }

    public rrfu_3() {
        this.id_case();
        rVa_1 rVa_12 = (rVa_1)id_class[id_protected[0]];
        this.id_break[rrfu_3.id_protected[1]] = rVa_12;
        rVa_1 rVa_13 = (rVa_1)id_class[id_protected[2]];
        this.id_break[rrfu_3.id_protected[3]] = rVa_13;
        rVa_1 rVa_14 = (rVa_1)id_class[id_protected[4]];
        this.id_break[rrfu_3.id_protected[5]] = rVa_14;
        rVa_1 rVa_15 = (rVa_1)id_class[id_protected[6]];
        this.id_break[rrfu_3.id_protected[7]] = rVa_15;
    }

    static {
        rrfu_3.ntfClinit();
    }

    private static int[] id_class(int n) {
        int[] nArray = new int[id_byte[6]];
        nArray[rrfu_3.id_catch[12]] = n >> id_byte[7] & id_protected[26];
        nArray[rrfu_3.id_catch[13]] = n >> id_byte[8] & id_protected[27];
        nArray[rrfu_3.id_byte[9]] = n & id_protected[28];
        nArray[rrfu_3.id_byte[10]] = n >> id_byte[11] & id_protected[29];
        return nArray;
    }

    private static int id_class(int n, int n2, float f) {
        int[] nArray = rrfu_3.id_class(n);
        int[] nArray2 = rrfu_3.id_class(n2);
        float f2 = (float)nArray[id_catch[6]] + (float)(nArray2[id_catch[7]] - nArray[id_catch[8]]) * f;
        float f3 = (float)nArray[id_catch[9]] + (float)(nArray2[id_catch[10]] - nArray[id_catch[11]]) * f;
        float f4 = (float)nArray[id_byte[0]] + (float)(nArray2[id_byte[1]] - nArray[id_byte[2]]) * f;
        float f5 = (float)nArray[id_byte[3]] + (float)(nArray2[id_byte[4]] - nArray[id_byte[5]]) * f;
        return ColorHelper.id_class((int)rfU_2.id_class(f2, id_throws[0], id_throws[1]), (int)rfU_2.id_class(f3, id_throws[2], id_throws[3]), (int)rfU_2.id_class(f4, id_throws[4], id_throws[5]), (int)rfU_2.id_class(f5, id_throws[6], id_throws[7]));
    }

    public static void id_class(Module module, String string, float f) {
        Object[] objectArray = new Object[id_catch[2]];
        objectArray[rrfu_3.id_catch[3]] = Float.valueOf(f);
        rVi_1 rVi_12 = new rgN_2(id_case[0]).id_break(rgF_2.RED + String.format(id_case[1], objectArray)).id_break(" \u0434\u043e \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f " + string);
        rrfu_3.id_class(rrfu_3.id_break(module).id_break(rgF_2.GRAY).id_class(rVi_12));
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_protected[11]]).id_class(new rrtx_3(module.id_case(), rVi_12, (int)id_protected[12]));
    }

    private static rVa_1 id_class(rVa_1 rVa_12, rVa_1 rVa_13, float f) {
        return new rVa_1(rrfu_3.id_class(rVa_12.id_class(), rVa_13.id_class(), f));
    }

    public static void id_class(rVi_1 rVi_12) {
        if ((cb_3)rrfu_3.id_import.id_class[id_protected[10]] == null) {
            return;
        }
        rVi_1[] rVi_1Array = new rVi_1[id_catch[0]];
        rVi_1Array[rrfu_3.id_catch[1]] = rVi_12;
        PP.a_.id_class(rVi_1Array);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDE7DC5EF1F22963CL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{47, 106, -106, -74, -58, 32, 109, -53}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static String id_class(Module module) {
        return module.id_final() + ": ";
    }

    public static NotificationStyle id_class(Object object) {
        return rrfu_3.id_class().id_byte().id_class().id_class(rrfy_3.id_class(object).toString());
    }

    public static NotificationStyle id_class() {
        return new NotificationStyle();
    }

    private static void id_break() {
        id_byte = new byte[]{2, 2, 2, 3, 3, 3, 4, 16, 8, 2, 3, 24, 2, 3, 6, 4};
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x23E6ADBE;
    }

    public static NotificationStyle id_break(Object object) {
        NotificationStyle notificationStyle = rrfu_3.id_class().id_byte().id_break((String)id_class[id_protected[13]]);
        return notificationStyle.id_class(rrfy_3.id_class(object).toString());
    }

    public static rVe_1 id_break(Module module) {
        return new rVe_1(module.id_final() + ": ");
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{id_case[7], new rVa_1(-4934476), new rVa_1(-4934476), new rVa_1(-4934476)};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfu_3.id_private();
        rrfu_3.id_protected();
        rrfu_3.id_implements();
        rrfu_3.id_byte();
        rrfu_3.id_break();
        rrfu_3.id_throws();
    }

    public rVe_1 id_catch() {
        int n;
        int n2;
        rVe_1 rVe_12 = new rVe_1(id_case[2]);
        if ((String)this.id_break[id_protected[14]] != null) {
            n2 = ((String)this.id_break[id_protected[15]]).length();
            rVe_12.id_class(new rgN_2(id_case[3]).id_class(rgc_3.id_class.id_class((rVa_1)id_class[id_protected[16]])));
            for (n = id_catch[4]; n < n2; ++n) {
                rVe_12.id_class(new rgN_2(String.valueOf(((String)this.id_break[id_protected[17]]).charAt(n))).id_class(rgc_3.id_class.id_class(rrfu_3.id_class((rVa_1)this.id_break[id_protected[18]], (rVa_1)this.id_break[id_protected[19]], (float)n / (float)n2))));
            }
            rVe_12.id_class(new rgN_2(id_case[4]).id_class(rgc_3.id_class.id_class((rVa_1)id_class[id_protected[20]])));
            rVe_12.id_class(id_case[5]);
        }
        if ((String)this.id_break[id_protected[21]] != null) {
            n2 = ((String)this.id_break[id_protected[22]]).length();
            for (n = id_catch[5]; n < n2; ++n) {
                rVe_12.id_class(new rgN_2(String.valueOf(((String)this.id_break[id_protected[23]]).charAt(n))).id_class(rgc_3.id_class.id_class(rrfu_3.id_class((rVa_1)this.id_break[id_protected[24]], (rVa_1)this.id_break[id_protected[25]], (float)n / (float)n2))));
            }
        }
        return rVe_12;
    }

    private void id_case() {
        if (this.id_break == null) {
            this.id_break = new Object[6];
        }
    }

    private static void id_implements() {
        short[] sArray = new short[39];
        sArray[0] = 2;
        sArray[1] = 2;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 3;
        sArray[5] = 4;
        sArray[6] = 3;
        sArray[7] = 5;
        sArray[8] = 57;
        sArray[9] = 19;
        sArray[10] = 57;
        sArray[12] = 2000;
        sArray[16] = 1;
        sArray[18] = 2;
        sArray[19] = 3;
        sArray[20] = 1;
        sArray[21] = 1;
        sArray[22] = 1;
        sArray[23] = 1;
        sArray[24] = 4;
        sArray[25] = 5;
        sArray[26] = 255;
        sArray[27] = 255;
        sArray[28] = 255;
        sArray[29] = 255;
        sArray[30] = 180;
        sArray[31] = 180;
        sArray[32] = 180;
        sArray[33] = 180;
        sArray[34] = 180;
        sArray[35] = 180;
        sArray[36] = 180;
        sArray[37] = 180;
        sArray[38] = 180;
        id_protected = sArray;
    }

    private static void id_protected() {
        id_case = new String[]{new String("\u041f\u043e\u0434\u043e\u0436\u0434\u0438\u0442\u0435 "), new String("%.1f\u0441"), new String(""), new String("("), new String(")"), new String(" \u00bb "), new String("Impact"), new String("Celestial")};
    }

    private static void id_private() {
        boolean[] blArray = new boolean[16];
        blArray[0] = true;
        blArray[2] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[15] = true;
        id_catch = blArray;
    }
}

