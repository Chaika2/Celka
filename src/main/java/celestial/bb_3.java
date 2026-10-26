/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.D;
import celestial.bM_2;
import celestial.rVi_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class bb_3
implements D {
    private static boolean[] id_class;
    private static short[] id_break;
    private static byte[] id_protected;
    public Object[] id_byte;

    public C_class id_byte() {
        return (C_class)this.id_byte[id_break[7]];
    }

    public bb_3(C_class c_class, bM_2 bM_22) {
        this.id_catch();
        C_class c_class2 = c_class;
        this.id_byte[bb_3.id_break[0]] = c_class2;
        bM_2 bM_23 = bM_22;
        this.id_byte[bb_3.id_break[1]] = bM_23;
    }

    static {
        bb_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x69C4DACBF2AEF56FL;
    }

    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_byte[bb_3.id_break[3]] = bl2;
        if (((Boolean)this.id_byte[id_break[4]]).booleanValue()) {
            ((bM_2)this.id_byte[id_break[5]]).id_break(this);
        } else {
            ((bM_2)this.id_byte[id_break[6]]).id_byte(this);
        }
    }

    public void id_class(rVi_1 rVi_12) {
        ((bM_2)this.id_byte[id_break[2]]).id_class(this, rVi_12);
    }

    public void id_class() {
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE6969144;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{7, -24, -125, -29, 56, 126, 95, 67}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public bM_2 id_break() {
        return (bM_2)this.id_byte[id_break[8]];
    }

    private static void id_throws() {
        id_protected = new byte[]{3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        bb_3.id_private();
        bb_3.id_case();
        bb_3.id_throws();
    }

    private void id_catch() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_protected[0]];
            objectArray[bb_3.id_protected[1]] = id_class[0];
        }
    }

    private static void id_case() {
        short[] sArray = new short[10];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 2;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[8] = 1;
        sArray[9] = 2;
        id_break = sArray;
    }

    public boolean id_protected() {
        return (Boolean)this.id_byte[id_break[9]];
    }

    private static void id_private() {
        id_class = new boolean[1];
    }
}

