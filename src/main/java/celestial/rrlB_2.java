/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Y;
import celestial.an_3;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.iB_2;
import celestial.module.movement.Speed;
import celestial.q_1;
import celestial.rdb_3;
import celestial.rfl_3;
import celestial.rjU_2;
import celestial.rkx_3;
import celestial.rrAB;
import celestial.rrAO;
import celestial.rrAS;
import celestial.rrAd_1;
import celestial.rrAx_1;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrLx_1;
import celestial.rrQX;
import celestial.rrTF;
import celestial.rrfj_3;
import celestial.rxM_2;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlB_2
extends rrTF<Speed> {
    private static boolean[] id_break;
    private static float[] id_byte;
    private static byte[] id_protected;
    private static double[] id_case;
    public Object[] id_class;
    private static String[] id_catch;
    private static short[] id_private;

    private static void id_byte() {
        id_case = new double[]{0.2, 0.5, 0.2, 1.0, 1.0};
    }

    public rrlB_2(Speed speed) {
        super(speed);
        this.id_extends();
        Setting[] settingArray = new Setting[id_protected[0]];
        rrIk_1 rrIk_12 = (rrIk_1)new rrIk_1(id_catch[0], id_break[1]).id_class(() -> speed.id_new() == this ? id_break[31] : id_break[32]);
        this.id_class[rrlB_2.id_private[0]] = rrIk_12;
        settingArray[rrlB_2.id_break[0]] = rrIk_12;
        rrIk_1 rrIk_13 = (rrIk_1)new rrIk_1(id_catch[1], id_break[3]).id_class(() -> speed.id_new() == this ? id_break[29] : id_break[30]);
        this.id_class[rrlB_2.id_private[1]] = rrIk_13;
        settingArray[rrlB_2.id_break[2]] = rrIk_13;
        rrIk_1 rrIk_14 = (rrIk_1)new rrIk_1(id_catch[2], id_break[4]).id_class(() -> {
            this.id_extends();
            return speed.id_new() == this && ((rrIk_1)this.id_class[id_private[44]]).id_class() != false ? id_break[27] : id_break[28];
        });
        this.id_class[rrlB_2.id_private[2]] = rrIk_14;
        settingArray[rrlB_2.id_protected[1]] = rrIk_14;
        rrIm_1 rrIm_12 = (rrIm_1)new rrIm_1(id_catch[3], Float.valueOf(id_byte[0]), Float.valueOf(id_byte[1]), Float.valueOf(id_byte[2]), Float.valueOf(id_byte[3])).id_class(() -> {
            this.id_extends();
            return speed.id_new() == this && ((rrIk_1)this.id_class[id_private[42]]).id_class() != false && ((rrIk_1)this.id_class[id_private[43]]).id_class() != false ? id_break[25] : id_break[26];
        });
        this.id_class[rrlB_2.id_private[3]] = rrIm_12;
        settingArray[rrlB_2.id_protected[2]] = rrIm_12;
        rrIk_1 rrIk_15 = (rrIk_1)new rrIk_1(id_catch[4], id_break[5]).id_class(() -> speed.id_new() == this ? id_break[23] : id_break[24]);
        this.id_class[rrlB_2.id_private[4]] = rrIk_15;
        settingArray[rrlB_2.id_protected[3]] = rrIk_15;
        rrIk_1 rrIk_16 = (rrIk_1)new rrIk_1(id_catch[5], id_break[6]).id_class(() -> speed.id_new() == this ? id_break[21] : id_break[22]);
        this.id_class[rrlB_2.id_private[5]] = rrIk_16;
        settingArray[rrlB_2.id_protected[4]] = rrIk_16;
        speed.id_class(settingArray);
    }

    static {
        rrlB_2.ntfClinit();
    }

    @EventTarget
    public void id_class(rrAO rrAO2) {
        this.id_extends();
        if (!((Boolean)this.id_class[id_private[18]]).booleanValue()) {
            return;
        }
        iB_2 iB_22 = this.id_break();
        if (iB_22 != null) {
            if (((rrIk_1)this.id_class[id_private[19]]).id_class().booleanValue() && ((cb_3)rrlB_2.id_import.id_class[id_private[20]]).BL()) {
                rrAO2.id_break(id_break[9]);
            }
            if (this.id_class()) {
                rrAO2.id_class(id_case[3]);
            }
            if (((rrIk_1)this.id_class[id_private[21]]).id_class().booleanValue() && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[22]]).id_private().P().id_super()) {
                rjU_2 rjU_22 = iB_22.Ps();
                if (((rrIk_1)this.id_class[id_private[23]]).id_class().booleanValue()) {
                    float f = ((Float)((rrIm_1)this.id_class[id_private[24]]).id_byte()).floatValue();
                    rjU_22 = rjU_22.id_extends();
                    rjU_2 rjU_23 = rjU_22.id_protected(iB_22.Pt());
                    rjU_22 = rjU_22.id_throws(rjU_23.id_throws(f, id_case[4], f));
                }
                rrfj_3.id_class(rrAO2, rjU_22, ((Float)((cb_3)rrlB_2.id_import.id_class[rrlB_2.id_private[25]]).id_throws[id_private[26]]).floatValue());
            }
        }
    }

    @EventTarget
    public void id_class(rrAx_1 rrAx_12) {
        this.id_extends();
        if (((Boolean)this.id_class[id_private[31]]).booleanValue() && rrAx_12.id_class() == (rrAd_1)((Object)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[id_private[32]]) && this.id_break() != null) {
            rrAx_12.id_class(id_break[12]);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4A4A72194C9FA568L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-81, -23, 51, -28, -107, 88, 126, 47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_class() {
        this.id_extends();
        return (Boolean)this.id_class[id_private[41]];
    }

    @EventTarget
    public void id_class(rrLx_1 rrLx_12) {
        this.id_extends();
        if (((Boolean)this.id_class[id_private[27]]).booleanValue() && this.id_class() && this.id_break() != null && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[28]]).id_private().P().id_super()) {
            rrLx_12.id_break(id_break[10]);
        }
    }

    @EventTarget(id_class=200)
    public void id_class(q_1 q_12) {
        this.id_extends();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[6]])) {
            Boolean bl = this.id_case();
            this.id_class[rrlB_2.id_private[7]] = bl;
            if (!((Boolean)this.id_class[id_private[8]]).booleanValue()) {
                return;
            }
            rfl_3 rfl_32 = ((cb_3)rrlB_2.id_import.id_class[id_private[9]]).rN().id_byte(id_case[0], id_case[1], id_case[2]);
            List<an_3> list = ((gm_3)rrlB_2.id_import.id_class[id_private[10]]).id_break((an_3)((cb_3)rrlB_2.id_import.id_class[id_private[11]]), rfl_32, an_32 -> !an_32.id_native() && an_32.BM() && an_32.rY() ? id_break[19] : id_break[20]);
            if (!list.isEmpty()) {
                cb_3 cb_32 = (cb_3)rrlB_2.id_import.id_class[id_private[12]];
                Float f = Float.valueOf(((Float)cb_32.id_private[id_private[13]]).floatValue() + id_byte[4]);
                cb_32.id_private[rrlB_2.id_private[14]] = f;
                Boolean bl2 = id_break[7];
                this.id_class[rrlB_2.id_private[15]] = bl2;
            }
        } else if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[16]])) {
            Boolean bl = id_break[8];
            this.id_class[rrlB_2.id_private[17]] = bl;
        }
    }

    @EventTarget
    public void id_class(rrAS rrAS2) {
        this.id_extends();
        if (((Boolean)this.id_class[id_private[33]]).booleanValue() && this.id_break() != null) {
            rrAS2.id_class(id_break[13]);
        }
    }

    @EventTarget
    public void id_class(rrAB rrAB2) {
        this.id_extends();
        if (((Boolean)this.id_class[id_private[29]]).booleanValue() && this.id_class() && ((rrIk_1)this.id_class[id_private[30]]).id_class().booleanValue()) {
            rrAB2.id_class(id_break[11]);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFBD1718D;
    }

    public iB_2 id_break() {
        return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[40]]).id_private().E().id_continue();
    }

    private static void id_throws() {
        short[] sArray = new short[45];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 5;
        sArray[5] = 4;
        sArray[7] = 6;
        sArray[8] = 6;
        sArray[9] = 57;
        sArray[10] = 56;
        sArray[11] = 57;
        sArray[12] = 57;
        sArray[13] = 29;
        sArray[14] = 29;
        sArray[15] = 7;
        sArray[16] = 1;
        sArray[17] = 7;
        sArray[18] = 6;
        sArray[20] = 57;
        sArray[21] = 1;
        sArray[23] = 2;
        sArray[24] = 3;
        sArray[25] = 57;
        sArray[26] = 15;
        sArray[27] = 6;
        sArray[29] = 6;
        sArray[30] = 5;
        sArray[31] = 6;
        sArray[32] = 1;
        sArray[33] = 6;
        sArray[34] = 5;
        sArray[35] = 57;
        sArray[36] = 57;
        sArray[37] = 4;
        sArray[38] = 7;
        sArray[39] = 6;
        sArray[41] = 7;
        sArray[42] = 1;
        sArray[43] = 2;
        sArray[44] = 1;
        id_private = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrlB_2.id_private();
        rrlB_2.id_implements();
        rrlB_2.id_throws();
        rrlB_2.id_finally();
        rrlB_2.id_byte();
        rrlB_2.id_protected();
    }

    private static void id_finally() {
        id_byte = new float[]{1.5f, 1.1f, 2.0f, 0.1f, 0.14f};
    }

    private void id_extends() {
        if (this.id_class == null) {
            this.id_class = new Object[8];
            this.id_class[6] = false;
            this.id_class[7] = false;
        }
    }

    private boolean id_case() {
        this.id_extends();
        if (((rrIk_1)this.id_class[id_private[34]]).id_class().booleanValue() && ((cb_3)rrlB_2.id_import.id_class[id_private[35]]).id_return()) {
            return id_break[14];
        }
        rdb_3 rdb_32 = ((cb_3)rrlB_2.id_import.id_class[id_private[36]]).ss().id_break();
        if (((rrIk_1)this.id_class[id_private[37]]).id_class().booleanValue() && !(rdb_32 instanceof rkx_3) && !(rdb_32 instanceof rxM_2)) {
            return id_break[15];
        }
        return id_break[16];
    }

    private static void id_implements() {
        id_catch = new String[]{new String("\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u043f\u0440\u044b\u0436\u043e\u043a"), new String("\u041a\u0440\u0443\u0436\u0438\u0442\u044c \u0432\u043e\u043a\u0440\u0443\u0433 \u0446\u0435\u043b\u0438"), new String("\u041f\u0440\u0435\u0434\u0438\u043a\u0442 \u043f\u043e\u0437\u0438\u0446\u0438\u0438"), new String("\u0421\u0438\u043b\u0430 \u043f\u0440\u0435\u0434\u0438\u043a\u0442\u0430"), new String("\u041e\u0441\u0442\u0430\u043d\u0430\u0432\u043b\u0438\u0432\u0430\u0442\u044c \u043f\u0440\u0438\n\u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0438 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430"), new String("\u0422\u043e\u043b\u044c\u043a\u043e \u0441 \u043e\u0440\u0443\u0436\u0438\u0435\u043c")};
    }

    private static void id_protected() {
        id_protected = new byte[]{6, 2, 3, 4, 5, 8, 6, 7};
    }

    private static void id_private() {
        boolean[] blArray = new boolean[35];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[16] = true;
        blArray[19] = true;
        blArray[21] = true;
        blArray[23] = true;
        blArray[25] = true;
        blArray[27] = true;
        blArray[29] = true;
        blArray[31] = true;
        id_break = blArray;
    }

    @Override
    public boolean aK_() {
        this.id_extends();
        Boolean bl = id_break[17];
        this.id_class[rrlB_2.id_private[38]] = bl;
        Boolean bl2 = id_break[18];
        this.id_class[rrlB_2.id_private[39]] = bl2;
        return super.aK_();
    }
}

