/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_for;
import celestial.C_static;
import celestial.C_switch;
import celestial.PP;
import celestial.x_1;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.security.Key;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class E
extends Enum<E>
implements C_switch<File, File> {
    public static Object[] staticFieldsa68f70fa3b203574ab28df4fae9f18d2;
    private static boolean[] booleansa68f70fa3b203574ab28df4fae9f18d2;
    private static String[] stringsa68f70fa3b203574ab28df4fae9f18d2;
    private static byte[] bytesa68f70fa3b203574ab28df4fae9f18d2;
    private static short[] shortsa68f70fa3b203574ab28df4fae9f18d2;

    private static void id_byte() {
        stringsa68f70fa3b203574ab28df4fae9f18d2 = new String[]{new String("./"), new String("invalid path"), new String("."), new String(" "), new String(""), new String("INSTANCE")};
    }

    static {
        E.ntfClinit();
    }

    public static E[] values() {
        return (E[])((E[])staticFieldsa68f70fa3b203574ab28df4fae9f18d2[shortsa68f70fa3b203574ab28df4fae9f18d2[0]]).clone();
    }

    public static E valueOf(String string) {
        return Enum.valueOf(E.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9FE25B11DE4C9204L;
    }

    @Override
    public File id_class(C_for c_for, File file) throws x_1 {
        Path path;
        if (file == null) {
            file = new File(stringsa68f70fa3b203574ab28df4fae9f18d2[0]);
        }
        try {
            path = FileSystems.getDefault().getPath(c_for.id_class().id_extends(), new String[booleansa68f70fa3b203574ab28df4fae9f18d2[0]]);
        }
        catch (InvalidPathException invalidPathException) {
            throw new IllegalArgumentException(stringsa68f70fa3b203574ab28df4fae9f18d2[1]);
        }
        return E.id_class(file.toPath().resolve(path).toFile());
    }

    public static File id_class() {
        File file = ((File)PP.b_.id_class[shortsa68f70fa3b203574ab28df4fae9f18d2[1]]).getAbsoluteFile();
        if (file.getName().equals(stringsa68f70fa3b203574ab28df4fae9f18d2[2])) {
            return file.getParentFile();
        }
        return file;
    }

    @Override
    public Stream<String> id_class(C_for c_for) {
        return Stream.empty();
    }

    public static Stream<String> id_class(C_static c_static, File file2) throws x_1 {
        File file3 = E.id_class(file2);
        String string3 = c_static.id_extends();
        Path path = FileSystems.getDefault().getPath(string3, new String[booleansa68f70fa3b203574ab28df4fae9f18d2[1]]);
        Path path2 = path.isAbsolute() ? path.getRoot() : file3.toPath();
        boolean bl = !string3.isEmpty() && !string3.endsWith(File.separator) ? booleansa68f70fa3b203574ab28df4fae9f18d2[2] : booleansa68f70fa3b203574ab28df4fae9f18d2[3];
        File file4 = path.isAbsolute() ? path.toFile() : new File(file3, string3);
        return Stream.of(Objects.requireNonNull(E.id_class(bl ? file4.getParentFile() : file4).listFiles())).map(file -> (Serializable)(path.isAbsolute() ? file : path2.relativize(file.toPath()).toString()) + (file.isDirectory() ? File.separator : stringsa68f70fa3b203574ab28df4fae9f18d2[4])).filter(string2 -> string2.toLowerCase(Locale.US).startsWith(string3.toLowerCase(Locale.US))).filter(string -> !string.contains(stringsa68f70fa3b203574ab28df4fae9f18d2[3]) ? booleansa68f70fa3b203574ab28df4fae9f18d2[4] : booleansa68f70fa3b203574ab28df4fae9f18d2[5]);
    }

    private static File id_class(File file) {
        try {
            return file.getCanonicalFile();
        }
        catch (IOException iOException) {
            throw new UncheckedIOException(iOException);
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-16, 92, -68, -85, -29, -82, 6, -46}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x111C9F1D;
    }

    private static void id_break() {
        bytesa68f70fa3b203574ab28df4fae9f18d2 = new byte[]{2};
    }

    private static void id_throws() {
        short[] sArray = new short[3];
        sArray[0] = 1;
        sArray[1] = 24;
        shortsa68f70fa3b203574ab28df4fae9f18d2 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        E.id_protected();
        E.id_byte();
        E.id_throws();
        E.id_break();
        E.id_case();
    }

    private static /* synthetic */ E[] id_catch() {
        E[] eArray = new E[booleansa68f70fa3b203574ab28df4fae9f18d2[6]];
        eArray[E.booleansa68f70fa3b203574ab28df4fae9f18d2[7]] = (E)staticFieldsa68f70fa3b203574ab28df4fae9f18d2[shortsa68f70fa3b203574ab28df4fae9f18d2[2]];
        return eArray;
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new E(), new E[]{(E)objectArray[0]}};
        staticFieldsa68f70fa3b203574ab28df4fae9f18d2 = objectArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[11];
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[10] = true;
        booleansa68f70fa3b203574ab28df4fae9f18d2 = blArray;
    }
}

