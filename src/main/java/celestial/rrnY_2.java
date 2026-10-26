/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import celestial.cG_2;
import celestial.cM_2;
import celestial.event.EventTarget;
import celestial.iQ_2;
import celestial.module.combat.AntiBot;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rrTF;
import celestial.rrnM_2;
import celestial.rrnk_3;
import celestial.rxS_2;
import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnY_2
extends rrTF<AntiBot> {
    private static double[] id_class;
    private static boolean[] id_break;

    public rrnY_2(AntiBot antiBot) {
        super(antiBot);
    }

    static {
        rrnY_2.ntfClinit();
    }

    @EventTarget
    public void id_class(rrnk_3 rrnk_32) {
        boolean bl;
        cM_2 cM_22 = rrnk_32.id_class();
        if (cM_22.sc() || !cM_22.sv().getProperties().isEmpty() || id_import.id_finally()) {
            return;
        }
        int n = cM_22.Bq();
        double d = cM_22.id_class(iQ_2.id_private);
        int n2 = id_break[2];
        for (rdn_3 rdn_32 : cM_22.PV()) {
            if (!(rdn_32.id_break() instanceof rxS_2)) continue;
            ++n2;
        }
        boolean bl2 = bl = n == 0 && n2 > 0 && d == id_class[0] ? id_break[3] : id_break[4];
        if (bl) {
            cM_22.id_break(id_break[5], id_break[6]);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x78D42D38A6CFD682L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-14, 3, 82, -75, 126, -77, -5, 66}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[6] = true;
        id_break = blArray;
    }

    @EventTarget
    public void id_class(rrnM_2 rrnM_22) {
        cG_2 cG_22 = rrnM_22.id_class();
        if (cG_22.sc() || id_import.id_finally()) {
            return;
        }
        GameProfile gameProfile = cG_22.sv();
        if (!gameProfile.getId().equals(rhd_3.id_extends(gameProfile.getName()))) {
            cG_22.id_break(id_break[0], id_break[1]);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3FD982FD;
    }

    private static void id_break() {
        id_class = new double[]{4.0};
    }

    private static /* synthetic */ void ntfClinit() {
        rrnY_2.id_class();
        rrnY_2.id_break();
    }
}

