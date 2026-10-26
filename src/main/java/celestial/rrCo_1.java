/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.movement.Flight;
import celestial.q_1;
import celestial.rqr_3;
import celestial.rrTF;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCo_1
extends rrTF<Flight> {
    private static double[] id_break;
    private static short[] id_byte;
    private static byte[] id_protected;
    private static boolean[] id_case;
    public Object[] id_class;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
            this.id_class[0] = 0;
        }
    }

    public rrCo_1(Flight flight) {
        super(flight);
        this.id_byte();
    }

    static {
        rrCo_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x97E67A53;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5A4A993799586FD3L;
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_byte();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[0]]) && ((rqr_3)((cb_3)rrCo_1.id_import.id_class[rrCo_1.id_byte[1]]).id_break[rrCo_1.id_byte[2]]).id_private) {
            rrCo_1 rrCo_12 = this;
            int n = (Integer)rrCo_12.id_class[id_byte[3]] + id_case[0];
            Integer n2 = n;
            rrCo_12.id_class[rrCo_1.id_byte[4]] = n2;
            if (n > id_protected[0]) {
                ((cb_3)rrCo_1.id_import.id_class[rrCo_1.id_byte[5]]).rv().id_byte = id_break[0];
                Integer n3 = id_case[1];
                this.id_class[rrCo_1.id_byte[6]] = n3;
            } else {
                ((cb_3)rrCo_1.id_import.id_class[id_byte[7]]).sl();
            }
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-4, 70, 89, -52, 104, 22, -97, -88}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_protected = new byte[]{70};
    }

    private static void id_break() {
        short[] sArray = new short[9];
        sArray[1] = 57;
        sArray[2] = 17;
        sArray[5] = 57;
        sArray[7] = 57;
        id_byte = sArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[3] = true;
        id_case = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrCo_1.id_throws();
        rrCo_1.id_break();
        rrCo_1.id_protected();
        rrCo_1.id_class();
    }

    private static void id_protected() {
        id_break = new double[]{-0.2};
    }

    @Override
    public boolean aK_() {
        this.id_byte();
        Integer n = id_case[2];
        this.id_class[rrCo_1.id_byte[8]] = n;
        return super.aK_();
    }
}

