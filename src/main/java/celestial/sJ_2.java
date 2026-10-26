/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sJ_2
extends C_try {
    public Object[] id_break;
    private static short[] id_throws;
    private static byte[] id_case;
    private static boolean[] id_catch;
    private static String[] id_private;

    public sJ_2(C_case c_case, List<String> list, String string, String string2) {
        super(c_case, list.toArray(new String[id_catch[0]]));
        this.id_throws();
        String string3 = string;
        this.id_break[sJ_2.id_throws[0]] = string3;
        String string4 = string2;
        this.id_break[sJ_2.id_throws[1]] = string4;
    }

    public sJ_2(C_case c_case, String string, String string2, String string3) {
        String[] stringArray = new String[id_catch[1]];
        stringArray[sJ_2.id_catch[2]] = string;
        super(c_case, stringArray);
        this.id_throws();
        String string4 = string2;
        this.id_break[sJ_2.id_throws[2]] = string4;
        String string5 = string3;
        this.id_break[sJ_2.id_throws[3]] = string5;
    }

    static {
        sJ_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9E3D11E6;
    }

    @Override
    public void id_class(String string, C_static c_static) {
        this.id_throws();
        Object[] objectArray = new Object[id_case[0]];
        objectArray[sJ_2.id_catch[3]] = (String)this.id_break[id_throws[5]];
        objectArray[sJ_2.id_catch[4]] = c_static.id_class();
        ((C_case)this.id_class[id_throws[4]]).id_switch().id_class(String.format(id_private[0], objectArray));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x53DEBFA621DB640EL;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        this.id_throws();
        Object[] objectArray = new Object[id_case[1]];
        objectArray[sJ_2.id_catch[5]] = (String)this.id_break[id_throws[7]];
        objectArray[sJ_2.id_catch[6]] = c_static.id_class();
        return ((C_case)this.id_class[id_throws[6]]).id_switch().id_byte(String.format(id_private[1], objectArray));
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-110, 85, 3, 63, 72, -32, 35, -26}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[2]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        sJ_2.id_native();
        sJ_2.id_extends();
        sJ_2.id_finally();
        sJ_2.id_protected();
    }

    private static void id_finally() {
        short[] sArray = new short[10];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[9] = 1;
        id_throws = sArray;
    }

    @Override
    public List<String> id_catch() {
        this.id_throws();
        Object[] objectArray = new Object[id_catch[7]];
        objectArray[sJ_2.id_catch[8]] = (String)this.id_break[id_throws[9]];
        return Collections.singletonList(String.format(id_private[2], objectArray));
    }

    private static void id_extends() {
        id_private = new String[]{new String("%s %s"), new String("%s %s"), new String("This command is an alias, for: %s ...")};
    }

    @Override
    public String id_implements() {
        this.id_throws();
        return (String)this.id_break[id_throws[8]];
    }

    private static void id_protected() {
        id_case = new byte[]{2, 2, 2};
    }

    private static void id_native() {
        boolean[] blArray = new boolean[9];
        blArray[1] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        id_catch = blArray;
    }
}

