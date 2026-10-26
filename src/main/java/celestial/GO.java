/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MP;
import celestial.a_1;
import celestial.rP_2;
import celestial.rU_2;
import celestial.rd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GO
extends MP {
    public Object[] id_class;
    private static short[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;

    @Override
    public rP_2 id_byte() {
        this.id_extends();
        return (rP_2)this.id_class[id_break[4]];
    }

    public GO(a_1 a_12, int n, int n2) {
        List<rd_3> list;
        List<rU_2> list2;
        this.id_extends();
        this.id_class[GO.id_break[0]] = list2 = a_12.id_break().subList(n, n2 + id_protected[0]);
        this.id_class[GO.id_break[1]] = list = a_12.id_catch().subList(n, n2);
        Integer n3 = a_12.id_case();
        this.id_class[GO.id_break[2]] = n3;
        rP_2 rP_22 = a_12.id_byte();
        this.id_class[GO.id_break[3]] = rP_22;
        this.id_throws();
    }

    public GO(a_1 a_12, int n) {
        this(a_12, id_protected[1], n);
    }

    static {
        GO.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-92, -105, -116, 81, -66, -49, 6, 58}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9C8EABAA75EAC092L;
    }

    @Override
    public List<rU_2> id_break() {
        this.id_extends();
        return Collections.unmodifiableList((List)this.id_class[id_break[6]]);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF7BB9A79;
    }

    private static /* synthetic */ void ntfClinit() {
        GO.id_native();
        GO.id_finally();
        GO.id_volatile();
    }

    private static void id_finally() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 3;
        sArray[5] = 1;
        sArray[7] = 2;
        id_break = sArray;
    }

    @Override
    public List<rd_3> id_catch() {
        this.id_extends();
        return Collections.unmodifiableList((List)this.id_class[id_break[5]]);
    }

    private void id_extends() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[GO.id_byte[1]] = id_protected[2];
        }
    }

    @Override
    public int id_case() {
        this.id_extends();
        return (Integer)this.id_class[id_break[7]];
    }

    private static void id_volatile() {
        id_byte = new byte[]{4, 2};
    }

    private static void id_native() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        id_protected = blArray;
    }
}

