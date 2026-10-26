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
import celestial.rrCu_1;
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

public class rrCc_1
extends rrCv_1 {
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static byte[] id_case;
    public Object[] id_class;
    private static String[] id_catch;
    public static Object[] id_break;

    private static void id_byte() {
        id_case = new byte[]{2, -1, 9, 8, -1, 8, -1, -2, -3, 45, -1, 5, 4};
    }

    public rrCc_1(FastSwap fastSwap) {
        super(fastSwap);
        this.id_protected();
        rrIF rrIF2 = new rrIF(id_catch[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_protected[0]]);
        this.id_class[rrCc_1.id_protected[1]] = rrIF2;
        rrIk_1 rrIk_12 = new rrIk_1(id_catch[1], id_byte[0]);
        this.id_class[rrCc_1.id_protected[2]] = rrIk_12;
        rrmi_3 rrmi_32 = new rrmi_3();
        this.id_class[rrCc_1.id_protected[3]] = rrmi_32;
        rrmi_3 rrmi_33 = new rrmi_3();
        this.id_class[rrCc_1.id_protected[4]] = rrmi_33;
        Setting[] settingArray = new Setting[id_byte[1]];
        Setting[] settingArray2 = new Setting[id_case[0]];
        settingArray2[rrCc_1.id_byte[3]] = (rrIF)this.id_class[id_protected[5]];
        settingArray2[rrCc_1.id_byte[4]] = (rrIk_1)this.id_class[id_protected[6]];
        settingArray[rrCc_1.id_byte[2]] = new GroupSetting(id_catch[2], settingArray2);
        fastSwap.id_class(settingArray);
    }

    static {
        rrCc_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA8265AC6F8631F17L;
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_protected();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[9]]) && ((Boolean)this.id_class[id_protected[10]]).booleanValue()) {
            Pair<rdn_3, Integer> pair = this.id_throws();
            rdn_3 rdn_32 = (rdn_3)pair.getLeft();
            int n = (Integer)pair.getRight();
            int n2 = ((rrmi_3)this.id_class[id_protected[11]]).id_class(id_byte[6], new String[id_byte[7]]);
            if (n2 != id_case[1] && n2 < id_case[2]) {
                int n3 = ((rrmi_3)this.id_class[id_protected[12]]).id_break();
                this.id_class(n3, n2);
                ((rrmi_3)this.id_class[id_protected[13]]).id_throws();
            } else if (n >= 0) {
                boolean bl = n > id_case[3] ? id_byte[8] : id_byte[9];
                int n4 = ((rhz_3)((cb_3)rrCc_1.id_import.id_class[rrCc_1.id_protected[14]]).id_implements[rrCc_1.id_protected[15]]).id_protected;
                if (bl && !((rrmi_3)this.id_class[id_protected[16]]).id_class()) {
                    ((rrmi_3)this.id_class[id_protected[17]]).id_class(((cb_3)rrCc_1.id_import.id_class[id_protected[18]]).ss(), n4);
                }
                this.id_class(n, n4);
                if (bl) {
                    ((rrmi_3)this.id_class[id_protected[19]]).id_class(rdn_32, n);
                }
            } else if (((rrmi_3)this.id_class[id_protected[20]]).id_class() && ((rrmi_3)this.id_class[id_protected[21]]).id_class()) {
                int n5 = ((rrmi_3)this.id_class[id_protected[22]]).id_class(id_byte[10], new String[id_byte[11]]);
                if (n5 != id_case[4]) {
                    this.id_class(((rrmi_3)this.id_class[id_protected[23]]).id_break(), ((rrmi_3)this.id_class[id_protected[24]]).id_break());
                }
                ((rrmi_3)this.id_class[id_protected[25]]).id_throws();
            }
            Boolean bl = id_byte[12];
            this.id_class[rrCc_1.id_protected[26]] = bl;
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCE88A2FD;
    }

    private void id_class(int n, int n2) {
        if (n > id_case[5]) {
            ((Ax_1)rrCc_1.id_import.id_class[id_protected[27]]).id_class(((rJr_1)((cb_3)rrCc_1.id_import.id_class[rrCc_1.id_protected[28]]).id_implements[rrCc_1.id_protected[29]]).id_case, n, n2, rXa_1.SWAP, id_byte[13]);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[30]]).id_finally().id_class(rrLY.id_class());
        } else {
            ((rhz_3)((cb_3)rrCc_1.id_import.id_class[rrCc_1.id_protected[31]]).id_implements[rrCc_1.id_protected[32]]).id_protected = n;
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-32, 102, 38, 70, 57, -17, -81, 8}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public rdb_3 id_class() {
        return rdy_3.kU;
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        this.id_protected();
        if (rrLB2.id_break() == ((rrIF)this.id_class[id_protected[7]]).id_finally().id_byte()) {
            Boolean bl = id_byte[5];
            this.id_class[rrCc_1.id_protected[8]] = bl;
        }
    }

    @Override
    public Predicate<rdn_3> id_break() {
        return rdn_32 -> {
            this.id_protected();
            if (rdn_32.id_break() == this.id_class()) {
                if (((rrIk_1)this.id_class[id_protected[40]]).id_class().booleanValue()) {
                    return rdn_32.id_protected(id_catch[3]);
                }
                return id_byte[17];
            }
            return id_byte[18];
        };
    }

    private Pair<rdn_3, Integer> id_throws() {
        Predicate<rdn_3> predicate = this.id_break();
        if (predicate == null) {
            return Pair.of(null, (Object)id_case[6]);
        }
        if (predicate.test(((cb_3)rrCc_1.id_import.id_class[id_protected[33]]).ss())) {
            return Pair.of(null, (Object)id_case[7]);
        }
        if (predicate.test(((cb_3)rrCc_1.id_import.id_class[id_protected[34]]).Sn())) {
            return Pair.of(null, (Object)id_case[8]);
        }
        ArrayList<Pair> arrayList = new ArrayList<Pair>();
        for (int i = id_byte[14]; i < id_case[9]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrCc_1.id_import.id_class[rrCc_1.id_protected[35]]).id_implements[id_protected[36]]).id_extends(i);
            if (!predicate.test(rdn_32)) continue;
            arrayList.add(Pair.of((Object)rdn_32, (Object)i));
        }
        if (arrayList.isEmpty()) {
            return Pair.of(null, (Object)id_case[10]);
        }
        arrayList.sort((pair, pair2) -> ((rrCu_1)id_break[id_protected[41]]).id_class((rdn_3)pair.getLeft(), (rdn_3)pair2.getLeft()));
        return (Pair)arrayList.get(id_byte[15]);
    }

    private static /* synthetic */ void ntfClinit() {
        rrCc_1.id_implements();
        rrCc_1.id_finally();
        rrCc_1.id_case();
        rrCc_1.id_byte();
        rrCc_1.id_private();
    }

    private static void id_finally() {
        id_catch = new String[]{new String("\u0410\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u044f"), new String("\u0422\u043e\u043b\u044c\u043a\u043e \u043a\u0440\u0443\u0448\u0438\u0442\u0435\u043b\u044f"), new String("\u0410\u0440\u0431\u0430\u043b\u0435\u0442"), new String("don-item")};
    }

    private static void id_case() {
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

    private static void id_implements() {
        boolean[] blArray = new boolean[22];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[17] = true;
        blArray[21] = true;
        id_byte = blArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            this.id_class = new Object[5];
            this.id_class[4] = false;
        }
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{new rrCu_1()};
        id_break = objectArray;
    }

    @Override
    public boolean aK_() {
        this.id_protected();
        Boolean bl = id_byte[16];
        this.id_class[rrCc_1.id_protected[37]] = bl;
        ((rrmi_3)this.id_class[id_protected[38]]).id_throws();
        ((rrmi_3)this.id_class[id_protected[39]]).id_throws();
        return super.aK_();
    }
}

