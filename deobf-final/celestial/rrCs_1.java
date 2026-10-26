package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCs_1 extends rrnK_2 {
   private static boolean[] case_;
   private static double[] catch_;
   public Object[] byte_;
   private static String[] private_;
   public static Object[] protected_;
   private static short[] implements_;
   private static byte[] finally_;
   private static float[] extends_;

   @Override
   public float byte_() {
      this.instanceof_();
      return this.byte_[0] ? -1.0F : extends_[18];
   }

   @Override
   public float int_() {
      this.instanceof_();
      return this.byte_[0] ? -1.0F : extends_[20];
   }

   public rrCs_1(AttackAura var1) {
      super(var1, class_(var1));
      this.instanceof_();
      Float var6 = 1.0F;
      this.byte_[1] = var6;
      rrTH var7 = (var1x, var2, var3) -> {
         this.instanceof_();
         float var4 = rfU_2.catch_(var2 - var1x);
         float var5 = this.while_();
         float var6x = (float)Math.sin((double)var5 * Math.PI);
         float var7x = var1x + var4 * var6x;
         if ((Float)this.byte_[1] < 1.0F) {
            if (!(Boolean)this.byte_[5]) {
               Float var13 = var7x;
               this.byte_[3] = var13;
               Boolean var14 = true;
               this.byte_[5] = var14;
            }

            float var8x = Math.min((Float)this.byte_[1] + (float)(Math.random() / 20.0), 1.0F);
            return var1x + ((Float)this.byte_[3] - var1x) * var8x;
         } else {
            return var7x;
         }
      };
      this.byte_[7] = var7;
      rrTH var8 = (var1x, var2, var3) -> {
         this.instanceof_();
         float var4 = var2 - var1x;
         float var5 = this.while_();
         float var6x = (float)Math.sin((double)var5 * Math.PI);
         float var7x = var1x + var4 * var6x;
         if ((Float)this.byte_[1] < 1.0F) {
            if (!(Boolean)this.byte_[6]) {
               Float var13 = var7x;
               this.byte_[4] = var13;
               Boolean var14 = true;
               this.byte_[6] = var14;
            }

            float var8x = Math.min((Float)this.byte_[1] + (float)(Math.random() / 20.0), 1.0F);
            return var1x + ((Float)this.byte_[4] - var1x) * var8x;
         } else {
            return var7x;
         }
      };
      this.byte_[8] = var8;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      private_ = new String[]{
         new String(
            ".*(snow|banner|sign|step|frame|conduit|bamboo|anvil|chipped_anvil|damaged_anvil|nether_brick_wall|grindstone|stonecutter|lantern|soul_lantern|campfire|soul_campfire|daylight_detector|lectern|brewing_stand|cauldron|table|slab|stair|chest|ladder|vine|waterlily|wall|chain|carpet|pane|fence|fence_gate|gate|rod|bed|skull|pot|hopper|door|bars|piston|lily|plate|farm|path).*"
         )
      };
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 87498120;
   }

   @Override
   public void class_(q_1 var1) {
      this.instanceof_();
      super.class_(var1);
      AttackAura var2 = this.continue_();
      rrnD_2 var3 = var2.long_();
      iB_2 var4 = var2.continue_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (var4 != null && !(Boolean)this.byte_[2]) {
            Float var9 = 0.0F;
            this.byte_[1] = var9;
            Boolean var10 = false;
            this.byte_[5] = var10;
            Boolean var11 = false;
            this.byte_[6] = var11;
         }

         Boolean var12 = var4 != null ? true : case_[3];
         this.byte_[2] = var12;
         if ((Float)this.byte_[1] < 1.0F) {
            Float var13 = (Float)this.byte_[1] + 0.35F;
            this.byte_[1] = var13;
            if ((Float)this.byte_[1] > 1.0F) {
               Float var14 = 1.0F;
               this.byte_[1] = var14;
            }
         }

         Boolean var15 = false;
         this.byte_[0] = var15;
         this.class_(var4, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
         if (var3.class_(var2)) {
            Boolean var16 = true;
            this.byte_[0] = var16;
            this.class_(var4, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[1]);
            this.class_(var4);
         }
      }

      var3.class_(var2, var1);
   }

   private static rrTT class_(AttackAura var0) {
      rrTT var1 = new rrTT(var0);
      var1.class_(new rrCE(var1));
      return var1;
   }

   @Override
   public boolean class_(xc_3 var1) {
      return !var1.break_().byte_ ? true : ((Set)protected_[4]).contains(var1.break_());
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7171201720677317873L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{7, 13, -99, 57, -12, 32, -113, 118}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rrTH finally_() {
      this.instanceof_();
      return (rrTH)this.byte_[7];
   }

   private static void goto_() {
      case_ = new boolean[]{
         false, false, true, false, false, true, false, true, false, false, false, true, true, false, false, true, false, false, false, false, true
      };
   }

   private static void else_() {
      Object[] var0 = new Object[]{0.0F, 0.0F, 3.689349E19F, 0.12676056, new HashSet()};
      protected_ = var0;
   }

   private void instanceof_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[9];
         this.byte_[0] = false;
         this.byte_[1] = 0.0F;
         this.byte_[2] = false;
         this.byte_[3] = 0.0F;
         this.byte_[4] = 0.0F;
         this.byte_[5] = false;
         this.byte_[6] = false;
      }
   }

   @Override
   public rrTH package_() {
      this.instanceof_();
      return (rrTH)this.byte_[8];
   }

   private static void return_() {
      finally_ = new byte[]{4, 4, 9, 2, 3, 4, 5, 6, 5, 2, 3};
   }

   private static void try_() {
      implements_ = new short[]{1, 7, 8, 0, 2, 1, 5, 6, 2, 1, 1, 1, 1, 1, 0, 0, 0, 1, 57, 57, 0, 0, 7, 8, 4, 2, 5, 6, 1, 6, 4, 6, 1, 4, 1, 5, 3, 5, 1, 3};
   }

   private float while_() {
      float var1 = ((cb_3)import_.class_[57]).class_(1.0F, false);
      double var2 = ((cb_3)import_.class_[57]).class_(iQ_2.private_);
      if (var2 > 1.6) {
         var1 *= (float)(1.6 / var2);
      }

      float var4;
      if (var2 < 2.0) {
         float var5 = 1.70158F;
         float var6 = var5 + 1.0F;
         var4 = var6 * var1 * var1 * var1 - var5 * var1 * var1;
      } else if (var1 < 0.5F) {
         var4 = 8.0F * var1 * var1 * var1 * var1;
      } else {
         float var7 = var1 - 1.0F;
         var4 = 1.0F - 8.0F * var7 * var7 * var7 * var7;
      }

      float var8 = extends_[14] + 29.0F * var4;
      return var8 / 50.0F;
   }

   private static void public_() {
      catch_ = new double[]{1.6, 1.6, 2.0, Math.PI, 20.0, Math.PI, 20.0, 0.12676056};
   }

   @Override
   public rrTf_1 protected_() {
      return null;
   }

   @Override
   public void volatile_() {
      this.instanceof_();
      super.volatile_();
      Boolean var5 = false;
      this.byte_[2] = var5;
      Boolean var6 = false;
      this.byte_[5] = var6;
      Boolean var7 = false;
      this.byte_[6] = var7;
   }

   private static void synchronized_() {
      extends_ = new float[]{
         1.0F,
         0.0F,
         1.0F,
         0.35F,
         1.0F,
         1.0F,
         1.0F,
         1.70158F,
         1.0F,
         0.5F,
         8.0F,
         1.0F,
         1.0F,
         8.0F,
         1.0F,
         29.0F,
         50.0F,
         -1.0F,
         1.0F,
         -1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.0F,
         0.0F,
         0.0F,
         30.0F,
         1.0F,
         0.35F
      };
   }
}
