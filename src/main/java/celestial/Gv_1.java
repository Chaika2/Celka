/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Pd_1;
import celestial.rE_2;
import celestial.rfH_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gv_1
extends rE_2 {
    private static int[] id_break;
    private static String[] id_byte;
    private static short[] id_protected;
    private static byte[] id_throws;
    private static boolean[] id_case;

    private static void id_byte() {
        short[] sArray = new short[4];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 2;
        id_protected = sArray;
    }

    public Gv_1(rfH_2 rfH_22) {
        super(rfH_22);
    }

    static {
        Gv_1.ntfClinit();
    }

    @Override
    public String toString() {
        Object[] objectArray = new Object[id_throws[0]];
        objectArray[Gv_1.id_case[1]] = Pd_1.id_class((Integer)this.id_class[id_protected[1]]);
        objectArray[Gv_1.id_case[2]] = Pd_1.id_class((Integer)this.id_class[id_protected[2]]);
        objectArray[Gv_1.id_throws[1]] = Pd_1.id_class((Integer)this.id_class[id_protected[3]]);
        return String.format(id_byte[0], objectArray);
    }

    @Override
    public int hashCode() {
        return super.hashCode() * id_break[0];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6F189C6D3EED28AAL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2C5A55E5;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-102, -110, -32, 15, 27, -85, 39, 95}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        if (n2 > (Integer)this.id_class[id_protected[0]]) {
            return id_case[0];
        }
        return super.id_break(n, n2, n3);
    }

    private static void id_throws() {
        id_break = new int[]{1636324008};
    }

    private static /* synthetic */ void ntfClinit() {
        Gv_1.id_case();
        Gv_1.id_protected();
        Gv_1.id_byte();
        Gv_1.id_catch();
        Gv_1.id_throws();
    }

    private static void id_catch() {
        id_throws = new byte[]{3, 2};
    }

    private static void id_case() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_case = blArray;
    }

    private static void id_protected() {
        id_byte = new String[]{new String("GoalBreak{x=%s,y=%s,z=%s}")};
    }
}

