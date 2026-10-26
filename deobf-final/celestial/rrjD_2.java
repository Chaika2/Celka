package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjD_2 implements Cloneable {
   private static short[] break_;
   private static boolean[] byte_;
   public Object[] class_;
   private static byte[] protected_;

   public String byte_() {
      return (String)this.class_[0];
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-9, 25, 22, 115, 63, 21, 13, 64}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrjD_2(String var1, eX_2 var2, String var3) {
      this.throws_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      this.class_[2] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrjD_2 var2 = (rrjD_2)var1;
         return Objects.equals((String)this.class_[0], (String)var2.class_[0]) && Objects.equals((String)this.class_[2], (String)var2.class_[2])
            ? true
            : byte_[4];
      } else {
         return byte_[2];
      }
   }

   @Override
   public String toString() {
      return (String)this.class_[0]
         + " | X: "
         + (int)((eX_2)this.class_[1]).class_()
         + " Y: "
         + (int)((eX_2)this.class_[1]).break_()
         + " Z: "
         + (int)((eX_2)this.class_[1]).byte_();
   }

   @Override
   public int hashCode() {
      return Objects.hash((String)this.class_[0], (String)this.class_[2]);
   }

   public void class_(eX_2 var1) {
      this.class_[1] = var1;
   }

   public rrjD_2 class_() {
      try {
         return (rrjD_2)super.clone();
      } catch (CloneNotSupportedException var2) {
         return new rrjD_2((String)this.class_[0], (eX_2)this.class_[1], (String)this.class_[2]);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1875300324;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1649271334732665355L;
   }

   public void class_(String var1) {
      this.class_[0] = var1;
   }

   public boolean break_(String var1) {
      return (String)this.class_[2] == null ? true : ((String)this.class_[2]).equals(var1);
   }

   public eX_2 break_() {
      return (eX_2)this.class_[1];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      protected_ = new byte[]{2, 3};
   }

   private static void case_() {
      break_ = new short[]{0, 1, 2, 2, 2, 0, 1, 2, 0, 0, 2, 2, 0, 2, 0, 1, 1, 1, 0, 1, 2, 0, 1, 2};
   }

   public void protected_(String var1) {
      this.class_[2] = var1;
   }

   public String protected_() {
      return (String)this.class_[2];
   }

   private static void private_() {
      byte_ = new boolean[]{true, true, false, true, false, false, true};
   }
}
