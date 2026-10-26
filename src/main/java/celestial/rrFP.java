/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cb_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rhz_3;
import celestial.rrFr_1;
import celestial.rrHv_1;
import celestial.rrZO;
import celestial.setting.KeyBind;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFP
extends rrFr_1 {
    private static long[] id_byte;
    private static String[] id_protected;
    private static double[] id_throws;
    private static short[] id_case;
    private static boolean[] id_catch;
    private static byte[] id_private;
    private static float[] id_implements;
    public Object[] id_break;

    @Override
    public boolean id_byte() {
        return id_catch[0];
    }

    private long id_byte(long l) {
        this.id_super();
        long l2 = l - (Long)this.id_break[id_case[32]];
        if (l2 < id_byte[3] || l2 >= id_byte[4]) {
            return l;
        }
        float f = (float)l2 / id_implements[3];
        float f2 = f < id_implements[4] ? f : id_implements[5] - f;
        return l - (long)(f2 * id_implements[6]);
    }

    private static void id_int() {
        short[] sArray = new short[39];
        sArray[0] = 8;
        sArray[1] = 10;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 3;
        sArray[6] = 1;
        sArray[7] = 8;
        sArray[8] = 5;
        sArray[9] = 4;
        sArray[10] = 6;
        sArray[11] = 7;
        sArray[12] = 6;
        sArray[13] = 4;
        sArray[14] = 1;
        sArray[17] = 5;
        sArray[19] = 6;
        sArray[20] = 57;
        sArray[21] = 57;
        sArray[22] = 3;
        sArray[23] = 7;
        sArray[25] = 8;
        sArray[26] = 10;
        sArray[27] = 5;
        sArray[29] = 9;
        sArray[30] = 10;
        sArray[31] = 9;
        sArray[32] = 10;
        sArray[33] = 2;
        sArray[34] = 57;
        sArray[35] = 57;
        sArray[36] = 1;
        sArray[37] = 2;
        id_case = sArray;
    }

    public rrFP(rrHv_1 rrHv_12) {
        Predicate<rdn_3> predicate;
        this.id_super();
        String string = id_protected[0];
        this.id_break[rrFP.id_case[0]] = string;
        Long l = id_byte[0];
        this.id_break[rrFP.id_case[1]] = l;
        rrHv_1 rrHv_13 = rrHv_12;
        this.id_break[rrFP.id_case[2]] = rrHv_13;
        rdn_3 rdn_32 = rrHv_12.id_byte();
        rdn_3 rdn_33 = rdn_32.id_implements();
        this.id_break[rrFP.id_case[3]] = rdn_33;
        this.id_break[rrFP.id_case[4]] = predicate = rrHv_12.id_protected();
        rdb_3 rdb_32 = rdn_32.id_break();
        this.id_break[rrFP.id_case[5]] = rdb_32;
    }

    static {
        rrFP.ntfClinit();
    }

    private static void id_this() {
        float[] fArray = new float[7];
        fArray[1] = 300.0f;
        fArray[2] = -4.0f;
        fArray[3] = 300.0f;
        fArray[4] = 0.5f;
        fArray[5] = 1.0f;
        fArray[6] = 300.0f;
        id_implements = fArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2E6FADB0;
    }

    @Override
    public rdn_3 id_class() {
        this.id_super();
        return (rdn_3)this.id_break[id_case[6]];
    }

    @Override
    public float id_class(long l) {
        this.id_super();
        long l2 = l - (Long)this.id_break[id_case[26]];
        if (l2 < id_byte[1] || l2 >= id_byte[2]) {
            return id_implements[0];
        }
        float f = (float)l2 / id_implements[1];
        return id_implements[2] * (float)Math.sin(id_throws[0] * (double)f);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{34, -122, -33, 3, 66, 75, 49, -21}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break(rrZO rrZO2) {
        this.id_super();
        int n = this.id_continue();
        Boolean bl = n > 0 ? id_catch[5] : id_catch[6];
        this.id_break[rrFP.id_case[13]] = bl;
        ((rdn_3)this.id_break[id_case[14]]).id_throws(n);
        Boolean bl2 = ((rrHv_1)this.id_break[id_case[15]]).id_throws().id_finally() != (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_case[16]] ? id_catch[7] : id_catch[8];
        this.id_break[rrFP.id_case[17]] = bl2;
        Boolean bl3 = ((rrHv_1)this.id_break[id_case[18]]).id_class().aJ_();
        this.id_break[rrFP.id_case[19]] = bl3;
        Boolean bl4 = (cb_3)rrFP.id_import.id_class[id_case[20]] != null && ((cb_3)rrFP.id_import.id_class[id_case[21]]).sK().id_class((rdb_3)this.id_break[id_case[22]]) ? id_catch[9] : id_catch[10];
        this.id_break[rrFP.id_case[23]] = bl4;
        String string = ((rrHv_1)this.id_break[id_case[24]]).id_throws().id_finally().id_break();
        this.id_break[rrFP.id_case[25]] = string;
    }

    @Override
    public void id_break(long l) {
        this.id_protected(l);
    }

    @Override
    public boolean id_break(boolean bl) {
        this.id_super();
        return bl && (Boolean)this.id_break[id_case[12]] != false ? id_catch[3] : id_catch[4];
    }

    private static long id_throws(long l) {
        return Long.rotateLeft(l, 32) ^ 0x30CBC80CFC85372DL;
    }

    private static /* synthetic */ void ntfClinit() {
        rrFP.id_volatile();
        rrFP.id_new();
        rrFP.id_final();
        rrFP.id_int();
        rrFP.id_this();
        rrFP.id_native();
        rrFP.id_package();
    }

    public rrHv_1 id_extends() {
        this.id_super();
        return (rrHv_1)this.id_break[id_case[38]];
    }

    private int id_continue() {
        this.id_super();
        if ((Predicate)this.id_break[id_case[33]] == null || (cb_3)rrFP.id_import.id_class[id_case[34]] == null) {
            return id_catch[13];
        }
        int n = id_catch[14];
        for (int i = id_catch[15]; i < id_private[0]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrFP.id_import.id_class[rrFP.id_case[35]]).id_implements[id_case[36]]).id_extends(i);
            if (!((Predicate)this.id_break[id_case[37]]).test(rdn_32)) continue;
            n += rdn_32.id_char();
        }
        return n;
    }

    @Override
    public String id_implements() {
        this.id_super();
        return (String)this.id_break[id_case[7]];
    }

    private static void id_new() {
        id_protected = new String[]{new String("")};
    }

    private static void id_package() {
        id_private = new byte[]{45, 11, 4, 5, 6, 7, 9, 10};
    }

    private void id_super() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_private[1]];
            objectArray[rrFP.id_private[2]] = id_catch[16];
            objectArray[rrFP.id_private[3]] = id_catch[17];
            objectArray[rrFP.id_private[4]] = id_catch[18];
            objectArray[rrFP.id_private[5]] = id_catch[19];
            objectArray[rrFP.id_private[6]] = id_catch[20];
            objectArray[rrFP.id_private[7]] = id_byte[5];
        }
    }

    @Override
    public boolean id_protected() {
        this.id_super();
        return (Boolean)this.id_break[id_case[8]] != false && (Boolean)this.id_break[id_case[9]] != false && (Boolean)this.id_break[id_case[10]] != false && (Boolean)this.id_break[id_case[11]] == false ? id_catch[1] : id_catch[2];
    }

    private void id_protected(long l) {
        boolean bl;
        this.id_super();
        boolean bl2 = bl = (Boolean)this.id_break[id_case[27]] != false && ((rrHv_1)this.id_break[id_case[28]]).id_throws().id_break() ? id_catch[11] : id_catch[12];
        if (bl && !((Boolean)this.id_break[id_case[29]]).booleanValue()) {
            Long l2 = this.id_byte(l);
            this.id_break[rrFP.id_case[30]] = l2;
        }
        Boolean bl3 = bl;
        this.id_break[rrFP.id_case[31]] = bl3;
    }

    private static void id_final() {
        long[] lArray = new long[6];
        lArray[0] = -4611686018427387904L;
        lArray[2] = 300L;
        lArray[4] = 300L;
        id_byte = lArray;
    }

    private static void id_volatile() {
        boolean[] blArray = new boolean[21];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[11] = true;
        id_catch = blArray;
    }

    private static void id_native() {
        id_throws = new double[]{Math.PI};
    }
}

