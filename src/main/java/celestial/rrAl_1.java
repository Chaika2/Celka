/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.module.Module;
import celestial.rfU_2;
import celestial.rrQX;
import celestial.rrnZ_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAl_1
extends Om_1 {
    private static String[] id_byte;
    private static float[] id_protected;
    public static Object[] id_class;
    private static double[] id_throws;
    private static boolean[] id_case;
    private static byte[] id_catch;
    private static short[] id_private;
    public Object[] id_break;

    public void id_byte(boolean bl) {
        this.id_final();
        Boolean bl2 = bl;
        this.id_break[rrAl_1.id_private[45]] = bl2;
    }

    public void id_byte(double d) {
        this.id_final();
        Double d2 = d;
        this.id_break[rrAl_1.id_private[38]] = d2;
    }

    private static void id_int() {
        Object[] objectArray = new Object[]{new rrAl_1()};
        id_class = objectArray;
    }

    public rrAl_1() {
        this.id_final();
    }

    static {
        rrAl_1.ntfClinit();
    }

    private static void id_this() {
        id_byte = new String[]{new String("\u0411\u044b\u043b \u043e\u0442\u043a\u043b\u044e\u0447\u0435\u043d \u0438\u0437-\u0437\u0430 \u0444\u043b\u0430\u0433\u0430!")};
    }

    public float id_class() {
        this.id_final();
        double d = Math.pow((Double)this.id_break[id_private[23]] - (Double)this.id_break[id_private[24]], id_throws[0]);
        double d2 = Math.pow((Double)this.id_break[id_private[25]] - (Double)this.id_break[id_private[26]], id_throws[1]);
        double d3 = Math.pow((Double)this.id_break[id_private[27]] - (Double)this.id_break[id_private[28]], id_throws[2]);
        return rfU_2.id_class(d + d2 + d3);
    }

    public static rrAl_1 id_class(double d, double d2, double d3, double d4, double d5, double d6, int n, boolean bl, boolean bl2) {
        Double d7 = d;
        ((rrAl_1)rrAl_1.id_class[rrAl_1.id_private[0]]).id_break[rrAl_1.id_private[1]] = d7;
        Double d8 = d2;
        ((rrAl_1)rrAl_1.id_class[rrAl_1.id_private[2]]).id_break[rrAl_1.id_private[3]] = d8;
        Double d9 = d3;
        ((rrAl_1)rrAl_1.id_class[rrAl_1.id_private[4]]).id_break[rrAl_1.id_private[5]] = d9;
        Double d10 = d4;
        ((rrAl_1)rrAl_1.id_class[rrAl_1.id_private[6]]).id_break[rrAl_1.id_private[7]] = d10;
        Double d11 = d5;
        ((rrAl_1)rrAl_1.id_class[rrAl_1.id_private[8]]).id_break[rrAl_1.id_private[9]] = d11;
        Double d12 = d6;
        ((rrAl_1)rrAl_1.id_class[rrAl_1.id_private[10]]).id_break[rrAl_1.id_private[11]] = d12;
        Integer n2 = n;
        ((rrAl_1)rrAl_1.id_class[rrAl_1.id_private[12]]).id_break[rrAl_1.id_private[13]] = n2;
        Boolean bl3 = bl;
        ((rrAl_1)rrAl_1.id_class[rrAl_1.id_private[14]]).id_break[rrAl_1.id_private[15]] = bl3;
        Boolean bl4 = bl2;
        ((rrAl_1)rrAl_1.id_class[rrAl_1.id_private[16]]).id_break[rrAl_1.id_private[17]] = bl4;
        ((rrAl_1)id_class[id_private[18]]).id_class(id_case[0]);
        return (rrAl_1)id_class[id_private[19]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{36, 54, 13, 56, 106, 107, 47, -52}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(double d) {
        this.id_final();
        Double d2 = d;
        this.id_break[rrAl_1.id_private[41]] = d2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2737D9E7C046E227L;
    }

    public void id_class(int n) {
        this.id_final();
        Integer n2 = n;
        this.id_break[rrAl_1.id_private[44]] = n2;
    }

    public void id_break(boolean bl) {
        this.id_final();
        Boolean bl2 = bl;
        this.id_break[rrAl_1.id_private[46]] = bl2;
    }

    public void id_break(double d) {
        this.id_final();
        Double d2 = d;
        this.id_break[rrAl_1.id_private[39]] = d2;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x74E7ECCC;
    }

    public double id_break() {
        this.id_final();
        return (Double)this.id_break[id_private[29]];
    }

    public void id_throws(double d) {
        this.id_final();
        Double d2 = d;
        this.id_break[rrAl_1.id_private[42]] = d2;
    }

    public double id_throws() {
        this.id_final();
        return (Double)this.id_break[id_private[32]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrAl_1.id_package();
        rrAl_1.id_this();
        rrAl_1.id_volatile();
        rrAl_1.id_continue();
        rrAl_1.id_super();
        rrAl_1.id_new();
        rrAl_1.id_int();
    }

    public int id_finally() {
        this.id_final();
        return (Integer)this.id_break[id_private[35]];
    }

    public double id_catch() {
        this.id_final();
        return (Double)this.id_break[id_private[31]];
    }

    public double id_extends() {
        this.id_final();
        return (Double)this.id_break[id_private[30]];
    }

    public boolean id_case() {
        this.id_final();
        return (Boolean)this.id_break[id_private[36]];
    }

    public void id_case(double d) {
        this.id_final();
        Double d2 = d;
        this.id_break[rrAl_1.id_private[40]] = d2;
    }

    private static void id_continue() {
        id_protected = new float[]{10.0f};
    }

    public void id_implements() {
        if (this.id_class() > id_protected[0]) {
            return;
        }
        for (Module module : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[20]]).id_private().g()) {
            if (!(module instanceof rrnZ_2)) continue;
            rrnZ_2 rrnZ_22 = (rrnZ_2)((Object)module);
            if (!module.id_implements() || !module.aJ_()) continue;
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_private[21]]).id_class(new rrtx_3(module.id_final(), id_byte[0], (int)id_private[22]));
            rrnZ_22.id_class();
        }
    }

    private static void id_new() {
        id_catch = new byte[]{9, 2, 3, 4, 5, 6, 7, 8};
    }

    private static void id_package() {
        boolean[] blArray = new boolean[8];
        blArray[3] = true;
        blArray[7] = true;
        id_case = blArray;
    }

    private static void id_super() {
        double[] dArray = new double[9];
        dArray[0] = 2.0;
        dArray[1] = 2.0;
        dArray[2] = 2.0;
        id_throws = dArray;
    }

    public double id_protected() {
        this.id_final();
        return (Double)this.id_break[id_private[34]];
    }

    public void id_protected(double d) {
        this.id_final();
        Double d2 = d;
        this.id_break[rrAl_1.id_private[43]] = d2;
    }

    public double id_private() {
        this.id_final();
        return (Double)this.id_break[id_private[33]];
    }

    private void id_final() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_catch[0]];
            objectArray[rrAl_1.id_case[2]] = id_throws[3];
            objectArray[rrAl_1.id_case[3]] = id_throws[4];
            objectArray[rrAl_1.id_catch[1]] = id_throws[5];
            objectArray[rrAl_1.id_catch[2]] = id_throws[6];
            objectArray[rrAl_1.id_catch[3]] = id_throws[7];
            objectArray[rrAl_1.id_catch[4]] = id_throws[8];
            objectArray[rrAl_1.id_catch[5]] = id_case[4];
            objectArray[rrAl_1.id_catch[6]] = id_case[5];
            objectArray[rrAl_1.id_catch[7]] = id_case[6];
        }
    }

    private static void id_volatile() {
        short[] sArray = new short[47];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[7] = 3;
        sArray[9] = 4;
        sArray[11] = 5;
        sArray[13] = 6;
        sArray[15] = 7;
        sArray[17] = 8;
        sArray[22] = 1500;
        sArray[24] = 3;
        sArray[25] = 1;
        sArray[26] = 4;
        sArray[27] = 2;
        sArray[28] = 5;
        sArray[30] = 1;
        sArray[31] = 2;
        sArray[32] = 3;
        sArray[33] = 4;
        sArray[34] = 5;
        sArray[35] = 6;
        sArray[36] = 7;
        sArray[37] = 8;
        sArray[39] = 1;
        sArray[40] = 2;
        sArray[41] = 3;
        sArray[42] = 4;
        sArray[43] = 5;
        sArray[44] = 6;
        sArray[45] = 7;
        sArray[46] = 8;
        id_private = sArray;
    }

    public boolean id_native() {
        this.id_final();
        return (Boolean)this.id_break[id_private[37]];
    }
}

