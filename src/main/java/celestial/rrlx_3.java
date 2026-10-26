/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.movement.WaterSpeed;
import celestial.rLD;
import celestial.rmD_2;
import celestial.rmU_2;
import celestial.rrAn_1;
import celestial.rrLZ;
import celestial.rrLd_1;
import celestial.rrTF;
import celestial.ruS_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlx_3
extends rrTF<WaterSpeed> {
    private static short[] id_class;
    private static float[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        id_byte = new byte[]{2};
    }

    public rrlx_3(WaterSpeed waterSpeed) {
        super(waterSpeed);
    }

    static {
        rrlx_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xED9C2F60;
    }

    @EventTarget
    public void id_class(rrLd_1 rrLd_12) {
        if (((cb_3)rrlx_3.id_import.id_class[id_class[0]]).id_break(rLD.id_interface)) {
            return;
        }
        if (rrLd_12.id_class() != 0) {
            rrLd_12.id_class(id_break[0] - ((Integer)((cb_3)rrlx_3.id_import.id_class[rrlx_3.id_class[1]]).id_throws[id_class[2]] % id_byte[0] == 0 ? id_break[1] : id_break[2]));
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x22F833358C4CC5ADL;
    }

    @EventTarget
    public void id_class(rrAn_1 rrAn_12) {
        if (((cb_3)rrlx_3.id_import.id_class[id_class[3]]).rT()) {
            rrAn_12.id_break(id_protected[0]);
        }
    }

    private static void id_class() {
        id_class = new short[]{57, 57, 41, 57, 57};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{114, -120, -124, 51, 44, 114, 98, 120}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(rrLZ rrLZ2) {
        rmD_2 rmD_22;
        ruS_2<?> ruS_22 = rrLZ2.id_class();
        if (ruS_22 instanceof rmD_2 && (rmD_22 = (rmD_2)ruS_22).id_break() == rmU_2.PRESS_SHIFT_KEY && ((cb_3)rrlx_3.id_import.id_class[id_class[4]]).rT()) {
            rrLZ2.id_class(id_protected[1]);
        }
    }

    private static void id_break() {
        id_break = new float[]{0.022f, 5.0E-5f, 1.0E-4f};
    }

    private static /* synthetic */ void ntfClinit() {
        rrlx_3.id_protected();
        rrlx_3.id_class();
        rrlx_3.id_break();
        rrlx_3.id_byte();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }
}

