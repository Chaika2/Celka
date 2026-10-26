package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLD {
   public static Object[] class_;
   private static double[] byte_;
   public Object[] break_;
   private static short[] protected_;
   private static byte[] throws_;
   private static boolean[] case_;

   public rdn_3 byte_() {
      return (rdn_3)this.break_[1];
   }

   public rrLD() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   public static void class_(iB_2 var0, rdn_3 var1, List<rLY> var2, double var3) {
      rrLD var5 = break_(var0, var1, var2, var3);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var5);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-76, 69, -103, 0, -48, 60, 85, 31}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -695246301;
   }

   public double class_() {
      return (Double)this.break_[3];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4730532062994387273L;
   }

   public iB_2 break_() {
      return (iB_2)this.break_[0];
   }

   public static rrLD break_(iB_2 var0, rdn_3 var1, List<rLY> var2, double var3) {
      ((rrLD)class_[0]).break_[0] = var0;
      ((rrLD)class_[0]).break_[1] = var1;
      ((rrLD)class_[0]).break_[2] = var2;
      rrLD var10000 = (rrLD)class_[0];
      Double var12 = var3;
      var10000.break_[3] = var12;
      return (rrLD)class_[0];
   }

   private static void throws_() {
      byte_ = new double[1];
   }

   private static void finally_() {
      case_ = new boolean[]{false, true};
   }

   private static void catch_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 0, 0, 1, 2, 3};
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         Object[] var1 = this.break_;
         var1[3] = 0.0;
      }
   }

   private static void implements_() {
      throws_ = new byte[]{4, 3};
   }

   public List<rLY> protected_() {
      return (List<rLY>)this.break_[2];
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rrLD()};
      class_ = var0;
   }
}
