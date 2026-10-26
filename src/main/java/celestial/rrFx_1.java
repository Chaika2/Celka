/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Ps_1;
import celestial.Pv_1;
import celestial.module.render.Hud;
import celestial.rrAN;
import celestial.rrFK;
import celestial.rrFd_1;
import celestial.rrLC;
import celestial.rrLI;
import celestial.rrQX;
import celestial.rrtN_2;
import celestial.rrtu_3;
import celestial.rrvV;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFx_1
extends Pv_1 {
    private static short[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_byte = blArray;
    }

    public rrFx_1(C_class c_class) {
        super(c_class);
    }

    static {
        rrFx_1.ntfClinit();
    }

    @Override
    public void id_class(rrFK rrFK2) {
        for (rrtN_2 rrtN_22 : ((rrtu_3)rrvV.id_break[id_break[5]]).id_class()) {
            if (!(rrtN_22 instanceof rrFd_1)) continue;
            rrFd_1 rrFd_12 = (rrFd_1)rrtN_22;
            if (!this.id_class()) continue;
            rrFd_12.id_throw().id_class(rrFK2);
            break;
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC9820801;
    }

    public boolean id_class() {
        Hud hud = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[6]]).id_private().w();
        return hud.aJ_() && hud.id_this() && hud.id_throw() ? id_byte[0] : id_byte[1];
    }

    @Override
    public void id_class(rrLC rrLC2) {
        for (rrtN_2 rrtN_22 : ((rrtu_3)rrvV.id_break[id_break[0]]).id_class()) {
            if (!(rrtN_22 instanceof rrFd_1)) continue;
            rrFd_1 rrFd_12 = (rrFd_1)rrtN_22;
            if (!this.id_class() || rrLC2.id_class() != ((Ps_1)this.id_class[id_break[1]]).id_catch()) continue;
            rrFd_12.id_throw().id_class(rrLC2);
            break;
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC2FB123850C2D87AL;
    }

    @Override
    public void id_class(rrLI rrLI2) {
        for (rrtN_2 rrtN_22 : ((rrtu_3)rrvV.id_break[id_break[3]]).id_class()) {
            if (!(rrtN_22 instanceof rrFd_1)) continue;
            rrFd_1 rrFd_12 = (rrFd_1)rrtN_22;
            if (!this.id_class() || rrLI2.id_byte() != ((Ps_1)this.id_class[id_break[4]]).id_catch()) continue;
            rrFd_12.id_throw().id_class(rrLI2);
            break;
        }
    }

    @Override
    public void id_class(rrAN rrAN2) {
        for (rrtN_2 rrtN_22 : ((rrtu_3)rrvV.id_break[id_break[2]]).id_class()) {
            if (!(rrtN_22 instanceof rrFd_1)) continue;
            rrFd_1 rrFd_12 = (rrFd_1)rrtN_22;
            if (!this.id_class()) continue;
            rrFd_12.id_throw().id_class(rrAN2);
            break;
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-110, -84, 16, -25, 78, -63, -105, -88}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        short[] sArray = new short[7];
        sArray[1] = 1;
        sArray[4] = 1;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrFx_1.id_byte();
        rrFx_1.id_break();
    }
}

