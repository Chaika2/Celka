/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.Qj_1;
import celestial.Ve_1;
import celestial.manager.FontManager;
import celestial.rqO_2;
import celestial.rrIv_1;
import celestial.rrQK;
import celestial.rrZF;
import celestial.rrZI;
import celestial.rrZN;
import celestial.rrZO;
import celestial.rrfD_2;
import celestial.rrtD_2;
import celestial.rrtF_2;
import celestial.rrtK_2;
import celestial.rrtU_2;
import celestial.rrta_3;
import celestial.rrte_3;
import celestial.rrtm_3;
import celestial.rrto_3;
import celestial.rrtu_3;
import celestial.rruv_1;
import celestial.rrvd_1;
import celestial.rrvs_1;
import celestial.ui.clickgui.ClickGuiTheme;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import celestial.util.MinecraftAccessor;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtY_2
extends rrZN
implements MinecraftAccessor,
rrvs_1 {
    public Object[] id_break;
    private static String[] id_protected;
    private static double[] id_throws;
    private static short[] id_case;
    private static boolean[] id_catch;
    private static byte[] id_private;
    public static Object[] id_byte;
    private static int[] id_implements;
    private static float[] id_finally;

    private void id_char() {
        this.id_this();
        Boolean bl = id_catch[31];
        this.id_break[rrtY_2.id_case[73]] = bl;
        this.id_instanceof();
    }

    @Override
    public void id_byte(int n, int n2, int n3) {
        super.id_byte(n, n2, n3);
        if (n == id_case[54]) {
            this.id_long();
        }
    }

    public boolean id_byte(String string) {
        rrtU_2 rrtU_22;
        boolean bl;
        this.id_this();
        if ((rrte_3)this.id_break[id_case[78]] != null && ((rrte_3)this.id_break[id_case[79]]).id_throws().equals((Object)((rrta_3)((Object)rrta_3.staticFields0b9ba99d5751335787deb45ab94d73c6[id_case[80]]))) && !string.isEmpty() && !(bl = (rrtU_22 = ((rrte_3)this.id_break[id_case[81]]).id_break(string)).id_byte())) {
            String string2 = rrtU_22.id_break();
            if (!string2.isEmpty()) {
                this.id_break(string2);
                String string3 = ((rrte_3)this.id_break[id_case[82]]).id_class();
                if (string3 != null) {
                    this.id_byte(string3);
                }
            }
            return id_catch[34];
        }
        ((rrIv_1)this.id_break[id_case[83]]).id_class((Object)string);
        return id_catch[35];
    }

    public void id_int() {
        this.id_long();
        this.id_byte(id_protected[4]);
    }

    private void id_long() {
        String string;
        rrtU_2 rrtU_22;
        boolean bl;
        this.id_this();
        if (!this.aO_()) {
            return;
        }
        this.id_char();
        String string2 = this.id_final();
        if ((rrte_3)this.id_break[id_case[66]] != null && ((rrte_3)this.id_break[id_case[67]]).id_throws().equals((Object)((rrta_3)((Object)rrta_3.staticFields0b9ba99d5751335787deb45ab94d73c6[id_case[68]]))) && !string2.isEmpty() && !(bl = (rrtU_22 = ((rrte_3)this.id_break[id_case[69]]).id_break(string2)).id_byte()) && !(string = rrtU_22.id_break()).isEmpty()) {
            this.id_break(string);
            this.id_byte(Objects.requireNonNullElse(((rrte_3)this.id_break[id_case[70]]).id_class(), id_protected[3]));
        }
        this.id_break(id_catch[27]);
        Boolean bl2 = id_catch[28];
        this.id_break[rrtY_2.id_case[71]] = bl2;
        ((Qj_1)rrtY_2.id_import.id_class[id_case[72]]).id_class(id_catch[29]);
    }

    private static void id_float() {
        id_private = new byte[]{50, 15, 50, 12, 50, 10, 2, 20, 2, 3, 4, 5, 9, 11, 12, 19};
    }

    public rrtY_2(rrIv_1 rrIv_12, rrtK_2 rrtK_22) {
        Supplier<Float> supplier;
        Supplier<Float> supplier2;
        this.id_this();
        AnimValue animValue = new AnimValue((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_case[0]]), id_finally[0], id_catch[0]);
        this.id_break[rrtY_2.id_case[1]] = animValue;
        this.id_break[rrtY_2.id_case[2]] = supplier2 = () -> Float.valueOf(id_finally[36]);
        this.id_break[rrtY_2.id_case[3]] = supplier = () -> Float.valueOf(id_finally[35]);
        rrIv_1 rrIv_13 = rrIv_12;
        this.id_break[rrtY_2.id_case[4]] = rrIv_13;
        rrtK_2 rrtK_23 = rrtK_22;
        this.id_break[rrtY_2.id_case[5]] = rrtK_23;
        rrte_3 rrte_32 = rrIv_12.id_finally();
        this.id_break[rrtY_2.id_case[6]] = rrte_32;
        this.id_class(() -> Float.valueOf(rrIv_12.id_volatile()));
        ((rrvd_1)((Object)rrvd_1.staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7[id_case[7]])).id_break(this);
    }

    public rrtY_2(rrtm_3 rrtm_32, rrIv_1 rrIv_12, rrtK_2 rrtK_22) {
        this(rrIv_12, rrtK_22);
        rrtm_3 rrtm_33 = rrtm_32;
        this.id_break[rrtY_2.id_case[8]] = rrtm_33;
    }

    static {
        rrtY_2.ntfClinit();
    }

    private void id_this() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_private[7]];
            objectArray[rrtY_2.id_private[8]] = Float.valueOf(id_finally[37]);
            objectArray[rrtY_2.id_private[9]] = Float.valueOf(id_finally[38]);
            objectArray[rrtY_2.id_private[10]] = Float.valueOf(id_finally[39]);
            objectArray[rrtY_2.id_private[11]] = Float.valueOf(id_finally[40]);
            objectArray[rrtY_2.id_private[12]] = id_catch[39];
            objectArray[rrtY_2.id_private[13]] = id_catch[40];
            objectArray[rrtY_2.id_private[14]] = id_catch[41];
            objectArray[rrtY_2.id_private[15]] = id_catch[42];
        }
    }

    private int id_interface() {
        this.id_this();
        rrtD_2 rrtD_22 = ((rrtK_2)((Object)this.id_break[id_case[88]])).id_class();
        if (this.id_try()) {
            return rrtD_22.id_break();
        }
        if (((Boolean)this.id_break[id_case[89]]).booleanValue()) {
            return rrtD_22.id_class();
        }
        return rrtD_22.id_byte();
    }

    public rrtY_2 id_class(Consumer<rrtY_2> consumer) {
        Consumer<rrtY_2> consumer2;
        this.id_this();
        this.id_break[rrtY_2.id_case[93]] = consumer2 = consumer;
        return this;
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        this.id_this();
        if (!this.aO_()) {
            return id_catch[8];
        }
        if (n == id_case[38]) {
            return id_catch[9];
        }
        this.id_instanceof();
        if (n == id_case[39] || n == id_case[40]) {
            if ((Consumer)this.id_break[id_case[41]] != null) {
                ((Consumer)this.id_break[id_case[42]]).accept(this);
            }
            this.id_long();
        }
        if (vm_3.id_private(n)) {
            Boolean bl = id_catch[10];
            this.id_break[rrtY_2.id_case[43]] = bl;
            return id_catch[11];
        }
        if (((Boolean)this.id_break[id_case[44]]).booleanValue()) {
            Pattern pattern = ((rrte_3)this.id_break[id_case[45]]).id_break();
            String string = Ve_1.id_class(n, n2).id_byte();
            if (n == id_case[46] || pattern != null && pattern.matcher(string).matches()) {
                this.id_byte(id_protected[0]);
                Boolean bl = id_catch[12];
                this.id_break[rrtY_2.id_case[47]] = bl;
            }
        }
        if (vm_3.id_case(n)) {
            if (((Boolean)this.id_break[id_case[48]]).booleanValue()) {
                this.id_byte(id_protected[1]);
                Boolean bl = id_catch[13];
                this.id_break[rrtY_2.id_case[49]] = bl;
            }
            this.id_byte(this.id_final() + ((Qj_1)rrtY_2.id_import.id_class[id_case[50]]).id_class());
            return id_catch[14];
        }
        if (((Boolean)this.id_break[id_case[51]]).booleanValue() && vm_3.id_catch(n)) {
            ((Qj_1)rrtY_2.id_import.id_class[id_case[52]]).id_class(this.id_final());
            return id_catch[15];
        }
        if (n == id_case[53]) {
            this.id_break(id_catch[16]);
            return id_catch[17];
        }
        return id_catch[18];
    }

    public rrtY_2 id_class(Supplier<Float> supplier) {
        Supplier<Float> supplier2;
        this.id_this();
        this.id_break[rrtY_2.id_case[92]] = supplier2 = supplier;
        return this;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x65518724;
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        if (!super.id_class(rrtu_32, n, n2, n3, bl)) {
            return id_catch[5];
        }
        if (this.id_package().id_break(n, n2)) {
            this.id_return();
            return id_catch[6];
        }
        return id_catch[7];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3EEECA7552A06260L;
    }

    @Override
    public boolean id_class(Ml_1 ml_1, rrtu_3 rrtu_32, float f, float f2, float f3, float f4, int n, int n2, boolean bl) {
        Object object;
        String string;
        this.id_this();
        Float f5 = Float.valueOf(f);
        this.id_break[rrtY_2.id_case[9]] = f5;
        Float f6 = Float.valueOf(f2);
        this.id_break[rrtY_2.id_case[10]] = f6;
        Float f7 = Float.valueOf(f3);
        this.id_break[rrtY_2.id_case[11]] = f7;
        Float f8 = Float.valueOf(f4);
        this.id_break[rrtY_2.id_case[12]] = f8;
        boolean bl2 = this.id_new();
        boolean bl3 = this.aO_();
        boolean bl4 = this.id_try();
        String string2 = ((rrIv_1)this.id_break[id_case[13]]).id_native().get();
        String string3 = string = bl2 && !bl3 ? string2 : this.id_final();
        Object object2 = bl4 ? (String)this.id_break[id_case[14]] : (object = (Function)this.id_break[id_case[15]] != null ? (String)((Function)this.id_break[id_case[16]]).apply(string) : string);
        if (bl3 && !bl4 && !((Boolean)this.id_break[id_case[17]]).booleanValue()) {
            object = (String)object + this.id_short();
        }
        int n3 = this.id_interface();
        int n4 = (int)((float)((rrtm_3)this.id_break[id_case[18]] == null ? id_case[19] : ((rrtm_3)this.id_break[id_case[20]]).id_class(id_case[21])) * ((Float)((Supplier)this.id_break[id_case[22]]).get()).floatValue());
        rrZO rrZO2 = this.id_public();
        switch (((int[])rrto_3.id_class[id_case[23]])[((rrtK_2)((Object)this.id_break[id_case[24]])).ordinal()]) {
            case 1: {
                if (((Boolean)this.id_break[id_case[25]]).booleanValue()) {
                    rrtF_2.id_class(ml_1, f, f2 - id_finally[1], rrZO2.id_break((String)object), id_finally[2], id_implements[0], Math.max(n4 - id_private[0], id_catch[1]));
                }
                rrtF_2.id_class(ml_1, rrZO2, (String)object, f, f2, n3, n4, (int)f3 - id_private[1]);
                rrtF_2.id_class(ml_1, f, f2 + id_finally[3], f3, id_finally[4], rrZF.k_, n4);
                break;
            }
            case 2: {
                if (((Boolean)this.id_break[id_case[26]]).booleanValue()) {
                    rrtF_2.id_class(ml_1, f, f2 - id_finally[5], rrZO2.id_break((String)object), id_finally[6], id_implements[1], Math.max(n4 - id_private[2], id_catch[2]));
                }
                rrtF_2.id_class(ml_1, rrZO2, (String)object, f, f2, n3, n4);
                break;
            }
            case 3: {
                ((AnimValue)this.id_break[id_case[27]]).id_class((Boolean)this.id_break[id_case[28]]);
                byte by = id_private[3];
                float f9 = f + (float)by + id_finally[7];
                int n5 = Math.min((int)(id_finally[8] * ((AnimValue)this.id_break[id_case[29]]).id_byte()) * n4 / id_case[30], id_case[31]);
                int n6 = ColorHelper.id_class(id_finally[9], n5);
                int n7 = ColorHelper.id_class(id_finally[10], n5);
                int n8 = ColorHelper.id_class(id_finally[11], n5);
                int n9 = ColorHelper.id_class(id_finally[12], n5);
                rrfD_2.id_break(ml_1, f - id_finally[13], f2 - id_finally[14], f3 + id_finally[15], f4 + id_finally[16], id_finally[17], (Integer)rrZI.id_break[id_case[32]], (Integer)rrZI.id_break[id_case[33]], (Integer)rrZI.id_break[id_case[34]], (Integer)rrZI.id_break[id_case[35]]);
                if (ClickGuiTheme.id_class()) {
                    rrfD_2.id_byte(ml_1, f + id_finally[18], f2, f3 - id_finally[19], f4, id_finally[20], n6, n7, n8, n9);
                }
                rrfD_2.id_break(ml_1, f, f2, f3, f4, id_finally[21], id_finally[22], id_finally[23], id_finally[24], n6, n7, n8, n9);
                if (((Boolean)this.id_break[id_case[36]]).booleanValue()) {
                    rrtF_2.id_class(ml_1, f9, f2 + id_finally[25], Math.min(rrZO2.id_break((String)object), f3 - id_finally[26]), id_finally[27], id_implements[2], Math.max(n4 - id_private[4], id_catch[3]));
                }
                rrtF_2.id_class(ml_1, (rqO_2)id_byte[id_case[37]], f + id_finally[28], f2 + id_finally[29], (float)by, (float)by, rrZF.d_, n4);
                rrtF_2.id_class(ml_1, rrZO2, (String)object, f9, f2 + id_finally[30], n3, n4, (int)((double)f3 * id_throws[0]), id_finally[31], id_finally[32]);
            }
        }
        return id_catch[4];
    }

    public rrtY_2 id_class(rrZO rrZO2) {
        this.id_this();
        rrZO rrZO3 = rrZO2;
        this.id_break[rrtY_2.id_case[96]] = rrZO3;
        return this;
    }

    public rrtY_2 id_class(Function<String, String> function) {
        Function<String, String> function2;
        this.id_this();
        this.id_break[rrtY_2.id_case[97]] = function2 = function;
        return this;
    }

    @Override
    public boolean id_class(char c, int n) {
        this.id_this();
        if (!this.aO_()) {
            return id_catch[19];
        }
        if (((Boolean)this.id_break[id_case[55]]).booleanValue() && ((rrte_3)this.id_break[id_case[56]] == null || ((rrte_3)this.id_break[id_case[57]]).id_break() != null && ((rrte_3)this.id_break[id_case[58]]).id_break().matcher(Character.toString(c)).matches())) {
            this.id_byte(id_protected[2]);
            Boolean bl = id_catch[20];
            this.id_break[rrtY_2.id_case[59]] = bl;
        }
        if (this.id_public().id_break(this.id_final()) >= ((Float)((Supplier)this.id_break[id_case[60]]).get()).floatValue()) {
            return id_catch[21];
        }
        return this.id_byte(this.id_final() + c);
    }

    private String id_short() {
        this.id_this();
        return (Integer)this.id_break[id_case[75]] / id_private[5] % id_private[6] == 0 ? id_protected[6] : id_protected[7];
    }

    private static void id_void() {
        id_implements = new int[]{-9987865, -9987865, -9987865};
    }

    public void id_break(boolean bl) {
        this.id_this();
        Boolean bl2 = bl;
        this.id_break[rrtY_2.id_case[85]] = bl2;
        if ((Consumer)this.id_break[id_case[86]] != null) {
            ((Consumer)this.id_break[id_case[87]]).accept(this);
        }
    }

    public void id_break(String string) {
        this.id_this();
        String string2 = string;
        this.id_break[rrtY_2.id_case[91]] = string2;
    }

    public rrtY_2 id_break(Consumer<rrtY_2> consumer) {
        Consumer<rrtY_2> consumer2;
        this.id_this();
        this.id_break[rrtY_2.id_case[94]] = consumer2 = consumer;
        return this;
    }

    public rrtY_2 id_break(Supplier<Float> supplier) {
        Supplier<Float> supplier2;
        this.id_this();
        this.id_break[rrtY_2.id_case[95]] = supplier2 = supplier;
        return this;
    }

    private void id_break(int n) {
        String string = this.id_final();
        int n2 = string.length() - n;
        if (n2 <= 0) {
            this.id_byte(id_protected[5]);
        } else {
            this.id_byte(string.substring(id_catch[30], n2));
        }
    }

    @Override
    public void id_throws() {
        this.id_long();
    }

    private static /* synthetic */ void ntfClinit() {
        rrtY_2.id_throw();
        rrtY_2.id_else();
        rrtY_2.id_import();
        rrtY_2.id_static();
        rrtY_2.id_goto();
        rrtY_2.id_float();
        rrtY_2.id_void();
        rrtY_2.id_synchronized();
    }

    public boolean id_extends() {
        this.id_this();
        return (Boolean)this.id_break[id_case[102]];
    }

    private static void id_goto() {
        id_throws = new double[]{0.8};
    }

    public float id_continue() {
        this.id_this();
        return ((Float)this.id_break[id_case[99]]).floatValue();
    }

    private static void id_else() {
        id_protected = new String[]{new String(""), new String(""), new String(""), new String(""), new String(""), new String(""), new String("|"), new String(""), new String("celestial/images/search.png")};
    }

    private static void id_import() {
        short[] sArray = new short[106];
        sArray[0] = 1;
        sArray[1] = 8;
        sArray[2] = 15;
        sArray[3] = 16;
        sArray[5] = 6;
        sArray[6] = 7;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[10] = 3;
        sArray[11] = 4;
        sArray[12] = 5;
        sArray[14] = 10;
        sArray[15] = 18;
        sArray[16] = 18;
        sArray[17] = 11;
        sArray[18] = 1;
        sArray[19] = 255;
        sArray[20] = 1;
        sArray[21] = 255;
        sArray[22] = 16;
        sArray[24] = 6;
        sArray[25] = 11;
        sArray[26] = 11;
        sArray[27] = 8;
        sArray[28] = 9;
        sArray[29] = 8;
        sArray[30] = 255;
        sArray[31] = 255;
        sArray[32] = 4;
        sArray[33] = 4;
        sArray[34] = 4;
        sArray[35] = 4;
        sArray[36] = 11;
        sArray[38] = 256;
        sArray[39] = 257;
        sArray[40] = 335;
        sArray[41] = 13;
        sArray[42] = 13;
        sArray[43] = 11;
        sArray[44] = 11;
        sArray[45] = 7;
        sArray[46] = 259;
        sArray[47] = 11;
        sArray[48] = 11;
        sArray[49] = 11;
        sArray[50] = 23;
        sArray[51] = 11;
        sArray[52] = 23;
        sArray[53] = 259;
        sArray[54] = 256;
        sArray[55] = 11;
        sArray[56] = 7;
        sArray[57] = 7;
        sArray[58] = 7;
        sArray[59] = 11;
        sArray[60] = 15;
        sArray[61] = 19;
        sArray[62] = 19;
        sArray[63] = 19;
        sArray[64] = 12;
        sArray[65] = 23;
        sArray[66] = 7;
        sArray[67] = 7;
        sArray[68] = 1;
        sArray[69] = 7;
        sArray[70] = 7;
        sArray[71] = 12;
        sArray[72] = 23;
        sArray[73] = 11;
        sArray[74] = 10;
        sArray[75] = 19;
        sArray[78] = 7;
        sArray[79] = 7;
        sArray[81] = 7;
        sArray[82] = 7;
        sArray[84] = 9;
        sArray[85] = 9;
        sArray[86] = 14;
        sArray[87] = 14;
        sArray[88] = 6;
        sArray[89] = 11;
        sArray[90] = 10;
        sArray[91] = 10;
        sArray[92] = 15;
        sArray[93] = 13;
        sArray[94] = 14;
        sArray[95] = 16;
        sArray[96] = 17;
        sArray[97] = 18;
        sArray[98] = 2;
        sArray[99] = 3;
        sArray[100] = 4;
        sArray[101] = 5;
        sArray[102] = 12;
        sArray[103] = 17;
        sArray[105] = 17;
        id_case = sArray;
    }

    private void id_instanceof() {
        this.id_this();
        Object var5_1 = null;
        this.id_break[rrtY_2.id_case[74]] = var5_1;
    }

    public boolean id_new() {
        this.id_this();
        String string = ((rrIv_1)this.id_break[id_case[76]]).id_break().toString();
        return string.isEmpty() || string.isBlank() ? id_catch[32] : id_catch[33];
    }

    public rruv_1 id_package() {
        return new rruv_1(this.id_volatile(), this.id_continue() - id_finally[33], this.id_super(), this.id_native() + id_finally[34]);
    }

    private void id_return() {
        this.id_this();
        this.id_break(id_catch[24]);
        this.id_char();
        Boolean bl = id_catch[25];
        this.id_break[rrtY_2.id_case[64]] = bl;
        ((Qj_1)rrtY_2.id_import.id_class[id_case[65]]).id_class(id_catch[26]);
    }

    public float id_super() {
        this.id_this();
        return ((Float)this.id_break[id_case[100]]).floatValue();
    }

    private static void id_throw() {
        boolean[] blArray = new boolean[44];
        blArray[4] = true;
        blArray[6] = true;
        blArray[10] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[18] = true;
        blArray[22] = true;
        blArray[24] = true;
        blArray[25] = true;
        blArray[26] = true;
        blArray[32] = true;
        blArray[35] = true;
        blArray[36] = true;
        blArray[43] = true;
        id_catch = blArray;
    }

    private boolean id_try() {
        this.id_this();
        return (String)this.id_break[id_case[90]] != null ? id_catch[36] : id_catch[37];
    }

    private static void id_static() {
        float[] fArray = new float[41];
        fArray[0] = 0.3f;
        fArray[1] = 3.0f;
        fArray[2] = 10.0f;
        fArray[3] = 10.0f;
        fArray[4] = 0.5f;
        fArray[5] = 3.0f;
        fArray[6] = 9.0f;
        fArray[7] = 3.0f;
        fArray[8] = 255.0f;
        fArray[10] = 90.0f;
        fArray[11] = 270.0f;
        fArray[12] = 180.0f;
        fArray[13] = 1.0f;
        fArray[14] = 1.0f;
        fArray[15] = 2.0f;
        fArray[16] = 2.0f;
        fArray[17] = 4.0f;
        fArray[18] = 2.0f;
        fArray[19] = 3.0f;
        fArray[20] = 3.0f;
        fArray[21] = 4.0f;
        fArray[22] = 4.0f;
        fArray[23] = 4.0f;
        fArray[24] = 4.0f;
        fArray[25] = 2.5f;
        fArray[26] = 19.0f;
        fArray[27] = 10.0f;
        fArray[28] = 2.0f;
        fArray[29] = 1.5f;
        fArray[30] = 5.5f;
        fArray[31] = 0.4f;
        fArray[32] = 0.9f;
        fArray[33] = 2.0f;
        fArray[34] = 3.0f;
        fArray[35] = 1.0f;
        fArray[36] = Float.MAX_VALUE;
        id_finally = fArray;
    }

    private rrZO id_public() {
        this.id_this();
        return (rrZO)this.id_break[id_case[103]] == null ? ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_case[104]]).id_finally() : (rrZO)this.id_break[id_case[105]];
    }

    @Override
    public void id_protected() {
        this.id_this();
        if (this.aO_()) {
            rrtY_2 rrtY_22 = this;
            Integer n = (Integer)rrtY_22.id_break[id_case[61]] + id_catch[22];
            rrtY_22.id_break[rrtY_2.id_case[62]] = n;
        } else {
            Integer n = id_catch[23];
            this.id_break[rrtY_2.id_case[63]] = n;
        }
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-116, 4, -81, 38, 114, -9, 88, -41}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_private() {
        this.id_long();
    }

    public String id_final() {
        this.id_this();
        return ((rrIv_1)this.id_break[id_case[77]]).id_break().toString();
    }

    public float id_volatile() {
        this.id_this();
        return ((Float)this.id_break[id_case[98]]).floatValue();
    }

    private static void id_synchronized() {
        Object[] objectArray = new Object[]{new rqO_2("minecraft", id_protected[8])};
        id_byte = objectArray;
    }

    public float id_native() {
        this.id_this();
        return ((Float)this.id_break[id_case[101]]).floatValue();
    }

    @Override
    public boolean aO_() {
        this.id_this();
        return (Boolean)this.id_break[id_case[84]];
    }
}

