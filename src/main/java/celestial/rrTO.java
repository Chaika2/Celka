/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrTB;
import celestial.rrTE;
import celestial.rrTM;
import celestial.rrTS;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTO
extends rrTB {
    private static String[] id_break;
    private static short[] id_byte;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{12, -104, 15, 94, 29, -49, -3, 63}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrTO() {
        super((rrTS)((Object)rrTS.staticFields35fc53f9a5633735b32b94862e310fdb[id_byte[0]]), id_break[0], (rrTE[])rrTM.id_class[id_byte[1]]);
    }

    static {
        rrTO.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE5C980E91F978340L;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB3DE1CDB;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTO.id_private();
        rrTO.id_implements();
    }

    private static void id_implements() {
        id_byte = new short[2];
    }

    private static void id_private() {
        id_break = new String[]{new String("\u0410\u0438\u0440 \u0434\u0440\u043e\u043f")};
    }
}

