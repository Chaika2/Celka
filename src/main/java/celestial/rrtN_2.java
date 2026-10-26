/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rrNM;
import celestial.rrQK;
import celestial.rrtC_2;
import celestial.rrtZ_2;
import celestial.rrtc_3;
import celestial.rrtm_3;
import celestial.rrtu_3;
import celestial.rruv_1;
import celestial.rrwE_2;
import celestial.rrwI_2;
import celestial.rrwM_2;
import celestial.rrwX_2;
import celestial.rrws_3;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrtN_2
extends rrwI_2
implements MinecraftAccessor,
rrtc_3 {
    private static double[] id_class;
    private static byte[] id_break;
    private static float[] id_byte;
    public Object[] id_throws;
    private static short[] id_protected;
    private static boolean[] id_native;

    public void id_boolean() {
        this.id_class();
        boolean bl = this.aq_();
        if (((Boolean)this.id_throws[id_protected[24]]).booleanValue() && !bl) {
            this.ar_();
        }
        Boolean bl2 = bl;
        this.id_throws[rrtN_2.id_protected[25]] = bl2;
    }

    public void id_char() {
        float f = id_const.id_volatile() / id_byte[11];
        float f2 = id_const.id_final() / id_byte[12];
        float f3 = this.id_implements() / id_byte[13];
        float f4 = this.ao_() / id_byte[14];
        this.id_class(f - f3, f2 - f4);
    }

    public void id_byte(boolean bl) {
        for (rrtm_3 rrtm_32 : this.id_strictfp()) {
            if (bl && this.aq_()) continue;
            rrtm_32.id_native();
        }
    }

    public void id_byte(int n, int n2, int n3) {
    }

    public abstract String id_byte();

    public void id_int() {
        rrwX_2 rrwX_22 = this.id_interface();
        if (rrwX_22.id_byte()) {
            this.id_float().id_class(id_native[8]);
            rrwX_22.id_class(id_native[9]);
        }
        for (rrtm_3 rrtm_32 : this.id_strictfp()) {
            rrtm_32.aP_();
        }
    }

    public float id_long() {
        return this.id_float().id_byte();
    }

    public rrNM id_float() {
        this.id_class();
        return (rrNM)this.id_throws[id_protected[47]];
    }

    public float id_double() {
        this.id_class();
        return ((Float)((Supplier)this.id_throws[id_protected[43]]).get()).floatValue();
    }

    public rrtN_2(Supplier<Float> supplier, Supplier<Float> supplier2, Supplier<Float> supplier3, Supplier<Float> supplier4) {
        Supplier<Float> supplier5;
        Supplier<Float> supplier6;
        Supplier<Float> supplier7;
        Supplier<Float> supplier8;
        ArrayList arrayList;
        this.id_class();
        this.id_throws[rrtN_2.id_protected[0]] = arrayList = new ArrayList();
        this.id_throws[rrtN_2.id_protected[1]] = supplier8 = supplier;
        this.id_throws[rrtN_2.id_protected[2]] = supplier7 = supplier2;
        this.id_throws[rrtN_2.id_protected[3]] = supplier6 = supplier3;
        this.id_throws[rrtN_2.id_protected[4]] = supplier5 = supplier4;
        rrwX_2 rrwX_22 = new rrwX_2(this);
        this.id_throws[rrtN_2.id_protected[5]] = rrwX_22;
        rrws_3 rrws_32 = new rrws_3(this);
        this.id_throws[rrtN_2.id_protected[6]] = rrws_32;
        rrNM rrNM2 = new rrNM((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_protected[7]]), id_byte[0]);
        this.id_throws[rrtN_2.id_protected[8]] = rrNM2;
    }

    public rrtN_2(Supplier<Float> supplier, Supplier<Float> supplier2, rrNM rrNM2) {
        this(supplier, supplier2);
        rrNM rrNM3 = rrNM2;
        this.id_throws[rrtN_2.id_protected[18]] = rrNM3;
    }

    public rrtN_2(Supplier<Float> supplier, Supplier<Float> supplier2) {
        Supplier<Float> supplier3;
        Supplier<Float> supplier4;
        Supplier<Float> supplier5;
        Supplier<Float> supplier6;
        ArrayList arrayList;
        this.id_class();
        this.id_throws[rrtN_2.id_protected[9]] = arrayList = new ArrayList();
        this.id_throws[rrtN_2.id_protected[10]] = supplier6 = () -> Float.valueOf(id_byte[22]);
        this.id_throws[rrtN_2.id_protected[11]] = supplier5 = () -> Float.valueOf(id_byte[21]);
        this.id_throws[rrtN_2.id_protected[12]] = supplier4 = supplier;
        this.id_throws[rrtN_2.id_protected[13]] = supplier3 = supplier2;
        rrwX_2 rrwX_22 = new rrwX_2(this);
        this.id_throws[rrtN_2.id_protected[14]] = rrwX_22;
        rrws_3 rrws_32 = new rrws_3(this);
        this.id_throws[rrtN_2.id_protected[15]] = rrws_32;
        rrNM rrNM2 = new rrNM((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_protected[16]]), id_byte[1]);
        this.id_throws[rrtN_2.id_protected[17]] = rrNM2;
    }

    static {
        rrtN_2.ntfClinit();
    }

    public rrwX_2 id_interface() {
        this.id_class();
        return (rrwX_2)this.id_throws[id_protected[27]];
    }

    public boolean id_class(rrtu_3 rrtu_32, int n, int n2) {
        if (rrtu_32.id_class(this, n, n2)) {
            return id_native[23];
        }
        float f = this.id_default();
        float f2 = this.id_abstract();
        float f3 = this.id_implements();
        return (float)n >= f && (float)n <= f + f3 && (float)n2 >= f2 && (float)n2 <= f2 + id_byte[20] ? id_native[24] : id_native[25];
    }

    public void id_class(int n, int n2, int n3) {
        this.id_short().id_case();
        Object var8_4 = null;
        rrws_3.id_class[rrtN_2.id_protected[23]] = var8_4;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC9DE773CC486B596L;
    }

    public int id_class(List<rrtN_2> list) {
        return list.indexOf(this);
    }

    public void id_class(Supplier<Float> supplier) {
        Supplier<Float> supplier2;
        this.id_class();
        this.id_throws[rrtN_2.id_protected[45]] = supplier2 = supplier;
    }

    public rrtN_2 id_class(rrwE_2 rrwE_22, float f, float f2) {
        this.id_class();
        rrwM_2 rrwM_22 = new rrwM_2(rrwE_22, f, f2);
        this.id_throws[rrtN_2.id_protected[36]] = rrwM_22;
        return this;
    }

    public void id_class(Ml_1 ml_1, float f) {
        float f2 = id_byte[7] - f;
        ml_1.id_class((double)(f2 * (this.id_default() + this.id_implements() / id_byte[8])), (double)(f2 * (this.id_abstract() + this.ao_() / id_byte[9])), id_class[0]);
        ml_1.id_class(f, f, id_byte[10]);
    }

    public rrtN_2 id_class(float f, float f2) {
        Supplier<Float> supplier;
        Supplier<Float> supplier2;
        this.id_class();
        if ((rrwM_2)this.id_throws[id_protected[48]] != null) {
            rrwE_2 rrwE_22 = ((rrwM_2)this.id_throws[id_protected[49]]).id_break();
            ((rrwM_2)this.id_throws[id_protected[50]]).id_class(f - rrwE_22.id_class(id_const.id_volatile(), this.id_implements()));
            ((rrwM_2)this.id_throws[id_protected[51]]).id_break(f2 - rrwE_22.id_break(id_const.id_final(), this.ao_()));
            return this;
        }
        this.id_throws[rrtN_2.id_protected[52]] = supplier2 = () -> Float.valueOf(f);
        this.id_throws[rrtN_2.id_protected[53]] = supplier = () -> Float.valueOf(f2);
        return this;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD0F82746;
    }

    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, double d, boolean bl, boolean bl2) {
        return id_native[5];
    }

    public void id_class(rrNM rrNM2) {
        this.id_class();
        rrNM rrNM3 = rrNM2;
        this.id_throws[rrtN_2.id_protected[46]] = rrNM3;
    }

    private void id_class() {
        if (this.id_throws == null) {
            Object[] objectArray = this.id_throws = new Object[id_break[0]];
            objectArray[rrtN_2.id_break[1]] = id_native[26];
        }
    }

    public void id_class(rrtu_3 rrtu_32) {
        rrwX_2 rrwX_22 = this.id_interface();
        rrwX_22.id_class(id_native[6]);
        List<rrtN_2> list = rrtu_32.id_class();
        Collections.swap(list, list.size() - id_native[7], this.id_class(list));
        for (rrtm_3 rrtm_32 : this.id_strictfp()) {
            rrtm_32.id_break();
        }
    }

    public rrtN_2 id_class(rrwE_2 rrwE_22) {
        this.id_class();
        float f = this.id_default();
        float f2 = this.id_abstract();
        if ((rrwM_2)this.id_throws[id_protected[37]] == null) {
            rrwM_2 rrwM_22 = new rrwM_2(rrwE_22, id_byte[17], id_byte[18]);
            this.id_throws[rrtN_2.id_protected[38]] = rrwM_22;
        } else {
            ((rrwM_2)this.id_throws[id_protected[39]]).id_class(rrwE_22);
        }
        ((rrwM_2)this.id_throws[id_protected[40]]).id_class(f - rrwE_22.id_class(id_const.id_volatile(), this.id_implements()));
        ((rrwM_2)this.id_throws[id_protected[41]]).id_break(f2 - rrwE_22.id_break(id_const.id_final(), this.ao_()));
        return this;
    }

    public boolean id_class(int n, int n2) {
        if (!this.aq_()) {
            return id_native[13];
        }
        for (rrtm_3 rrtm_32 : this.id_strictfp()) {
            if (!rrtm_32.id_implements()) continue;
            return id_native[14];
        }
        return this.id_transient().id_break(n, n2);
    }

    public boolean id_class(char c, int n) {
        return id_native[4];
    }

    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        this.id_short().id_class(rrtu_32, n, n2);
    }

    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl, boolean bl2) {
        this.id_class();
        if (rrtu_32.id_class(this, n, n2)) {
            return id_native[1];
        }
        this.id_interface().id_break().id_class(rrtu_32, n, n2, n3, bl);
        ((rrws_3)this.id_throws[id_protected[22]]).id_class(rrtu_32, n, n2, n3);
        for (rrtm_3 rrtm_32 : this.id_strictfp()) {
            if (!rrtm_32.id_volatile().id_break(n, n2)) continue;
            rrtm_32.id_class(rrtu_32, n, n2, n3, bl2);
            break;
        }
        return id_native[2];
    }

    public float id_default() {
        this.id_class();
        if ((rrwM_2)this.id_throws[id_protected[29]] != null) {
            return ((rrwM_2)this.id_throws[id_protected[30]]).id_class(id_const.id_volatile(), this.id_implements());
        }
        return ((Float)((Supplier)this.id_throws[id_protected[31]]).get()).floatValue();
    }

    public rrws_3 id_short() {
        this.id_class();
        return (rrws_3)this.id_throws[id_protected[28]];
    }

    public void id_void() {
    }

    public void r() {
    }

    public void id_break(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl, boolean bl2) {
    }

    public void id_break(Supplier<Float> supplier) {
        Supplier<Float> supplier2;
        this.id_class();
        this.id_throws[rrtN_2.id_protected[44]] = supplier2 = supplier;
    }

    public boolean id_break(rrtu_3 rrtu_32, int n, int n2) {
        if (!this.id_class(n, n2)) {
            return id_native[15];
        }
        return !rrtu_32.id_class(this, n, n2) ? id_native[16] : id_native[17];
    }

    public boolean id_break(int n, int n2, int n3) {
        return id_native[3];
    }

    public void id_break(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        this.id_class();
        if (bl) {
            return;
        }
        if (((List)this.id_throws[id_protected[21]]).isEmpty()) {
            return;
        }
        List<rrtm_3> list = this.id_strictfp();
        for (int i = list.size() - id_native[0]; i >= 0; --i) {
            rrtm_3 rrtm_32 = list.get(i);
            rrtm_32.id_class(ml_1, rrtu_32, n, n2);
        }
        for (rrtm_3 rrtm_32 : list) {
            rrtm_32.id_break(ml_1, rrtu_32, n, n2);
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrtN_2.id_else();
        rrtN_2.id_while();
        rrtN_2.id_super();
        rrtN_2.id_return();
        rrtN_2.id_package();
    }

    public boolean P() {
        return this.id_float().id_protected();
    }

    public abstract String id_catch();

    public boolean id_extends() {
        return id_native[12];
    }

    public rrwM_2 id_const() {
        this.id_class();
        return (rrwM_2)this.id_throws[id_protected[35]];
    }

    private static void id_else() {
        boolean[] blArray = new boolean[27];
        blArray[0] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[20] = true;
        blArray[24] = true;
        id_native = blArray;
    }

    public void id_for() {
    }

    public float id_implements() {
        this.id_class();
        return ((Float)((Supplier)this.id_throws[id_protected[42]]).get()).floatValue();
    }

    public float id_import() {
        return id_byte[15];
    }

    public void id_instanceof() {
    }

    public boolean id_new() {
        return id_native[11];
    }

    private static void id_package() {
        id_break = new byte[]{10, 9};
    }

    private static void id_return() {
        id_class = new double[1];
    }

    private static void id_super() {
        float[] fArray = new float[23];
        fArray[0] = 0.3f;
        fArray[1] = 0.3f;
        fArray[2] = 5.0f;
        fArray[4] = 5.0f;
        fArray[5] = 5.0f;
        fArray[6] = 18.0f;
        fArray[7] = 1.0f;
        fArray[8] = 2.0f;
        fArray[9] = 2.0f;
        fArray[10] = 1.0f;
        fArray[11] = 2.00001f;
        fArray[12] = 2.00001f;
        fArray[13] = 2.0f;
        fArray[14] = 2.0f;
        fArray[15] = 5.0f;
        fArray[20] = 13.0f;
        id_byte = fArray;
    }

    public void id_switch() {
        this.id_class();
        List list = (List)this.id_throws[id_protected[19]];
        for (Setting<?> setting : this.b()) {
            float f = ((Float)((Supplier)this.id_throws[id_protected[20]]).get()).floatValue();
            rrtm_3 rrtm_32 = rrtZ_2.id_class(this, setting, f);
            if (setting instanceof GroupSetting) {
                GroupSetting groupSetting = (GroupSetting)setting;
                List list2 = (List)groupSetting.id_byte();
                list.add(new rrtC_2(this, groupSetting, id_byte[2], id_byte[3], f - id_byte[4] - id_byte[5], id_byte[6]));
                for (Setting setting2 : list2) {
                    rrtm_3 rrtm_33 = rrtZ_2.id_class(this, setting2, f);
                    list.add(rrtm_33);
                }
                continue;
            }
            if (rrtm_32 == null) continue;
            list.add(rrtm_32);
        }
    }

    private static void id_while() {
        short[] sArray = new short[54];
        sArray[1] = 3;
        sArray[2] = 4;
        sArray[3] = 5;
        sArray[4] = 6;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[8] = 7;
        sArray[10] = 3;
        sArray[11] = 4;
        sArray[12] = 5;
        sArray[13] = 6;
        sArray[14] = 1;
        sArray[15] = 2;
        sArray[16] = 2;
        sArray[17] = 7;
        sArray[18] = 7;
        sArray[20] = 5;
        sArray[22] = 2;
        sArray[24] = 9;
        sArray[25] = 9;
        sArray[27] = 1;
        sArray[28] = 2;
        sArray[29] = 8;
        sArray[30] = 8;
        sArray[31] = 3;
        sArray[32] = 8;
        sArray[33] = 8;
        sArray[34] = 4;
        sArray[35] = 8;
        sArray[36] = 8;
        sArray[37] = 8;
        sArray[38] = 8;
        sArray[39] = 8;
        sArray[40] = 8;
        sArray[41] = 8;
        sArray[42] = 5;
        sArray[43] = 6;
        sArray[44] = 5;
        sArray[45] = 6;
        sArray[46] = 7;
        sArray[47] = 7;
        sArray[48] = 8;
        sArray[49] = 8;
        sArray[50] = 8;
        sArray[51] = 8;
        sArray[52] = 3;
        sArray[53] = 4;
        id_protected = sArray;
    }

    public boolean id_static() {
        return !this.id_interface().id_byte() && !this.id_float().id_case() ? id_native[20] : id_native[21];
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-15, -34, -15, 82, 60, 123, -41, -99}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public abstract boolean id_protected();

    public void id_private() {
    }

    public float id_abstract() {
        this.id_class();
        if ((rrwM_2)this.id_throws[id_protected[32]] != null) {
            return ((rrwM_2)this.id_throws[id_protected[33]]).id_break(id_const.id_final(), this.ao_());
        }
        return ((Float)((Supplier)this.id_throws[id_protected[34]]).get()).floatValue();
    }

    public boolean id_final() {
        return id_native[10];
    }

    public rruv_1 id_transient() {
        return new rruv_1(this.id_default(), this.id_abstract(), this.id_implements(), this.ao_());
    }

    @Override
    public String id_synchronized() {
        return this.id_catch();
    }

    public List<rrtm_3> id_strictfp() {
        this.id_class();
        return ((List)this.id_throws[id_protected[26]]).stream().filter(rrtm_3::id_throws).toList();
    }

    public void ar_() {
    }

    public boolean ap_() {
        return id_native[22];
    }

    public float au_() {
        return id_byte[16];
    }

    public void as_() {
        this.id_float().id_class(this.id_interface().id_byte());
    }

    public float ao_() {
        float f = id_byte[19];
        for (rrtm_3 rrtm_32 : this.id_strictfp()) {
            f += rrtm_32.id_class(rrtm_32);
        }
        return this.id_double() + f;
    }

    public boolean aq_() {
        return this.id_interface().id_byte() || this.id_float().id_case() ? id_native[18] : id_native[19];
    }

    public void at_() {
    }
}

