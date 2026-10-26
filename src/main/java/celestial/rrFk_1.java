/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.cb_3;
import celestial.manager.FontManager;
import celestial.rLR;
import celestial.rLY;
import celestial.rrAN;
import celestial.rrFK;
import celestial.rrFN;
import celestial.rrFQ;
import celestial.rrFW;
import celestial.rrFc_1;
import celestial.rrFd_1;
import celestial.rrFl_1;
import celestial.rrFz_1;
import celestial.rrLC;
import celestial.rrLI;
import celestial.rrZF;
import celestial.rrZO;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFk_1
extends rrFl_1<rrFz_1> {
    private static String[] id_protected;
    private static boolean[] id_throws;
    public static Object[] id_class;
    private static double[] id_case;
    private static float[] id_catch;
    private static byte[] id_private;
    public Object[] id_break;
    private static short[] id_implements;

    @Override
    public Collection<rrFz_1> id_byte() {
        this.id_final();
        return (List)this.id_break[id_implements[25]];
    }

    private static void id_int() {
        id_case = new double[]{140.0};
    }

    public rrFk_1(rrFd_1 rrFd_12) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.id_final();
        this.id_break[rrFk_1.id_implements[0]] = arrayList2 = new ArrayList();
        this.id_break[rrFk_1.id_implements[1]] = arrayList = new ArrayList();
        rrFN rrFN2 = new rrFN();
        this.id_break[rrFk_1.id_implements[2]] = rrFN2;
        rrFd_1 rrFd_13 = rrFd_12;
        this.id_break[rrFk_1.id_implements[3]] = rrFd_13;
        ((List)this.id_break[id_implements[4]]).add(new rrFc_1(this, id_protected[0], id_protected[1], id_protected[2]));
    }

    static {
        rrFk_1.ntfClinit();
    }

    public void id_class(rrAN rrAN2) {
        this.id_final();
        rLR rLR2 = rrAN2.id_class();
        for (rrFz_1 rrFz_12 : (List)this.id_break[id_implements[21]]) {
            rrFQ rrFQ2;
            if (!(rrFz_12 instanceof rrFQ) || !(rrFQ2 = (rrFQ)rrFz_12).id_private().id_class().equals(rLR2)) continue;
            rrFz_12.id_class(id_throws[8]);
            ((List)this.id_break[id_implements[22]]).remove(rrFz_12);
            break;
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{40, -71, 69, 58, -115, -36, 8, 64}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(Ml_1 ml_1, float f, float f2) {
        this.id_final();
        float f3 = ((rrFd_1)this.id_break[id_implements[5]]).id_long();
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_implements[6]]).id_class();
        this.id_break(id_catch[0]);
        float f4 = this.id_finally();
        float f5 = this.id_protected();
        rrZO2.id_class(MinecraftAccessor.id_strictfp);
        float f6 = (float)Math.sin((double)System.currentTimeMillis() / id_case[0]) * id_catch[1] + id_catch[2];
        float f7 = id_catch[3];
        for (rrFz_1 rrFz_12 : this.id_byte()) {
            AnimValue animValue = rrFz_12.id_class();
            if (!animValue.id_case()) continue;
            float f8 = animValue.id_byte();
            float f9 = animValue.id_continue();
            if (rrFz_12 instanceof rrFQ) {
                rrFQ rrFQ2 = (rrFQ)rrFz_12;
                rLY rLY2 = rrFQ2.id_private();
                f7 = rLY2.id_break() <= id_implements[7] ? f6 : id_catch[4];
            }
            int n = ColorHelper.id_break(rrZF.d_, (int)(id_catch[5] * f7 * f8 * f3));
            float f10 = f5 * id_catch[6] * f9;
            float f11 = f + id_catch[7];
            float f12 = f2 + f4 - f10;
            String string = rrFz_12.id_protected();
            String string2 = rrFz_12.id_break();
            rrZO2.id_break(ml_1, MinecraftAccessor.id_strictfp, string, f11, f12, n, id_throws[0], id_throws[1]);
            rrZO2.id_break(ml_1, MinecraftAccessor.id_strictfp, string2, f11 + ((rrFd_1)this.id_break[id_implements[8]]).id_implements() - rrZO2.id_break(string2) - id_catch[8], f12, n, id_throws[2], id_throws[3]);
            float f13 = f5 * f8;
            f4 += f13;
            this.id_class(f13);
        }
        rrZO2.id_byte(MinecraftAccessor.id_strictfp);
    }

    public void id_class(rrFK rrFK2) {
        this.id_final();
        ((List)this.id_break[id_implements[24]]).removeIf(rrFz_12 -> !rrFz_12.id_byte() ? id_throws[9] : id_throws[10]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE51A738F54B1E63CL;
    }

    @Override
    public float id_class(rrFz_1 rrFz_12) {
        String string = rrFz_12.id_protected() + rrFz_12.id_break();
        return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_implements[26]]).id_class().id_break(string) + id_catch[9];
    }

    public void id_class(rrLI rrLI2) {
        this.id_final();
        rLY rLY2 = rrLI2.id_break();
        rLR rLR2 = rLY2.id_class();
        for (rrFz_1 rrFz_12 : (List)this.id_break[id_implements[23]]) {
            rrFQ rrFQ2;
            if (!(rrFz_12 instanceof rrFQ) || !(rrFQ2 = (rrFQ)rrFz_12).id_private().id_class().equals(rLR2)) continue;
            rrFQ2.id_class(rLY2);
            break;
        }
    }

    public List<rrFz_1> id_class() {
        this.id_final();
        return (List)this.id_break[id_implements[27]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7A14C58B;
    }

    public void id_class(rrLC rrLC2) {
        this.id_final();
        rLY rLY2 = rrLC2.id_break();
        rrFQ rrFQ2 = new rrFQ(rLY2);
        ((List)this.id_break[id_implements[16]]).remove(rrFQ2);
        ((List)this.id_break[id_implements[17]]).add(rrFQ2);
        if (((List)this.id_break[id_implements[18]]).size() > id_throws[7]) {
            ((List)this.id_break[id_implements[19]]).sort((Comparator)this.id_break[id_implements[20]]);
        }
    }

    public rrFd_1 id_break() {
        this.id_final();
        return (rrFd_1)this.id_break[id_implements[29]];
    }

    @Override
    public void id_throws() {
        this.id_final();
        super.id_throws();
        Collection<rrFz_1> collection = this.id_byte();
        Boolean bl = id_throws[4];
        this.id_break[rrFk_1.id_implements[10]] = bl;
        ((List)this.id_break[id_implements[11]]).clear();
        if (!collection.isEmpty()) {
            Iterator<rrFz_1> iterator = collection.iterator();
            while (iterator.hasNext()) {
                rrFz_1 rrFz_12 = iterator.next();
                AnimValue animValue = rrFz_12.id_class();
                boolean bl2 = rrFz_12.id_byte();
                if (!bl2 && animValue.id_catch()) {
                    iterator.remove();
                    continue;
                }
                if (rrFz_12 instanceof rrFQ) {
                    rrFQ rrFQ2 = (rrFQ)rrFz_12;
                    if ((cb_3)MinecraftAccessor.id_import.id_class[id_implements[12]] != null && !((cb_3)MinecraftAccessor.id_import.id_class[id_implements[13]]).id_break(rrFQ2.id_private().id_class())) {
                        rrFQ2.id_class(id_throws[5]);
                    }
                    rrFQ2.id_catch();
                }
                if (!rrFz_12.id_throws()) continue;
                ((List)this.id_break[id_implements[14]]).add(rrFz_12);
                if (bl2) continue;
                Boolean bl3 = id_throws[6];
                this.id_break[rrFk_1.id_implements[15]] = bl3;
            }
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrFk_1.id_package();
        rrFk_1.id_new();
        rrFk_1.id_volatile();
        rrFk_1.id_continue();
        rrFk_1.id_int();
        rrFk_1.id_native();
        rrFk_1.id_extends();
    }

    public void id_catch() {
        this.id_final();
        for (rrFz_1 rrFz_12 : (List)this.id_break[id_implements[9]]) {
            rrFz_12.id_class(rrFz_12.id_throws());
        }
    }

    private static void id_extends() {
        Object[] objectArray = new Object[]{new rrFW()};
        id_class = objectArray;
    }

    public Comparator<rrFz_1> id_case() {
        this.id_final();
        return (Comparator)this.id_break[id_implements[31]];
    }

    private static void id_continue() {
        id_catch = new float[]{18.0f, 0.5f, 0.5f, 1.0f, 1.0f, 255.0f, 0.8f, 3.0f, 5.0f, 15.0f, 10.0f};
    }

    public List<rrFz_1> id_implements() {
        this.id_final();
        return (List)this.id_break[id_implements[30]];
    }

    private static void id_new() {
        id_protected = new String[]{new String("Preview Potion"), new String("999"), new String("**:**")};
    }

    private static void id_package() {
        boolean[] blArray = new boolean[14];
        blArray[6] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[13] = true;
        id_throws = blArray;
    }

    @Override
    public float id_protected() {
        return id_catch[10];
    }

    public boolean id_private() {
        this.id_final();
        return (Boolean)this.id_break[id_implements[28]];
    }

    private void id_final() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_private[0]];
            objectArray[rrFk_1.id_private[1]] = id_throws[12];
        }
    }

    private static void id_volatile() {
        short[] sArray = new short[32];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[2] = 3;
        sArray[4] = 1;
        sArray[7] = 200;
        sArray[9] = 1;
        sArray[10] = 4;
        sArray[11] = 2;
        sArray[12] = 57;
        sArray[13] = 57;
        sArray[14] = 2;
        sArray[15] = 4;
        sArray[16] = 1;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[19] = 1;
        sArray[20] = 3;
        sArray[21] = 1;
        sArray[22] = 2;
        sArray[23] = 1;
        sArray[24] = 1;
        sArray[25] = 1;
        sArray[27] = 2;
        sArray[28] = 4;
        sArray[30] = 1;
        sArray[31] = 3;
        id_implements = sArray;
    }

    private static void id_native() {
        id_private = new byte[]{5, 4};
    }
}

