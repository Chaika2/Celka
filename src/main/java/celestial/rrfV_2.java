/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import celestial.Aq_1;
import celestial.Aw_1;
import celestial.cb_3;
import celestial.rVe_1;
import celestial.rgP_2;
import celestial.rql_3;
import celestial.ruS_2;
import celestial.util.MinecraftAccessor;
import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfV_2
implements MinecraftAccessor {
    private static short[] id_class;

    static {
        rrfV_2.id_class();
    }

    public static void id_class(ruS_2<?> ruS_22) {
        ((Aq_1)((cb_3)rrfV_2.id_import.id_class[rrfV_2.id_class[0]]).id_break[id_class[1]]).id_break(ruS_22);
    }

    private static void id_class() {
        short[] sArray = new short[6];
        sArray[0] = 57;
        sArray[2] = 57;
        sArray[3] = 57;
        sArray[4] = 57;
        id_class = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x76A9C2D3;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{31, -68, -104, -97, -72, 121, 60, -54}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB48D6031431D568AL;
    }

    public static Aw_1 id_class(rgP_2 rgP_22, String string) {
        if (string.isEmpty() || rgP_22 instanceof rVe_1) {
            return null;
        }
        if ((cb_3)rrfV_2.id_import.id_class[id_class[2]] == null || id_import.id_void() == null) {
            return null;
        }
        GameProfile gameProfile = ((cb_3)rrfV_2.id_import.id_class[id_class[3]]).sv();
        for (Aw_1 aw_1 : ((Aq_1)((cb_3)rrfV_2.id_import.id_class[rrfV_2.id_class[4]]).id_break[id_class[5]]).id_throws()) {
            if (aw_1.id_class().equals((Object)gameProfile) || !string.contains(rql_3.id_class(aw_1.id_class().getName()))) continue;
            return aw_1;
        }
        return null;
    }
}

