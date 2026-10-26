/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_static;
import celestial.C_try;
import celestial.Hh_1;
import celestial.Ps_1;
import celestial.S;
import celestial.W;
import celestial.bl_3;
import celestial.cb_3;
import celestial.k_1;
import celestial.module.util.FarmBuilder;
import celestial.rU_2;
import celestial.rY_2;
import celestial.rjU_2;
import celestial.rrQX;
import celestial.sC_2;
import celestial.sl_3;
import celestial.sn_3;
import celestial.v_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sA_2
extends C_try {
    private static String[] id_throws;
    private static boolean[] id_case;
    private static float[] id_catch;
    private static double[] id_private;
    public Object[] id_break;
    private static byte[] id_implements;
    private static short[] id_finally;

    public sA_2(C_case c_case) {
        String[] stringArray = new String[id_implements[0]];
        stringArray[sA_2.id_case[0]] = id_throws[0];
        stringArray[sA_2.id_case[1]] = id_throws[1];
        super(c_case, stringArray);
        this.id_native();
        Object var6_2 = null;
        this.id_break[sA_2.id_finally[0]] = var6_2;
        c_case.s().id_class(new sn_3(this, c_case));
    }

    static {
        sA_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7B58D6A03E6B1FFDL;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        this.id_native();
        sl_3 sl_32 = sl_3.id_break(c_static.id_extends());
        if (sl_32 == null) {
            throw new W(c_static.id_private(), id_throws[2]);
        }
        FarmBuilder farmBuilder = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_finally[1]]).id_private().id_finally();
        switch (((int[])sC_2.id_class[id_finally[2]])[sl_32.ordinal()]) {
            case 1: 
            case 2: {
                if (sl_32 == (sl_3)((Object)sl_3.staticFields30c4eacb1e233b1abdfca916ea51d438[id_finally[3]]) && (rU_2)this.id_break[id_finally[4]] == null) {
                    throw new k_1(id_throws[3]);
                }
                rjU_2 rjU_22 = ((Hh_1)((Ps_1)this.id_class[sA_2.id_finally[5]]).id_throws().id_class[id_finally[6]]).id_finally().id_new();
                rU_2 rU_22 = rjU_22 != null ? new rU_2(rjU_22.id_class(id_private[0], (double)(((cb_3)sA_2.b_.id_class[id_finally[7]]).Bx() / id_catch[0]), id_private[1])) : (b_.id_catch() != null ? rU_2.id_class(b_.id_catch().Bs()) : ((Ps_1)this.id_class[id_finally[8]]).id_volatile());
                rU_2 rU_23 = c_static.id_final() ? (rU_2)c_static.id_break((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[id_finally[9]], rU_22) : rU_22;
                c_static.id_class(id_case[2]);
                if (sl_32 == (sl_3)((Object)sl_3.staticFields30c4eacb1e233b1abdfca916ea51d438[id_finally[10]])) {
                    rU_2 rU_24 = rU_23;
                    this.id_break[sA_2.id_finally[11]] = rU_24;
                    this.id_case(id_throws[4]);
                    break;
                }
                farmBuilder.id_class(new bl_3((rU_2)this.id_break[id_finally[12]], rU_23.id_class()));
                Object var15_12 = null;
                this.id_break[sA_2.id_finally[13]] = var15_12;
                this.id_case(id_throws[5]);
                break;
            }
            case 3: {
                rY_2 rY_22 = farmBuilder.id_new();
                if (rY_22 == null) {
                    this.id_case(id_throws[6]);
                    break;
                }
                rU_2 rU_25 = rY_22.id_byte();
                rU_2 rU_26 = rY_22.id_case();
                int n = Math.abs(rU_26.b_() - rU_25.b_()) + id_case[3];
                int n2 = Math.abs(rU_26.d_() - rU_25.d_()) + id_case[4];
                this.id_case("\u041f\u043e\u0437\u0438\u0446\u0438\u044f 1: " + rU_25);
                this.id_case("\u041f\u043e\u0437\u0438\u0446\u0438\u044f 2: " + rU_26);
                this.id_case("\u0420\u0430\u0434\u0438\u0443\u0441 \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u044f: " + n + "x" + n2);
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x60F162D2;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-8, -108, 25, -79, 53, 80, 62, 105}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        if (c_static.id_case()) {
            return new v_1().id_break(sl_3.id_class()).id_class(c_static.id_extends()).id_protected();
        }
        return Stream.empty();
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[19];
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[17] = true;
        blArray[18] = true;
        id_case = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        sA_2.id_throws();
        sA_2.id_final();
        sA_2.id_volatile();
        sA_2.id_extends();
        sA_2.id_package();
        sA_2.id_finally();
    }

    private static void id_finally() {
        id_implements = new byte[]{2, 5, 2, 2, 2, 2, 3, 2, 4, 2};
    }

    @Override
    public List<String> id_catch() {
        String string = this.id_break().get(id_case[5]);
        String string2 = (String)C_class.id_instanceof().id_protected.id_class[id_finally[14]];
        String[] stringArray = new String[id_implements[1]];
        Object[] objectArray = new Object[id_implements[2]];
        objectArray[sA_2.id_case[7]] = string2;
        objectArray[sA_2.id_case[8]] = string;
        stringArray[sA_2.id_case[6]] = id_throws[8].formatted(objectArray);
        Object[] objectArray2 = new Object[id_implements[3]];
        objectArray2[sA_2.id_case[10]] = string2;
        objectArray2[sA_2.id_case[11]] = string;
        stringArray[sA_2.id_case[9]] = id_throws[9].formatted(objectArray2);
        Object[] objectArray3 = new Object[id_implements[5]];
        objectArray3[sA_2.id_case[12]] = string2;
        objectArray3[sA_2.id_case[13]] = string;
        stringArray[sA_2.id_implements[4]] = id_throws[10].formatted(objectArray3);
        Object[] objectArray4 = new Object[id_implements[7]];
        objectArray4[sA_2.id_case[14]] = string2;
        objectArray4[sA_2.id_case[15]] = string;
        stringArray[sA_2.id_implements[6]] = id_throws[11].formatted(objectArray4);
        Object[] objectArray5 = new Object[id_implements[9]];
        objectArray5[sA_2.id_case[16]] = string2;
        objectArray5[sA_2.id_case[17]] = string;
        stringArray[sA_2.id_implements[8]] = id_throws[12].formatted(objectArray5);
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_private = new double[2];
    }

    @Override
    public String id_implements() {
        return id_throws[7];
    }

    private static void id_package() {
        id_catch = new float[]{2.0f};
    }

    public rU_2 id_protected() {
        this.id_native();
        return (rU_2)this.id_break[id_finally[15]];
    }

    private static void id_final() {
        id_throws = new String[]{new String("fb"), new String("farmbuilder"), new String("\u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0435"), new String("\u0421\u043d\u0430\u0447\u0430\u043b\u0430 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 pos1, \u043f\u0440\u0435\u0436\u0434\u0435 \u0447\u0435\u043c \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c pos2"), new String("\u041f\u0435\u0440\u0432\u0430\u044f \u043f\u043e\u0437\u0438\u0446\u0438\u044f \u0431\u044b\u043b\u0430 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u0430, \u0442\u0435\u043f\u0435\u0440\u044c \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u0432\u0442\u043e\u0440\u0443\u044e"), new String("\u0412\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0435 \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u043e"), new String("\u0412\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0435 \u043d\u0435 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u043e"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u0430\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u043e\u0439 \u043f\u043e\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u0444\u0435\u0440\u043c\u044b \u043a\u0440\u0438\u043f\u0435\u0440\u043e\u0432"), new String("> %s%s pos1 - \u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u043f\u0435\u0440\u0432\u0443\u044e \u043f\u043e\u0437\u0438\u0446\u0438\u044e \u043a \u0432\u0430\u0448\u0435\u043c\u0443 \u0442\u0435\u043a\u0443\u0449\u0435\u043c\u0443 \u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u044e"), new String("> %s%s pos1 <x> <y> <z> - \u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u043f\u0435\u0440\u0432\u0443\u044e \u043f\u043e\u0437\u0438\u0446\u0438\u044e \u043d\u0430 \u043b\u044e\u0431\u044b\u0435 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b"), new String("> %s%s pos2 - \u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u0432\u0442\u043e\u0440\u0443\u044e \u043f\u043e\u0437\u0438\u0446\u0438\u044e \u043a \u0432\u0430\u0448\u0435\u043c\u0443 \u0442\u0435\u043a\u0443\u0449\u0435\u043c\u0443 \u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u044e"), new String("> %s%s pos2 <x> <y> <z> - \u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u0432\u0442\u043e\u0440\u0443\u044e \u043f\u043e\u0437\u0438\u0446\u0438\u044e \u043d\u0430 \u043b\u044e\u0431\u044b\u0435 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b"), new String("> %s%s sel - \u0423\u0437\u043d\u0430\u0442\u044c \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u043d\u043e\u0439 \u043e\u0431\u043b\u0430\u0441\u0442\u0438")};
    }

    private static void id_volatile() {
        short[] sArray = new short[16];
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[6] = 16;
        sArray[7] = 57;
        sArray[8] = 1;
        id_finally = sArray;
    }

    private void id_native() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[18]];
        }
    }
}

