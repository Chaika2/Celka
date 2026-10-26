/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrIk_1;
import celestial.rrIu_1;
import celestial.rrtf_3;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIc_1
extends Setting<Boolean>
implements rrtf_3<rrIk_1> {
    public Object[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static byte[] id_throws;

    public rrIc_1(String string, rrIk_1 ... rrIk_1Array) {
        super(string, id_byte[0]);
        List<rrIk_1> list;
        this.id_volatile();
        rrIu_1 rrIu_12 = (rrIu_1)((Object)rrIu_1.staticFields10847edfe142316aa094e53a68b36f7b[id_protected[0]]);
        this.id_break[rrIc_1.id_protected[1]] = rrIu_12;
        String string2 = string;
        this.id_class[rrIc_1.id_protected[2]] = string2;
        this.id_break[rrIc_1.id_protected[3]] = list = Arrays.asList(rrIk_1Array);
    }

    public rrIc_1(String string, List<rrIk_1> list) {
        super(string, id_byte[1]);
        List<rrIk_1> list2;
        this.id_volatile();
        rrIu_1 rrIu_12 = (rrIu_1)((Object)rrIu_1.staticFields10847edfe142316aa094e53a68b36f7b[id_protected[4]]);
        this.id_break[rrIc_1.id_protected[5]] = rrIu_12;
        String string2 = string;
        this.id_class[rrIc_1.id_protected[6]] = string2;
        this.id_break[rrIc_1.id_protected[7]] = list2 = list;
    }

    static {
        rrIc_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDA52AF42;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8C16E7633AADD293L;
    }

    @Override
    public List<rrIk_1> id_class() {
        this.id_volatile();
        return (List)this.id_break[id_protected[9]];
    }

    public rrIc_1 id_class(rrIu_1 rrIu_12) {
        this.id_volatile();
        rrIu_1 rrIu_13 = rrIu_12;
        this.id_break[rrIc_1.id_protected[11]] = rrIu_13;
        return this;
    }

    @Override
    public Setting<?> id_break() {
        return this;
    }

    private static /* synthetic */ void ntfClinit() {
        rrIc_1.id_package();
        rrIc_1.id_native();
        rrIc_1.id_final();
    }

    public boolean id_finally() {
        this.id_volatile();
        return ((List)this.id_break[id_protected[8]]).stream().anyMatch(rrIk_1::id_class);
    }

    public rrIu_1 id_extends() {
        this.id_volatile();
        return (rrIu_1)((Object)this.id_break[id_protected[10]]);
    }

    private static void id_package() {
        id_byte = new boolean[2];
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-97, -84, -95, -57, -19, 123, -88, -25}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_final() {
        id_throws = new byte[]{2};
    }

    private void id_volatile() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
        }
    }

    private static void id_native() {
        short[] sArray = new short[12];
        sArray[1] = 1;
        sArray[5] = 1;
        sArray[10] = 1;
        sArray[11] = 1;
        id_protected = sArray;
    }
}

