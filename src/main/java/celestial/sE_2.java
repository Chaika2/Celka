/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_import;
import celestial.SU;
import celestial.W;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sE_2
implements C_import {
    private static boolean[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;

    @Override
    public String id_byte() {
        return (String)this.id_class[id_protected[5]];
    }

    @Override
    public <T> T id_byte(Class<T> clazz) throws W {
        return ((SU)SU.staticFields60242b15623d3e12b4eaac026de79971[id_protected[6]]).id_class(clazz, this);
    }

    public sE_2(int n, String string, String string2) {
        this.id_protected();
        Integer n2 = n;
        this.id_class[sE_2.id_protected[0]] = n2;
        String string3 = string;
        this.id_class[sE_2.id_protected[1]] = string3;
        String string4 = string2;
        this.id_class[sE_2.id_protected[2]] = string4;
    }

    static {
        sE_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB3B3C76D;
    }

    @Override
    public <T, S> boolean id_class(Class<T> clazz, Class<S> clazz2, S s) {
        try {
            this.id_break(clazz, clazz2, s);
            return id_break[2];
        }
        catch (Throwable throwable) {
            return id_break[3];
        }
    }

    @Override
    public int id_class() {
        return (Integer)this.id_class[id_protected[3]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-15, -1, -7, 75, 95, 0, 27, -61}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC044D426D82D9D23L;
    }

    @Override
    public <T> boolean id_class(Class<T> clazz) {
        try {
            this.id_byte(clazz);
            return id_break[0];
        }
        catch (Throwable throwable) {
            return id_break[1];
        }
    }

    @Override
    public String id_break() {
        return (String)this.id_class[id_protected[4]];
    }

    @Override
    public <T, S> T id_break(Class<T> clazz, Class<S> clazz2, S s) throws W {
        return ((SU)SU.staticFields60242b15623d3e12b4eaac026de79971[id_protected[7]]).id_class(clazz, clazz2, this, s);
    }

    @Override
    public <E extends Enum<?>> E id_break(Class<E> clazz) throws W {
        return (E)Stream.of((Enum[])clazz.getEnumConstants()).filter(enum_ -> enum_.name().equalsIgnoreCase((String)this.id_class[id_protected[8]])).findFirst().orElseThrow(() -> new W((C_import)this, clazz.getSimpleName()));
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[2] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        sE_2.id_throws();
        sE_2.id_catch();
        sE_2.id_case();
    }

    private static void id_catch() {
        short[] sArray = new short[9];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[8] = 1;
        id_protected = sArray;
    }

    private static void id_case() {
        id_byte = new byte[]{3};
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[sE_2.id_break[4]] = id_break[5];
        }
    }
}

