/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.D;
import celestial.T;
import celestial.bj_3;
import celestial.module.util.CreeperFarm;
import celestial.rrQX;
import celestial.sx_3;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sd_3
implements D {
    private static short[] id_class;

    public sd_3(sx_3 sx_32) {
    }

    static {
        sd_3.id_class();
    }

    @Override
    public void id_class(T t) {
        CreeperFarm creeperFarm = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_class[0]]).id_private().i();
        if (!creeperFarm.aJ_() || creeperFarm.id_new() == null) {
            return;
        }
        if (!((Boolean)C_class.id_instanceof().Pw.id_class[id_class[1]]).booleanValue()) {
            return;
        }
        Color color = (Color)C_class.id_instanceof().id_try.id_class[id_class[2]];
        float f = ((Float)C_class.id_instanceof().id_super.id_class[id_class[3]]).floatValue();
        float f2 = ((Float)C_class.id_instanceof().PT.id_class[id_class[4]]).floatValue();
        boolean bl = (Boolean)C_class.id_instanceof().id_package.id_class[id_class[5]];
        bj_3.id_class(color, f, f2, bl);
        bj_3.id_class(t.id_byte(), creeperFarm.id_new().id_break());
        bj_3.id_class(bl);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD7EEBCF7;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{91, -119, 69, -3, -2, -108, -47, 96}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCE9541862CFEB768L;
    }

    private static void id_class() {
        id_class = new short[6];
    }
}

