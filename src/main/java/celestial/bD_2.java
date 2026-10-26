/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Pm_1;
import celestial.bV_2;
import celestial.rqr_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bD_2
extends rqr_3 {
    private static short[] id_volatile;
    private static boolean[] id_final;
    private static float[] id_package;
    public Object[] id_class;
    private static double[] id_int;

    public bD_2(bV_2 bV_22) {
        this.id_catch();
        bV_2 bV_23 = bV_22;
        this.id_class[bD_2.id_volatile[0]] = bV_23;
    }

    static {
        bD_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-128, 76, -90, -35, -44, -48, -91, -20}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(boolean bl) {
        this.id_catch();
        this.id_break = id_package[0];
        this.id_byte = id_package[1];
        this.id_private = ((bV_2)this.id_class[id_volatile[1]]).id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_volatile[2]]));
        this.id_protected = ((bV_2)this.id_class[id_volatile[3]]).id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_volatile[4]]));
        if (this.id_protected) {
            this.id_byte += id_package[2];
        }
        if (this.id_throws = ((bV_2)this.id_class[id_volatile[5]]).id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_volatile[6]]))) {
            this.id_byte -= id_package[3];
        }
        if (this.id_case = ((bV_2)this.id_class[id_volatile[7]]).id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_volatile[8]]))) {
            this.id_break += id_package[4];
        }
        if (this.id_catch = ((bV_2)this.id_class[id_volatile[9]]).id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_volatile[10]]))) {
            this.id_break -= id_package[5];
        }
        if (this.id_implements = ((bV_2)this.id_class[id_volatile[11]]).id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_volatile[12]]))) {
            this.id_break = (float)((double)this.id_break * id_int[0]);
            this.id_byte = (float)((double)this.id_byte * id_int[1]);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD14A4332;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x18CF9FE9DD41E07FL;
    }

    private static void id_throws() {
        float[] fArray = new float[6];
        fArray[2] = 1.0f;
        fArray[3] = 1.0f;
        fArray[4] = 1.0f;
        fArray[5] = 1.0f;
        id_package = fArray;
    }

    private static /* synthetic */ void ntfClinit() {
        bD_2.id_implements();
        bD_2.id_case();
        bD_2.id_throws();
        bD_2.id_private();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_final[0]];
        }
    }

    private static void id_case() {
        short[] sArray = new short[13];
        sArray[2] = 6;
        sArray[6] = 1;
        sArray[8] = 2;
        sArray[10] = 3;
        sArray[12] = 7;
        id_volatile = sArray;
    }

    private static void id_implements() {
        id_final = new boolean[]{true};
    }

    private static void id_private() {
        id_int = new double[]{0.3, 0.3};
    }
}

