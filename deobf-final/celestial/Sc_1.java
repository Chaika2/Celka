package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class Sc_1 {
   private static byte[] break_;
   private static int[] byte_;
   public Object[] class_;
   private static short[] protected_;
   private static boolean[] throws_;

   public rfl_3 byte_() {
      if ((rfl_3)this.class_[1] == null && !((Map)this.class_[0]).isEmpty()) {
         int[] var10000 = new int[break_[0]];
         var10000[0] = Integer.MAX_VALUE;
         var10000[1] = Integer.MAX_VALUE;
         var10000[2] = Integer.MAX_VALUE;
         int[] var1 = var10000;
         int[] var2 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

         for (rfH_2 var4 : ((Map)this.class_[0]).keySet()) {
            var1[0] = Math.min(var1[0], var4.b_());
            var1[1] = Math.min(var1[1], var4.c_());
            var1[2] = Math.min(var1[2], var4.d_());
            var2[0] = Math.max(var2[0], var4.b_() + 1);
            var2[1] = Math.max(var2[1], var4.c_() + 1);
            var2[2] = Math.max(var2[2], var4.d_() + 1);
         }

         rfl_3 var9;
         rfl_3 var10 = var9 = new rfl_3((double)var1[0], (double)var1[1], (double)var1[2], (double)var2[0], (double)var2[1], (double)var2[2]);
         this.class_[1] = var9;
         return var10;
      } else {
         return (rfl_3)this.class_[1];
      }
   }

   public Sc_1() {
      this.implements_();
      HashMap var5 = new HashMap();
      this.class_[0] = var5;
   }

   static {
      ntfClinit();
   }

   public void class_(Map<rfH_2, xd_3> var1) {
      ((Map)this.class_[0]).putAll(var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2124465920043303914L;
   }

   public void class_(rfl_3 var1) {
      this.class_[1] = var1;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-68, 113, 52, 4, 78, -111, 51, -84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1067724748;
   }

   public rfl_3 class_() {
      return (rfl_3)this.class_[1];
   }

   public Map<rfH_2, xd_3> break_() {
      return (Map<rfH_2, xd_3>)this.class_[0];
   }

   public boolean throws_() {
      return (rfl_3)this.class_[1] != null ? true : throws_[3];
   }

   private static void finally_() {
      break_ = new byte[]{3, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2};
   }

   private static void catch_() {
      byte_ = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
   }

   private static void case_() {
      protected_ = new short[]{0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1};
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   public boolean protected_() {
      return !((Map)this.class_[0]).isEmpty() ? true : throws_[1];
   }

   private static void private_() {
      throws_ = new boolean[]{
         true, false, true, false, false, true, false, true, false, false, true, true, false, false, true, true, true, true, true, false, true, false, true
      };
   }
}
