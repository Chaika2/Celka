package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryy_1 extends rrTF<ClickPearl> implements rrnF_2 {
   private static short[] break_;
   private static byte[] byte_;
   private static float[] protected_;
   public Object[] class_;
   private static boolean[] case_;
   private static String[] catch_;
   private static long[] private_;

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1929818298;
   }

   private void int_() {
      if (this.class_ == null) {
         this.class_ = new Object[9];
         this.class_[2] = 0L;
         this.class_[3] = 0;
         this.class_[4] = 0;
         this.class_[5] = false;
         this.class_[6] = 0;
         this.class_[7] = 0;
      }
   }

   public rryy_1(ClickPearl var1) {
      super(var1);
      this.int_();
      rrfP_2 var6 = new rrfP_2();
      this.class_[0] = var6;
      rrTT var7 = new rrTT(this);
      this.class_[1] = var7;
      Integer var8 = -1;
      this.class_[4] = var8;
      Integer var9 = -1;
      this.class_[6] = var9;
      rrIk_1 var10 = new rrIk_1("Анти-блокер", false).class_(() -> this.continue_().new_() == this ? true : case_[30]);
      this.class_[8] = var10;
      var1.class_((rrIk_1)this.class_[8]);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new String[]{new String("Анти-блокер"), new String("эндер жемчуга")};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{70, 45, 71, -50, -63, -8, 122, -56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(int var1) {
      this.int_();
      if (var1 != -1) {
         int var2 = this.protected_(var1);
         if (var2 > 8) {
            Integer var7 = var2;
            this.class_[6] = var7;
            Integer var8 = 0;
            this.class_[7] = var8;
         }
      }

      this.instanceof_();
      Boolean var9 = false;
      this.class_[5] = var9;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3198326777605220298L;
   }

   @EventTarget
   public void class_(rrAY var1) {
      this.int_();
      if (((rrIk_1)this.class_[8]).class_()) {
         if ((Boolean)this.class_[5] && var1.class_() == rpm_3.OFF_HAND) {
            var1.class_(true);
         }

         if (var1.break_().break_() instanceof rxt_3) {
            rjG_2 var3 = (rjG_2)import_.class_[64];
            if (var3 instanceof rff_3 var2 && ((gm_3)import_.class_[56]).byte_(var2.class_()).byte_() != QP.class_) {
               var1.class_(true);
            }
         }
      }
   }

   @EventTarget
   public void class_(rrLB var1) {
      this.int_();
      ClickPearl var2 = this.continue_();
      boolean var3 = var1.break_() == var2.continue_().finally_().byte_() ? true : case_[2];
      if (((rrIk_1)this.class_[8]).class_() && var1.break_() == 1 && ((cb_3)import_.class_[57]).ss().break_() instanceof rxt_3) {
         var3 = true;
      }

      if (var3) {
         int var4 = rrfY_2.class_(rdy_3.Jm, false, true);
         rryp_1 var5 = this.break_(var4);
         if (var5 == (rryp_1)rryp_1.staticFields1677081b7d6b3f3aa7e7dec6b87c7532[2]) {
            int var6 = ((cb_3)import_.class_[57]).sK().protected_(rdy_3.Jm);
            float var7 = (float)var6 / 20.0F;
            rrfu_3.class_(var2, "эндер жемчуга", var7);
         } else if (var5 == (rryp_1)rryp_1.staticFields1677081b7d6b3f3aa7e7dec6b87c7532[0]) {
            this.public_();
            Boolean var12 = true;
            this.class_[5] = var12;
         }
      }
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.int_();
      ((rrfP_2)this.class_[0]).class_(var1);
   }

   @EventTarget(
      id_class = 200
   )
   public void class_(q_1 var1) {
      this.int_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.class_[0]).class_(System.currentTimeMillis() - this.class_[2] > 200L ? true : case_[11]);
         label31:
         if ((Boolean)this.class_[5]) {
            int var2 = rrfY_2.class_(rdy_3.Jm, false, true);
            int var3 = this.while_();
            if (var3 > 0) {
               ((rrTT)this.class_[1])
                  .class_(
                     (rrTg_1)() -> new PX((Float)((cb_3)import_.class_[57]).break_[45], (Float)((cb_3)import_.class_[57]).break_[46]),
                     (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]
                  );
            }

            if (var3 != 0) {
               int var10002 = (Integer)this.class_[3] + 1;
               Integer var8 = var10002;
               this.class_[3] = var8;
               if (var10002 < var3) {
                  break label31;
               }
            }

            this.class_(var2);
            if (var3 != 0) {
               ((rrTT)this.class_[1]).final_();
               ((rrTT)this.class_[1]).finally_();
            }

            Integer var9 = 0;
            this.class_[3] = var9;
         }

         if ((Integer)this.class_[6] != -1) {
            int var13 = (Integer)this.class_[7] + 1;
            Integer var10 = var13;
            this.class_[7] = var10;
            if (var13 > 2) {
               ((Ax_1)import_.class_[55]).class_((Integer)this.class_[6]);
               Integer var11 = -1;
               this.class_[6] = var11;
               Integer var12 = 0;
               this.class_[7] = var12;
            }
         }
      }
   }

   private rryp_1 break_(int var1) {
      if (var1 == -1) {
         return (rryp_1)rryp_1.staticFields1677081b7d6b3f3aa7e7dec6b87c7532[1];
      } else {
         return ((cb_3)import_.class_[57]).sK().class_(rdy_3.Jm)
            ? (rryp_1)rryp_1.staticFields1677081b7d6b3f3aa7e7dec6b87c7532[2]
            : (rryp_1)rryp_1.staticFields1677081b7d6b3f3aa7e7dec6b87c7532[0];
      }
   }

   @Override
   public float break_() {
      return -1.0F;
   }

   @Override
   public rrTp_1 catch_() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3];
   }

   private int goto_() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var1).break_() != rdy_3.Jm) {
            return var1;
         }
      }

      return byte_[19];
   }

   private void instanceof_() {
      this.int_();
      if ((Integer)this.class_[4] != -1) {
         ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_ = (Integer)this.class_[4];
         Integer var5 = -1;
         this.class_[4] = var5;
      }
   }

   private static void new_() {
      protected_ = new float[]{20.0F, -1.0F, -1.0F};
   }

   private static void return_() {
      break_ = new short[]{
         0,
         1,
         4,
         6,
         8,
         8,
         8,
         57,
         2,
         57,
         0,
         5,
         8,
         5,
         64,
         56,
         0,
         0,
         0,
         2,
         5,
         1,
         0,
         3,
         3,
         1,
         1,
         3,
         6,
         7,
         7,
         55,
         6,
         6,
         7,
         1,
         57,
         2,
         0,
         6,
         7,
         5,
         57,
         57,
         57,
         57,
         1,
         0,
         57,
         1,
         55,
         57,
         2,
         8,
         64,
         56,
         57,
         57,
         1,
         4,
         57,
         1,
         55,
         57,
         56,
         8,
         64,
         56,
         3,
         3,
         4,
         57,
         1,
         4,
         4,
         57,
         1,
         3,
         5,
         6,
         7,
         1,
         57,
         45,
         57,
         46
      };
   }

   private static void try_() {
      case_ = new boolean[]{
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false
      };
   }

   private int while_() {
      this.int_();
      if (((rrIk_1)this.class_[8]).class_()) {
         rjG_2 var2 = (rjG_2)import_.class_[64];
         if (var2 instanceof rff_3 var1 && ((gm_3)import_.class_[56]).byte_(var1.class_()).byte_() != QP.class_) {
            return 1;
         }
      }

      return (C_volatile)rrTT.break_[3] instanceof rrTT && ((C_volatile)rrTT.break_[3]).byte_() != null ? 2 : case_[25];
   }

   private void public_() {
      this.int_();
      if (((rrIk_1)this.class_[8]).class_()) {
         rjG_2 var2 = (rjG_2)import_.class_[64];
         if (var2 instanceof rff_3 var1) {
            rfH_2 var9 = var1.class_();
            if (((gm_3)import_.class_[56]).byte_(var9).byte_() != QP.class_) {
               if (((cb_3)import_.class_[57]).ss().break_() instanceof rxt_3) {
                  Integer var8 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_;
                  this.class_[4] = var8;
                  int var3 = this.goto_();
                  if (var3 != -1) {
                     ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_ = var3;
                  }
               }

               ((Ax_1)import_.class_[55]).class_((cb_3)import_.class_[57], (gm_3)import_.class_[56], rpm_3.MAIN_HAND, var1);
            }
         }
      }
   }

   private int protected_(int var1) {
      this.int_();
      if (var1 == -2) {
         rrfo_3.class_(rpm_3.MAIN_HAND);
         ((cb_3)import_.class_[57]).class_(rpm_3.MAIN_HAND, false);
         return var1;
      } else if (var1 == -3) {
         rrfo_3.class_(rpm_3.OFF_HAND);
         ((cb_3)import_.class_[57]).class_(rpm_3.OFF_HAND, false);
         return var1;
      } else if (var1 >= 0 && var1 < 9) {
         rrfo_3.class_(var1);
         rrfo_3.class_(rpm_3.MAIN_HAND);
         ((cb_3)import_.class_[57]).class_(rpm_3.MAIN_HAND, false);
         rrfo_3.class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         return var1;
      } else if (var1 >= 9 && var1 <= 36) {
         ((rrfP_2)this.class_[0]).class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         ((Ax_1)import_.class_[55]).class_(var1);
         rrfo_3.class_(rpm_3.MAIN_HAND);
         ((cb_3)import_.class_[57]).class_(rpm_3.MAIN_HAND, false);
         Long var6 = System.currentTimeMillis();
         this.class_[2] = var6;
         return var1;
      } else {
         return byte_[13];
      }
   }

   @Override
   public float private_() {
      return -1.0F;
   }

   private static void final_() {
      byte_ = new byte[]{-1, -1, -1, 2, -1, -1, -1, 8, -2, -3, 9, 9, 36, -1, -1, 2, -1, -1, 9, -1, -1, 9, 2, 3, 4, 5, 6, 7};
   }

   private static void synchronized_() {
      private_ = new long[]{200L, 0L};
   }

   @Override
   public boolean aK_() {
      this.int_();
      Boolean var5 = false;
      this.class_[5] = var5;
      Integer var6 = -1;
      this.class_[6] = var6;
      Integer var7 = 0;
      this.class_[7] = var7;
      ((rrTT)this.class_[1]).final_();
      return super.aK_();
   }
}
