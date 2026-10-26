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
import celestial.rrpW_2;
import celestial.rrpu_3;
import celestial.rrth_3;
import celestial.rrtx_3;
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

public class rrpk_3
extends rrpu_3 {
    private static short[] id_break;
    private static long[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;
    private static float[] id_case;
    private static String[] id_catch;
    private static byte[] id_private;

    private int id_byte(int n) {
        this.id_case();
        if (n == id_private[8]) {
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            return n;
        }
        if (n == id_private[9]) {
            rrfo_3.id_class(rpm_3.OFF_HAND);
            return n;
        }
        if (n >= 0 && n < id_private[10]) {
            rrfo_3.id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            rrfo_3.id_class(((rhz_3)((cb_3)rrpk_3.id_import.id_class[rrpk_3.id_break[44]]).id_implements[rrpk_3.id_break[45]]).id_protected);
            return n;
        }
        if (n >= id_private[11] && n <= id_private[12]) {
            ((rrfP_2)this.id_class[id_break[46]]).id_class(((rhz_3)((cb_3)rrpk_3.id_import.id_class[rrpk_3.id_break[47]]).id_implements[rrpk_3.id_break[48]]).id_protected);
            ((Ax_1)rrpk_3.id_import.id_class[id_break[49]]).id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            Long l = rqR_2.id_break();
            this.id_class[rrpk_3.id_break[50]] = l;
            return n;
        }
        return id_private[13];
    }

    @Override
    public rdn_3 id_byte() {
        return ((rrfx_3)((Object)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[id_break[51]])).id_break().id_class();
    }

    public rrpk_3(FtHelper ftHelper) {
        super(ftHelper);
        this.id_case();
        rrIk_1 rrIk_12 = new rrIk_1(id_catch[0], id_protected[0]);
        this.id_class[rrpk_3.id_break[0]] = rrIk_12;
        rrIF rrIF2 = new rrIF(id_catch[1], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_break[1]]);
        this.id_class[rrpk_3.id_break[2]] = rrIF2;
        CheckGroup checkGroup = new CheckGroup().id_catch(id_protected[1]).id_case(id_protected[2]).id_class(id_protected[3]);
        this.id_class[rrpk_3.id_break[3]] = checkGroup;
        rrfP_2 rrfP_22 = new rrfP_2();
        this.id_class[rrpk_3.id_break[4]] = rrfP_22;
        Integer n = id_private[0];
        this.id_class[rrpk_3.id_break[5]] = n;
        Setting[] settingArray = new Setting[id_private[1]];
        rrIk_1[] rrIk_1Array = new rrIk_1[id_protected[5]];
        rrIk_1Array[rrpk_3.id_protected[6]] = (rrIk_1)this.id_class[id_break[6]];
        settingArray[rrpk_3.id_protected[4]] = new rrIc_1(id_catch[3], rrIk_1Array);
        settingArray[rrpk_3.id_protected[7]] = (rrIF)this.id_class[id_break[7]];
        ftHelper.id_class(new GroupSetting(id_catch[2], settingArray));
    }

    static {
        rrpk_3.ntfClinit();
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        this.id_case();
        if (rrLB2.id_break() == ((rrIF)this.id_class[id_break[8]]).id_finally().id_byte()) {
            Boolean bl = id_protected[8];
            this.id_class[rrpk_3.id_break[9]] = bl;
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x64D98D29F8FD8C55L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x89424405;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-7, -91, 12, 1, 3, -64, 101, 126}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        this.id_case();
        ((rrfP_2)this.id_class[id_break[10]]).id_class(rrLu_12);
    }

    @EventTarget
    public void id_class(rrAo_1 rrAo_12) {
        this.id_case();
        ((rrfP_2)this.id_class[id_break[11]]).id_class(rqR_2.id_break() - (Long)this.id_class[id_break[12]] > id_byte[0] ? id_protected[9] : id_protected[10]);
        if (((Boolean)this.id_class[id_break[13]]).booleanValue()) {
            int n;
            FtHelper ftHelper = (FtHelper)this.id_continue();
            int n2 = this.id_final();
            rrpW_2 rrpW_22 = this.id_break(n2);
            if (rrpW_22 == (rrpW_2)((Object)rrpW_2.staticFields1ac742ac88213c01994e700cd2890005[id_break[14]])) {
                int n3 = ((cb_3)rrpk_3.id_import.id_class[id_break[15]]).sK().id_protected(rdy_3.XY);
                float f = (float)n3 / id_case[0];
                rrfu_3.id_class(ftHelper, id_catch[4], f);
            } else if (rrpW_22 == (rrpW_2)((Object)rrpW_2.staticFields1ac742ac88213c01994e700cd2890005[id_break[16]])) {
                String string = id_catch[5];
                rrfu_3.id_byte(rrfu_3.id_class(ftHelper) + string);
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[17]]).id_class(new rrtx_3(ftHelper.id_final(), string, (int)id_break[18]));
            } else if (rrpW_22 == (rrpW_2)((Object)rrpW_2.staticFields1ac742ac88213c01994e700cd2890005[id_break[19]]) && (n = this.id_byte(n2)) > id_private[2]) {
                Integer n4 = n;
                this.id_class[rrpk_3.id_break[20]] = n4;
                Integer n5 = id_protected[11];
                this.id_class[rrpk_3.id_break[21]] = n5;
            }
            Boolean bl = id_protected[12];
            this.id_class[rrpk_3.id_break[22]] = bl;
        }
        if ((Integer)this.id_class[id_break[23]] != id_private[3]) {
            byte by = ((cb_3)rrpk_3.id_import.id_class[id_break[24]]).sV() || ((cb_3)rrpk_3.id_import.id_class[id_break[25]]).sZ() ? id_protected[13] : id_private[4];
            rrpk_3 rrpk_32 = this;
            int n = (Integer)rrpk_32.id_class[id_break[26]] + id_protected[14];
            Integer n6 = n;
            rrpk_32.id_class[rrpk_3.id_break[27]] = n6;
            if (n > by) {
                ((Ax_1)rrpk_3.id_import.id_class[id_break[28]]).id_class((Integer)this.id_class[id_break[29]]);
                Integer n7 = id_private[5];
                this.id_class[rrpk_3.id_break[30]] = n7;
                Integer n8 = id_protected[15];
                this.id_class[rrpk_3.id_break[31]] = n8;
            }
        }
    }

    private static void id_break() {
        long[] lArray = new long[2];
        lArray[0] = 300L;
        id_byte = lArray;
    }

    private rrpW_2 id_break(int n) {
        if (n == id_private[7]) {
            return (rrpW_2)((Object)rrpW_2.staticFields1ac742ac88213c01994e700cd2890005[id_break[35]]);
        }
        if (((cb_3)rrpk_3.id_import.id_class[id_break[36]]).sK().id_class(rdy_3.XY)) {
            return (rrpW_2)((Object)rrpW_2.staticFields1ac742ac88213c01994e700cd2890005[id_break[37]]);
        }
        if (!this.id_native()) {
            return (rrpW_2)((Object)rrpW_2.staticFields1ac742ac88213c01994e700cd2890005[id_break[38]]);
        }
        return (rrpW_2)((Object)rrpW_2.staticFields1ac742ac88213c01994e700cd2890005[id_break[39]]);
    }

    @Override
    public rrIF id_throws() {
        this.id_case();
        return (rrIF)this.id_class[id_break[52]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrpk_3.id_private();
        rrpk_3.id_implements();
        rrpk_3.id_break();
        rrpk_3.id_finally();
        rrpk_3.id_extends();
        rrpk_3.id_package();
    }

    private static void id_finally() {
        short[] sArray = new short[57];
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
        sArray[51] = 2;
        sArray[52] = 1;
        sArray[53] = 57;
        sArray[54] = 57;
        sArray[55] = 57;
        sArray[56] = 1;
        id_break = sArray;
    }

    private static void id_extends() {
        id_case = new float[]{20.0f, 10.0f};
    }

    private void id_case() {
        if (this.id_class == null) {
            this.id_class = new Object[8];
            this.id_class[4] = false;
            this.id_class[5] = 0L;
            this.id_class[6] = 0;
            this.id_class[7] = 0;
        }
    }

    private static void id_implements() {
        id_catch = new String[]{new String("\u0420\u044f\u0434\u043e\u043c \u0438\u0433\u0440\u043e\u043a"), new String("\u0410\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u044f"), new String("\u042f\u0432\u043d\u0430\u044f \u043f\u044b\u043b\u044c"), new String("\u041f\u0440\u043e\u0432\u0435\u0440\u043a\u0438"), new String("\u044f\u0432\u043d\u043e\u0439 \u043f\u044b\u043b\u0438"), new String("\u041d\u0435\u0442 \u0438\u0433\u0440\u043e\u043a\u043e\u0432 \u043f\u043e\u0431\u043b\u0438\u0437\u043e\u0441\u0442\u0438"), new String("[\u2605] \u042f\u0432\u043d\u0430\u044f \u043f\u044b\u043b\u044c"), new String("sheerdust"), new String("spooky-item")};
    }

    private static void id_package() {
        id_private = new byte[]{-1, 2, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 8, 4, 5, 6, 7};
    }

    @Override
    public Predicate<rdn_3> id_protected() {
        return rdn_32 -> {
            if (rdn_32.id_break() != rdy_3.XY) {
                return id_protected[22];
            }
            if (rdn_32.id_continue().id_byte().equalsIgnoreCase(id_catch[6])) {
                return id_protected[23];
            }
            if (rdn_32.id_protected(id_catch[7]) || rdn_32.id_protected(id_catch[8])) {
                return id_protected[24];
            }
            return id_protected[25];
        };
    }

    private static void id_private() {
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
        id_protected = blArray;
    }

    private int id_final() {
        Predicate<rdn_3> predicate = this.id_protected();
        if (predicate == null) {
            return id_private[14];
        }
        if (predicate.test(((cb_3)rrpk_3.id_import.id_class[id_break[53]]).ss())) {
            return id_private[15];
        }
        if (predicate.test(((cb_3)rrpk_3.id_import.id_class[id_break[54]]).Sn())) {
            return id_private[16];
        }
        for (int i = id_protected[21]; i < id_private[17]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrpk_3.id_import.id_class[rrpk_3.id_break[55]]).id_implements[id_break[56]]).id_extends(i);
            if (!predicate.test(rdn_32)) continue;
            return i;
        }
        return id_private[18];
    }

    private boolean id_native() {
        this.id_case();
        if (!((rrIk_1)this.id_class[id_break[40]]).id_class().booleanValue()) {
            return id_protected[18];
        }
        for (Int2ObjectMap.Entry entry : ((gm_3)rrpk_3.id_import.id_class[id_break[41]]).id_return().int2ObjectEntrySet()) {
            an_3 an_32 = (an_3)entry.getValue();
            if (an_32 == this.O() || !rrff_3.id_class(an_32, (CheckGroup)this.id_class[id_break[42]]) || !(((cb_3)rrpk_3.id_import.id_class[id_break[43]]).id_implements(an_32) <= id_case[1])) continue;
            return id_protected[19];
        }
        return id_protected[20];
    }

    @Override
    public boolean aK_() {
        this.id_case();
        Boolean bl = id_protected[16];
        this.id_class[rrpk_3.id_break[32]] = bl;
        Integer n = id_private[6];
        this.id_class[rrpk_3.id_break[33]] = n;
        Integer n2 = id_protected[17];
        this.id_class[rrpk_3.id_break[34]] = n2;
        return super.aK_();
    }
}

