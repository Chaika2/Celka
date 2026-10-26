/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.E;
import celestial.W;
import celestial.k_1;
import celestial.x_1;
import com.google.gson.JsonSyntaxException;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.NoSuchFileException;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sL_2
extends C_try {
    private static String[] id_break;
    private static boolean[] id_throws;
    private static byte[] id_case;
    private static short[] id_catch;

    public sL_2(C_case c_case) {
        String[] stringArray = new String[id_throws[0]];
        stringArray[sL_2.id_throws[1]] = id_break[0];
        super(c_case, stringArray);
    }

    static {
        sL_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE82F25436A42DF87L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4A5E470F;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_case[0]);
        File file = (File)c_static.id_break((E)E.staticFieldsa68f70fa3b203574ab28df4fae9f18d2[id_catch[0]], ((File)sL_2.b_.id_class[id_catch[1]]).getAbsoluteFile().getParentFile());
        boolean bl = id_throws[2];
        if (c_static.id_final()) {
            if (c_static.id_extends().equalsIgnoreCase(id_break[1])) {
                bl = id_throws[3];
            } else {
                throw new W(c_static.id_private(), id_break[2]);
            }
        }
        try {
            ((C_case)this.id_class[id_catch[2]]).id_class().id_class(file.toPath().toAbsolutePath(), bl);
        }
        catch (NoSuchFileException noSuchFileException) {
            throw new k_1(id_break[3]);
        }
        catch (JsonSyntaxException jsonSyntaxException) {
            throw new k_1(id_break[4]);
        }
        catch (Exception exception) {
            throw new IllegalStateException(exception);
        }
        Object[] objectArray = new Object[id_throws[4]];
        objectArray[sL_2.id_throws[5]] = Boolean.toString(bl);
        this.id_case(String.format(id_break[5], objectArray));
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        if (c_static.id_case()) {
            return E.id_class(c_static, E.id_class());
        }
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-29, 60, -117, -63, -75, 27, 64, -27}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_break = new String[]{new String("explorefilter"), new String("invert"), new String("either \"invert\" or nothing"), new String("File not found"), new String("Invalid JSON syntax"), new String("Explore filter applied. Inverted: %s"), new String("Explore chunks from a json"), new String("Apply an explore filter before using explore, which tells the explore process which chunks have been explored/not explored."), new String(""), new String("The JSON file will follow this format: [{\"x\":0,\"z\":0},...]"), new String(""), new String("If 'invert' is specified, the chunks listed will be considered NOT explored, rather than explored."), new String(""), new String("Usage:"), new String("> explorefilter <path> [invert] - Load the JSON file referenced by the specified path. If invert is specified, it must be the literal word 'invert'.")};
    }

    private static /* synthetic */ void ntfClinit() {
        sL_2.id_protected();
        sL_2.id_throws();
        sL_2.id_finally();
        sL_2.id_extends();
    }

    private static void id_finally() {
        short[] sArray = new short[3];
        sArray[1] = 24;
        id_catch = sArray;
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_case[1]];
        stringArray[sL_2.id_throws[6]] = id_break[7];
        stringArray[sL_2.id_throws[7]] = id_break[8];
        stringArray[sL_2.id_case[2]] = id_break[9];
        stringArray[sL_2.id_case[3]] = id_break[10];
        stringArray[sL_2.id_case[4]] = id_break[11];
        stringArray[sL_2.id_case[5]] = id_break[12];
        stringArray[sL_2.id_case[6]] = id_break[13];
        stringArray[sL_2.id_case[7]] = id_break[14];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_case = new byte[]{2, 8, 2, 3, 4, 5, 6, 7};
    }

    @Override
    public String id_implements() {
        return id_break[6];
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[7] = true;
        id_throws = blArray;
    }
}

