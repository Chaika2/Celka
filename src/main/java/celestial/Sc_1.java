/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rfl_3;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class Sc_1 {
    private static byte[] id_break;
    private static int[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;
    private static boolean[] id_throws;

    public rfl_3 id_byte() {
        if ((rfl_3)this.id_class[id_protected[3]] != null || ((Map)this.id_class[id_protected[4]]).isEmpty()) {
            return (rfl_3)this.id_class[id_protected[5]];
        }
        int[] nArray = new int[id_break[0]];
        nArray[Sc_1.id_throws[4]] = id_byte[0];
        nArray[Sc_1.id_throws[5]] = id_byte[1];
        nArray[Sc_1.id_break[1]] = id_byte[2];
        int[] nArray2 = nArray;
        int[] nArray3 = new int[id_break[2]];
        nArray3[Sc_1.id_throws[6]] = id_byte[3];
        nArray3[Sc_1.id_throws[7]] = id_byte[4];
        nArray3[Sc_1.id_break[3]] = id_byte[5];
        int[] nArray4 = nArray3;
        for (rfH_2 rfH_22 : ((Map)this.id_class[id_protected[6]]).keySet()) {
            nArray2[Sc_1.id_throws[8]] = Math.min(nArray2[id_throws[9]], rfH_22.b_());
            nArray2[Sc_1.id_throws[10]] = Math.min(nArray2[id_throws[11]], rfH_22.c_());
            nArray2[Sc_1.id_break[4]] = Math.min(nArray2[id_break[5]], rfH_22.d_());
            nArray4[Sc_1.id_throws[12]] = Math.max(nArray4[id_throws[13]], rfH_22.b_() + id_throws[14]);
            nArray4[Sc_1.id_throws[15]] = Math.max(nArray4[id_throws[16]], rfH_22.c_() + id_throws[17]);
            nArray4[Sc_1.id_break[6]] = Math.max(nArray4[id_break[7]], rfH_22.d_() + id_throws[18]);
        }
        rfl_3 rfl_32 = new rfl_3(nArray2[id_throws[19]], nArray2[id_throws[20]], nArray2[id_break[8]], nArray4[id_throws[21]], nArray4[id_throws[22]], nArray4[id_break[9]]);
        this.id_class[Sc_1.id_protected[7]] = rfl_32;
        return rfl_32;
    }

    public Sc_1() {
        HashMap hashMap;
        this.id_implements();
        this.id_class[Sc_1.id_protected[10]] = hashMap = new HashMap();
    }

    static {
        Sc_1.ntfClinit();
    }

    public void id_class(Map<rfH_2, xd_3> map) {
        ((Map)this.id_class[id_protected[0]]).putAll(map);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1D7B9E7F959AC3EAL;
    }

    public void id_class(rfl_3 rfl_32) {
        rfl_3 rfl_33 = rfl_32;
        this.id_class[Sc_1.id_protected[11]] = rfl_33;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-68, 113, 52, 4, 78, -111, 51, -84}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3FA42FCC;
    }

    public rfl_3 id_class() {
        return (rfl_3)this.id_class[id_protected[9]];
    }

    public Map<rfH_2, xd_3> id_break() {
        return (Map)this.id_class[id_protected[8]];
    }

    public boolean id_throws() {
        return (rfl_3)this.id_class[id_protected[2]] != null ? id_throws[2] : id_throws[3];
    }

    private static /* synthetic */ void ntfClinit() {
        Sc_1.id_private();
        Sc_1.id_case();
        Sc_1.id_finally();
        Sc_1.id_catch();
    }

    private static void id_finally() {
        id_break = new byte[]{3, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2};
    }

    private static void id_catch() {
        id_byte = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
    }

    private static void id_case() {
        short[] sArray = new short[12];
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[9] = 1;
        sArray[11] = 1;
        id_protected = sArray;
    }

    private void id_implements() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[10]];
        }
    }

    public boolean id_protected() {
        return !((Map)this.id_class[id_protected[1]]).isEmpty() ? id_throws[0] : id_throws[1];
    }

    private static void id_private() {
        boolean[] blArray = new boolean[23];
        blArray[0] = true;
        blArray[2] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[18] = true;
        blArray[20] = true;
        blArray[22] = true;
        id_throws = blArray;
    }
}

