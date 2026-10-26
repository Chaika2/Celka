/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.cb_3;
import celestial.rZM;
import celestial.rZb_1;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIU
implements MinecraftAccessor {
    private static double[] id_class;
    private static float[] id_break;
    private static short[] id_byte;

    private static void id_byte() {
        double[] dArray = new double[3];
        dArray[1] = 0.4;
        id_class = dArray;
    }

    static {
        rrIU.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{20, 102, -32, -98, -11, -46, -68, 10}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static void id_class() {
        if (((Boolean)((cb_3)rrIU.id_import.id_class[rrIU.id_byte[0]]).id_break[id_byte[1]]).booleanValue()) {
            return;
        }
        float f = ((cb_3)rrIU.id_import.id_class[id_byte[2]]).Sa().nextFloat() * id_break[0];
        Float f2 = Float.valueOf(f);
        ((cb_3)rrIU.id_import.id_class[rrIU.id_byte[3]]).id_break[rrIU.id_byte[4]] = f2;
        Float f3 = Float.valueOf(f);
        ((cb_3)rrIU.id_import.id_class[rrIU.id_byte[5]]).id_break[rrIU.id_byte[6]] = f3;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA6AA304B;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x42F00FACA0DFBC38L;
    }

    public static void id_break() {
        rfH_2 rfH_22 = ((cb_3)rrIU.id_import.id_class[id_byte[7]]).Bs().id_byte(id_class[0], id_class[1], id_class[2]);
        ((Aq_1)((cb_3)rrIU.id_import.id_class[rrIU.id_byte[8]]).id_break[id_byte[9]]).id_break(new rZb_1(rZM.STOP_DESTROY_BLOCK, rfH_22, rpr_3.UP));
        ((Aq_1)((cb_3)rrIU.id_import.id_class[rrIU.id_byte[10]]).id_break[id_byte[11]]).id_break(new rZb_1(rZM.START_DESTROY_BLOCK, rfH_22, rpr_3.UP));
    }

    private static void id_throws() {
        short[] sArray = new short[12];
        sArray[0] = 57;
        sArray[1] = 42;
        sArray[2] = 57;
        sArray[3] = 57;
        sArray[4] = 49;
        sArray[5] = 57;
        sArray[6] = 50;
        sArray[7] = 57;
        sArray[8] = 57;
        sArray[10] = 57;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrIU.id_throws();
        rrIU.id_protected();
        rrIU.id_byte();
    }

    private static void id_protected() {
        id_break = new float[]{0.05f};
    }
}

