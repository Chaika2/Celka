/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PX;
import celestial.Pr_1;
import celestial.cb_3;
import celestial.module.combat.AttackAura;
import celestial.rfU_2;
import celestial.rrTf_1;
import celestial.rrfQ_2;
import celestial.rrna_3;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrni_3
implements rrTf_1 {
    private static double[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;
    private static float[] id_throws;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }

    public rrni_3(rrna_3 rrna_32) {
        this.id_byte();
        rrna_3 rrna_33 = rrna_32;
        this.id_class[rrni_3.id_byte[0]] = rrna_33;
    }

    static {
        rrni_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x661BD04E2A8211FAL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-8, -71, -12, 77, -35, 86, -17, 65}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_break = new double[]{-0.5, 0.5, -0.5, 0.5};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5598D09D;
    }

    private static void id_break() {
        id_throws = new float[]{16.0f, 0.8f, 4.0f};
    }

    private static void id_throws() {
        short[] sArray = new short[10];
        sArray[2] = 1;
        sArray[6] = 57;
        sArray[7] = 41;
        sArray[8] = 57;
        sArray[9] = 41;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrni_3.id_protected();
        rrni_3.id_throws();
        rrni_3.id_class();
        rrni_3.id_break();
    }

    private static void id_protected() {
        id_protected = new boolean[]{true};
    }

    @Override
    public PX processRandom(PX pX, PX pX2) {
        float f = pX2.id_throws();
        float f2 = pX2.id_protected();
        if (((Boolean)((rrna_3)this.id_class[rrni_3.id_byte[1]]).id_byte[id_byte[2]]).booleanValue() && !((rrna_3)this.id_class[id_byte[3]]).id_synchronized() && ((AttackAura)((rrna_3)this.id_class[id_byte[4]]).id_continue()).id_continue() != null) {
            Pr_1 pr_1 = ((rrna_3)this.id_class[id_byte[5]]).id_implements().id_protected();
            f += (float)rrfQ_2.id_class(pr_1, id_break[0], id_break[1]);
            f2 += (float)rrfQ_2.id_class(pr_1, id_break[2], id_break[3]);
            f += rfU_2.id_class((float)((Integer)((cb_3)MinecraftAccessor.id_import.id_class[rrni_3.id_byte[6]]).id_throws[id_byte[7]]).intValue()) * id_throws[0];
            f2 += rfU_2.id_class((float)((Integer)((cb_3)MinecraftAccessor.id_import.id_class[rrni_3.id_byte[8]]).id_throws[id_byte[9]]).intValue() * id_throws[1]) * id_throws[2];
        }
        return new PX(f, f2);
    }
}

