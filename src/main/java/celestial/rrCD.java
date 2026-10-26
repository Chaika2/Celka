/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.event.EventTarget;
import celestial.module.movement.Flight;
import celestial.rrLz_1;
import celestial.rrTF;
import celestial.rrfj_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCD
extends rrTF<Flight> {
    private static double[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static byte[] id_case;
    public Object[] id_class;
    private static float[] id_catch;

    private static void id_byte() {
        id_break = new double[]{-0.2};
    }

    public rrCD(Flight flight) {
        super(flight);
        this.id_case();
    }

    static {
        rrCD.ntfClinit();
    }

    private static void id_class() {
        id_catch = new float[]{2.0f};
    }

    @EventTarget
    public void id_class(rrLz_1 rrLz_12) {
        this.id_case();
        float f = ((Float)((Flight)this.id_continue()).id_this().id_byte()).floatValue();
        rrLz_12.id_class(f);
        rrCD rrCD2 = this;
        int n = (Integer)rrCD2.id_class[id_byte[0]] + id_protected[0];
        Integer n2 = n;
        rrCD2.id_class[rrCD.id_byte[1]] = n2;
        if (n > id_case[0]) {
            rrLz_12.id_catch().id_byte = id_break[0];
            Integer n3 = id_protected[1];
            this.id_class[rrCD.id_byte[2]] = n3;
        } else {
            rrLz_12.id_catch().id_byte = rrfj_3.id_class() * f / id_catch[0];
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3ECE2AF9D39D7865L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{77, 106, -52, 52, -56, 100, 17, -19}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD573385F;
    }

    private static void id_break() {
        id_case = new byte[]{70};
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrCD.id_throws();
        rrCD.id_protected();
        rrCD.id_byte();
        rrCD.id_class();
        rrCD.id_break();
    }

    private void id_case() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
            this.id_class[0] = 0;
        }
    }

    private static void id_protected() {
        id_byte = new short[4];
    }

    @Override
    public boolean aK_() {
        this.id_case();
        Integer n = id_protected[2];
        this.id_class[rrCD.id_byte[3]] = n;
        return super.aK_();
    }
}

