package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNF {
   public Object[] class_;
   private static boolean[] break_;
   private static byte[] byte_;
   private static short[] protected_;

   public List<rrNA> byte_() {
      return (List<rrNA>)this.class_[1];
   }

   public rrNF(rrNW var1, rrNd_1 var2) {
      this.protected_();
      ArrayList var7 = new ArrayList();
      this.class_[1] = var7;
      this.class_[0] = var2;
      rrNL var9 = (rrNL)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[0];
      this.class_[2] = var9;
      ((List)this.class_[1]).add(new rrNn_1(var1));
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrNF var2 = (rrNF)var1;
         return Objects.equals((rrNd_1)this.class_[0], (rrNd_1)var2.class_[0]) && (rrNL)this.class_[2] == (rrNL)var2.class_[2] ? true : break_[3];
      } else {
         return break_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((rrNd_1)this.class_[0], (rrNL)this.class_[2]);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 176594816;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{90, 1, -41, -104, 26, -2, -71, -119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rrNL var1) {
      this.class_[2] = var1;

      for (rrNA var3 : (List)this.class_[1]) {
         var3.class_(this);
      }
   }

   public rrNL class_() {
      return (rrNL)this.class_[2];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5227389519647535236L;
   }

   public rrNd_1 break_() {
      return (rrNd_1)this.class_[0];
   }

   private static void throws_() {
      byte_ = new byte[]{2, 3};
   }

   private static void catch_() {
      break_ = new boolean[]{true, false, true, false, false, true};
   }

   private static void case_() {
      protected_ = new short[]{1, 0, 0, 2, 1, 2, 1, 0, 0, 2, 2, 0, 2, 0, 1, 2};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }
}
