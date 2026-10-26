/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrta_3;
import celestial.rrte_3;
import celestial.rrwr_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrti_3 {
    private static byte[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    public rrti_3() {
        ArrayList arrayList;
        this.id_byte();
        rrta_3 rrta_32 = (rrta_3)((Object)rrta_3.staticFields0b9ba99d5751335787deb45ab94d73c6[id_byte[0]]);
        this.id_class[rrti_3.id_byte[1]] = rrta_32;
        this.id_class[rrti_3.id_byte[2]] = arrayList = new ArrayList();
    }

    static {
        rrti_3.ntfClinit();
    }

    public rrti_3 id_class(Pattern pattern) {
        Pattern pattern2 = pattern;
        this.id_class[rrti_3.id_byte[4]] = pattern2;
        return this;
    }

    public rrti_3 id_class(rrta_3 rrta_32) {
        rrta_3 rrta_33 = rrta_32;
        this.id_class[rrti_3.id_byte[5]] = rrta_33;
        return this;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8A66CA5CBBB86FA2L;
    }

    public rrte_3 id_class() {
        return new rrte_3(this);
    }

    public rrti_3 id_class(rrwr_3 ... rrwr_3Array) {
        ((List)this.id_class[id_byte[3]]).addAll(List.of(rrwr_3Array));
        return this;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-90, 101, 75, -45, 11, 73, 55, -50}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA74D7A8F;
    }

    private static void id_break() {
        id_break = new byte[]{4};
    }

    public rrti_3 id_break(String string) {
        String string2 = string;
        this.id_class[rrti_3.id_byte[6]] = string2;
        return this;
    }

    private static /* synthetic */ void ntfClinit() {
        rrti_3.id_protected();
        rrti_3.id_break();
    }

    private static void id_protected() {
        short[] sArray = new short[7];
        sArray[2] = 3;
        sArray[3] = 3;
        sArray[4] = 1;
        sArray[6] = 2;
        id_byte = sArray;
    }
}

