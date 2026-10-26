/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.L;
import celestial.MO;
import celestial.rR_2;
import celestial.rt_3;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MG
extends Enum<MG>
implements rt_3 {
    public static Object[] staticFields4592673f607b3ff2b69d116fa51286d2;
    private static String[] strings4592673f607b3ff2b69d116fa51286d2;
    private static boolean[] booleans4592673f607b3ff2b69d116fa51286d2;
    private static short[] shorts4592673f607b3ff2b69d116fa51286d2;
    public Object[] fields4592673f607b3ff2b69d116fa51286d2;
    private static byte[] bytes4592673f607b3ff2b69d116fa51286d2;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans4592673f607b3ff2b69d116fa51286d2 = blArray;
    }

    private MG() {
        L l;
        this.id_throws();
        this.fields4592673f607b3ff2b69d116fa51286d2[MG.shorts4592673f607b3ff2b69d116fa51286d2[1]] = l = new L();
        Arrays.stream(MO.values()).forEach(((L)this.fields4592673f607b3ff2b69d116fa51286d2[shorts4592673f607b3ff2b69d116fa51286d2[2]])::id_break);
    }

    static {
        MG.ntfClinit();
    }

    public static MG[] values() {
        return (MG[])((MG[])staticFields4592673f607b3ff2b69d116fa51286d2[shorts4592673f607b3ff2b69d116fa51286d2[0]]).clone();
    }

    public static MG valueOf(String string) {
        return Enum.valueOf(MG.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x683781A1;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEA11A52A62F71C07L;
    }

    @Override
    public L<rR_2> id_class() {
        return (L)this.fields4592673f607b3ff2b69d116fa51286d2[shorts4592673f607b3ff2b69d116fa51286d2[3]];
    }

    @Override
    public Optional<rR_2> id_class(File file) {
        return ((L)this.fields4592673f607b3ff2b69d116fa51286d2[shorts4592673f607b3ff2b69d116fa51286d2[4]]).id_protected().filter(rR_22 -> rR_22.id_class(file)).findFirst();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-27, 28, 124, -57, 126, -112, -10, -48}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        bytes4592673f607b3ff2b69d116fa51286d2 = new byte[]{2};
    }

    private void id_throws() {
        if (this.fields4592673f607b3ff2b69d116fa51286d2 == null) {
            Object[] objectArray = this.fields4592673f607b3ff2b69d116fa51286d2 = new Object[booleans4592673f607b3ff2b69d116fa51286d2[5]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        MG.id_byte();
        MG.id_case();
        MG.id_catch();
        MG.id_break();
        MG.id_private();
    }

    private static void id_catch() {
        short[] sArray = new short[6];
        sArray[0] = 1;
        shorts4592673f607b3ff2b69d116fa51286d2 = sArray;
    }

    private static void id_case() {
        strings4592673f607b3ff2b69d116fa51286d2 = new String[]{new String("INSTANCE")};
    }

    private static /* synthetic */ MG[] id_protected() {
        MG[] mGArray = new MG[booleans4592673f607b3ff2b69d116fa51286d2[0]];
        mGArray[MG.booleans4592673f607b3ff2b69d116fa51286d2[1]] = (MG)staticFields4592673f607b3ff2b69d116fa51286d2[shorts4592673f607b3ff2b69d116fa51286d2[5]];
        return mGArray;
    }

    private static void id_private() {
        Object[] objectArray;
        objectArray = new Object[]{new MG(), new MG[]{(MG)objectArray[0]}};
        staticFields4592673f607b3ff2b69d116fa51286d2 = objectArray;
    }
}

