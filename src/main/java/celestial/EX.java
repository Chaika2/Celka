/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.k_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EX
extends C_try {
    private static byte[] id_break;
    private static boolean[] id_throws;
    private static String[] id_case;

    public EX(C_case c_case) {
        String[] stringArray = new String[id_throws[0]];
        stringArray[EX.id_throws[1]] = id_case[0];
        super(c_case, stringArray);
    }

    static {
        EX.ntfClinit();
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_throws[2]);
        String string2 = this.getClass().getPackage().getImplementationVersion();
        if (string2 == null) {
            throw new k_1(id_case[1]);
        }
        Object[] objectArray = new Object[id_throws[3]];
        objectArray[EX.id_throws[4]] = string2;
        this.id_case(String.format(id_case[2], objectArray));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8044C409;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x837D78087E031FCEL;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{87, 23, -15, 72, 31, -118, -116, -84}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    private static void id_throws() {
        id_case = new String[]{new String("version"), new String("Null version (this is normal in a dev environment)"), new String("You are running Baritone v%s"), new String("View the Baritone version"), new String("The version command prints the version of Baritone you're currently running."), new String(""), new String("Usage:"), new String("> version - View version information, if present")};
    }

    private static /* synthetic */ void ntfClinit() {
        EX.id_protected();
        EX.id_throws();
        EX.id_finally();
    }

    private static void id_finally() {
        id_break = new byte[]{4, 2, 3};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_break[0]];
        stringArray[EX.id_throws[5]] = id_case[4];
        stringArray[EX.id_throws[6]] = id_case[5];
        stringArray[EX.id_break[1]] = id_case[6];
        stringArray[EX.id_break[2]] = id_case[7];
        return Arrays.asList(stringArray);
    }

    @Override
    public String id_implements() {
        return id_case[3];
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[3] = true;
        blArray[6] = true;
        id_throws = blArray;
    }
}

