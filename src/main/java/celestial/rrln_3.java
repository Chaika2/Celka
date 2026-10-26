package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrln_3 {
   public static Object[] staticFields0200e7550b2f3047aa880eecde3ff849;
   public Object[] fields0200e7550b2f3047aa880eecde3ff849;
   private static short[] shorts0200e7550b2f3047aa880eecde3ff849;
   private static String[] strings0200e7550b2f3047aa880eecde3ff849;
   private static byte[] bytes0200e7550b2f3047aa880eecde3ff849;
   private static boolean[] booleans0200e7550b2f3047aa880eecde3ff849;

   private static void id_byte() {
      booleans0200e7550b2f3047aa880eecde3ff849 = new boolean[]{true, false, true, false, false, false, true, false, true, false, true, true};
   }

   private rrln_3(Predicate<an_3> var3, Supplier<Boolean> var4) {
      this.id_private();
      this.fields0200e7550b2f3047aa880eecde3ff849[shorts0200e7550b2f3047aa880eecde3ff849[1]] = var3;
      this.fields0200e7550b2f3047aa880eecde3ff849[shorts0200e7550b2f3047aa880eecde3ff849[2]] = var4;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1258726339;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-78, 64, 115, -86, 10, -36, -55, 68}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8352998901268482190L;
   }

   public Predicate<an_3> id_class() {
      return (Predicate<an_3>)this.fields0200e7550b2f3047aa880eecde3ff849[shorts0200e7550b2f3047aa880eecde3ff849[3]];
   }

   public Supplier<Boolean> id_break() {
      return (Supplier<Boolean>)this.fields0200e7550b2f3047aa880eecde3ff849[shorts0200e7550b2f3047aa880eecde3ff849[4]];
   }

   private static void id_throws() {
      strings0200e7550b2f3047aa880eecde3ff849 = new String[]{new String("PLAYERS"), new String("ARMOR_STANDS")};
   }

   private static void id_catch() {
      bytes0200e7550b2f3047aa880eecde3ff849 = new byte[]{2, 2, 2, 2, 3};
   }

   private static void id_implements() {
      shorts0200e7550b2f3047aa880eecde3ff849 = new short[]{2, 0, 1, 0, 1, 0, 1};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{
         new rrln_3(var0x -> {
            if (var0x instanceof rhd_3 var1) {
               return !var1.sc() ? booleans0200e7550b2f3047aa880eecde3ff849[2] : booleans0200e7550b2f3047aa880eecde3ff849[3];
            } else {
               return booleans0200e7550b2f3047aa880eecde3ff849[4];
            }
         }, ((rrIk_1)((Setting)(new rrIk_1("Игроки", false))).id_class(NoInteract::id_void))::id_class),
         new rrln_3(
            var0x -> var0x.BC() == aI_2.id_break ? booleans0200e7550b2f3047aa880eecde3ff849[0] : booleans0200e7550b2f3047aa880eecde3ff849[1],
            ((rrIk_1)((Setting)(new rrIk_1("Армор стенды", true))).id_class(NoInteract::id_abstract))::id_class
         ),
         null
      };
      var0[2] = new rrln_3[]{(rrln_3)var0[0], (rrln_3)var0[1]};
      staticFields0200e7550b2f3047aa880eecde3ff849 = var0;
   }

   private void id_private() {
      if (this.fields0200e7550b2f3047aa880eecde3ff849 == null) {
         this.fields0200e7550b2f3047aa880eecde3ff849 = new Object[2];
      }
   }
}
