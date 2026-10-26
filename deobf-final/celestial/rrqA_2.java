package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqA_2 {
   private static boolean[] break_;
   private static float[] byte_;
   private static byte[] protected_;
   private static short[] throws_;
   public Object[] class_;

   public float byte_() {
      return ((AnimValue)this.class_[1]).byte_();
   }

   public rrqA_2(ArrayListHud var1, Module var2) {
      this.finally_();
      AnimValue var7 = new AnimValue(0.4F, false);
      this.class_[1] = var7;
      this.class_[0] = var2;
      this.break_(((rrIk_1)var1.byte_[7]).class_());
   }

   static {
      ntfClinit();
   }

   public void class_(boolean var1) {
      ((AnimValue)this.class_[1]).class_(var1);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-111, 29, 104, 126, 56, 61, -46, -7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8050041298561751338L;
   }

   public AnimValue class_() {
      return (AnimValue)this.class_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 464604593;
   }

   public Module break_() {
      return (Module)this.class_[0];
   }

   public void break_(boolean var1) {
      String var6 = var1 ? ((Module)this.class_[0]).aH_() : ((Module)this.class_[0]).extends_();
      this.class_[2] = var6;
      Float var7 = (float)((int)Math.ceil((double)((rrZO)ArrayListHud.break_[1]).break_((String)this.class_[2])));
      this.class_[3] = var7;
   }

   public String throws_() {
      return (String)this.class_[2];
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         this.class_[3] = 0.0F;
      }
   }

   private static void catch_() {
      protected_ = new byte[]{4, 3};
   }

   private static void case_() {
      break_ = new boolean[1];
   }

   private static void implements_() {
      byte_ = new float[]{0.4F, 0.0F};
   }

   public float protected_() {
      return (Float)this.class_[3];
   }

   private static void private_() {
      throws_ = new short[]{1, 0, 7, 1, 1, 0, 0, 2, 1, 2, 3, 0, 1, 2, 3};
   }
}
