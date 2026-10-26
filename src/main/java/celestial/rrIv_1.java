/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrtY_2;
import celestial.rrte_3;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIv_1
extends Setting<String> {
    private static float[] id_byte;
    private static byte[] id_protected;
    public Object[] id_break;
    private static String[] id_throws;
    private static boolean[] id_case;
    private static short[] id_catch;

    @Override
    public /* synthetic */ Object id_byte() {
        return this.id_extends();
    }

    private static void id_int() {
        id_throws = new String[]{new String(""), new String("")};
    }

    public rrIv_1(String string, rrte_3 rrte_32) {
        this(string, id_throws[0], rrte_32);
        this.id_class(id_byte[0]);
        this.id_package();
    }

    public rrIv_1(String string, String string2, rrte_3 rrte_32) {
        super(string, string2);
        this.id_super();
        Float f = Float.valueOf(id_byte[1]);
        this.id_break[rrIv_1.id_catch[0]] = f;
        this.id_break(() -> string);
        this.id_byte(this.id_native().get());
        String string3 = (Boolean)this.id_break[id_catch[1]] != false ? id_throws[1] : string2;
        this.id_break[rrIv_1.id_catch[2]] = string3;
        rrte_3 rrte_33 = rrte_32;
        this.id_break[rrIv_1.id_catch[3]] = rrte_33;
        String string4 = string2;
        this.id_break[rrIv_1.id_catch[4]] = string4;
    }

    static {
        rrIv_1.ntfClinit();
    }

    private static void id_this() {
        id_protected = new byte[]{7, 5, 6};
    }

    public rrIv_1 id_class(float f) {
        this.id_super();
        Float f2 = Float.valueOf(f);
        this.id_break[rrIv_1.id_catch[7]] = f2;
        return this;
    }

    public rrIv_1 id_class(Object object) {
        Object object2;
        this.id_super();
        this.id_break[rrIv_1.id_catch[11]] = object2 = object;
        return this;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x80F03B04;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB762774DC0916A2DL;
    }

    public void id_class(rrtY_2 rrtY_22) {
        this.id_super();
        rrtY_2 rrtY_23 = rrtY_22;
        this.id_break[rrIv_1.id_catch[14]] = rrtY_23;
    }

    public rrtY_2 id_class() {
        this.id_super();
        return (rrtY_2)this.id_break[id_catch[13]];
    }

    public Object id_break() {
        this.id_super();
        return this.id_break[id_catch[10]];
    }

    public rrIv_1 id_break(Supplier<String> supplier) {
        Supplier<String> supplier2;
        this.id_super();
        this.id_break[rrIv_1.id_catch[6]] = supplier2 = supplier;
        return this;
    }

    private static /* synthetic */ void ntfClinit() {
        rrIv_1.id_else();
        rrIv_1.id_int();
        rrIv_1.id_new();
        rrIv_1.id_continue();
        rrIv_1.id_this();
    }

    public rrte_3 id_finally() {
        this.id_super();
        return (rrte_3)this.id_break[id_catch[12]];
    }

    public String id_extends() {
        this.id_super();
        return "" + this.id_break[id_catch[5]];
    }

    private static void id_continue() {
        short[] sArray = new short[17];
        sArray[0] = 5;
        sArray[1] = 6;
        sArray[2] = 3;
        sArray[3] = 1;
        sArray[4] = 4;
        sArray[5] = 3;
        sArray[7] = 5;
        sArray[8] = 6;
        sArray[10] = 3;
        sArray[11] = 3;
        sArray[12] = 1;
        sArray[13] = 2;
        sArray[14] = 2;
        sArray[15] = 4;
        sArray[16] = 5;
        id_catch = sArray;
    }

    private static void id_else() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_case = blArray;
    }

    private static void id_new() {
        float[] fArray = new float[3];
        fArray[0] = 80.0f;
        fArray[1] = Float.MAX_VALUE;
        id_byte = fArray;
    }

    public rrIv_1 id_package() {
        this.id_super();
        Boolean bl = id_case[0];
        this.id_break[rrIv_1.id_catch[8]] = bl;
        return this;
    }

    private void id_super() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[0]];
            objectArray[rrIv_1.id_protected[1]] = Float.valueOf(id_byte[2]);
            objectArray[rrIv_1.id_protected[2]] = id_case[1];
        }
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{73, 33, 75, -36, 101, -66, 94, 50}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_final() {
        this.id_super();
        return (String)this.id_break[id_catch[15]];
    }

    public float id_volatile() {
        this.id_super();
        return ((Float)this.id_break[id_catch[16]]).floatValue();
    }

    public Supplier<String> id_native() {
        this.id_super();
        return (Supplier)this.id_break[id_catch[9]];
    }
}

