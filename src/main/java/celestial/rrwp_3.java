/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package celestial;

import celestial.Ak_1;
import com.google.gson.annotations.SerializedName;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwp_3
extends Ak_1 {
    private static boolean[] id_extends;
    @SerializedName(value="category")
    private final String id_native;
    @SerializedName(value="color")
    private final int id_volatile;
    @SerializedName(value="expirationDate")
    private LocalDateTime id_final;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{54, 66, -55, 76, 46, 50, -51, -62}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrwp_3(String string, String string2, int n, String string3) {
        super(string, string2, id_extends[0]);
        this.id_native = string3;
        this.id_volatile = n;
    }

    public rrwp_3(String string, String string2, int n, String string3, LocalDateTime localDateTime) {
        super(string, string2, id_extends[1]);
        this.id_native = string3;
        this.id_volatile = n;
        this.id_final = localDateTime;
    }

    static {
        rrwp_3.id_case();
    }

    @Override
    public String toString() {
        return super.toString() + "UniqueServerData{color=" + this.id_volatile + ", category='" + this.id_native + "', expirationDate=" + this.id_final + "}";
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x11AE6F6;
    }

    public void id_class(LocalDateTime localDateTime) {
        this.id_final = localDateTime;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3DA5D07EE3FB9500L;
    }

    public LocalDateTime id_finally() {
        return this.id_final;
    }

    public rrwp_3 id_catch() {
        rrwp_3 rrwp_32 = new rrwp_3(this.id_class, this.id_break, this.id_volatile, this.id_native, this.id_final);
        rrwp_32.id_class(this);
        return rrwp_32;
    }

    private static void id_case() {
        id_extends = new boolean[2];
    }

    public String id_implements() {
        return this.id_native;
    }

    public int id_private() {
        return this.id_volatile;
    }
}

