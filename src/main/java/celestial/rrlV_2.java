/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.Ax_1;
import celestial.Hh_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.combat.AutoUse;
import celestial.q_1;
import celestial.rAB;
import celestial.rJr_1;
import celestial.rLD;
import celestial.rXa_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rpm_3;
import celestial.rrAC;
import celestial.rrIk_1;
import celestial.rrLH;
import celestial.rrLY;
import celestial.rrLp_1;
import celestial.rrLq_1;
import celestial.rrLy_1;
import celestial.rrQX;
import celestial.rrfY_2;
import celestial.rrlg_3;
import celestial.ryZ_2;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrlV_2
extends rrlg_3 {
    private static byte[] id_break;
    private static String[] id_protected;
    private static short[] id_case;
    public Object[] id_class;
    private static boolean[] id_catch;

    public boolean id_byte() {
        if (!this.id_case()) {
            return id_catch[11];
        }
        return !((cb_3)rrlV_2.id_import.id_class[id_case[31]]).id_break(rLD.id_final) ? id_catch[12] : id_catch[13];
    }

    public rrlV_2(AutoUse autoUse) {
        super(autoUse);
        this.id_extends();
        rrIk_1 rrIk_12 = (rrIk_1)new rrIk_1(id_protected[0], id_catch[0]).id_class(id_protected[1], (Setting<T> setting, Pair<T, Boolean> pair) -> {
            if (!((Boolean)setting.id_byte()).booleanValue()) {
                this.id_package();
            }
        });
        this.id_class[rrlV_2.id_case[0]] = rrIk_12;
        Setting[] settingArray = new Setting[id_catch[1]];
        settingArray[rrlV_2.id_catch[2]] = (rrIk_1)this.id_class[id_case[1]];
        autoUse.id_class(new GroupSetting(id_protected[2], settingArray));
    }

    static {
        rrlV_2.ntfClinit();
    }

    @EventTarget(id_class=200)
    public void id_class(rrAC rrAC2) {
        this.id_extends();
        if (rrAC2.id_break() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[28]]) && ((Boolean)this.id_class[id_case[29]]).booleanValue()) {
            rrAC2.id_class(id_catch[10]);
        }
    }

    private boolean id_class(rdn_3 rdn_32) {
        if (rdn_32.id_break() != rdy_3.JA) {
            return id_catch[15];
        }
        return rAB.id_break(rdn_32, List.of(rLD.id_final));
    }

    @Override
    public boolean id_class() {
        this.id_extends();
        return (Boolean)this.id_class[id_case[30]];
    }

    @EventTarget(id_class=200)
    public void id_class(rrLH rrLH2) {
        this.id_extends();
        if (rrLH2.id_protected() == (rrLy_1)((Object)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[id_case[23]]) && ((Boolean)this.id_class[id_case[24]]).booleanValue()) {
            rrLH2.id_class(id_catch[8]);
        }
    }

    @EventTarget(id_class=200)
    public void id_class(rrLp_1 rrLp_12) {
        this.id_extends();
        rrLq_1 rrLq_12 = rrLp_12.id_case();
        if ((rrLq_12 == (rrLq_1)((Object)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[id_case[25]]) || rrLq_12 == (rrLq_1)((Object)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[id_case[26]])) && ((Boolean)this.id_class[id_case[27]]).booleanValue()) {
            rrLp_12.id_class(id_catch[9]);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6E7570FA;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{30, -125, 24, -76, -57, -126, 54, -1}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget(id_class=200)
    public void id_class(q_1 q_12) {
        this.id_extends();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[2]])) {
            ryZ_2 ryZ_22;
            AutoUse autoUse = (AutoUse)this.id_continue();
            if (!((rrIk_1)this.id_class[id_case[3]]).id_class().booleanValue() || !autoUse.id_class(this)) {
                this.id_break();
                return;
            }
            rdn_3 rdn_32 = ((cb_3)rrlV_2.id_import.id_class[id_case[4]]).Sn();
            Pair<rdn_3, Integer> pair = this.id_break(rdn_32);
            if (pair == null) {
                this.id_break();
                return;
            }
            rdn_3 rdn_33 = (rdn_3)pair.getLeft();
            int n = (Integer)pair.getRight();
            if (!this.id_byte()) {
                this.id_break();
                return;
            }
            this.id_private();
            int n2 = ((rJr_1)((cb_3)rrlV_2.id_import.id_class[rrlV_2.id_case[5]]).id_implements[rrlV_2.id_case[6]]).id_case;
            if (n != id_break[0] && n2 == 0 && !rdn_3.id_break(rdn_32, rdn_33)) {
                ((Ax_1)rrlV_2.id_import.id_class[id_case[7]]).id_class(n2, n, (int)id_break[1], rXa_1.SWAP, id_catch[3]);
                ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[8]]).id_finally().id_class(rrLY.id_class());
                Boolean bl = id_catch[4];
                this.id_class[rrlV_2.id_case[9]] = bl;
                return;
            }
            if (!((Boolean)this.id_class[id_case[10]]).booleanValue() && !((cb_3)rrlV_2.id_import.id_class[id_case[11]]).id_return() && this.id_class(rdn_32) && (ryZ_22 = ((Ax_1)rrlV_2.id_import.id_class[id_case[12]]).id_class(rpm_3.OFF_HAND)).id_class()) {
                ((cb_3)rrlV_2.id_import.id_class[id_case[13]]).id_break(rpm_3.OFF_HAND);
                ((Hh_1)rrlV_2.id_import.id_class[rrlV_2.id_case[14]]).id_class.id_class(rpm_3.OFF_HAND);
                Boolean bl = id_catch[5];
                this.id_class[rrlV_2.id_case[15]] = bl;
            }
            if (((Boolean)this.id_class[id_case[16]]).booleanValue()) {
                if (!((cb_3)rrlV_2.id_import.id_class[id_case[17]]).id_return()) {
                    Boolean bl = id_catch[6];
                    this.id_class[rrlV_2.id_case[18]] = bl;
                } else if (((cb_3)rrlV_2.id_import.id_class[id_case[19]]).Sw() > rdn_32.id_extends() * id_break[2]) {
                    ((Ax_1)rrlV_2.id_import.id_class[id_case[20]]).id_byte((cb_3)rrlV_2.id_import.id_class[id_case[21]]);
                    Boolean bl = id_catch[7];
                    this.id_class[rrlV_2.id_case[22]] = bl;
                }
            }
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x99F28AE9E5042B59L;
    }

    private Pair<rdn_3, Integer> id_break(rdn_3 rdn_32) {
        if (this.id_class(rdn_32)) {
            return Pair.of((Object)rdn_32, (Object)id_break[3]);
        }
        for (int i = id_catch[14]; i < id_break[4]; ++i) {
            rdn_3 rdn_33 = ((rhz_3)((cb_3)rrlV_2.id_import.id_class[rrlV_2.id_case[36]]).id_implements[id_case[37]]).id_extends(i);
            if (rdn_33.id_class() || !this.id_class(rdn_33)) continue;
            return Pair.of((Object)rdn_33, (Object)rrfY_2.id_break(i));
        }
        return null;
    }

    public void id_break() {
        this.id_extends();
        Boolean bl = id_catch[16];
        this.id_class[rrlV_2.id_case[38]] = bl;
    }

    private static /* synthetic */ void ntfClinit() {
        rrlV_2.id_native();
        rrlV_2.id_implements();
        rrlV_2.id_finally();
        rrlV_2.id_final();
    }

    private static void id_finally() {
        short[] sArray = new short[39];
        sArray[4] = 57;
        sArray[5] = 57;
        sArray[6] = 4;
        sArray[7] = 55;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[11] = 57;
        sArray[12] = 55;
        sArray[13] = 57;
        sArray[14] = 16;
        sArray[15] = 1;
        sArray[16] = 1;
        sArray[17] = 57;
        sArray[18] = 1;
        sArray[19] = 57;
        sArray[20] = 55;
        sArray[21] = 57;
        sArray[22] = 1;
        sArray[24] = 1;
        sArray[25] = 1;
        sArray[27] = 1;
        sArray[29] = 1;
        sArray[30] = 1;
        sArray[31] = 57;
        sArray[32] = 1;
        sArray[33] = 57;
        sArray[34] = 55;
        sArray[35] = 57;
        sArray[36] = 57;
        sArray[37] = 1;
        sArray[38] = 1;
        id_case = sArray;
    }

    private void id_extends() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
            this.id_class[1] = false;
        }
    }

    private static void id_implements() {
        id_protected = new String[]{new String("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e"), new String("enabled"), new String("\u0417\u0435\u043b\u044c\u0435 \u043d\u0435\u0432\u0438\u0434\u0438\u043c\u043e\u0441\u0442\u0438")};
    }

    private void id_package() {
        this.id_extends();
        if (((Boolean)this.id_class[id_case[32]]).booleanValue() && ((cb_3)rrlV_2.id_import.id_class[id_case[33]]).id_return()) {
            ((Ax_1)rrlV_2.id_import.id_class[id_case[34]]).id_byte((cb_3)rrlV_2.id_import.id_class[id_case[35]]);
        }
        this.id_break();
    }

    private static void id_final() {
        id_break = new byte[]{-1, 40, 2, -1, 45, 2};
    }

    private static void id_native() {
        boolean[] blArray = new boolean[19];
        blArray[1] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[17] = true;
        id_catch = blArray;
    }

    @Override
    public boolean aK_() {
        this.id_package();
        return super.aK_();
    }
}

