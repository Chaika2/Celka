/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package celestial;

import celestial.bw_3;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rfH_2;
import celestial.ryO_2;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bI_2
implements rRq_1 {
    private static short[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;

    @Override
    public xc_3 id_byte(rfH_2 rfH_22) {
        return ((bw_3)this.id_class[id_break[1]]).id_class(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    private static void id_byte() {
        id_byte = new boolean[]{true};
    }

    public bI_2(bw_3 bw_32) {
        this.id_break();
        bw_3 bw_33 = bw_32;
        this.id_class[bI_2.id_break[0]] = bw_33;
    }

    static {
        bI_2.ntfClinit();
    }

    private static void id_class() {
        id_break = new short[2];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8DC237B47011B5D7L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAC81378D;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-42, 53, 29, -108, -45, 72, -17, 22}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    @Nullable
    public ryO_2 id_class(rfH_2 rfH_22) {
        return null;
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    @Override
    public rXE id_break(rfH_2 rfH_22) {
        return this.id_byte(rfH_22).id_volatile();
    }

    private static /* synthetic */ void ntfClinit() {
        bI_2.id_byte();
        bI_2.id_class();
    }
}

