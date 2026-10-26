package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrlb_3 extends rrTF<Spider> implements rrnF_2 {
   private static boolean[] break_;
   private static float[] byte_;
   private static byte[] protected_;
   private static short[] case_;
   private static String[] catch_;
   private static double[] private_;
   public Object[] class_;

   private void int_() {
      Spider var1 = this.continue_();
      String var2 = "Не найдено морской травы в инвентаре";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3(var1.final_(), var2, 2000));
      rrfu_3.byte_(rrfu_3.class_((Module)var1) + var2);
   }

   public rrlb_3(Spider var1) {
      super(var1);
      this.else_();
      rrTT var6 = new rrTT(this);
      this.class_[0] = var6;
      rrmi_3 var7 = new rrmi_3();
      this.class_[1] = var7;
   }

   static {
      ntfClinit();
   }

   private Pair<rfl_3, rjU_2> this_() {
      rjU_2 var1 = null;
      List var2 = ((gm_3)import_.class_[56]).break_((cb_3)import_.class_[57], ((cb_3)import_.class_[57]).rN().byte_(0.01F, 0.0, 0.01F), (var0, var1x) -> {
         if (var0.byte_().throws_()) {
            return false;
         } else {
            return var0.byte_().class_() ? false : var0.byte_().break_();
         }
      }).sorted((var0, var1x) -> {
         rjU_2 var2x = var0.class_().rr();
         rjU_2 var3x = var1x.class_().rr();
         rjU_2 var4x = ((cb_3)import_.class_[57]).Ps();
         return Double.compare(var4x.case_(var2x), var4x.case_(var3x));
      }).toList();
      rfl_3 var3 = null;
      if (!var2.isEmpty()) {
         var3 = ((rjC_2)var2.get(0)).class_();
         double var4 = var3.break_;
         double var6 = 0.5;
         if (((cb_3)import_.class_[57]).h() && var3.byte_() > var6) {
            var4 += var6;
         }

         var1 = new rjU_2(var3.class_, var4, var3.byte_);
      }

      return var3 == null ? null : Pair.of(var3, var1);
   }

   private int class_(rff_3 var1, int var2) {
      this.else_();
      int var3 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_;
      if (var2 == -2) {
         this.class_(var1, rpm_3.MAIN_HAND);
         return var2;
      } else if (var2 == -3) {
         this.class_(var1, rpm_3.OFF_HAND);
         return var2;
      } else if (var2 >= 0 && var2 < 9) {
         ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_ = var2;
         this.class_(var1, rpm_3.MAIN_HAND);
         ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_ = var3;
         return var2;
      } else if (var2 >= 9 && var2 <= 36) {
         if (!((rrmi_3)this.class_[1]).class_()) {
            rdn_3 var4 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var2);
            ((rrmi_3)this.class_[1]).class_(var4, var2);
            ((Ax_1)import_.class_[55])
               .class_(
                  ((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_,
                  var2,
                  ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_,
                  rXa_1.SWAP,
                  var4
               );
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
         }

         return protected_[11];
      } else {
         return protected_[12];
      }
   }

   @EventTarget
   public void class_(rrAo_1 var1) {
      this.else_();
      if ((Boolean)this.class_[4]) {
         var1.break_(true);
         ((cb_3)import_.class_[57]).sl();
         Boolean var6 = false;
         this.class_[4] = var6;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3908916578963461319L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 753919623;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, -6, -2, 58, 93, 108, -18, 66}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void class_(rff_3 var1, rpm_3 var2) {
      ((Ax_1)import_.class_[55]).package_();
      ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rZx_1(var2, var1));
   }

   @EventTarget(
      id_class = 100
   )
   public void class_(q_1 var1) {
      this.else_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         Boolean var22 = false;
         this.class_[3] = var22;
         ((rrTT)this.class_[0]).final_();
         Pair var2 = this.this_();
         if (var2 == null) {
            Integer var23 = 3;
            this.class_[5] = var23;
            return;
         }

         rjU_2 var24 = (rjU_2)var2.getRight();
         this.class_[2] = var24;
         double var3 = ((rfl_3)var2.getLeft()).break_() * 0.5;
         double var5 = ((rjU_2)this.class_[2]).break_ + var3 - ((cb_3)import_.class_[57]).rx();
         double var7 = ((rjU_2)this.class_[2]).byte_ + 0.5 - ((cb_3)import_.class_[57]).rH();
         double var9 = ((rjU_2)this.class_[2]).protected_ + var3 - ((cb_3)import_.class_[57]).BO();
         PX var11 = PJ.class_(var5, var7, var9).case_(((cb_3)import_.class_[57]).h() ? 65.0F : byte_[1]);
         ((rrTT)this.class_[0]).class_((rrTg_1)() -> var11, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
         if ((Boolean)((cb_3)import_.class_[57]).throws_[23] && rrfj_3.catch_()) {
            if (Ph_1.class_((cb_3)import_.class_[57], var11, (double)((Ax_1)import_.class_[55]).byte_()) instanceof rff_3 var13) {
               rfH_2 var14 = var13.class_();
               xc_3 var15 = ((gm_3)import_.class_[56]).byte_(var14);
               if (!var15.catch_()) {
                  int var16 = this.public_();
                  if (var16 != -1) {
                     Boolean var25 = true;
                     this.class_[3] = var25;
                     if ((Integer)this.class_[5] < 3) {
                        Integer var26 = (Integer)this.class_[5] + 1;
                        this.class_[5] = var26;
                     }

                     int var17 = this.class_(var13, var16);
                     if (var17 != -1 && (Integer)this.class_[5] == 3) {
                        Boolean var27 = true;
                        this.class_[4] = var27;
                        Integer var28 = 0;
                        this.class_[5] = var28;
                     }
                  }
               }
            } else {
               Integer var29 = 3;
               this.class_[5] = var29;
            }
         }
      }
   }

   @Override
   public float break_() {
      return -1.0F;
   }

   @Override
   public rrTp_1 catch_() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[0];
   }

   private static void goto_() {
      protected_ = new byte[]{3, -1, 3, -1, 3, 3, -2, -3, 9, 9, 36, -1, -1, -1, 3, -1, -2, -3, 36, -1, 6, 3, 4, 5};
   }

   private void else_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         this.class_[3] = false;
         this.class_[4] = false;
         this.class_[5] = 0;
      }
   }

   private static void new_() {
      byte_ = new float[]{65.0F, 74.2F, -1.0F, -1.0F};
   }

   private static void package_() {
      private_ = new double[]{0.5, 0.5, 0.01F, 0.0, 0.01F, 0.5};
   }

   private static void return_() {
      case_ = new short[]{
         0,
         1,
         0,
         3,
         0,
         5,
         2,
         2,
         57,
         2,
         57,
         2,
         57,
         57,
         0,
         0,
         57,
         23,
         57,
         55,
         56,
         3,
         5,
         5,
         5,
         5,
         4,
         5,
         5,
         56,
         57,
         57,
         57,
         4,
         57,
         4,
         57,
         1,
         57,
         1,
         57,
         1,
         1,
         57,
         1,
         1,
         55,
         57,
         4,
         57,
         1,
         0,
         55,
         57,
         0,
         57,
         56,
         0,
         0,
         2,
         3,
         5,
         1,
         1,
         1,
         55,
         57,
         4,
         1,
         0,
         1,
         0,
         2000,
         57,
         57,
         57,
         1,
         0,
         3,
         57
      };
   }

   private static void while_() {
      break_ = new boolean[]{false, true, true, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false};
   }

   private int public_() {
      if (rrjS_2.byte_(((cb_3)import_.class_[57]).ss())) {
         return -2;
      } else if (rrjS_2.byte_(((cb_3)import_.class_[57]).Sn())) {
         return -3;
      } else {
         for (int var1 = break_[13]; var1 < 36; var1++) {
            rdn_3 var2 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var1);
            if (rrjS_2.byte_(var2)) {
               return var1;
            }
         }

         return protected_[19];
      }
   }

   @Override
   public float private_() {
      return -1.0F;
   }

   public boolean final_() {
      this.else_();
      return (Boolean)this.class_[3];
   }

   private static void synchronized_() {
      catch_ = new String[]{new String("Не найдено морской травы в инвентаре")};
   }

   @Override
   public boolean aI_() {
      if ((cb_3)import_.class_[57] != null && (gm_3)import_.class_[56] != null) {
         int var1 = this.public_();
         if (var1 == -1) {
            this.int_();
            this.continue_().volatile_();
            return false;
         } else {
            return super.aI_();
         }
      } else {
         return break_[8];
      }
   }

   @Override
   public boolean aK_() {
      this.else_();
      ((rrTT)this.class_[0]).final_();
      ((rrTT)this.class_[0]).finally_();
      Object var7 = null;
      this.class_[2] = var7;
      Boolean var8 = false;
      this.class_[3] = var8;
      Integer var9 = 3;
      this.class_[5] = var9;
      if (((rrmi_3)this.class_[1]).class_()) {
         int var1 = ((rrmi_3)this.class_[1]).break_();
         int var2 = ((rrmi_3)this.class_[1]).class_(false);
         if (var2 != -1) {
            ((Ax_1)import_.class_[55])
               .class_(((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_, var1, var2, rXa_1.SWAP, ((rrmi_3)this.class_[1]).byte_());
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
         }
      }

      ((rrmi_3)this.class_[1]).throws_();
      return super.aK_();
   }
}
