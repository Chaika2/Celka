/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzF_2;
import celestial.rrzL_2;
import celestial.rrzu_3;
import celestial.rrzv_3;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Enumeration;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzm_3
implements Enumeration<URL> {
    private static String[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;

    private static void id_byte() {
        id_break = new String[]{new String("")};
    }

    public rrzm_3(rrzu_3 rrzu_32, Enumeration enumeration) {
        this.id_break();
        Enumeration enumeration2 = enumeration;
        this.id_class[rrzm_3.id_protected[0]] = enumeration2;
    }

    static {
        rrzm_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x681E11D42D69FE29L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x28B759BA;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-126, 78, -5, -19, 71, 10, 46, -33}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public URL id_class() {
        URL uRL = (URL)((Enumeration)this.id_class[id_protected[2]]).nextElement();
        Function<rrzv_3, InputStream> function = rrzL_2.id_break(uRL.getPath());
        if (function != null) {
            try {
                return new URL(uRL, id_break[0], new rrzF_2(uRL, function));
            }
            catch (MalformedURLException malformedURLException) {
                throw new RuntimeException(malformedURLException);
            }
        }
        return uRL;
    }

    @Override
    public boolean hasMoreElements() {
        return ((Enumeration)this.id_class[id_protected[1]]).hasMoreElements();
    }

    @Override
    public /* synthetic */ Object nextElement() {
        return this.id_class();
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static void id_throws() {
        id_byte = new boolean[]{true};
    }

    private static /* synthetic */ void ntfClinit() {
        rrzm_3.id_throws();
        rrzm_3.id_byte();
        rrzm_3.id_protected();
    }

    private static void id_protected() {
        id_protected = new short[3];
    }
}

