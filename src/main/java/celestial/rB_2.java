/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_throws;
import celestial.rJ_2;
import celestial.rP_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rB_2
implements rP_2 {
    private static short[] id_break;
    public static Object[] id_class;
    private static String[] id_byte;
    private static boolean[] id_protected;
    private static int[] id_throws;
    private static double[] id_case;

    private static void id_byte() {
        Object[] objectArray = new Object[]{0.7071067811865476};
        id_class = objectArray;
    }

    static {
        rB_2.ntfClinit();
    }

    public boolean equals(Object object) {
        return object.getClass() == rB_2.class ? id_protected[2] : id_protected[3];
    }

    public String toString() {
        return id_byte[0];
    }

    public int hashCode() {
        return id_throws[0];
    }

    @Override
    public double id_class(int n, int n2, int n3) {
        int n4 = Math.abs(n);
        int n5 = Math.abs(n3);
        int n6 = Math.min(n4, n5);
        int n7 = Math.max(n4, n5);
        int n8 = n7 - n6;
        double d = Math.min((double)n4, Math.min((double)n5, (double)n8 * (Double)id_class[id_break[1]]));
        return d * (Double)C_throws.id_break().PS.id_class[id_break[2]] + rJ_2.id_class((Integer)C_throws.id_break().id_instanceof.id_class[id_break[3]], n2);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCE12D33EB49D2D44L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1FE5371F;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{41, -106, -113, -63, 70, 88, -113, -70}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_throws = new int[]{201385781};
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        return n2 == (Integer)C_throws.id_break().id_instanceof.id_class[id_break[0]] && (n == 0 || n3 == 0 || Math.abs(n) == Math.abs(n3)) ? id_protected[0] : id_protected[1];
    }

    private static void id_throws() {
        id_break = new short[4];
    }

    private static /* synthetic */ void ntfClinit() {
        rB_2.id_catch();
        rB_2.id_case();
        rB_2.id_throws();
        rB_2.id_protected();
        rB_2.id_break();
        rB_2.id_byte();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[2] = true;
        blArray[5] = true;
        id_protected = blArray;
    }

    private static void id_case() {
        id_byte = new String[]{new String("GoalAxis")};
    }

    private static void id_protected() {
        double[] dArray = new double[3];
        dArray[0] = 2.0;
        dArray[1] = 2.0;
        id_case = dArray;
    }
}

