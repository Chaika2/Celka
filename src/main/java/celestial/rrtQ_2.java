/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rVe_1;
import celestial.rVi_1;
import celestial.rqO_2;
import celestial.rrZF;
import celestial.rrfD_2;
import celestial.rrtO_2;
import celestial.rrtX_2;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtQ_2
extends rrtO_2 {
    private static String[] id_protected;
    private static float[] id_throws;
    public static Object[] id_byte;
    private static short[] id_case;
    private static boolean[] id_catch;

    public rrtQ_2(rVi_1 rVi_12, rVi_1 rVi_13, int n) {
        super((rrtX_2)((Object)rrtX_2.staticFieldsdadd6b8236373470b3196397455fa876[id_case[0]]), rVi_12, rVi_13, n);
    }

    public rrtQ_2(String string, String string2, int n) {
        this(new rVe_1(string), new rVe_1(string2), n);
    }

    static {
        rrtQ_2.ntfClinit();
    }

    private static void id_this() {
        float[] fArray = new float[12];
        fArray[1] = 90.0f;
        fArray[2] = 270.0f;
        fArray[3] = 180.0f;
        fArray[4] = 18.0f;
        fArray[5] = 5.0f;
        fArray[6] = 5.0f;
        fArray[7] = 17.0f;
        fArray[8] = 5.0f;
        fArray[9] = 3.0f;
        fArray[10] = 10.0f;
        fArray[11] = 10.0f;
        id_throws = fArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x672D05A8;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB23D654B442AA83CL;
    }

    @Override
    public void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4) {
        super.id_class(ml_1, f, f2, f3, f4);
        int n = this.id_case();
        int n2 = Math.min(n, id_case[1]);
        int n3 = ColorHelper.id_class(id_throws[0], n2);
        int n4 = ColorHelper.id_class(id_throws[1], n2);
        int n5 = ColorHelper.id_class(id_throws[2], n2);
        int n6 = ColorHelper.id_class(id_throws[3], n2);
        rrfD_2.id_class(ml_1, f, f2, f3, f4, n2, n3, n4, n5, n6, id_catch[0]);
        this.id_catch().id_class(ml_1, this.id_volatile(), (double)(f + id_throws[4]), (double)(f2 + id_throws[5]), rrZF.d_, n);
        this.id_implements().id_class(ml_1, this.id_new(), (double)(f + id_throws[6]), (double)(f2 + id_throws[7]), rrZF.d_, n);
        rrfD_2.id_class(ml_1, (rqO_2)id_byte[id_case[2]], f + id_throws[8], f2 + id_throws[9], id_throws[10], id_throws[11], ColorHelper.id_break(rrZF.d_, n));
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-5, 94, 33, -62, 112, 71, -55, -27}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrtQ_2.id_public();
        rrtQ_2.id_return();
        rrtQ_2.id_else();
        rrtQ_2.id_this();
        rrtQ_2.id_synchronized();
    }

    private static void id_else() {
        short[] sArray = new short[3];
        sArray[1] = 225;
        id_case = sArray;
    }

    private static void id_return() {
        id_protected = new String[]{new String("celestial/images/notification/success.png")};
    }

    private static void id_public() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_catch = blArray;
    }

    private static void id_synchronized() {
        Object[] objectArray = new Object[]{new rqO_2(id_protected[0])};
        id_byte = objectArray;
    }
}

