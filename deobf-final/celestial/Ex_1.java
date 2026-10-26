package celestial;

import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ex_1 {
   private static byte[] break_;
   private static boolean[] byte_;
   public Object[] class_;
   private static String[] protected_;
   private static short[] throws_;

   private static void byte_() {
      protected_ = new String[]{new String("help"), new String("help")};
   }

   Ex_1(C_interface var1, String var2, sS_2 var3) {
      this.catch_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      this.class_[2] = var3;
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      throws_ = new short[]{0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 2, 0, 0, 2, 0, 1, 2};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5129902981880732907L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 632551811;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-62, 123, 78, 75, -65, 102, 94, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new byte[]{3};
   }

   private static void throws_() {
      byte_ = new boolean[]{false, true, false, true, false};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   void case_() {
      LinkedList var1 = ((sS_2)this.class_[2]).byte_();

      try {
         if (!((C_interface)this.class_[throws_[4]]).case_() && !var1.isEmpty()) {
            String var2 = ((C_import)var1.get(byte_[0])).break_().toLowerCase();
            if (var2.equals(protected_[0])) {
               C_interface var10000 = (C_interface)this.class_[throws_[5]];
               rVi_1[] var10001 = new rVi_1[byte_[1]];
               var10001[byte_[2]] = ((C_interface)this.class_[throws_[6]]).class_();
               var10000.class_(var10001);
               return;
            }
         }

         x_1 var5 = ((C_interface)this.class_[throws_[7]]).byte_();
         if (var5 == null) {
            ((C_interface)this.class_[throws_[8]]).class_((String)this.class_[throws_[9]], (sS_2)this.class_[throws_[10]]);
         } else {
            var5.class_((C_interface)this.class_[throws_[11]], var1);
         }
      } catch (Throwable var4) {
         Object var3 = var4 instanceof m_1 ? (m_1)var4 : new u_1(var4);
         ((m_1)var3).class_((C_interface)this.class_[0], var1);
      }
   }

   Stream<String> protected_() {
      try {
         v_1 var10000 = new v_1();
         String[] var10001 = new String[byte_[3]];
         var10001[byte_[4]] = protected_[1];
         Stream var1 = var10000.break_(var10001).class_(((sS_2)this.class_[throws_[13]]).implements_()).protected_();
         Stream var2 = ((C_interface)this.class_[throws_[14]]).break_((String)this.class_[throws_[15]], (sS_2)this.class_[throws_[16]]);
         return Stream.concat(var2, var1);
      } catch (Throwable var3) {
         return Stream.empty();
      }
   }
}
