/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_abstract;
import celestial.C_float;
import celestial.C_import;
import celestial.C_long;
import celestial.C_void;
import celestial.L;
import celestial.Se_1;
import celestial.W;
import celestial.z_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SU
extends Enum<SU>
implements C_void {
    private static boolean[] booleans60242b15623d3e12b4eaac026de79971;
    public Object[] fields60242b15623d3e12b4eaac026de79971;
    private static short[] shorts60242b15623d3e12b4eaac026de79971;
    private static String[] strings60242b15623d3e12b4eaac026de79971;
    private static byte[] bytes60242b15623d3e12b4eaac026de79971;
    public static Object[] staticFields60242b15623d3e12b4eaac026de79971;

    private static void id_byte() {
        short[] sArray = new short[8];
        sArray[0] = 1;
        shorts60242b15623d3e12b4eaac026de79971 = sArray;
    }

    private SU() {
        L l;
        this.id_private();
        this.fields60242b15623d3e12b4eaac026de79971[SU.shorts60242b15623d3e12b4eaac026de79971[1]] = l = new L();
        ((List)Se_1.id_class[shorts60242b15623d3e12b4eaac026de79971[2]]).forEach(((L)this.fields60242b15623d3e12b4eaac026de79971[shorts60242b15623d3e12b4eaac026de79971[3]])::id_break);
    }

    static {
        SU.ntfClinit();
    }

    public static SU[] values() {
        return (SU[])((SU[])staticFields60242b15623d3e12b4eaac026de79971[shorts60242b15623d3e12b4eaac026de79971[0]]).clone();
    }

    public static SU valueOf(String string) {
        return Enum.valueOf(SU.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6FACC30C;
    }

    @Override
    public <T, S> C_long<T, S> id_class(Class<T> clazz, Class<S> clazz2) {
        return ((L)this.fields60242b15623d3e12b4eaac026de79971[shorts60242b15623d3e12b4eaac026de79971[5]]).id_byte().filter(C_long.class::isInstance).map(C_long.class::cast).filter(c_long -> c_long.id_class().isAssignableFrom(clazz)).filter(c_long -> c_long.id_break().isAssignableFrom(clazz2)).map(C_long.class::cast).findFirst().orElse(null);
    }

    @Override
    public <T> T id_class(Class<T> clazz, C_import c_import) throws W {
        C_float<T> c_float = this.id_class(clazz);
        if (c_float == null) {
            throw new z_1(clazz);
        }
        try {
            return c_float.id_class(c_import);
        }
        catch (Exception exception) {
            throw new W(c_import, clazz.getSimpleName());
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-56, -60, 38, 31, -13, -42, -4, 104}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public <T> C_float<T> id_class(Class<T> clazz) {
        return ((L)this.fields60242b15623d3e12b4eaac026de79971[shorts60242b15623d3e12b4eaac026de79971[4]]).id_byte().filter(C_float.class::isInstance).map(C_float.class::cast).filter(c_float -> c_float.id_class().isAssignableFrom(clazz)).findFirst().orElse(null);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC3ED5537D2A217F1L;
    }

    @Override
    public L<C_abstract> id_class() {
        return (L)this.fields60242b15623d3e12b4eaac026de79971[shorts60242b15623d3e12b4eaac026de79971[6]];
    }

    @Override
    public <T, S> T id_class(Class<T> clazz, Class<S> clazz2, C_import c_import, S s) throws W {
        C_long<T, S> c_long = this.id_class(clazz, clazz2);
        if (c_long == null) {
            throw new z_1(clazz);
        }
        try {
            return c_long.id_class(c_import, s);
        }
        catch (Exception exception) {
            throw new W(c_import, clazz.getSimpleName());
        }
    }

    private static /* synthetic */ SU[] id_break() {
        SU[] sUArray = new SU[booleans60242b15623d3e12b4eaac026de79971[0]];
        sUArray[SU.booleans60242b15623d3e12b4eaac026de79971[1]] = (SU)staticFields60242b15623d3e12b4eaac026de79971[shorts60242b15623d3e12b4eaac026de79971[7]];
        return sUArray;
    }

    private static void id_throws() {
        bytes60242b15623d3e12b4eaac026de79971 = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        SU.id_catch();
        SU.id_protected();
        SU.id_byte();
        SU.id_throws();
        SU.id_case();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans60242b15623d3e12b4eaac026de79971 = blArray;
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new SU(), new SU[]{(SU)objectArray[0]}};
        staticFields60242b15623d3e12b4eaac026de79971 = objectArray;
    }

    private static void id_protected() {
        strings60242b15623d3e12b4eaac026de79971 = new String[]{new String("INSTANCE")};
    }

    private void id_private() {
        if (this.fields60242b15623d3e12b4eaac026de79971 == null) {
            Object[] objectArray = this.fields60242b15623d3e12b4eaac026de79971 = new Object[booleans60242b15623d3e12b4eaac026de79971[5]];
        }
    }
}

