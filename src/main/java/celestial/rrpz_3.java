/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_throws;
import celestial.Ml_1;
import celestial.event.EventTarget;
import celestial.module.util.FtHelper;
import celestial.rJY;
import celestial.rXe_1;
import celestial.rrAD;
import celestial.rrAT;
import celestial.rrIk_1;
import celestial.rrIz_1;
import celestial.rrNW;
import celestial.rrNa_1;
import celestial.rrNd_1;
import celestial.rrNh_1;
import celestial.rrNt_1;
import celestial.rrNw_1;
import celestial.rrTF;
import celestial.rrcj_3;
import celestial.rrfD_2;
import celestial.rrpQ_2;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpz_3
extends rrTF<FtHelper> {
    private static String[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;
    private static boolean[] id_case;
    public Object[] id_class;

    private static void id_byte() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[10] = true;
        id_case = blArray;
    }

    public rrpz_3(FtHelper ftHelper, GroupSetting groupSetting) {
        super(ftHelper);
        ArrayList arrayList;
        this.id_implements();
        this.id_class[rrpz_3.id_protected[0]] = arrayList = new ArrayList();
        rrIk_1 rrIk_12 = new rrIk_1(id_break[0], id_case[0]);
        this.id_class[rrpz_3.id_protected[1]] = rrIk_12;
        rrIk_1 rrIk_13 = (rrIk_1)new rrIk_1(id_break[1], id_case[1]).id_class(() -> {
            this.id_implements();
            return ((rrIk_1)this.id_class[id_protected[28]]).id_class();
        });
        this.id_class[rrpz_3.id_protected[2]] = rrIk_13;
        rrIz_1 rrIz_12 = (rrIz_1)new rrIz_1(id_break[2], Color.GREEN.getRGB()).id_class(() -> {
            this.id_implements();
            return ((rrIk_1)this.id_class[id_protected[27]]).id_class();
        });
        this.id_class[rrpz_3.id_protected[3]] = rrIz_12;
        rrIz_1 rrIz_13 = (rrIz_1)new rrIz_1(id_break[3], Color.BLUE.getRGB()).id_class(() -> {
            this.id_implements();
            return ((rrIk_1)this.id_class[id_protected[26]]).id_class();
        });
        this.id_class[rrpz_3.id_protected[4]] = rrIz_13;
        rrIz_1 rrIz_14 = (rrIz_1)new rrIz_1(id_break[4], Color.CYAN.getRGB()).id_class(() -> {
            this.id_implements();
            return ((rrIk_1)this.id_class[id_protected[25]]).id_class();
        });
        this.id_class[rrpz_3.id_protected[5]] = rrIz_14;
        Setting[] settingArray = new Setting[id_byte[0]];
        settingArray[rrpz_3.id_case[2]] = (rrIk_1)this.id_class[id_protected[6]];
        settingArray[rrpz_3.id_case[3]] = (rrIk_1)this.id_class[id_protected[7]];
        settingArray[rrpz_3.id_byte[1]] = (rrIz_1)this.id_class[id_protected[8]];
        settingArray[rrpz_3.id_byte[2]] = (rrIz_1)this.id_class[id_protected[9]];
        settingArray[rrpz_3.id_byte[3]] = (rrIz_1)this.id_class[id_protected[10]];
        groupSetting.id_class(settingArray);
    }

    static {
        rrpz_3.ntfClinit();
    }

    @EventTarget
    public void id_class(rrAD rrAD2) {
        this.id_implements();
        Ml_1 ml_1 = rrAD2.id_break();
        rJY rJY2 = rrAD2.id_case();
        if (!rJY2.id_break()) {
            return;
        }
        int n = rrAD2.id_byte();
        int n2 = rrAD2.id_throws();
        int n3 = rrAD2.id_protected();
        int n4 = rrAD2.id_class();
        for (rrpQ_2 rrpQ_22 : (List)this.id_class[id_protected[20]]) {
            rrNt_1 rrNt_12 = rrpQ_22.id_byte();
            if (!rJY2.equals(rrNt_12.id_throws())) continue;
            int n5 = Color.WHITE.getRGB();
            if (rrpQ_22.id_break()) {
                n5 = (Integer)((rrIz_1)this.id_class[id_protected[21]]).id_byte();
            } else if (rrpQ_22.id_class()) {
                n5 = (Integer)((rrIz_1)this.id_class[id_protected[22]]).id_byte();
            } else if (rrpQ_22.id_protected()) {
                n5 = (Integer)((rrIz_1)this.id_class[id_protected[23]]).id_byte();
            }
            rrfD_2.id_protected(ml_1, n, n2, n3, n4, n5);
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-73, -42, 101, -109, -104, 56, -30, 50}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1760931A;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4177EABCE74E9626L;
    }

    private <T> Comparator<T> id_class(Function<T, rrNt_1> function) {
        return Comparator.comparingDouble(object -> {
            rrNt_1 rrNt_12 = (rrNt_1)function.apply(object);
            double d = Math.max(id_case[7], rrNt_12.id_case());
            double d2 = Math.max(id_case[8], rrNt_12.id_throws().id_class().id_char());
            return d / d2;
        });
    }

    @EventTarget
    public void id_class(rrAT rrAT2) {
        Object object;
        Object object22;
        this.id_implements();
        if (!(rrAT2.id_class() instanceof rXe_1)) {
            return;
        }
        if (!((rrIk_1)this.id_class[id_protected[11]]).id_class().booleanValue()) {
            return;
        }
        if (!((List)this.id_class[id_protected[12]]).isEmpty()) {
            ((List)this.id_class[id_protected[13]]).clear();
        }
        rrNW rrNW2 = ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_protected[14]])).id_throws();
        long l = C_throws.id_byte().id_native().id_byte();
        if (rrNW2.id_case() || !rrNW2.id_byte(rrNW2.id_switch())) {
            return;
        }
        List<rJY> list = rrNW2.id_int();
        List<rrNt_1> list2 = rrNW2.id_synchronized();
        if (list.isEmpty() || list2.isEmpty()) {
            return;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        boolean bl = ((rrIk_1)this.id_class[id_protected[15]]).id_class();
        for (rJY object32 : list) {
            object22 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[id_protected[16]]).id_break(object32);
            if (object22 == null) continue;
            object = ((rrNw_1)object22).id_catch();
            int n = ((rrNw_1)object22).id_case();
            if (n == id_byte[4] || object == null || ((String)object).equals(id_import.id_while().id_byte()) || !bl && l < (long)n) continue;
            arrayList.add(object22);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object object22 : arrayList) {
            ((rrNw_1)object22).id_class(((rrNw_1)object22).id_throws().id_class());
            ((rrNt_1)object22).id_class(list2);
            ((rrNt_1)object22).id_break(list);
            arrayList2.add(object22);
        }
        Comparator<rrNt_1> comparator = this.id_extends();
        object22 = this.id_throws();
        object = arrayList2.stream().min(comparator).orElse(null);
        ArrayList<rrpQ_2> arrayList3 = new ArrayList<rrpQ_2>();
        Object object3 = arrayList2.iterator();
        block2: while (object3.hasNext()) {
            rrNt_1 rrNt_12 = (rrNt_1)object3.next();
            if (object != null && rrNt_12.equals(object)) {
                ((List)this.id_class[id_protected[17]]).add(new rrpQ_2(rrNt_12).id_byte(id_case[4]));
                continue;
            }
            for (rrNd_1 rrNd_12 : ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_protected[18]])).id_protected()) {
                if (!rrNd_12.id_while() || !rrNd_12.id_class(rrNt_12, rrcT_22 -> {
                    if (rrcT_22 instanceof rrcj_3 && bl) {
                        return id_case[9];
                    }
                    return id_case[10];
                })) continue;
                arrayList3.add(new rrpQ_2(rrNt_12).id_class(id_case[5]));
                continue block2;
            }
        }
        object3 = arrayList3.stream().min(object22).orElse(null);
        for (rrpQ_2 rrpQ_22 : arrayList3) {
            if (object3 != null && rrpQ_22.equals(object3)) {
                rrpQ_22.id_break(id_case[6]);
            }
            ((List)this.id_class[id_protected[19]]).add(rrpQ_22);
        }
    }

    private static void id_break() {
        id_break = new String[]{new String("\u0412\u044b\u0434\u0435\u043b\u044f\u0442\u044c \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b \u043d\u0430\n\u0430\u0443\u043a\u0446\u0438\u043e\u043d\u0435"), new String("\u0412\u044b\u0434\u0435\u043b\u044f\u0442\u044c \u0435\u0441\u043b\u0438\n\u043d\u0435\u0434\u043e\u0441\u0442\u0430\u0442\u043e\u0447\u043d\u043e \u0434\u0435\u043d\u0435\u0433 \u0434\u043b\u044f\n\u043f\u043e\u043a\u0443\u043f\u043a\u0438"), new String("\u0426\u0432\u0435\u0442 \u0441\u0430\u043c\u043e\u0433\u043e \u0434\u0435\u0448\u0451\u0432\u043e\u0433\u043e\n\u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430"), new String("\u0426\u0432\u0435\u0442 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430 \u043a\u043e\u0442\u043e\u0440\u044b\u0439\n\u043a\u0443\u043f\u0438\u0442 \u0430\u0432\u0442\u043e\u0431\u0430\u0439"), new String("\u0426\u0432\u0435\u0442 \u0441\u0430\u043c\u043e\u0433\u043e \u0434\u0435\u0448\u0451\u0432\u043e\u0433\u043e\n\u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430 \u043a\u043e\u0442\u043e\u0440\u044b\u0439 \u043a\u0443\u043f\u0438\u0442\n\u0430\u0432\u0442\u043e\u0431\u0430\u0439")};
    }

    private Comparator<rrpQ_2> id_throws() {
        return this.id_class(rrpQ_2::id_byte);
    }

    private static /* synthetic */ void ntfClinit() {
        rrpz_3.id_byte();
        rrpz_3.id_break();
        rrpz_3.id_case();
        rrpz_3.id_finally();
    }

    private static void id_finally() {
        id_byte = new byte[]{5, 2, 3, 4, -1, 6};
    }

    private Comparator<rrNt_1> id_extends() {
        return this.id_class(Function.identity());
    }

    private static void id_case() {
        short[] sArray = new short[29];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 4;
        sArray[5] = 5;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 3;
        sArray[9] = 4;
        sArray[10] = 5;
        sArray[11] = 1;
        sArray[15] = 2;
        sArray[21] = 3;
        sArray[22] = 5;
        sArray[23] = 4;
        sArray[25] = 1;
        sArray[26] = 1;
        sArray[27] = 1;
        sArray[28] = 1;
        id_protected = sArray;
    }

    private void id_implements() {
        if (this.id_class == null) {
            this.id_class = new Object[6];
        }
    }

    @Override
    public boolean aK_() {
        this.id_implements();
        ((List)this.id_class[id_protected[24]]).clear();
        return super.aK_();
    }
}

