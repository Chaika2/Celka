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

public class rrTX
extends rrTB {
    private static short[] id_break;
    private static String[] id_byte;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{0, -122, 6, 51, 106, -84, 1, -18}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrTX() {
        super((rrTS)((Object)rrTS.staticFields35fc53f9a5633735b32b94862e310fdb[id_break[0]]), id_byte[0], (rrTE[])rrTM.id_class[id_break[1]]);
    }

    static {
        rrTX.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x343E79964BEA80BL;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA3173912;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTX.id_implements();
        rrTX.id_private();
    }

    private static void id_implements() {
        id_byte = new String[]{new String("\u0421\u043e\u0441\u0442\u044f\u0437\u0430\u043d\u0438\u0435")};
    }

    private static void id_private() {
        short[] sArray = new short[2];
        sArray[1] = 1;
        id_break = sArray;
    }
}

