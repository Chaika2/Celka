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
import celestial.rrfx_3;
import celestial.rrpu_3;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.rryY;
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

public class rryR
extends rrpu_3 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    private static long[] id_protected;
    private static String[] id_case;
    private static short[] id_catch;
    public Object[] id_class;
    private static float[] id_private;

    private int id_byte(int n) {
        this.id_final();
        if (n == id_break[8]) {
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            return n;
        }
        if (n == id_break[9]) {
            rrfo_3.id_class(rpm_3.OFF_HAND);
            return n;
        }
        if (n >= 0 && n < id_break[10]) {
            rrfo_3.id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            rrfo_3.id_class(((rhz_3)((cb_3)rryR.id_import.id_class[rryR.id_catch[44]]).id_implements[rryR.id_catch[45]]).id_protected);
            return n;
        }
        if (n >= id_break[11] && n <= id_break[12]) {
            ((rrfP_2)this.id_class[id_catch[46]]).id_class(((rhz_3)((cb_3)rryR.id_import.id_class[rryR.id_catch[47]]).id_implements[rryR.id_catch[48]]).id_protected);
            ((Ax_1)rryR.id_import.id_class[id_catch[49]]).id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            Long l = rqR_2.id_break();
            this.id_class[rryR.id_catch[50]] = l;
            return n;
        }
        return id_break[13];
    }

    @Override
    public rdn_3 id_byte() {
        return ((rrfx_3)((Object)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[id_catch[51]])).id_break().id_class();
    }

    private static void id_int() {
        long[] lArray = new long[2];
        lArray[0] = 300L;
        id_protected = lArray;
    }

    public rryR(FtHelper ftHelper) {
        super(ftHelper);
        this.id_final();
        rrIk_1 rrIk_12 = new rrIk_1(id_case[0], id_byte[0]);
        this.id_class[rryR.id_catch[0]] = rrIk_12;
        rrIF rrIF2 = new rrIF(id_case[1], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_catch[1]]);
        this.id_class[rryR.id_catch[2]] = rrIF2;
        CheckGroup checkGroup = new CheckGroup().id_catch(id_byte[1]).id_case(id_byte[2]).id_class(id_byte[3]);
        this.id_class[rryR.id_catch[3]] = checkGroup;
        rrfP_2 rrfP_22 = new rrfP_2();
        this.id_class[rryR.id_catch[4]] = rrfP_22;
        Integer n = id_break[0];
        this.id_class[rryR.id_catch[5]] = n;
        Setting[] settingArray = new Setting[id_break[1]];
        rrIk_1[] rrIk_1Array = new rrIk_1[id_byte[5]];
        rrIk_1Array[rryR.id_byte[6]] = (rrIk_1)this.id_class[id_catch[6]];
        settingArray[rryR.id_byte[4]] = new rrIc_1(id_case[3], rrIk_1Array);
        settingArray[rryR.id_byte[7]] = (rrIF)this.id_class[id_catch[7]];
        ftHelper.id_class(new GroupSetting(id_case[2], settingArray));
    }

    static {
        rryR.ntfClinit();
    }

    private static void id_this() {
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
        id_catch = sArray;
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        this.id_final();
        if (rrLB2.id_break() == ((rrIF)this.id_class[id_catch[8]]).id_finally().id_byte()) {
            Boolean bl = id_byte[8];
            this.id_class[rryR.id_catch[9]] = bl;
        }
    }

    private rryY id_class(int n) {
        if (n == id_break[7]) {
            return (rryY)((Object)rryY.staticFields45ad03cc55cb3e668addddf47f67a723[id_catch[35]]);
        }
        if (((cb_3)rryR.id_import.id_class[id_catch[36]]).sK().id_class(rdy_3.xa)) {
            return (rryY)((Object)rryY.staticFields45ad03cc55cb3e668addddf47f67a723[id_catch[37]]);
        }
        if (!this.id_return()) {
            return (rryY)((Object)rryY.staticFields45ad03cc55cb3e668addddf47f67a723[id_catch[38]]);
        }
        return (rryY)((Object)rryY.staticFields45ad03cc55cb3e668addddf47f67a723[id_catch[39]]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE63069B5D592A845L;
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        this.id_final();
        ((rrfP_2)this.id_class[id_catch[10]]).id_class(rrLu_12);
    }

    @EventTarget
    public void id_class(rrAo_1 rrAo_12) {
        this.id_final();
        ((rrfP_2)this.id_class[id_catch[11]]).id_class(rqR_2.id_break() - (Long)this.id_class[id_catch[12]] > id_protected[0] ? id_byte[9] : id_byte[10]);
        if (((Boolean)this.id_class[id_catch[13]]).booleanValue()) {
            int n;
            FtHelper ftHelper = (FtHelper)this.id_continue();
            int n2 = this.id_public();
            rryY rryY2 = this.id_class(n2);
            if (rryY2 == (rryY)((Object)rryY.staticFields45ad03cc55cb3e668addddf47f67a723[id_catch[14]])) {
                int n3 = ((cb_3)rryR.id_import.id_class[id_catch[15]]).sK().id_protected(rdy_3.xa);
                float f = (float)n3 / id_private[0];
                rrfu_3.id_class(ftHelper, id_case[4], f);
            } else if (rryY2 == (rryY)((Object)rryY.staticFields45ad03cc55cb3e668addddf47f67a723[id_catch[16]])) {
                String string = id_case[5];
                rrfu_3.id_byte(rrfu_3.id_class(ftHelper) + string);
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[17]]).id_class(new rrtx_3(ftHelper.id_final(), string, (int)id_catch[18]));
            } else if (rryY2 == (rryY)((Object)rryY.staticFields45ad03cc55cb3e668addddf47f67a723[id_catch[19]]) && (n = this.id_byte(n2)) > id_break[2]) {
                Integer n4 = n;
                this.id_class[rryR.id_catch[20]] = n4;
                Integer n5 = id_byte[11];
                this.id_class[rryR.id_catch[21]] = n5;
            }
            Boolean bl = id_byte[12];
            this.id_class[rryR.id_catch[22]] = bl;
        }
        if ((Integer)this.id_class[id_catch[23]] != id_break[3]) {
            byte by = ((cb_3)rryR.id_import.id_class[id_catch[24]]).sV() || ((cb_3)rryR.id_import.id_class[id_catch[25]]).sZ() ? id_byte[13] : id_break[4];
            rryR rryR2 = this;
            int n = (Integer)rryR2.id_class[id_catch[26]] + id_byte[14];
            Integer n6 = n;
            rryR2.id_class[rryR.id_catch[27]] = n6;
            if (n > by) {
                ((Ax_1)rryR.id_import.id_class[id_catch[28]]).id_class((Integer)this.id_class[id_catch[29]]);
                Integer n7 = id_break[5];
                this.id_class[rryR.id_catch[30]] = n7;
                Integer n8 = id_byte[15];
                this.id_class[rryR.id_catch[31]] = n8;
            }
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-75, -64, -28, 121, -22, 41, 96, -43}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA41A160E;
    }

    public long id_break() {
        this.id_final();
        return (Long)this.id_class[id_catch[61]];
    }

    @Override
    public rrIF id_throws() {
        this.id_final();
        return (rrIF)this.id_class[id_catch[52]];
    }

    private static /* synthetic */ void ntfClinit() {
        rryR.id_else();
        rryR.id_package();
        rryR.id_int();
        rryR.id_this();
        rryR.id_new();
        rryR.id_synchronized();
    }

    public boolean id_finally() {
        this.id_final();
        return (Boolean)this.id_class[id_catch[60]];
    }

    public CheckGroup id_extends() {
        this.id_final();
        return (CheckGroup)this.id_class[id_catch[58]];
    }

    public rrIk_1 id_case() {
        this.id_final();
        return (rrIk_1)this.id_class[id_catch[57]];
    }

    private static void id_else() {
        boolean[] blArray = new boolean[29];
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
        id_byte = blArray;
    }

    public int id_implements() {
        this.id_final();
        return (Integer)this.id_class[id_catch[63]];
    }

    private static void id_new() {
        id_private = new float[]{20.0f, 10.0f};
    }

    private static void id_package() {
        id_case = new String[]{new String("\u0420\u044f\u0434\u043e\u043c \u0438\u0433\u0440\u043e\u043a"), new String("\u0410\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u044f"), new String("\u041e\u0433\u043d\u0435\u043d\u043d\u044b\u0439 \u0441\u043c\u0435\u0440\u0447"), new String("\u041f\u0440\u043e\u0432\u0435\u0440\u043a\u0438"), new String("\u043e\u0433\u043d\u0435\u043d\u043d\u043e\u0433\u043e \u0441\u043c\u0435\u0440\u0447\u0430"), new String("\u041d\u0435\u0442 \u0438\u0433\u0440\u043e\u043a\u043e\u0432 \u043f\u043e\u0431\u043b\u0438\u0437\u043e\u0441\u0442\u0438"), new String("[\u2605] \u041e\u0433\u043d\u0435\u043d\u043d\u044b\u0439 \u0441\u043c\u0435\u0440\u0447"), new String("fierytornado"), new String("spooky-item")};
    }

    private boolean id_return() {
        this.id_final();
        if (!((rrIk_1)this.id_class[id_catch[40]]).id_class().booleanValue()) {
            return id_byte[18];
        }
        for (Int2ObjectMap.Entry entry : ((gm_3)rryR.id_import.id_class[id_catch[41]]).id_return().int2ObjectEntrySet()) {
            an_3 an_32 = (an_3)entry.getValue();
            if (an_32 == this.O() || !rrff_3.id_class(an_32, (CheckGroup)this.id_class[id_catch[42]]) || !(((cb_3)rryR.id_import.id_class[id_catch[43]]).id_implements(an_32) <= id_private[1])) continue;
            return id_byte[19];
        }
        return id_byte[20];
    }

    private int id_public() {
        Predicate<rdn_3> predicate = this.id_protected();
        if (predicate == null) {
            return id_break[14];
        }
        if (predicate.test(((cb_3)rryR.id_import.id_class[id_catch[53]]).ss())) {
            return id_break[15];
        }
        if (predicate.test(((cb_3)rryR.id_import.id_class[id_catch[54]]).Sn())) {
            return id_break[16];
        }
        for (int i = id_byte[21]; i < id_break[17]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rryR.id_import.id_class[rryR.id_catch[55]]).id_implements[id_catch[56]]).id_extends(i);
            if (!predicate.test(rdn_32)) continue;
            return i;
        }
        return id_break[18];
    }

    @Override
    public Predicate<rdn_3> id_protected() {
        return rdn_32 -> {
            if (rdn_32.id_break() != rdy_3.xa) {
                return id_byte[22];
            }
            if (rdn_32.id_continue().id_byte().equalsIgnoreCase(id_case[6])) {
                return id_byte[23];
            }
            if (rdn_32.id_protected(id_case[7]) || rdn_32.id_protected(id_case[8])) {
                return id_byte[24];
            }
            return id_byte[25];
        };
    }

    public int id_private() {
        this.id_final();
        return (Integer)this.id_class[id_catch[62]];
    }

    private void id_final() {
        if (this.id_class == null) {
            this.id_class = new Object[8];
            this.id_class[4] = false;
            this.id_class[5] = 0L;
            this.id_class[6] = 0;
            this.id_class[7] = 0;
        }
    }

    private static void id_synchronized() {
        id_break = new byte[]{-1, 2, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 8, 4, 5, 6, 7};
    }

    public rrfP_2 id_native() {
        this.id_final();
        return (rrfP_2)this.id_class[id_catch[59]];
    }

    @Override
    public boolean aK_() {
        this.id_final();
        Boolean bl = id_byte[16];
        this.id_class[rryR.id_catch[32]] = bl;
        Integer n = id_break[6];
        this.id_class[rryR.id_catch[33]] = n;
        Integer n2 = id_byte[17];
        this.id_class[rryR.id_catch[34]] = n2;
        return super.aK_();
    }
}

