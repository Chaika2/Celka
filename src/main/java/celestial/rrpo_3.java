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
import celestial.module.util.HwHelper;
import celestial.q_1;
import celestial.rJr_1;
import celestial.rXa_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rpm_3;
import celestial.rrIF;
import celestial.rrLB;
import celestial.rrLY;
import celestial.rrQX;
import celestial.rrTI;
import celestial.rrTT;
import celestial.rrTp_1;
import celestial.rrfo_3;
import celestial.rrfu_3;
import celestial.rrjk_3;
import celestial.rrnF_2;
import celestial.rrpD_2;
import celestial.rrpK_2;
import celestial.rrpi_3;
import celestial.setting.GroupSetting;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpo_3
extends rrpi_3
implements rrnF_2 {
    private static boolean[] id_byte;
    private static float[] id_protected;
    private static byte[] id_case;
    public Object[] id_class;
    public static Object[] id_break;
    private static String[] id_catch;
    private static short[] id_private;

    private int id_byte(int n) {
        if (n == id_case[5]) {
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            return n;
        }
        if (n == id_case[6]) {
            rrfo_3.id_class(rpm_3.OFF_HAND);
            return n;
        }
        if (n >= 0 && n < id_case[7]) {
            rrfo_3.id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            rrfo_3.id_class(((rhz_3)((cb_3)rrpo_3.id_import.id_class[rrpo_3.id_private[36]]).id_implements[rrpo_3.id_private[37]]).id_protected);
            return n;
        }
        if (n >= id_case[8] && n <= id_case[9]) {
            ((Ax_1)rrpo_3.id_import.id_class[id_private[38]]).id_class(((rJr_1)((cb_3)rrpo_3.id_import.id_class[rrpo_3.id_private[39]]).id_implements[rrpo_3.id_private[40]]).id_case, n, ((rhz_3)((cb_3)rrpo_3.id_import.id_class[rrpo_3.id_private[41]]).id_implements[rrpo_3.id_private[42]]).id_protected, rXa_1.SWAP);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[43]]).id_finally().id_class(rrLY.id_class());
            return n;
        }
        return id_case[10];
    }

    @Override
    public rdn_3 id_byte() {
        return (rdn_3)id_break[id_private[44]];
    }

    private void id_int() {
        this.id_goto();
        Boolean bl = id_byte[4];
        this.id_class[rrpo_3.id_private[29]] = bl;
        Integer n = id_byte[5];
        this.id_class[rrpo_3.id_private[30]] = n;
        Integer n2 = id_case[3];
        this.id_class[rrpo_3.id_private[31]] = n2;
    }

    public rrpo_3(HwHelper hwHelper) {
        super(hwHelper);
        this.id_goto();
        rrIF rrIF2 = new rrIF(id_catch[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_private[0]]);
        this.id_class[rrpo_3.id_private[1]] = rrIF2;
        rrTT rrTT2 = new rrTT(this);
        this.id_class[rrpo_3.id_private[2]] = rrTT2;
        Integer n = id_case[0];
        this.id_class[rrpo_3.id_private[3]] = n;
        Setting[] settingArray = new Setting[id_byte[0]];
        settingArray[rrpo_3.id_byte[1]] = (rrIF)this.id_class[id_private[4]];
        hwHelper.id_class(new GroupSetting(id_catch[1], settingArray));
    }

    static {
        rrpo_3.ntfClinit();
    }

    private static void id_this() {
        id_case = new byte[]{-1, -1, 8, -1, -1, -2, -3, 9, 9, 36, -1, 2, -1, -2, -3, 45, -1, 5, 2, 3, 4};
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        this.id_goto();
        if (rrLB2.id_break() == ((rrIF)this.id_class[id_private[5]]).id_finally().id_byte()) {
            Boolean bl = id_byte[2];
            this.id_class[rrpo_3.id_private[6]] = bl;
        }
    }

    private rrpD_2 id_class(int n) {
        if (n == id_case[4]) {
            return (rrpD_2)((Object)rrpD_2.staticFieldsb8f0ef75cc3a3659b008178ccc081710[id_private[32]]);
        }
        if (((cb_3)rrpo_3.id_import.id_class[id_private[33]]).sK().id_class(rdy_3.hU)) {
            return (rrpD_2)((Object)rrpD_2.staticFieldsb8f0ef75cc3a3659b008178ccc081710[id_private[34]]);
        }
        return (rrpD_2)((Object)rrpD_2.staticFieldsb8f0ef75cc3a3659b008178ccc081710[id_private[35]]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-92, -99, -35, 12, -51, -28, -125, -73}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE454E6B23AD637C3L;
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        block13: {
            int n;
            int n2;
            block14: {
                this.id_goto();
                if (q_12.id_class() != (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[7]]) || !((Boolean)this.id_class[id_private[8]]).booleanValue()) break block13;
                HwHelper hwHelper = (HwHelper)this.id_continue();
                n2 = this.id_while();
                n = this.id_public();
                rrpD_2 rrpD_22 = this.id_class(n2);
                switch (((int[])rrpK_2.id_class[id_private[9]])[rrpD_22.ordinal()]) {
                    case 1: {
                        int n3 = ((cb_3)rrpo_3.id_import.id_class[id_private[10]]).sK().id_protected(rdy_3.hU);
                        float f = (float)n3 / id_protected[0];
                        rrfu_3.id_class(hwHelper, id_catch[2], f);
                        this.id_int();
                        return;
                    }
                    case 2: {
                        this.id_int();
                        return;
                    }
                }
                if (rrpD_22 != (rrpD_2)((Object)rrpD_2.staticFieldsb8f0ef75cc3a3659b008178ccc081710[id_private[11]])) break block13;
                if (n > 0) {
                    ((rrTT)this.id_class[id_private[12]]).id_class(() -> new PX(((Float)((cb_3)rrpo_3.id_import.id_class[rrpo_3.id_private[53]]).id_break[id_private[54]]).floatValue(), ((Float)((cb_3)rrpo_3.id_import.id_class[rrpo_3.id_private[55]]).id_break[id_private[56]]).floatValue()), (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_private[13]]));
                }
                if (n == 0) break block14;
                rrpo_3 rrpo_32 = this;
                int n4 = (Integer)rrpo_32.id_class[id_private[14]] + id_byte[3];
                Integer n5 = n4;
                rrpo_32.id_class[rrpo_3.id_private[15]] = n5;
                if (n4 < n) break block13;
            }
            if ((Integer)this.id_class[id_private[16]] == id_case[1]) {
                Integer n6 = this.id_byte(n2);
                this.id_class[rrpo_3.id_private[17]] = n6;
            }
            if ((Integer)this.id_class[id_private[18]] > id_case[2]) {
                if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[19]]).id_private().P().id_super()) {
                    rrfo_3.id_class(rpm_3.MAIN_HAND);
                    ((Ax_1)rrpo_3.id_import.id_class[id_private[20]]).id_class(((rJr_1)((cb_3)rrpo_3.id_import.id_class[rrpo_3.id_private[21]]).id_implements[rrpo_3.id_private[22]]).id_case, (Integer)this.id_class[id_private[23]], ((rhz_3)((cb_3)rrpo_3.id_import.id_class[rrpo_3.id_private[24]]).id_implements[rrpo_3.id_private[25]]).id_protected, rXa_1.SWAP);
                    ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[26]]).id_finally().id_class(rrLY.id_class());
                    this.id_int();
                }
            } else {
                this.id_int();
            }
            if (n != 0) {
                ((rrTT)this.id_class[id_private[27]]).id_final();
                ((rrTT)this.id_class[id_private[28]]).id_finally();
            }
        }
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE979BB1F;
    }

    @Override
    public float id_break() {
        return id_protected[1];
    }

    @Override
    public rrIF id_throws() {
        this.id_goto();
        return (rrIF)this.id_class[id_private[45]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrpo_3.id_new();
        rrpo_3.id_final();
        rrpo_3.id_else();
        rrpo_3.id_synchronized();
        rrpo_3.id_this();
        rrpo_3.id_return();
    }

    @Override
    public rrTp_1 id_catch() {
        return (rrTp_1)((Object)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_private[52]]);
    }

    private void id_goto() {
        if (this.id_class == null) {
            this.id_class = new Object[5];
            this.id_class[2] = false;
            this.id_class[3] = 0;
            this.id_class[4] = 0;
        }
    }

    private static void id_else() {
        short[] sArray = new short[57];
        sArray[2] = 1;
        sArray[3] = 3;
        sArray[6] = 2;
        sArray[8] = 2;
        sArray[10] = 57;
        sArray[12] = 1;
        sArray[14] = 4;
        sArray[15] = 4;
        sArray[16] = 3;
        sArray[17] = 3;
        sArray[18] = 3;
        sArray[20] = 55;
        sArray[21] = 57;
        sArray[22] = 4;
        sArray[23] = 3;
        sArray[24] = 57;
        sArray[25] = 1;
        sArray[27] = 1;
        sArray[28] = 1;
        sArray[29] = 2;
        sArray[30] = 4;
        sArray[31] = 3;
        sArray[32] = 1;
        sArray[33] = 57;
        sArray[34] = 2;
        sArray[36] = 57;
        sArray[37] = 1;
        sArray[38] = 55;
        sArray[39] = 57;
        sArray[40] = 4;
        sArray[41] = 57;
        sArray[42] = 1;
        sArray[46] = 3;
        sArray[47] = 3;
        sArray[48] = 57;
        sArray[49] = 57;
        sArray[50] = 57;
        sArray[51] = 1;
        sArray[52] = 3;
        sArray[53] = 57;
        sArray[54] = 45;
        sArray[55] = 57;
        sArray[56] = 46;
        id_private = sArray;
    }

    private static void id_new() {
        boolean[] blArray = new boolean[14];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[8] = true;
        blArray[13] = true;
        id_byte = blArray;
    }

    private static void id_return() {
        Object[] objectArray = new Object[]{new rdn_3(rdy_3.hU, 1)};
        id_break = objectArray;
    }

    private int id_while() {
        Predicate<rdn_3> predicate = this.id_protected();
        if (predicate == null) {
            return id_case[12];
        }
        if (predicate.test(((cb_3)rrpo_3.id_import.id_class[id_private[48]]).ss())) {
            return id_case[13];
        }
        if (predicate.test(((cb_3)rrpo_3.id_import.id_class[id_private[49]]).Sn())) {
            return id_case[14];
        }
        for (int i = id_byte[7]; i < id_case[15]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrpo_3.id_import.id_class[rrpo_3.id_private[50]]).id_implements[id_private[51]]).id_extends(i);
            if (!predicate.test(rdn_32)) continue;
            return i;
        }
        return id_case[16];
    }

    private int id_public() {
        if ((C_volatile)rrTT.id_break[id_private[46]] instanceof rrTT && ((C_volatile)rrTT.id_break[id_private[47]]).id_byte() != null) {
            return id_case[11];
        }
        return id_byte[6];
    }

    @Override
    public Predicate<rdn_3> id_protected() {
        return rdn_32 -> rrjk_3.id_case(rdn_32);
    }

    @Override
    public float id_private() {
        return id_protected[2];
    }

    private static void id_final() {
        id_catch = new String[]{new String("\u0410\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u044f"), new String("\u041a\u043e\u043c \u0441\u043d\u0435\u0433\u0430"), new String("\u043a\u043e\u043c\u0430 \u0441\u043d\u0435\u0433\u0430")};
    }

    private static void id_synchronized() {
        id_protected = new float[]{20.0f, -1.0f, -1.0f};
    }

    @Override
    public boolean aK_() {
        this.id_int();
        return super.aK_();
    }
}

