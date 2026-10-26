/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.Category;
import celestial.rrZI;
import celestial.rrZK;
import celestial.rrZN;
import celestial.rrZZ;
import celestial.rrZf_1;
import celestial.rrZj_1;
import celestial.rrZw_1;
import celestial.rrtu_3;
import celestial.rrvJ;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZm_1 {
    private static short[] id_break;
    private static byte[] id_byte;
    private static float[] id_protected;
    public Object[] id_class;

    public rrZK id_byte() {
        return (rrZK)this.id_class[id_break[21]];
    }

    public rrZm_1(rrvJ rrvJ2, rrtu_3 rrtu_32, int n) {
        ArrayList arrayList;
        this.id_implements();
        this.id_class[rrZm_1.id_break[0]] = arrayList = new ArrayList();
        rrZI rrZI2 = new rrZI(rrvJ2, rrtu_32, n + id_byte[0], id_byte[1]);
        this.id_class[rrZm_1.id_break[1]] = rrZI2;
        rrZw_1 rrZw_12 = new rrZw_1(rrvJ2, (float)n + id_protected[0], id_protected[1]);
        this.id_class[rrZm_1.id_break[2]] = rrZw_12;
        rrZf_1 rrZf_12 = new rrZf_1(rrvJ2, n + id_byte[2], id_byte[3]);
        this.id_class[rrZm_1.id_break[3]] = rrZf_12;
        rrZK rrZK2 = new rrZK(rrvJ2, rrtu_32, (float)n + id_protected[2], id_protected[3]);
        this.id_class[rrZm_1.id_break[4]] = rrZK2;
        rrZj_1 rrZj_12 = new rrZj_1(rrvJ2, rrtu_32, (float)n + id_protected[4], id_protected[5]);
        this.id_class[rrZm_1.id_break[5]] = rrZj_12;
        ((List)this.id_class[id_break[6]]).addAll(List.of((rrZI)this.id_class[id_break[7]], (rrZw_1)this.id_class[id_break[8]], (rrZf_1)this.id_class[id_break[9]], (rrZK)this.id_class[id_break[10]], (rrZj_1)this.id_class[id_break[11]]));
    }

    static {
        rrZm_1.ntfClinit();
    }

    public rrZf_1 id_class() {
        return (rrZf_1)this.id_class[id_break[20]];
    }

    public rrZN id_class(Category category) {
        return switch (((int[])rrZZ.id_class[id_break[12]])[category.ordinal()]) {
            default -> throw new IncompatibleClassChangeError();
            case 1, 2, 3, 4, 5 -> (rrZI)this.id_class[id_break[13]];
            case 6 -> (rrZK)this.id_class[id_break[14]];
            case 7 -> (rrZj_1)this.id_class[id_break[15]];
            case 8 -> (rrZw_1)this.id_class[id_break[16]];
            case 9 -> (rrZf_1)this.id_class[id_break[17]];
        };
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4567E6A6;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{92, -53, -6, 19, -120, 43, -40, -123}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA4085007732FAE36L;
    }

    public List<rrZN> id_break() {
        return (List)this.id_class[id_break[23]];
    }

    public rrZj_1 id_throws() {
        return (rrZj_1)this.id_class[id_break[22]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrZm_1.id_private();
        rrZm_1.id_catch();
        rrZm_1.id_finally();
    }

    private static void id_finally() {
        id_byte = new byte[]{7, 5, 7, 5, 6};
    }

    private static void id_catch() {
        id_protected = new float[]{6.5f, 10.0f, 6.5f, 10.0f, 6.5f, 10.0f};
    }

    public rrZw_1 id_case() {
        return (rrZw_1)this.id_class[id_break[19]];
    }

    private void id_implements() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[4]];
        }
    }

    public rrZI id_protected() {
        return (rrZI)this.id_class[id_break[18]];
    }

    private static void id_private() {
        short[] sArray = new short[24];
        sArray[0] = 5;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 4;
        sArray[6] = 5;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[10] = 3;
        sArray[11] = 4;
        sArray[14] = 3;
        sArray[15] = 4;
        sArray[16] = 1;
        sArray[17] = 2;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[21] = 3;
        sArray[22] = 4;
        sArray[23] = 5;
        id_break = sArray;
    }
}

