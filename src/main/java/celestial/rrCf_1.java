/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.combat.Velocity;
import celestial.rrLu_1;
import celestial.rrTF;
import celestial.ruS_2;
import celestial.rvQ_2;
import celestial.rvc_3;
import celestial.rvu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCf_1
extends rrTF<Velocity> {
    private static short[] id_class;
    private static boolean[] id_break;
    private static float[] id_byte;
    private static byte[] id_protected;

    private static void id_byte() {
        id_break = new boolean[]{true, true};
    }

    public rrCf_1(Velocity velocity) {
        super(velocity);
    }

    static {
        rrCf_1.ntfClinit();
    }

    private static void id_class() {
        id_protected = new byte[]{31};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{81, -17, -88, -57, -41, 50, 49, -126}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6EA15A82;
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        rvQ_2 rvQ_22;
        ruS_2<?> ruS_22 = rrLu_12.id_class();
        if (ruS_22 instanceof rvc_3) {
            rvc_3 rvc_32 = (rvc_3)ruS_22;
            if ((cb_3)rrCf_1.id_import.id_class[id_class[0]] != null && rvc_32.id_break() == ((cb_3)rrCf_1.id_import.id_class[id_class[1]]).V()) {
                rrLu_12.id_class(id_break[0]);
            }
        } else if (ruS_22 instanceof rvu_3) {
            rvu_3 rvu_32 = (rvu_3)ruS_22;
            rvu_32.id_class(id_byte[0]);
            rvu_32.id_break(id_byte[1]);
            rvu_32.id_byte(id_byte[2]);
        } else if (ruS_22 instanceof rvQ_2 && (rvQ_22 = (rvQ_2)ruS_22).id_break() == id_protected[0]) {
            rrLu_12.id_class(id_break[1]);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x485DDBA53D23FC82L;
    }

    private static void id_break() {
        id_class = new short[]{57, 57};
    }

    private static /* synthetic */ void ntfClinit() {
        rrCf_1.id_byte();
        rrCf_1.id_break();
        rrCf_1.id_protected();
        rrCf_1.id_class();
    }

    private static void id_protected() {
        id_byte = new float[3];
    }
}

