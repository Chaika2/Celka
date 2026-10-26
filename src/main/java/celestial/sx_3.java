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
import celestial.module.util.CreeperFarm;
import celestial.rU_2;
import celestial.rY_2;
import celestial.rjU_2;
import celestial.rql_3;
import celestial.rrQX;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.rrwY_2;
import celestial.sW_2;
import celestial.sd_3;
import celestial.sk_3;
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

public class sx_3
extends C_try {
    public Object[] id_break;
    private static double[] id_throws;
    private static String[] id_case;
    private static float[] id_catch;
    private static short[] id_private;
    private static byte[] id_implements;
    private static boolean[] id_finally;

    public sx_3(C_case c_case) {
        String[] stringArray = new String[id_implements[0]];
        stringArray[sx_3.id_finally[0]] = id_case[0];
        stringArray[sx_3.id_finally[1]] = id_case[1];
        super(c_case, stringArray);
        this.id_extends();
        Object var6_2 = null;
        this.id_break[sx_3.id_private[0]] = var6_2;
        c_case.s().id_class(new sd_3(this));
    }

    static {
        sx_3.ntfClinit();
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        this.id_extends();
        sW_2 sW_22 = sW_2.id_break(c_static.id_extends());
        if (sW_22 == null) {
            throw new W(c_static.id_private(), id_case[2]);
        }
        CreeperFarm creeperFarm = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[1]]).id_private().i();
        switch (((int[])sk_3.id_class[id_private[2]])[sW_22.ordinal()]) {
            case 1: 
            case 2: {
                if (sW_22 == (sW_2)((Object)sW_2.staticFields6b259e9d4f13397ca074ec4185749984[id_private[3]]) && (rU_2)this.id_break[id_private[4]] == null) {
                    throw new k_1(id_case[3]);
                }
                rjU_2 rjU_22 = ((Hh_1)((Ps_1)this.id_class[sx_3.id_private[5]]).id_throws().id_class[id_private[6]]).id_finally().id_new();
                rU_2 rU_22 = rjU_22 != null ? new rU_2(rjU_22.id_class(id_throws[0], (double)(((cb_3)sx_3.b_.id_class[id_private[7]]).Bx() / id_catch[0]), id_throws[1])) : (b_.id_catch() != null ? rU_2.id_class(b_.id_catch().Bs()) : ((Ps_1)this.id_class[id_private[8]]).id_volatile());
                rU_2 rU_23 = c_static.id_final() ? (rU_2)c_static.id_break((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[id_private[9]], rU_22) : rU_22;
                c_static.id_class(id_finally[2]);
                if (sW_22 == (sW_2)((Object)sW_2.staticFields6b259e9d4f13397ca074ec4185749984[id_private[10]])) {
                    rU_2 rU_24 = rU_23;
                    this.id_break[sx_3.id_private[11]] = rU_24;
                    this.id_case(id_case[4]);
                    break;
                }
                bl_3 bl_32 = new bl_3((rU_2)this.id_break[id_private[12]], rU_23);
                creeperFarm.id_class(bl_32);
                creeperFarm.id_continue().add(bl_32);
                Object var15_17 = null;
                this.id_break[sx_3.id_private[13]] = var15_17;
                this.id_case(id_case[5]);
                break;
            }
            case 3: {
                rY_2 rY_22 = creeperFarm.id_new();
                if (rY_22 == null) {
                    this.id_case(id_case[6]);
                    break;
                }
                rU_2 rU_25 = rY_22.id_byte();
                rU_2 rU_26 = rY_22.id_case();
                int n = Math.abs(rU_26.b_() - rU_25.b_()) + id_finally[3];
                int n2 = Math.abs(rU_26.d_() - rU_25.d_()) + id_finally[4];
                this.id_case("\u041f\u043e\u0437\u0438\u0446\u0438\u044f 1: " + rU_25);
                this.id_case("\u041f\u043e\u0437\u0438\u0446\u0438\u044f 2: " + rU_26);
                this.id_case("\u0420\u0430\u0434\u0438\u0443\u0441 \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u044f: " + n + "x" + n2);
                break;
            }
            case 4: {
                rY_2 rY_23 = creeperFarm.id_new();
                if (rY_23 == null) {
                    this.id_case(id_case[7]);
                    ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_private[14]]).id_class(new rrtx_3(creeperFarm.id_final(), id_case[8], (int)id_private[15]));
                    return;
                }
                if (c_static.id_case()) {
                    String string2 = c_static.id_extends();
                    if (rql_3.id_break(string2)) {
                        throw new W(c_static.id_private(), id_case[9]);
                    }
                    ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[16]]).id_implements().id_byte(string2, id_finally[5]);
                    break;
                }
                throw new W(c_static.id_private(), id_case[10]);
            }
            case 5: {
                if (c_static.id_case()) {
                    String string3 = c_static.id_extends();
                    if (rql_3.id_break(string3)) {
                        throw new W(c_static.id_private(), id_case[11]);
                    }
                    ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[17]]).id_implements().id_break(string3, id_finally[6]);
                    break;
                }
                throw new W(c_static.id_private(), id_case[12]);
            }
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2425640B5F7AC809L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xED62B58F;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        if (c_static.id_case()) {
            return new v_1().id_break(sW_2.id_class()).id_class(c_static.id_extends()).id_protected();
        }
        sW_2 sW_22 = sW_2.id_break(c_static.id_extends());
        if (sW_22 != null) {
            if (sW_22 == (sW_2)((Object)sW_2.staticFields6b259e9d4f13397ca074ec4185749984[id_private[18]]) || sW_22 == (sW_2)((Object)sW_2.staticFields6b259e9d4f13397ca074ec4185749984[id_private[19]])) {
                if (c_static.id_catch(id_implements[1])) {
                    return c_static.id_class((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[id_private[20]]);
                }
            } else if (sW_22 == (sW_2)((Object)sW_2.staticFields6b259e9d4f13397ca074ec4185749984[id_private[21]]) || sW_22 == (sW_2)((Object)sW_2.staticFields6b259e9d4f13397ca074ec4185749984[id_private[22]])) {
                rrwY_2 rrwY_22 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[23]]).id_implements();
                rrwY_22.id_byte(id_finally[7]);
                Stream<String> stream = rrwY_22.id_break().stream().map(rrwR_22 -> rrwR_22.id_break());
                return new v_1().id_break(stream).id_class(c_static.id_extends()).id_break().id_protected();
            }
        }
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{113, 89, -126, -93, -14, 70, 33, -126}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_implements = new byte[]{2, 3, 9, 2, 2, 2, 2, 3, 2, 4, 2, 5, 2, 6, 2, 7, 8, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        sx_3.id_finally();
        sx_3.id_final();
        sx_3.id_volatile();
        sx_3.id_native();
        sx_3.id_package();
        sx_3.id_throws();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[28];
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[20] = true;
        blArray[22] = true;
        blArray[24] = true;
        blArray[26] = true;
        blArray[27] = true;
        id_finally = blArray;
    }

    @Override
    public List<String> id_catch() {
        String string = this.id_break().get(id_finally[8]);
        String string2 = (String)C_class.id_instanceof().id_protected.id_class[id_private[24]];
        String[] stringArray = new String[id_implements[2]];
        Object[] objectArray = new Object[id_implements[3]];
        objectArray[sx_3.id_finally[10]] = string2;
        objectArray[sx_3.id_finally[11]] = string;
        stringArray[sx_3.id_finally[9]] = id_case[14].formatted(objectArray);
        Object[] objectArray2 = new Object[id_implements[4]];
        objectArray2[sx_3.id_finally[13]] = string2;
        objectArray2[sx_3.id_finally[14]] = string;
        stringArray[sx_3.id_finally[12]] = id_case[15].formatted(objectArray2);
        Object[] objectArray3 = new Object[id_implements[6]];
        objectArray3[sx_3.id_finally[15]] = string2;
        objectArray3[sx_3.id_finally[16]] = string;
        stringArray[sx_3.id_implements[5]] = id_case[16].formatted(objectArray3);
        Object[] objectArray4 = new Object[id_implements[8]];
        objectArray4[sx_3.id_finally[17]] = string2;
        objectArray4[sx_3.id_finally[18]] = string;
        stringArray[sx_3.id_implements[7]] = id_case[17].formatted(objectArray4);
        Object[] objectArray5 = new Object[id_implements[10]];
        objectArray5[sx_3.id_finally[19]] = string2;
        objectArray5[sx_3.id_finally[20]] = string;
        stringArray[sx_3.id_implements[9]] = id_case[18].formatted(objectArray5);
        Object[] objectArray6 = new Object[id_implements[12]];
        objectArray6[sx_3.id_finally[21]] = string2;
        objectArray6[sx_3.id_finally[22]] = string;
        stringArray[sx_3.id_implements[11]] = id_case[19].formatted(objectArray6);
        Object[] objectArray7 = new Object[id_implements[14]];
        objectArray7[sx_3.id_finally[23]] = string2;
        objectArray7[sx_3.id_finally[24]] = string;
        stringArray[sx_3.id_implements[13]] = id_case[20].formatted(objectArray7);
        stringArray[sx_3.id_implements[15]] = id_case[21];
        Object[] objectArray8 = new Object[id_implements[17]];
        objectArray8[sx_3.id_finally[25]] = string2;
        objectArray8[sx_3.id_finally[26]] = string;
        stringArray[sx_3.id_implements[16]] = id_case[22].formatted(objectArray8);
        return Arrays.asList(stringArray);
    }

    private void id_extends() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_finally[27]];
        }
    }

    @Override
    public String id_implements() {
        return id_case[13];
    }

    private static void id_package() {
        id_catch = new float[]{2.0f};
    }

    public rU_2 id_protected() {
        this.id_extends();
        return (rU_2)this.id_break[id_private[25]];
    }

    private static void id_final() {
        id_case = new String[]{new String("cf"), new String("creeperfarm"), new String("\u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0435"), new String("\u0421\u043d\u0430\u0447\u0430\u043b\u0430 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 pos1, \u043f\u0440\u0435\u0436\u0434\u0435 \u0447\u0435\u043c \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c pos2"), new String("\u041f\u0435\u0440\u0432\u0430\u044f \u043f\u043e\u0437\u0438\u0446\u0438\u044f \u0431\u044b\u043b\u0430 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u0430, \u0442\u0435\u043f\u0435\u0440\u044c \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u0432\u0442\u043e\u0440\u0443\u044e"), new String("\u0412\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0435 \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u043e"), new String("\u0412\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0435 \u043d\u0435 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u043e"), new String("\u0412\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0435 \u043d\u0435 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u043e"), new String("\u0412\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0435 \u043d\u0435 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u043e"), new String("\u0438\u043c\u044f"), new String("\u0438\u043c\u044f"), new String("\u0438\u043c\u044f"), new String("\u0438\u043c\u044f"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u0443\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u043c\u043e\u0434\u0443\u043b\u0435\u043c \"CreeperFarm\""), new String("> %s%s pos1 - \u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u043f\u0435\u0440\u0432\u0443\u044e \u043f\u043e\u0437\u0438\u0446\u0438\u044e \u043a \u0432\u0430\u0448\u0435\u043c\u0443 \u0442\u0435\u043a\u0443\u0449\u0435\u043c\u0443 \u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u044e"), new String("> %s%s pos1 <x> <y> <z> - \u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u043f\u0435\u0440\u0432\u0443\u044e \u043f\u043e\u0437\u0438\u0446\u0438\u044e \u043d\u0430 \u043b\u044e\u0431\u044b\u0435 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b"), new String("> %s%s pos2 - \u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u0432\u0442\u043e\u0440\u0443\u044e \u043f\u043e\u0437\u0438\u0446\u0438\u044e \u043a \u0432\u0430\u0448\u0435\u043c\u0443 \u0442\u0435\u043a\u0443\u0449\u0435\u043c\u0443 \u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u044e"), new String("> %s%s pos2 <x> <y> <z> - \u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u0432\u0442\u043e\u0440\u0443\u044e \u043f\u043e\u0437\u0438\u0446\u0438\u044e \u043d\u0430 \u043b\u044e\u0431\u044b\u0435 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b"), new String("> %s%s sel - \u0423\u0437\u043d\u0430\u0442\u044c \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u043d\u043e\u0439 \u043e\u0431\u043b\u0430\u0441\u0442\u0438"), new String("> %s%s save <name> - \u0421\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c \u043a\u043e\u043d\u0444\u0438\u0433 \u0441 \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0435\u043c"), new String("> %s%s remove <name> - \u0423\u0434\u0430\u043b\u0438\u0442\u044c \u043a\u043e\u043d\u0444\u0438\u0433"), new String(""), new String("\u041f\u0440\u0438\u043c\u0435\u0440: %s%s pos1 100 65 100")};
    }

    private static void id_volatile() {
        short[] sArray = new short[26];
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[6] = 16;
        sArray[7] = 57;
        sArray[8] = 1;
        sArray[15] = 2000;
        sArray[19] = 1;
        sArray[21] = 3;
        sArray[22] = 4;
        id_private = sArray;
    }

    private static void id_native() {
        id_throws = new double[2];
    }
}

