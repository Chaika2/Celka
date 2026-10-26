/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.event.EventTarget;
import celestial.module.movement.Flight;
import celestial.rrAs_1;
import celestial.rrTF;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCK
extends rrTF<Flight> {
    private static float[] id_class;

    public rrCK(Flight flight) {
        super(flight);
    }

    static {
        rrCK.id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x49B029005E2D57D8L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x30781FA0;
    }

    @EventTarget
    public void id_class(rrAs_1 rrAs_12) {
        rrAs_12.id_class(((Float)((Flight)this.id_continue()).id_super().id_byte()).floatValue() / id_class[0]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-125, 27, -89, 25, -62, 24, 69, -70}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_class = new float[]{10.0f};
    }
}

