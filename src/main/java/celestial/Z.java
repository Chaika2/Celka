/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.PP;
import celestial.W;
import celestial.rVe_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgl_3;
import celestial.rgp_3;
import celestial.rgy_3;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Z<E>
implements PP {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_throws;
    private static String[] id_case;
    private static byte[] id_catch;

    private static void id_byte() {
        short[] sArray = new short[22];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[6] = 1;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[10] = 2;
        sArray[11] = 2;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[16] = 2;
        sArray[17] = 2;
        sArray[18] = 2;
        sArray[19] = 2;
        sArray[20] = 2;
        sArray[21] = 2;
        id_break = sArray;
    }

    public Z<E> id_byte(int n) {
        Z z = this;
        Integer n2 = (Integer)z.id_class[id_break[9]] + n;
        z.id_class[Z.id_break[10]] = n2;
        return this;
    }

    public Z(E ... EArray) {
        List<E> list;
        this.id_case();
        Integer n = id_catch[1];
        this.id_class[Z.id_break[3]] = n;
        Integer n2 = id_throws[1];
        this.id_class[Z.id_break[4]] = n2;
        this.id_class[Z.id_break[5]] = list = Arrays.asList(EArray);
    }

    public Z(List<E> list) {
        List<E> list2;
        this.id_case();
        Integer n = id_catch[0];
        this.id_class[Z.id_break[0]] = n;
        Integer n2 = id_throws[0];
        this.id_class[Z.id_break[1]] = n2;
        this.id_class[Z.id_break[2]] = list2 = list;
    }

    static {
        Z.ntfClinit();
    }

    public static <T> void id_class(C_static c_static, Z<T> z, Function<T, rVe_1> function) throws x_1 {
        Z.id_class(c_static, z, null, function, null);
    }

    public static <T> void id_class(C_static c_static, T[] TArray, Function<T, rVe_1> function) throws x_1 {
        Z.id_class(c_static, Arrays.asList(TArray), null, function, null);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF04BD258516FEF9AL;
    }

    public int id_class() {
        return (((List)this.id_class[id_break[7]]).size() - id_throws[2]) / (Integer)this.id_class[id_break[8]] + id_throws[3];
    }

    public static <T> void id_class(C_static c_static, List<T> list, Function<T, rVe_1> function) throws x_1 {
        Z.id_class(c_static, new Z<T>(list), null, function, null);
    }

    public static <T> void id_class(C_static c_static, List<T> list, Function<T, rVe_1> function, String string) throws x_1 {
        Z.id_class(c_static, new Z<T>(list), null, function, string);
    }

    public void id_class(Function<E, rVe_1> function, String string) {
        int n;
        int n2;
        for (n2 = n = ((Integer)this.id_class[id_break[11]] - id_throws[6]) * (Integer)this.id_class[id_break[12]]; n2 < n + (Integer)this.id_class[id_break[13]]; ++n2) {
            if (n2 >= ((List)this.id_class[id_break[14]]).size()) continue;
            rVi_1[] rVi_1Array = new rVi_1[id_throws[7]];
            rVi_1Array[Z.id_throws[8]] = function.apply(((List)this.id_class[id_break[15]]).get(n2));
            this.id_class(rVi_1Array);
        }
        n2 = string != null && this.id_break((Integer)this.id_class[id_break[16]] - id_throws[9]) ? id_throws[10] : id_throws[11];
        boolean bl = string != null && this.id_break((Integer)this.id_class[id_break[17]] + id_throws[12]) ? id_throws[13] : id_throws[14];
        rgN_2 rgN_22 = new rgN_2(id_case[0]);
        if (n2 != 0) {
            Object[] objectArray = new Object[id_catch[2]];
            objectArray[Z.id_throws[15]] = string;
            objectArray[Z.id_throws[16]] = (Integer)this.id_class[id_break[18]] - id_throws[17];
            rgN_22.id_class(rgN_22.id_class().id_class(new rgl_3(rgH_2.RUN_COMMAND, String.format(id_case[1], objectArray))).id_class(new rgy_3(rgp_3.id_class, new rgN_2(id_case[2]))));
        } else {
            rgN_22.id_class(rgN_22.id_class().id_class(rgF_2.DARK_GRAY));
        }
        rgN_2 rgN_23 = new rgN_2(id_case[3]);
        if (bl) {
            Object[] objectArray = new Object[id_catch[3]];
            objectArray[Z.id_throws[18]] = string;
            objectArray[Z.id_throws[19]] = (Integer)this.id_class[id_break[19]] + id_throws[20];
            rgN_23.id_class(rgN_23.id_class().id_class(new rgl_3(rgH_2.RUN_COMMAND, String.format(id_case[4], objectArray))).id_class(new rgy_3(rgp_3.id_class, new rgN_2(id_case[5]))));
        } else {
            rgN_23.id_class(rgN_23.id_class().id_class(rgF_2.DARK_GRAY));
        }
        rVe_1 rVe_12 = new rVe_1(id_case[6]);
        rVe_12.id_class(rVe_12.id_class().id_class(rgF_2.GRAY));
        rVe_12.id_class(rgN_22);
        rVe_12.id_class(id_case[7]);
        rVe_12.id_class(rgN_23);
        Object[] objectArray = new Object[id_catch[4]];
        objectArray[Z.id_throws[21]] = (int)((Integer)this.id_class[id_break[20]]);
        objectArray[Z.id_throws[22]] = this.id_class();
        rVe_12.id_class(String.format(id_case[8], objectArray));
        rVi_1[] rVi_1Array = new rVi_1[id_throws[23]];
        rVi_1Array[Z.id_throws[24]] = rVe_12;
        this.id_class(rVi_1Array);
    }

    public static <T> void id_class(C_static c_static, List<T> list, Runnable runnable, Function<T, rVe_1> function, String string) throws x_1 {
        Z.id_class(c_static, new Z<T>(list), runnable, function, string);
    }

    public static <T> void id_class(C_static c_static, T[] TArray, Runnable runnable, Function<T, rVe_1> function) throws x_1 {
        Z.id_class(c_static, Arrays.asList(TArray), runnable, function, null);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-6, 28, 71, -11, -95, 6, 81, -14}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static <T> void id_class(C_static c_static, Z<T> z, Function<T, rVe_1> function, String string) throws x_1 {
        Z.id_class(c_static, z, null, function, string);
    }

    public static <T> void id_class(C_static c_static, T[] TArray, Runnable runnable, Function<T, rVe_1> function, String string) throws x_1 {
        Z.id_class(c_static, Arrays.asList(TArray), runnable, function, string);
    }

    public static <T> void id_class(C_static c_static, List<T> list, Runnable runnable, Function<T, rVe_1> function) throws x_1 {
        Z.id_class(c_static, new Z<T>(list), runnable, function, null);
    }

    public void id_class(Function<E, rVe_1> function) {
        this.id_class(function, null);
    }

    public static <T> void id_class(C_static c_static, Z<T> z, Runnable runnable, Function<T, rVe_1> function) throws x_1 {
        Z.id_class(c_static, z, runnable, function, null);
    }

    public static <T> void id_class(C_static c_static, T[] TArray, Function<T, rVe_1> function, String string) throws x_1 {
        Z.id_class(c_static, Arrays.asList(TArray), null, function, string);
    }

    public static <T> void id_class(C_static c_static, Z<T> z, Runnable runnable, Function<T, rVe_1> function, String string) throws x_1 {
        int n = id_throws[25];
        c_static.id_class(id_throws[26]);
        if (c_static.id_final() && !z.id_break(n = c_static.id_catch(Integer.class).intValue())) {
            Object[] objectArray = new Object[id_throws[27]];
            objectArray[Z.id_throws[28]] = z.id_class();
            throw new W(c_static.id_private(), String.format(id_case[9], objectArray), c_static.id_private().id_break());
        }
        z.id_byte(n - (Integer)z.id_class[id_break[21]]);
        if (runnable != null) {
            runnable.run();
        }
        z.id_class(function, string);
    }

    public Z<E> id_class(int n) {
        Integer n2 = n;
        this.id_class[Z.id_break[6]] = n2;
        return this;
    }

    public boolean id_break(int n) {
        return n > 0 && n <= this.id_class() ? id_throws[4] : id_throws[5];
    }

    private static void id_break() {
        id_catch = new byte[]{8, 8, 2, 2, 2, 3, 2};
    }

    private static void id_throws() {
        id_case = new String[]{new String("\u00ab"), new String("%s %d"), new String("\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u0434\u043b\u044f \u043f\u0440\u043e\u0441\u043c\u043e\u0442\u0440\u0430 \u043f\u0440\u0435\u0434\u044b\u0434\u0443\u0449\u0435\u0439 \u0441\u0442\u0440\u0430\u043d\u0438\u0446\u044b"), new String("\u00bb"), new String("%s %d"), new String("\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u0434\u043b\u044f \u043f\u0440\u043e\u0441\u043c\u043e\u0442\u0440\u0430 \u0441\u043b\u0435\u0434\u0443\u044e\u0449\u0435\u0439 \u0441\u0442\u0440\u0430\u043d\u0438\u0446\u044b"), new String(""), new String(" | "), new String(" %d/%d"), new String("\u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0442\u0435\u043b\u044c\u043d\u0430\u044f \u0441\u0442\u0440\u0430\u043d\u0438\u0446\u0430 (1-%d)")};
    }

    private static /* synthetic */ void ntfClinit() {
        Z.id_protected();
        Z.id_throws();
        Z.id_byte();
        Z.id_break();
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_catch[5]];
            objectArray[Z.id_throws[29]] = id_throws[30];
            objectArray[Z.id_catch[6]] = id_throws[31];
        }
    }

    private static int id_protected(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFB7C3ACA;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[32];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[19] = true;
        blArray[20] = true;
        blArray[22] = true;
        blArray[23] = true;
        blArray[25] = true;
        blArray[26] = true;
        blArray[27] = true;
        blArray[29] = true;
        id_throws = blArray;
    }
}

