package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BlocksLift extends Module implements rrnZ_2 {
   private static byte[] byte_;
   private static double[] protected_;
   private static short[] throws_;
   public Object[] break_;
   private static boolean[] catch_;
   private static String[] private_;

   public BlocksLift() {
      super("Blocks Lift", "Позволяет подниматься в блоках", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.super_();
      rrIQ var5 = new rrIQ("Режим", "Packet", "Packet", "Glide", "Matrix");
      this.break_[0] = var5;
      rrfw_3 var6 = new rrfw_3();
      this.break_[1] = var6;
      this.class_((rrIQ)this.break_[0]);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      protected_ = new double[]{0.0, 0.0, -0.01, 150.0, 0.42, 300.0, 0.42};
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.super_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         String var2 = ((rrIQ)this.break_[0]).byte_();
         switch (var2) {
            case "Glide":
               if (((cb_3)import_.class_[57]).BW() && !((cb_3)import_.class_[57]).class_(QP.class_) && ((rqr_3)((cb_3)import_.class_[57]).break_[17]).private_) {
                  if ((Integer)((cb_3)import_.class_[57]).throws_[41] % 2 == 0) {
                     ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rZO(true));
                  }

                  if (((cb_3)import_.class_[57]).BL()) {
                     ((cb_3)import_.class_[57]).sl();
                  } else {
                     ((cb_3)import_.class_[57]).rv().break_ = 0.0;
                     ((cb_3)import_.class_[57]).rv().protected_ = 0.0;
                     ((cb_3)import_.class_[57]).rv().byte_ = -0.01;
                  }
               }
               break;
            case "Packet":
               if (((cb_3)import_.class_[57]).BW()
                  && !((cb_3)import_.class_[57]).BL()
                  && !((cb_3)import_.class_[57]).class_(QP.class_)
                  && ((rqr_3)((cb_3)import_.class_[57]).break_[17]).private_) {
                  rrfj_3.class_(true);
                  if (((rrfw_3)this.break_[1]).class_(150.0)) {
                     ((cb_3)import_.class_[57]).rv().byte_ = 0.42;
                     ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZO(true));
                  }

                  if (((rrfw_3)this.break_[1]).class_(300.0)) {
                     ((rrfw_3)this.break_[1]).class_();
                  }

                  Boolean var8 = true;
                  this.break_[2] = var8;
               } else if ((Boolean)this.break_[2]) {
                  Boolean var9 = false;
                  this.break_[2] = var9;
               }
               break;
            case "Matrix":
               if (((cb_3)import_.class_[57]).BW() && ((rqr_3)((cb_3)import_.class_[57]).break_[17]).private_) {
                  rrIU.class_();
                  ((cb_3)import_.class_[57]).rv().byte_ = 0.42;
                  if ((Integer)((cb_3)import_.class_[57]).throws_[41] % 2 == 0) {
                     ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rZO(true));
                  }
               }
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7426730992217074188L;
   }

   @Override
   public void class_() {
      this.byte_(false);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1201437588;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-127, -15, -85, 80, -44, 41, 118, 91}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.super_();
      super.throws_(var1);
      Boolean var6 = false;
      this.break_[2] = var6;
      ((rrfw_3)this.break_[1]).class_();
   }

   private static void continue_() {
      byte_ = new byte[]{3, 2, -1, 2, 2, 2, 3, 2};
   }

   private static void else_() {
      catch_ = new boolean[]{false, true, false, true, true, true, true, true, false, true, false, false, false};
   }

   private static void new_() {
      throws_ = new short[]{
         1,
         0,
         1,
         0,
         0,
         0,
         57,
         57,
         57,
         17,
         57,
         41,
         57,
         0,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         17,
         1,
         57,
         57,
         0,
         1,
         1,
         2,
         2,
         2,
         57,
         57,
         17,
         57,
         57,
         41,
         57,
         0,
         2,
         1
      };
   }

   private static void return_() {
      private_ = new String[]{
         new String("Blocks Lift"),
         new String("Позволяет подниматься в блоках"),
         new String("Режим"),
         new String("Packet"),
         new String("Packet"),
         new String("Glide"),
         new String("Matrix"),
         new String("Glide"),
         new String("Packet"),
         new String("Matrix")
      };
   }

   private void super_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         this.break_[2] = false;
      }
   }
}
