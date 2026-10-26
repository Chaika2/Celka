/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_extends;
import celestial.C_private;
import celestial.C_throws;
import celestial.PN;
import celestial.PW;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pd_1 {
    private static short[] id_break;
    private static byte[] id_byte;
    public static Object[] id_class;
    private static boolean[] id_protected;
    private static String[] id_throws;

    public static String id_byte(C_extends c_extends) throws IllegalStateException {
        if (Pd_1.id_throws(c_extends)) {
            return c_extends.id_protected();
        }
        return c_extends.id_protected() + " " + Pd_1.id_break(c_extends);
    }

    public static void id_byte(C_private c_private) {
        try {
            Pd_1.id_class((Path)id_class[id_break[0]], (String string) -> {
                Matcher matcher = ((Pattern)id_class[id_break[12]]).matcher((CharSequence)string);
                if (!matcher.matches()) {
                    System.out.println("Invalid syntax in setting file: " + string);
                    return;
                }
                String string2 = matcher.group(id_throws[9]).toLowerCase();
                String string3 = matcher.group(id_throws[10]);
                try {
                    Pd_1.id_class(c_private, string2, string3);
                }
                catch (Exception exception) {
                    System.out.println("Unable to parse line " + string);
                    exception.printStackTrace();
                }
            });
        }
        catch (NoSuchFileException noSuchFileException) {
            System.out.println(id_throws[2]);
        }
        catch (Exception exception) {
            System.out.println(id_throws[3]);
            exception.printStackTrace();
        }
    }

    private static void id_byte() {
        short[] sArray = new short[13];
        sArray[2] = 1;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[9] = 2;
        sArray[12] = 1;
        id_break = sArray;
    }

    static {
        Pd_1.ntfClinit();
    }

    public static <T> String id_class(C_extends<T> c_extends, T t) throws IllegalArgumentException {
        PW pW = PW.id_break(c_extends.id_throws());
        if (pW == null) {
            throw new IllegalStateException("Missing " + c_extends.id_byte() + " " + c_extends.id_protected());
        }
        return pW.id_class(new PN(c_extends), (Object)t);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4CE05574F954431FL;
    }

    public static String id_class(int n) {
        if (((Boolean)C_throws.id_break().A.id_class[id_break[8]]).booleanValue()) {
            return id_throws[7];
        }
        return Integer.toString(n);
    }

    private static void id_class(Path path, Consumer<String> consumer) throws IOException {
        try (BufferedReader bufferedReader = Files.newBufferedReader(path);){
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                if (string.isEmpty() || Pd_1.id_break(string)) continue;
                consumer.accept(string);
            }
        }
    }

    private static void id_class() {
        id_byte = new byte[]{24, 3, 2, 2, 3};
    }

    public static List<C_extends> id_class(C_private c_private) {
        ArrayList<C_extends> arrayList = new ArrayList<C_extends>();
        for (C_extends c_extends : (List)c_private.Pj[id_break[2]]) {
            if (c_extends.id_class[id_break[3]] == null) {
                System.out.println("NULL SETTING?" + c_extends.id_protected());
                continue;
            }
            if (Pd_1.id_throws(c_extends) || c_extends.id_class[id_break[4]] == c_extends.id_class[id_break[5]]) continue;
            arrayList.add(c_extends);
        }
        return arrayList;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{70, -117, -5, 45, -56, 79, 13, -113}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static void id_class(C_private c_private, String string, String string2) throws NumberFormatException, IllegalStateException {
        PW pW;
        Object t;
        C_extends c_extends = (C_extends)((Map)c_private.Pj[id_break[10]]).get(string);
        if (c_extends == null) {
            throw new IllegalStateException(id_throws[8]);
        }
        Class clazz = c_extends.id_byte();
        if (!clazz.isInstance(t = (pW = PW.id_break(c_extends.id_throws())).id_class(new PN(c_extends), string2))) {
            throw new IllegalStateException(pW + " parser returned incorrect type, expected " + clazz + " got " + t + " which is " + t.getClass());
        }
        Object t2 = t;
        c_extends.id_class[Pd_1.id_break[11]] = t2;
    }

    public static String id_class(C_extends c_extends) throws IllegalArgumentException {
        return Pd_1.id_class(c_extends, c_extends.id_class[id_break[7]]);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6F3BDDC3;
    }

    public static synchronized void id_break(C_private c_private) {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter((Path)id_class[id_break[1]], new OpenOption[id_protected[2]]);){
            for (C_extends c_extends : Pd_1.id_class(c_private)) {
                bufferedWriter.write(Pd_1.id_byte(c_extends) + "\n");
            }
        }
        catch (Exception exception) {
            System.out.println(id_throws[4]);
            exception.printStackTrace();
        }
    }

    private static boolean id_break(String string) {
        return string.startsWith(id_throws[0]) || string.startsWith(id_throws[1]) ? id_protected[0] : id_protected[1];
    }

    public static String id_break(C_extends c_extends) throws IllegalArgumentException {
        return Pd_1.id_class(c_extends, c_extends.id_class[id_break[6]]);
    }

    private static void id_break() {
        Object[] objectArray = new Object[3];
        objectArray[0] = Paths.get("C:\\Celestial\\Beta 1.16.5\\baritone\\settings.txt", new String[0]);
        objectArray[1] = Pattern.compile(id_throws[13]);
        String[] stringArray = new String[]{id_throws[14], id_throws[15], id_throws[16]};
        objectArray[2] = stringArray;
        id_class = objectArray;
    }

    public static boolean id_throws(C_extends c_extends) {
        String[] stringArray = (String[])id_class[id_break[9]];
        int n = stringArray.length;
        for (int i = id_protected[3]; i < n; ++i) {
            String string = stringArray[i];
            if (!c_extends.id_protected().equalsIgnoreCase(string)) continue;
            return id_protected[4];
        }
        return id_protected[5];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[10];
        blArray[0] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[9] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Pd_1.id_throws();
        Pd_1.id_protected();
        Pd_1.id_byte();
        Pd_1.id_class();
        Pd_1.id_break();
    }

    private static void id_protected() {
        id_throws = new String[]{new String("#"), new String("//"), new String("Baritone settings file not found, resetting."), new String("Exception while reading Baritone settings, some settings may be reset to default values!"), new String("Exception thrown while saving Baritone settings!"), new String("(?:\\w+\\.)+(\\w+)"), new String("$1"), new String("<censored>"), new String("No setting by that name"), new String("setting"), new String("value"), new String("baritone"), new String("settings.txt"), new String("^(?<setting>[^ ]+) +(?<value>.+)"), new String("logger"), new String("notifier"), new String("toaster")};
    }

    public static String id_protected(C_extends c_extends) {
        return c_extends.id_throws().getTypeName().replaceAll(id_throws[5], id_throws[6]);
    }
}

