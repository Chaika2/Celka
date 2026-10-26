/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.module.Module;
import celestial.rrFE;
import celestial.rrFG;
import celestial.rrFS;
import celestial.rrFb_1;
import celestial.rrFl_1;
import celestial.rrQX;
import celestial.rrZF;
import celestial.rrZO;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFs_1
extends rrFl_1<rrFE> {
    private static String[] id_break;
    private static boolean[] id_protected;
    private static short[] id_throws;
    public Object[] id_class;
    private static byte[] id_case;
    private static float[] id_catch;

    @Override
    public Collection<rrFE> id_byte() {
        this.id_case();
        return (List)this.id_class[id_throws[13]];
    }

    public rrFs_1(rrFS rrFS2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.id_case();
        this.id_class[rrFs_1.id_throws[0]] = arrayList2 = new ArrayList();
        this.id_class[rrFs_1.id_throws[1]] = arrayList = new ArrayList();
        rrFS rrFS3 = rrFS2;
        this.id_class[rrFs_1.id_throws[2]] = rrFS3;
        for (Module module : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[3]]).id_private().g()) {
            ((List)this.id_class[id_throws[4]]).add(new rrFG(module));
        }
        ((List)this.id_class[id_throws[5]]).add(new rrFb_1(this, id_break[0], id_break[1]));
    }

    static {
        rrFs_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x19B4BCB62D1798A2L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x350B62E6;
    }

    @Override
    public float id_class(rrFE rrFE2) {
        String string = rrFE2.id_byte() + rrFE2.id_break();
        return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[14]]).id_class().id_break(string) + id_catch[5];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{86, -109, 35, 111, 12, -8, 14, -77}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(Ml_1 ml_1, float f, float f2) {
        this.id_case();
        float f3 = ((rrFS)this.id_class[id_throws[6]]).id_long();
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[7]]).id_class();
        this.id_break(id_catch[0]);
        float f4 = this.id_finally();
        float f5 = this.id_protected();
        rrZO2.id_class(MinecraftAccessor.id_strictfp);
        for (rrFE rrFE2 : this.id_byte()) {
            AnimValue animValue = rrFE2.id_class();
            rrFE2.id_class(rrFE2.id_throws());
            if (!animValue.id_case()) continue;
            float f6 = animValue.id_byte();
            float f7 = animValue.id_continue();
            float f8 = f5 * id_catch[1] * f7;
            float f9 = f + id_catch[2];
            float f10 = f2 + f4 - f8;
            int n = ColorHelper.id_break(rrZF.d_, (int)(id_catch[3] * f6 * f3));
            String string = rrFE2.id_byte();
            String string2 = rrFE2.id_break();
            rrZO2.id_break(ml_1, MinecraftAccessor.id_strictfp, string, f9, f10, n, id_protected[0], id_protected[1]);
            rrZO2.id_break(ml_1, MinecraftAccessor.id_strictfp, string2, f9 + ((rrFS)this.id_class[id_throws[8]]).id_implements() - rrZO2.id_break(string2) - id_catch[4], f10, n, id_protected[2], id_protected[3]);
            float f11 = f5 * f6;
            f4 += f11;
            this.id_class(f11);
        }
        rrZO2.id_byte(MinecraftAccessor.id_strictfp);
    }

    public List<rrFE> id_class() {
        this.id_case();
        return (List)this.id_class[id_throws[15]];
    }

    public boolean id_break() {
        this.id_case();
        return (Boolean)this.id_class[id_throws[16]];
    }

    @Override
    public void id_throws() {
        this.id_case();
        super.id_throws();
        Collection<rrFE> collection = this.id_byte();
        Boolean bl = id_protected[4];
        this.id_class[rrFs_1.id_throws[9]] = bl;
        ((List)this.id_class[id_throws[10]]).clear();
        if (!collection.isEmpty()) {
            for (rrFE rrFE2 : collection) {
                if (!rrFE2.id_throws()) continue;
                ((List)this.id_class[id_throws[11]]).add(rrFE2);
                if (rrFE2.id_protected()) continue;
                Boolean bl2 = id_protected[5];
                this.id_class[rrFs_1.id_throws[12]] = bl2;
            }
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrFs_1.id_catch();
        rrFs_1.id_native();
        rrFs_1.id_private();
        rrFs_1.id_implements();
        rrFs_1.id_extends();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[7];
        blArray[5] = true;
        id_protected = blArray;
    }

    private static void id_extends() {
        id_case = new byte[]{4, 3};
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_case[0]];
            objectArray[rrFs_1.id_case[1]] = id_protected[6];
        }
    }

    private static void id_implements() {
        id_catch = new float[]{18.0f, 0.8f, 3.0f, 255.0f, 5.0f, 15.0f, 10.0f};
    }

    @Override
    public float id_protected() {
        return id_catch[6];
    }

    private static void id_private() {
        short[] sArray = new short[17];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[9] = 3;
        sArray[10] = 2;
        sArray[11] = 2;
        sArray[12] = 3;
        sArray[13] = 1;
        sArray[15] = 2;
        sArray[16] = 3;
        id_throws = sArray;
    }

    private static void id_native() {
        id_break = new String[]{new String("Preview Bind"), new String("[Key]")};
    }
}

