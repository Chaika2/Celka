/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzv_3;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzZ_2
extends URLConnection {
    private static boolean[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    public rrzZ_2(URL uRL, Function<rrzv_3, InputStream> function) {
        super(uRL);
        Function<rrzv_3, InputStream> function2;
        this.id_byte();
        this.id_class[rrzZ_2.id_byte[0]] = function2 = function;
    }

    static {
        rrzZ_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-2, -62, -36, 24, -124, 115, 39, 36}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA31F0241;
    }

    private static void id_class() {
        id_break = new boolean[]{true};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4A0C0F0665616598L;
    }

    @Override
    public void connect() throws IOException {
    }

    @Override
    public InputStream getInputStream() {
        return (InputStream)((Function)this.id_class[id_byte[1]]).apply(this.getURL()::openStream);
    }

    private static void id_break() {
        id_byte = new short[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrzZ_2.id_class();
        rrzZ_2.id_break();
    }
}

