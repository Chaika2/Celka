package celestial;

import com.google.common.collect.ComparisonChain;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class rrlo_3 extends rrTF<ChestStealer> implements rrnF_2 {
   private static boolean[] break_;
   private static String[] byte_;
   private static byte[] protected_;
   private static float[] case_;
   private static short[] catch_;
   public Object[] class_;

   public rrlK_2 int_() {
      this.try_();
      return (rrlK_2)this.class_[1];
   }

   public rrlo_3(ChestStealer var1) {
      super(var1);
      this.try_();
      rrTT var6 = new rrTT(this);
      this.class_[0] = var6;
      HashMap var7 = new HashMap();
      this.class_[2] = var7;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      break_ = new boolean[]{
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
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
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         false
      };
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1382124757;
   }

   private rrlK_2 class_(Collection<rrlK_2> var1) {
      if (var1.isEmpty()) {
         return null;
      } else {
         rrlK_2 var2 = this.int_();
         if (var2 != null && var1.contains(var2)) {
            return var2;
         } else {
            ArrayList var3 = new ArrayList(var1);
            var3.sort(
               (var0, var1x) -> {
                  rHu_1 var2x = var0.throws_();
                  rHu_1 var3x = var1x.throws_();
                  return ComparisonChain.start()
                     .compare(var0.break_(), var1x.break_())
                     .compare(((cb_3)import_.class_[57]).break_(var2x.char_()), ((cb_3)import_.class_[57]).break_(var3x.char_()))
                     .result();
               }
            );
            return (rrlK_2)var3.get(0);
         }
      }
   }

   private boolean class_(rfH_2 var1) {
      return ((gm_3)import_.class_[56]).byte_(var1).break_() == xu_3.re ? true : break_[23];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5547309422469480340L;
   }

   @EventTarget
   public void class_(rrLM var1) {
      this.continue_().byte_(false);
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.try_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (!this.public_()) {
            this.continue_().byte_(true);
            return;
         }

         rrNV var2 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).throws_().switch_();
         if (var2 != null) {
            return;
         }

         Ps_1 var3 = C_throws.byte_().throw_();

         for (ryO_2 var5 : ((gm_3)import_.class_[56]).case_) {
            if (var5 instanceof rHu_1) {
               rHu_1 var6 = (rHu_1)var5;
               rrlK_2 var7 = (rrlK_2)((Map)this.class_[2]).get(var6.char_());
               if (var7 == null) {
                  rrlK_2 var8 = new rrlK_2(var6);
                  if (this.class_(var3, var8.case_())) {
                     ((Map)this.class_[2]).put(var6.char_(), var8);
                  }
               }
            }
         }

         if (!((Map)this.class_[2]).isEmpty()) {
            Iterator var23 = ((Map)this.class_[2]).entrySet().iterator();

            while (var23.hasNext()) {
               Entry var25 = (Entry)var23.next();
               rrlK_2 var27 = (rrlK_2)var25.getValue();
               rfH_2 var29 = var27.case_();
               if (!this.class_(var29)) {
                  if (var27.equals(this.int_())) {
                     this.new_();
                  }

                  var23.remove();
               } else if (!this.class_(var3, var27.case_())) {
                  var23.remove();
               }
            }
         }

         Collection var24 = ((Map)this.class_[2]).values();
         this.class_(this.class_(var24));
         rrlK_2 var26 = this.int_();
         ((rrTT)this.class_[0]).final_();
         Boolean var19 = false;
         this.class_[3] = var19;
         if (var26 != null && var3 != null) {
            Optional var28 = PJ.class_(var3, var26.case_(), var0 -> var0.break_() == xu_3.re ? true : break_[34]);
            var28.ifPresent(var1x -> {
               this.try_();
               ((rrTT)this.class_[0]).class_(var1x::class_, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
            });
            Boolean var20 = true;
            this.class_[3] = var20;
            vm_3 var9 = (vm_3)import_.class_[73];
            if (var9 instanceof Fc_1 var30) {
               ((rqr_3)((cb_3)import_.class_[57]).break_[17]).finally_ = true;
               rJr_1 var32 = var30.G_();
               List var10 = var32.class_(var0 -> {
                  if (!var0.break_()) {
                     return false;
                  } else {
                     return var0.protected_ >= 9 && var0.protected_ <= 35 ? break_[32] : break_[31];
                  }
               });

               for (rJY var12 : var10) {
                  ((Ax_1)import_.class_[55]).class_(var32.case_, var12.protected_, 0, rXa_1.QUICK_MOVE, false);
               }

               int var10002 = (Integer)this.class_[4] + 1;
               Integer var21 = var10002;
               this.class_[4] = var21;
               if (var10002 > 1 && var24.size() > 1 && var10.isEmpty()) {
                  this.new_();
                  Integer var22 = 0;
                  this.class_[4] = var22;
               }
            } else if (!var26.byte_()
               && !((cb_3)import_.class_[57]).sL()
               && var28.isPresent()
               && ((Px_1)var28.get()).break_() instanceof rff_3 var31
               && this.class_(var31.class_())) {
               boolean var34 = ((cb_3)import_.class_[57]).boolean_();
               if (var34) {
                  ((rqr_3)((cb_3)import_.class_[57]).break_[17]).implements_ = false;
                  ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rmD_2((cb_3)import_.class_[57], rmU_2.RELEASE_SHIFT_KEY));
               }

               for (rpm_3 var13 : rpm_3.values()) {
                  if (var13 != rpm_3.MAIN_HAND || !((cb_3)import_.class_[57]).protected_(var13).continue_().byte_().contains("[❄]")) {
                     ryZ_2 var14 = ((Ax_1)import_.class_[55]).class_((cb_3)import_.class_[57], (gm_3)import_.class_[56], var13, var31);
                     if (var14.class_()) {
                        if (var14.break_()) {
                           ((cb_3)import_.class_[57]).class_(var13, false);
                        }
                        break;
                     }

                     if (var14 == ryZ_2.FAIL) {
                        break;
                     }
                  }
               }

               var26.class_(rqR_2.break_());
               var26.class_(true);
               if (var34) {
                  ((rqr_3)((cb_3)import_.class_[57]).break_[17]).implements_ = true;
                  ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rmD_2((cb_3)import_.class_[57], rmU_2.PRESS_SHIFT_KEY));
               }
            }
         }
      }
   }

   @EventTarget
   public void class_(RenderEvent var1) {
      this.try_();
      Ml_1 var2 = var1.class_();

      for (rrlK_2 var4 : ((Map)this.class_[2]).values()) {
         rfH_2 var5 = var4.case_();
         rfl_3 var6 = rrjc_3.class_(var4.class_(), var5).protected_((double)var5.b_(), (double)var5.c_(), (double)var5.d_());
         if (((yX_2)import_.class_[8]).static_().class_(var6)) {
            double var7 = void_.case_();
            double var9 = void_.catch_();
            double var11 = void_.private_();
            var2.class_();
            GL11.glEnable(2848);
            RenderSystem.defaultBlendFunc();
            RenderSystem.enableBlend();
            RenderSystem.lineWidth(1.5F);
            RenderSystem.disableTexture();
            RenderSystem.disableDepthTest();
            RenderSystem.depthMask(false);
            strictfp_.class_(1, ju_3.this_);
            rrfD_2.class_(var2, var6.protected_(-var7, -var9, -var11), var4 == (rrlK_2)this.class_[1] ? Color.RED.getRGB() : Color.YELLOW.getRGB());
            default_.break_();
            RenderSystem.enableTexture();
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask(true);
            RenderSystem.disableBlend();
            GL11.glDisable(2848);
            var2.break_();
         }
      }
   }

   @EventTarget
   public void class_(rrFo_1 var1) {
      rrlK_2 var2 = this.int_();
      if (var2 != null) {
         var2.class_(false);
      }
   }

   private boolean class_(Ps_1 var1, rfH_2 var2) {
      return var1 == null ? false : PJ.class_(var1, var2, var0 -> var0.break_() == xu_3.re ? true : break_[29]).isPresent();
   }

   public void class_(rrlK_2 var1) {
      this.try_();
      if (var1 == null && (rrlK_2)this.class_[1] != null) {
         ((rrTT)this.class_[0]).finally_();
      }

      this.class_[1] = var1;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-8, 123, -89, -37, 17, -94, 62, 108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
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
      catch_ = new short[]{
         0,
         2,
         0,
         0,
         56,
         2,
         2,
         2,
         2,
         2,
         0,
         3,
         3,
         73,
         57,
         17,
         55,
         4,
         4,
         4,
         57,
         57,
         57,
         17,
         57,
         0,
         57,
         57,
         55,
         57,
         56,
         57,
         57,
         17,
         57,
         0,
         57,
         2,
         8,
         2848,
         1,
         2848,
         56,
         3,
         73,
         57,
         3,
         1,
         0,
         1,
         3,
         2,
         0,
         19,
         0,
         3000,
         0,
         1,
         2,
         3,
         57,
         57,
         0,
         0
      };
   }

   private static void else_() {
      case_ = new float[]{1.5F, -1.0F, -1.0F};
   }

   private void new_() {
      this.try_();
      if ((Boolean)this.class_[3]) {
         if ((vm_3)import_.class_[73] != null) {
            ((cb_3)import_.class_[57]).strictfp_();
         }

         this.class_(null);
         Boolean var5 = false;
         this.class_[3] = var5;
      }
   }

   public boolean package_() {
      this.try_();
      return (Boolean)this.class_[3];
   }

   private static void return_() {
      protected_ = new byte[]{9, 35, 5, 3, 4};
   }

   private void try_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         this.class_[3] = false;
         this.class_[4] = 0;
      }
   }

   private void while_() {
      this.try_();
      this.class_(null);
      Boolean var5 = false;
      this.class_[3] = var5;
      ((Map)this.class_[2]).clear();
      ((rrTT)this.class_[0]).final_();
   }

   private boolean public_() {
      return ((cq_3)import_.class_[19]).extends_().class_("Экспресс - ");
   }

   @Override
   public float private_() {
      return -1.0F;
   }

   public Map<rfH_2, rrlK_2> final_() {
      this.try_();
      return (Map<rfH_2, rrlK_2>)this.class_[2];
   }

   private static void synchronized_() {
      byte_ = new String[]{new String("[❄]"), new String("Экспресс - "), new String("Работает только на событии \"Новогодний Экспресс\"")};
   }

   @Override
   public boolean aI_() {
      if (!this.public_()) {
         String var1 = "Работает только на событии \"Новогодний Экспресс\"";
         rrfu_3.byte_(rrfu_3.class_(this.continue_()) + var1);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3(this.continue_().final_(), var1, 3000));
         this.continue_().byte_(false);
         return false;
      } else {
         return super.aI_();
      }
   }

   @Override
   public boolean aK_() {
      this.while_();
      return super.aK_();
   }
}
