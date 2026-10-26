package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAg_1 {
   public static Object[] class_;
   private static byte[] byte_;
   public Object[] break_;
   private static short[] protected_;
   private static boolean[] throws_;

   public rdn_3 byte_() {
      return (rdn_3)this.break_[5];
   }

   public rrAg_1() {
      this.catch_();
   }

   static {
      ntfClinit();
   }

   public int class_() {
      return (Integer)this.break_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 13900203;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{109, -10, 55, -82, 6, 113, 57, -56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 162559671018294786L;
   }

   public static rrAg_1 class_(int var0, int var1, int var2, short var3, rXa_1 var4, rdn_3 var5) {
      rrAg_1 var10000 = (rrAg_1)class_[0];
      Integer var10 = var0;
      var10000.break_[0] = var10;
      var10000 = (rrAg_1)class_[0];
      Integer var11 = var1;
      var10000.break_[1] = var11;
      var10000 = (rrAg_1)class_[0];
      Integer var12 = var2;
      var10000.break_[2] = var12;
      var10000 = (rrAg_1)class_[0];
      Short var13 = var3;
      var10000.break_[3] = var13;
      ((rrAg_1)class_[0]).break_[4] = var4;
      ((rrAg_1)class_[0]).break_[5] = var5;
      return (rrAg_1)class_[0];
   }

   public static void break_(int var0, int var1, int var2, short var3, rXa_1 var4, rdn_3 var5) {
      rrAg_1 var6 = class_(var0, var1, var2, var3, var4, var5);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var6);
   }

   public int break_() {
      return (Integer)this.break_[2];
   }

   public short throws_() {
      return (Short)this.break_[3];
   }

   private static void finally_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 0, 0, 1, 2, 3, 4, 5};
   }

   private void catch_() {
      if (this.break_ == null) {
         this.break_ = new Object[6];
         Object[] var1 = this.break_;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
         var1[3] = (short)0;
      }
   }

   private static void extends_() {
      throws_ = new boolean[]{false, false, false, true, false, false, false, true};
   }

   public int case_() {
      return (Integer)this.break_[0];
   }

   private static void implements_() {
      byte_ = new byte[]{6, 2, 3};
   }

   public rXa_1 protected_() {
      return (rXa_1)this.break_[4];
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rrAg_1()};
      class_ = var0;
   }
}
