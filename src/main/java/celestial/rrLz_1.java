/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.cb_3;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rjU_2;
import celestial.rqr_3;
import celestial.rrQX;
import celestial.rrfQ_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLz_1
implements MinecraftAccessor {
    private static float[] id_byte;
    private static boolean[] id_protected;
    private static byte[] id_throws;
    public static Object[] id_class;
    public Object[] id_break;
    private static short[] id_case;

    public void id_byte(boolean bl) {
        Boolean bl2 = bl;
        this.id_break[rrLz_1.id_case[40]] = bl2;
    }

    public float id_byte() {
        return (float)Math.sqrt(((rjU_2)this.id_break[rrLz_1.id_case[22]]).id_break * ((rjU_2)this.id_break[rrLz_1.id_case[23]]).id_break + ((rjU_2)this.id_break[rrLz_1.id_case[24]]).id_protected * ((rjU_2)this.id_break[rrLz_1.id_case[25]]).id_protected);
    }

    public rrLz_1() {
        this.id_volatile();
    }

    static {
        rrLz_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x64E6DC513C6353ABL;
    }

    public void id_class(rfl_3 rfl_32) {
        rfl_3 rfl_33 = rfl_32;
        this.id_break[rrLz_1.id_case[36]] = rfl_33;
    }

    public void id_class(float f) {
        float f2 = ((cb_3)rrLz_1.id_import.id_class[id_case[15]]).sO();
        float f3 = ((rqr_3)((cb_3)rrLz_1.id_import.id_class[rrLz_1.id_case[16]]).id_break[rrLz_1.id_case[17]]).id_byte;
        float f4 = ((rqr_3)((cb_3)rrLz_1.id_import.id_class[rrLz_1.id_case[18]]).id_break[rrLz_1.id_case[19]]).id_break;
        if (f3 != id_byte[0]) {
            if (f4 > id_byte[1]) {
                f2 += (float)(f3 > id_byte[2] ? id_throws[0] : id_throws[1]);
            } else if (f4 < id_byte[3]) {
                f2 += (float)(f3 > id_byte[4] ? id_throws[2] : id_throws[3]);
            }
            f4 = id_byte[5];
            if (f3 > id_byte[6]) {
                f3 = id_byte[7];
            } else if (f3 < id_byte[8]) {
                f3 = id_byte[9];
            }
        }
        double d = rfU_2.id_break(rrfQ_2.id_class(f2 + id_byte[10]));
        double d2 = rfU_2.id_class(rrfQ_2.id_class(f2 + id_byte[11]));
        ((rjU_2)this.id_break[rrLz_1.id_case[20]]).id_break = (double)(f3 * f) * d + (double)(f4 * f) * d2;
        ((rjU_2)this.id_break[rrLz_1.id_case[21]]).id_protected = (double)(f3 * f) * d2 - (double)(f4 * f) * d;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x97811E9A;
    }

    public static rrLz_1 id_class(rjU_2 rjU_22, rjU_2 rjU_23, rfl_3 rfl_32, boolean bl, boolean bl2, boolean bl3) {
        rrLz_1 rrLz_12 = rrLz_1.id_break(rjU_22, rjU_23, rfl_32, bl, bl2, bl3);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_case[13]]).id_class(rrLz_12);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[14]]).id_finally().id_class(rrLz_12);
        return rrLz_12;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{45, 75, -18, -63, -108, -47, -61, -110}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_class() {
        return (Boolean)this.id_break[id_case[31]];
    }

    public void id_class(rjU_2 rjU_22) {
        rjU_2 rjU_23 = rjU_22;
        this.id_break[rrLz_1.id_case[34]] = rjU_23;
    }

    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_break[rrLz_1.id_case[37]] = bl2;
    }

    public static rrLz_1 id_break(rjU_2 rjU_22, rjU_2 rjU_23, rfl_3 rfl_32, boolean bl, boolean bl2, boolean bl3) {
        rjU_2 rjU_24 = rjU_22;
        ((rrLz_1)rrLz_1.id_class[rrLz_1.id_case[0]]).id_break[rrLz_1.id_case[1]] = rjU_24;
        rjU_2 rjU_25 = rjU_23;
        ((rrLz_1)rrLz_1.id_class[rrLz_1.id_case[2]]).id_break[rrLz_1.id_case[3]] = rjU_25;
        rfl_3 rfl_33 = rfl_32;
        ((rrLz_1)rrLz_1.id_class[rrLz_1.id_case[4]]).id_break[rrLz_1.id_case[5]] = rfl_33;
        Boolean bl4 = bl;
        ((rrLz_1)rrLz_1.id_class[rrLz_1.id_case[6]]).id_break[rrLz_1.id_case[7]] = bl4;
        Boolean bl5 = bl2;
        ((rrLz_1)rrLz_1.id_class[rrLz_1.id_case[8]]).id_break[rrLz_1.id_case[9]] = bl5;
        Boolean bl6 = bl3;
        ((rrLz_1)rrLz_1.id_class[rrLz_1.id_case[10]]).id_break[rrLz_1.id_case[11]] = bl6;
        return (rrLz_1)id_class[id_case[12]];
    }

    public rjU_2 id_break() {
        return (rjU_2)this.id_break[id_case[27]];
    }

    public void id_break(boolean bl) {
        Boolean bl2 = bl;
        this.id_break[rrLz_1.id_case[39]] = bl2;
    }

    public void id_break(rjU_2 rjU_22) {
        rjU_2 rjU_23 = rjU_22;
        this.id_break[rrLz_1.id_case[35]] = rjU_23;
    }

    public boolean id_throws() {
        return (Boolean)this.id_break[id_case[29]];
    }

    public void id_throws(boolean bl) {
        Boolean bl2 = bl;
        this.id_break[rrLz_1.id_case[41]] = bl2;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLz_1.id_finally();
        rrLz_1.id_package();
        rrLz_1.id_native();
        rrLz_1.id_extends();
        rrLz_1.id_final();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[7];
        blArray[6] = true;
        id_protected = blArray;
    }

    public rjU_2 id_catch() {
        return (rjU_2)this.id_break[id_case[26]];
    }

    private static void id_extends() {
        id_throws = new byte[]{-45, 45, 45, -45, 8, 3, 4, 5, 6, 7};
    }

    public boolean id_case() {
        return (Boolean)this.id_break[id_case[30]];
    }

    public rfl_3 id_implements() {
        return (rfl_3)this.id_break[id_case[28]];
    }

    private static void id_package() {
        short[] sArray = new short[42];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[7] = 4;
        sArray[9] = 5;
        sArray[11] = 3;
        sArray[15] = 57;
        sArray[16] = 57;
        sArray[17] = 17;
        sArray[18] = 57;
        sArray[19] = 17;
        sArray[27] = 1;
        sArray[28] = 2;
        sArray[29] = 3;
        sArray[30] = 4;
        sArray[31] = 5;
        sArray[32] = 6;
        sArray[33] = 7;
        sArray[35] = 1;
        sArray[36] = 2;
        sArray[37] = 3;
        sArray[38] = 4;
        sArray[39] = 5;
        sArray[40] = 6;
        sArray[41] = 7;
        id_case = sArray;
    }

    public boolean id_protected() {
        return (Boolean)this.id_break[id_case[33]];
    }

    public void id_protected(boolean bl) {
        Boolean bl2 = bl;
        this.id_break[rrLz_1.id_case[38]] = bl2;
    }

    public boolean id_private() {
        return (Boolean)this.id_break[id_case[32]];
    }

    private static void id_final() {
        Object[] objectArray = new Object[]{new rrLz_1()};
        id_class = objectArray;
    }

    private void id_volatile() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[4]];
            objectArray[rrLz_1.id_throws[5]] = id_protected[1];
            objectArray[rrLz_1.id_throws[6]] = id_protected[2];
            objectArray[rrLz_1.id_throws[7]] = id_protected[3];
            objectArray[rrLz_1.id_throws[8]] = id_protected[4];
            objectArray[rrLz_1.id_throws[9]] = id_protected[5];
        }
    }

    private static void id_native() {
        float[] fArray = new float[12];
        fArray[7] = 1.0f;
        fArray[9] = -1.0f;
        fArray[10] = 90.0f;
        fArray[11] = 90.0f;
        id_byte = fArray;
    }
}

