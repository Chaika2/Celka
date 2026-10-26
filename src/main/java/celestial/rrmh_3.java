/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.C_case;
import celestial.C_class;
import celestial.C_static;
import celestial.C_try;
import celestial.cb_3;
import celestial.rXa_1;
import celestial.rdn_3;
import celestial.rhz_3;
import celestial.rrLY;
import celestial.rrQX;
import celestial.rrfY_2;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmh_3
extends C_try {
    private static short[] id_break;
    private static String[] id_throws;
    private static byte[] id_case;
    private static boolean[] id_catch;

    public rrmh_3(C_case c_case) {
        String[] stringArray = new String[id_catch[0]];
        stringArray[rrmh_3.id_catch[1]] = id_throws[0];
        super(c_case, stringArray);
    }

    static {
        rrmh_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE90D173E8B61ECBEL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x735264;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        for (int i = id_catch[2]; i < id_case[0]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrmh_3.b_.id_class[rrmh_3.id_break[0]]).id_implements[id_break[1]]).id_extends(i);
            if (rdn_32.id_class()) continue;
            ((Ax_1)rrmh_3.b_.id_class[id_break[2]]).id_class(id_catch[3], rrfY_2.id_break(i), (int)id_case[1], rXa_1.SWAP, id_catch[4]);
        }
        if (!((rhz_3)((cb_3)rrmh_3.b_.id_class[rrmh_3.id_break[3]]).id_implements[rrmh_3.id_break[4]]).id_break.get(id_catch[5]).id_class()) {
            ((Ax_1)rrmh_3.b_.id_class[id_break[5]]).id_class(id_catch[6], (int)id_case[2], (int)id_case[3], rXa_1.SWAP, id_catch[7]);
        }
        if (!((rhz_3)((cb_3)rrmh_3.b_.id_class[rrmh_3.id_break[6]]).id_implements[rrmh_3.id_break[7]]).id_break.get(id_catch[8]).id_class()) {
            ((Ax_1)rrmh_3.b_.id_class[id_break[8]]).id_class(id_catch[9], (int)id_case[4], (int)id_case[5], rXa_1.SWAP, id_catch[10]);
        }
        if (!((rhz_3)((cb_3)rrmh_3.b_.id_class[rrmh_3.id_break[9]]).id_implements[rrmh_3.id_break[10]]).id_break.get(id_case[6]).id_class()) {
            ((Ax_1)rrmh_3.b_.id_class[id_break[11]]).id_class(id_catch[11], (int)id_case[7], (int)id_case[8], rXa_1.SWAP, id_catch[12]);
        }
        if (!((rhz_3)((cb_3)rrmh_3.b_.id_class[rrmh_3.id_break[12]]).id_implements[rrmh_3.id_break[13]]).id_break.get(id_case[9]).id_class()) {
            ((Ax_1)rrmh_3.b_.id_class[id_break[14]]).id_class(id_catch[13], (int)id_case[10], (int)id_case[11], rXa_1.SWAP, id_catch[14]);
        }
        if (!((cb_3)rrmh_3.b_.id_class[id_break[15]]).Sn().id_class()) {
            ((Ax_1)rrmh_3.b_.id_class[id_break[16]]).id_class(id_catch[15], (int)id_case[12], (int)id_case[13], rXa_1.SWAP, id_catch[16]);
        }
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[17]]).id_finally().id_class(rrLY.id_class());
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-5, -4, 2, -96, 46, 2, 107, -84}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_throws = new String[]{new String("cleaninv"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u043e\u0447\u0438\u0441\u0442\u043a\u0438 \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u044f"), new String("> %s%s")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrmh_3.id_finally();
        rrmh_3.id_throws();
        rrmh_3.id_extends();
        rrmh_3.id_protected();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[20];
        blArray[0] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[19] = true;
        id_catch = blArray;
    }

    @Override
    public List<String> id_catch() {
        String string = this.id_break().get(id_catch[17]);
        String string2 = (String)C_class.id_instanceof().id_protected.id_class[id_break[18]];
        Object[] objectArray = new Object[id_case[14]];
        objectArray[rrmh_3.id_catch[18]] = string2;
        objectArray[rrmh_3.id_catch[19]] = string;
        return List.of(id_throws[2].formatted(objectArray));
    }

    private static void id_extends() {
        short[] sArray = new short[19];
        sArray[0] = 57;
        sArray[1] = 1;
        sArray[2] = 55;
        sArray[3] = 57;
        sArray[4] = 1;
        sArray[5] = 55;
        sArray[6] = 57;
        sArray[7] = 1;
        sArray[8] = 55;
        sArray[9] = 57;
        sArray[10] = 1;
        sArray[11] = 55;
        sArray[12] = 57;
        sArray[13] = 1;
        sArray[14] = 55;
        sArray[15] = 57;
        sArray[16] = 55;
        id_break = sArray;
    }

    @Override
    public String id_implements() {
        return id_throws[1];
    }

    private static void id_protected() {
        id_case = new byte[]{36, 45, 8, 45, 7, 45, 2, 6, 45, 3, 5, 45, 45, 45, 2};
    }
}

