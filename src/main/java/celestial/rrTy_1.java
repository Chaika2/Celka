/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PX;
import celestial.cb_3;
import celestial.rrTC;
import celestial.rrTT;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTy_1
extends rrTC {
    private static boolean[] id_protected;
    private static short[] id_throws;
    public Object[] id_byte;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-62, 5, -121, 78, -58, 38, 79, -98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrTy_1(rrTT rrTT2) {
        super(rrTT2.id_this());
        this.id_implements();
        rrTT rrTT3 = rrTT2;
        this.id_byte[rrTy_1.id_throws[0]] = rrTT3;
    }

    static {
        rrTy_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAB7EF9FFB127AC77L;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7650A8EA;
    }

    @Override
    public PX id_throws() {
        this.id_implements();
        return ((rrTT)this.id_byte[id_throws[1]]).id_new().orElseGet(() -> ((cb_3)rrTy_1.id_import.id_class[id_throws[2]]).rO());
    }

    private static /* synthetic */ void ntfClinit() {
        rrTy_1.id_case();
        rrTy_1.id_catch();
    }

    private static void id_catch() {
        short[] sArray = new short[3];
        sArray[2] = 57;
        id_throws = sArray;
    }

    private static void id_case() {
        id_protected = new boolean[]{true};
    }

    private void id_implements() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_protected[0]];
        }
    }
}

