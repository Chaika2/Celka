package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum C_boolean implements C_double<C_this[]> {
   ;
   private static short[] shorts1efcd1a6ae203b428c7ab1f68db4b5b6;
   public static Object[] staticFields1efcd1a6ae203b428c7ab1f68db4b5b6;
   private static byte[] bytes1efcd1a6ae203b428c7ab1f68db4b5b6;
   private static String[] strings1efcd1a6ae203b428c7ab1f68db4b5b6;
   private static boolean[] booleans1efcd1a6ae203b428c7ab1f68db4b5b6;

   private static void byte_() {
      Object[] var0 = new Object[]{new C_boolean(), null};
      var0[1] = new C_boolean[]{(C_boolean)var0[0]};
      staticFields1efcd1a6ae203b428c7ab1f68db4b5b6 = var0;
   }

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1678006255;
   }

   public static String[] byte_(C_case var0) {
      return Stream.of(class_(var0))
         .map(C_this::byte_)
         .filter(var0x -> !var0x.isEmpty() ? true : booleans1efcd1a6ae203b428c7ab1f68db4b5b6[1])
         .toArray(String[]::new);
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      strings1efcd1a6ae203b428c7ab1f68db4b5b6 = new String[]{new String("INSTANCE")};
   }

   public static C_this[] class_(C_case var0) {
      return break_(var0).class_().stream().sorted(Comparator.comparingLong(C_this::protected_).reversed()).toArray(C_this[]::new);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{1, -24, 0, 45, 23, 14, 7, -76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static C_this[] class_(C_case var0, String var1) {
      return Stream.of(class_(var0)).filter(var1x -> var1x.byte_().equalsIgnoreCase(var1)).toArray(C_this[]::new);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5445756834076659025L;
   }

   public static C_this[] class_(C_case var0, C_else var1) {
      return break_(var0).break_(var1).stream().sorted(Comparator.comparingLong(C_this::protected_).reversed()).toArray(C_this[]::new);
   }

   @Override
   public Stream<String> class_(C_for var1) throws x_1 {
      return new v_1().break_(byte_(var1.break_())).break_().class_(C_else.break_()).class_(var1.class_().extends_()).protected_();
   }

   public static C_synchronized break_(C_case var0) {
      return var0.implements_().class_().class_();
   }

   private static void break_() {
      booleans1efcd1a6ae203b428c7ab1f68db4b5b6 = new boolean[]{true, false, true, false, false, false, true};
   }

   public C_this[] break_(C_for var1) throws x_1 {
      String var2 = var1.class_().extends_();
      C_else var3 = C_else.class_(var2);
      return var3 == null ? class_(var1.break_(), var2) : class_(var1.break_(), var3);
   }

   private static void throws_() {
      shorts1efcd1a6ae203b428c7ab1f68db4b5b6 = new short[]{1, 0};
   }

   private static void case_() {
      bytes1efcd1a6ae203b428c7ab1f68db4b5b6 = new byte[]{2};
   }
}
