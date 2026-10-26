package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFX {
   private static boolean[] break_;
   public Object[] class_;
   private static float[] byte_;
   private static byte[] protected_;
   private static short[] throws_;
   private static String[] case_;

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 810784379;
   }

   public rdn_3 byte_() {
      return (rdn_3)this.class_[1];
   }

   public rrFX(iB_2 var1, rdn_3 var2) {
      this.finally_();
      AnimValue var7 = new AnimValue(0.5F, false);
      this.class_[4] = var7;
      this.class_[0] = var1;
      this.class_[1] = var2;
      Integer var10 = var2.char_();
      this.class_[2] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrFX var2 = (rrFX)var1;
         return Objects.equals((iB_2)this.class_[0], (iB_2)var2.class_[0])
               && Objects.equals(((rdn_3)this.class_[1]).continue_().getString(), ((rdn_3)var2.class_[1]).continue_().getString())
            ? true
            : break_[7];
      } else {
         return break_[5];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((iB_2)this.class_[0], ((rdn_3)this.class_[1]).continue_().getString());
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4366967478381526679L;
   }

   public void class_(boolean var1) {
      ((AnimValue)this.class_[4]).class_(var1);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{46, 125, 60, 50, 118, 32, -99, -92}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(int var1) {
      Integer var6 = var1;
      this.class_[2] = var6;
   }

   public iB_2 class_() {
      return (iB_2)this.class_[0];
   }

   public int break_() {
      return (Integer)this.class_[3];
   }

   public void break_(int var1) {
      Integer var6 = var1;
      this.class_[3] = var6;
   }

   public rVi_1 throws_() {
      rgN_2 var1 = new rgN_2("");
      var1.class_(((iB_2)this.class_[0]).class_(new rnO_2[]{rnO_2.PREFIX, rnO_2.NAME})).break_(rgF_2.GRAY + " » ").class_(((rdn_3)this.class_[1]).continue_());
      if ((Integer)this.class_[2] > 1) {
         var1.break_(rgF_2.RED + " x" + (Integer)this.class_[2]);
      }

      return var1;
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         Object[] var1 = this.class_;
         var1[2] = 0;
         var1[3] = 0;
      }
   }

   private static void catch_() {
      break_ = new boolean[]{false, false, true, true, true, false, true, false, false, true, false, false};
   }

   private static void extends_() {
      throws_ = new short[]{4, 0, 1, 2, 4, 0, 1, 2, 2, 0, 0, 1, 1, 0, 1, 0, 1, 2, 3, 4, 2, 3};
   }

   public int case_() {
      return (Integer)this.class_[2];
   }

   private static void implements_() {
      protected_ = new byte[]{2, 2, 5, 2, 3};
   }

   public AnimValue protected_() {
      return (AnimValue)this.class_[4];
   }

   private static void private_() {
      case_ = new String[]{new String("")};
   }

   private static void native_() {
      byte_ = new float[]{0.5F};
   }
}
