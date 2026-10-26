package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoGApple extends Module {
   private static String[] byte_;
   private static float[] protected_;
   private static short[] throws_;
   private static byte[] catch_;
   private static boolean[] private_;
   public Object[] break_;

   public AutoGApple() {
      super("Auto GApple", "Автоматически ест золотое яблоко\nпри определённом здоровье", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.new_();
      rrIm_1 var5 = new rrIm_1("Здоровье", 15.0F, 5.0F, 20.0F, 0.5F);
      this.break_[2] = var5;
      this.class_((rrIm_1)this.break_[2]);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      protected_ = new float[]{15.0F, 5.0F, 20.0F, 0.5F};
   }

   @EventTarget
   public void class_(rrAm_1 var1) {
      this.new_();
      if ((Boolean)this.break_[0] || (Boolean)this.break_[1]) {
         var1.class_(true);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 343223658;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4834134824521969145L;
   }

   @EventTarget
   public void class_(rrAR var1) {
      this.new_();
      if ((Boolean)this.break_[0]) {
         var1.class_(true);
      }
   }

   @EventTarget
   public void class_(rrAC var1) {
      this.new_();
      if (var1.break_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.break_[0]) {
         var1.class_(true);
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.new_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         Boolean var6 = false;
         this.break_[1] = var6;
         if (((cb_3)import_.class_[57]).Ss() <= ((rrIm_1)this.break_[2]).byte_()
            && !((cb_3)import_.class_[57]).sK().class_(rdy_3.hy, rdy_3.hp)
            && rrfH_2.class_((cb_3)import_.class_[57], rdy_3.hy, rdy_3.hp) != null) {
            ((Qw_1)import_.class_[20]).u.class_(true);
            Boolean var7 = true;
            this.break_[0] = var7;
         } else if ((Boolean)this.break_[0]) {
            ((Qw_1)import_.class_[20]).u.class_(false);
            Boolean var8 = false;
            this.break_[0] = var8;
            Boolean var9 = true;
            this.break_[1] = var9;
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{121, 61, 73, 7, 63, 56, -2, -4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.new_();
      super.throws_(var1);
      Boolean var6 = false;
      this.break_[1] = var6;
      if ((Boolean)this.break_[0]) {
         if (((Qw_1)import_.class_[20]).u.protected_()) {
            ((Qw_1)import_.class_[20]).u.class_(false);
         }

         Boolean var7 = false;
         this.break_[0] = var7;
      }
   }

   private static void continue_() {
      byte_ = new String[]{new String("Auto GApple"), new String("Автоматически ест золотое яблоко\nпри определённом здоровье"), new String("Здоровье")};
   }

   private static void else_() {
      catch_ = new byte[]{2, 2, 3};
   }

   private void new_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         this.break_[0] = false;
         this.break_[1] = false;
      }
   }

   private static void return_() {
      throws_ = new short[]{0, 2, 2, 0, 1, 57, 2, 57, 57, 20, 0, 0, 20, 0, 1, 0, 0, 0, 0, 1, 1, 0, 20, 20, 0};
   }

   private static void super_() {
      private_ = new boolean[]{
         false, false, true, false, true, true, true, false, false, true, true, true, true, false, false, false, false, false, true, false
      };
   }
}
