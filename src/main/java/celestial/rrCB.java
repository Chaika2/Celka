/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PX;
import celestial.Pr_1;
import celestial.cb_3;
import celestial.rrCP;
import celestial.rrTf_1;
import celestial.rrfQ_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCB
implements rrTf_1 {
    private static short[] id_break;
    private static double[] id_byte;
    private static float[] id_protected;
    private static boolean[] id_throws;
    public Object[] id_class;

    private static void id_byte() {
        id_protected = new float[]{0.1f, 0.1f};
    }

    public rrCB(rrCP rrCP2) {
        this.id_throws();
        rrCP rrCP3 = rrCP2;
        this.id_class[rrCB.id_break[0]] = rrCP3;
    }

    static {
        rrCB.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x458208149E7078EFL;
    }

    private static void id_class() {
        id_byte = new double[]{-0.5, 0.5, -0.5, 0.5};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x99A219FA;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-27, 83, -97, -8, 42, -33, 104, -89}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_throws = new boolean[]{true, true, true};
    }

    private void id_throws() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrCB.id_break();
        rrCB.id_protected();
        rrCB.id_byte();
        rrCB.id_class();
    }

    private static void id_protected() {
        short[] sArray = new short[8];
        sArray[4] = 57;
        sArray[5] = 16;
        sArray[6] = 57;
        sArray[7] = 16;
        id_break = sArray;
    }

    @Override
    public PX processRandom(PX pX, PX pX2) {
        float f = pX.id_throws();
        float f2 = pX.id_protected();
        float f3 = pX2.id_throws();
        float f4 = pX2.id_protected();
        Pr_1 pr_1 = ((rrCP)this.id_class[id_break[1]]).id_implements().id_protected();
        if (!((Boolean)((rrCP)this.id_class[rrCB.id_break[2]]).id_byte[id_break[3]]).booleanValue()) {
            if ((Integer)((cb_3)MinecraftAccessor.id_import.id_class[rrCB.id_break[4]]).id_private[id_break[5]] == id_throws[0]) {
                f3 = f + id_protected[0];
                f4 = f2 + id_protected[1];
            } else if ((Integer)((cb_3)MinecraftAccessor.id_import.id_class[rrCB.id_break[6]]).id_private[id_break[7]] > id_throws[1]) {
                f3 += (float)rrfQ_2.id_class(pr_1, id_byte[0], id_byte[1]);
                f4 += (float)rrfQ_2.id_class(pr_1, id_byte[2], id_byte[3]);
            }
        }
        return new PX(f3, f4);
    }
}

