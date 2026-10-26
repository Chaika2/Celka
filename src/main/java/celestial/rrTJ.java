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

public class rrTJ
extends rrTB {
    private static String[] id_break;
    private static short[] id_byte;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-37, 100, -96, -82, -14, -66, -65, 25}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrTJ() {
        super((rrTS)((Object)rrTS.staticFields35fc53f9a5633735b32b94862e310fdb[id_byte[0]]), id_break[0], (rrTE[])rrTM.id_class[id_byte[1]]);
    }

    static {
        rrTJ.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCAB63C9FFB497545L;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x43771582;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTJ.id_private();
        rrTJ.id_implements();
    }

    private static void id_implements() {
        short[] sArray = new short[2];
        sArray[1] = 5;
        id_byte = sArray;
    }

    private static void id_private() {
        id_break = new String[]{new String("\u0421\u043a\u0440\u0443\u0434\u0436")};
    }
}

