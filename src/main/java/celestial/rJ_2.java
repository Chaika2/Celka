/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Pd_1;
import celestial.rP_2;
import celestial.rx_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rJ_2
implements rP_2,
rx_3 {
    public Object[] id_class;
    private static double[] id_new;
    private static short[] id_continue;
    private static String[] id_super;
    private static int[] id_this;
    private static boolean[] id_else;
    private static byte[] id_synchronized;

    private static void id_byte() {
        double[] dArray = new double[2];
        dArray[0] = 2.0;
        id_new = dArray;
    }

    public rJ_2(int n) {
        this.id_case();
        Integer n2 = n;
        this.id_class[rJ_2.id_continue[0]] = n2;
    }

    static {
        rJ_2.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_else[2];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_else[3];
        }
        rJ_2 rJ_22 = (rJ_2)object;
        return ((Integer)this.id_class[id_continue[3]]).intValue() == ((Integer)rJ_22.id_class[id_continue[4]]).intValue() ? id_else[4] : id_else[5];
    }

    public String toString() {
        Object[] objectArray = new Object[id_else[6]];
        objectArray[rJ_2.id_else[7]] = Pd_1.id_class((Integer)this.id_class[id_continue[6]]);
        return String.format(id_super[0], objectArray);
    }

    public int hashCode() {
        return (Integer)this.id_class[id_continue[5]] * id_this[0];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{49, 115, 96, 70, 10, -50, 57, -51}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDD718D83F7D251FFL;
    }

    public static double id_class(int n, int n2) {
        if (n2 > n) {
            return id_package[id_synchronized[0]] / id_new[0] * (double)(n2 - n);
        }
        if (n2 < n) {
            return (double)(n - n2) * id_break;
        }
        return id_new[1];
    }

    @Override
    public double id_class(int n, int n2, int n3) {
        return rJ_2.id_class((Integer)this.id_class[id_continue[2]], n2);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x92EF7BF7;
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        return n2 == (Integer)this.id_class[id_continue[1]] ? id_else[0] : id_else[1];
    }

    private static void id_break() {
        id_synchronized = new byte[]{2};
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[8] = true;
        id_else = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rJ_2.id_throws();
        rJ_2.id_catch();
        rJ_2.id_private();
        rJ_2.id_byte();
        rJ_2.id_break();
        rJ_2.id_protected();
    }

    private static void id_catch() {
        id_super = new String[]{new String("GoalYLevel{y=%s}")};
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_else[8]];
            objectArray[rJ_2.id_else[9]] = id_else[10];
        }
    }

    private static void id_protected() {
        id_this = new int[]{1271009915};
    }

    private static void id_private() {
        id_continue = new short[7];
    }
}

