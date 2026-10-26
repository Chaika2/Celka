package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwx_3 implements Af_1 {
   private static byte[] break_;
   private static boolean[] byte_;
   private static String[] protected_;
   private static short[] throws_;
   public Object[] class_;

   private static void byte_() {
      break_ = new byte[]{2, 4};
   }

   public rrwx_3(rrwJ_2 var1, rud_3 var2, String var3) {
      this.protected_();
      this.class_[3] = var1;
      this.class_[1] = var2;
      this.class_[2] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rLG var1) {
      Boolean var8 = true;
      this.class_[0] = var8;
      rrwJ_2 var10000 = (rrwJ_2)this.class_[3];
      Object var9 = null;
      var10000.class_[2] = var9;
      long var2 = rqR_2.break_() - (Long)((rrwJ_2)this.class_[3]).class_[1];
      var10000 = (rrwJ_2)this.class_[3];
      String var10 = new rgn_3("ui.proxyserver.ping.showPing", var2).getString();
      var10000.class_[0] = var10;
      ((rud_3)this.class_[1]).class_(new rgn_3("multiplayer.status.finished"));
   }

   @Override
   public rud_3 class_() {
      return (rud_3)this.class_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1280433270939446778L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{126, -59, -21, 28, 38, 25, 76, 65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(rgP_2 var1, rgP_2 var2) {
      rrwJ_2 var10000 = (rrwJ_2)this.class_[3];
      Object var7 = null;
      var10000.class_[2] = var7;
      if (!(Boolean)this.class_[0]) {
         var10000 = (rrwJ_2)this.class_[3];
         String var8 = rgF_2.RED + new rgn_3("ui.proxyserver.err.cantPingReason", (String)this.class_[2], var2.getString()).getString();
         var10000.class_[0] = var8;
      }
   }

   @Override
   public void class_(rLb_1 var1) {
      rrwJ_2 var10000 = (rrwJ_2)this.class_[3];
      Long var6 = rqR_2.break_();
      var10000.class_[1] = var6;
      ((rud_3)this.class_[1]).class_(new rLB((Long)((rrwJ_2)this.class_[3]).class_[1]));
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1069250188;
   }

   private static void break_() {
      byte_ = new boolean[]{true, true, false, false, true, false, false};
   }

   private static void throws_() {
      throws_ = new short[]{3, 1, 2, 3, 1, 1, 3, 1, 0, 3, 2, 3, 1, 3, 0, 1, 3, 2, 0, 3, 2, 0, 1};
   }

   private static void case_() {
      protected_ = new String[]{
         new String("ui.proxyserver.ping.showPing"), new String("multiplayer.status.finished"), new String("ui.proxyserver.err.cantPingReason")
      };
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[0] = false;
      }
   }
}
