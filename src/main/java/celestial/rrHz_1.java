/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.rjG_2;
import celestial.rjU_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHz_1 {
    private static short[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;
    private static double[] id_throws;

    public double id_byte() {
        return (Double)this.id_class[id_break[11]];
    }

    public rrHz_1(an_3 an_32, aI_2<?> aI_22, double d, double d2, double d3, double d4, double d5, double d6, int n) {
        aI_2<?> aI_23;
        this.id_package();
        an_3 an_33 = an_32;
        this.id_class[rrHz_1.id_break[16]] = an_33;
        this.id_class[rrHz_1.id_break[17]] = aI_23 = aI_22;
        Double d7 = d;
        this.id_class[rrHz_1.id_break[18]] = d7;
        Double d8 = d2;
        this.id_class[rrHz_1.id_break[19]] = d8;
        Double d9 = d3;
        this.id_class[rrHz_1.id_break[20]] = d9;
        Double d10 = d4;
        this.id_class[rrHz_1.id_break[21]] = d10;
        Double d11 = d5;
        this.id_class[rrHz_1.id_break[22]] = d11;
        Double d12 = d6;
        this.id_class[rrHz_1.id_break[23]] = d12;
        Integer n2 = n;
        this.id_class[rrHz_1.id_break[24]] = n2;
    }

    static {
        rrHz_1.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_protected[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_protected[1];
        }
        rrHz_1 rrHz_12 = (rrHz_1)object;
        return Objects.equals((an_3)this.id_class[id_break[3]], (an_3)rrHz_12.id_class[id_break[4]]);
    }

    public int hashCode() {
        return Objects.hashCode((an_3)this.id_class[id_break[5]]);
    }

    public void id_class(List<rjG_2> list) {
        List<rjG_2> list2;
        this.id_class[rrHz_1.id_break[25]] = list2 = list;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA3363E2A;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3626297E9094F378L;
    }

    public an_3 id_class() {
        return (an_3)this.id_class[id_break[6]];
    }

    public double id_class(iB_2 iB_22) {
        rjU_2 rjU_22 = iB_22.Ps();
        double d = (Double)this.id_class[id_break[0]] - rjU_22.id_break;
        double d2 = (Double)this.id_class[id_break[1]] - rjU_22.id_byte;
        double d3 = (Double)this.id_class[id_break[2]] - rjU_22.id_protected;
        return d * d + d2 * d2 + d3 * d3;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-70, -19, 57, 31, -50, 93, 8, -74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public double id_break() {
        return (Double)this.id_class[id_break[14]];
    }

    public double id_throws() {
        return (Double)this.id_class[id_break[13]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrHz_1.id_final();
        rrHz_1.id_native();
        rrHz_1.id_extends();
        rrHz_1.id_volatile();
    }

    public double id_finally() {
        return (Double)this.id_class[id_break[9]];
    }

    public aI_2<?> id_catch() {
        return (aI_2)this.id_class[id_break[8]];
    }

    private static void id_extends() {
        id_throws = new double[6];
    }

    public double id_case() {
        return (Double)this.id_class[id_break[12]];
    }

    public int id_implements() {
        return (Integer)this.id_class[id_break[15]];
    }

    private void id_package() {
        if (this.id_class == null) {
            this.id_class = new Object[10];
            this.id_class[3] = 0.0;
            this.id_class[4] = 0.0;
            this.id_class[5] = 0.0;
            this.id_class[6] = 0.0;
            this.id_class[7] = 0.0;
            this.id_class[8] = 0.0;
            this.id_class[9] = 0;
        }
    }

    public List<rjG_2> id_protected() {
        return (List)this.id_class[id_break[7]];
    }

    public double id_private() {
        return (Double)this.id_class[id_break[10]];
    }

    private static void id_final() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        id_protected = blArray;
    }

    private static void id_volatile() {
        id_byte = new byte[]{10, 3, 4, 5, 6, 7, 8, 9};
    }

    private static void id_native() {
        short[] sArray = new short[26];
        sArray[0] = 3;
        sArray[1] = 4;
        sArray[2] = 5;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[9] = 3;
        sArray[10] = 4;
        sArray[11] = 5;
        sArray[12] = 6;
        sArray[13] = 7;
        sArray[14] = 8;
        sArray[15] = 9;
        sArray[17] = 2;
        sArray[18] = 3;
        sArray[19] = 4;
        sArray[20] = 5;
        sArray[21] = 6;
        sArray[22] = 7;
        sArray[23] = 8;
        sArray[24] = 9;
        sArray[25] = 1;
        id_break = sArray;
    }
}

