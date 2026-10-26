/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package celestial;

import com.google.gson.annotations.SerializedName;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwu_3 {
    @SerializedName(value="password")
    public String id_class;
    @SerializedName(value="ipPort")
    public String id_break;
    @SerializedName(value="username")
    public String id_byte;
    @SerializedName(value="type")
    public String id_protected;
    private static boolean[] id_throws;
    private static String[] id_case;

    private static void id_byte() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_throws = blArray;
    }

    public rrwu_3() {
        this.id_break = id_case[0];
        this.id_protected = id_case[1];
        this.id_byte = id_case[2];
        this.id_class = id_case[3];
    }

    public rrwu_3(boolean bl, String string, String string2, String string3) {
        this.id_break = id_case[4];
        this.id_protected = id_case[5];
        this.id_byte = id_case[6];
        this.id_class = id_case[7];
        this.id_protected = bl ? id_case[8] : id_case[9];
        this.id_break = string;
        this.id_byte = string2;
        this.id_class = string3;
    }

    static {
        rrwu_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x96328D49EF8611D5L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{125, 68, 14, 71, 94, -38, 75, 73}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE20F3C9E;
    }

    public String id_class() {
        return this.id_break.split(id_case[11])[id_throws[1]];
    }

    public int id_break() {
        return Integer.parseInt(this.id_break.split(id_case[10])[id_throws[0]]);
    }

    private static /* synthetic */ void ntfClinit() {
        rrwu_3.id_byte();
        rrwu_3.id_protected();
    }

    private static void id_protected() {
        id_case = new String[]{new String(""), new String("SOCKS5"), new String(""), new String(""), new String(""), new String("SOCKS5"), new String(""), new String(""), new String("SOCKS4"), new String("SOCKS5"), new String(":"), new String(":")};
    }
}

