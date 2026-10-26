/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rrQX;
import celestial.rrZH;
import celestial.rrZN;
import celestial.rrZT;
import celestial.rrZi_1;
import celestial.rrZl_1;
import celestial.rrZq_1;
import celestial.rrZt_1;
import celestial.rrtY_2;
import celestial.rrtu_3;
import celestial.rruv_1;
import celestial.rrvJ;
import celestial.rrvk_1;
import celestial.ui.clickgui.ClickGuiScreen;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZI
extends rrZN
implements rrZT,
rrZq_1<rrZi_1> {
    private static String[] id_protected;
    public static Object[] id_break;
    private static float[] id_throws;
    private static double[] id_case;
    private static short[] id_catch;
    private static byte[] id_private;
    private static boolean[] id_implements;
    public Object[] id_byte;

    @Override
    public List<rrZi_1> id_byte() {
        this.id_package();
        Predicate<rrZi_1> predicate = rrZi_12 -> {
            this.id_package();
            Module module = rrZi_12.id_private();
            rrtY_2 rrtY_22 = ((rrvJ)this.id_byte[id_catch[22]]).id_finally().id_extends();
            String string = rrtY_22.id_final().trim().toLowerCase();
            boolean bl = rrtY_22.id_new();
            if (bl) {
                return module.id_int() == (Category)((Object)((Object)rrZt_1.id_byte[id_catch[23]])) ? id_implements[10] : id_implements[11];
            }
            String string2 = module.id_final().replaceAll(id_protected[0], id_protected[1]).toLowerCase();
            String string3 = module.id_final().toLowerCase();
            String string4 = module.ay_().toLowerCase();
            return string2.contains(string) || string3.contains(string) || string4.contains(string) ? id_implements[12] : id_implements[13];
        };
        return ((List)this.id_byte[id_catch[17]]).stream().filter(predicate).toList();
    }

    private static void id_int() {
        id_case = new double[]{25.0};
    }

    public rrZI(rrvJ rrvJ2, rrtu_3 rrtu_32, int n, int n2) {
        EnumMap enumMap;
        ArrayList arrayList;
        this.id_package();
        this.id_byte[rrZI.id_catch[0]] = arrayList = new ArrayList();
        this.id_byte[rrZI.id_catch[1]] = enumMap = new EnumMap(Category.class);
        rrvJ rrvJ3 = rrvJ2;
        this.id_byte[rrZI.id_catch[2]] = rrvJ3;
        Integer n3 = n;
        this.id_byte[rrZI.id_catch[3]] = n3;
        Supplier<Float> supplier = () -> Float.valueOf((float)rrvJ2.id_volatile().id_abstract() + (float)n);
        Supplier<Float> supplier2 = () -> Float.valueOf((float)rrvJ2.id_volatile().id_finally() + (float)n2);
        for (Module module : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[4]]).id_private().g()) {
            ((List)this.id_byte[id_catch[5]]).add(new rrZi_1(this, rrtu_32, rrvJ2.id_volatile(), module, supplier, supplier2, id_private[0], id_private[1]));
        }
    }

    static {
        rrZI.ntfClinit();
    }

    private static void id_this() {
        short[] sArray = new short[26];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[3] = 3;
        sArray[5] = 1;
        sArray[6] = 253;
        sArray[8] = 253;
        sArray[10] = 1;
        sArray[12] = 3;
        sArray[14] = 363;
        sArray[15] = 3;
        sArray[16] = 2;
        sArray[17] = 1;
        sArray[18] = 2;
        sArray[19] = 5;
        sArray[21] = 1;
        sArray[23] = 5;
        sArray[24] = 255;
        sArray[25] = 255;
        id_catch = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2BB6A3A106696122L;
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_package();
        ClickGuiScreen clickGuiScreen = ((rrvJ)this.id_byte[id_catch[7]]).id_volatile();
        int n4 = clickGuiScreen.id_abstract();
        int n5 = clickGuiScreen.id_finally();
        if (!this.id_class(n, n2, n4 + id_private[2], n5 + id_private[3] + id_private[4], id_throws[11], id_throws[12])) {
            this.id_throws();
            return id_implements[1];
        }
        if (!super.id_class(rrtu_32, n, n2, n3, bl)) {
            return id_implements[2];
        }
        this.id_volatile().id_class(rrtu_32, n, n2, n3, bl);
        List<rrZi_1> list = this.id_byte();
        for (int i = list.size() - id_implements[3]; i >= 0; --i) {
            rrZi_1 rrZi_12 = list.get(i);
            if (!rrZi_12.id_class(rrtu_32, n, n2, n3, bl)) continue;
            return id_implements[4];
        }
        this.id_throws();
        return id_implements[5];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAB251677;
    }

    @Override
    public void id_class(Category category, Category category2) {
        this.id_implements().id_class().id_extends();
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, double d, boolean bl) {
        this.id_package();
        short s = id_catch[8];
        boolean bl2 = this.id_class((Integer)rrvk_1.id_class[id_catch[9]], (Integer)rrvk_1.id_class[id_catch[10]], ((rrvJ)this.id_byte[id_catch[11]]).id_volatile().id_abstract() + (Integer)this.id_byte[id_catch[12]], ((rrvJ)this.id_byte[id_catch[13]]).id_volatile().id_finally() + id_private[5], id_catch[14] - (Integer)this.id_byte[id_catch[15]] - id_private[6], s);
        this.id_extends().id_class(bl2 && super.id_class(rrtu_32, n, n2, d, bl) ? id_implements[6] : id_implements[7], d, id_case[0]);
        return this.id_volatile().id_class(rrtu_32, n, n2, d, bl);
    }

    @Override
    public boolean id_class(Ml_1 ml_1, rrtu_3 rrtu_32, float f, float f2, float f3, float f4, int n, int n2, boolean bl) {
        short s = id_catch[6];
        rrZl_1 rrZl_12 = this.id_volatile();
        rrZH rrZH2 = rrZl_12.id_extends();
        this.id_implements().id_class(() -> {
            List<rrZi_1> list = this.id_byte();
            AnimValue animValue = this.id_implements().id_class();
            int n3 = this.id_break();
            float f4 = id_throws[14];
            float f5 = id_throws[15];
            animValue.id_class(!this.ai_() ? id_implements[14] : id_implements[15]);
            rrZH2.id_class(n3, id_throws[16]);
            float f6 = animValue.id_byte();
            float f7 = (id_throws[17] - f6) * id_throws[18];
            for (int i = id_implements[16]; i < list.size(); ++i) {
                rrZi_1 rrZi_12 = list.get(i);
                f4 += id_throws[19];
                if (i % id_private[9] == 0) {
                    f4 = id_throws[20];
                    f5 += id_throws[21];
                }
                rrZi_12.id_class(f4, f5 + rrZH2.id_case() + f7);
                rruv_1 rruv_12 = rrZi_12.id_protected();
                if (rruv_12.id_protected() < f2 || rruv_12.id_protected() > f2 + id_throws[22] + id_throws[23] + id_throws[24]) continue;
                rrZi_12.id_class(ml_1, rrtu_32, n, n2, rruv_12, bl, id_implements[17]);
            }
            this.id_implements().id_class(ml_1, rrZl_12, rrtu_32, f + f3 - id_throws[25], f2 + id_throws[26] + id_throws[27], n, n2, id_throws[28], id_throws[29], n3 - id_private[10], id_catch[24], bl);
        }, ml_1, f, f2, id_throws[0], id_throws[1]);
        rrvJ.id_class(ml_1, rrZH2, f + id_throws[2] + id_throws[3], f2 + id_throws[4] + id_throws[5], f2 + id_throws[6] + id_throws[7] - id_throws[8], id_throws[9], id_throws[10]);
        return id_implements[0];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{24, -43, -26, 62, -71, 3, 22, 1}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break(int n, int n2, int n3) {
        this.id_volatile().id_break(n, n2, n3);
    }

    @Override
    public int id_break() {
        List<rrZi_1> list = this.id_byte();
        return list.stream().filter(rrZi_12 -> list.indexOf(rrZi_12) % id_private[8] == 0 ? id_implements[8] : id_implements[9]).mapToInt(rrZi_12 -> rrZi_12.id_break() + id_private[7]).sum();
    }

    private static /* synthetic */ void ntfClinit() {
        rrZI.id_else();
        rrZI.id_new();
        rrZI.id_this();
        rrZI.id_super();
        rrZI.id_int();
        rrZI.id_continue();
        rrZI.id_final();
    }

    public List<rrZi_1> id_finally() {
        this.id_package();
        return (List)this.id_byte[id_catch[21]];
    }

    public rrZH id_extends() {
        return this.id_volatile().id_extends();
    }

    @Override
    public rrZl_1 id_case() {
        return this.id_volatile();
    }

    private static void id_continue() {
        id_private = new byte[]{117, 30, 100, 30, 4, 37, 5, 7, 2, 2, 7, 25, 4, 4, 3, 5, 117, 30, 2, 124, 3, 37, 4};
    }

    private static void id_else() {
        boolean[] blArray = new boolean[22];
        blArray[0] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[20] = true;
        id_implements = blArray;
    }

    private static void id_new() {
        id_protected = new String[]{new String("[- ]"), new String("")};
    }

    private void id_package() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_private[13]];
            objectArray[rrZI.id_private[14]] = id_implements[18];
        }
    }

    private static void id_super() {
        float[] fArray = new float[30];
        fArray[0] = 363.0f;
        fArray[1] = 299.0f;
        fArray[2] = 100.0f;
        fArray[3] = 1.0f;
        fArray[4] = 30.0f;
        fArray[5] = 4.0f;
        fArray[6] = 253.0f;
        fArray[7] = 37.0f;
        fArray[8] = 10.0f;
        fArray[9] = 253.0f;
        fArray[10] = 20.0f;
        fArray[11] = 263.0f;
        fArray[12] = 266.0f;
        fArray[13] = 0.5f;
        fArray[16] = 258.0f;
        fArray[17] = 1.0f;
        fArray[18] = 5.0f;
        fArray[19] = 124.0f;
        fArray[21] = 37.0f;
        fArray[22] = 253.0f;
        fArray[23] = 37.0f;
        fArray[24] = 10.0f;
        fArray[25] = 9.0f;
        fArray[26] = 5.0f;
        fArray[27] = 37.0f;
        fArray[28] = 5.0f;
        fArray[29] = 251.0f;
        id_throws = fArray;
    }

    @Override
    public void id_private() {
        this.id_package();
        super.id_private();
        ((Map)this.id_byte[id_catch[16]]).values().forEach(rrZl_1::id_private);
    }

    private static void id_final() {
        Object[] objectArray = new Object[]{117, 30, 124, 37, -15132391};
        id_break = objectArray;
    }

    public rrZl_1 id_volatile() {
        this.id_package();
        return ((Map)this.id_byte[id_catch[18]]).computeIfAbsent((Category)((Object)rrZt_1.id_byte[id_catch[19]]), category -> new rrZl_1(new rrZH(id_throws[13])));
    }

    public rrvJ id_native() {
        this.id_package();
        return (rrvJ)this.id_byte[id_catch[20]];
    }
}

