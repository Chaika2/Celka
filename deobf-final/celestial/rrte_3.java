package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrte_3 {
   public Object[] class_;
   private static short[] break_;
   private static String[] byte_;
   private static byte[] protected_;

   public static rrti_3 byte_() {
      return new rrti_3();
   }

   public rrte_3(rrti_3 var1) {
      this.implements_();
      Pattern var6 = (Pattern)var1.class_[1];
      this.class_[1] = var6;
      List var7 = (List)var1.class_[3];
      this.class_[3] = var7;
      rrta_3 var8 = (rrta_3)var1.class_[0];
      this.class_[0] = var8;
      String var9 = (String)var1.class_[2];
      this.class_[2] = var9;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{34, -24, -68, -77, 18, -93, 55, -78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String class_() {
      return (String)this.class_[2];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -678139722;
   }

   public static rrte_3 class_(Pattern var0) {
      return new rrti_3().class_(var0).class_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6933898524958402093L;
   }

   public rrtU_2 break_(String var1) {
      if ((Pattern)this.class_[1] != null && !((Pattern)this.class_[1]).matcher(var1).matches()) {
         return rrtU_2.class_("");
      } else {
         for (rrwr_3 var3 : (List)this.class_[3]) {
            rrtU_2 var4 = var3.break_(var1);
            if (!var4.byte_()) {
               return var4;
            }
         }

         return rrtU_2.class_();
      }
   }

   public Pattern break_() {
      return (Pattern)this.class_[1];
   }

   public rrta_3 throws_() {
      return (rrta_3)this.class_[0];
   }

   private static void catch_() {
      byte_ = new String[]{new String("")};
   }

   private static void case_() {
      protected_ = new byte[]{4};
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }

   public List<rrwr_3> protected_() {
      return (List<rrwr_3>)this.class_[3];
   }

   private static void private_() {
      break_ = new short[]{1, 1, 3, 3, 0, 0, 2, 2, 1, 1, 3, 0, 1, 2, 3};
   }
}
