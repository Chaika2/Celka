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
import celestial.rAB;
import celestial.rJr_1;
import celestial.rLD;
import celestial.rLY;
import celestial.rXa_1;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rrCC;
import celestial.rrCv_1;
import celestial.rrIF;
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

public class rrCn_1
extends rrCv_1 {
    private static String[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;
    private static byte[] id_case;
    public static Object[] id_break;
    private static boolean[] id_catch;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[4];
            this.id_class[3] = false;
        }
    }

    public rrCn_1(FastSwap fastSwap) {
        super(fastSwap);
        this.id_byte();
        rrIF rrIF2 = new rrIF(id_byte[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_protected[0]]);
        this.id_class[rrCn_1.id_protected[1]] = rrIF2;
        rrmi_3 rrmi_32 = new rrmi_3();
        this.id_class[rrCn_1.id_protected[2]] = rrmi_32;
        rrmi_3 rrmi_33 = new rrmi_3();
        this.id_class[rrCn_1.id_protected[3]] = rrmi_33;
        Setting[] settingArray = new Setting[id_catch[0]];
        Setting[] settingArray2 = new Setting[id_catch[2]];
        settingArray2[rrCn_1.id_catch[3]] = (rrIF)this.id_class[id_protected[4]];
        settingArray[rrCn_1.id_catch[1]] = new GroupSetting(id_byte[1], settingArray2);
        fastSwap.id_class(settingArray);
    }

    static {
        rrCn_1.ntfClinit();
    }

    @Override
    public rdb_3 id_class() {
        return rdy_3.JA;
    }

    private void id_class(int n, int n2) {
        if (n > id_case[4]) {
            ((Ax_1)rrCn_1.id_import.id_class[id_protected[25]]).id_class(((rJr_1)((cb_3)rrCn_1.id_import.id_class[rrCn_1.id_protected[26]]).id_implements[rrCn_1.id_protected[27]]).id_case, n, n2, rXa_1.SWAP, id_catch[12]);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[28]]).id_finally().id_class(rrLY.id_class());
        } else {
            ((rhz_3)((cb_3)rrCn_1.id_import.id_class[rrCn_1.id_protected[29]]).id_implements[rrCn_1.id_protected[30]]).id_protected = n;
        }
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_byte();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[7]]) && ((Boolean)this.id_class[id_protected[8]]).booleanValue()) {
            Pair<rdn_3, Integer> pair = this.id_throws();
            rdn_3 rdn_32 = (rdn_3)pair.getLeft();
            int n = (Integer)pair.getRight();
            int n2 = ((rrmi_3)this.id_class[id_protected[9]]).id_class(id_catch[5], new String[id_catch[6]]);
            if (n2 != id_case[0] && n2 < id_case[1]) {
                int n3 = ((rrmi_3)this.id_class[id_protected[10]]).id_break();
                this.id_class(n3, n2);
                ((rrmi_3)this.id_class[id_protected[11]]).id_throws();
            } else if (n >= 0) {
                boolean bl = n > id_case[2] ? id_catch[7] : id_catch[8];
                int n4 = ((rhz_3)((cb_3)rrCn_1.id_import.id_class[rrCn_1.id_protected[12]]).id_implements[rrCn_1.id_protected[13]]).id_protected;
                if (bl && !((rrmi_3)this.id_class[id_protected[14]]).id_class()) {
                    ((rrmi_3)this.id_class[id_protected[15]]).id_class(((cb_3)rrCn_1.id_import.id_class[id_protected[16]]).ss(), n4);
                }
                this.id_class(n, n4);
                if (bl) {
                    ((rrmi_3)this.id_class[id_protected[17]]).id_class(rdn_32, n);
                }
            } else if (((rrmi_3)this.id_class[id_protected[18]]).id_class() && ((rrmi_3)this.id_class[id_protected[19]]).id_class()) {
                int n5 = ((rrmi_3)this.id_class[id_protected[20]]).id_class(id_catch[9], new String[id_catch[10]]);
                if (n5 != id_case[3]) {
                    this.id_class(((rrmi_3)this.id_class[id_protected[21]]).id_break(), ((rrmi_3)this.id_class[id_protected[22]]).id_break());
                }
                ((rrmi_3)this.id_class[id_protected[23]]).id_throws();
            }
            Boolean bl = id_catch[11];
            this.id_class[rrCn_1.id_protected[24]] = bl;
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-46, -66, 43, -55, 19, -100, 26, 39}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        this.id_byte();
        if (rrLB2.id_break() == ((rrIF)this.id_class[id_protected[5]]).id_finally().id_byte()) {
            Boolean bl = id_catch[4];
            this.id_class[rrCn_1.id_protected[6]] = bl;
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4AE821EA943F2B9L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFEBCAC2;
    }

    @Override
    public Predicate<rdn_3> id_break() {
        return rdn_32 -> {
            if (rdn_32.id_break() == this.id_class()) {
                for (rLY rLY2 : rAB.id_class(rdn_32)) {
                    if (rLY2.id_class() != rLD.id_case) continue;
                    return id_catch[16];
                }
                return id_catch[17];
            }
            return id_catch[18];
        };
    }

    private Pair<rdn_3, Integer> id_throws() {
        Predicate<rdn_3> predicate = this.id_break();
        if (predicate == null) {
            return Pair.of(null, (Object)id_case[5]);
        }
        if (predicate.test(((cb_3)rrCn_1.id_import.id_class[id_protected[31]]).ss())) {
            return Pair.of(null, (Object)id_case[6]);
        }
        if (predicate.test(((cb_3)rrCn_1.id_import.id_class[id_protected[32]]).Sn())) {
            return Pair.of(null, (Object)id_case[7]);
        }
        ArrayList<Pair> arrayList = new ArrayList<Pair>();
        for (int i = id_catch[13]; i < id_case[8]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrCn_1.id_import.id_class[rrCn_1.id_protected[33]]).id_implements[id_protected[34]]).id_extends(i);
            if (!predicate.test(rdn_32)) continue;
            arrayList.add(Pair.of((Object)rdn_32, (Object)i));
        }
        if (arrayList.isEmpty()) {
            return Pair.of(null, (Object)id_case[9]);
        }
        arrayList.sort((pair, pair2) -> ((rrCC)id_break[id_protected[38]]).id_class((rdn_3)pair.getLeft(), (rdn_3)pair2.getLeft()));
        return (Pair)arrayList.get(id_catch[14]);
    }

    private static /* synthetic */ void ntfClinit() {
        rrCn_1.id_implements();
        rrCn_1.id_protected();
        rrCn_1.id_finally();
        rrCn_1.id_private();
        rrCn_1.id_case();
    }

    private static void id_finally() {
        short[] sArray = new short[39];
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[6] = 3;
        sArray[8] = 3;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[11] = 1;
        sArray[12] = 57;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[15] = 2;
        sArray[16] = 57;
        sArray[17] = 1;
        sArray[18] = 2;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[21] = 1;
        sArray[22] = 2;
        sArray[23] = 2;
        sArray[24] = 3;
        sArray[25] = 55;
        sArray[26] = 57;
        sArray[27] = 4;
        sArray[29] = 57;
        sArray[30] = 1;
        sArray[31] = 57;
        sArray[32] = 57;
        sArray[33] = 57;
        sArray[34] = 1;
        sArray[35] = 3;
        sArray[36] = 1;
        sArray[37] = 2;
        id_protected = sArray;
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rrCC()};
        id_break = objectArray;
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[22];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[16] = true;
        blArray[21] = true;
        id_catch = blArray;
    }

    private static void id_protected() {
        id_byte = new String[]{new String("\u0410\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u044f"), new String("\u0417\u0435\u043b\u044c\u0435 \u0438\u0441\u0446\u0435\u043b\u0435\u043d\u0438\u044f")};
    }

    private static void id_private() {
        id_case = new byte[]{-1, 9, 8, -1, 8, -1, -2, -3, 45, -1, 4, 3};
    }

    @Override
    public boolean aK_() {
        this.id_byte();
        Boolean bl = id_catch[15];
        this.id_class[rrCn_1.id_protected[35]] = bl;
        ((rrmi_3)this.id_class[id_protected[36]]).id_throws();
        ((rrmi_3)this.id_class[id_protected[37]]).id_throws();
        return super.aK_();
    }
}

