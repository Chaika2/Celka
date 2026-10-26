/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrvK;
import celestial.rrvU;
import celestial.rrvo_1;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrve_1
implements rrvU {
    private static float[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static byte[] id_throws;

    @Override
    public boolean id_byte() {
        return id_protected[1];
    }

    public rrve_1(rrvK rrvK2, String string, String string2) {
        this.id_private();
        rrvK rrvK3 = rrvK2;
        this.id_class[rrve_1.id_byte[0]] = rrvK3;
        AnimValue animValue = new AnimValue(id_break[0], id_protected[0]);
        this.id_class[rrve_1.id_byte[1]] = animValue;
        String string3 = string;
        this.id_class[rrve_1.id_byte[2]] = string3;
        String string4 = string2;
        this.id_class[rrve_1.id_byte[3]] = string4;
    }

    static {
        rrve_1.ntfClinit();
    }

    @Override
    public void id_class(boolean bl) {
        ((AnimValue)this.id_class[id_byte[7]]).id_class(bl);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB8C81BC0C4606617L;
    }

    @Override
    public String id_class() {
        return (String)this.id_class[id_byte[5]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x30887D21;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-93, 89, -115, 33, 108, -87, 63, 93}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public AnimValue id_break() {
        return (AnimValue)this.id_class[id_byte[6]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrve_1.id_throws();
        rrve_1.id_implements();
        rrve_1.id_finally();
        rrve_1.id_protected();
    }

    private static void id_finally() {
        id_break = new float[]{0.5f};
    }

    @Override
    public boolean id_catch() {
        return ((rrvo_1)((rrvK)this.id_class[rrve_1.id_byte[8]]).id_class[id_byte[9]]).id_super();
    }

    @Override
    public String id_case() {
        return (String)this.id_class[id_byte[4]];
    }

    private static void id_implements() {
        short[] sArray = new short[10];
        sArray[0] = 3;
        sArray[1] = 2;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[8] = 3;
        id_byte = sArray;
    }

    private static void id_protected() {
        id_throws = new byte[]{4};
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
        }
    }
}

