/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVi_1;
import celestial.rgP_2;
import celestial.rrFZ;
import celestial.rrqr_3;
import celestial.ui.hud.HudWidget;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFv_1
implements rrqr_3 {
    private static byte[] id_break;
    public Object[] id_class;
    private static float[] id_byte;
    private static short[] id_protected;
    private static boolean[] id_throws;

    @Override
    public /* synthetic */ rgP_2 id_byte() {
        return this.id_case();
    }

    public rrFv_1(rrFZ rrFZ2, rVi_1 rVi_12, rVi_1 rVi_13) {
        this.id_finally();
        rrFZ rrFZ3 = rrFZ2;
        this.id_class[rrFv_1.id_protected[0]] = rrFZ3;
        AnimValue animValue = new AnimValue(id_byte[0], id_throws[0]);
        this.id_class[rrFv_1.id_protected[1]] = animValue;
        rVi_1 rVi_14 = rVi_12;
        this.id_class[rrFv_1.id_protected[2]] = rVi_14;
        rVi_1 rVi_15 = rVi_13;
        this.id_class[rrFv_1.id_protected[3]] = rVi_15;
        String string = rVi_13.getString();
        this.id_class[rrFv_1.id_protected[4]] = string;
    }

    static {
        rrFv_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9A091CBE;
    }

    @Override
    public void id_class(boolean bl) {
        ((AnimValue)this.id_class[id_protected[8]]).id_class(bl);
    }

    public rVi_1 id_class() {
        return (rVi_1)this.id_class[id_protected[5]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-90, 86, -91, 105, -30, 40, 31, -82}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x334BDF30D580D09DL;
    }

    @Override
    public AnimValue id_break() {
        return (AnimValue)this.id_class[id_protected[7]];
    }

    @Override
    public boolean id_throws() {
        return id_throws[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrFv_1.id_implements();
        rrFv_1.id_extends();
        rrFv_1.id_native();
        rrFv_1.id_volatile();
    }

    private void id_finally() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    @Override
    public boolean id_catch() {
        return ((HudWidget)((rrFZ)this.id_class[rrFv_1.id_protected[9]]).id_class[id_protected[10]]).id_super();
    }

    private static void id_extends() {
        short[] sArray = new short[12];
        sArray[0] = 4;
        sArray[1] = 3;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[6] = 1;
        sArray[7] = 3;
        sArray[8] = 3;
        sArray[9] = 4;
        sArray[11] = 2;
        id_protected = sArray;
    }

    public rVi_1 id_case() {
        return (rVi_1)this.id_class[id_protected[6]];
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_throws = blArray;
    }

    @Override
    public /* synthetic */ rgP_2 id_protected() {
        return this.id_class();
    }

    @Override
    public String id_private() {
        return (String)this.id_class[id_protected[11]];
    }

    private static void id_volatile() {
        id_break = new byte[]{5};
    }

    private static void id_native() {
        id_byte = new float[]{0.5f};
    }
}

