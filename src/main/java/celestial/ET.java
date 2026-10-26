/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.EC;
import celestial.EZ;
import celestial.Ev_1;
import celestial.GP;
import celestial.Gs_1;
import celestial.Mr_1;
import celestial.rU_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class ET
extends EC {
    private static boolean[] booleanse7e6e1fdc5523a20b4ec3fbb2a20d732;
    private static short[] shortse7e6e1fdc5523a20b4ec3fbb2a20d732;

    public ET(int n2, int n3, int n4, boolean bl, boolean bl2) {
    }

    static {
        ET.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8433370434C30B24L;
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        Mr_1 mr_1 = new Mr_1();
        this.id_class(eZ, (Integer)rU_22.id_break[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[0]], (Integer)rU_22.id_break[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[1]], (Integer)rU_22.id_break[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[2]], mr_1);
        if ((Integer)mr_1.id_class[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[3]] == (Integer)rU_22.id_break[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[4]] - booleanse7e6e1fdc5523a20b4ec3fbb2a20d732[0]) {
            return new GP(eZ.id_break(), rU_22, new rU_2((Integer)mr_1.id_class[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[5]], (Integer)mr_1.id_class[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[6]], (Integer)mr_1.id_class[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[7]]));
        }
        return new Gs_1(eZ.id_break(), rU_22, new rU_2((Integer)mr_1.id_class[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[8]], (Integer)mr_1.id_class[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[9]], (Integer)mr_1.id_class[shortse7e6e1fdc5523a20b4ec3fbb2a20d732[10]]));
    }

    @Override
    public void id_class(EZ eZ, int n, int n2, int n3, Mr_1 mr_1) {
        GP.id_class(eZ, n, n2, n3, n, n3 + booleanse7e6e1fdc5523a20b4ec3fbb2a20d732[1], mr_1);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6F0E04C5;
    }

    private static void id_class() {
        booleanse7e6e1fdc5523a20b4ec3fbb2a20d732 = new boolean[]{true, true};
    }

    private static void id_break() {
        short[] sArray = new short[11];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[9] = 1;
        sArray[10] = 2;
        shortse7e6e1fdc5523a20b4ec3fbb2a20d732 = sArray;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-112, 64, 66, 1, -102, -54, -23, -34}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        ET.id_class();
        ET.id_break();
    }
}

