package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvV implements MinecraftAccessor {
   private static short[] byte_;
   public Object[] class_;
   public static Object[] break_;
   private static boolean[] protected_;
   private static byte[] throws_;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrtu_3()};
      break_ = var0;
   }

   public rrvV() {
      this.private_();
      this.protected_();
   }

   static {
      ntfClinit();
   }

   public void class_(int var1, int var2, int var3) {
      ((rrtu_3)break_[0]).class_(var1, var2, var3);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-60, -67, -23, 19, 58, 66, -56, 101}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3100168369420032286L;
   }

   public void class_(Ml_1 var1, int var2, int var3) {
      ((rrtu_3)break_[0]).class_(var1, var2, var3, false);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1591041356;
   }

   public void class_(int var1, int var2, int var3, boolean var4, boolean var5) {
      ((rrtu_3)break_[0]).class_(var1, var2, var3, var4, var5);
   }

   public TargetHud class_() {
      return (TargetHud)this.class_[0];
   }

   public void break_() {
      ((rrtu_3)break_[0]).throws_();
   }

   private static void throws_() {
      byte_ = new short[7];
   }

   private static void catch_() {
      protected_ = new boolean[]{false, true, false, false, true, true};
   }

   private static void case_() {
      throws_ = new byte[]{7, 2, 3, 4, 5, 6};
   }

   private void protected_() {
      rrtu_3 var10000 = (rrtu_3)break_[0];
      rrtN_2[] var10001 = new rrtN_2[7];
      TargetHud var5;
      TargetHud var10004 = var5 = new TargetHud();
      this.class_[0] = var5;
      var10001[0] = var10004;
      var10001[1] = new HudWidget();
      var10001[2] = new rrFS();
      var10001[3] = new rrvi_1();
      var10001[4] = new rrFu_1();
      var10001[5] = new rrFd_1();
      var10001[6] = new rrvo_1();
      var10000.class_(var10001);
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
