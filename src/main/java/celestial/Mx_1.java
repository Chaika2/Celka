/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MM;
import celestial.Md_1;
import celestial.rCZ;
import celestial.rVL;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rja_3;
import celestial.rqO_2;
import celestial.xc_3;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mx_1
extends MM {
    private static String[] id_protected;
    private static double[] id_throws;
    public Object[] id_break;
    private static int[] id_case;
    private static byte[] id_catch;
    private static short[] id_private;
    private static boolean[] id_implements;

    private void id_int() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_catch[1]];
        }
    }

    public Mx_1(rcd_3 rcd_32, boolean bl) {
        xc_3[][][] xc_3Array;
        this.id_int();
        rcd_3 rcd_33 = rcd_32;
        this.id_break[Mx_1.id_private[0]] = rcd_33;
        rja_3 rja_32 = new rja_3(this.id_protected(id_protected[0]), this.id_protected(id_protected[1]), this.id_protected(id_protected[2]));
        this.id_break[Mx_1.id_private[1]] = rja_32;
        Integer n = Math.abs(((rcd_3)this.id_break[id_private[2]]).id_int(id_protected[3]).id_int(id_protected[4]).id_private(id_protected[5]));
        this.id_class[Mx_1.id_private[3]] = n;
        if (bl) {
            Integer n2 = Math.abs(((rcd_3)this.id_break[id_private[4]]).id_int(id_protected[6]).id_int(id_protected[7]).id_private(id_protected[8]));
            this.id_class[Mx_1.id_private[5]] = n2;
            Integer n3 = Math.abs(((rcd_3)this.id_break[id_private[6]]).id_int(id_protected[9]).id_int(id_protected[10]).id_private(id_protected[11]));
            this.id_class[Mx_1.id_private[7]] = n3;
        } else {
            Integer n4 = Math.abs(((rcd_3)this.id_break[id_private[8]]).id_int(id_protected[12]).id_int(id_protected[13]).id_private(id_protected[14]));
            this.id_class[Mx_1.id_private[9]] = n4;
            Integer n5 = Math.abs(((rcd_3)this.id_break[id_private[10]]).id_int(id_protected[15]).id_int(id_protected[16]).id_private(id_protected[17]));
            this.id_class[Mx_1.id_private[11]] = n5;
        }
        this.id_byte[Mx_1.id_private[15]] = xc_3Array = new xc_3[((Integer)this.id_class[id_private[12]]).intValue()][((Integer)this.id_class[id_private[13]]).intValue()][((Integer)this.id_class[id_private[14]]).intValue()];
        this.id_implements();
    }

    static {
        Mx_1.ntfClinit();
    }

    private static <T extends Comparable<T>> xc_3 id_class(xc_3 xc_32, rCZ<T> rCZ2, String string) {
        Optional<T> optional = rCZ2.id_break(string);
        if (optional.isPresent()) {
            return (xc_3)xc_32.id_class(rCZ2, (Comparable)optional.get());
        }
        throw new IllegalArgumentException("Invalid value for property " + rCZ2);
    }

    private static xc_3 id_class(xd_3 xd_32, rcd_3 rcd_32) {
        xc_3 xc_32 = xd_32.id_continue();
        Object[] objectArray = rcd_32.id_protected().toArray();
        int n = objectArray.length;
        for (int i = id_implements[2]; i < n; ++i) {
            Object object = objectArray[i];
            rCZ<?> rCZ2 = xd_32.id_new().id_class((String)object);
            String string = rcd_32.id_native((String)object);
            if (rCZ2 == null) continue;
            xc_32 = Mx_1.id_class(xc_32, rCZ2, string);
        }
        return xc_32;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9C10E8EF8976B249L;
    }

    private static int id_class(rcd_3 rcd_32, String string, String string2) {
        int n = rcd_32.id_int(id_protected[19]).id_int(string).id_int(id_protected[20]).id_private(string2);
        int n2 = rcd_32.id_int(id_protected[21]).id_int(string).id_int(id_protected[22]).id_private(string2);
        if (n2 < 0) {
            ++n2;
        }
        return Math.min(n, n + n2);
    }

    private static boolean id_class(rcd_3 rcd_32, String string, int n, int n2, int n3) {
        return n >= 0 && n2 >= 0 && n3 >= 0 && n < Math.abs(rcd_32.id_int(id_protected[36]).id_int(string).id_int(id_protected[37]).id_private(id_protected[38])) && n2 < Math.abs(rcd_32.id_int(id_protected[39]).id_int(string).id_int(id_protected[40]).id_private(id_protected[41])) && n3 < Math.abs(rcd_32.id_int(id_protected[42]).id_int(string).id_int(id_protected[43]).id_private(id_protected[44])) ? id_implements[3] : id_implements[4];
    }

    private static xc_3[] id_class(rcy_3 rcy_32) {
        xc_3[] xc_3Array = new xc_3[rcy_32.size()];
        for (int i = id_implements[1]; i < rcy_32.size(); ++i) {
            xd_3 xd_32 = rVL.id_strictfp.id_class(new rqO_2(((rcd_3)rcy_32.id_finally(i)).id_native(id_protected[23])));
            rcd_3 rcd_32 = ((rcd_3)rcy_32.id_finally(i)).id_int(id_protected[24]);
            xc_3Array[i] = Mx_1.id_class(xd_32, rcd_32);
        }
        return xc_3Array;
    }

    private static String[] id_class(rcd_3 rcd_32) {
        return rcd_32.id_int(id_protected[18]).id_protected().toArray(new String[id_implements[0]]);
    }

    public Mx_1 id_class(boolean bl) {
        this.id_int();
        return new Mx_1((rcd_3)this.id_break[id_private[35]], bl);
    }

    private static long[] id_class(rcd_3 rcd_32, String string) {
        return rcd_32.id_int(id_protected[34]).id_int(string).id_package(id_protected[35]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3BBF11C;
    }

    private void id_class(rcd_3 rcd_32, String string, xc_3[] xc_3Array, Md_1 md_1) {
        this.id_int();
        rja_3 rja_32 = new rja_3(Mx_1.id_class(rcd_32, string, id_protected[47]), Mx_1.id_class(rcd_32, string, id_protected[48]), Mx_1.id_class(rcd_32, string, id_protected[49]));
        int n = id_implements[7];
        for (int i = id_implements[8]; i < (Integer)this.id_class[id_private[23]]; ++i) {
            for (int j = id_implements[9]; j < (Integer)this.id_class[id_private[24]]; ++j) {
                for (int k = id_implements[10]; k < (Integer)this.id_class[id_private[25]]; ++k) {
                    if (!Mx_1.id_class(rcd_32, string, k, i, j)) continue;
                    ((xc_3[][][])this.id_byte[Mx_1.id_private[26]])[k - (((rja_3)this.id_break[Mx_1.id_private[27]]).b_() - rja_32.b_())][j - (((rja_3)this.id_break[Mx_1.id_private[28]]).d_() - rja_32.d_())][i - (((rja_3)this.id_break[Mx_1.id_private[29]]).c_() - rja_32.c_())] = xc_3Array[md_1.id_class(n)];
                    ++n;
                }
            }
        }
    }

    private static int id_break(int n) {
        return (int)Math.max(id_throws[0], Math.ceil(Math.log(n) / Math.log(id_throws[1])));
    }

    public void id_break(int n, int n2, int n3, xc_3 xc_32) {
        ((xc_3[][][])this.id_byte[Mx_1.id_private[34]])[n][n3][n2] = xc_32;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{89, -103, -11, 88, 40, 108, 90, -8}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_break(rcd_3 rcd_32, String string) {
        return Math.abs(rcd_32.id_int(id_protected[25]).id_int(string).id_int(id_protected[26]).id_private(id_protected[27]) * rcd_32.id_int(id_protected[28]).id_int(string).id_int(id_protected[29]).id_private(id_protected[30]) * rcd_32.id_int(id_protected[31]).id_int(string).id_int(id_protected[32]).id_private(id_protected[33]));
    }

    public int id_throws() {
        return (Integer)this.id_class[id_private[31]];
    }

    private static /* synthetic */ void ntfClinit() {
        Mx_1.id_final();
        Mx_1.id_volatile();
        Mx_1.id_package();
        Mx_1.id_finally();
        Mx_1.id_native();
        Mx_1.id_extends();
    }

    private static void id_finally() {
        id_throws = new double[]{2.0, 2.0};
    }

    public int id_catch() {
        return (Integer)this.id_class[id_private[33]];
    }

    private static void id_extends() {
        id_case = new int[]{Integer.MAX_VALUE};
    }

    public rja_3 id_case() {
        this.id_int();
        return (rja_3)this.id_break[id_private[30]];
    }

    private void id_implements() {
        this.id_int();
        String[] stringArray = Mx_1.id_class((rcd_3)this.id_break[id_private[18]]);
        int n = stringArray.length;
        for (int i = id_implements[6]; i < n; ++i) {
            String string = stringArray[i];
            rcy_3 rcy_32 = ((rcd_3)this.id_break[id_private[19]]).id_int(id_protected[45]).id_int(string).id_protected(id_protected[46], id_catch[0]);
            xc_3[] xc_3Array = Mx_1.id_class(rcy_32);
            int n2 = Mx_1.id_break(rcy_32.size());
            long l = Mx_1.id_break((rcd_3)this.id_break[id_private[20]], string);
            long[] lArray = Mx_1.id_class((rcd_3)this.id_break[id_private[21]], string);
            Md_1 md_1 = new Md_1(n2, l, lArray);
            this.id_class((rcd_3)this.id_break[id_private[22]], string, xc_3Array, md_1);
        }
    }

    private static void id_package() {
        short[] sArray = new short[36];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 1;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[13] = 2;
        sArray[14] = 1;
        sArray[16] = 1;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[19] = 1;
        sArray[20] = 1;
        sArray[21] = 1;
        sArray[22] = 1;
        sArray[23] = 1;
        sArray[24] = 2;
        sArray[32] = 1;
        sArray[33] = 2;
        sArray[35] = 1;
        id_private = sArray;
    }

    private int id_protected(String string) {
        this.id_int();
        int n = id_case[0];
        String[] stringArray = Mx_1.id_class((rcd_3)this.id_break[id_private[16]]);
        int n2 = stringArray.length;
        for (int i = id_implements[5]; i < n2; ++i) {
            String string2 = stringArray[i];
            n = Math.min(n, Mx_1.id_class((rcd_3)this.id_break[id_private[17]], string2, string));
        }
        return n;
    }

    public int id_private() {
        return (Integer)this.id_class[id_private[32]];
    }

    private static void id_final() {
        boolean[] blArray = new boolean[11];
        blArray[3] = true;
        id_implements = blArray;
    }

    private static void id_volatile() {
        id_protected = new String[]{new String("x"), new String("y"), new String("z"), new String("Metadata"), new String("EnclosingSize"), new String("y"), new String("Metadata"), new String("EnclosingSize"), new String("z"), new String("Metadata"), new String("EnclosingSize"), new String("x"), new String("Metadata"), new String("EnclosingSize"), new String("x"), new String("Metadata"), new String("EnclosingSize"), new String("z"), new String("Regions"), new String("Regions"), new String("Position"), new String("Regions"), new String("Size"), new String("Name"), new String("Properties"), new String("Regions"), new String("Size"), new String("x"), new String("Regions"), new String("Size"), new String("y"), new String("Regions"), new String("Size"), new String("z"), new String("Regions"), new String("BlockStates"), new String("Regions"), new String("Size"), new String("x"), new String("Regions"), new String("Size"), new String("y"), new String("Regions"), new String("Size"), new String("z"), new String("Regions"), new String("BlockStatePalette"), new String("x"), new String("y"), new String("z")};
    }

    private static void id_native() {
        id_catch = new byte[]{10, 2};
    }
}

