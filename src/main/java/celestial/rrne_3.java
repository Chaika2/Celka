/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.rZO;
import celestial.rZT;
import celestial.rZq_1;
import celestial.rhd_3;
import celestial.rrFK;
import celestial.rrLZ;
import celestial.rrjS_2;
import celestial.ruS_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrne_3
implements MinecraftAccessor {
    private static boolean[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static double[] id_protected;
    private static long[] id_throws;
    private static short[] id_case;

    private static void id_byte() {
        id_byte = new byte[]{3, 19, 4, 2, 3};
    }

    public rrne_3() {
        this.id_throws();
    }

    static {
        rrne_3.ntfClinit();
    }

    @EventTarget
    public void id_class(rrFK rrFK2) {
        Integer n = id_break[4];
        this.id_class[rrne_3.id_case[15]] = n;
        Long l = id_throws[1];
        this.id_class[rrne_3.id_case[16]] = l;
        Boolean bl = id_break[5];
        this.id_class[rrne_3.id_case[17]] = bl;
        Double d = id_protected[4];
        this.id_class[rrne_3.id_case[18]] = d;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB0DD2B37;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1FB3738E31B006F9L;
    }

    @EventTarget
    public void id_class(rrLZ rrLZ2) {
        rZq_1 rZq_12;
        ruS_2<?> ruS_22 = rrLZ2.id_class();
        if (ruS_22 instanceof rZq_1 && (rZq_12 = (rZq_1)ruS_22).id_break() == rZT.ATTACK && rZq_12.id_byte() instanceof rhd_3) {
            long l = System.currentTimeMillis();
            long l2 = l - (Long)this.id_class[id_case[0]];
            Long l3 = l;
            this.id_class[rrne_3.id_case[1]] = l3;
            if (((Boolean)this.id_class[id_case[2]]).booleanValue()) {
                if (l2 > id_throws[0]) {
                    rrne_3 rrne_32 = this;
                    Integer n = (Integer)rrne_32.id_class[id_case[3]] + id_break[0];
                    rrne_32.id_class[rrne_3.id_case[4]] = n;
                }
            } else {
                Integer n = id_break[1];
                this.id_class[rrne_3.id_case[5]] = n;
            }
        } else if (ruS_22 instanceof rZO) {
            rZO rZO2 = (rZO)ruS_22;
            double d = rZO2.id_break(((cb_3)rrne_3.id_import.id_class[id_case[6]]).re()) - ((cb_3)rrne_3.id_import.id_class[id_case[7]]).O();
            double d2 = (Double)this.id_class[id_case[8]];
            if (d >= id_protected[0]) {
                Double d3 = id_protected[1];
                this.id_class[rrne_3.id_case[9]] = d3;
            } else {
                rrne_3 rrne_33 = this;
                Double d4 = (Double)rrne_33.id_class[id_case[10]] - d;
                rrne_33.id_class[rrne_3.id_case[11]] = d4;
            }
            if (rrjS_2.id_protected() || ((cb_3)rrne_3.id_import.id_class[id_case[12]]).Bj() >= id_byte[0]) {
                Boolean bl = d2 == id_protected[2] && (Double)this.id_class[id_case[13]] != id_protected[3] ? id_break[2] : id_break[3];
                this.id_class[rrne_3.id_case[14]] = bl;
            }
        }
    }

    public boolean id_class() {
        return (Boolean)this.id_class[id_case[20]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{94, 79, 77, -49, 37, -128, 102, -125}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_break() {
        return (Integer)this.id_class[id_case[19]] >= id_byte[1] ? id_break[6] : id_break[7];
    }

    private void id_throws() {
        if (this.id_class == null) {
            this.id_class = new Object[4];
            this.id_class[0] = 0L;
            this.id_class[1] = 0;
            this.id_class[2] = 0.0;
            this.id_class[3] = false;
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrne_3.id_private();
        rrne_3.id_catch();
        rrne_3.id_protected();
        rrne_3.id_case();
        rrne_3.id_byte();
    }

    private static void id_catch() {
        long[] lArray = new long[3];
        lArray[0] = 400L;
        id_throws = lArray;
    }

    private static void id_case() {
        id_protected = new double[6];
    }

    private static void id_protected() {
        short[] sArray = new short[21];
        sArray[2] = 3;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 57;
        sArray[7] = 57;
        sArray[8] = 2;
        sArray[9] = 2;
        sArray[10] = 2;
        sArray[11] = 2;
        sArray[12] = 57;
        sArray[13] = 2;
        sArray[14] = 3;
        sArray[15] = 1;
        sArray[17] = 3;
        sArray[18] = 2;
        sArray[19] = 1;
        sArray[20] = 3;
        id_case = sArray;
    }

    private static void id_private() {
        boolean[] blArray = new boolean[12];
        blArray[0] = true;
        blArray[2] = true;
        blArray[6] = true;
        blArray[9] = true;
        id_break = blArray;
    }
}

