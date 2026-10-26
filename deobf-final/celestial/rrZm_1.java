package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZm_1 {
   private static short[] break_;
   private static byte[] byte_;
   private static float[] protected_;
   public Object[] class_;

   public rrZK byte_() {
      return (rrZK)this.class_[3];
   }

   public rrZm_1(rrvJ var1, rrtu_3 var2, int var3) {
      this.implements_();
      ArrayList var8 = new ArrayList();
      this.class_[5] = var8;
      rrZI var9 = new rrZI(var1, var2, var3 + 7, 5);
      this.class_[0] = var9;
      rrZw_1 var10 = new rrZw_1(var1, (float)var3 + 6.5F, 10.0F);
      this.class_[1] = var10;
      rrZf_1 var11 = new rrZf_1(var1, var3 + 7, 5);
      this.class_[2] = var11;
      rrZK var12 = new rrZK(var1, var2, (float)var3 + 6.5F, 10.0F);
      this.class_[3] = var12;
      rrZj_1 var13 = new rrZj_1(var1, var2, (float)var3 + 6.5F, 10.0F);
      this.class_[4] = var13;
      ((List)this.class_[5]).addAll(List.of(this.class_[0], this.class_[1], this.class_[2], this.class_[3], this.class_[4]));
   }

   static {
      ntfClinit();
   }

   public rrZf_1 class_() {
      return (rrZf_1)this.class_[2];
   }

   public rrZN class_(Category var1) {
      return (rrZN)(switch (((int[])rrZZ.class_[0])[var1.ordinal()]) {
         case 1, 2, 3, 4, 5 -> (rrZI)this.class_[0];
         case 6 -> (rrZK)this.class_[3];
         case 7 -> (rrZj_1)this.class_[4];
         case 8 -> (rrZw_1)this.class_[1];
         case 9 -> (rrZf_1)this.class_[2];
         default -> throw new IncompatibleClassChangeError();
      });
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1164437158;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, -53, -6, 19, -120, 43, -40, -123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6626958858748187082L;
   }

   public List<rrZN> break_() {
      return (List<rrZN>)this.class_[5];
   }

   public rrZj_1 throws_() {
      return (rrZj_1)this.class_[4];
   }

   private static void finally_() {
      byte_ = new byte[]{7, 5, 7, 5, 6};
   }

   private static void catch_() {
      protected_ = new float[]{6.5F, 10.0F, 6.5F, 10.0F, 6.5F, 10.0F};
   }

   public rrZw_1 case_() {
      return (rrZw_1)this.class_[1];
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
      }
   }

   public rrZI protected_() {
      return (rrZI)this.class_[0];
   }

   private static void private_() {
      break_ = new short[]{5, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 0, 0, 3, 4, 1, 2, 0, 1, 2, 3, 4, 5};
   }
}
