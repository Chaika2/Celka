/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIz_1
extends Setting<Integer> {
    private static boolean[] id_byte;
    public Object[] id_break;
    private static short[] id_protected;
    private static byte[] id_throws;

    private void id_int() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
        }
    }

    public rrIz_1(String string, int n) {
        super(string, n);
        Supplier<Boolean> supplier;
        this.id_int();
        String string2 = string;
        this.id_class[rrIz_1.id_protected[0]] = string2;
        Integer n2 = n;
        this.id_break[rrIz_1.id_protected[1]] = n2;
        this.id_break[rrIz_1.id_protected[2]] = supplier = () -> id_byte[1];
    }

    static {
        rrIz_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x435D1574715ABA90L;
    }

    public Supplier<Boolean> id_class() {
        this.id_int();
        return (Supplier)this.id_break[id_protected[4]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x15A8F4EC;
    }

    public rrIz_1 id_break() {
        Supplier<Boolean> supplier;
        this.id_int();
        this.id_break[rrIz_1.id_protected[3]] = supplier = () -> id_byte[0];
        return this;
    }

    private static /* synthetic */ void ntfClinit() {
        rrIz_1.id_final();
        rrIz_1.id_extends();
        rrIz_1.id_package();
    }

    public Integer id_finally() {
        this.id_int();
        return (Integer)this.id_break[id_protected[5]];
    }

    private static void id_extends() {
        short[] sArray = new short[6];
        sArray[1] = 1;
        sArray[5] = 1;
        id_protected = sArray;
    }

    private static void id_package() {
        id_throws = new byte[]{2};
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-62, -35, 35, -42, 68, -54, -10, 127}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_final() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }
}

