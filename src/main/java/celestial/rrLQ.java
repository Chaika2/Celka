/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rmG_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLQ {
    public Object[] id_class;
    private static short[] id_byte;
    private static byte[] id_protected;
    public static Object[] id_break;
    private static boolean[] id_throws;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }

    public rrLQ() {
        this.id_byte();
    }

    static {
        rrLQ.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA421DA850AEF2A56L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{45, -100, -64, 70, -96, 126, 7, 117}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x52F32848;
    }

    public static rrLQ id_class(an_3 an_32, List<rmG_2<?>> list) {
        List<rmG_2<?>> list2;
        an_3 an_33 = an_32;
        ((rrLQ)rrLQ.id_break[rrLQ.id_byte[0]]).id_class[rrLQ.id_byte[1]] = an_33;
        ((rrLQ)rrLQ.id_break[rrLQ.id_byte[2]]).id_class[rrLQ.id_byte[3]] = list2 = list;
        return (rrLQ)id_break[id_byte[4]];
    }

    public an_3 id_class() {
        return (an_3)this.id_class[id_byte[5]];
    }

    public List<rmG_2<?>> id_break() {
        return (List)this.id_class[id_byte[6]];
    }

    private static void id_throws() {
        id_protected = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrLQ.id_catch();
        rrLQ.id_case();
        rrLQ.id_throws();
        rrLQ.id_protected();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_throws = blArray;
    }

    private static void id_case() {
        short[] sArray = new short[7];
        sArray[3] = 1;
        sArray[6] = 1;
        id_byte = sArray;
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrLQ()};
        id_break = objectArray;
    }
}

