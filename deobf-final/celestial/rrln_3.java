package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrln_3 {
   ;
   public static Object[] staticFields0200e7550b2f3047aa880eecde3ff849;
   public Object[] fields0200e7550b2f3047aa880eecde3ff849;
   private static short[] shorts0200e7550b2f3047aa880eecde3ff849;
   private static String[] strings0200e7550b2f3047aa880eecde3ff849;
   private static byte[] bytes0200e7550b2f3047aa880eecde3ff849;
   private static boolean[] booleans0200e7550b2f3047aa880eecde3ff849;

   private static void byte_() {
      booleans0200e7550b2f3047aa880eecde3ff849 = new boolean[]{true, false, true, false, false, false, true, false, true, false, true, true};
   }

   private rrln_3(Predicate<an_3> var3, Supplier<Boolean> var4) {
      this.private_();
      this.fields0200e7550b2f3047aa880eecde3ff849[0] = var3;
      this.fields0200e7550b2f3047aa880eecde3ff849[1] = var4;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1258726339;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-78, 64, 115, -86, 10, -36, -55, 68}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8352998901268482190L;
   }

   public Predicate<an_3> class_() {
      return (Predicate<an_3>)this.fields0200e7550b2f3047aa880eecde3ff849[0];
   }

   public Supplier<Boolean> break_() {
      return (Supplier<Boolean>)this.fields0200e7550b2f3047aa880eecde3ff849[1];
   }

   private static void throws_() {
      strings0200e7550b2f3047aa880eecde3ff849 = new String[]{new String("PLAYERS"), new String("ARMOR_STANDS")};
   }

   private static void catch_() {
      bytes0200e7550b2f3047aa880eecde3ff849 = new byte[]{2, 2, 2, 2, 3};
   }

   private static void implements_() {
      shorts0200e7550b2f3047aa880eecde3ff849 = new short[]{2, 0, 1, 0, 1, 0, 1};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{
         new rrln_3(var0x -> {
            if (var0x instanceof rhd_3 var1) {
               return !var1.sc() ? true : booleans0200e7550b2f3047aa880eecde3ff849[3];
            } else {
               return booleans0200e7550b2f3047aa880eecde3ff849[4];
            }
         }, (new rrIk_1("Игроки", false)).class_(NoInteract::void_)::class_),
         new rrln_3(
            var0x -> var0x.BC() == aI_2.break_ ? true : booleans0200e7550b2f3047aa880eecde3ff849[1],
            (new rrIk_1("Армор стенды", true)).class_(NoInteract::abstract_)::class_
         ),
         null
      };
      var0[2] = new rrln_3[]{(rrln_3)var0[0], (rrln_3)var0[1]};
      staticFields0200e7550b2f3047aa880eecde3ff849 = var0;
   }

   private void private_() {
      if (this.fields0200e7550b2f3047aa880eecde3ff849 == null) {
         this.fields0200e7550b2f3047aa880eecde3ff849 = new Object[2];
      }
   }
}
