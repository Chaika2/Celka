/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JU;
import celestial.Wf_1;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rkG_2;
import celestial.rrjc_3;
import celestial.util.MinecraftAccessor;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjQ_2
implements MinecraftAccessor {
    private static short[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    private static String[] id_throws;
    public static Object[] id_class;

    private static void id_byte() {
        id_throws = new String[]{new String("\u0448\u0430\u0440"), new String("\u043f\u0430\u0441\u0445\u0430\u043b\u044c\u043d\u043e\u0435 \u044f\u0439\u0446\u043e"), new String("\u0433\u043e\u043b\u043e\u0432\u0430"), new String("\u0434\u0435\u0434-\u043c\u043e\u0440\u043e\u0437")};
    }

    static {
        rrjQ_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6749C0E94926CC28L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB11FB1AC;
    }

    public static boolean id_class(rfH_2 rfH_22) {
        xd_3 xd_32 = rrjc_3.id_protected(rfH_22);
        if (xd_32 instanceof JU) {
            JU jU = (JU)xd_32;
            return jU.id_break() == Wf_1.PLAYER ? id_protected[1] : id_protected[2];
        }
        return id_protected[3];
    }

    private static void id_class() {
        Object[] objectArray = new Object[1];
        String[] stringArray = new String[]{id_throws[0], id_throws[1], id_throws[2], id_throws[3]};
        objectArray[0] = stringArray;
        id_class = objectArray;
    }

    public static boolean id_class(rdn_3 rdn_32) {
        if (rdn_32.id_break() instanceof rkG_2) {
            String string = rdn_32.id_continue().id_byte().toLowerCase();
            return Arrays.stream((String[])id_class[id_break[0]]).anyMatch(string2 -> string.contains((CharSequence)string2));
        }
        return id_protected[0];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{50, -57, 25, -126, -30, -36, 91, -71}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_break = new short[1];
    }

    private static void id_throws() {
        id_byte = new byte[]{4, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrjQ_2.id_protected();
        rrjQ_2.id_byte();
        rrjQ_2.id_break();
        rrjQ_2.id_throws();
        rrjQ_2.id_class();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[5] = true;
        blArray[7] = true;
        id_protected = blArray;
    }
}

