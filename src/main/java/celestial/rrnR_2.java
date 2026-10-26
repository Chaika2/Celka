/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import celestial.cG_2;
import celestial.event.EventTarget;
import celestial.module.combat.AntiBot;
import celestial.rhd_3;
import celestial.rrTF;
import celestial.rrnM_2;
import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnR_2
extends rrTF<AntiBot> {
    private static boolean[] id_class;

    public rrnR_2(AntiBot antiBot) {
        super(antiBot);
    }

    static {
        rrnR_2.id_class();
    }

    private static void id_class() {
        id_class = new boolean[]{true, true};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD1F1D2444130FDA6L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-29, 60, -21, 33, -31, 23, -53, -31}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4384B7C6;
    }

    @EventTarget
    public void id_class(rrnM_2 rrnM_22) {
        cG_2 cG_22 = rrnM_22.id_class();
        if (cG_22.sc() || id_import.id_finally()) {
            return;
        }
        GameProfile gameProfile = cG_22.sv();
        if (!gameProfile.getId().equals(rhd_3.id_extends(gameProfile.getName()))) {
            cG_22.id_break(id_class[0], id_class[1]);
        }
    }
}

