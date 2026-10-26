/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_for;
import celestial.C_static;
import celestial.C_switch;
import celestial.rU_2;
import celestial.rX_2;
import celestial.rfU_2;
import celestial.s_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class M
extends Enum<M>
implements C_switch<rX_2, rU_2> {
    private static byte[] bytes458f40b2da6139cb91242091b209a91e;
    private static String[] strings458f40b2da6139cb91242091b209a91e;
    private static boolean[] booleans458f40b2da6139cb91242091b209a91e;
    private static short[] shorts458f40b2da6139cb91242091b209a91e;
    public static Object[] staticFields458f40b2da6139cb91242091b209a91e;

    private static void id_byte() {
        short[] sArray = new short[8];
        sArray[0] = 1;
        sArray[5] = 2;
        shorts458f40b2da6139cb91242091b209a91e = sArray;
    }

    static {
        M.ntfClinit();
    }

    public static M[] values() {
        return (M[])((M[])staticFields458f40b2da6139cb91242091b209a91e[shorts458f40b2da6139cb91242091b209a91e[0]]).clone();
    }

    public static M valueOf(String string) {
        return Enum.valueOf(M.class, string);
    }

    @Override
    public Stream<String> id_class(C_for c_for) {
        C_static c_static = c_for.id_class();
        if (c_static.id_catch(bytes458f40b2da6139cb91242091b209a91e[0])) {
            return c_static.id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts458f40b2da6139cb91242091b209a91e[6]]);
        }
        return Stream.empty();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD8FEC55BD0A7DB14L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA41DC311;
    }

    @Override
    public rX_2 id_class(C_for c_for, rU_2 rU_22) throws x_1 {
        if (rU_22 == null) {
            rU_22 = (rU_2)rU_2.id_class[shorts458f40b2da6139cb91242091b209a91e[1]];
        }
        C_static c_static = c_for.id_class();
        return new rX_2(rfU_2.id_byte((Double)c_static.id_break((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts458f40b2da6139cb91242091b209a91e[2]], Double.valueOf(((Integer)rU_22.id_break[shorts458f40b2da6139cb91242091b209a91e[3]]).intValue()))), rfU_2.id_byte((Double)c_static.id_break((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts458f40b2da6139cb91242091b209a91e[4]], Double.valueOf(((Integer)rU_22.id_break[shorts458f40b2da6139cb91242091b209a91e[5]]).intValue()))));
    }

    private static void id_class() {
        strings458f40b2da6139cb91242091b209a91e = new String[]{new String("INSTANCE")};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-99, 61, -74, 95, 43, 66, -61, 42}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleans458f40b2da6139cb91242091b209a91e = blArray;
    }

    private static /* synthetic */ M[] id_throws() {
        M[] mArray = new M[booleans458f40b2da6139cb91242091b209a91e[0]];
        mArray[M.booleans458f40b2da6139cb91242091b209a91e[1]] = (M)staticFields458f40b2da6139cb91242091b209a91e[shorts458f40b2da6139cb91242091b209a91e[7]];
        return mArray;
    }

    private static /* synthetic */ void ntfClinit() {
        M.id_break();
        M.id_class();
        M.id_byte();
        M.id_case();
        M.id_protected();
    }

    private static void id_case() {
        bytes458f40b2da6139cb91242091b209a91e = new byte[]{2, 2};
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new M(), new M[]{(M)objectArray[0]}};
        staticFields458f40b2da6139cb91242091b209a91e = objectArray;
    }
}

