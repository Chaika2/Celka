/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzZ_2;
import celestial.rrzv_3;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzF_2
extends URLStreamHandler {
    private static short[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    public rrzF_2(URL uRL, Function<rrzv_3, InputStream> function) {
        Function<rrzv_3, InputStream> function2;
        this.id_byte();
        URL uRL2 = uRL;
        this.id_class[rrzF_2.id_break[0]] = uRL2;
        this.id_class[rrzF_2.id_break[1]] = function2 = function;
    }

    static {
        rrzF_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDF6CF7C59924353AL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-81, 25, 92, -55, 20, 15, 59, 102}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_break = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x37B32A9F;
    }

    @Override
    public URLConnection openConnection(URL uRL) {
        return new rrzZ_2((URL)this.id_class[id_break[2]], (Function)this.id_class[id_break[3]]);
    }

    private static void id_break() {
        id_byte = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrzF_2.id_class();
        rrzF_2.id_break();
    }
}

