/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rI_2;
import celestial.rY_2;
import celestial.rja_3;
import celestial.rpr_3;
import celestial.rq_3;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mb_1
extends rI_2 {
    private static short[] id_protected;
    private static boolean[] id_throws;
    public Object[] id_byte;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{75, -43, -94, -37, 122, 112, 27, 46}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Mb_1(rq_3 rq_32, rja_3 rja_32, rY_2[] rY_2Array) {
        super(rq_32);
        rY_2[] rY_2Array2;
        this.id_throws();
        this.id_byte[Mb_1.id_protected[0]] = rY_2Array2 = (rY_2[])Stream.of(rY_2Array).map(rY_22 -> rY_22.id_class(rpr_3.WEST, rja_32.b_()).id_class(rpr_3.DOWN, rja_32.c_()).id_class(rpr_3.NORTH, rja_32.d_())).toArray(rY_2[]::new);
    }

    static {
        Mb_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFC46ED8D48CA2BCDL;
    }

    @Override
    public boolean id_break(int n, int n2, int n3, xc_3 xc_32) {
        this.id_throws();
        rY_2[] rY_2Array = (rY_2[])this.id_byte[id_protected[1]];
        int n4 = rY_2Array.length;
        for (int i = id_throws[0]; i < n4; ++i) {
            rY_2 rY_22 = rY_2Array[i];
            if (n < (Integer)rY_22.id_class().id_break[id_protected[2]] || n2 < (Integer)rY_22.id_class().id_break[id_protected[3]] || n3 < (Integer)rY_22.id_class().id_break[id_protected[4]] || n > (Integer)rY_22.id_protected().id_break[id_protected[5]] || n2 > (Integer)rY_22.id_protected().id_break[id_protected[6]] || n3 > (Integer)rY_22.id_protected().id_break[id_protected[7]]) continue;
            return id_throws[1];
        }
        return id_throws[2];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x82872641;
    }

    private void id_throws() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_throws[3]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Mb_1.id_case();
        Mb_1.id_catch();
    }

    private static void id_catch() {
        short[] sArray = new short[8];
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[6] = 1;
        sArray[7] = 2;
        id_protected = sArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[4];
        blArray[1] = true;
        blArray[3] = true;
        id_throws = blArray;
    }
}

