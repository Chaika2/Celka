package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqP_2 implements rrqr_3 {
   private static byte[] break_;
   private static boolean[] byte_;
   private static short[] protected_;
   private static String[] throws_;
   private static float[] case_;
   public Object[] class_;

   @Override
   public rgP_2 byte_() {
      return ((rrqs_3)this.class_[3]).byte_().class_();
   }

   private static void int_() {
      protected_ = new short[]{4, 5, 2, 0, 1, 3, 0, 4, 4, 3, 3, 5, 5, 0, 0, 0, 0, 1, 2, 3, 4, 5};
   }

   public rrqP_2(rrqB_2 var1, Aw_1 var2, String var3) {
      this.continue_();
      rgN_2 var8 = new rgN_2("");
      this.class_[4] = var8;
      AnimValue var9 = new AnimValue(0.5F, false);
      this.class_[5] = var9;
      this.class_[2] = var1;
      this.class_[0] = var2;
      this.class_[1] = var3;
      rrqs_3 var13 = new rrqs_3(this);
      this.class_[3] = var13;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrqP_2 var2 = (rrqP_2)var1;
         return Objects.equals(((Aw_1)this.class_[0]).class_().getName(), ((Aw_1)var2.class_[0]).class_().getName());
      } else {
         return byte_[5];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(((Aw_1)this.class_[0]).class_().getName());
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -25132894151454775L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 867679361;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-20, -77, -101, 97, 111, 101, 45, 123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(boolean var1) {
      ((AnimValue)this.class_[5]).class_(var1);
   }

   public Aw_1 class_() {
      return (Aw_1)this.class_[0];
   }

   @Override
   public AnimValue break_() {
      return (AnimValue)this.class_[5];
   }

   @Override
   public boolean throws_() {
      return false;
   }

   public rrqs_3 finally_() {
      return (rrqs_3)this.class_[3];
   }

   @Override
   public boolean catch_() {
      return !((AnimValue)this.class_[5]).new_() ? true : byte_[2];
   }

   public String extends_() {
      return (String)this.class_[1];
   }

   public rrqB_2 case_() {
      return (rrqB_2)this.class_[2];
   }

   private void continue_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
      }
   }

   public rVi_1 implements_() {
      rgP_2 var1 = uR_2.break_((Aw_1)this.class_[0]);
      rgN_2 var2 = new rgN_2("");
      rgN_2 var3 = new rgN_2("");
      if (!var2.protected_().isEmpty()) {
         var3.class_(var2);
      }

      if (!((rgN_2)this.class_[4]).protected_().isEmpty()) {
         var3.class_((rgN_2)this.class_[4]);
      }

      var3.class_(var1);
      return var3;
   }

   private static void new_() {
      break_ = new byte[]{6};
   }

   private static void package_() {
      throws_ = new String[]{new String(""), new String(""), new String("")};
   }

   @Override
   public String private_() {
      return ((rrqs_3)this.class_[3]).byte_().break_();
   }

   private static void final_() {
      byte_ = new boolean[]{false, true, false, false, true, false, true, false};
   }

   private static void volatile_() {
      case_ = new float[]{0.5F};
   }

   public rgN_2 native_() {
      return (rgN_2)this.class_[4];
   }
}
