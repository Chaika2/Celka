/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap
 */
package celestial;

import celestial.C_class;
import celestial.Ps_1;
import celestial.is_3;
import celestial.rEu_1;
import celestial.rGw_1;
import celestial.rU_2;
import celestial.rbG_2;
import celestial.rfH_2;
import it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class be_3 {
    private static byte[] id_break;
    private static double[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;
    private static boolean[] id_throws;
    private static String[] id_case;

    private static void id_byte() {
        boolean[] blArray = new boolean[14];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[9] = true;
        id_throws = blArray;
    }

    public be_3(rfH_2 rfH_22, double d, int n) {
        this(rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), d, n);
    }

    public be_3(int n, int n2, int n3, double d, int n4) {
        this.id_class();
        Integer n5 = n;
        this.id_class[be_3.id_protected[0]] = n5;
        Integer n6 = n2;
        this.id_class[be_3.id_protected[1]] = n6;
        Integer n7 = n3;
        this.id_class[be_3.id_protected[2]] = n7;
        Double d2 = d;
        this.id_class[be_3.id_protected[3]] = d2;
        Integer n8 = n4;
        this.id_class[be_3.id_protected[4]] = n8;
        Integer n9 = n4 * n4;
        this.id_class[be_3.id_protected[5]] = n9;
    }

    static {
        be_3.ntfClinit();
    }

    public void id_class(Long2DoubleOpenHashMap long2DoubleOpenHashMap) {
        for (int i = -((Integer)this.id_class[id_protected[16]]).intValue(); i <= (Integer)this.id_class[id_protected[17]]; ++i) {
            for (int j = -((Integer)this.id_class[id_protected[18]]).intValue(); j <= (Integer)this.id_class[id_protected[19]]; ++j) {
                for (int k = -((Integer)this.id_class[id_protected[20]]).intValue(); k <= (Integer)this.id_class[id_protected[21]]; ++k) {
                    if (i * i + j * j + k * k > (Integer)this.id_class[id_protected[22]] * (Integer)this.id_class[id_protected[23]]) continue;
                    long l = rU_2.id_byte((Integer)this.id_class[id_protected[24]] + i, (Integer)this.id_class[id_protected[25]] + j, (Integer)this.id_class[id_protected[26]] + k);
                    long2DoubleOpenHashMap.put(l, long2DoubleOpenHashMap.get(l) * (Double)this.id_class[id_protected[27]]);
                }
            }
        }
    }

    public double id_class(int n, int n2, int n3) {
        int n4;
        int n5;
        int n6 = n - (Integer)this.id_class[id_protected[6]];
        return n6 * n6 + (n5 = n2 - (Integer)this.id_class[id_protected[7]]) * n5 + (n4 = n3 - (Integer)this.id_class[id_protected[8]]) * n4 <= (Integer)this.id_class[id_protected[9]] ? (Double)this.id_class[id_protected[10]] : id_byte[0];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5ACFB5E0ECA82E62L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-121, -117, 8, 89, 21, -29, 27, 56}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAF6FCA40;
    }

    public static List<be_3> id_class(Ps_1 ps_1) {
        if (!((Boolean)C_class.id_instanceof().id_transient.id_class[id_protected[11]]).booleanValue()) {
            return Collections.emptyList();
        }
        ArrayList<be_3> arrayList = new ArrayList<be_3>();
        double d = (Double)C_class.id_instanceof().D.id_class[id_protected[12]];
        double d2 = (Double)C_class.id_instanceof().id_this.id_class[id_protected[13]];
        if (d != id_byte[1]) {
            ps_1.id_package().id_break().id_class(id_case[0], id_throws[0], (Integer)ps_1.id_volatile().id_break[id_protected[14]], (Integer)ps_1.id_volatile().id_break[id_protected[15]], id_break[0]).forEach(rfH_22 -> arrayList.add(new be_3((rfH_2)rfH_22, d, (Integer)C_class.id_instanceof().BP.id_class[id_protected[29]])));
        }
        if (d2 != id_byte[2]) {
            ps_1.id_implements().filter(an_32 -> an_32 instanceof is_3).filter(an_32 -> !(an_32 instanceof rGw_1) || (double)ps_1.id_catch().rX() < id_byte[3] ? id_throws[5] : id_throws[6]).filter(an_32 -> !(an_32 instanceof rbG_2) || ((rbG_2)an_32).Sr() != null ? id_throws[3] : id_throws[4]).filter(an_32 -> !(an_32 instanceof rEu_1) || ((rEu_1)an_32).sk() ? id_throws[1] : id_throws[2]).forEach(an_32 -> arrayList.add(new be_3(an_32.Bs(), d2, (Integer)C_class.id_instanceof().id_long.id_class[id_protected[28]])));
        }
        return arrayList;
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[1]];
            objectArray[be_3.id_throws[7]] = id_throws[8];
            objectArray[be_3.id_throws[9]] = id_throws[10];
            objectArray[be_3.id_break[2]] = id_throws[11];
            objectArray[be_3.id_break[3]] = id_byte[4];
            objectArray[be_3.id_break[4]] = id_throws[12];
            objectArray[be_3.id_break[5]] = id_throws[13];
        }
    }

    private static void id_break() {
        id_case = new String[]{new String("mob_spawner")};
    }

    private static void id_throws() {
        short[] sArray = new short[30];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 4;
        sArray[5] = 5;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[9] = 5;
        sArray[10] = 3;
        sArray[15] = 2;
        sArray[16] = 4;
        sArray[17] = 4;
        sArray[18] = 4;
        sArray[19] = 4;
        sArray[20] = 4;
        sArray[21] = 4;
        sArray[22] = 4;
        sArray[23] = 4;
        sArray[25] = 1;
        sArray[26] = 2;
        sArray[27] = 3;
        id_protected = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        be_3.id_byte();
        be_3.id_break();
        be_3.id_throws();
        be_3.id_case();
        be_3.id_protected();
    }

    private static void id_case() {
        double[] dArray = new double[5];
        dArray[0] = 1.0;
        dArray[1] = 1.0;
        dArray[2] = 1.0;
        dArray[3] = 0.5;
        id_byte = dArray;
    }

    private static void id_protected() {
        id_break = new byte[]{2, 6, 2, 3, 4, 5};
    }
}

