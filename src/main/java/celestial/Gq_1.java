/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.C_super;
import celestial.GH;
import celestial.GI;
import celestial.Gt_1;
import celestial.SI;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gq_1
implements Gt_1 {
    private static int[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static byte[] id_protected;

    private static void id_byte() {
        short[] sArray = new short[9];
        sArray[0] = 1;
        sArray[1] = 1;
        sArray[6] = 2;
        sArray[7] = 1;
        id_byte = sArray;
    }

    public Gq_1(GH gH) {
        this.id_protected();
        GH gH2 = gH;
        this.id_class[Gq_1.id_byte[0]] = gH2;
        C_super c_super = GH.id_class((GH)this.id_class[id_byte[1]]).id_strictfp().id_byte().id_break();
        this.id_class[Gq_1.id_byte[2]] = c_super;
    }

    static {
        Gq_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x55545E8A28589C2FL;
    }

    @Override
    public int id_class() {
        return id_break[0];
    }

    @Override
    public GI id_class(int n, int n2) {
        int n3 = n << id_protected[0];
        int n4 = n2 << id_protected[1];
        if (((C_super)this.id_class[id_byte[3]]).id_break(n3, n4)) {
            return (GI)((Object)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[id_byte[4]]);
        }
        if (!((SI)((C_super)this.id_class[id_byte[5]])).id_byte(n3, n4)) {
            C_class.id_interface().execute(() -> ((SI)((C_super)this.id_class[id_byte[8]])).id_protected(n3 >> id_protected[2], n4 >> id_protected[3]));
            return (GI)((Object)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[id_byte[6]]);
        }
        return (GI)((Object)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[id_byte[7]]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-30, -78, -120, -122, 110, -33, 61, -94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1A2A6BAE;
    }

    private static void id_break() {
        id_break = new int[]{Integer.MAX_VALUE};
    }

    private static void id_throws() {
        id_protected = new byte[]{4, 4, 9, 9, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        Gq_1.id_byte();
        Gq_1.id_throws();
        Gq_1.id_break();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[4]];
        }
    }
}

