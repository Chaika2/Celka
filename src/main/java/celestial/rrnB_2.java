/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.Qw_1;
import celestial.cb_3;
import celestial.gm_3;
import celestial.rrQX;
import celestial.rrnE_2;
import celestial.rrvT;
import celestial.rrvk_1;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnB_2
implements MinecraftAccessor {
    private static float[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;
    private static double[] id_throws;
    public static Object[] id_break;
    private static boolean[] id_case;
    private static byte[] id_catch;

    private static void id_byte() {
        id_byte = new float[1];
    }

    public rrnB_2() {
        this.id_case();
    }

    static {
        rrnB_2.ntfClinit();
    }

    public Ml_1 id_class() {
        return (Ml_1)this.id_class[id_protected[13]];
    }

    public static void id_class(Ml_1 ml_1, float f) {
        boolean bl;
        rrnB_2 rrnB_22 = rrnB_2.id_break(ml_1, f);
        boolean bl2 = bl = ((Qw_1)rrnB_2.id_import.id_class[rrnB_2.id_protected[5]]).rs != id_catch[0] ? id_case[0] : id_case[1];
        if (bl) {
            rrnE_2.id_class(id_throws[0]);
        }
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[6]]).id_finally().id_class(rrnB_22);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[7]]).id_class().id_class(ml_1, (int)((Integer)rrvk_1.id_class[id_protected[8]]), (int)((Integer)rrvk_1.id_class[id_protected[9]]));
        if (bl) {
            rrnE_2.id_class(id_const.id_return());
        }
        if ((cb_3)rrnB_2.id_import.id_class[id_protected[10]] != null && (gm_3)rrnB_2.id_import.id_class[id_protected[11]] != null) {
            rrvT rrvT2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[12]]).id_private();
            rrvT2.w().id_class(ml_1, f);
            rrvT2.id_this().id_class(f);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF95EEBA4;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4B0B73B00B691613L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-29, 127, 82, -13, -45, 99, -19, 63}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrnB_2 id_break(Ml_1 ml_1, float f) {
        Ml_1 ml_12 = ml_1;
        ((rrnB_2)rrnB_2.id_break[rrnB_2.id_protected[0]]).id_class[rrnB_2.id_protected[1]] = ml_12;
        Float f2 = Float.valueOf(f);
        ((rrnB_2)rrnB_2.id_break[rrnB_2.id_protected[2]]).id_class[rrnB_2.id_protected[3]] = f2;
        return (rrnB_2)id_break[id_protected[4]];
    }

    public float id_break() {
        return ((Float)this.id_class[id_protected[14]]).floatValue();
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[3] = true;
        blArray[4] = true;
        id_case = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrnB_2.id_throws();
        rrnB_2.id_implements();
        rrnB_2.id_private();
        rrnB_2.id_byte();
        rrnB_2.id_catch();
        rrnB_2.id_protected();
    }

    private static void id_catch() {
        id_catch = new byte[]{2, 2};
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_catch[1]];
            objectArray[rrnB_2.id_case[3]] = Float.valueOf(id_byte[0]);
        }
    }

    private static void id_implements() {
        short[] sArray = new short[15];
        sArray[3] = 1;
        sArray[5] = 20;
        sArray[9] = 1;
        sArray[10] = 57;
        sArray[11] = 56;
        sArray[14] = 1;
        id_protected = sArray;
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrnB_2()};
        id_break = objectArray;
    }

    private static void id_private() {
        id_throws = new double[]{2.0};
    }
}

