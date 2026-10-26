/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PX;
import celestial.Pr_1;
import celestial.cb_3;
import celestial.module.combat.AutoExplosion;
import celestial.rrTT;
import celestial.rrTf_1;
import celestial.rrfQ_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnn_3
implements rrTf_1 {
    public Object[] id_class;
    private static short[] id_break;
    private static float[] id_byte;
    private static boolean[] id_protected;
    private static double[] id_throws;

    private static void id_byte() {
        id_protected = new boolean[]{true, true, true};
    }

    public rrnn_3(AutoExplosion autoExplosion) {
        this.id_class();
        AutoExplosion autoExplosion2 = autoExplosion;
        this.id_class[rrnn_3.id_break[0]] = autoExplosion2;
    }

    static {
        rrnn_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{86, 107, 9, -112, -73, -67, -25, -43}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC8D61DA9167C2DCDL;
    }

    private void id_class() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x19E8902;
    }

    private static void id_break() {
        id_throws = new double[]{-0.2f, 0.2f, -0.2f, 0.2f};
    }

    private static void id_throws() {
        id_byte = new float[]{5.0f, 5.0f};
    }

    private static /* synthetic */ void ntfClinit() {
        rrnn_3.id_byte();
        rrnn_3.id_protected();
        rrnn_3.id_throws();
        rrnn_3.id_break();
    }

    private static void id_protected() {
        short[] sArray = new short[7];
        sArray[2] = 8;
        sArray[3] = 57;
        sArray[4] = 16;
        sArray[5] = 57;
        sArray[6] = 16;
        id_break = sArray;
    }

    @Override
    public PX processRandom(PX pX, PX pX2) {
        float f = pX.id_throws();
        float f2 = pX.id_protected();
        float f3 = pX2.id_throws();
        float f4 = pX2.id_protected();
        Pr_1 pr_1 = ((rrTT)((AutoExplosion)this.id_class[rrnn_3.id_break[1]]).id_break[id_break[2]]).id_protected().id_protected();
        if ((Integer)((cb_3)MinecraftAccessor.id_import.id_class[rrnn_3.id_break[3]]).id_private[id_break[4]] == id_protected[0]) {
            f3 = f + id_byte[0];
            f4 = f2 + id_byte[1];
        } else if ((Integer)((cb_3)MinecraftAccessor.id_import.id_class[rrnn_3.id_break[5]]).id_private[id_break[6]] > id_protected[1]) {
            f3 += (float)rrfQ_2.id_class(pr_1, id_throws[0], id_throws[1]);
            f4 += (float)rrfQ_2.id_class(pr_1, id_throws[2], id_throws[3]);
        }
        return new PX(f3, f4);
    }
}

