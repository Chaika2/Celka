/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Br_1;
import celestial.C_class;
import celestial.PX;
import celestial.Ps_1;
import celestial.bB_2;
import celestial.bE_2;
import celestial.bG_2;
import celestial.bM_2;
import celestial.bP_2;
import celestial.bS_2;
import celestial.bq_3;
import celestial.cb_3;
import celestial.rA_2;
import celestial.rC_2;
import celestial.rO_2;
import celestial.rYB;
import celestial.rn_3;
import celestial.roE_2;
import celestial.rrIk_1;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Map;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class br_3
extends bq_3
implements rA_2 {
    private static short[] id_catch;
    private static boolean[] id_private;
    private static byte[] id_implements;
    private static String[] id_finally;
    public Object[] id_break;
    private static float[] id_extends;
    private static double[] id_native;
    public static Object[] id_throws;

    @Override
    public boolean id_byte() {
        this.id_volatile();
        return (Boolean)this.id_break[id_catch[19]] != false && ((Supplier)this.id_break[id_catch[20]] == null || (Boolean)((Supplier)this.id_break[id_catch[21]]).get() != false) ? id_private[2] : id_private[3];
    }

    private static void id_int() {
        id_implements = new byte[]{9, 7, 8, 2};
    }

    public br_3(C_class c_class) {
        super(c_class);
        this.id_volatile();
        Boolean bl = id_private[0];
        this.id_break[br_3.id_catch[0]] = bl;
        bB_2 bB_22 = new bB_2();
        this.id_break[br_3.id_catch[1]] = bB_22;
        bP_2 bP_22 = new bP_2(this, c_class);
        this.id_break[br_3.id_catch[2]] = bP_22;
        bS_2 bS_22 = new bS_2(c_class, (bM_2)this.id_break[id_catch[4]]);
        this.id_break[br_3.id_catch[5]] = bS_22;
        ((bM_2)this.id_break[id_catch[3]]).id_class(bS_22);
        bG_2 bG_22 = new bG_2(c_class, (bM_2)this.id_break[id_catch[7]]);
        this.id_break[br_3.id_catch[8]] = bG_22;
        ((bM_2)this.id_break[id_catch[6]]).id_class(bG_22);
    }

    static {
        br_3.ntfClinit();
    }

    @Override
    public String id_class() {
        return id_finally[0];
    }

    @Override
    public rn_3 id_class(boolean bl, boolean bl2) {
        this.id_volatile();
        ((bB_2)this.id_break[id_catch[9]]).id_class(((Ps_1)this.id_case[id_catch[10]]).id_catch().Ps());
        if (((bB_2)this.id_break[id_catch[11]]).id_class() >= id_extends[0]) {
            Boolean bl3 = id_private[1];
            this.id_break[br_3.id_catch[12]] = bl3;
        }
        Ps_1 ps_1 = ((C_class)this.id_case[id_catch[13]]).id_throw();
        Br_1 br_1 = ((C_class)this.id_case[id_catch[14]]).id_private();
        if (((Boolean)this.id_break[id_catch[15]]).booleanValue()) {
            this.id_class(ps_1, br_1);
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_catch[16]]));
        }
        this.id_class(ps_1);
        return new rn_3((rO_2)this.id_break[id_catch[17]], (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_catch[18]]));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x396E1127;
    }

    private void id_class(Ps_1 ps_1) {
        rYB rYB2 = ps_1.id_case();
        cb_3 cb_32 = ps_1.id_catch();
        roE_2 roE_22 = rYB2.id_instanceof();
        if (roE_22.id_class(cb_32) <= id_native[0]) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[35]]).id_private().id_static().id_new();
            this.id_private();
        }
    }

    @Override
    public void id_class(Supplier<Boolean> supplier, Map<bE_2, rrIk_1> map) {
        Supplier<Boolean> supplier2;
        this.id_volatile();
        Boolean bl = id_private[4];
        this.id_break[br_3.id_catch[22]] = bl;
        this.id_break[br_3.id_catch[23]] = supplier2 = supplier;
        rO_2 rO_22 = new rO_2(((Ps_1)this.id_case[id_catch[24]]).id_volatile(), ((Ps_1)this.id_case[id_catch[25]]).id_catch().Pg());
        this.id_break[br_3.id_catch[26]] = rO_22;
        ((bM_2)this.id_break[id_catch[27]]).id_protected();
        ((bS_2)this.id_break[id_catch[28]]).id_class(id_private[5]);
        ((bG_2)this.id_break[id_catch[29]]).id_class(id_private[6]);
        ((bS_2)this.id_break[id_catch[30]]).id_class(map);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{79, -47, -25, -118, 0, 74, -107, -74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8322F1F17AC6ADC6L;
    }

    private void id_class(Ps_1 ps_1, Br_1 br_1) {
        this.id_volatile();
        PX pX = br_1.id_protected().orElse(ps_1.id_protected());
        if (((Boolean)this.id_break[id_catch[36]]).booleanValue()) {
            br_1.id_class(pX.id_case(pX.id_protected() - id_extends[1]), id_private[8]);
            if (pX.id_protected() <= id_extends[2]) {
                Boolean bl = id_private[9];
                this.id_break[br_3.id_catch[37]] = bl;
            }
        } else {
            br_1.id_class(pX.id_case(pX.id_protected() + id_extends[3]), id_private[10]);
            if (pX.id_protected() >= id_extends[4]) {
                ((bB_2)this.id_break[id_catch[38]]).id_byte();
                Boolean bl = id_private[11];
                this.id_break[br_3.id_catch[39]] = bl;
                Boolean bl2 = id_private[12];
                this.id_break[br_3.id_catch[40]] = bl2;
            }
        }
    }

    private static /* synthetic */ void ntfClinit() {
        br_3.id_finally();
        br_3.id_extends();
        br_3.id_implements();
        br_3.id_package();
        br_3.id_final();
        br_3.id_int();
        br_3.id_native();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[19];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[11] = true;
        blArray[18] = true;
        id_private = blArray;
    }

    private static void id_extends() {
        id_finally = new String[]{new String("Auto Tunneling")};
    }

    private static void id_implements() {
        short[] sArray = new short[43];
        sArray[0] = 8;
        sArray[1] = 5;
        sArray[2] = 2;
        sArray[3] = 2;
        sArray[4] = 2;
        sArray[5] = 3;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[8] = 4;
        sArray[9] = 5;
        sArray[10] = 1;
        sArray[11] = 5;
        sArray[12] = 7;
        sArray[15] = 7;
        sArray[16] = 1;
        sArray[17] = 6;
        sArray[20] = 1;
        sArray[21] = 1;
        sArray[23] = 1;
        sArray[24] = 1;
        sArray[25] = 1;
        sArray[26] = 6;
        sArray[27] = 2;
        sArray[28] = 3;
        sArray[29] = 4;
        sArray[30] = 3;
        sArray[33] = 2;
        sArray[34] = 5;
        sArray[36] = 8;
        sArray[37] = 8;
        sArray[38] = 5;
        sArray[39] = 8;
        sArray[40] = 7;
        sArray[41] = 2;
        sArray[42] = 2;
        id_catch = sArray;
    }

    private static void id_package() {
        id_extends = new float[]{15.0f, 50.0f, -90.0f, 50.0f, 90.0f, 15.0f, 50.0f};
    }

    @Override
    public void id_protected() {
        this.id_volatile();
        super.id_protected();
        if (((Boolean)this.id_break[id_catch[31]]).booleanValue()) {
            Boolean bl = id_private[7];
            this.id_break[br_3.id_catch[32]] = bl;
            ((bM_2)this.id_break[id_catch[33]]).id_catch();
            ((bB_2)this.id_break[id_catch[34]]).id_byte();
        }
    }

    public void id_private() {
        this.id_volatile();
        this.id_protected();
        ((bM_2)this.id_break[id_catch[41]]).id_class();
        ((bM_2)this.id_break[id_catch[42]]).id_byte();
    }

    private static void id_final() {
        id_native = new double[]{2.0};
    }

    private void id_volatile() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_implements[0]];
            objectArray[br_3.id_private[13]] = id_private[14];
            objectArray[br_3.id_implements[1]] = id_private[15];
            objectArray[br_3.id_implements[2]] = id_private[16];
        }
    }

    private static void id_native() {
        Object[] objectArray = new Object[]{Float.valueOf(0.0f), Float.valueOf(0.0f)};
        id_throws = objectArray;
    }
}

