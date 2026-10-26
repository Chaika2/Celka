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

public class rrTk_1
extends rrTB {
    private static String[] id_break;
    private static short[] id_byte;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{106, 119, -59, -107, -94, 8, -120, -12}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrTk_1() {
        super((rrTS)((Object)rrTS.staticFields35fc53f9a5633735b32b94862e310fdb[id_byte[0]]), id_break[0], (rrTE[])rrTM.id_class[id_byte[1]]);
    }

    static {
        rrTk_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3D0AED3CFE3EF20L;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x777DC09C;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTk_1.id_private();
        rrTk_1.id_implements();
    }

    private static void id_implements() {
        short[] sArray = new short[2];
        sArray[1] = 2;
        id_byte = sArray;
    }

    private static void id_private() {
        id_break = new String[]{new String("\u0422\u0430\u0439\u043d\u044b\u0439 \u0442\u043e\u0440\u0433\u043e\u0432\u0435\u0446")};
    }
}

