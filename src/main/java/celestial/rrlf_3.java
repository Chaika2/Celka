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
import celestial.rJr_1;
import celestial.rXa_1;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rhz_3;
import celestial.rpQ_2;
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
import celestial.rrlj_3;
import celestial.ryZ_2;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrlf_3
extends rrlg_3 {
    private static short[] id_protected;
    public Object[] id_class;
    private static String[] id_case;
    private static byte[] id_catch;
    private static boolean[] id_private;
    public static Object[] id_break;

    private static void id_byte() {
        id_case = new String[]{new String("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e"), new String("enabled"), new String("\u0415\u0434\u0430"), new String("display"), new String("RepairCost"), new String("Enchantments")};
    }

    private Pair<rdn_3, Integer> id_int() {
        ArrayList<Pair> arrayList = new ArrayList<Pair>();
        for (int i = id_private[15]; i < id_catch[2]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrlf_3.id_import.id_class[rrlf_3.id_protected[37]]).id_implements[id_protected[38]]).id_extends(i);
            if (rdn_32.id_class() || !rdn_32.id_long() || this.id_break(rdn_32)) continue;
            arrayList.add(Pair.of((Object)rdn_32, (Object)rrfY_2.id_break(i)));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.stream().max((rrlj_3)id_break[id_protected[39]]).orElse(null);
    }

    public rrlf_3(AutoUse autoUse) {
        super(autoUse);
        this.id_final();
        rrIk_1 rrIk_12 = (rrIk_1)new rrIk_1(id_case[0], id_private[0]).id_class(id_case[1], (Setting<T> setting, Pair<T, Boolean> pair) -> {
            if (!((Boolean)setting.id_byte()).booleanValue()) {
                this.id_extends();
            }
        });
        this.id_class[rrlf_3.id_protected[0]] = rrIk_12;
        Setting[] settingArray = new Setting[id_private[1]];
        settingArray[rrlf_3.id_private[2]] = (rrIk_1)this.id_class[id_protected[1]];
        autoUse.id_class(new GroupSetting(id_case[2], settingArray));
    }

    static {
        rrlf_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x50FAC48B;
    }

    @EventTarget(id_class=200)
    public void id_class(rrLH rrLH2) {
        this.id_final();
        if (rrLH2.id_protected() == (rrLy_1)((Object)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[id_protected[27]]) && ((Boolean)this.id_class[id_protected[28]]).booleanValue()) {
            rrLH2.id_class(id_private[8]);
        }
    }

    @Override
    public boolean id_class() {
        this.id_final();
        return (Boolean)this.id_class[id_protected[34]];
    }

    @EventTarget(id_class=200)
    public void id_class(rrLp_1 rrLp_12) {
        this.id_final();
        rrLq_1 rrLq_12 = rrLp_12.id_case();
        if ((rrLq_12 == (rrLq_1)((Object)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[id_protected[29]]) || rrLq_12 == (rrLq_1)((Object)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[id_protected[30]])) && ((Boolean)this.id_class[id_protected[31]]).booleanValue()) {
            rrLp_12.id_class(id_private[9]);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x60C7B9D31D651A8EL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{77, -47, -126, 77, 38, 43, 47, -96}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget(id_class=200)
    public void id_class(rrAC rrAC2) {
        this.id_final();
        if (rrAC2.id_break() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[32]]) && ((Boolean)this.id_class[id_protected[33]]).booleanValue()) {
            rrAC2.id_class(id_private[10]);
        }
    }

    public boolean id_class(rdn_3 rdn_32) {
        this.id_final();
        if (!this.id_case()) {
            return id_private[11];
        }
        if (((Boolean)this.id_class[id_protected[35]]).booleanValue()) {
            return id_private[12];
        }
        rpQ_2 rpQ_22 = ((cb_3)rrlf_3.id_import.id_class[id_protected[36]]).sk();
        return rpQ_22.id_class() <= rpQ_22.id_protected() - rdn_32.id_break().id_this().id_class() ? id_private[13] : id_private[14];
    }

    @EventTarget(id_class=200)
    public void id_class(q_1 q_12) {
        this.id_final();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[2]])) {
            Object object;
            AutoUse autoUse = (AutoUse)this.id_continue();
            if (!((rrIk_1)this.id_class[id_protected[3]]).id_class().booleanValue() || !autoUse.id_class(this)) {
                this.id_package();
                return;
            }
            Pair<rdn_3, Integer> pair = this.id_int();
            if (pair == null) {
                this.id_package();
                return;
            }
            rdn_3 rdn_32 = (rdn_3)pair.getLeft();
            int n = (Integer)pair.getRight();
            if (!this.id_class(rdn_32)) {
                this.id_package();
                return;
            }
            this.id_private();
            rdn_3 rdn_33 = ((cb_3)rrlf_3.id_import.id_class[id_protected[4]]).Sn();
            int n2 = ((rJr_1)((cb_3)rrlf_3.id_import.id_class[rrlf_3.id_protected[5]]).id_implements[rrlf_3.id_protected[6]]).id_case;
            if (n2 == 0 && !rdn_3.id_byte(rdn_33, rdn_32)) {
                ((Ax_1)rrlf_3.id_import.id_class[id_protected[7]]).id_class(n2, n, (int)id_catch[0], rXa_1.SWAP, id_private[3]);
                ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[8]]).id_finally().id_class(rrLY.id_class());
                Boolean bl = id_private[4];
                this.id_class[rrlf_3.id_protected[9]] = bl;
                return;
            }
            if (!((Boolean)this.id_class[id_protected[10]]).booleanValue() && !((cb_3)rrlf_3.id_import.id_class[id_protected[11]]).id_return() && rdn_33.id_break().id_super() && ((ryZ_2)((Object)(object = ((Ax_1)rrlf_3.id_import.id_class[id_protected[12]]).id_class(rpm_3.OFF_HAND)))).id_class()) {
                ((cb_3)rrlf_3.id_import.id_class[id_protected[13]]).id_break(rpm_3.OFF_HAND);
                ((Hh_1)rrlf_3.id_import.id_class[rrlf_3.id_protected[14]]).id_class.id_class(rpm_3.OFF_HAND);
                Boolean bl = id_private[5];
                this.id_class[rrlf_3.id_protected[15]] = bl;
            }
            if (((Boolean)this.id_class[id_protected[16]]).booleanValue()) {
                object = ((cb_3)rrlf_3.id_import.id_class[id_protected[17]]).sk();
                if (((rpQ_2)object).id_class() != ((Integer)this.id_class[id_protected[18]]).intValue()) {
                    Integer n3 = ((rpQ_2)object).id_class();
                    this.id_class[rrlf_3.id_protected[19]] = n3;
                    Boolean bl = ((rpQ_2)object).id_break();
                    this.id_class[rrlf_3.id_protected[20]] = bl;
                }
                if (!((cb_3)rrlf_3.id_import.id_class[id_protected[21]]).id_return()) {
                    Boolean bl = id_private[6];
                    this.id_class[rrlf_3.id_protected[22]] = bl;
                } else if (((cb_3)rrlf_3.id_import.id_class[id_protected[23]]).Sw() > rdn_33.id_extends() * id_catch[1]) {
                    ((Ax_1)rrlf_3.id_import.id_class[id_protected[24]]).id_byte((cb_3)rrlf_3.id_import.id_class[id_protected[25]]);
                    Boolean bl = id_private[7];
                    this.id_class[rrlf_3.id_protected[26]] = bl;
                }
            }
        }
    }

    private boolean id_break(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_package();
        if (rcd_32 == null) {
            return id_private[16];
        }
        rcd_3 rcd_33 = rcd_32.id_catch();
        rcd_33.id_continue(id_case[3]);
        rcd_33.id_continue(id_case[4]);
        rcd_33.id_continue(id_case[5]);
        if (!rcd_33.id_protected().isEmpty()) {
            return id_private[17];
        }
        return id_private[18];
    }

    private static void id_break() {
        short[] sArray = new short[46];
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
        sArray[18] = 3;
        sArray[19] = 3;
        sArray[20] = 2;
        sArray[21] = 57;
        sArray[22] = 1;
        sArray[23] = 57;
        sArray[24] = 55;
        sArray[25] = 57;
        sArray[26] = 1;
        sArray[28] = 1;
        sArray[29] = 1;
        sArray[31] = 1;
        sArray[33] = 1;
        sArray[34] = 1;
        sArray[35] = 2;
        sArray[36] = 57;
        sArray[37] = 57;
        sArray[38] = 1;
        sArray[40] = 1;
        sArray[41] = 57;
        sArray[42] = 55;
        sArray[43] = 57;
        sArray[44] = 1;
        sArray[45] = 2;
        id_protected = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrlf_3.id_finally();
        rrlf_3.id_byte();
        rrlf_3.id_break();
        rrlf_3.id_implements();
        rrlf_3.id_native();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[27];
        blArray[0] = true;
        blArray[1] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[17] = true;
        blArray[22] = true;
        blArray[26] = true;
        id_private = blArray;
    }

    private void id_extends() {
        this.id_final();
        if (((Boolean)this.id_class[id_protected[40]]).booleanValue() && ((cb_3)rrlf_3.id_import.id_class[id_protected[41]]).id_return()) {
            ((Ax_1)rrlf_3.id_import.id_class[id_protected[42]]).id_byte((cb_3)rrlf_3.id_import.id_class[id_protected[43]]);
        }
        this.id_package();
    }

    private static void id_implements() {
        id_catch = new byte[]{40, 2, 45, 4, 2, 3};
    }

    private void id_package() {
        this.id_final();
        Boolean bl = id_private[19];
        this.id_class[rrlf_3.id_protected[44]] = bl;
        Boolean bl2 = id_private[20];
        this.id_class[rrlf_3.id_protected[45]] = bl2;
    }

    private void id_final() {
        if (this.id_class == null) {
            this.id_class = new Object[4];
            this.id_class[1] = false;
            this.id_class[2] = false;
            this.id_class[3] = 0;
        }
    }

    private static void id_native() {
        Object[] objectArray = new Object[]{new rrlj_3()};
        id_break = objectArray;
    }

    @Override
    public boolean aK_() {
        this.id_extends();
        return super.aK_();
    }
}

