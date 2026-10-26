/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FilenameUtils
 */
package celestial;

import celestial.MJ;
import celestial.MX;
import celestial.Mh_1;
import celestial.rR_2;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.io.FilenameUtils;

public abstract sealed class MO
extends Enum<MO>
implements rR_2
permits Mh_1, MX, MJ {
    private static short[] shorts192d7263893339b4ba984e84e651e982;
    public Object[] fields192d7263893339b4ba984e84e651e982;
    private static byte[] bytes192d7263893339b4ba984e84e651e982;
    public static Object[] staticFields192d7263893339b4ba984e84e651e982;
    private static boolean[] booleans192d7263893339b4ba984e84e651e982;
    private static String[] strings192d7263893339b4ba984e84e651e982;

    private static void id_byte() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        booleans192d7263893339b4ba984e84e651e982 = blArray;
    }

    public MO(String string2) {
        this.id_throws();
        String string3 = string2;
        this.fields192d7263893339b4ba984e84e651e982[MO.shorts192d7263893339b4ba984e84e651e982[1]] = string3;
    }

    static {
        MO.ntfClinit();
    }

    public static MO[] values() {
        return (MO[])((MO[])staticFields192d7263893339b4ba984e84e651e982[shorts192d7263893339b4ba984e84e651e982[0]]).clone();
    }

    public static MO valueOf(String string) {
        return Enum.valueOf(MO.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-121, 82, -22, -7, 122, 122, -52, -6}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2081D75471A7B9ADL;
    }

    @Override
    public boolean id_class(File file) {
        return ((String)this.fields192d7263893339b4ba984e84e651e982[shorts192d7263893339b4ba984e84e651e982[2]]).equalsIgnoreCase(FilenameUtils.getExtension((String)file.getAbsolutePath()));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1BF4770C;
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new Mh_1(strings192d7263893339b4ba984e84e651e982[1]), new MX(strings192d7263893339b4ba984e84e651e982[3]), new MJ(strings192d7263893339b4ba984e84e651e982[5]), new MO[]{(MO)objectArray[0], (MO)objectArray[1], (MO)objectArray[2]}};
        staticFields192d7263893339b4ba984e84e651e982 = objectArray;
    }

    private static /* synthetic */ MO[] id_break() {
        MO[] mOArray = new MO[bytes192d7263893339b4ba984e84e651e982[0]];
        mOArray[MO.booleans192d7263893339b4ba984e84e651e982[0]] = (MO)staticFields192d7263893339b4ba984e84e651e982[shorts192d7263893339b4ba984e84e651e982[3]];
        mOArray[MO.booleans192d7263893339b4ba984e84e651e982[1]] = (MO)staticFields192d7263893339b4ba984e84e651e982[shorts192d7263893339b4ba984e84e651e982[4]];
        mOArray[MO.bytes192d7263893339b4ba984e84e651e982[1]] = (MO)staticFields192d7263893339b4ba984e84e651e982[shorts192d7263893339b4ba984e84e651e982[5]];
        return mOArray;
    }

    private void id_throws() {
        if (this.fields192d7263893339b4ba984e84e651e982 == null) {
            Object[] objectArray = this.fields192d7263893339b4ba984e84e651e982 = new Object[booleans192d7263893339b4ba984e84e651e982[6]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        MO.id_byte();
        MO.id_catch();
        MO.id_case();
        MO.id_protected();
        MO.id_class();
    }

    private static void id_catch() {
        strings192d7263893339b4ba984e84e651e982 = new String[]{new String("MCEDIT"), new String("schematic"), new String("SPONGE"), new String("schem"), new String("LITEMATICA"), new String("litematic")};
    }

    private static void id_case() {
        short[] sArray = new short[6];
        sArray[0] = 3;
        sArray[4] = 1;
        sArray[5] = 2;
        shorts192d7263893339b4ba984e84e651e982 = sArray;
    }

    private static void id_protected() {
        bytes192d7263893339b4ba984e84e651e982 = new byte[]{3, 2, 2, 2, 3, 4};
    }
}

