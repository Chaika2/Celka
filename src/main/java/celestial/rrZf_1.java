/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.ThemeManager;
import celestial.rrZH;
import celestial.rrZN;
import celestial.rrZT;
import celestial.rrZl_1;
import celestial.rrZq_1;
import celestial.rrtY_2;
import celestial.rrtu_3;
import celestial.rruv_1;
import celestial.rrvB;
import celestial.rrvJ;
import celestial.rrvP;
import celestial.rrvk_1;
import celestial.ui.clickgui.ClickGuiScreen;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZf_1
extends rrZN
implements rrZT,
rrZq_1<rrvB> {
    private static float[] id_protected;
    private static double[] id_throws;
    public Object[] id_break;
    public static Object[] id_byte;
    private static short[] id_case;
    private static byte[] id_catch;
    private static boolean[] id_private;

    @Override
    public List<rrvB> id_byte() {
        this.id_int();
        Predicate<rrvB> predicate = rrvB2 -> {
            this.id_int();
            rrtY_2 rrtY_22 = ((rrvJ)this.id_break[id_case[25]]).id_finally().id_extends();
            String string = rrtY_22.id_final();
            String string2 = rrvB2.id_break().id_byte();
            if (rrtY_22.id_new()) {
                return id_private[11];
            }
            return string2.toLowerCase().contains(string.trim().toLowerCase());
        };
        return ((List)this.id_break[id_case[20]]).stream().filter(predicate).toList();
    }

    private void id_int() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_catch[11]];
            objectArray[rrZf_1.id_catch[12]] = id_private[16];
        }
    }

    public rrZf_1(rrvJ rrvJ2, int n, int n2) {
        ArrayList arrayList;
        this.id_int();
        this.id_break[rrZf_1.id_case[0]] = arrayList = new ArrayList();
        rrvJ rrvJ3 = rrvJ2;
        this.id_break[rrZf_1.id_case[1]] = rrvJ3;
        Integer n3 = n;
        this.id_break[rrZf_1.id_case[2]] = n3;
        rrZl_1 rrZl_12 = new rrZl_1(new rrZH(id_protected[0]));
        this.id_break[rrZf_1.id_case[3]] = rrZl_12;
        Supplier<Float> supplier = () -> Float.valueOf((float)rrvJ2.id_volatile().id_abstract() + (float)n);
        Supplier<Float> supplier2 = () -> Float.valueOf((float)rrvJ2.id_volatile().id_finally() + (float)n2);
        rrvP[] rrvPArray = ((ThemeManager)((Object)ThemeManager.staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311[id_case[4]])).id_class();
        int n4 = rrvPArray.length;
        for (int i = id_private[0]; i < n4; ++i) {
            rrvP rrvP2 = rrvPArray[i];
            ((List)this.id_break[id_case[5]]).add(new rrvB(this, rrvP2, supplier, supplier2, id_catch[0], id_catch[1]));
        }
    }

    static {
        rrZf_1.ntfClinit();
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, double d, boolean bl) {
        this.id_int();
        short s = id_case[10];
        boolean bl2 = this.id_class((Integer)rrvk_1.id_class[id_case[11]], (Integer)rrvk_1.id_class[id_case[12]], ((rrvJ)this.id_break[id_case[13]]).id_volatile().id_abstract() + (Integer)this.id_break[id_case[14]], ((rrvJ)this.id_break[id_case[15]]).id_volatile().id_finally() + id_catch[5], id_case[16] - (Integer)this.id_break[id_case[17]] - id_catch[6], id_protected[14]);
        this.id_finally().id_class(bl2 && super.id_class(rrtu_32, n, n2, d, bl) ? id_private[7] : id_private[8], d, id_throws[0]);
        return ((rrZl_1)this.id_break[id_case[18]]).id_class(rrtu_32, n, n2, d, bl);
    }

    @Override
    public boolean id_class(Ml_1 ml_1, rrtu_3 rrtu_32, float f, float f2, float f3, float f4, int n, int n2, boolean bl) {
        short s = id_case[6];
        this.id_implements().id_class(() -> {
            this.id_int();
            List<rrvB> list = this.id_byte();
            AnimValue animValue = this.id_implements().id_class();
            float f4 = id_protected[15];
            float f5 = id_protected[16];
            animValue.id_class(!this.ai_() ? id_private[12] : id_private[13]);
            this.id_finally().id_class(this.id_break(), id_protected[17]);
            float f6 = animValue.id_byte();
            float f7 = (id_protected[18] - f6) * id_protected[19];
            for (int i = id_private[14]; i < list.size(); ++i) {
                rrvB rrvB2 = list.get(i);
                f4 += id_protected[20];
                if (i % id_catch[9] == 0) {
                    f4 = id_protected[21];
                    f5 += id_protected[22];
                }
                rrvB2.id_class(f4, f5 + this.id_finally().id_case() + f7);
                rruv_1 rruv_12 = rrvB2.id_protected();
                if (rruv_12.id_protected() < f2 || rruv_12.id_protected() > f2 + id_protected[23] + id_protected[24] + id_protected[25] + id_protected[26]) continue;
                rrvB2.id_class(ml_1, rrtu_32, n, n2, rruv_12, bl, id_private[15]);
            }
            this.id_implements().id_class(ml_1, (rrZl_1)this.id_break[id_case[26]], rrtu_32, f + f3 - id_protected[27], f2 + id_protected[28] + id_protected[29], n, n2, id_protected[30], id_protected[31], this.id_break() - id_catch[10], id_case[27], bl);
        }, ml_1, f, f2, id_protected[1], id_protected[2]);
        rrvJ.id_class(ml_1, this.id_finally(), f + id_protected[3] + id_protected[4], f2 + id_protected[5] + id_protected[6], f2 + id_protected[7] + id_protected[8] - id_protected[9], id_protected[10], id_protected[11]);
        return id_private[1];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9E912E2B3BD7C26BL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE3180B2F;
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_int();
        ClickGuiScreen clickGuiScreen = ((rrvJ)this.id_break[id_case[7]]).id_volatile();
        int n4 = clickGuiScreen.id_abstract();
        int n5 = clickGuiScreen.id_finally();
        if (!this.id_class(n, n2, n4 + id_catch[2], n5 + id_catch[3] + id_catch[4], id_protected[12], id_protected[13])) {
            this.id_throws();
            return id_private[2];
        }
        if (!super.id_class(rrtu_32, n, n2, n3, bl)) {
            return id_private[3];
        }
        ((rrZl_1)this.id_break[id_case[8]]).id_class(rrtu_32, n, n2, n3, bl);
        List<rrvB> list = this.id_byte();
        for (int i = list.size() - id_private[4]; i >= 0; --i) {
            rrvB rrvB2 = list.get(i);
            if (!rrvB2.id_class(rrtu_32, n, n2, n3, bl)) continue;
            return id_private[5];
        }
        this.id_throws();
        return id_private[6];
    }

    @Override
    public int id_break() {
        List<rrvB> list = this.id_byte();
        return list.stream().filter(rrvB2 -> list.indexOf(rrvB2) % id_catch[8] == 0 ? id_private[9] : id_private[10]).mapToInt(rrvB2 -> rrvB2.id_extends() + id_catch[7]).sum();
    }

    @Override
    public void id_break(int n, int n2, int n3) {
        this.id_int();
        ((rrZl_1)this.id_break[id_case[9]]).id_break(n, n2, n3);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{84, 38, 123, -40, 20, 70, 88, -102}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrZf_1.id_package();
        rrZf_1.id_continue();
        rrZf_1.id_super();
        rrZf_1.id_final();
        rrZf_1.id_volatile();
        rrZf_1.id_new();
    }

    public rrZH id_finally() {
        this.id_int();
        return ((rrZl_1)this.id_break[id_case[23]]).id_extends();
    }

    public rrvJ id_extends() {
        this.id_int();
        return (rrvJ)this.id_break[id_case[22]];
    }

    @Override
    public rrZl_1 id_case() {
        this.id_int();
        return (rrZl_1)this.id_break[id_case[21]];
    }

    private static void id_continue() {
        short[] sArray = new short[28];
        sArray[0] = 2;
        sArray[2] = 3;
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[6] = 252;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[10] = 252;
        sArray[12] = 1;
        sArray[14] = 3;
        sArray[16] = 363;
        sArray[17] = 3;
        sArray[18] = 1;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[21] = 1;
        sArray[23] = 1;
        sArray[24] = 1;
        sArray[26] = 1;
        sArray[27] = 255;
        id_case = sArray;
    }

    private static void id_new() {
        Object[] objectArray = new Object[]{75, 30, 83, 38};
        id_byte = objectArray;
    }

    private static void id_package() {
        boolean[] blArray = new boolean[19];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[18] = true;
        id_private = blArray;
    }

    private static void id_super() {
        float[] fArray = new float[32];
        fArray[0] = 0.5f;
        fArray[1] = 363.0f;
        fArray[2] = 299.0f;
        fArray[3] = 100.0f;
        fArray[4] = 1.0f;
        fArray[5] = 30.0f;
        fArray[6] = 4.0f;
        fArray[7] = 252.0f;
        fArray[8] = 38.0f;
        fArray[9] = 10.0f;
        fArray[10] = 253.0f;
        fArray[11] = 20.0f;
        fArray[12] = 263.0f;
        fArray[13] = 266.0f;
        fArray[14] = 252.0f;
        fArray[17] = 257.0f;
        fArray[18] = 1.0f;
        fArray[19] = 5.0f;
        fArray[20] = 83.0f;
        fArray[22] = 38.0f;
        fArray[23] = 252.0f;
        fArray[24] = 38.0f;
        fArray[25] = 1.0f;
        fArray[26] = 10.0f;
        fArray[27] = 9.0f;
        fArray[28] = 4.0f;
        fArray[29] = 38.0f;
        fArray[30] = 5.0f;
        fArray[31] = 251.0f;
        id_protected = fArray;
    }

    @Override
    public void id_private() {
        this.id_int();
        super.id_private();
        ((rrZl_1)this.id_break[id_case[19]]).id_private();
    }

    private static void id_final() {
        id_throws = new double[]{25.0};
    }

    private static void id_volatile() {
        id_catch = new byte[]{75, 30, 100, 30, 4, 38, 5, 8, 3, 3, 6, 4, 3, 4, 75, 30, 2, 83, 3, 38};
    }

    public rrZl_1 id_native() {
        this.id_int();
        return (rrZl_1)this.id_break[id_case[24]];
    }
}

