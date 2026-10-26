package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlB_2 extends rrTF<Speed> {
   private static boolean[] break_;
   private static float[] byte_;
   private static byte[] protected_;
   private static double[] case_;
   public Object[] class_;
   private static String[] catch_;
   private static short[] private_;

   private static void byte_() {
      case_ = new double[]{0.2, 0.5, 0.2, 1.0, 1.0};
   }

   public rrlB_2(Speed var1) {
      super(var1);
      this.extends_();
      Setting[] var10001 = new Setting[6];
      rrIk_1 var6;
      rrIk_1 var10004 = var6 = new rrIk_1("Автоматический прыжок", true).class_(() -> var1.new_() == this ? true : break_[32]);
      this.class_[0] = var6;
      var10001[0] = var10004;
      rrIk_1 var7;
      var10004 = var7 = new rrIk_1("Кружить вокруг цели", true).class_(() -> var1.new_() == this ? true : break_[30]);
      this.class_[1] = var7;
      var10001[1] = var10004;
      rrIk_1 var8;
      var10004 = var8 = new rrIk_1("Предикт позиции", true).class_(() -> {
         this.extends_();
         return var1.new_() == this && ((rrIk_1)this.class_[1]).class_() ? true : break_[28];
      });
      this.class_[2] = var8;
      var10001[2] = var10004;
      rrIm_1 var9;
      rrIm_1 var14 = var9 = new rrIm_1("Сила предикта", 1.5F, 1.1F, 2.0F, 0.1F).class_(() -> {
         this.extends_();
         return var1.new_() == this && ((rrIk_1)this.class_[1]).class_() && ((rrIk_1)this.class_[2]).class_() ? true : break_[26];
      });
      this.class_[3] = var9;
      var10001[3] = var14;
      rrIk_1 var10;
      var10004 = var10 = new rrIk_1("Останавливать при\nиспользовании предмета", true).class_(() -> var1.new_() == this ? true : break_[24]);
      this.class_[5] = var10;
      var10001[4] = var10004;
      rrIk_1 var11;
      var10004 = var11 = new rrIk_1("Только с оружием", false).class_(() -> var1.new_() == this ? true : break_[22]);
      this.class_[4] = var11;
      var10001[5] = var10004;
      var1.class_(var10001);
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrAO var1) {
      this.extends_();
      if ((Boolean)this.class_[6]) {
         iB_2 var2 = this.break_();
         if (var2 != null) {
            if (((rrIk_1)this.class_[0]).class_() && ((cb_3)import_.class_[57]).BL()) {
               var1.break_(true);
            }

            if (this.class_()) {
               var1.class_(1.0);
            }

            if (((rrIk_1)this.class_[1]).class_() && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().P().super_()) {
               rjU_2 var3 = var2.Ps();
               if (((rrIk_1)this.class_[2]).class_()) {
                  float var4 = ((rrIm_1)this.class_[3]).byte_();
                  var3 = var3.extends_();
                  rjU_2 var5 = var3.protected_(var2.Pt());
                  var3 = var3.throws_(var5.throws_((double)var4, 1.0, (double)var4));
               }

               rrfj_3.class_(var1, var3, (Float)((cb_3)import_.class_[57]).throws_[15]);
            }
         }
      }
   }

   @EventTarget
   public void class_(rrAx_1 var1) {
      this.extends_();
      if ((Boolean)this.class_[6] && var1.class_() == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[1] && this.break_() != null) {
         var1.class_(true);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5353216560068535656L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-81, -23, 51, -28, -107, 88, 126, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean class_() {
      this.extends_();
      return (Boolean)this.class_[7];
   }

   @EventTarget
   public void class_(rrLx_1 var1) {
      this.extends_();
      if ((Boolean)this.class_[6]
         && this.class_()
         && this.break_() != null
         && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().P().super_()) {
         var1.break_(true);
      }
   }

   @EventTarget(
      id_class = 200
   )
   public void class_(q_1 var1) {
      this.extends_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         Boolean var8 = this.case_();
         this.class_[6] = var8;
         if (!(Boolean)this.class_[6]) {
            return;
         }

         rfl_3 var2 = ((cb_3)import_.class_[57]).rN().byte_(0.2, 0.5, 0.2);
         List var3 = ((gm_3)import_.class_[56]).break_((cb_3)import_.class_[57], var2, var0 -> !var0.native_() && var0.BM() && var0.rY() ? true : break_[20]);
         if (!var3.isEmpty()) {
            cb_3 var10000 = (cb_3)import_.class_[57];
            Float var9 = (Float)((cb_3)import_.class_[57]).private_[29] + 0.14F;
            var10000.private_[29] = var9;
            Boolean var10 = true;
            this.class_[7] = var10;
         }
      } else if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[1]) {
         Boolean var11 = false;
         this.class_[7] = var11;
      }
   }

   @EventTarget
   public void class_(rrAS var1) {
      this.extends_();
      if ((Boolean)this.class_[6] && this.break_() != null) {
         var1.class_(0);
      }
   }

   @EventTarget
   public void class_(rrAB var1) {
      this.extends_();
      if ((Boolean)this.class_[6] && this.class_() && ((rrIk_1)this.class_[5]).class_()) {
         var1.class_(true);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -70159987;
   }

   public iB_2 break_() {
      return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().E().continue_();
   }

   private static void throws_() {
      private_ = new short[]{
         0, 1, 2, 3, 5, 4, 0, 6, 6, 57, 56, 57, 57, 29, 29, 7, 1, 7, 6, 0, 57, 1, 0, 2, 3, 57, 15, 6, 0, 6, 5, 6, 1, 6, 5, 57, 57, 4, 7, 6, 0, 7, 1, 2, 1
      };
   }

   private static void finally_() {
      byte_ = new float[]{1.5F, 1.1F, 2.0F, 0.1F, 0.14F};
   }

   private void extends_() {
      if (this.class_ == null) {
         this.class_ = new Object[8];
         this.class_[6] = false;
         this.class_[7] = false;
      }
   }

   private boolean case_() {
      this.extends_();
      if (((rrIk_1)this.class_[5]).class_() && ((cb_3)import_.class_[57]).return_()) {
         return false;
      } else {
         rdb_3 var1 = ((cb_3)import_.class_[57]).ss().break_();
         return ((rrIk_1)this.class_[4]).class_() && !(var1 instanceof rkx_3) && !(var1 instanceof rxM_2) ? false : break_[16];
      }
   }

   private static void implements_() {
      catch_ = new String[]{
         new String("Автоматический прыжок"),
         new String("Кружить вокруг цели"),
         new String("Предикт позиции"),
         new String("Сила предикта"),
         new String("Останавливать при\nиспользовании предмета"),
         new String("Только с оружием")
      };
   }

   private static void protected_() {
      protected_ = new byte[]{6, 2, 3, 4, 5, 8, 6, 7};
   }

   private static void private_() {
      break_ = new boolean[]{
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false
      };
   }

   @Override
   public boolean aK_() {
      this.extends_();
      Boolean var5 = false;
      this.class_[7] = var5;
      Boolean var6 = false;
      this.class_[6] = var6;
      return super.aK_();
   }
}
