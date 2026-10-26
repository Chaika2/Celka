package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruF {
   public Object[] class_;
   private static boolean[] break_;
   private static byte[] byte_;
   private static short[] protected_;

   public void byte_() {
      if ((Runnable)this.class_[3] != null) {
         ((Runnable)this.class_[3]).run();
         ((rruu_1)this.class_[0]).class_(System.currentTimeMillis());
      }
   }

   public rruF(rrtN_2 var1, rruu_1 var2) {
      this.native_();
      Supplier var7 = () -> true;
      this.class_[1] = var7;
      Supplier var8 = () -> true;
      this.class_[2] = var8;
      Boolean var9 = true;
      this.class_[5] = var9;
      this.class_[0] = var2;
      this.class_[4] = var1;
   }

   public rruF(rruu_1 var1) {
      this.native_();
      Supplier var6 = () -> true;
      this.class_[1] = var6;
      Supplier var7 = () -> true;
      this.class_[2] = var7;
      Boolean var8 = true;
      this.class_[5] = var8;
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1224512915;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7229057078044666079L;
   }

   public rruF class_(boolean var1) {
      Boolean var6 = var1;
      this.class_[5] = var6;
      return this;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-32, -123, -121, -98, 124, 25, -33, 8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      if ((Boolean)((Supplier)this.class_[2]).get()) {
         boolean var6 = this.class_().break_((float)var3, (float)var4);
         if (var5 && rrtu_3.class_(var2, var3, var4)) {
            var6 = false;
         }

         if ((rrtN_2)this.class_[4] != null && var2.class_((rrtN_2)this.class_[4], var3, var4)) {
            var6 = false;
         }

         ((rruu_1)this.class_[0]).break_((Boolean)((Supplier)this.class_[1]).get());
         ((rruu_1)this.class_[0]).class_(var6);
         ((rruu_1)this.class_[0]).class_(var1, var2, var3, var4, var5);
      }
   }

   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      boolean var6 = var4 == 0 && ((Supplier)this.class_[2]).get() && ((Supplier)this.class_[1]).get() ? true : break_[5];
      if (var5 && rrtu_3.class_(var1, var2, var3)) {
         var6 = false;
      }

      if (var6) {
         this.byte_();
         return true;
      } else {
         return break_[8];
      }
   }

   public rruF class_(Supplier<Boolean> var1) {
      this.class_[1] = var1;
      return this;
   }

   public rruF class_(Runnable var1) {
      this.class_[3] = var1;
      return this;
   }

   public rruv_1 class_() {
      return ((rruu_1)this.class_[0]).catch_();
   }

   public boolean break_() {
      return (Boolean)this.class_[5];
   }

   public rruF break_(Supplier<Boolean> var1) {
      this.class_[2] = var1;
      return this;
   }

   public boolean throws_() {
      return (Boolean)((Supplier)this.class_[2]).get();
   }

   private static void finally_() {
      protected_ = new short[]{1, 2, 5, 0, 1, 2, 5, 0, 4, 2, 4, 4, 0, 1, 0, 0, 2, 1, 3, 3, 0, 0, 0, 0, 5, 1, 2, 2, 3, 5};
   }

   private static void catch_() {
      break_ = new boolean[]{true, true, false, false, true, false, false, true, false, true, true, false};
   }

   public rruu_1 case_() {
      return (rruu_1)this.class_[0];
   }

   private static void implements_() {
      byte_ = new byte[]{6, 5};
   }

   public rruv_1 protected_() {
      return ((rruu_1)this.class_[0]).break_();
   }

   private void native_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
         var1[5] = false;
      }
   }
}
