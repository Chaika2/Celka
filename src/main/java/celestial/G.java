/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_for;
import celestial.C_static;
import celestial.C_switch;
import celestial.M;
import celestial.O;
import celestial.b_1;
import celestial.rJ_2;
import celestial.rP_2;
import celestial.rS_2;
import celestial.rU_2;
import celestial.rX_2;
import celestial.s_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class G
extends Enum<G>
implements C_switch<rP_2, rU_2> {
    private static short[] shortscbb17f97fc8b35a5b5d18fc81c3fa5eb;
    private static boolean[] booleanscbb17f97fc8b35a5b5d18fc81c3fa5eb;
    private static byte[] bytescbb17f97fc8b35a5b5d18fc81c3fa5eb;
    private static String[] stringscbb17f97fc8b35a5b5d18fc81c3fa5eb;
    public static Object[] staticFieldscbb17f97fc8b35a5b5d18fc81c3fa5eb;

    private static void id_byte() {
        stringscbb17f97fc8b35a5b5d18fc81c3fa5eb = new String[]{new String("INSTANCE")};
    }

    static {
        G.ntfClinit();
    }

    public static G[] values() {
        return (G[])((G[])staticFieldscbb17f97fc8b35a5b5d18fc81c3fa5eb[shortscbb17f97fc8b35a5b5d18fc81c3fa5eb[0]]).clone();
    }

    public static G valueOf(String string) {
        return Enum.valueOf(G.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x12E8DBA0D487A37FL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{76, 50, 121, 72, 4, 40, -85, -19}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public rP_2 id_class(C_for c_for, rU_2 rU_22) throws x_1 {
        C_static c_static;
        rS_2 rS_22;
        if (rU_22 == null) {
            rU_22 = (rU_2)rU_2.id_class[shortscbb17f97fc8b35a5b5d18fc81c3fa5eb[1]];
        }
        if ((rS_22 = (rS_2)(c_static = c_for.id_class()).id_byte((b_1)b_1.staticFieldsdf0e2a18debd3d38bfaf4a483a1d8c36[shortscbb17f97fc8b35a5b5d18fc81c3fa5eb[2]], rU_22)) != null) {
            return rS_22;
        }
        rX_2 rX_22 = (rX_2)c_static.id_byte((M)M.staticFields458f40b2da6139cb91242091b209a91e[shortscbb17f97fc8b35a5b5d18fc81c3fa5eb[3]], rU_22);
        if (rX_22 != null) {
            return rX_22;
        }
        rJ_2 rJ_22 = (rJ_2)c_static.id_byte((O)O.staticFieldse82c5f6cc67b3e92817497b25f379c73[shortscbb17f97fc8b35a5b5d18fc81c3fa5eb[4]], rU_22);
        if (rJ_22 != null) {
            return rJ_22;
        }
        return new rS_2(rU_22);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFE1B0100;
    }

    private static void id_class() {
        short[] sArray = new short[7];
        sArray[0] = 1;
        shortscbb17f97fc8b35a5b5d18fc81c3fa5eb = sArray;
    }

    @Override
    public Stream<String> id_class(C_for c_for) {
        return c_for.id_class().id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shortscbb17f97fc8b35a5b5d18fc81c3fa5eb[5]]);
    }

    private static /* synthetic */ G[] id_break() {
        G[] gArray = new G[booleanscbb17f97fc8b35a5b5d18fc81c3fa5eb[0]];
        gArray[G.booleanscbb17f97fc8b35a5b5d18fc81c3fa5eb[1]] = (G)staticFieldscbb17f97fc8b35a5b5d18fc81c3fa5eb[shortscbb17f97fc8b35a5b5d18fc81c3fa5eb[6]];
        return gArray;
    }

    private static void id_throws() {
        bytescbb17f97fc8b35a5b5d18fc81c3fa5eb = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        G.id_case();
        G.id_byte();
        G.id_class();
        G.id_throws();
        G.id_protected();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleanscbb17f97fc8b35a5b5d18fc81c3fa5eb = blArray;
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new G(), new G[]{(G)objectArray[0]}};
        staticFieldscbb17f97fc8b35a5b5d18fc81c3fa5eb = objectArray;
    }
}

