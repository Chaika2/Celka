/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Pv_1;
import celestial.module.render.Hud;
import celestial.rrFK;
import celestial.rrLa_1;
import celestial.rrQX;
import celestial.rrtN_2;
import celestial.rrtu_3;
import celestial.rrvV;
import celestial.rrvo_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvY
extends Pv_1 {
    private static boolean[] id_break;
    private static short[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_break = blArray;
    }

    public rrvY(C_class c_class) {
        super(c_class);
    }

    static {
        rrvY.ntfClinit();
    }

    @Override
    public void id_class(rrFK rrFK2) {
        for (rrtN_2 rrtN_22 : ((rrtu_3)rrvV.id_break[id_byte[1]]).id_class()) {
            if (!(rrtN_22 instanceof rrvo_1)) continue;
            rrvo_1 rrvo_12 = (rrvo_1)rrtN_22;
            if (!this.id_class()) continue;
            rrvo_12.id_throw().id_break();
            break;
        }
    }

    @Override
    public void id_class(rrLa_1 rrLa_12) {
        for (rrtN_2 rrtN_22 : ((rrtu_3)rrvV.id_break[id_byte[0]]).id_class()) {
            if (!(rrtN_22 instanceof rrvo_1)) continue;
            rrvo_1 rrvo_12 = (rrvo_1)rrtN_22;
            if (!this.id_class()) continue;
            rrvo_12.id_throw().id_class(rrLa_12);
            break;
        }
    }

    public boolean id_class() {
        Hud hud = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[2]]).id_private().w();
        return hud.aJ_() && hud.id_return() ? id_break[0] : id_break[1];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5BA01396B2A282D9L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x926063E2;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-81, -84, -14, 76, 11, 66, 49, -65}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_byte = new short[3];
    }

    private static /* synthetic */ void ntfClinit() {
        rrvY.id_byte();
        rrvY.id_break();
    }
}

