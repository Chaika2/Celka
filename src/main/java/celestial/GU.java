/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Ps_1;
import celestial.bq_3;
import celestial.rC_2;
import celestial.rjU_2;
import celestial.rn_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GU
extends bq_3 {
    private static short[] id_throws;
    private static double[] id_catch;
    private static boolean[] id_private;
    public Object[] id_break;
    private static String[] id_implements;
    private static byte[] id_finally;

    @Override
    public boolean id_byte() {
        if (((Ps_1)this.id_case[id_throws[0]]).id_catch() == null || ((Ps_1)this.id_case[id_throws[1]]).id_case() == null) {
            return id_private[0];
        }
        return id_private[1];
    }

    private static void id_int() {
        id_finally = new byte[]{3, 2};
    }

    public GU(C_class c_class) {
        super(c_class);
        this.id_final();
    }

    static {
        GU.ntfClinit();
    }

    @Override
    public rn_3 id_class(boolean bl, boolean bl2) {
        this.id_final();
        Boolean bl3 = bl2;
        this.id_break[GU.id_throws[6]] = bl3;
        if (((Boolean)this.id_break[id_throws[7]]).booleanValue()) {
            Boolean bl4 = id_private[8];
            this.id_break[GU.id_throws[8]] = bl4;
            if (this.id_implements()) {
                GU gU = this;
                Integer n = (Integer)gU.id_break[id_throws[9]] + id_private[9];
                gU.id_break[GU.id_throws[10]] = n;
            }
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_throws[11]]));
        }
        Integer n = id_private[10];
        this.id_break[GU.id_throws[12]] = n;
        return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_throws[13]]));
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-32, 95, 50, -75, 105, 10, 54, -14}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x62C80354;
    }

    @Override
    public String id_class() {
        return id_implements[0];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x247A20FF90986B97L;
    }

    private static /* synthetic */ void ntfClinit() {
        GU.id_extends();
        GU.id_finally();
        GU.id_volatile();
        GU.id_package();
        GU.id_int();
    }

    private static void id_finally() {
        id_implements = new String[]{new String("inventory pauser")};
    }

    @Override
    public boolean id_catch() {
        return id_private[11];
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[17];
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[14] = true;
        id_private = blArray;
    }

    @Override
    public double id_case() {
        return id_catch[1];
    }

    private boolean id_implements() {
        return this.id_native() < id_catch[0] ? id_private[2] : id_private[3];
    }

    private static void id_package() {
        id_catch = new double[]{1.0E-5, 5.1};
    }

    public boolean id_private() {
        this.id_final();
        Boolean bl = id_private[4];
        this.id_break[GU.id_throws[3]] = bl;
        return (Boolean)this.id_break[id_throws[4]] != false && (Integer)this.id_break[id_throws[5]] > id_private[5] ? id_private[6] : id_private[7];
    }

    private void id_final() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_finally[0]];
            objectArray[GU.id_private[12]] = id_private[13];
            objectArray[GU.id_private[14]] = id_private[15];
            objectArray[GU.id_finally[1]] = id_private[16];
        }
    }

    private static void id_volatile() {
        short[] sArray = new short[14];
        sArray[0] = 1;
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 1;
        sArray[9] = 2;
        sArray[10] = 2;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 5;
        id_throws = sArray;
    }

    private double id_native() {
        rjU_2 rjU_22 = ((Ps_1)this.id_case[id_throws[2]]).id_catch().rv();
        return Math.sqrt(rjU_22.id_break * rjU_22.id_break + rjU_22.id_protected * rjU_22.id_protected);
    }
}

