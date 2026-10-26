/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzF_2;
import celestial.rrzL_2;
import celestial.rrzm_3;
import celestial.rrzv_3;
import java.io.IOException;
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

public class rrzu_3
extends ClassLoader {
    private static String[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;

    private static void id_byte() {
        id_byte = new byte[]{46, 47};
    }

    public rrzu_3() {
        super(rrzu_3.class.getClassLoader());
    }

    static {
        rrzu_3.ntfClinit();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Class<?> loadClass(String string, boolean bl) throws ClassNotFoundException {
        Object object = this.getClassLoadingLock(string);
        synchronized (object) {
            Class<?> clazz = this.findLoadedClass(string);
            if (clazz == null) {
                if (string.startsWith(id_class[0])) {
                    return this.getParent().loadClass(string);
                }
                URL uRL = this.getResource(string.replace((char)id_byte[0], (char)id_byte[1]) + ".class");
                if (uRL != null) {
                    if (!rrzu_3.id_class(uRL)) {
                        return this.getParent().loadClass(string);
                    }
                    try (InputStream inputStream = uRL.openStream();){
                        byte[] byArray = inputStream.readAllBytes();
                        clazz = this.defineClass(string, byArray, id_break[0], byArray.length);
                    }
                    catch (Throwable throwable) {
                        throw new RuntimeException(throwable);
                    }
                }
            }
            if (bl) {
                this.resolveClass(clazz);
            }
            return clazz;
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x122879D1;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-125, -69, -3, 82, 79, -86, -5, 114}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_class = new String[]{new String("java."), new String("file"), new String("jar"), new String("")};
    }

    private static boolean id_class(URL uRL) {
        return uRL.getProtocol().equals(id_class[1]) || uRL.getProtocol().equals(id_class[2]) ? id_break[1] : id_break[2];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9CFE428CE063C7B9L;
    }

    @Override
    public URL getResource(String string) {
        URL uRL = super.getResource(string);
        if (uRL == null) {
            return null;
        }
        Function<rrzv_3, InputStream> function = rrzL_2.id_break(string);
        if (function != null) {
            try {
                return new URL(uRL, id_class[3], new rrzF_2(uRL, function));
            }
            catch (MalformedURLException malformedURLException) {
                throw new RuntimeException(malformedURLException);
            }
        }
        return uRL;
    }

    @Override
    public Enumeration<URL> findResources(String string) throws IOException {
        Enumeration<URL> enumeration = super.findResources(string);
        return new rrzm_3(this, enumeration);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrzu_3.id_break();
        rrzu_3.id_class();
        rrzu_3.id_byte();
    }
}

