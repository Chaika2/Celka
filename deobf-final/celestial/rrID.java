package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrID implements MinecraftAccessor {
   private static short[] break_;
   private static boolean[] byte_;
   private static byte[] protected_;
   public Object[] class_;
   private static double[] throws_;

   public boolean byte_() {
      return (Boolean)this.class_[2];
   }

   public void byte_(Runnable var1) {
      var1.run();
      Boolean var6 = true;
      this.class_[2] = var6;
   }

   public rrID() {
      this.finally_();
      rrfw_3 var5 = new rrfw_3();
      this.class_[5] = var5;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 79096690;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{53, -86, 84, 80, 49, -3, 4, -2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6858188666995957075L;
   }

   public void class_(Runnable var1) {
      this.class_[0] = var1;
   }

   public void class_(rrLu_1 var1) {
      if (var1.class_() instanceof rvS_2 var3 && var3.protected_() && (Runnable)this.class_[0] != null && (Boolean)this.class_[2]) {
         Boolean var8 = true;
         this.class_[3] = var8;
      }
   }

   public void class_(q_1 var1) {
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((Runnable)this.class_[0] != null && (Boolean)this.class_[2]) {
            ((Runnable)this.class_[0]).run();
            Boolean var6 = false;
            this.class_[2] = var6;
            Object var7 = null;
            this.class_[0] = var7;
            Boolean var8 = false;
            this.class_[3] = var8;
            Boolean var9 = true;
            this.class_[4] = var9;
            ((rrfw_3)this.class_[5]).class_();
         }

         if ((Runnable)this.class_[1] != null && (Boolean)this.class_[4] && ((rrfw_3)this.class_[5]).class_(100.0)) {
            ((Runnable)this.class_[1]).run();
            Object var10 = null;
            this.class_[1] = var10;
            Boolean var11 = false;
            this.class_[4] = var11;
            ((rrfw_3)this.class_[5]).class_();
         }
      }
   }

   public Runnable class_() {
      return (Runnable)this.class_[0];
   }

   public void break_(Runnable var1) {
      this.class_[1] = var1;
   }

   public Runnable break_() {
      return (Runnable)this.class_[1];
   }

   public boolean throws_() {
      return (Boolean)this.class_[3];
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         this.class_[2] = false;
         this.class_[3] = false;
         this.class_[4] = false;
      }
   }

   private static void catch_() {
      throws_ = new double[]{100.0};
   }

   private static void extends_() {
      protected_ = new byte[]{6, 2, 3, 4};
   }

   public rrfw_3 case_() {
      return (rrfw_3)this.class_[5];
   }

   private static void implements_() {
      break_ = new short[]{5, 2, 0, 2, 3, 0, 0, 2, 0, 2, 0, 3, 4, 5, 1, 4, 5, 1, 1, 4, 5, 0, 1, 2, 3, 4, 5, 0, 1};
   }

   public boolean protected_() {
      return (Boolean)this.class_[4];
   }

   private static void private_() {
      byte_ = new boolean[]{true, true, false, false, true, false, false, false, false};
   }
}
