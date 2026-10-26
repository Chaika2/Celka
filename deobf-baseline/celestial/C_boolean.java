package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum C_boolean implements C_double<C_this[]> {
   private static short[] shorts1efcd1a6ae203b428c7ab1f68db4b5b6;
   public static Object[] staticFields1efcd1a6ae203b428c7ab1f68db4b5b6;
   private static byte[] bytes1efcd1a6ae203b428c7ab1f68db4b5b6;
   private static String[] strings1efcd1a6ae203b428c7ab1f68db4b5b6;
   private static boolean[] booleans1efcd1a6ae203b428c7ab1f68db4b5b6;

   private static void id_byte() {
      Object[] var0 = new Object[]{new C_boolean(), null};
      var0[1] = new C_boolean[]{(C_boolean)var0[0]};
      staticFields1efcd1a6ae203b428c7ab1f68db4b5b6 = var0;
   }

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1678006255;
   }

   public static String[] id_byte(C_case var0) {
      return Stream.of(id_class(var0))
         .map(C_this::id_byte)
         .filter(var0x -> !var0x.isEmpty() ? booleans1efcd1a6ae203b428c7ab1f68db4b5b6[0] : booleans1efcd1a6ae203b428c7ab1f68db4b5b6[1])
         .toArray(String[]::new);
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      strings1efcd1a6ae203b428c7ab1f68db4b5b6 = new String[]{new String("INSTANCE")};
   }

   public static C_this[] id_class(C_case var0) {
      return id_break(var0).id_class().stream().sorted(Comparator.comparingLong(C_this::id_protected).reversed()).toArray(C_this[]::new);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{1, -24, 0, 45, 23, 14, 7, -76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static C_this[] id_class(C_case var0, String var1) {
      return Stream.of(id_class(var0)).filter(var1x -> var1x.id_byte().equalsIgnoreCase(var1)).toArray(C_this[]::new);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5445756834076659025L;
   }

   public static C_this[] id_class(C_case var0, C_else var1) {
      return id_break(var0).id_break(var1).stream().sorted(Comparator.comparingLong(C_this::id_protected).reversed()).toArray(C_this[]::new);
   }

   @Override
   public Stream<String> id_class(C_for var1) throws x_1 {
      return new v_1().id_break(id_byte(var1.id_break())).id_break().id_class(C_else.id_break()).id_class(var1.id_class().id_extends()).id_protected();
   }

   public static C_synchronized id_break(C_case var0) {
      return var0.id_implements().id_class().id_class();
   }

   private static void id_break() {
      booleans1efcd1a6ae203b428c7ab1f68db4b5b6 = new boolean[]{true, false, true, false, false, false, true};
   }

   public C_this[] id_break(C_for var1) throws x_1 {
      String var2 = var1.id_class().id_extends();
      C_else var3 = C_else.id_class(var2);
      return var3 == null ? id_class(var1.id_break(), var2) : id_class(var1.id_break(), var3);
   }

   private static void id_throws() {
      shorts1efcd1a6ae203b428c7ab1f68db4b5b6 = new short[]{1, 0};
   }

   private static void id_case() {
      bytes1efcd1a6ae203b428c7ab1f68db4b5b6 = new byte[]{2};
   }
}
