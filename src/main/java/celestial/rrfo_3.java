/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.Ak_1;
import celestial.Aq_1;
import celestial.Ax_1;
import celestial.ZE;
import celestial.an_3;
import celestial.cb_3;
import celestial.eY_2;
import celestial.gm_3;
import celestial.iB_2;
import celestial.mt_3;
import celestial.rJr_1;
import celestial.rXQ;
import celestial.rXi_1;
import celestial.rZd_1;
import celestial.rdn_3;
import celestial.rgn_3;
import celestial.rme_3;
import celestial.rpm_3;
import celestial.rrQX;
import celestial.rrfH_2;
import celestial.rrfp_3;
import celestial.rrvL;
import celestial.util.MinecraftAccessor;
import celestial.vG_2;
import celestial.yX_2;
import celestial.yt_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrfo_3
implements MinecraftAccessor {
    private static short[] id_class;
    private static String[] id_break;
    private static float[] id_byte;
    private static double[] id_protected;
    private static boolean[] id_throws;

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x995823C6;
    }

    public static boolean id_byte() {
        return ((gm_3)rrfo_3.id_import.id_class[id_class[0]]).id_break((cb_3)rrfo_3.id_import.id_class[id_class[1]], ((cb_3)rrfo_3.id_import.id_class[id_class[2]]).rN().id_protected(id_protected[0], id_protected[1], id_protected[2]));
    }

    static {
        rrfo_3.ntfClinit();
    }

    public static boolean id_class(rdn_3 rdn_32) {
        if ((cb_3)rrfo_3.id_import.id_class[id_class[17]] == null) {
            return id_throws[14];
        }
        return ((cb_3)rrfo_3.id_import.id_class[id_class[18]]).sK().id_class(rdn_32.id_break()) || ((cb_3)rrfo_3.id_import.id_class[id_class[19]]).r().id_class(rdn_32) ? id_throws[15] : id_throws[16];
    }

    public static boolean id_class(an_3 an_32) {
        yt_3 yt_32 = ((yX_2)rrfo_3.id_import.id_class[id_class[13]]).id_static();
        if (yt_32 == null) {
            return id_throws[10];
        }
        return yt_32.id_class(an_32.rN());
    }

    public static void id_class(rpm_3 rpm_32) {
        ((Aq_1)((cb_3)rrfo_3.id_import.id_class[rrfo_3.id_class[3]]).id_break[id_class[4]]).id_class(new rZd_1(rpm_32));
    }

    public static void id_class(int n) {
        if (rme_3.id_class != n) {
            ((Aq_1)((cb_3)rrfo_3.id_import.id_class[rrfo_3.id_class[5]]).id_break[id_class[6]]).id_class(new rme_3(n));
            ((Ax_1)rrfo_3.id_import.id_class[rrfo_3.id_class[7]]).id_break = n;
        }
    }

    public static boolean id_class(float f) {
        boolean bl = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_class[8]]).id_private().a().aJ_();
        boolean bl2 = ((cb_3)rrfo_3.id_import.id_class[id_class[9]]).id_class(f, bl) > id_byte[1] ? id_throws[0] : id_throws[1];
        boolean bl3 = (float)(System.currentTimeMillis() - ((Ax_1)rrfo_3.id_import.id_class[rrfo_3.id_class[10]]).id_protected) < id_byte[2] ? id_throws[2] : id_throws[3];
        return bl2 || bl3 ? id_throws[4] : id_throws[5];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{13, -89, 13, 35, 55, -62, -25, 87}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static boolean id_class(iB_2 iB_22) {
        boolean bl = id_throws[12];
        for (rdn_3 rdn_32 : iB_22.PV()) {
            if (!rdn_32.id_class() && rrfH_2.id_class(rdn_32.id_break())) continue;
            bl = id_throws[13];
            break;
        }
        return bl;
    }

    public static boolean id_class(float f, float f2, float f3) {
        yt_3 yt_32 = ((yX_2)rrfo_3.id_import.id_class[id_class[14]]).id_static();
        if (yt_32 == null) {
            return id_throws[11];
        }
        return yt_32.id_break(f, f2, f3);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x615F1C3971115F23L;
    }

    public static boolean id_class() {
        rJr_1 rJr_12 = (rJr_1)((cb_3)rrfo_3.id_import.id_class[rrfo_3.id_class[20]]).id_implements[id_class[21]];
        if (rJr_12 != null && rJr_12.id_case != 0 && !(rJr_12 instanceof rXi_1)) {
            return id_throws[17];
        }
        return id_throws[18];
    }

    public static void id_break() {
        rrfo_3.id_case();
        id_import.id_break(new mt_3(new rrvL(), id_import, (Ak_1)rrfp_3.id_class[id_class[15]]));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean id_break(int n) {
        boolean bl;
        rdn_3 rdn_32 = ((cb_3)rrfo_3.id_import.id_class[id_class[11]]).id_class(rXQ.FEET);
        if (!rdn_32.id_class()) {
            Pair[] pairArray = new Pair[id_throws[6]];
            pairArray[rrfo_3.id_throws[7]] = Pair.of((Object)n, (Object)eY_2.id_implements);
            if (rrfH_2.id_class(rdn_32, pairArray)) {
                bl = id_throws[8];
                return bl;
            }
        }
        bl = id_throws[9];
        return bl;
    }

    public static double id_throws() {
        double d = id_protected[3];
        for (rdn_3 rdn_32 : ((cb_3)rrfo_3.id_import.id_class[id_class[12]]).PV()) {
            d += rrfH_2.id_byte(rdn_32);
        }
        return d;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfo_3.id_catch();
        rrfo_3.id_extends();
        rrfo_3.id_private();
        rrfo_3.id_finally();
        rrfo_3.id_implements();
    }

    private static void id_finally() {
        double[] dArray = new double[4];
        dArray[1] = 0.1f;
        id_protected = dArray;
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[19];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[12] = true;
        blArray[15] = true;
        blArray[17] = true;
        id_throws = blArray;
    }

    private static void id_extends() {
        id_break = new String[]{new String("menu.savingLevel")};
    }

    public static void id_case() {
        boolean bl = id_import.id_switch();
        ((gm_3)rrfo_3.id_import.id_class[id_class[16]]).id_catch();
        if (bl) {
            id_import.id_byte(new ZE(new rgn_3(id_break[0])));
        } else {
            id_import.id_transient();
        }
        if (bl) {
            id_import.id_break(new rrvL());
        } else {
            id_import.id_break(new vG_2(new rrvL()));
        }
    }

    private static void id_implements() {
        id_byte = new float[]{0.5f, 0.9f, 500.0f};
    }

    public static boolean id_protected() {
        return rrfo_3.id_class(id_byte[0]);
    }

    private static void id_private() {
        short[] sArray = new short[22];
        sArray[0] = 56;
        sArray[1] = 57;
        sArray[2] = 57;
        sArray[3] = 57;
        sArray[5] = 57;
        sArray[7] = 55;
        sArray[9] = 57;
        sArray[10] = 55;
        sArray[11] = 57;
        sArray[12] = 57;
        sArray[13] = 8;
        sArray[14] = 8;
        sArray[16] = 56;
        sArray[17] = 57;
        sArray[18] = 57;
        sArray[19] = 57;
        sArray[20] = 57;
        sArray[21] = 4;
        id_class = sArray;
    }
}

