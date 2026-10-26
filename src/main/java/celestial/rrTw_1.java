/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTw_1 {
    private static boolean[] id_break;
    private static short[] id_byte;
    public Object[] id_class;
    private static byte[] id_protected;

    private static void id_byte() {
        id_protected = new byte[]{2};
    }

    public rrTw_1(int n) {
        this.id_case();
        Integer n2 = n;
        this.id_class[rrTw_1.id_byte[0]] = n2;
    }

    static {
        rrTw_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-66, 88, 79, 51, -92, 42, 109, -116}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_class() {
        return (Integer)this.id_class[id_byte[5]] > 0 ? id_break[1] : id_break[2];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC547F2B47692ACCDL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x30D6B815;
    }

    public void id_class(Runnable runnable) {
        if ((Integer)this.id_class[id_byte[1]] <= 0) {
            runnable.run();
        } else {
            rrTw_1 rrTw_12 = this;
            int n = (Integer)rrTw_12.id_class[id_byte[2]] + id_break[0];
            Integer n2 = n;
            rrTw_12.id_class[rrTw_1.id_byte[3]] = n2;
            if (n >= (Integer)this.id_class[id_byte[4]]) {
                runnable.run();
                this.id_break();
            }
        }
    }

    public void id_break() {
        Integer n = id_break[3];
        this.id_class[rrTw_1.id_byte[6]] = n;
    }

    private static void id_throws() {
        short[] sArray = new short[7];
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[6] = 1;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTw_1.id_protected();
        rrTw_1.id_throws();
        rrTw_1.id_byte();
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[rrTw_1.id_break[4]] = id_break[5];
            objectArray[rrTw_1.id_break[6]] = id_break[7];
        }
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[1] = true;
        blArray[6] = true;
        id_break = blArray;
    }
}

