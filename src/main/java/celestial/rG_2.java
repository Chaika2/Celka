/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rP_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rG_2
implements rP_2 {
    private static short[] id_break;
    private static boolean[] id_byte;
    private static int[] id_protected;
    private static double[] id_throws;
    private static String[] id_case;
    public Object[] id_class;

    private static void id_byte() {
        id_protected = new int[]{495796690};
    }

    public rG_2(rP_2 rP_22) {
        this.id_protected();
        rP_2 rP_23 = rP_22;
        this.id_class[rG_2.id_break[0]] = rP_23;
    }

    static {
        rG_2.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_byte[1];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_byte[2];
        }
        rG_2 rG_22 = (rG_2)object;
        return Objects.equals((rP_2)this.id_class[id_break[2]], (rP_2)rG_22.id_class[id_break[3]]);
    }

    public String toString() {
        Object[] objectArray = new Object[id_byte[3]];
        objectArray[rG_2.id_byte[4]] = ((rP_2)this.id_class[id_break[5]]).toString();
        return String.format(id_case[0], objectArray);
    }

    public int hashCode() {
        return ((rP_2)this.id_class[id_break[4]]).hashCode() * id_protected[0];
    }

    @Override
    public double id_class(int n, int n2, int n3) {
        return -((rP_2)this.id_class[id_break[1]]).id_class(n, n2, n3);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-45, 48, -63, -68, -65, 58, -93, -57}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF4B2CC8D683D7FAAL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x336E2258;
    }

    @Override
    public double id_class() {
        return id_throws[0];
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        id_byte = blArray;
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        return id_byte[0];
    }

    private static void id_throws() {
        id_throws = new double[]{Double.NEGATIVE_INFINITY};
    }

    private static /* synthetic */ void ntfClinit() {
        rG_2.id_break();
        rG_2.id_case();
        rG_2.id_catch();
        rG_2.id_throws();
        rG_2.id_byte();
    }

    private static void id_catch() {
        id_break = new short[6];
    }

    private static void id_case() {
        id_case = new String[]{new String("GoalInverted{%s}")};
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[5]];
        }
    }
}

