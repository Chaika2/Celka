/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfl_3;
import celestial.rjU_2;
import celestial.rrCp_1;
import celestial.rrTA;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCq_1 {
    private static byte[] id_byte;
    private static boolean[] id_protected;
    private static short[] id_throws;
    public Object[] id_class;
    public static Object[] id_break;
    private static double[] id_case;

    public Random id_byte() {
        return (Random)this.id_class[id_throws[12]];
    }

    public rrCq_1() {
        this.id_protected();
        Random random = new Random();
        this.id_class[rrCq_1.id_throws[0]] = random;
        Double d = id_case[0];
        this.id_class[rrCq_1.id_throws[1]] = d;
    }

    static {
        rrCq_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x629B5F5D22C48217L;
    }

    public rrTA id_class() {
        return (rrTA)this.id_class[id_throws[13]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{39, -69, -33, 121, 114, 120, -95, 22}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rrCp_1 rrCp_12, List<rrTA> list) {
        this.id_class(id_case[1]);
        if ((rrTA)this.id_class[id_throws[2]] == null) {
            this.id_class(list);
        }
        if ((rrTA)this.id_class[id_throws[3]] == null) {
            return;
        }
        if (rrCp_12.id_class() == null) {
            rrCp_12.id_class(rfl_3.id_catch(id_case[2], id_case[3], id_case[4]).id_protected(((rrTA)this.id_class[id_throws[4]]).rr()));
            return;
        }
        rfl_3 rfl_32 = rrCp_12.id_class();
        rjU_2 rjU_22 = rfl_32.id_case();
        rjU_2 rjU_23 = ((rrTA)this.id_class[id_throws[5]]).rr();
        rjU_2 rjU_24 = rjU_23.id_protected(rjU_22).id_protected();
        rjU_2 rjU_25 = rjU_24.id_class((Double)this.id_class[id_throws[6]]);
        rfl_3 rfl_33 = rfl_32.id_protected(rjU_25.id_break, rjU_25.id_byte, rjU_25.id_protected);
        rrCp_12.id_class(rfl_33);
        if (rjU_22.id_case(rjU_23) < (Double)this.id_class[id_throws[7]]) {
            this.id_class(list);
        }
    }

    public void id_class(double d) {
        Double d2 = d;
        this.id_class[rrCq_1.id_throws[11]] = d2;
    }

    private void id_class(List<rrTA> list) {
        if (list == null || list.isEmpty()) {
            Object var6_2 = null;
            this.id_class[rrCq_1.id_throws[8]] = var6_2;
            return;
        }
        rrTA rrTA2 = list.get(((Random)this.id_class[id_throws[9]]).nextInt(list.size()));
        this.id_class[rrCq_1.id_throws[10]] = rrTA2;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7F5806DC;
    }

    public double id_break() {
        return (Double)this.id_class[id_throws[14]];
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{0.001};
        id_break = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrCq_1.id_implements();
        rrCq_1.id_case();
        rrCq_1.id_catch();
        rrCq_1.id_private();
        rrCq_1.id_throws();
    }

    private static void id_catch() {
        double[] dArray = new double[7];
        dArray[0] = 0.001;
        dArray[1] = 0.01f;
        dArray[2] = 0.1f;
        dArray[3] = 0.1f;
        dArray[4] = 0.1f;
        dArray[6] = 0.001;
        id_case = dArray;
    }

    private static void id_case() {
        short[] sArray = new short[15];
        sArray[1] = 2;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[8] = 1;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[13] = 1;
        sArray[14] = 2;
        id_throws = sArray;
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_protected = blArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
            this.id_class[2] = 0.0;
        }
    }

    private static void id_private() {
        id_byte = new byte[]{3, 2};
    }
}

