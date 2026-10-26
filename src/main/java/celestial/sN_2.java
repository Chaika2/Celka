/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.sZ_2;
import celestial.sc_3;
import celestial.sm_3;
import celestial.su_3;
import celestial.sv_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sN_2 {
    private static boolean[] id_break;
    private static String[] id_byte;
    private static byte[] id_protected;
    public Object[] id_class;
    private static short[] id_throws;

    private static void id_byte() {
        id_protected = new byte[]{3, 2, 4, 2, 3, 3, 2, 4};
    }

    public sN_2(C_case c_case) {
        this.id_break();
        boolean[] blArray = new boolean[id_break[0]];
        blArray[sN_2.id_break[1]] = id_break[2];
        boolean[] blArray2 = blArray;
        c_case.id_goto().id_class(new sc_3(this, blArray2, c_case));
        String[] stringArray = new String[id_protected[0]];
        stringArray[sN_2.id_break[3]] = id_byte[0];
        stringArray[sN_2.id_break[4]] = id_byte[1];
        stringArray[sN_2.id_protected[1]] = id_byte[2];
        su_3 su_32 = new su_3(this, c_case, stringArray, blArray2);
        this.id_class[sN_2.id_throws[0]] = su_32;
        String[] stringArray2 = new String[id_protected[2]];
        stringArray2[sN_2.id_break[5]] = id_byte[3];
        stringArray2[sN_2.id_break[6]] = id_byte[4];
        stringArray2[sN_2.id_protected[3]] = id_byte[5];
        stringArray2[sN_2.id_protected[4]] = id_byte[6];
        sm_3 sm_32 = new sm_3(this, c_case, stringArray2, blArray2);
        this.id_class[sN_2.id_throws[1]] = sm_32;
        String[] stringArray3 = new String[id_break[7]];
        stringArray3[sN_2.id_break[8]] = id_byte[7];
        sZ_2 sZ_22 = new sZ_2(this, c_case, stringArray3, blArray2);
        this.id_class[sN_2.id_throws[2]] = sZ_22;
        String[] stringArray4 = new String[id_protected[5]];
        stringArray4[sN_2.id_break[9]] = id_byte[8];
        stringArray4[sN_2.id_break[10]] = id_byte[9];
        stringArray4[sN_2.id_protected[6]] = id_byte[10];
        sv_3 sv_32 = new sv_3(this, c_case, stringArray4, blArray2);
        this.id_class[sN_2.id_throws[3]] = sv_32;
    }

    static {
        sN_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{95, -64, -86, 101, -87, 36, -24, 94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDBA68183;
    }

    private static void id_class() {
        id_byte = new String[]{new String("pause"), new String("p"), new String("paws"), new String("resume"), new String("r"), new String("unpause"), new String("unpaws"), new String("paused"), new String("cancel"), new String("c"), new String("stop")};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD2DEEB0828F4229CL;
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[7]];
        }
    }

    private static void id_throws() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        id_throws = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        sN_2.id_protected();
        sN_2.id_class();
        sN_2.id_throws();
        sN_2.id_byte();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[10] = true;
        id_break = blArray;
    }
}

