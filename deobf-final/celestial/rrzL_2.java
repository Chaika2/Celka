package celestial;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.security.InvalidKeyException;
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
   private static byte[] break_;
   private static boolean[] byte_;
   public static Object[] class_;
   private static short[] protected_;
   private static String[] throws_;

   private static void byte_() {
      throws_ = new String[]{
         new String("META-INF/encrypted_resources"), new String("theUnsafe"), new String("installedProviders"), new String("jar"), new String("main")
      };
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4956387855951815425L;
   }

   public static void class_(String[] var0) throws NoSuchAlgorithmException, InvalidKeyException, IllegalAccessException, NoSuchFieldException, IOException, NoSuchPaddingException {
      class_[2] = new byte[]{
         94, -16, 105, 94, -20, 127, 80, 1, -94, 16, 11, 25, -48, 33, -15, -36, 66, -24, 100, 19, 33, -121, -97, 114, -92, 82, 56, 104, -91, -96, 38, 109
      };
      rrzu_3 var1 = new rrzu_3();
      Thread.currentThread().setContextClassLoader(var1);
      InputStream var2 = Objects.requireNonNull(var1.getResourceAsStream("META-INF/encrypted_resources"));
      new String(var2.readAllBytes(), StandardCharsets.UTF_8).lines().forEach(var0x -> {
         if (!var0x.isEmpty()) {
            ((HashMap)class_[1]).put(var0x, class_[0]);
         }
      });
      var2.close();
      FileSystemProvider.installedProviders();
      Field var3 = Unsafe.class.getDeclaredField("theUnsafe");
      var3.setAccessible(true);
      Unsafe var4 = (Unsafe)var3.get(null);
      Field var5 = FileSystemProvider.class.getDeclaredField("installedProviders");
      List var6 = (List)var4.getObjectVolatile(FileSystemProvider.class, var4.staticFieldOffset(var5));
      ArrayList var7 = new ArrayList(var6);
      List var8 = var6.stream().map(FileSystemProvider::getScheme).collect(Collectors.toList());
      var7.set(var8.indexOf("jar"), new rrQB());
      List var9 = Collections.unmodifiableList(var7);
      var4.putObjectVolatile(FileSystemProvider.class, var4.staticFieldOffset(var5), var9);
      Class var10 = var1.loadClass(Main.class.getName());
      Method var11 = var10.getMethod("main", String[].class);
      var11.invoke(null, var0);
   }

   public static byte[] class_(InputStream var0) throws IOException {
      byte[] var2;
      try (rrzn_3 var1 = new rrzn_3(var0, (byte[])class_[2])) {
         var2 = var1.readAllBytes();
      }

      return var2;
   }

   public static InputStream class_(Path var0, OpenOption[] var1) throws IOException {
      String var2 = var0.toString();
      return Files.isRegularFile(var0) ? class_(var2, () -> rrQB.class_(var0).break_(var1)) : null;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{67, -108, 59, 52, -1, 9, -4, 19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1495763384;
   }

   private static void class_() {
      byte_ = new boolean[]{false, true, true, true, false, true, false, false, false, true};
   }

   private static InputStream class_(String var0, rrzv_3 var1) throws IOException {
      Object var2 = ((HashMap)class_[1]).get(var0);
      if (var2 != null) {
         if (var2 == class_[0]) {
            InputStream var3 = var1.getInputStream();
            var2 = class_(var3);
            ((HashMap)class_[1]).put(var0, var2);
         }

         return new ByteArrayInputStream((byte[])var2);
      } else {
         return null;
      }
   }

   private static void break_() {
      protected_ = new short[]{1, 0, 1, 1, 0, 2, 1, 0};
   }

   public static Function<rrzv_3, InputStream> break_(String var0) {
      Object var1 = ((HashMap)class_[1]).get(var0);
      if (var1 != null) {
         return var1 == (Object)class_[0] ? var1x -> {
            try {
               return class_(var0, var1x);
            } catch (IOException var3) {
               throw new RuntimeException(var3);
            }
         } : var1x -> new ByteArrayInputStream((byte[])var1);
      } else {
         return null;
      }
   }

   private static void throws_() {
      break_ = new byte[]{
         32,
         94,
         -16,
         2,
         105,
         3,
         94,
         4,
         -20,
         5,
         127,
         6,
         80,
         7,
         1,
         8,
         -94,
         9,
         16,
         10,
         11,
         11,
         25,
         12,
         -48,
         13,
         33,
         14,
         -15,
         15,
         -36,
         16,
         66,
         17,
         -24,
         18,
         100,
         19,
         19,
         20,
         33,
         21,
         -121,
         22,
         -97,
         23,
         114,
         24,
         -92,
         25,
         82,
         26,
         56,
         27,
         104,
         28,
         -91,
         29,
         -96,
         30,
         38,
         31,
         109,
         2,
         3
      };
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new Object(), new HashMap(), null};
      class_ = var0;
   }
}
