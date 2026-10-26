/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 */
package celestial;

import celestial.Aq_1;
import celestial.gm_3;
import celestial.rVi_1;
import celestial.rYB;
import celestial.rgP_2;
import celestial.rud_3;
import celestial.util.MinecraftAccessor;
import com.mojang.datafixers.DataFixUtils;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjv_3
implements MinecraftAccessor {
    private static short[] id_class;

    static {
        rrjv_3.id_break();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-21, 96, -122, -124, 125, -121, 123, 80}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x158B978E;
    }

    public static rYB id_class() {
        return (rYB)DataFixUtils.orElse(Optional.of(id_import.id_this()).flatMap(rng_32 -> Optional.of(rng_32.id_class(((gm_3)rrjv_3.id_import.id_class[id_class[1]]).E()))), (Object)((gm_3)rrjv_3.id_import.id_class[id_class[0]]));
    }

    public static void id_class(rVi_1 rVi_12, rVi_1 rVi_13) {
        Aq_1 aq_1 = id_import.id_void();
        if (aq_1 != null) {
            rrjv_3.id_class(aq_1.id_class(), rVi_12, rVi_13);
        }
    }

    public static void id_class(rud_3 rud_32, rVi_1 rVi_12, rVi_1 rVi_13) {
        if (rud_32 != null) {
            rud_32.id_class((rgP_2)rVi_12, rVi_13);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x31D9203C8ED42EE1L;
    }

    private static void id_break() {
        id_class = new short[]{56, 56};
    }
}

