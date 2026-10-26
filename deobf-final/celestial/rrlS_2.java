package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlS_2 extends rrTF<Speed> {
   public Object[] class_;
   private static short[] break_;
   private static float[] byte_;
   private static double[] protected_;
   private static byte[] case_;
   private static boolean[] catch_;

   private static void byte_() {
      break_ = new short[]{0, 1, 0, 2, 2, 57, 17, 57, 57, 2, 6, 6, 2, 160, 2, 1, 0, 1, 57, 0, 0, 1, 57, 6, 2, 1, 57, 0, 1};
   }

   public rrlS_2(Speed var1) {
      super(var1);
      this.private_();
      rrfw_3 var6 = new rrfw_3();
      this.class_[0] = var6;
      ArrayDeque var7 = new ArrayDeque();
      this.class_[1] = var7;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5161664214949964494L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -732319033;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{117, 115, -17, 100, -72, -75, 58, -3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void class_(rrLZ var1) {
      this.private_();
      if (var1.class_() instanceof rmg_3 var2) {
         ((Queue)this.class_[1]).add(var2);
         var1.class_(true);
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.private_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         Integer var7 = (Integer)this.class_[2] + 1;
         this.class_[2] = var7;
         if (!((rqr_3)((cb_3)import_.class_[57]).break_[17]).private_ && ((cb_3)import_.class_[57]).BL()) {
            ((cb_3)import_.class_[57]).sl();
         }

         if ((Integer)this.class_[2] < 5) {
            ((rqw_3)import_.class_[6]).class_(0.1F);
         } else {
            ((rqw_3)import_.class_[6]).class_(1.3F);
         }

         if ((Integer)this.class_[2] > 160) {
            Integer var8 = 0;
            this.class_[2] = var8;
         }

         if (!((Queue)this.class_[1]).isEmpty() && ((rrfw_3)this.class_[0]).class_(500.0)) {
            ruS_2 var2 = (ruS_2)((Queue)this.class_[1]).poll();
            if (var2 != null) {
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(var2);
            }

            ((rrfw_3)this.class_[0]).class_();
         }
      }
   }

   private static void class_() {
      case_ = new byte[]{5, 3, 2};
   }

   private void break_() {
      this.private_();
      ((rqw_3)import_.class_[6]).class_(1.0F);
      Integer var5 = 0;
      this.class_[2] = var5;

      while (!((Queue)this.class_[1]).isEmpty()) {
         ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_((ruS_2<?>)((Queue)this.class_[1]).poll());
      }
   }

   private static void throws_() {
      catch_ = new boolean[]{true, false, true, false, false};
   }

   private static void case_() {
      protected_ = new double[]{500.0};
   }

   private static void protected_() {
      byte_ = new float[]{0.1F, 1.3F, 1.0F};
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         this.class_[2] = 0;
      }
   }

   @Override
   public boolean aK_() {
      if ((cb_3)import_.class_[57] != null) {
         this.break_();
      }

      return super.aK_();
   }
}
