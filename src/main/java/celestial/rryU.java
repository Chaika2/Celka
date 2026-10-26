/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.util.FtHelper;
import celestial.q_1;
import celestial.rLD;
import celestial.rLR;
import celestial.rLY;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rpm_3;
import celestial.rqR_2;
import celestial.rrIF;
import celestial.rrIk_1;
import celestial.rrLB;
import celestial.rrLu_1;
import celestial.rrfP_2;
import celestial.rrfo_3;
import celestial.rrfu_3;
import celestial.rrfx_3;
import celestial.rrpu_3;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.rrye_1;
import celestial.setting.GroupSetting;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryU
extends rrpu_3 {
    private static byte[] id_byte;
    private static boolean[] id_protected;
    private static short[] id_case;
    private static float[] id_catch;
    private static String[] id_private;
    public static Object[] id_class;
    public Object[] id_break;
    private static long[] id_implements;

    private int id_byte(int n) {
        this.id_implements();
        if (n == id_byte[6]) {
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            return n;
        }
        if (n == id_byte[7]) {
            rrfo_3.id_class(rpm_3.OFF_HAND);
            return n;
        }
        if (n >= 0 && n < id_byte[8]) {
            rrfo_3.id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            rrfo_3.id_class(((rhz_3)((cb_3)rryU.id_import.id_class[rryU.id_case[33]]).id_implements[rryU.id_case[34]]).id_protected);
            return n;
        }
        if (n >= id_byte[9] && n <= id_byte[10]) {
            ((rrfP_2)this.id_break[id_case[35]]).id_class(((rhz_3)((cb_3)rryU.id_import.id_class[rryU.id_case[36]]).id_implements[rryU.id_case[37]]).id_protected);
            ((Ax_1)rryU.id_import.id_class[id_case[38]]).id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            Long l = rqR_2.id_break();
            this.id_break[rryU.id_case[39]] = l;
            return n;
        }
        return id_byte[11];
    }

    @Override
    public rdn_3 id_byte() {
        return ((rrfx_3)((Object)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[id_case[40]])).id_break().id_class();
    }

    private static void id_int() {
        boolean[] blArray = new boolean[30];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[9] = true;
        blArray[13] = true;
        blArray[17] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[22] = true;
        blArray[23] = true;
        blArray[29] = true;
        id_protected = blArray;
    }

    public rryU(FtHelper ftHelper) {
        super(ftHelper);
        this.id_implements();
        rrIF rrIF2 = new rrIF(id_private[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_case[0]]);
        this.id_break[rryU.id_case[1]] = rrIF2;
        rrIk_1 rrIk_12 = new rrIk_1(id_private[1], id_protected[0]);
        this.id_break[rryU.id_case[2]] = rrIk_12;
        rrfP_2 rrfP_22 = new rrfP_2();
        this.id_break[rryU.id_case[3]] = rrfP_22;
        Integer n = id_byte[0];
        this.id_break[rryU.id_case[4]] = n;
        Setting[] settingArray = new Setting[id_byte[1]];
        settingArray[rryU.id_protected[1]] = (rrIF)this.id_break[id_case[5]];
        settingArray[rryU.id_protected[2]] = (rrIk_1)this.id_break[id_case[6]];
        ftHelper.id_class(new GroupSetting(id_private[2], settingArray));
    }

    static {
        rryU.ntfClinit();
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        this.id_implements();
        if (rrLB2.id_break() == ((rrIF)this.id_break[id_case[7]]).id_finally().id_byte()) {
            Boolean bl = id_protected[3];
            this.id_break[rryU.id_case[8]] = bl;
        }
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        this.id_implements();
        ((rrfP_2)this.id_break[id_case[9]]).id_class(rrLu_12);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-124, -116, -27, 101, -117, 20, -9, -77}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xECD6C24A4E58251L;
    }

    private rrye_1 id_class(int n) {
        this.id_implements();
        if (n == id_byte[17]) {
            return (rrye_1)((Object)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[id_case[46]]);
        }
        if (((cb_3)rryU.id_import.id_class[id_case[47]]).sK().id_class(rdy_3.ko)) {
            return (rrye_1)((Object)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[id_case[48]]);
        }
        if (((rrIk_1)this.id_break[id_case[49]]).id_class().booleanValue() && !this.id_case() && this.id_final()) {
            return (rrye_1)((Object)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[id_case[50]]);
        }
        return (rrye_1)((Object)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[id_case[51]]);
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_implements();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[10]])) {
            ((rrfP_2)this.id_break[id_case[11]]).id_class(rqR_2.id_break() - (Long)this.id_break[id_case[12]] > id_implements[0] ? id_protected[4] : id_protected[5]);
            if (((Boolean)this.id_break[id_case[13]]).booleanValue()) {
                int n;
                FtHelper ftHelper = (FtHelper)this.id_continue();
                int n2 = this.id_break();
                rrye_1 rrye_12 = this.id_class(n2);
                if (rrye_12 == (rrye_1)((Object)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[id_case[14]])) {
                    int n3 = ((cb_3)rryU.id_import.id_class[id_case[15]]).sK().id_protected(rdy_3.ko);
                    float f = (float)n3 / id_catch[0];
                    rrfu_3.id_class(ftHelper, id_private[3], f);
                } else if (rrye_12 == (rrye_1)((Object)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[id_case[16]])) {
                    String string = rrfu_3.id_class(ftHelper);
                    String string2 = id_private[4];
                    rrfu_3.id_byte(string + string2);
                    ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_case[17]]).id_class(new rrtx_3(ftHelper.id_final(), string2, (int)id_case[18]));
                } else if (rrye_12 == (rrye_1)((Object)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[id_case[19]]) && (n = this.id_byte(n2)) > id_byte[2]) {
                    Integer n4 = n;
                    this.id_break[rryU.id_case[20]] = n4;
                    Integer n5 = id_protected[6];
                    this.id_break[rryU.id_case[21]] = n5;
                }
                Boolean bl = id_protected[7];
                this.id_break[rryU.id_case[22]] = bl;
            }
            if ((Integer)this.id_break[id_case[23]] != id_byte[3]) {
                byte by = ((cb_3)rryU.id_import.id_class[id_case[24]]).sV() || ((cb_3)rryU.id_import.id_class[id_case[25]]).sZ() ? id_protected[8] : id_byte[4];
                rryU rryU2 = this;
                int n = (Integer)rryU2.id_break[id_case[26]] + id_protected[9];
                Integer n6 = n;
                rryU2.id_break[rryU.id_case[27]] = n6;
                if (n > by) {
                    ((Ax_1)rryU.id_import.id_class[id_case[28]]).id_class((Integer)this.id_break[id_case[29]]);
                    Integer n7 = id_byte[5];
                    this.id_break[rryU.id_case[30]] = n7;
                    Integer n8 = id_protected[10];
                    this.id_break[rryU.id_case[31]] = n8;
                }
            }
        }
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2308C7A5;
    }

    public int id_break() {
        Predicate<rdn_3> predicate = this.id_protected();
        if (predicate == null) {
            return id_byte[12];
        }
        if (predicate.test(((cb_3)rryU.id_import.id_class[id_case[42]]).ss())) {
            return id_byte[13];
        }
        if (predicate.test(((cb_3)rryU.id_import.id_class[id_case[43]]).Sn())) {
            return id_byte[14];
        }
        for (int i = id_protected[12]; i < id_byte[15]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rryU.id_import.id_class[rryU.id_case[44]]).id_implements[id_case[45]]).id_extends(i);
            if (!predicate.test(rdn_32)) continue;
            return i;
        }
        return id_byte[16];
    }

    @Override
    public rrIF id_throws() {
        this.id_implements();
        return (rrIF)this.id_break[id_case[41]];
    }

    private static /* synthetic */ void ntfClinit() {
        rryU.id_int();
        rryU.id_package();
        rryU.id_new();
        rryU.id_private();
        rryU.id_finally();
        rryU.id_native();
        rryU.id_extends();
    }

    private static void id_finally() {
        id_catch = new float[]{20.0f};
    }

    private static void id_extends() {
        Object[] objectArray = new Object[]{List.of((Object)rLD.id_protected, (Object)rLD.id_private, (Object)rLD.id_break, (Object)rLD.id_continue, (Object)rLD.id_package, (Object)rLD.id_goto, (Object)rLD.id_instanceof)};
        id_class = objectArray;
    }

    private boolean id_case() {
        for (rLY rLY2 : ((cb_3)rryU.id_import.id_class[id_case[52]]).So()) {
            if (!((List)id_class[id_case[53]]).contains(rLY2.id_class())) continue;
            return id_protected[13];
        }
        return id_protected[14];
    }

    private void id_implements() {
        if (this.id_break == null) {
            this.id_break = new Object[7];
            this.id_break[3] = false;
            this.id_break[4] = 0L;
            this.id_break[5] = 0;
            this.id_break[6] = 0;
        }
    }

    private static void id_new() {
        long[] lArray = new long[2];
        lArray[0] = 300L;
        id_implements = lArray;
    }

    private static void id_package() {
        id_private = new String[]{new String("\u0410\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u044f"), new String("\u0422\u043e\u043b\u044c\u043a\u043e \u0435\u0441\u043b\u0438 \u0435\u0441\u0442\u044c \u043f\u043b\u043e\u0445\u0438\u0435\n\u044d\u0444\u0444\u0435\u043a\u0442\u044b"), new String("\u0411\u043e\u0436\u044c\u044f \u0430\u0443\u0440\u0430"), new String("\u0431\u043e\u0436\u044c\u0435\u0439 \u0430\u0443\u0440\u044b"), new String("\u041d\u0435\u0442 \u043f\u043b\u043e\u0445\u0438\u0445 \u044d\u0444\u0444\u0435\u043a\u0442\u043e\u0432, \u0431\u043e\u0436\u044c\u044f \u0430\u0443\u0440\u0430 \u043d\u0435 \u0431\u0443\u0434\u0435\u0442 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0430"), new String("[\u2605] \u0411\u043e\u0436\u044c\u044f \u0430\u0443\u0440\u0430"), new String("godsaura"), new String("spooky-item")};
    }

    @Override
    public Predicate<rdn_3> id_protected() {
        return rdn_32 -> {
            if (rdn_32.id_break() != rdy_3.ko) {
                return id_protected[21];
            }
            String string = rdn_32.id_continue().id_byte();
            if (string.equalsIgnoreCase(id_private[5])) {
                return id_protected[22];
            }
            if (rdn_32.id_protected(id_private[6]) || rdn_32.id_protected(id_private[7])) {
                return id_protected[23];
            }
            return id_protected[24];
        };
    }

    private static void id_private() {
        short[] sArray = new short[55];
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 5;
        sArray[6] = 1;
        sArray[8] = 3;
        sArray[9] = 2;
        sArray[11] = 2;
        sArray[12] = 4;
        sArray[13] = 3;
        sArray[14] = 2;
        sArray[15] = 57;
        sArray[16] = 3;
        sArray[18] = 2000;
        sArray[20] = 5;
        sArray[21] = 6;
        sArray[22] = 3;
        sArray[23] = 5;
        sArray[24] = 57;
        sArray[25] = 57;
        sArray[26] = 6;
        sArray[27] = 6;
        sArray[28] = 55;
        sArray[29] = 5;
        sArray[30] = 5;
        sArray[31] = 6;
        sArray[32] = 3;
        sArray[33] = 57;
        sArray[34] = 1;
        sArray[35] = 2;
        sArray[36] = 57;
        sArray[37] = 1;
        sArray[38] = 55;
        sArray[39] = 4;
        sArray[40] = 6;
        sArray[42] = 57;
        sArray[43] = 57;
        sArray[44] = 57;
        sArray[45] = 1;
        sArray[46] = 1;
        sArray[47] = 57;
        sArray[48] = 2;
        sArray[49] = 1;
        sArray[50] = 3;
        sArray[52] = 57;
        sArray[54] = 57;
        id_case = sArray;
    }

    private boolean id_final() {
        boolean bl = id_protected[15];
        boolean bl2 = id_protected[16];
        for (rLY rLY2 : ((cb_3)rryU.id_import.id_class[id_case[54]]).So()) {
            rLR rLR2 = rLY2.id_class();
            if (rLR2 == rLD.id_throws) {
                bl = id_protected[17];
            } else if (rLR2 == rLD.id_class) {
                bl2 = id_protected[18];
            }
            if (!bl || !bl2) continue;
            return id_protected[19];
        }
        return id_protected[20];
    }

    private static void id_native() {
        id_byte = new byte[]{-1, 2, 8, -1, 2, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, -1, 7, 3, 4, 5, 6};
    }

    @Override
    public boolean aK_() {
        this.id_implements();
        Boolean bl = id_protected[11];
        this.id_break[rryU.id_case[32]] = bl;
        return super.aK_();
    }
}

