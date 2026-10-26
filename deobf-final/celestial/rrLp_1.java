package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLp_1 extends Om_1 {
   private static byte[] byte_;
   private static boolean[] protected_;
   public static Object[] class_;
   private static short[] throws_;
   public Object[] break_;

   public rrLp_1() {
      this.catch_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 671858019723482893L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-17, -119, -76, -98, -22, 7, -62, 51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(int var1) {
      this.catch_();
      Integer var6 = var1;
      this.break_[4] = var6;
   }

   public static rrLp_1 class_(rrLq_1 var0, rfH_2 var1, rpr_3 var2, rdn_3 var3, int var4) {
      rrLp_1 var5 = break_(var0, var1, var2, var3, var4);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var5);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var5);
      return var5;
   }

   public rfH_2 class_() {
      this.catch_();
      return (rfH_2)this.break_[1];
   }

   private static rrLp_1 break_(rrLq_1 var0, rfH_2 var1, rpr_3 var2, rdn_3 var3, int var4) {
      ((rrLp_1)class_[0]).break_[0] = var0;
      ((rrLp_1)class_[0]).break_[1] = var1;
      ((rrLp_1)class_[0]).break_[2] = var2;
      ((rrLp_1)class_[0]).break_[3] = var3;
      rrLp_1 var10000 = (rrLp_1)class_[0];
      Integer var13 = var4;
      var10000.break_[4] = var13;
      ((rrLp_1)class_[0]).class_(false);
      return (rrLp_1)class_[0];
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -728841981;
   }

   public int break_() {
      this.catch_();
      return (Integer)this.break_[4];
   }

   public rdn_3 throws_() {
      this.catch_();
      return (rdn_3)this.break_[3];
   }

   private static void finally_() {
      protected_ = new boolean[]{false, false, false, true};
   }

   private void catch_() {
      if (this.break_ == null) {
         this.break_ = new Object[5];
         Object[] var1 = this.break_;
         var1[4] = 0;
      }
   }

   private static void extends_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 0, 0, 0, 0, 1, 2, 3, 4, 4};
   }

   public rrLq_1 case_() {
      this.catch_();
      return (rrLq_1)this.break_[0];
   }

   private static void implements_() {
      byte_ = new byte[]{5, 4};
   }

   public rpr_3 protected_() {
      this.catch_();
      return (rpr_3)this.break_[2];
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rrLp_1()};
      class_ = var0;
   }
}
