/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.M;
import celestial.Ps_1;
import celestial.rX_2;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sF_2
extends C_try {
    private static short[] id_break;
    private static String[] id_throws;
    private static boolean[] id_case;
    private static byte[] id_catch;

    public sF_2(C_case c_case) {
        String[] stringArray = new String[id_case[0]];
        stringArray[sF_2.id_case[1]] = id_throws[0];
        super(c_case, stringArray);
    }

    static {
        sF_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7A080AF78D7338EDL;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        if (c_static.id_final()) {
            c_static.id_protected(id_catch[0]);
        } else {
            c_static.id_class(id_case[2]);
        }
        rX_2 rX_22 = c_static.id_final() ? (rX_2)c_static.id_break((M)M.staticFields458f40b2da6139cb91242091b209a91e[id_break[0]], ((Ps_1)this.id_class[id_break[1]]).id_volatile()) : new rX_2(((Ps_1)this.id_class[id_break[2]]).id_volatile());
        ((C_case)this.id_class[id_break[3]]).id_class().id_class(rX_22.id_byte(), rX_22.id_break());
        Object[] objectArray = new Object[id_case[3]];
        objectArray[sF_2.id_case[4]] = rX_22.toString();
        this.id_case(String.format(id_throws[1], objectArray));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1F96D83D;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-2, -105, -18, -54, 64, -18, -117, -119}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        if (c_static.id_catch(id_catch[1])) {
            return c_static.id_class((M)M.staticFields458f40b2da6139cb91242091b209a91e[id_break[4]]);
        }
        return Stream.empty();
    }

    private static void id_throws() {
        short[] sArray = new short[5];
        sArray[1] = 1;
        sArray[2] = 1;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        sF_2.id_extends();
        sF_2.id_finally();
        sF_2.id_throws();
        sF_2.id_protected();
    }

    private static void id_finally() {
        id_throws = new String[]{new String("explore"), new String("Exploring from %s"), new String("Explore things"), new String("Tell Baritone to explore randomly. If you used explorefilter before this, it will be applied."), new String(""), new String("Usage:"), new String("> explore - Explore from your current position."), new String("> explore <x> <z> - Explore from the specified X and Z position.")};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_catch[2]];
        stringArray[sF_2.id_case[5]] = id_throws[3];
        stringArray[sF_2.id_case[6]] = id_throws[4];
        stringArray[sF_2.id_catch[3]] = id_throws[5];
        stringArray[sF_2.id_catch[4]] = id_throws[6];
        stringArray[sF_2.id_catch[5]] = id_throws[7];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[3] = true;
        blArray[6] = true;
        id_case = blArray;
    }

    @Override
    public String id_implements() {
        return id_throws[2];
    }

    private static void id_protected() {
        id_catch = new byte[]{2, 2, 5, 2, 3, 4};
    }
}

