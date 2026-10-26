package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAA extends Om_1 {
   private static short[] byte_;
   private static byte[] protected_;
   public static Object[] class_;
   public Object[] break_;
   private static boolean[] throws_;

   public rrAA() {
      this.private_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6374671208483873368L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{106, 44, -120, 24, 38, -11, -122, 110}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAA class_(rym_3<rdn_3> var0, rpm_3 var1) {
      ((rrAA)class_[0]).break_[0] = var0;
      rrAA var10000 = (rrAA)class_[0];
      rdb_3 var7 = ((rdn_3)var0.break_()).break_();
      var10000.break_[1] = var7;
      ((rrAA)class_[0]).break_[2] = var1;
      ((rrAA)class_[0]).class_(false);
      return (rrAA)class_[0];
   }

   public rym_3<rdn_3> class_() {
      this.private_();
      return (rym_3<rdn_3>)this.break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -964565279;
   }

   public rdb_3 break_() {
      this.private_();
      return (rdb_3)this.break_[1];
   }

   private static void throws_() {
      protected_ = new byte[]{3};
   }

   private static void catch_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 1, 2};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrAA()};
      class_ = var0;
   }

   private static void implements_() {
      throws_ = new boolean[]{false, false, true};
   }

   public rpm_3 protected_() {
      this.private_();
      return (rpm_3)this.break_[2];
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
      }
   }
}
