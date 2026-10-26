package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class t_1 extends Om_1 {
   private static byte[] byte_;
   public static Object[] class_;
   public Object[] break_;
   private static short[] protected_;
   private static boolean[] throws_;

   public t_1() {
      this.private_();
   }

   static {
      ntfClinit();
   }

   public void class_(w_1 var1) {
      this.private_();
      this.break_[0] = var1;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3027554824261916388L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 663355300;
   }

   public void class_(PX var1) {
      this.private_();
      this.break_[1] = var1;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-127, 125, 44, -8, 59, 96, -70, 89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public PX class_() {
      this.private_();
      return (PX)this.break_[1];
   }

   public static t_1 class_(w_1 var0, PX var1) {
      ((t_1)class_[0]).break_[0] = var0;
      ((t_1)class_[0]).break_[1] = var1;
      ((t_1)class_[0]).class_(false);
      return (t_1)class_[0];
   }

   public t_1 break_(w_1 var1) {
      PX var2 = this.byte_() ? ((cb_3)import_.class_[57]).goto_() : ((cb_3)import_.class_[57]).rO();
      t_1 var3 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(class_(var1, var2));
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var3);
      return var3;
   }

   public w_1 break_() {
      this.private_();
      return (w_1)this.break_[0];
   }

   private static void throws_() {
      byte_ = new byte[]{2};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new t_1()};
      class_ = var0;
   }

   private static void case_() {
      throws_ = new boolean[]{false, false, true};
   }

   private static void protected_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 0, 57, 57, 0, 0, 0, 1, 0, 1};
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }
}
