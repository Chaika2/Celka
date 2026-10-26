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

public class rrTd_1
extends rrTB {
    private static short[] id_break;
    private static String[] id_byte;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-15, 21, 117, -66, -77, -39, 18, -21}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrTd_1() {
        super((rrTS)((Object)rrTS.staticFields35fc53f9a5633735b32b94862e310fdb[id_break[0]]), id_byte[0], (rrTE[])rrTM.id_class[id_break[1]]);
    }

    static {
        rrTd_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3A2CD15059371465L;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7BDB9661;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTd_1.id_private();
        rrTd_1.id_implements();
    }

    private static void id_implements() {
        short[] sArray = new short[2];
        sArray[1] = 6;
        id_break = sArray;
    }

    private static void id_private() {
        id_byte = new String[]{new String("\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d")};
    }
}

