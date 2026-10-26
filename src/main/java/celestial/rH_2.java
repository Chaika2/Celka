/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rl_3;
import celestial.rq_3;
import celestial.ry_3;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rH_2
extends rl_3 {
    private static boolean[] id_byte;
    public Object[] id_break;
    private static short[] id_protected;
    private static byte[] id_throws;
    private static String[] id_case;

    public rH_2(int n, int n2, int n3) {
        super(n, n2, n3);
        ArrayList arrayList;
        this.id_throws();
        this.id_break[rH_2.id_protected[15]] = arrayList = new ArrayList();
        this.id_catch();
    }

    static {
        rH_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x60D82BEFEAA48F5EL;
    }

    public void id_class(rq_3 rq_32, int n, int n2, int n3) {
        this.id_throws();
        ((List)this.id_break[id_protected[16]]).add(new ry_3(rq_32, n, n2, n3));
        this.id_catch();
    }

    @Override
    public xc_3 id_class(int n, int n2, int n3, xc_3 xc_32, List<xc_3> list) {
        ry_3 ry_32 = this.id_break(n, n2, n3, xc_32);
        if (ry_32 == null) {
            throw new IllegalStateException(id_case[0]);
        }
        return ((rq_3)ry_32.id_class[id_protected[29]]).id_class(n - (Integer)ry_32.id_class[id_protected[30]], n2 - (Integer)ry_32.id_class[id_protected[31]], n3 - (Integer)ry_32.id_class[id_protected[32]], xc_32, list);
    }

    @Override
    public boolean id_class(int n, int n2, int n3, xc_3 xc_32) {
        ry_3 ry_32 = this.id_break(n, n2, n3, xc_32);
        return ry_32 != null && ((rq_3)ry_32.id_class[id_protected[25]]).id_class(n - (Integer)ry_32.id_class[id_protected[26]], n2 - (Integer)ry_32.id_class[id_protected[27]], n3 - (Integer)ry_32.id_class[id_protected[28]], xc_32) ? id_byte[3] : id_byte[4];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3EA845D0;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{58, 74, -46, 71, 108, 127, 57, -25}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private ry_3 id_break(int n, int n2, int n3, xc_3 xc_32) {
        this.id_throws();
        ry_3[] ry_3Array = (ry_3[])this.id_break[id_protected[17]];
        int n4 = ry_3Array.length;
        for (int i = id_byte[2]; i < n4; ++i) {
            ry_3 ry_32 = ry_3Array[i];
            if (n < (Integer)ry_32.id_class[id_protected[18]] || n2 < (Integer)ry_32.id_class[id_protected[19]] || n3 < (Integer)ry_32.id_class[id_protected[20]] || !((rq_3)ry_32.id_class[id_protected[21]]).id_class(n - (Integer)ry_32.id_class[id_protected[22]], n2 - (Integer)ry_32.id_class[id_protected[23]], n3 - (Integer)ry_32.id_class[id_protected[24]], xc_32)) continue;
            return ry_32;
        }
        return null;
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rH_2.id_implements();
        rH_2.id_case();
        rH_2.id_finally();
        rH_2.id_private();
    }

    private static void id_finally() {
        short[] sArray = new short[35];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[4] = 1;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[12] = 3;
        sArray[14] = 2;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[19] = 2;
        sArray[20] = 3;
        sArray[22] = 1;
        sArray[23] = 2;
        sArray[24] = 3;
        sArray[26] = 1;
        sArray[27] = 2;
        sArray[28] = 3;
        sArray[30] = 1;
        sArray[31] = 2;
        sArray[32] = 3;
        sArray[33] = 1;
        id_protected = sArray;
    }

    private void id_catch() {
        ry_3[] ry_3Array;
        this.id_throws();
        this.id_break[rH_2.id_protected[1]] = ry_3Array = ((List)this.id_break[id_protected[0]]).toArray(new ry_3[id_byte[0]]);
        ry_3[] ry_3Array2 = (ry_3[])this.id_break[id_protected[2]];
        int n = ry_3Array2.length;
        for (int i = id_byte[1]; i < n; ++i) {
            ry_3 ry_32 = ry_3Array2[i];
            Integer n2 = Math.max((Integer)this.id_class[id_protected[3]], (Integer)ry_32.id_class[id_protected[4]] + ((rq_3)ry_32.id_class[id_protected[5]]).id_break());
            this.id_class[rH_2.id_protected[6]] = n2;
            Integer n3 = Math.max((Integer)this.id_class[id_protected[7]], (Integer)ry_32.id_class[id_protected[8]] + ((rq_3)ry_32.id_class[id_protected[9]]).id_class());
            this.id_class[rH_2.id_protected[10]] = n3;
            Integer n4 = Math.max((Integer)this.id_class[id_protected[11]], (Integer)ry_32.id_class[id_protected[12]] + ((rq_3)ry_32.id_class[id_protected[13]]).id_byte());
            this.id_class[rH_2.id_protected[14]] = n4;
        }
    }

    private static void id_case() {
        id_case = new String[]{new String("couldn't find schematic for this position")};
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[6];
        blArray[3] = true;
        id_byte = blArray;
    }

    @Override
    public void id_protected() {
        this.id_throws();
        ry_3[] ry_3Array = (ry_3[])this.id_break[id_protected[33]];
        int n = ry_3Array.length;
        for (int i = id_byte[5]; i < n; ++i) {
            ry_3 ry_32 = ry_3Array[i];
            ((rq_3)ry_32.id_class[id_protected[34]]).id_protected();
        }
    }

    private static void id_private() {
        id_throws = new byte[]{2};
    }
}

