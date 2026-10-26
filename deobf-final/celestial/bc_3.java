package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum bc_3 {
   ;
   public static Object[] staticFields88c6ec79f799365a8a83966a191f4fa4;
   private static short[] shorts88c6ec79f799365a8a83966a191f4fa4;
   public Object[] fields88c6ec79f799365a8a83966a191f4fa4;
   private static boolean[] booleans88c6ec79f799365a8a83966a191f4fa4;
   private static String[] strings88c6ec79f799365a8a83966a191f4fa4;
   private static byte[] bytes88c6ec79f799365a8a83966a191f4fa4;

   private bc_3(Predicate<rdn_3> var3) {
      this.case_();
      this.fields88c6ec79f799365a8a83966a191f4fa4[0] = var3;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7457595686668684807L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{3, 116, 121, 27, 41, -110, -49, -20}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Predicate<rdn_3> class_() {
      return (Predicate<rdn_3>)this.fields88c6ec79f799365a8a83966a191f4fa4[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 406468174;
   }

   private static void break_() {
      bytes88c6ec79f799365a8a83966a191f4fa4 = new byte[]{2, 2, 3};
   }

   private static void throws_() {
      strings88c6ec79f799365a8a83966a191f4fa4 = new String[]{new String("TRAPDOOR"), new String("SLAB")};
   }

   private static void catch_() {
      shorts88c6ec79f799365a8a83966a191f4fa4 = new short[]{2, 0, 0, 0, 1};
   }

   private void case_() {
      if (this.fields88c6ec79f799365a8a83966a191f4fa4 == null) {
         this.fields88c6ec79f799365a8a83966a191f4fa4 = new Object[1];
         Object[] var1 = this.fields88c6ec79f799365a8a83966a191f4fa4;
      }
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new bc_3(var0x -> {
         if (var0x.break_() instanceof rxJ_2 var1 && var1.catch_() instanceof zv_3) {
            return true;
         }

         return booleans88c6ec79f799365a8a83966a191f4fa4[3];
      }), new bc_3(var0x -> {
         if (var0x.break_() instanceof rxJ_2 var1 && var1.catch_() instanceof Wg_1) {
            return true;
         }

         return booleans88c6ec79f799365a8a83966a191f4fa4[1];
      }), null};
      var0[2] = new bc_3[]{(bc_3)var0[0], (bc_3)var0[1]};
      staticFields88c6ec79f799365a8a83966a191f4fa4 = var0;
   }

   private static void private_() {
      booleans88c6ec79f799365a8a83966a191f4fa4 = new boolean[]{true, false, true, false, false, true, false, false, true, true, true};
   }
}
