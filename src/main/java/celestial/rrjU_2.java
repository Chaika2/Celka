/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hh_1;
import celestial.Ml_1;
import celestial.cb_3;
import celestial.eX_2;
import celestial.manager.FontManager;
import celestial.rgF_2;
import celestial.rjV_2;
import celestial.rji_3;
import celestial.rqO_2;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrfD_2;
import celestial.rrfa_3;
import celestial.rrfp_3;
import celestial.rrjD_2;
import celestial.rrje_3;
import celestial.rrnE_2;
import celestial.util.ColorHelper;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjU_2
extends Enum<rrjU_2>
implements MinecraftAccessor {
    private static byte[] bytesf70af72d4e3133959ed8b9ae51cf5789;
    private static String[] stringsf70af72d4e3133959ed8b9ae51cf5789;
    private static double[] doublesf70af72d4e3133959ed8b9ae51cf5789;
    public static Object[] staticFieldsf70af72d4e3133959ed8b9ae51cf5789;
    private static short[] shortsf70af72d4e3133959ed8b9ae51cf5789;
    private static float[] floatsf70af72d4e3133959ed8b9ae51cf5789;
    private static boolean[] booleansf70af72d4e3133959ed8b9ae51cf5789;

    private static void id_byte() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[3] = true;
        blArray[7] = true;
        booleansf70af72d4e3133959ed8b9ae51cf5789 = blArray;
    }

    static {
        rrjU_2.ntfClinit();
    }

    public static rrjU_2[] values() {
        return (rrjU_2[])((rrjU_2[])staticFieldsf70af72d4e3133959ed8b9ae51cf5789[shortsf70af72d4e3133959ed8b9ae51cf5789[0]]).clone();
    }

    public static rrjU_2 valueOf(String string) {
        return Enum.valueOf(rrjU_2.class, string);
    }

    public void id_class(rrnE_2 rrnE_22) {
        if (((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[shortsf70af72d4e3133959ed8b9ae51cf5789[1]])).id_break()) {
            return;
        }
        Ml_1 ml_1 = rrnE_22.id_class();
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[shortsf70af72d4e3133959ed8b9ae51cf5789[2]]).id_private();
        rjV_2 rjV_22 = ((Hh_1)rrjU_2.id_import.id_class[shortsf70af72d4e3133959ed8b9ae51cf5789[3]]).id_volatile();
        String string = rrfp_3.id_throws();
        ml_1.id_class();
        for (rrjD_2 rrjD_22 : ((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[shortsf70af72d4e3133959ed8b9ae51cf5789[4]])).id_byte()) {
            float f;
            if (!rrjD_22.id_break(string)) continue;
            eX_2 eX_22 = rrjD_22.id_break();
            rji_3 rji_32 = rrfa_3.id_class(rjV_22, eX_22);
            float f2 = rji_32.id_class();
            float f3 = rji_32.id_break();
            String string2 = rrjD_22.id_byte() + rgF_2.GRAY + " \u00bb " + rgF_2.RESET + (int)((cb_3)rrjU_2.id_import.id_class[shortsf70af72d4e3133959ed8b9ae51cf5789[5]]).id_class(eX_22) + "\u043c";
            int n = rrZO2.id_class();
            float f4 = rrZO2.id_break(string2) / floatsf70af72d4e3133959ed8b9ae51cf5789[0];
            if (!rrjU_2.id_class(f2 + f4, f3 - (f = floatsf70af72d4e3133959ed8b9ae51cf5789[1]), f2 - f4, (float)n + f)) continue;
            float f5 = (float)(Math.sin((double)System.currentTimeMillis() / doublesf70af72d4e3133959ed8b9ae51cf5789[0]) * doublesf70af72d4e3133959ed8b9ae51cf5789[1]);
            rrZO2.id_class(ml_1, string2, f2, f3, rrZF.d_, booleansf70af72d4e3133959ed8b9ae51cf5789[0]);
            rrfD_2.id_class(ml_1, (rqO_2)staticFieldsf70af72d4e3133959ed8b9ae51cf5789[shortsf70af72d4e3133959ed8b9ae51cf5789[6]], f2 - floatsf70af72d4e3133959ed8b9ae51cf5789[2], f3 - f + f5, floatsf70af72d4e3133959ed8b9ae51cf5789[3], floatsf70af72d4e3133959ed8b9ae51cf5789[4], ColorHelper.id_class(floatsf70af72d4e3133959ed8b9ae51cf5789[5]), ColorHelper.id_class(floatsf70af72d4e3133959ed8b9ae51cf5789[6]), ColorHelper.id_class(floatsf70af72d4e3133959ed8b9ae51cf5789[7]), ColorHelper.id_class(floatsf70af72d4e3133959ed8b9ae51cf5789[8]));
        }
        ml_1.id_break();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCD67225E;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-113, 69, 43, -99, -9, -18, 56, 15}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        bytesf70af72d4e3133959ed8b9ae51cf5789 = new byte[]{2, 3};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x11983FE51771A953L;
    }

    private static boolean id_class(float f, float f2, float f3, float f4) {
        return f3 < id_const.id_volatile() && f > floatsf70af72d4e3133959ed8b9ae51cf5789[9] && f2 < id_const.id_final() && f2 > -f4 ? booleansf70af72d4e3133959ed8b9ae51cf5789[1] : booleansf70af72d4e3133959ed8b9ae51cf5789[2];
    }

    private static void id_break() {
        short[] sArray = new short[8];
        sArray[0] = 2;
        sArray[3] = 16;
        sArray[5] = 57;
        sArray[6] = 1;
        shortsf70af72d4e3133959ed8b9ae51cf5789 = sArray;
    }

    private static void id_throws() {
        float[] fArray = new float[10];
        fArray[0] = 2.0f;
        fArray[1] = 17.0f;
        fArray[2] = 9.0f;
        fArray[3] = 16.0f;
        fArray[4] = 16.0f;
        fArray[6] = 90.0f;
        fArray[7] = 180.0f;
        fArray[8] = 270.0f;
        floatsf70af72d4e3133959ed8b9ae51cf5789 = fArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrjU_2.id_byte();
        rrjU_2.id_catch();
        rrjU_2.id_break();
        rrjU_2.id_throws();
        rrjU_2.id_case();
        rrjU_2.id_class();
        rrjU_2.id_protected();
    }

    private static void id_catch() {
        stringsf70af72d4e3133959ed8b9ae51cf5789 = new String[]{new String("INSTANCE"), new String("celestial/images/waypoint.png")};
    }

    private static void id_case() {
        doublesf70af72d4e3133959ed8b9ae51cf5789 = new double[]{400.0, 1.5};
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new rrjU_2(), new rqO_2("minecraft", stringsf70af72d4e3133959ed8b9ae51cf5789[1]), new rrjU_2[]{(rrjU_2)objectArray[0]}};
        staticFieldsf70af72d4e3133959ed8b9ae51cf5789 = objectArray;
    }

    private static /* synthetic */ rrjU_2[] id_private() {
        rrjU_2[] rrjU_2Array = new rrjU_2[booleansf70af72d4e3133959ed8b9ae51cf5789[3]];
        rrjU_2Array[rrjU_2.booleansf70af72d4e3133959ed8b9ae51cf5789[4]] = (rrjU_2)staticFieldsf70af72d4e3133959ed8b9ae51cf5789[shortsf70af72d4e3133959ed8b9ae51cf5789[7]];
        return rrjU_2Array;
    }
}

