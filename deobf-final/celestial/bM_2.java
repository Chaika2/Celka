package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bM_2 {
   private static byte[] class_;
   private static short[] byte_;
   public Object[] break_;

   public void byte_(bb_3 var1) {
      ((C_class)this.break_[0]).s().break_(var1);
   }

   public void byte_() {
      ((List)this.break_[1]).stream().filter(bb_3::protected_).forEach(bb_3::class_);
      this.catch_();
   }

   public bM_2(C_class var1) {
      this.finally_();
      this.break_[0] = var1;
      ArrayList var7 = new ArrayList();
      this.break_[1] = var7;
   }

   static {
      ntfClinit();
   }

   public void class_(bb_3 var1) {
      ((List)this.break_[1]).add(var1);
   }

   public void class_(bb_3 var1, rVi_1 var2) {
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1536281694;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6539916770906087371L;
   }

   public void class_() {
      U var1 = ((C_class)this.break_[0]).s();

      for (bb_3 var3 : (List)this.break_[1]) {
         var1.break_(var3);
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-54, 98, -89, 121, -2, -60, -75, 96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void break_(bb_3 var1) {
      ((C_class)this.break_[0]).s().class_(var1);
   }

   public List<bb_3> break_() {
      return (List<bb_3>)this.break_[1];
   }

   public C_class throws_() {
      return (C_class)this.break_[0];
   }

   private void finally_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   public void catch_() {
   }

   public void case_() {
      U var1 = ((C_class)this.break_[0]).s();

      for (bb_3 var3 : (List)this.break_[1]) {
         var1.class_(var3);
      }
   }

   private static void implements_() {
      byte_ = new short[]{0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1};
   }

   public void protected_() {
   }

   private static void private_() {
      class_ = new byte[]{2};
   }
}
