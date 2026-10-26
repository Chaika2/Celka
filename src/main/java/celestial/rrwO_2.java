/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrtN_2;
import celestial.rrtu_3;
import celestial.rrvj_1;
import celestial.rrwh_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwO_2 {
    private static float[] id_break;
    public static Object[] id_class;
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static byte[] id_throws;

    private static void id_byte() {
        id_throws = new byte[]{3, 2, 3, 2};
    }

    private rrwO_2() {
    }

    static {
        rrwO_2.ntfClinit();
    }

    private static void id_class() {
        short[] sArray = new short[10];
        sArray[1] = 1;
        sArray[2] = 4;
        sArray[3] = 4;
        sArray[5] = 2;
        sArray[6] = 5;
        sArray[7] = 5;
        sArray[8] = 1;
        sArray[9] = 3;
        id_protected = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4368120C;
    }

    public static rrwh_3 id_class(rrtN_2 rrtN_22, rrtu_3 rrtu_32, float f, float f2, float f3, float f4) {
        float f5;
        int n;
        float f6 = rrtN_22.id_implements();
        float f7 = rrtN_22.ao_();
        float f8 = rrtN_22.id_import();
        float[] fArray = new float[id_throws[0]];
        fArray[rrwO_2.id_byte[0]] = f;
        fArray[rrwO_2.id_byte[1]] = f + f6 / id_break[0];
        fArray[rrwO_2.id_throws[1]] = f + f6;
        float[] fArray2 = fArray;
        float[] fArray3 = new float[id_throws[2]];
        fArray3[rrwO_2.id_byte[2]] = f2;
        fArray3[rrwO_2.id_byte[3]] = f2 + f7 / id_break[1];
        fArray3[rrwO_2.id_throws[3]] = f2 + f7;
        float[] fArray4 = fArray3;
        List<Float> list = rrwO_2.id_break(rrtN_22, rrtu_32, f3, f8);
        List<Float> list2 = rrwO_2.id_class(rrtN_22, rrtu_32, f4, f8);
        rrwh_3 rrwh_32 = new rrwh_3();
        Float f9 = Float.valueOf(f);
        rrwh_32.id_class[rrwO_2.id_protected[0]] = f9;
        Float f10 = Float.valueOf(f2);
        rrwh_32.id_class[rrwO_2.id_protected[1]] = f10;
        float f11 = id_break[2];
        for (float f12 : list) {
            float[] fArray5 = fArray2;
            int n2 = fArray5.length;
            for (n = id_byte[4]; n < n2; ++n) {
                float f13 = fArray5[n];
                f5 = f12 - f13;
                if (!(Math.abs(f5) <= id_break[3]) || !(Math.abs(f5) < Math.abs(f11))) continue;
                f11 = f5;
                Float f14 = Float.valueOf(f12);
                rrwh_32.id_class[rrwO_2.id_protected[2]] = f14;
            }
        }
        if ((Float)rrwh_32.id_class[id_protected[3]] != null) {
            Float f15 = Float.valueOf(f + f11);
            rrwh_32.id_class[rrwO_2.id_protected[4]] = f15;
            Boolean bl = id_byte[5];
            rrwh_32.id_class[rrwO_2.id_protected[5]] = bl;
        }
        float f16 = id_break[4];
        for (float f17 : list2) {
            float[] fArray6 = fArray4;
            n = fArray6.length;
            for (int i = id_byte[6]; i < n; ++i) {
                f5 = fArray6[i];
                float f18 = f17 - f5;
                if (!(Math.abs(f18) <= id_break[5]) || !(Math.abs(f18) < Math.abs(f16))) continue;
                f16 = f18;
                Float f19 = Float.valueOf(f17);
                rrwh_32.id_class[rrwO_2.id_protected[6]] = f19;
            }
        }
        if ((Float)rrwh_32.id_class[id_protected[7]] != null) {
            Float f20 = Float.valueOf(f2 + f16);
            rrwh_32.id_class[rrwO_2.id_protected[8]] = f20;
            Boolean bl = id_byte[7];
            rrwh_32.id_class[rrwO_2.id_protected[9]] = bl;
        }
        return rrwh_32;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-67, -101, -128, -128, -43, -70, 35, -128}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x193A570A79678A2AL;
    }

    private static List<Float> id_class(rrtN_2 rrtN_22, rrtu_3 rrtu_32, float f, float f2) {
        ArrayList<Float> arrayList = new ArrayList<Float>();
        arrayList.add(Float.valueOf(f2));
        arrayList.add(Float.valueOf(f / id_break[8]));
        arrayList.add(Float.valueOf(f - f2));
        for (rrtN_2 rrtN_23 : rrtu_32.id_class()) {
            if (rrtN_23 == rrtN_22 || !(rrtN_23 instanceof rrvj_1) || !rrtN_23.aq_()) continue;
            float f3 = rrtN_23.id_abstract();
            float f4 = rrtN_23.ao_();
            arrayList.add(Float.valueOf(f3));
            arrayList.add(Float.valueOf(f3 + f4 / id_break[9]));
            arrayList.add(Float.valueOf(f3 + f4));
        }
        return arrayList;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[10];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[8] = true;
        id_byte = blArray;
    }

    private static List<Float> id_break(rrtN_2 rrtN_22, rrtu_3 rrtu_32, float f, float f2) {
        ArrayList<Float> arrayList = new ArrayList<Float>();
        arrayList.add(Float.valueOf(f2));
        arrayList.add(Float.valueOf(f / id_break[6]));
        arrayList.add(Float.valueOf(f - f2));
        for (rrtN_2 rrtN_23 : rrtu_32.id_class()) {
            if (rrtN_23 == rrtN_22 || !(rrtN_23 instanceof rrvj_1) || !rrtN_23.aq_()) continue;
            float f3 = rrtN_23.id_default();
            float f4 = rrtN_23.id_implements();
            arrayList.add(Float.valueOf(f3));
            arrayList.add(Float.valueOf(f3 + f4 / id_break[7]));
            arrayList.add(Float.valueOf(f3 + f4));
        }
        return arrayList;
    }

    private static void id_throws() {
        id_break = new float[]{2.0f, 2.0f, 5.0f, 4.0f, 5.0f, 4.0f, 2.0f, 2.0f, 2.0f, 2.0f, 4.0f};
    }

    private static /* synthetic */ void ntfClinit() {
        rrwO_2.id_break();
        rrwO_2.id_throws();
        rrwO_2.id_class();
        rrwO_2.id_byte();
        rrwO_2.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{Float.valueOf(0.0f)};
        id_class = objectArray;
    }
}

