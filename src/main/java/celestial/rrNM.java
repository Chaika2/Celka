/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import celestial.rrNG;
import celestial.rrQK;
import celestial.rrQo_1;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNM
implements rrNG,
MinecraftAccessor {
    private static byte[] id_byte;
    public Object[] id_class;
    private static double[] id_protected;
    private static short[] id_throws;
    public static Object[] id_break;
    private static float[] id_case;
    private static boolean[] id_catch;

    @Override
    public float id_byte() {
        return ((Float)this.id_class[id_throws[13]]).floatValue();
    }

    public rrNM(float f) {
        this((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_throws[3]]), f);
    }

    public rrNM(rrQK rrQK2, float f) {
        this.id_volatile();
        Boolean bl = id_catch[0];
        this.id_class[rrNM.id_throws[0]] = bl;
        Float f2 = Float.valueOf(f);
        this.id_class[rrNM.id_throws[1]] = f2;
        rrQK rrQK3 = rrQK2;
        this.id_class[rrNM.id_throws[2]] = rrQK3;
    }

    static {
        rrNM.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-1, -62, 61, 40, -21, -15, 104, -123}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC03E7AE9498F2F70L;
    }

    public void id_class(boolean bl) {
        Float f = Float.valueOf(bl ? id_case[0] : id_case[1]);
        this.id_class[rrNM.id_throws[4]] = f;
        if (this.id_protected()) {
            return;
        }
        double d = (Double)rrQo_1.id_class[id_throws[5]] * id_protected[0];
        Float f2 = Float.valueOf((float)rfU_2.id_class((double)((Float)this.id_class[id_throws[6]]).floatValue() + (bl ? (double)((Float)this.id_class[id_throws[7]]).floatValue() * d : (double)(-((Float)this.id_class[id_throws[8]]).floatValue()) * d), id_protected[1], id_protected[2]));
        this.id_class[rrNM.id_throws[9]] = f2;
        Float f3 = Float.valueOf((float)((rrQK)((Object)this.id_class[id_throws[10]])).id_class(((Float)this.id_class[id_throws[11]]).floatValue()));
        this.id_class[rrNM.id_throws[12]] = f3;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x53D1FB33;
    }

    public float id_class() {
        if (((Float)this.id_class[id_throws[15]]).floatValue() > id_case[2]) {
            return ((Float)this.id_class[id_throws[16]]).floatValue() - this.id_byte();
        }
        return id_case[3] - this.id_byte();
    }

    public void id_break() {
        Float f = Float.valueOf(id_case[4]);
        this.id_class[rrNM.id_throws[17]] = f;
        Float f2 = Float.valueOf(id_case[5]);
        this.id_class[rrNM.id_throws[18]] = f2;
        Float f3 = Float.valueOf(id_case[6]);
        this.id_class[rrNM.id_throws[19]] = f3;
    }

    public void id_throws() {
        Float f = Float.valueOf(id_case[7]);
        this.id_class[rrNM.id_throws[20]] = f;
        Float f2 = Float.valueOf(id_case[8]);
        this.id_class[rrNM.id_throws[21]] = f2;
    }

    private static /* synthetic */ void ntfClinit() {
        rrNM.id_native();
        rrNM.id_final();
        rrNM.id_private();
        rrNM.id_extends();
        rrNM.id_finally();
        rrNM.id_implements();
    }

    private static void id_finally() {
        id_byte = new byte[]{6, 2, 3, 4, 5};
    }

    public float id_catch() {
        if (((Float)this.id_class[id_throws[22]]).floatValue() >= id_case[9]) {
            Boolean bl = id_catch[5];
            this.id_class[rrNM.id_throws[23]] = bl;
        } else if (((Float)this.id_class[id_throws[24]]).floatValue() <= id_case[10]) {
            Boolean bl = id_catch[6];
            this.id_class[rrNM.id_throws[25]] = bl;
        }
        this.id_class((Boolean)this.id_class[id_throws[26]]);
        return ((Float)this.id_class[id_throws[27]]).floatValue();
    }

    private static void id_extends() {
        double[] dArray = new double[6];
        dArray[0] = 0.01;
        dArray[2] = 1.0;
        dArray[3] = 1.0E-10;
        dArray[4] = 1.0E-10;
        dArray[5] = 1.0E-10;
        id_protected = dArray;
    }

    @Override
    public boolean id_case() {
        return (double)this.id_byte() > id_protected[3] ? id_catch[1] : id_catch[2];
    }

    private static void id_implements() {
        Object[] objectArray = new Object[]{1.0E-10};
        id_break = objectArray;
    }

    @Override
    public boolean id_protected() {
        return (double)Math.abs(this.id_byte() - ((Float)this.id_class[id_throws[14]]).floatValue()) < id_protected[4] ? id_catch[3] : id_catch[4];
    }

    private static void id_private() {
        float[] fArray = new float[15];
        fArray[0] = 1.0f;
        fArray[2] = 1.0f;
        fArray[3] = 1.0f;
        fArray[7] = 1.0f;
        fArray[8] = 1.0f;
        fArray[9] = 1.0f;
        id_case = fArray;
    }

    private static void id_final() {
        short[] sArray = new short[28];
        sArray[0] = 5;
        sArray[1] = 1;
        sArray[4] = 3;
        sArray[6] = 4;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[9] = 4;
        sArray[11] = 4;
        sArray[12] = 2;
        sArray[13] = 2;
        sArray[14] = 3;
        sArray[15] = 3;
        sArray[16] = 3;
        sArray[17] = 2;
        sArray[18] = 4;
        sArray[19] = 3;
        sArray[20] = 2;
        sArray[21] = 3;
        sArray[22] = 4;
        sArray[23] = 5;
        sArray[24] = 4;
        sArray[25] = 5;
        sArray[26] = 5;
        sArray[27] = 2;
        id_throws = sArray;
    }

    private void id_volatile() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrNM.id_catch[7]] = Float.valueOf(id_case[11]);
            objectArray[rrNM.id_byte[1]] = Float.valueOf(id_case[12]);
            objectArray[rrNM.id_byte[2]] = Float.valueOf(id_case[13]);
            objectArray[rrNM.id_byte[3]] = Float.valueOf(id_case[14]);
            objectArray[rrNM.id_byte[4]] = id_catch[8];
        }
    }

    private static void id_native() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[9] = true;
        id_catch = blArray;
    }
}

