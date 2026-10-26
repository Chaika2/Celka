package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ClanUpgrader extends Module implements rrnF_2 {
   private static byte[] protected_;
   private static String[] throws_;
   private static boolean[] catch_;
   private static double[] private_;
   private static short[] implements_;
   public static Object[] break_;
   private static float[] finally_;
   public Object[] byte_;

   public ClanUpgrader() {
      super("Clan Upgrader", "Помогает в улучшении клана на\nFuntime", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.this_();
      rrTT var5 = new rrTT(this);
      this.byte_[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
      }
   }

   private void class_(rff_3 var1, rpm_3 var2) {
      ((Ax_1)import_.class_[55]).package_();
      ((Ax_1)import_.class_[55]).break_((cb_3)import_.class_[57], (gm_3)import_.class_[56], var2, var1);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -596591421;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4343885293657940403L;
   }

   @Override
   public void class_(boolean var1) {
      if (this.try_() == -1) {
         this.new_();
      } else {
         super.class_(var1);
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.this_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         int var2 = this.try_();
         if (var2 == -1) {
            ((rrTT)this.byte_[0]).final_();
            return;
         }

         Set var3 = this.continue_();
         if (!var3.isEmpty()) {
            rfH_2 var4 = (rfH_2)var3.iterator().next();
            ((rrTT)this.byte_[0]).class_(var4, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
         } else {
            ((rrTT)this.byte_[0]).class_(((cb_3)import_.class_[57]).Bs(), (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
         }

         if (((cb_3)import_.class_[57]).return_()) {
            return;
         }

         if (Ph_1.class_((cb_3)import_.class_[57], ((rrTT)this.byte_[0]).byte_(), (double)((Ax_1)import_.class_[55]).byte_()) instanceof rff_3 var5
            && var5.byte_() == rjM_2.BLOCK) {
            rpr_3 var6 = var5.break_();
            if (var6 == rpr_3.UP) {
               rfH_2 var7 = var5.class_();
               xc_3 var8 = ((gm_3)import_.class_[56]).byte_(var7);
               if (var8.catch_()) {
                  return;
               }

               boolean var9 = catch_[0];
               if (var2 >= 0) {
                  rrfo_3.class_(var2);
                  var9 = true;
               }

               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZx_1(var2 == -3 ? rpm_3.OFF_HAND : rpm_3.MAIN_HAND, var5));
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZb_1(rZM.START_DESTROY_BLOCK, var7.final_(), var6));
               ((cb_3)import_.class_[57]).class_(rpm_3.MAIN_HAND);
               if (var9) {
                  rrfo_3.class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
               }
            }
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-103, 93, 32, -67, 127, -21, -128, 93}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public float break_() {
      return -1.0F;
   }

   @Override
   public void throws_(boolean var1) {
      this.this_();
      super.throws_(var1);
      ((rrTT)this.byte_[0]).final_();
   }

   @Override
   public rrTp_1 catch_() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[0];
   }

   private static void goto_() {
      private_ = new double[]{1.0};
   }

   private Set<rfH_2> continue_() {
      Stream var1 = ((gm_3)import_.class_[56])
         .break_((cb_3)import_.class_[57], ((cb_3)import_.class_[57]).rN().class_(1.0), (var0, var1x) -> ((Predicate)break_[0]).test(var0));
      return var1.<rfl_3>map(rjC_2::class_).map(rfH_2::new).collect(Collectors.toSet());
   }

   private static void else_() {
      Object[] var0 = new Object[]{(Predicate<xc_3>)var0x -> var0x.catch_() || var0x.break_() != xu_3.rR && var0x.break_() != xu_3.ra ? catch_[4] : catch_[3]};
      break_ = var0;
   }

   private static void instanceof_() {
      finally_ = new float[]{-1.0F, -1.0F};
   }

   private void new_() {
      String var1 = "Нет факелов или редстоуна в хотбаре";
      rrfu_3.byte_(rrfu_3.class_((Module)this) + var1);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3(this.final_(), var1, 2000));
      this.byte_(false);
   }

   private static void return_() {
      throws_ = new String[]{
         new String("Clan Upgrader"), new String("Помогает в улучшении клана на\nFuntime"), new String("Нет факелов или редстоуна в хотбаре")
      };
   }

   private static void super_() {
      protected_ = new byte[]{-1, -3, -1, -1, -1, -1};
   }

   private int try_() {
      int var1 = rrfY_2.break_(rdy_3.Pu);
      int var2 = rrfY_2.break_(rdy_3.hD);
      if (var1 != -1) {
         return var1;
      } else {
         return var2 != -1 ? var2 : protected_[4];
      }
   }

   private static void while_() {
      catch_ = new boolean[]{false, true, false, true, false, false, true, true};
   }

   private static void public_() {
      implements_ = new short[]{4, 0, 0, 0, 0, 0, 0, 57, 0, 57, 57, 0, 55, 56, 57, 0, 57, 0, 57, 57, 1, 55, 55, 57, 56, 56, 57, 57, 0, 0, 2000, 0, 0};
   }

   @Override
   public float private_() {
      return -1.0F;
   }
}
