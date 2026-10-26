/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrtU_2;
import celestial.rrta_3;
import celestial.rrti_3;
import celestial.rrwr_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrte_3 {
    public Object[] id_class;
    private static short[] id_break;
    private static String[] id_byte;
    private static byte[] id_protected;

    public static rrti_3 id_byte() {
        return new rrti_3();
    }

    public rrte_3(rrti_3 rrti_32) {
        this.id_implements();
        Pattern pattern = (Pattern)rrti_32.id_class[id_break[0]];
        this.id_class[rrte_3.id_break[1]] = pattern;
        List list = (List)rrti_32.id_class[id_break[2]];
        this.id_class[rrte_3.id_break[3]] = list;
        rrta_3 rrta_32 = (rrta_3)((Object)rrti_32.id_class[id_break[4]]);
        this.id_class[rrte_3.id_break[5]] = rrta_32;
        String string = (String)rrti_32.id_class[id_break[6]];
        this.id_class[rrte_3.id_break[7]] = string;
    }

    static {
        rrte_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{34, -24, -68, -77, 18, -93, 55, -78}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_class() {
        return (String)this.id_class[id_break[13]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD79468B6;
    }

    public static rrte_3 id_class(Pattern pattern) {
        return new rrti_3().id_class(pattern).id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9FC5D807673FD9D3L;
    }

    public rrtU_2 id_break(String string) {
        if ((Pattern)this.id_class[id_break[8]] != null && !((Pattern)this.id_class[id_break[9]]).matcher(string).matches()) {
            return rrtU_2.id_class(id_byte[0]);
        }
        for (rrwr_3 rrwr_32 : (List)this.id_class[id_break[10]]) {
            rrtU_2 rrtU_22 = rrwr_32.id_break(string);
            if (rrtU_22.id_byte()) continue;
            return rrtU_22;
        }
        return rrtU_2.id_class();
    }

    public Pattern id_break() {
        return (Pattern)this.id_class[id_break[12]];
    }

    public rrta_3 id_throws() {
        return (rrta_3)((Object)this.id_class[id_break[11]]);
    }

    private static /* synthetic */ void ntfClinit() {
        rrte_3.id_catch();
        rrte_3.id_private();
        rrte_3.id_case();
    }

    private static void id_catch() {
        id_byte = new String[]{new String("")};
    }

    private static void id_case() {
        id_protected = new byte[]{4};
    }

    private void id_implements() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }

    public List<rrwr_3> id_protected() {
        return (List)this.id_class[id_break[14]];
    }

    private static void id_private() {
        short[] sArray = new short[15];
        sArray[0] = 1;
        sArray[1] = 1;
        sArray[2] = 3;
        sArray[3] = 3;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[10] = 3;
        sArray[12] = 1;
        sArray[13] = 2;
        sArray[14] = 3;
        id_break = sArray;
    }
}

