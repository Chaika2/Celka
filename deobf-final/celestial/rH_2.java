package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rH_2 extends rl_3 {
   private static boolean[] byte_;
   public Object[] break_;
   private static short[] protected_;
   private static byte[] throws_;
   private static String[] case_;

   public rH_2(int var1, int var2, int var3) {
      super(var1, var2, var3);
      this.throws_();
      ArrayList var8 = new ArrayList();
      this.break_[0] = var8;
      this.catch_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6978375932044414814L;
   }

   public void class_(rq_3 var1, int var2, int var3, int var4) {
      this.throws_();
      ((List)this.break_[0]).add(new ry_3(var1, var2, var3, var4));
      this.catch_();
   }

   @Override
   public xc_3 class_(int var1, int var2, int var3, xc_3 var4, List<xc_3> var5) {
      ry_3 var6 = this.break_(var1, var2, var3, var4);
      if (var6 == null) {
         throw new IllegalStateException("couldn't find schematic for this position");
      } else {
         return ((rq_3)var6.class_[0]).class_(var1 - (Integer)var6.class_[1], var2 - (Integer)var6.class_[2], var3 - (Integer)var6.class_[3], var4, var5);
      }
   }

   @Override
   public boolean class_(int var1, int var2, int var3, xc_3 var4) {
      ry_3 var5 = this.break_(var1, var2, var3, var4);
      return var5 != null
            && ((rq_3)var5.class_[0]).class_(var1 - (Integer)var5.class_[1], var2 - (Integer)var5.class_[2], var3 - (Integer)var5.class_[3], var4)
         ? true
         : byte_[4];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1051215312;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{58, 74, -46, 71, 108, 127, 57, -25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private ry_3 break_(int var1, int var2, int var3, xc_3 var4) {
      this.throws_();

      for (ry_3 var8 : (ry_3[])this.break_[1]) {
         if (var1 >= (Integer)var8.class_[1]
            && var2 >= (Integer)var8.class_[2]
            && var3 >= (Integer)var8.class_[3]
            && ((rq_3)var8.class_[0]).class_(var1 - (Integer)var8.class_[1], var2 - (Integer)var8.class_[2], var3 - (Integer)var8.class_[3], var4)) {
            return var8;
         }
      }

      return null;
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   private static void finally_() {
      protected_ = new short[]{0, 1, 1, 0, 1, 0, 0, 1, 2, 0, 1, 2, 3, 0, 2, 0, 0, 1, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 1, 0};
   }

   private void catch_() {
      this.throws_();
      ry_3[] var9 = ((List)this.break_[0]).toArray(new ry_3[0]);
      this.break_[1] = var9;

      for (ry_3 var4 : (ry_3[])this.break_[1]) {
         Integer var10 = Math.max((Integer)this.class_[0], (Integer)var4.class_[1] + ((rq_3)var4.class_[0]).break_());
         this.class_[0] = var10;
         Integer var11 = Math.max((Integer)this.class_[1], (Integer)var4.class_[2] + ((rq_3)var4.class_[0]).class_());
         this.class_[1] = var11;
         Integer var12 = Math.max((Integer)this.class_[2], (Integer)var4.class_[3] + ((rq_3)var4.class_[0]).byte_());
         this.class_[2] = var12;
      }
   }

   private static void case_() {
      case_ = new String[]{new String("couldn't find schematic for this position")};
   }

   private static void implements_() {
      byte_ = new boolean[]{false, false, false, true, false, false};
   }

   @Override
   public void protected_() {
      this.throws_();

      for (ry_3 var4 : (ry_3[])this.break_[1]) {
         ((rq_3)var4.class_[0]).protected_();
      }
   }

   private static void private_() {
      throws_ = new byte[]{2};
   }
}
