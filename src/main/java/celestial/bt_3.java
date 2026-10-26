/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.PP;
import celestial.Ps_1;
import celestial.rff_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rpm_3;
import celestial.ryZ_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bt_3
implements PP {
    private static boolean[] id_throws;
    private static short[] id_case;
    public Object[] id_class;
    public static Object[] id_break;
    private static byte[] id_catch;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_catch[0]];
            objectArray[bt_3.id_throws[3]] = id_throws[4];
        }
    }

    public bt_3(Ps_1 ps_1) {
        this.id_byte();
        Ps_1 ps_12 = ps_1;
        this.id_class[bt_3.id_case[0]] = ps_12;
    }

    static {
        bt_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEFCACAF3BCFD2E28L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC6218B27;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-24, 57, 14, 90, -78, 30, -95, 3}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(boolean bl) {
        if ((Integer)this.id_class[id_case[1]] > 0) {
            bt_3 bt_32 = this;
            Integer n = (Integer)bt_32.id_class[id_case[2]] - id_throws[0];
            bt_32.id_class[bt_3.id_case[3]] = n;
            return;
        }
        rjG_2 rjG_22 = ((Ps_1)this.id_class[id_case[4]]).id_byte();
        if (!bl || ((Ps_1)this.id_class[id_case[5]]).id_catch().id_long() || rjG_22 == null || rjG_22.id_byte() != rjM_2.BLOCK) {
            return;
        }
        Integer n = (Integer)C_class.id_instanceof().PO.id_class[id_case[6]] - id_throws[1];
        this.id_class[bt_3.id_case[7]] = n;
        rpm_3[] rpm_3Array = rpm_3.values();
        int n2 = rpm_3Array.length;
        for (int i = id_throws[2]; i < n2; ++i) {
            rpm_3 rpm_32 = rpm_3Array[i];
            if (((Ps_1)this.id_class[id_case[8]]).id_native().id_break(((Ps_1)this.id_class[id_case[9]]).id_catch(), ((Ps_1)this.id_class[id_case[10]]).id_case(), rpm_32, (rff_3)rjG_22) == ryZ_2.SUCCESS) {
                ((Ps_1)this.id_class[id_case[11]]).id_catch().id_class(rpm_32);
                return;
            }
            if (((Ps_1)this.id_class[id_case[12]]).id_catch().id_protected(rpm_32).id_class() || ((Ps_1)this.id_class[id_case[13]]).id_native().id_class(rpm_32) != ryZ_2.SUCCESS) continue;
            return;
        }
    }

    private static void id_class() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        id_throws = blArray;
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{1};
        id_break = objectArray;
    }

    private static void id_throws() {
        short[] sArray = new short[14];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[7] = 1;
        id_case = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        bt_3.id_class();
        bt_3.id_throws();
        bt_3.id_protected();
        bt_3.id_break();
    }

    private static void id_protected() {
        id_catch = new byte[]{2};
    }
}

