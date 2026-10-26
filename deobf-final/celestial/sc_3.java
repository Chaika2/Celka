package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sc_3 implements rz_3 {
   private static short[] byte_;
   private static String[] protected_;
   public Object[] break_;
   private static byte[] throws_;
   private static boolean[] case_;
   private static double[] catch_;

   @Override
   public boolean byte_() {
      return ((boolean[])this.break_[0])[0];
   }

   public sc_3(sN_2 var1, boolean[] var2, C_case var3) {
      this.extends_();
      this.break_[0] = var2;
      this.break_[1] = var3;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-9, -25, -40, -67, -105, 97, -110, 95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3840941602236639511L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -136541320;
   }

   @Override
   public String class_() {
      return "Pause/Resume Commands";
   }

   @Override
   public rn_3 class_(boolean var1, boolean var2) {
      ((C_case)this.break_[1]).new_().class_();
      return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
   }

   private static void finally_() {
      catch_ = new double[1];
   }

   @Override
   public boolean catch_() {
      return true;
   }

   private void extends_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   @Override
   public double case_() {
      return 0.0;
   }

   private static void implements_() {
      case_ = new boolean[]{false, true};
   }

   @Override
   public void protected_() {
   }

   private static void private_() {
      throws_ = new byte[]{2};
   }

   private static void volatile_() {
      protected_ = new String[]{new String("Pause/Resume Commands")};
   }

   private static void native_() {
      byte_ = new short[]{0, 1, 0, 1, 1};
   }
}
