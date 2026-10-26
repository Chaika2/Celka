/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.Ax_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.combat.FastSwap;
import celestial.q_1;
import celestial.rJr_1;
import celestial.rXa_1;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rrCH;
import celestial.rrCv_1;
import celestial.rrIF;
import celestial.rrIk_1;
import celestial.rrLB;
import celestial.rrLY;
import celestial.rrQX;
import celestial.rrmi_3;
import celestial.setting.GroupSetting;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrCl_1
extends rrCv_1 {
    private static byte[] id_byte;
    public Object[] id_class;
    public static Object[] id_break;
    private static short[] id_protected;
    private static String[] id_case;
    private static boolean[] id_catch;

    private static void id_byte() {
        id_byte = new byte[]{2, -1, 9, 8, -1, 8, -1, -2, -3, 45, -1, 5, 4};
    }

    public rrCl_1(FastSwap fastSwap) {
        super(fastSwap);
        this.id_case();
        rrIF rrIF2 = new rrIF(id_case[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_protected[0]]);
        this.id_class[rrCl_1.id_protected[1]] = rrIF2;
        rrIk_1 rrIk_12 = new rrIk_1(id_case[1], id_catch[0]);
        this.id_class[rrCl_1.id_protected[2]] = rrIk_12;
        rrmi_3 rrmi_32 = new rrmi_3();
        this.id_class[rrCl_1.id_protected[3]] = rrmi_32;
        rrmi_3 rrmi_33 = new rrmi_3();
        this.id_class[rrCl_1.id_protected[4]] = rrmi_33;
        Setting[] settingArray = new Setting[id_catch[1]];
        Setting[] settingArray2 = new Setting[id_byte[0]];
        settingArray2[rrCl_1.id_catch[3]] = (rrIF)this.id_class[id_protected[5]];
        settingArray2[rrCl_1.id_catch[4]] = (rrIk_1)this.id_class[id_protected[6]];
        settingArray[rrCl_1.id_catch[2]] = new GroupSetting(id_case[2], settingArray2);
        fastSwap.id_class(settingArray);
    }

    static {
        rrCl_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-101, -70, 49, 60, -35, 126, 86, 67}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_class(int n, int n2) {
        if (n > id_byte[5]) {
            ((Ax_1)rrCl_1.id_import.id_class[id_protected[27]]).id_class(((rJr_1)((cb_3)rrCl_1.id_import.id_class[rrCl_1.id_protected[28]]).id_implements[rrCl_1.id_protected[29]]).id_case, n, n2, rXa_1.SWAP, id_catch[13]);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[30]]).id_finally().id_class(rrLY.id_class());
        } else {
            ((rhz_3)((cb_3)rrCl_1.id_import.id_class[rrCl_1.id_protected[31]]).id_implements[rrCl_1.id_protected[32]]).id_protected = n;
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x244934AF;
    }

    @Override
    public rdb_3 id_class() {
        return rdy_3.kY;
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_case();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[9]]) && ((Boolean)this.id_class[id_protected[10]]).booleanValue()) {
            Pair<rdn_3, Integer> pair = this.id_implements();
            rdn_3 rdn_32 = (rdn_3)pair.getLeft();
            int n = (Integer)pair.getRight();
            int n2 = ((rrmi_3)this.id_class[id_protected[11]]).id_class(id_catch[6], new String[id_catch[7]]);
            if (n2 != id_byte[1] && n2 < id_byte[2]) {
                int n3 = ((rrmi_3)this.id_class[id_protected[12]]).id_break();
                this.id_class(n3, n2);
                ((rrmi_3)this.id_class[id_protected[13]]).id_throws();
            } else if (n >= 0) {
                boolean bl = n > id_byte[3] ? id_catch[8] : id_catch[9];
                int n4 = ((rhz_3)((cb_3)rrCl_1.id_import.id_class[rrCl_1.id_protected[14]]).id_implements[rrCl_1.id_protected[15]]).id_protected;
                if (bl && !((rrmi_3)this.id_class[id_protected[16]]).id_class()) {
                    ((rrmi_3)this.id_class[id_protected[17]]).id_class(((cb_3)rrCl_1.id_import.id_class[id_protected[18]]).ss(), n4);
                }
                this.id_class(n, n4);
                if (bl) {
                    ((rrmi_3)this.id_class[id_protected[19]]).id_class(rdn_32, n);
                }
            } else if (((rrmi_3)this.id_class[id_protected[20]]).id_class() && ((rrmi_3)this.id_class[id_protected[21]]).id_class()) {
                int n5 = ((rrmi_3)this.id_class[id_protected[22]]).id_class(id_catch[10], new String[id_catch[11]]);
                if (n5 != id_byte[4]) {
                    this.id_class(((rrmi_3)this.id_class[id_protected[23]]).id_break(), ((rrmi_3)this.id_class[id_protected[24]]).id_break());
                }
                ((rrmi_3)this.id_class[id_protected[25]]).id_throws();
            }
            Boolean bl = id_catch[12];
            this.id_class[rrCl_1.id_protected[26]] = bl;
        }
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        this.id_case();
        if (rrLB2.id_break() == ((rrIF)this.id_class[id_protected[7]]).id_finally().id_byte()) {
            Boolean bl = id_catch[5];
            this.id_class[rrCl_1.id_protected[8]] = bl;
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x45457E67EF0EEC90L;
    }

    @Override
    public Predicate<rdn_3> id_break() {
        return rdn_32 -> {
            this.id_case();
            if (rdn_32.id_break() == this.id_class()) {
                if (((rrIk_1)this.id_class[id_protected[40]]).id_class().booleanValue()) {
                    return rdn_32.id_protected(id_case[3]);
                }
                return id_catch[17];
            }
            return id_catch[18];
        };
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[22];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[17] = true;
        blArray[21] = true;
        id_catch = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrCl_1.id_throws();
        rrCl_1.id_finally();
        rrCl_1.id_private();
        rrCl_1.id_byte();
        rrCl_1.id_protected();
    }

    private static void id_finally() {
        id_case = new String[]{new String("\u0410\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u044f"), new String("\u0422\u043e\u043b\u044c\u043a\u043e \u043a\u0440\u0443\u0448\u0438\u0442\u0435\u043b\u044f"), new String("\u0422\u0440\u0435\u0437\u0443\u0431\u0435\u0446"), new String("custom-enchantments")};
    }

    private void id_case() {
        if (this.id_class == null) {
            this.id_class = new Object[5];
            this.id_class[4] = false;
        }
    }

    private Pair<rdn_3, Integer> id_implements() {
        Predicate<rdn_3> predicate = this.id_break();
        if (predicate == null) {
            return Pair.of(null, (Object)id_byte[6]);
        }
        if (predicate.test(((cb_3)rrCl_1.id_import.id_class[id_protected[33]]).ss())) {
            return Pair.of(null, (Object)id_byte[7]);
        }
        if (predicate.test(((cb_3)rrCl_1.id_import.id_class[id_protected[34]]).Sn())) {
            return Pair.of(null, (Object)id_byte[8]);
        }
        ArrayList<Pair> arrayList = new ArrayList<Pair>();
        for (int i = id_catch[14]; i < id_byte[9]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrCl_1.id_import.id_class[rrCl_1.id_protected[35]]).id_implements[id_protected[36]]).id_extends(i);
            if (!predicate.test(rdn_32)) continue;
            arrayList.add(Pair.of((Object)rdn_32, (Object)i));
        }
        if (arrayList.isEmpty()) {
            return Pair.of(null, (Object)id_byte[10]);
        }
        arrayList.sort((pair, pair2) -> ((rrCH)id_break[id_protected[41]]).id_class((rdn_3)pair.getLeft(), (rdn_3)pair2.getLeft()));
        return (Pair)arrayList.get(id_catch[15]);
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrCH()};
        id_break = objectArray;
    }

    private static void id_private() {
        short[] sArray = new short[42];
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[6] = 1;
        sArray[8] = 4;
        sArray[10] = 4;
        sArray[11] = 2;
        sArray[12] = 2;
        sArray[13] = 2;
        sArray[14] = 57;
        sArray[15] = 1;
        sArray[16] = 3;
        sArray[17] = 3;
        sArray[18] = 57;
        sArray[19] = 2;
        sArray[20] = 3;
        sArray[21] = 2;
        sArray[22] = 3;
        sArray[23] = 2;
        sArray[24] = 3;
        sArray[25] = 3;
        sArray[26] = 4;
        sArray[27] = 55;
        sArray[28] = 57;
        sArray[29] = 4;
        sArray[31] = 57;
        sArray[32] = 1;
        sArray[33] = 57;
        sArray[34] = 57;
        sArray[35] = 57;
        sArray[36] = 1;
        sArray[37] = 4;
        sArray[38] = 2;
        sArray[39] = 3;
        sArray[40] = 1;
        id_protected = sArray;
    }

    @Override
    public boolean aK_() {
        this.id_case();
        Boolean bl = id_catch[16];
        this.id_class[rrCl_1.id_protected[37]] = bl;
        ((rrmi_3)this.id_class[id_protected[38]]).id_throws();
        ((rrmi_3)this.id_class[id_protected[39]]).id_throws();
        return super.aK_();
    }
}

