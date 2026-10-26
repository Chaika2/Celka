/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQB;
import celestial.rrzn_3;
import celestial.rrzu_3;
import celestial.rrzv_3;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.main.Main;
import sun.misc.Unsafe;

public class rrzL_2 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;
    private static short[] id_protected;
    private static String[] id_throws;

    private static void id_byte() {
        id_throws = new String[]{new String("META-INF/encrypted_resources"), new String("theUnsafe"), new String("installedProviders"), new String("jar"), new String("main")};
    }

    static {
        rrzL_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x44C8A07EB3116301L;
    }

    public static void id_class(String[] stringArray) throws NoSuchAlgorithmException, InvalidKeyException, IllegalAccessException, NoSuchFieldException, IOException, NoSuchPaddingException {
        rrzL_2.id_class[2] = new byte[]{94, -16, 105, 94, -20, 127, 80, 1, -94, 16, 11, 25, -48, 33, -15, -36, 66, -24, 100, 19, 33, -121, -97, 114, -92, 82, 56, 104, -91, -96, 38, 109};
        rrzu_3 rrzu_32 = new rrzu_3();
        Thread.currentThread().setContextClassLoader(rrzu_32);
        InputStream inputStream = Objects.requireNonNull(rrzu_32.getResourceAsStream(id_throws[0]));
        new String(inputStream.readAllBytes(), StandardCharsets.UTF_8).lines().forEach(string -> {
            if (!string.isEmpty()) {
                ((HashMap)id_class[id_protected[6]]).put(string, id_class[id_protected[7]]);
            }
        });
        inputStream.close();
        FileSystemProvider.installedProviders();
        Field field = Unsafe.class.getDeclaredField(id_throws[1]);
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe)field.get(null);
        Field field2 = FileSystemProvider.class.getDeclaredField(id_throws[2]);
        List list = (List)unsafe.getObjectVolatile(FileSystemProvider.class, unsafe.staticFieldOffset(field2));
        ArrayList<rrQB> arrayList = new ArrayList<rrQB>(list);
        List list2 = list.stream().map(FileSystemProvider::getScheme).collect(Collectors.toList());
        arrayList.set(list2.indexOf(id_throws[3]), new rrQB());
        List list3 = Collections.unmodifiableList(arrayList);
        unsafe.putObjectVolatile(FileSystemProvider.class, unsafe.staticFieldOffset(field2), list3);
        Class<?> clazz = rrzu_32.loadClass(Main.class.getName());
        Method method = clazz.getMethod(id_throws[4], String[].class);
        method.invoke(null, new Object[]{stringArray});
    }

    public static byte[] id_class(InputStream inputStream) throws IOException {
        try (rrzn_3 rrzn_32 = new rrzn_3(inputStream, (byte[])id_class[id_protected[5]]);){
            byte[] byArray = rrzn_32.readAllBytes();
            return byArray;
        }
    }

    public static InputStream id_class(Path path, OpenOption[] openOptionArray) throws IOException {
        String string = path.toString();
        if (Files.isRegularFile(path, new LinkOption[id_byte[7]])) {
            return rrzL_2.id_class(string, () -> rrQB.id_class(path).id_break(openOptionArray));
        }
        return null;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{67, -108, 59, 52, -1, 9, -4, 19}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA6D87648;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[10];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[9] = true;
        id_byte = blArray;
    }

    private static InputStream id_class(String string, rrzv_3 rrzv_32) throws IOException {
        Object object = ((HashMap)id_class[id_protected[0]]).get(string);
        if (object != null) {
            if (object == id_class[id_protected[1]]) {
                InputStream inputStream = rrzv_32.getInputStream();
                object = rrzL_2.id_class(inputStream);
                ((HashMap)id_class[id_protected[2]]).put(string, object);
            }
            return new ByteArrayInputStream((byte[])object);
        }
        return null;
    }

    private static void id_break() {
        short[] sArray = new short[8];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[6] = 1;
        id_protected = sArray;
    }

    public static Function<rrzv_3, InputStream> id_break(String string) {
        Object v = ((HashMap)id_class[id_protected[3]]).get(string);
        if (v != null) {
            if (v == id_class[id_protected[4]]) {
                return rrzv_32 -> {
                    try {
                        return rrzL_2.id_class(string, rrzv_32);
                    }
                    catch (IOException iOException) {
                        throw new RuntimeException(iOException);
                    }
                };
            }
            return rrzv_32 -> new ByteArrayInputStream((byte[])v);
        }
        return null;
    }

    private static void id_throws() {
        id_break = new byte[]{32, 94, -16, 2, 105, 3, 94, 4, -20, 5, 127, 6, 80, 7, 1, 8, -94, 9, 16, 10, 11, 11, 25, 12, -48, 13, 33, 14, -15, 15, -36, 16, 66, 17, -24, 18, 100, 19, 19, 20, 33, 21, -121, 22, -97, 23, 114, 24, -92, 25, 82, 26, 56, 27, 104, 28, -91, 29, -96, 30, 38, 31, 109, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrzL_2.id_class();
        rrzL_2.id_byte();
        rrzL_2.id_break();
        rrzL_2.id_throws();
        rrzL_2.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[3];
        objectArray[0] = new Object();
        objectArray[1] = new HashMap();
        id_class = objectArray;
    }
}

