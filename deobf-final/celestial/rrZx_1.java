package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZx_1 {
   private static short[] byte_;
   public Object[] class_;
   private static byte[] protected_;
   public static Object[] break_;
   private static boolean[] throws_;

   private static void byte_() {
      byte_ = new short[]{0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 167, 8470, 183, 169, 187, 171, 1072, 1103, 1040, 1071, 1025, 1105};
   }

   public rrZx_1() {
      this.throws_();
      ArrayList var5 = new ArrayList();
      this.class_[0] = var5;
      Integer var6 = 0;
      this.class_[1] = var6;
   }

   public rrZx_1(int var1, int var2) {
      this.throws_();
      ArrayList var7 = new ArrayList();
      this.class_[0] = var7;
      Integer var8 = 0;
      this.class_[1] = var8;
      this.class_(var1, var2);
   }

   static {
      ntfClinit();
   }

   public rrZx_1 class_(rrZx_1... var1) {
      for (rrZx_1 var5 : var1) {
         for (rrZd_1 var7 : var5.class_()) {
            this.class_(var7.break_(), var7.class_());
         }
      }

      return this;
   }

   public rrZx_1 class_(int... var1) {
      for (int var5 : var1) {
         this.class_(var5);
      }

      return this;
   }

   public rrZx_1 class_(int var1) {
      Integer var6 = (Integer)this.class_[1] + 1;
      this.class_[1] = var6;
      ((List)this.class_[0]).add(new rrZd_1(var1, var1));
      return this;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-32, 27, -17, -97, -119, 70, 20, -25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrZx_1 class_(int var1, int var2) {
      rrZd_1 var3 = new rrZd_1(var1, var2);
      Integer var8 = (Integer)this.class_[1] + class_(var3);
      this.class_[1] = var8;
      ((List)this.class_[0]).add(var3);
      return this;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2090052178978296484L;
   }

   public static int class_(rrZd_1 var0) {
      return var0.class_() - var0.break_() + 1;
   }

   public List<rrZd_1> class_() {
      return (List<rrZd_1>)this.class_[0];
   }

   public int break_() {
      return (Integer)this.class_[1];
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1266852625;
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[1] = 0;
      }
   }

   private static void catch_() {
      throws_ = new boolean[]{false, false, true, false, false, true, false, true, false, false, true, true, true, false};
   }

   private static void case_() {
      Object[] var0 = new Object[]{
         new rrZx_1(48, 57),
         (new rrZx_1())
            .class_(33, 47)
            .class_(58, 64)
            .class_(91, 96)
            .class_(167)
            .class_(123, 126)
            .class_(8470)
            .class_(32)
            .class_(183)
            .class_(169)
            .class_(187)
            .class_(171),
         (new rrZx_1(97, 122)).class_(65, 90),
         (new rrZx_1(1072, 1103)).class_(1040, 1071).class_(1025).class_(1105),
         null
      };
      rrZx_1[] var2 = new rrZx_1[]{
         new rrZx_1(48, 57),
         (new rrZx_1())
            .class_(33, 47)
            .class_(58, 64)
            .class_(91, 96)
            .class_(167)
            .class_(123, 126)
            .class_(8470)
            .class_(32)
            .class_(183)
            .class_(169)
            .class_(187)
            .class_(171),
         (new rrZx_1(97, 122)).class_(65, 90),
         (new rrZx_1(1072, 1103)).class_(1040, 1071).class_(1025).class_(1105)
      };
      var0[4] = (new rrZx_1()).class_(var2);
      break_ = var0;
   }

   private static void protected_() {
      protected_ = new byte[]{48, 57, 33, 47, 58, 64, 91, 96, 123, 126, 32, 97, 122, 65, 90, 2, 3, 4, 2, 2, 3, 3, 4, 2, 5};
   }
}
