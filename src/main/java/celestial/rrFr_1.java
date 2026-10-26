/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import celestial.rrQK;
import celestial.rrZO;
import celestial.util.AnimValue;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrFr_1
implements MinecraftAccessor {
    private static byte[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static String[] id_throws;
    private static float[] id_case;

    private static long id_byte(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD2A08563F409655L;
    }

    public abstract boolean id_byte();

    private static void id_int() {
        id_throws = new String[]{new String("")};
    }

    public rrFr_1() {
        this.id_extends();
        AnimValue animValue = new AnimValue((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_protected[0]]), id_case[0], id_byte[0]);
        this.id_class[rrFr_1.id_protected[1]] = animValue;
        AnimValue animValue2 = new AnimValue(id_case[1], id_byte[1]).id_package();
        this.id_class[rrFr_1.id_protected[2]] = animValue2;
        AnimValue animValue3 = new AnimValue((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_protected[3]]), id_case[2], id_byte[2]);
        this.id_class[rrFr_1.id_protected[4]] = animValue3;
        AnimValue animValue4 = new AnimValue((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_protected[5]]), id_case[3], id_byte[3]);
        this.id_class[rrFr_1.id_protected[6]] = animValue4;
        Boolean bl = id_byte[4];
        this.id_class[rrFr_1.id_protected[7]] = bl;
        String string = id_throws[0];
        this.id_class[rrFr_1.id_protected[8]] = string;
    }

    static {
        rrFr_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{61, 76, -28, -29, 11, -95, 69, -111}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rrZO rrZO2) {
        this.id_break(rrZO2);
        String string = this.id_implements();
        if (!string.equals((String)this.id_class[id_protected[10]])) {
            String string2 = string;
            this.id_class[rrFr_1.id_protected[11]] = string2;
            Float f = Float.valueOf(id_case[5] + rrZO2.id_break(string) + id_case[6]);
            this.id_class[rrFr_1.id_protected[12]] = f;
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2F900F6;
    }

    public float id_class(long l) {
        return id_case[4];
    }

    public boolean id_class(boolean bl) {
        return bl && this.id_protected() ? id_byte[5] : id_byte[6];
    }

    public void id_class(float f, float f2) {
        if (!((Boolean)this.id_class[id_protected[18]]).booleanValue()) {
            ((AnimValue)this.id_class[id_protected[19]]).id_class(f);
            ((AnimValue)this.id_class[id_protected[20]]).id_class(f2);
            Boolean bl = id_byte[9];
            this.id_class[rrFr_1.id_protected[21]] = bl;
            return;
        }
        if (this.id_finally()) {
            ((AnimValue)this.id_class[id_protected[22]]).id_break(f);
            ((AnimValue)this.id_class[id_protected[23]]).id_break(f2);
        } else {
            ((AnimValue)this.id_class[id_protected[24]]).id_class(f);
            ((AnimValue)this.id_class[id_protected[25]]).id_class(f2);
        }
    }

    public void id_class(boolean bl, long l) {
        if (((Float)this.id_class[id_protected[13]]).floatValue() <= id_case[7]) {
            return;
        }
        boolean bl2 = this.id_class(bl);
        if (this.id_break(bl)) {
            if (this.id_throws()) {
                ((AnimValue)this.id_class[id_protected[14]]).id_class(bl2);
            } else {
                ((AnimValue)this.id_class[id_protected[15]]).id_class(bl2 ? id_case[8] : id_case[9]);
            }
        }
        ((AnimValue)this.id_class[id_protected[16]]).id_break(((Float)this.id_class[id_protected[17]]).floatValue());
        this.id_break(l);
    }

    public abstract rdn_3 id_class();

    public boolean id_break(boolean bl) {
        return id_byte[7];
    }

    public void id_break(long l) {
    }

    public void id_break(rrZO rrZO2) {
    }

    public float id_break() {
        return ((AnimValue)this.id_class[id_protected[27]]).id_byte();
    }

    public boolean id_throws() {
        return id_byte[8];
    }

    private static /* synthetic */ void ntfClinit() {
        rrFr_1.id_native();
        rrFr_1.id_int();
        rrFr_1.id_final();
        rrFr_1.id_package();
        rrFr_1.id_volatile();
    }

    public boolean id_finally() {
        return this.id_throws();
    }

    public float id_catch() {
        return ((AnimValue)this.id_class[id_protected[9]]).id_byte();
    }

    private void id_extends() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
            objectArray[rrFr_1.id_break[1]] = id_byte[11];
            objectArray[rrFr_1.id_break[2]] = Float.valueOf(id_case[10]);
        }
    }

    public void id_case() {
        Boolean bl = id_byte[10];
        this.id_class[rrFr_1.id_protected[26]] = bl;
    }

    public abstract String id_implements();

    private static void id_package() {
        float[] fArray = new float[11];
        fArray[0] = 0.4f;
        fArray[1] = 0.5f;
        fArray[2] = 0.4f;
        fArray[3] = 0.4f;
        fArray[5] = 14.0f;
        fArray[6] = 2.5f;
        fArray[8] = 1.0f;
        id_case = fArray;
    }

    public abstract boolean id_protected();

    public float id_private() {
        return ((AnimValue)this.id_class[id_protected[28]]).id_byte();
    }

    private static void id_final() {
        short[] sArray = new short[29];
        sArray[0] = 7;
        sArray[2] = 1;
        sArray[3] = 7;
        sArray[4] = 2;
        sArray[5] = 7;
        sArray[6] = 3;
        sArray[7] = 4;
        sArray[8] = 6;
        sArray[9] = 1;
        sArray[10] = 6;
        sArray[11] = 6;
        sArray[12] = 5;
        sArray[13] = 5;
        sArray[16] = 1;
        sArray[17] = 5;
        sArray[18] = 4;
        sArray[19] = 2;
        sArray[20] = 3;
        sArray[21] = 4;
        sArray[22] = 2;
        sArray[23] = 3;
        sArray[24] = 2;
        sArray[25] = 3;
        sArray[26] = 4;
        sArray[27] = 2;
        sArray[28] = 3;
        id_protected = sArray;
    }

    private static void id_volatile() {
        id_break = new byte[]{7, 4, 5};
    }

    private static void id_native() {
        boolean[] blArray = new boolean[12];
        blArray[5] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        id_byte = blArray;
    }
}

