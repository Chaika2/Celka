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

public class rrTh_1
extends rrTB {
    private static short[] id_break;
    private static String[] id_byte;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{65, -50, 14, 98, 80, -90, 84, 13}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrTh_1() {
        super((rrTS)((Object)rrTS.staticFields35fc53f9a5633735b32b94862e310fdb[id_break[0]]), id_byte[0], (rrTE[])rrTM.id_class[id_break[1]]);
    }

    static {
        rrTh_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x702D86FDC8A73163L;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE37A02B9;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTh_1.id_implements();
        rrTh_1.id_private();
    }

    private static void id_implements() {
        id_byte = new String[]{new String("\u0411\u0438\u0442\u0432\u0430 \u0441 \u0431\u043e\u0441\u0441\u043e\u043c")};
    }

    private static void id_private() {
        short[] sArray = new short[2];
        sArray[1] = 3;
        id_break = sArray;
    }
}

