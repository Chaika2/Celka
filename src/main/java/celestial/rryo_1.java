/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.C_volatile;
import celestial.PX;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.util.FtHelper;
import celestial.q_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rpm_3;
import celestial.rqR_2;
import celestial.rrIF;
import celestial.rrLB;
import celestial.rrLu_1;
import celestial.rrTI;
import celestial.rrTT;
import celestial.rrTp_1;
import celestial.rrfP_2;
import celestial.rrfo_3;
import celestial.rrfu_3;
import celestial.rrfx_3;
import celestial.rrnF_2;
import celestial.rrpu_3;
import celestial.rryD;
import celestial.rryK;
import celestial.setting.GroupSetting;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryo_1
extends rrpu_3
implements rrnF_2 {
    public Object[] id_class;
    private static String[] id_break;
    private static boolean[] id_byte;
    private static byte[] id_protected;
    private static float[] id_case;
    private static short[] id_catch;
    private static long[] id_private;

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x74E2D66;
    }

    @Override
    public rdn_3 id_byte() {
        return ((rrfx_3)((Object)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[id_catch[51]])).id_break().id_class();
    }

    public rryo_1(FtHelper ftHelper) {
        super(ftHelper);
        this.id_goto();
        rrIF rrIF2 = new rrIF(id_break[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_catch[0]]);
        this.id_class[rryo_1.id_catch[1]] = rrIF2;
        rrTT rrTT2 = new rrTT(this);
        this.id_class[rryo_1.id_catch[2]] = rrTT2;
        rrfP_2 rrfP_22 = new rrfP_2();
        this.id_class[rryo_1.id_catch[3]] = rrfP_22;
        Integer n = id_protected[0];
        this.id_class[rryo_1.id_catch[4]] = n;
        Setting[] settingArray = new Setting[id_byte[0]];
        settingArray[rryo_1.id_byte[1]] = (rrIF)this.id_class[id_catch[5]];
        ftHelper.id_class(new GroupSetting(id_break[1], settingArray));
    }

    static {
        rryo_1.ntfClinit();
    }

    private static void id_this() {
        long[] lArray = new long[2];
        lArray[0] = 300L;
        id_private = lArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5DD024454CB68D9L;
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        this.id_goto();
        ((rrfP_2)this.id_class[id_catch[8]]).id_class(rrLu_12);
    }

    private int id_class(int n) {
        this.id_goto();
        if (n == id_protected[7]) {
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            return n;
        }
        if (n == id_protected[8]) {
            rrfo_3.id_class(rpm_3.OFF_HAND);
            return n;
        }
        if (n >= 0 && n < id_protected[9]) {
            rrfo_3.id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            rrfo_3.id_class(((rhz_3)((cb_3)rryo_1.id_import.id_class[rryo_1.id_catch[44]]).id_implements[rryo_1.id_catch[45]]).id_protected);
            return n;
        }
        if (n >= id_protected[10] && n <= id_protected[11]) {
            ((rrfP_2)this.id_class[id_catch[46]]).id_class(((rhz_3)((cb_3)rryo_1.id_import.id_class[rryo_1.id_catch[47]]).id_implements[rryo_1.id_catch[48]]).id_protected);
            ((Ax_1)rryo_1.id_import.id_class[id_catch[49]]).id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            Long l = rqR_2.id_break();
            this.id_class[rryo_1.id_catch[50]] = l;
            return n;
        }
        return id_protected[12];
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        this.id_goto();
        if (rrLB2.id_break() == ((rrIF)this.id_class[id_catch[6]]).id_finally().id_byte()) {
            Boolean bl = id_byte[2];
            this.id_class[rryo_1.id_catch[7]] = bl;
        }
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        block12: {
            block13: {
                int n;
                int n2;
                int n3;
                block14: {
                    this.id_goto();
                    if (q_12.id_class() != (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[9]])) break block12;
                    ((rrfP_2)this.id_class[id_catch[10]]).id_class(rqR_2.id_break() - (Long)this.id_class[id_catch[11]] > id_private[0] ? id_byte[3] : id_byte[4]);
                    if (!((Boolean)this.id_class[id_catch[12]]).booleanValue()) break block13;
                    FtHelper ftHelper = (FtHelper)this.id_continue();
                    n3 = this.id_else();
                    n2 = this.id_package();
                    rryD rryD2 = this.id_break(n3);
                    switch (((int[])rryK.id_class[id_catch[13]])[rryD2.ordinal()]) {
                        case 1: {
                            int n4 = ((cb_3)rryo_1.id_import.id_class[id_catch[14]]).sK().id_protected(rdy_3.Jd);
                            float f = (float)n4 / id_case[0];
                            rrfu_3.id_class(ftHelper, id_break[2], f);
                            Boolean bl = id_byte[5];
                            this.id_class[rryo_1.id_catch[15]] = bl;
                            return;
                        }
                        case 2: {
                            Boolean bl = id_byte[6];
                            this.id_class[rryo_1.id_catch[16]] = bl;
                            return;
                        }
                    }
                    if (rryD2 != (rryD)((Object)rryD.staticFields24c72777b502351fbafe71530c75a9f7[id_catch[17]])) break block13;
                    if (n2 > 0) {
                        ((rrTT)this.id_class[id_catch[18]]).id_class(() -> new PX(((Float)((cb_3)rryo_1.id_import.id_class[rryo_1.id_catch[60]]).id_break[id_catch[61]]).floatValue(), ((Float)((cb_3)rryo_1.id_import.id_class[rryo_1.id_catch[62]]).id_break[id_catch[63]]).floatValue()), (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_catch[19]]));
                    }
                    if (n2 == 0) break block14;
                    rryo_1 rryo_12 = this;
                    int n5 = (Integer)rryo_12.id_class[id_catch[20]] + id_byte[7];
                    Integer n6 = n5;
                    rryo_12.id_class[rryo_1.id_catch[21]] = n6;
                    if (n5 < n2) break block13;
                }
                if ((n = this.id_class(n3)) > id_protected[1]) {
                    Integer n7 = n;
                    this.id_class[rryo_1.id_catch[22]] = n7;
                    Integer n8 = id_byte[8];
                    this.id_class[rryo_1.id_catch[23]] = n8;
                }
                if (n2 != 0) {
                    ((rrTT)this.id_class[id_catch[24]]).id_final();
                    ((rrTT)this.id_class[id_catch[25]]).id_finally();
                }
                Integer n9 = id_byte[9];
                this.id_class[rryo_1.id_catch[26]] = n9;
                Boolean bl = id_byte[10];
                this.id_class[rryo_1.id_catch[27]] = bl;
            }
            if ((Integer)this.id_class[id_catch[28]] != id_protected[2]) {
                byte by = ((cb_3)rryo_1.id_import.id_class[id_catch[29]]).sV() || ((cb_3)rryo_1.id_import.id_class[id_catch[30]]).sZ() ? id_byte[11] : id_protected[3];
                rryo_1 rryo_13 = this;
                int n = (Integer)rryo_13.id_class[id_catch[31]] + id_byte[12];
                Integer n10 = n;
                rryo_13.id_class[rryo_1.id_catch[32]] = n10;
                if (n > by) {
                    ((Ax_1)rryo_1.id_import.id_class[id_catch[33]]).id_class((Integer)this.id_class[id_catch[34]]);
                    Integer n11 = id_protected[4];
                    this.id_class[rryo_1.id_catch[35]] = n11;
                    Integer n12 = id_byte[13];
                    this.id_class[rryo_1.id_catch[36]] = n12;
                }
            }
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{67, 12, -11, -70, 85, 114, 32, -127}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private rryD id_break(int n) {
        if (n == id_protected[6]) {
            return (rryD)((Object)rryD.staticFields24c72777b502351fbafe71530c75a9f7[id_catch[40]]);
        }
        if (((cb_3)rryo_1.id_import.id_class[id_catch[41]]).sK().id_class(rdy_3.hU)) {
            return (rryD)((Object)rryD.staticFields24c72777b502351fbafe71530c75a9f7[id_catch[42]]);
        }
        return (rryD)((Object)rryD.staticFields24c72777b502351fbafe71530c75a9f7[id_catch[43]]);
    }

    @Override
    public float id_break() {
        return id_case[1];
    }

    @Override
    public rrIF id_throws() {
        this.id_goto();
        return (rrIF)this.id_class[id_catch[52]];
    }

    private static /* synthetic */ void ntfClinit() {
        rryo_1.id_public();
        rryo_1.id_synchronized();
        rryo_1.id_this();
        rryo_1.id_return();
        rryo_1.id_final();
        rryo_1.id_new();
    }

    @Override
    public rrTp_1 id_catch() {
        return (rrTp_1)((Object)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_catch[59]]);
    }

    private void id_goto() {
        if (this.id_class == null) {
            this.id_class = new Object[8];
            this.id_class[3] = false;
            this.id_class[4] = 0L;
            this.id_class[5] = 0;
            this.id_class[6] = 0;
            this.id_class[7] = 0;
        }
    }

    private int id_else() {
        Predicate<rdn_3> predicate = this.id_protected();
        if (predicate == null) {
            return id_protected[13];
        }
        if (predicate.test(((cb_3)rryo_1.id_import.id_class[id_catch[53]]).ss())) {
            return id_protected[14];
        }
        if (predicate.test(((cb_3)rryo_1.id_import.id_class[id_catch[54]]).Sn())) {
            return id_protected[15];
        }
        for (int i = id_byte[16]; i < id_protected[16]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rryo_1.id_import.id_class[rryo_1.id_catch[55]]).id_implements[id_catch[56]]).id_extends(i);
            if (!predicate.test(rdn_32)) continue;
            return i;
        }
        return id_protected[17];
    }

    private static void id_new() {
        id_protected = new byte[]{-1, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 2, 8, 3, 4, 5, 6, 7};
    }

    private int id_package() {
        if ((C_volatile)rrTT.id_break[id_catch[57]] instanceof rrTT && ((C_volatile)rrTT.id_break[id_catch[58]]).id_byte() != null) {
            return id_protected[18];
        }
        return id_byte[17];
    }

    private static void id_return() {
        short[] sArray = new short[64];
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 6;
        sArray[7] = 3;
        sArray[8] = 2;
        sArray[10] = 2;
        sArray[11] = 4;
        sArray[12] = 3;
        sArray[14] = 57;
        sArray[15] = 3;
        sArray[16] = 3;
        sArray[18] = 1;
        sArray[20] = 5;
        sArray[21] = 5;
        sArray[22] = 6;
        sArray[23] = 7;
        sArray[24] = 1;
        sArray[25] = 1;
        sArray[26] = 5;
        sArray[27] = 3;
        sArray[28] = 6;
        sArray[29] = 57;
        sArray[30] = 57;
        sArray[31] = 7;
        sArray[32] = 7;
        sArray[33] = 55;
        sArray[34] = 6;
        sArray[35] = 6;
        sArray[36] = 7;
        sArray[37] = 3;
        sArray[38] = 6;
        sArray[39] = 7;
        sArray[40] = 1;
        sArray[41] = 57;
        sArray[42] = 2;
        sArray[44] = 57;
        sArray[45] = 1;
        sArray[46] = 2;
        sArray[47] = 57;
        sArray[48] = 1;
        sArray[49] = 55;
        sArray[50] = 4;
        sArray[51] = 3;
        sArray[53] = 57;
        sArray[54] = 57;
        sArray[55] = 57;
        sArray[56] = 1;
        sArray[57] = 3;
        sArray[58] = 3;
        sArray[59] = 3;
        sArray[60] = 57;
        sArray[61] = 45;
        sArray[62] = 57;
        sArray[63] = 46;
        id_catch = sArray;
    }

    private static void id_public() {
        boolean[] blArray = new boolean[26];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[7] = true;
        blArray[12] = true;
        blArray[19] = true;
        blArray[20] = true;
        id_byte = blArray;
    }

    @Override
    public Predicate<rdn_3> id_protected() {
        return rdn_32 -> {
            if (rdn_32.id_break() != rdy_3.hU) {
                return id_byte[18];
            }
            if (rdn_32.id_continue().id_byte().equalsIgnoreCase(id_break[3])) {
                return id_byte[19];
            }
            if (rdn_32.id_protected(id_break[4]) || rdn_32.id_protected(id_break[5])) {
                return id_byte[20];
            }
            return id_byte[21];
        };
    }

    @Override
    public float id_private() {
        return id_case[2];
    }

    private static void id_final() {
        id_case = new float[]{20.0f, -1.0f, -1.0f};
    }

    private static void id_synchronized() {
        id_break = new String[]{new String("\u0410\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u044f"), new String("\u0421\u043d\u0435\u0436\u043e\u043a \u0437\u0430\u043c\u043e\u0440\u043e\u0437\u043a\u0430"), new String("\u0441\u043d\u0435\u0436\u043a\u0430 \u0437\u0430\u043c\u043e\u0440\u043e\u0437\u043a\u0438"), new String("[\u2605] \u0421\u043d\u0435\u0436\u043e\u043a \u0437\u0430\u043c\u043e\u0440\u043e\u0437\u043a\u0430"), new String("freezeball"), new String("spooky-item")};
    }

    @Override
    public boolean aK_() {
        this.id_goto();
        Boolean bl = id_byte[14];
        this.id_class[rryo_1.id_catch[37]] = bl;
        Integer n = id_protected[5];
        this.id_class[rryo_1.id_catch[38]] = n;
        Integer n2 = id_byte[15];
        this.id_class[rryo_1.id_catch[39]] = n2;
        return super.aK_();
    }
}

