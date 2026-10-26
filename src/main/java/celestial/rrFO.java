/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.cb_3;
import celestial.iB_2;
import celestial.manager.FontManager;
import celestial.rVi_1;
import celestial.rdn_3;
import celestial.rrAM;
import celestial.rrFJ;
import celestial.rrFK;
import celestial.rrFX;
import celestial.rrFh_1;
import celestial.rrFl_1;
import celestial.rrLf_1;
import celestial.rrZF;
import celestial.rrZO;
import celestial.util.AnimValue;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFO
extends rrFl_1<rrFX> {
    private static boolean[] id_protected;
    public Object[] id_class;
    private static float[] id_throws;
    private static byte[] id_case;
    public static Object[] id_break;
    private static short[] id_catch;
    private static long[] id_private;
    private static String[] id_implements;

    @Override
    public Collection<rrFX> id_byte() {
        this.id_catch();
        return (List)this.id_class[id_catch[5]];
    }

    public rrFO(rrFJ rrFJ2) {
        ArrayList arrayList;
        this.id_catch();
        this.id_class[rrFO.id_catch[0]] = arrayList = new ArrayList();
        rrFh_1 rrFh_12 = new rrFh_1();
        this.id_class[rrFO.id_catch[1]] = rrFh_12;
        rrFJ rrFJ3 = rrFJ2;
        this.id_class[rrFO.id_catch[2]] = rrFJ3;
    }

    static {
        rrFO.ntfClinit();
    }

    public void id_class(rrLf_1 rrLf_12) {
        this.id_catch();
        if (!((rrFJ)this.id_class[id_catch[9]]).id_throw()) {
            return;
        }
        iB_2 iB_22 = rrLf_12.id_break();
        if (iB_22 == (cb_3)MinecraftAccessor.id_import.id_class[id_catch[10]]) {
            return;
        }
        rdn_3 rdn_32 = rrLf_12.id_class();
        if (!rdn_32.id_protected(id_implements[0]) && !rdn_32.id_protected(id_implements[1])) {
            return;
        }
        rrFX rrFX2 = new rrFX(iB_22, rdn_32);
        if (((List)this.id_class[id_catch[11]]).contains(rrFX2)) {
            rrFX rrFX3 = (rrFX)((List)this.id_class[id_catch[12]]).get(((List)this.id_class[id_catch[13]]).indexOf(rrFX2));
            rrFX3.id_class(rrFX3.id_case() + rdn_32.id_char());
            rrFX3.id_break(id_protected[2]);
        } else {
            ((List)this.id_class[id_catch[14]]).add(rrFX2);
        }
        if (!((List)this.id_class[id_catch[15]]).isEmpty()) {
            ((List)this.id_class[id_catch[16]]).sort((rrFh_1)this.id_class[id_catch[17]]);
        }
    }

    @Override
    public float id_class(rrFX rrFX2) {
        rVi_1 rVi_12 = rrFX2.id_throws();
        return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[6]]).id_class().id_break(rVi_12.id_byte()) + id_throws[4];
    }

    public void id_class(rrAM rrAM2) {
        this.id_catch();
        for (rrFX rrFX2 : (List)this.id_class[id_catch[18]]) {
            rrFX2.id_class(id_protected[3]);
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-110, 5, -73, 116, 126, -16, -36, -41}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrFJ id_class() {
        this.id_catch();
        return (rrFJ)this.id_class[id_catch[21]];
    }

    @Override
    public void id_class(Ml_1 ml_1, float f, float f2) {
        this.id_catch();
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[3]]).id_class();
        this.id_break(id_throws[0]);
        float f3 = this.id_finally();
        float f4 = this.id_protected();
        rrZO2.id_class(MinecraftAccessor.id_strictfp);
        for (rrFX rrFX2 : (List)this.id_class[id_catch[4]]) {
            AnimValue animValue = rrFX2.id_protected();
            rrFX2.id_class(!rrFX2.id_protected().id_new() ? id_protected[0] : id_protected[1]);
            float f5 = f4 * id_throws[1] * animValue.id_continue();
            float f6 = f + id_throws[2];
            float f7 = f2 + f3 - f5;
            rVi_1 rVi_12 = rrFX2.id_throws();
            int n = (int)(id_throws[3] * animValue.id_byte());
            rrZO2.id_break(ml_1, rVi_12, (double)f6, (double)f7, rrZF.d_, n);
            float f8 = f4 * animValue.id_byte();
            f3 += f8;
            this.id_class(f8);
        }
        rrZO2.id_byte(MinecraftAccessor.id_strictfp);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7E8E8636;
    }

    public void id_class(rrFK rrFK2) {
        this.id_catch();
        ((List)this.id_class[id_catch[19]]).clear();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAB827C6877493859L;
    }

    public List<rrFX> id_break() {
        this.id_catch();
        return (List)this.id_class[id_catch[20]];
    }

    @Override
    public void id_throws() {
        this.id_catch();
        super.id_throws();
        if (((List)this.id_class[id_catch[7]]).isEmpty()) {
            return;
        }
        ((List)this.id_class[id_catch[8]]).removeIf(rrFX2 -> {
            if (rrFX2.id_protected().id_catch()) {
                return id_protected[4];
            }
            rrFX2.id_break(rrFX2.id_break() + id_protected[5]);
            if ((long)rrFX2.id_break() >= (Long)id_break[id_catch[23]] * id_private[0]) {
                rrFX2.id_class(id_protected[6]);
            }
            return id_protected[7];
        });
    }

    private static /* synthetic */ void ntfClinit() {
        rrFO.id_private();
        rrFO.id_package();
        rrFO.id_volatile();
        rrFO.id_extends();
        rrFO.id_implements();
        rrFO.id_final();
        rrFO.id_native();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_case[0]];
        }
    }

    private static void id_extends() {
        short[] sArray = new short[24];
        sArray[1] = 2;
        sArray[2] = 1;
        sArray[9] = 1;
        sArray[10] = 57;
        sArray[17] = 2;
        sArray[21] = 1;
        sArray[22] = 2;
        id_catch = sArray;
    }

    public rrFh_1 id_case() {
        this.id_catch();
        return (rrFh_1)this.id_class[id_catch[22]];
    }

    private static void id_implements() {
        id_throws = new float[]{18.0f, 0.8f, 3.0f, 255.0f, 7.0f, 10.0f};
    }

    private static void id_package() {
        id_implements = new String[]{new String("don-item"), new String("gift")};
    }

    @Override
    public float id_protected() {
        return id_throws[5];
    }

    private static void id_private() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[9] = true;
        id_protected = blArray;
    }

    private static void id_final() {
        id_case = new byte[]{3};
    }

    private static void id_volatile() {
        long[] lArray = new long[3];
        lArray[0] = 40L;
        lArray[1] = 30L;
        id_private = lArray;
    }

    private static void id_native() {
        Object[] objectArray = new Object[]{30L};
        id_break = objectArray;
    }
}

