/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 */
package celestial;

import celestial.Ax_1;
import celestial.an_3;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.module.util.FtHelper;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rpm_3;
import celestial.rqR_2;
import celestial.rrAo_1;
import celestial.rrIF;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrLB;
import celestial.rrLu_1;
import celestial.rrfP_2;
import celestial.rrff_3;
import celestial.rrfo_3;
import celestial.rrfu_3;
import celestial.rrpu_3;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.rryj_1;
import celestial.setting.CheckGroup;
import celestial.setting.GroupSetting;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryf_1
extends rrpu_3 {
    public static Object[] id_class;
    private static long[] id_byte;
    public Object[] id_break;
    private static float[] id_protected;
    private static boolean[] id_case;
    private static byte[] id_catch;
    private static String[] id_private;
    private static short[] id_implements;

    private int id_byte(int n) {
        this.id_else();
        if (n == id_catch[8]) {
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            return n;
        }
        if (n == id_catch[9]) {
            rrfo_3.id_class(rpm_3.OFF_HAND);
            return n;
        }
        if (n >= 0 && n < id_catch[10]) {
            rrfo_3.id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            rrfo_3.id_class(((rhz_3)((cb_3)rryf_1.id_import.id_class[rryf_1.id_implements[44]]).id_implements[rryf_1.id_implements[45]]).id_protected);
            return n;
        }
        if (n >= id_catch[11] && n <= id_catch[12]) {
            ((rrfP_2)this.id_break[id_implements[46]]).id_class(((rhz_3)((cb_3)rryf_1.id_import.id_class[rryf_1.id_implements[47]]).id_implements[rryf_1.id_implements[48]]).id_protected);
            ((Ax_1)rryf_1.id_import.id_class[id_implements[49]]).id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            Long l = rqR_2.id_break();
            this.id_break[rryf_1.id_implements[50]] = l;
            return n;
        }
        return id_catch[13];
    }

    @Override
    public rdn_3 id_byte() {
        return (rdn_3)id_class[id_implements[51]];
    }

    private static void id_int() {
        boolean[] blArray = new boolean[32];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[14] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[23] = true;
        blArray[24] = true;
        blArray[26] = true;
        blArray[31] = true;
        id_case = blArray;
    }

    public rryf_1(FtHelper ftHelper) {
        super(ftHelper);
        this.id_else();
        rrIk_1 rrIk_12 = new rrIk_1(id_private[0], id_case[0]);
        this.id_break[rryf_1.id_implements[0]] = rrIk_12;
        rrIF rrIF2 = new rrIF(id_private[1], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_implements[1]]);
        this.id_break[rryf_1.id_implements[2]] = rrIF2;
        CheckGroup checkGroup = new CheckGroup().id_catch(id_case[1]).id_case(id_case[2]).id_class(id_case[3]);
        this.id_break[rryf_1.id_implements[3]] = checkGroup;
        rrfP_2 rrfP_22 = new rrfP_2();
        this.id_break[rryf_1.id_implements[4]] = rrfP_22;
        Integer n = id_catch[0];
        this.id_break[rryf_1.id_implements[5]] = n;
        Setting[] settingArray = new Setting[id_catch[1]];
        rrIk_1[] rrIk_1Array = new rrIk_1[id_case[5]];
        rrIk_1Array[rryf_1.id_case[6]] = (rrIk_1)this.id_break[id_implements[6]];
        settingArray[rryf_1.id_case[4]] = new rrIc_1(id_private[3], rrIk_1Array);
        settingArray[rryf_1.id_case[7]] = (rrIF)this.id_break[id_implements[7]];
        ftHelper.id_class(new GroupSetting(id_private[2], settingArray));
    }

    static {
        rryf_1.ntfClinit();
    }

    private static void id_this() {
        id_private = new String[]{new String("\u0420\u044f\u0434\u043e\u043c \u0438\u0433\u0440\u043e\u043a"), new String("\u0410\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u044f"), new String("\u0414\u0435\u0437\u043e\u0440\u0438\u0435\u043d\u0442\u0430\u0446\u0438\u044f"), new String("\u041f\u0440\u043e\u0432\u0435\u0440\u043a\u0438"), new String("\u0434\u0435\u0437\u043e\u0440\u0438\u0435\u043d\u0442\u0430\u0446\u0438\u0438"), new String("\u041d\u0435\u0442 \u0438\u0433\u0440\u043e\u043a\u043e\u0432 \u043f\u043e\u0431\u043b\u0438\u0437\u043e\u0441\u0442\u0438"), new String("[\u2605] \u0414\u0435\u0437\u043e\u0440\u0438\u0435\u043d\u0442\u0430\u0446\u0438\u044f"), new String("desorientation"), new String("spooky-item")};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF2A4E50567AC575EL;
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        this.id_else();
        ((rrfP_2)this.id_break[id_implements[10]]).id_class(rrLu_12);
    }

    @EventTarget
    public void id_class(rrAo_1 rrAo_12) {
        this.id_else();
        ((rrfP_2)this.id_break[id_implements[11]]).id_class(rqR_2.id_break() - (Long)this.id_break[id_implements[12]] > id_byte[0] ? id_case[9] : id_case[10]);
        if (((Boolean)this.id_break[id_implements[13]]).booleanValue()) {
            int n;
            FtHelper ftHelper = (FtHelper)this.id_continue();
            int n2 = this.id_public();
            rryj_1 rryj_12 = this.id_class(n2);
            if (rryj_12 == (rryj_1)((Object)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[id_implements[14]])) {
                int n3 = ((cb_3)rryf_1.id_import.id_class[id_implements[15]]).sK().id_protected(rdy_3.JT);
                float f = (float)n3 / id_protected[0];
                rrfu_3.id_class(ftHelper, id_private[4], f);
            } else if (rryj_12 == (rryj_1)((Object)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[id_implements[16]])) {
                String string = id_private[5];
                rrfu_3.id_byte(rrfu_3.id_class(ftHelper) + string);
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_implements[17]]).id_class(new rrtx_3(ftHelper.id_final(), string, (int)id_implements[18]));
            } else if (rryj_12 == (rryj_1)((Object)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[id_implements[19]]) && (n = this.id_byte(n2)) > id_catch[2]) {
                Integer n4 = n;
                this.id_break[rryf_1.id_implements[20]] = n4;
                Integer n5 = id_case[11];
                this.id_break[rryf_1.id_implements[21]] = n5;
            }
            Boolean bl = id_case[12];
            this.id_break[rryf_1.id_implements[22]] = bl;
        }
        if ((Integer)this.id_break[id_implements[23]] != id_catch[3]) {
            byte by = ((cb_3)rryf_1.id_import.id_class[id_implements[24]]).sV() || ((cb_3)rryf_1.id_import.id_class[id_implements[25]]).sZ() ? id_case[13] : id_catch[4];
            rryf_1 rryf_12 = this;
            int n = (Integer)rryf_12.id_break[id_implements[26]] + id_case[14];
            Integer n6 = n;
            rryf_12.id_break[rryf_1.id_implements[27]] = n6;
            if (n > by) {
                ((Ax_1)rryf_1.id_import.id_class[id_implements[28]]).id_class((Integer)this.id_break[id_implements[29]]);
                Integer n7 = id_catch[5];
                this.id_break[rryf_1.id_implements[30]] = n7;
                Integer n8 = id_case[15];
                this.id_break[rryf_1.id_implements[31]] = n8;
            }
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-95, 6, 26, 114, -6, 124, -23, -94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        this.id_else();
        if (rrLB2.id_break() == ((rrIF)this.id_break[id_implements[8]]).id_finally().id_byte()) {
            Boolean bl = id_case[8];
            this.id_break[rryf_1.id_implements[9]] = bl;
        }
    }

    private rryj_1 id_class(int n) {
        if (n == id_catch[7]) {
            return (rryj_1)((Object)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[id_implements[35]]);
        }
        if (((cb_3)rryf_1.id_import.id_class[id_implements[36]]).sK().id_class(rdy_3.JT)) {
            return (rryj_1)((Object)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[id_implements[37]]);
        }
        if (!this.id_final()) {
            return (rryj_1)((Object)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[id_implements[38]]);
        }
        return (rryj_1)((Object)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[id_implements[39]]);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9434B61F;
    }

    public int id_break() {
        this.id_else();
        return (Integer)this.id_break[id_implements[63]];
    }

    @Override
    public rrIF id_throws() {
        this.id_else();
        return (rrIF)this.id_break[id_implements[52]];
    }

    private static /* synthetic */ void ntfClinit() {
        rryf_1.id_int();
        rryf_1.id_this();
        rryf_1.id_package();
        rryf_1.id_synchronized();
        rryf_1.id_return();
        rryf_1.id_new();
        rryf_1.id_goto();
    }

    public boolean id_finally() {
        this.id_else();
        return (Boolean)this.id_break[id_implements[60]];
    }

    public rrIk_1 id_extends() {
        this.id_else();
        return (rrIk_1)this.id_break[id_implements[57]];
    }

    private static void id_goto() {
        Object[] objectArray = new Object[]{new rdn_3(rdy_3.JT, 1)};
        id_class = objectArray;
    }

    public CheckGroup id_case() {
        this.id_else();
        return (CheckGroup)this.id_break[id_implements[58]];
    }

    private void id_else() {
        if (this.id_break == null) {
            this.id_break = new Object[8];
            this.id_break[4] = false;
            this.id_break[5] = 0L;
            this.id_break[6] = 0;
            this.id_break[7] = 0;
        }
    }

    public int id_implements() {
        this.id_else();
        return (Integer)this.id_break[id_implements[62]];
    }

    private static void id_new() {
        id_catch = new byte[]{-1, 2, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 8, 4, 5, 6, 7};
    }

    private static void id_package() {
        long[] lArray = new long[2];
        lArray[0] = 300L;
        id_byte = lArray;
    }

    private static void id_return() {
        id_protected = new float[]{20.0f, 10.0f};
    }

    private int id_public() {
        Predicate<rdn_3> predicate = this.id_protected();
        if (predicate == null) {
            return id_catch[14];
        }
        if (predicate.test(((cb_3)rryf_1.id_import.id_class[id_implements[53]]).ss())) {
            return id_catch[15];
        }
        if (predicate.test(((cb_3)rryf_1.id_import.id_class[id_implements[54]]).Sn())) {
            return id_catch[16];
        }
        for (int i = id_case[21]; i < id_catch[17]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rryf_1.id_import.id_class[rryf_1.id_implements[55]]).id_implements[id_implements[56]]).id_extends(i);
            if (!predicate.test(rdn_32)) continue;
            return i;
        }
        return id_catch[18];
    }

    @Override
    public Predicate<rdn_3> id_protected() {
        return rdn_32 -> {
            if (rdn_32.id_break() != rdy_3.JT) {
                return id_case[22];
            }
            if (rdn_32.id_continue().id_byte().equalsIgnoreCase(id_private[6])) {
                return id_case[23];
            }
            if (rdn_32.id_protected(id_private[7]) || rdn_32.id_protected(id_private[8])) {
                return id_case[24];
            }
            return id_case[25];
        };
    }

    public long id_private() {
        this.id_else();
        return (Long)this.id_break[id_implements[61]];
    }

    private boolean id_final() {
        this.id_else();
        if (!((rrIk_1)this.id_break[id_implements[40]]).id_class().booleanValue()) {
            return id_case[18];
        }
        for (Int2ObjectMap.Entry entry : ((gm_3)rryf_1.id_import.id_class[id_implements[41]]).id_return().int2ObjectEntrySet()) {
            an_3 an_32 = (an_3)entry.getValue();
            if (an_32 == this.O() || !rrff_3.id_class(an_32, (CheckGroup)this.id_break[id_implements[42]]) || !(((cb_3)rryf_1.id_import.id_class[id_implements[43]]).id_implements(an_32) <= id_protected[1])) continue;
            return id_case[19];
        }
        return id_case[20];
    }

    private static void id_synchronized() {
        short[] sArray = new short[64];
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 6;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[9] = 4;
        sArray[10] = 3;
        sArray[11] = 3;
        sArray[12] = 5;
        sArray[13] = 4;
        sArray[14] = 2;
        sArray[15] = 57;
        sArray[16] = 3;
        sArray[18] = 2000;
        sArray[20] = 6;
        sArray[21] = 7;
        sArray[22] = 4;
        sArray[23] = 6;
        sArray[24] = 57;
        sArray[25] = 57;
        sArray[26] = 7;
        sArray[27] = 7;
        sArray[28] = 55;
        sArray[29] = 6;
        sArray[30] = 6;
        sArray[31] = 7;
        sArray[32] = 4;
        sArray[33] = 6;
        sArray[34] = 7;
        sArray[35] = 1;
        sArray[36] = 57;
        sArray[37] = 2;
        sArray[38] = 3;
        sArray[41] = 56;
        sArray[42] = 2;
        sArray[43] = 57;
        sArray[44] = 57;
        sArray[45] = 1;
        sArray[46] = 3;
        sArray[47] = 57;
        sArray[48] = 1;
        sArray[49] = 55;
        sArray[50] = 5;
        sArray[52] = 1;
        sArray[53] = 57;
        sArray[54] = 57;
        sArray[55] = 57;
        sArray[56] = 1;
        sArray[58] = 2;
        sArray[59] = 3;
        sArray[60] = 4;
        sArray[61] = 5;
        sArray[62] = 6;
        sArray[63] = 7;
        id_implements = sArray;
    }

    public rrfP_2 id_native() {
        this.id_else();
        return (rrfP_2)this.id_break[id_implements[59]];
    }

    @Override
    public boolean aK_() {
        this.id_else();
        Boolean bl = id_case[16];
        this.id_break[rryf_1.id_implements[32]] = bl;
        Integer n = id_catch[6];
        this.id_break[rryf_1.id_implements[33]] = n;
        Integer n2 = id_case[17];
        this.id_break[rryf_1.id_implements[34]] = n2;
        return super.aK_();
    }
}

