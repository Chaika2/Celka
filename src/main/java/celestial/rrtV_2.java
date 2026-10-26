/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.rrIQ;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrtF_2;
import celestial.rrtI_2;
import celestial.rrtN_2;
import celestial.rrtm_3;
import celestial.rrtn_3;
import celestial.rrtu_3;
import celestial.rrtw_3;
import celestial.rruv_1;
import celestial.rrwS_2;
import celestial.setting.Setting;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrtV_2
extends rrtw_3 {
    private static float[] id_native;
    private static boolean[] id_volatile;
    private static byte[] id_final;
    private static short[] id_package;
    private static double[] id_int;
    private static String[] id_new;
    public Object[] id_throws;

    private static void id_char() {
        double[] dArray = new double[2];
        dArray[1] = 10.0;
        id_int = dArray;
    }

    public rrtV_2(rrtN_2 rrtN_22, rrIQ rrIQ2, float f, float f2, float f3, float f4) {
        super(rrtN_22, rrIQ2, f, f2, f3, f4);
        ArrayList arrayList;
        this.id_try();
        this.id_throws[rrtV_2.id_package[0]] = arrayList = new ArrayList();
        rrIQ rrIQ3 = rrIQ2;
        this.id_throws[rrtV_2.id_package[1]] = rrIQ3;
        for (String string : ((rrIQ)this.id_throws[id_package[2]]).id_class()) {
            ((List)this.id_throws[id_package[3]]).add(new rrwS_2((rrIQ)this.id_throws[id_package[4]], string));
        }
        ((rrIQ)this.id_throws[id_package[5]]).id_class(id_new[0], (Setting<T> setting, Pair<T, Boolean> pair) -> {
            this.id_try();
            this.id_class((List)this.id_throws[id_package[17]]);
        });
    }

    static {
        rrtV_2.ntfClinit();
    }

    private static void id_interface() {
        id_native = new float[]{255.0f, 4.0f, 4.5f, 1.0f, 180.0f, 180.0f, 3.0f, 2.0f, 3.0f, 10.0f};
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, rrtI_2 rrtI_22, float f, float f2, int n, int n2, int n3) {
        this.id_try();
        if (!this.id_return().id_case()) {
            return id_volatile[0];
        }
        for (rrwS_2 rrwS_22 : (List)this.id_throws[id_package[11]]) {
            if (n3 != 0 || !rrwS_22.id_class().id_break(n, n2) || rrwS_22.id_break()) continue;
            ((rrIQ)this.id_throws[id_package[12]]).id_class(rrwS_22.id_byte(), id_volatile[1]);
            this.id_class((List)this.id_throws[id_package[13]]);
            this.id_class(id_volatile[2]);
            return id_volatile[3];
        }
        return id_volatile[4];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAE23B949F78E0A56L;
    }

    private void id_class(List<rrwS_2> list) {
        rrwS_2 rrwS_22 = null;
        for (rrwS_2 rrwS_23 : list) {
            if (!rrwS_23.id_break()) continue;
            rrwS_22 = rrwS_23;
            break;
        }
        Collections.swap(list, id_volatile[5], list.indexOf(rrwS_22));
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtI_2 rrtI_22, int n, int n2) {
        this.id_try();
        float f = rrtI_22.id_break();
        float f2 = rrtI_22.id_byte();
        float f3 = rrtI_22.id_throws();
        float f4 = rrtI_22.id_class();
        AnimValue animValue = this.id_return();
        float f5 = animValue.id_byte();
        int n3 = (int)(id_native[0] * f5);
        rrtV_2.id_class(ml_1, this, f, f2, f3, f4);
        rrtF_2.id_class(ml_1, (rrtm_3)this, f + f3 - id_native[1], f2 + id_native[2], id_native[3], id_native[4] + f5 * id_native[5], rrZF.d_, (int)id_package[6]);
        float f6 = id_native[6];
        for (rrwS_2 rrwS_22 : (List)this.id_throws[id_package[7]]) {
            float f7 = f + id_native[7];
            float f8 = f2 + f6;
            boolean bl = rrwS_22.id_break();
            if (!bl && !animValue.id_case()) continue;
            rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_package[8]]).id_finally();
            rrwS_22.id_class(new rruv_1(f, f8 - id_native[8], f3, rrZO2.id_class() + id_final[0]));
            int n4 = bl ? id_package[9] : n3;
            rrtF_2.id_protected(ml_1, this, ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_package[10]]).id_finally(), rrwS_22.id_byte(), f7, f8, rrZF.d_, n4);
            f6 += id_native[9] * f5;
        }
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCD0A65F6;
    }

    private static /* synthetic */ void ntfClinit() {
        rrtV_2.id_instanceof();
        rrtV_2.id_abstract();
        rrtV_2.id_throw();
        rrtV_2.id_interface();
        rrtV_2.id_char();
        rrtV_2.id_while();
    }

    private static void id_instanceof() {
        boolean[] blArray = new boolean[6];
        blArray[3] = true;
        id_volatile = blArray;
    }

    private static void id_throw() {
        short[] sArray = new short[18];
        sArray[0] = 1;
        sArray[3] = 1;
        sArray[6] = 255;
        sArray[7] = 1;
        sArray[9] = 255;
        sArray[11] = 1;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[15] = 1;
        sArray[17] = 1;
        id_package = sArray;
    }

    private void id_try() {
        if (this.id_throws == null) {
            Object[] objectArray = this.id_throws = new Object[id_final[1]];
        }
    }

    private static void id_while() {
        id_final = new byte[]{6, 2};
    }

    @Override
    public float id_public() {
        this.id_try();
        return (float)(((List)this.id_throws[id_package[14]]).stream().mapToDouble(rrwS_22 -> ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_package[16]]).id_finally().id_break(rrwS_22.id_byte())).max().orElse(id_int[0]) + id_int[1]);
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-24, 43, 68, 30, 32, 27, 95, 31}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public List<? extends rrtn_3> id_protected() {
        this.id_try();
        return (List)this.id_throws[id_package[15]];
    }

    private static void id_abstract() {
        id_new = new String[]{new String("swap_modes")};
    }
}

