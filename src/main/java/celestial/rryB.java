/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import celestial.rfl_3;
import celestial.rjU_2;
import celestial.rqR_2;
import celestial.rrQK;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rryB {
    private static float[] id_class;
    private static boolean[] id_byte;
    private static long[] id_protected;
    private static byte[] id_throws;
    private static short[] id_case;
    public Object[] id_break;

    public abstract rfl_3 id_byte();

    private void id_int() {
        if (this.id_break == null) {
            this.id_break = new Object[7];
            this.id_break[1] = 0L;
            this.id_break[2] = 0;
            this.id_break[3] = Float.valueOf(0.0f);
            this.id_break[4] = false;
            this.id_break[5] = false;
        }
    }

    public rryB() {
        this.id_int();
        UUID uUID = UUID.randomUUID();
        this.id_break[rryB.id_case[0]] = uUID;
        Long l = rqR_2.id_break();
        this.id_break[rryB.id_case[1]] = l;
        AnimValue animValue = new AnimValue((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_case[2]]), id_class[0], id_byte[0]);
        this.id_break[rryB.id_case[3]] = animValue;
    }

    static {
        rryB.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3CB5794C7A4E6E51L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x99D6BAE;
    }

    public abstract rjU_2 id_class();

    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_break[rryB.id_case[16]] = bl2;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-115, 20, 30, 30, 44, 114, 8, -82}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public abstract rdn_3 id_break();

    public abstract long id_throws();

    private static /* synthetic */ void ntfClinit() {
        rryB.id_package();
        rryB.id_continue();
        rryB.id_super();
        rryB.id_protected();
        rryB.id_new();
    }

    public AnimValue id_finally() {
        return (AnimValue)this.id_break[id_case[15]];
    }

    public UUID id_catch() {
        return (UUID)this.id_break[id_case[9]];
    }

    public boolean id_extends() {
        return (Boolean)this.id_break[id_case[13]];
    }

    public abstract String id_case();

    private static void id_continue() {
        long[] lArray = new long[3];
        lArray[0] = 1000L;
        lArray[1] = 1000L;
        id_protected = lArray;
    }

    public int id_implements() {
        return (Integer)this.id_break[id_case[11]];
    }

    private static void id_new() {
        id_throws = new byte[]{7, 2, 3, 4, 5};
    }

    private static void id_package() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[3] = true;
        id_byte = blArray;
    }

    private static void id_super() {
        short[] sArray = new short[17];
        sArray[1] = 1;
        sArray[2] = 3;
        sArray[3] = 6;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 3;
        sArray[8] = 4;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[12] = 3;
        sArray[13] = 4;
        sArray[14] = 5;
        sArray[15] = 6;
        sArray[16] = 5;
        id_case = sArray;
    }

    private static void id_protected() {
        float[] fArray = new float[4];
        fArray[0] = 1.0f;
        fArray[1] = 1.0f;
        fArray[2] = 1.0f;
        id_class = fArray;
    }

    public long id_private() {
        return (Long)this.id_break[id_case[10]];
    }

    public boolean id_final() {
        return (Boolean)this.id_break[id_case[14]];
    }

    public float id_volatile() {
        return ((Float)this.id_break[id_case[12]]).floatValue();
    }

    public void id_native() {
        long l = rqR_2.id_break();
        long l2 = l - (Long)this.id_break[id_case[4]];
        long l3 = this.id_throws();
        Integer n = (int)(l3 - l2 / id_protected[0]);
        this.id_break[rryB.id_case[5]] = n;
        Float f = Float.valueOf(Math.min(id_class[1], (float)l2 / (float)(l3 * id_protected[1])));
        this.id_break[rryB.id_case[6]] = f;
        Boolean bl = ((Float)this.id_break[id_case[7]]).floatValue() >= id_class[2] ? id_byte[1] : id_byte[2];
        this.id_break[rryB.id_case[8]] = bl;
    }
}

