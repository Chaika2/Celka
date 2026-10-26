package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rhW_2 {
   ;
   public static Object[] staticFields4c1a1e3ca1b33044b12dba3caf94435e;
   private static byte[] bytes4c1a1e3ca1b33044b12dba3caf94435e;
   private static short[] shorts4c1a1e3ca1b33044b12dba3caf94435e;
   private static String[] strings4c1a1e3ca1b33044b12dba3caf94435e;
   public Object[] fields4c1a1e3ca1b33044b12dba3caf94435e;
   private static boolean[] booleans4c1a1e3ca1b33044b12dba3caf94435e;

   private rhW_2() {
      this.break_();
      Object var7 = null;
      this.fields4c1a1e3ca1b33044b12dba3caf94435e[0] = var7;
   }

   private rhW_2(rgP_2 var3) {
      this.break_();
      this.fields4c1a1e3ca1b33044b12dba3caf94435e[0] = var3;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 961058164;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{88, -52, -107, -57, -120, -86, 65, 123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rgP_2 class_() {
      return (rgP_2)this.fields4c1a1e3ca1b33044b12dba3caf94435e[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3568336312778466409L;
   }

   private void break_() {
      if (this.fields4c1a1e3ca1b33044b12dba3caf94435e == null) {
         this.fields4c1a1e3ca1b33044b12dba3caf94435e = new Object[1];
         Object[] var1 = this.fields4c1a1e3ca1b33044b12dba3caf94435e;
      }
   }

   private static void throws_() {
      strings4c1a1e3ca1b33044b12dba3caf94435e = new String[]{
         new String("NOT_POSSIBLE_HERE"),
         new String("NOT_POSSIBLE_NOW"),
         new String("block.minecraft.bed.no_sleep"),
         new String("TOO_FAR_AWAY"),
         new String("block.minecraft.bed.too_far_away"),
         new String("OBSTRUCTED"),
         new String("block.minecraft.bed.obstructed"),
         new String("OTHER_PROBLEM"),
         new String("NOT_SAFE"),
         new String("block.minecraft.bed.not_safe")
      };
   }

   private static void catch_() {
      Object[] var0 = new Object[]{
         new rhW_2(),
         new rhW_2(new rgn_3("block.minecraft.bed.no_sleep")),
         new rhW_2(new rgn_3("block.minecraft.bed.too_far_away")),
         new rhW_2(new rgn_3("block.minecraft.bed.obstructed")),
         new rhW_2(),
         new rhW_2(new rgn_3("block.minecraft.bed.not_safe")),
         null
      };
      var0[6] = new rhW_2[]{(rhW_2)var0[0], (rhW_2)var0[1], (rhW_2)var0[2], (rhW_2)var0[3], (rhW_2)var0[4], (rhW_2)var0[5]};
      staticFields4c1a1e3ca1b33044b12dba3caf94435e = var0;
   }

   private static void case_() {
      shorts4c1a1e3ca1b33044b12dba3caf94435e = new short[]{6, 0, 0, 0, 0, 1, 2, 3, 4, 5};
   }

   private static void protected_() {
      booleans4c1a1e3ca1b33044b12dba3caf94435e = new boolean[]{false, true, false, false, true, true, true};
   }

   private static void private_() {
      bytes4c1a1e3ca1b33044b12dba3caf94435e = new byte[]{6, 2, 3, 4, 5, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7};
   }
}
