/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package celestial;

import celestial.Ax_1;
import celestial.QY;
import celestial.an_3;
import celestial.cb_3;
import celestial.rhd_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rpm_3;
import celestial.rrjA_2;
import celestial.util.MinecraftAccessor;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjl_3
implements MinecraftAccessor {
    private static byte[] id_break;
    public static Object[] id_class;
    private static short[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte(rhd_3 rhd_32, an_3 an_32, rpm_3 rpm_32) {
        ((Ax_1)((QY)rrjl_3.id_class[rrjl_3.id_byte[6]]).id_class[id_byte[7]]).id_class(rhd_32, an_32, id_protected[1]);
        ((cb_3)((QY)rrjl_3.id_class[rrjl_3.id_byte[8]]).id_class[id_byte[9]]).id_class(rpm_32);
    }

    private static void id_byte() {
        id_break = new byte[]{2, 47};
    }

    static {
        rrjl_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{50, 119, -114, -34, 21, 72, -92, 95}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static void id_class(rhd_3 rhd_32, an_3 an_32, rpm_3 rpm_32) {
        if (rrjA_2.id_protected().id_throws().id_protected(ProtocolVersion.v1_8)) {
            rrjl_3.id_break(rhd_32, an_32, rpm_32);
        } else {
            rrjl_3.id_byte(rhd_32, an_32, rpm_32);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6F1C9826AED0F755L;
    }

    private static void id_class() {
        Object[] objectArray = new Object[]{MinecraftAccessor.id_import, 47};
        id_class = objectArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA359D731;
    }

    public static void id_class(rjG_2 rjG_22, rpm_3 rpm_32) {
        if (rjG_22 != null && rjG_22.id_byte() != rjM_2.ENTITY) {
            ((cb_3)((QY)rrjl_3.id_class[rrjl_3.id_byte[0]]).id_class[id_byte[1]]).id_class(rpm_32);
        }
    }

    private static void id_break() {
        boolean[] blArray = new boolean[4];
        blArray[3] = true;
        id_protected = blArray;
    }

    private static void id_break(rhd_3 rhd_32, an_3 an_32, rpm_3 rpm_32) {
        ((cb_3)((QY)rrjl_3.id_class[rrjl_3.id_byte[2]]).id_class[id_byte[3]]).id_class(rpm_32);
        ((Ax_1)((QY)rrjl_3.id_class[rrjl_3.id_byte[4]]).id_class[id_byte[5]]).id_class(rhd_32, an_32, id_protected[0]);
    }

    private static /* synthetic */ void ntfClinit() {
        rrjl_3.id_break();
        rrjl_3.id_protected();
        rrjl_3.id_byte();
        rrjl_3.id_class();
    }

    private static void id_protected() {
        short[] sArray = new short[10];
        sArray[1] = 57;
        sArray[3] = 57;
        sArray[5] = 55;
        sArray[7] = 55;
        sArray[9] = 57;
        id_byte = sArray;
    }
}

