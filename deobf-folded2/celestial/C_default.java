package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum C_default implements C_double<aI_2> {
   private static boolean[] booleans7b24c69a4b2633ff8dbb4716d06bdfc3;
   private static String[] strings7b24c69a4b2633ff8dbb4716d06bdfc3;
   public static Object[] staticFields7b24c69a4b2633ff8dbb4716d06bdfc3;
   private static byte[] bytes7b24c69a4b2633ff8dbb4716d06bdfc3;
   private static short[] shorts7b24c69a4b2633ff8dbb4716d06bdfc3;

   private static void id_byte() {
      strings7b24c69a4b2633ff8dbb4716d06bdfc3 = new String[]{new String("no entity found by that id"), new String("INSTANCE")};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{67, -67, 100, 76, -110, 25, 104, 41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2596518853236363607L;
   }

   @Override
   public Stream<String> id_class(C_for var1) throws x_1 {
      return new v_1().id_break(rVL.id_transient.id_case().map(Object::toString)).id_break(var1.id_class().id_extends()).id_break().id_protected();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1812431642;
   }

   public aI_2 id_break(C_for var1) throws x_1 {
      rqO_2 var2 = new rqO_2(var1.id_class().id_extends());
      aI_2 var3;
      if ((var3 = rVL.id_transient.id_break(var2).orElse(null)) == null) {
         throw new IllegalArgumentException("no entity found by that id");
      } else {
         return var3;
      }
   }

   private static void id_break() {
      booleans7b24c69a4b2633ff8dbb4716d06bdfc3 = new boolean[]{true, false, false, false, true};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new C_default(), null};
      var0[1] = new C_default[]{(C_default)var0[0]};
      staticFields7b24c69a4b2633ff8dbb4716d06bdfc3 = var0;
   }

   private static void id_case() {
      shorts7b24c69a4b2633ff8dbb4716d06bdfc3 = new short[]{1, 0};
   }

   private static void id_protected() {
      bytes7b24c69a4b2633ff8dbb4716d06bdfc3 = new byte[]{2};
   }
}
