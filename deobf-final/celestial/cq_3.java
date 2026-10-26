package celestial;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

public class cq_3 extends ch_3 {
   private static final rqO_2 throws_ = new rqO_2("textures/misc/vignette.png");
   private static final rqO_2 case_ = new rqO_2("textures/gui/widgets.png");
   private static final rqO_2 catch_ = new rqO_2("textures/misc/pumpkinblur.png");
   private static final rgP_2 private_ = new rgn_3("demo.demoExpired");
   private final Random implements_ = new Random();
   private final QY finally_;
   private final Hz_1 extends_;
   private final cI_2 native_;
   private int volatile_;
   private rgP_2 final_;
   private int package_;
   private boolean int_;
   private boolean new_;
   public float class_ = 1.0F;
   private int continue_;
   private rdn_3 super_ = rdn_3.break_;
   private final uV_2 this_;
   private final uo_3 else_;
   private final cY_2 synchronized_;
   private final uR_2 return_;
   private final uj_3 public_;
   private int goto_;
   private rgP_2 while_;
   private rgP_2 try_;
   private int instanceof_;
   private int throw_;
   private int interface_;
   private int char_;
   private int abstract_;
   private long long_;
   private long float_;
   private int void_;
   private int static_;
   private int import_;
   private final Map<rVU, List<ur_3>> short_ = Maps.newHashMap();
   private final Set<String> default_ = new HashSet<>();
   private rnP_2 const_;

   private void byte_(Ml_1 var1) {
      Qw_1 var2 = (Qw_1)this.finally_.class_[20];
      if ((var2.volatile_().class_() || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().K().aJ_())
         && (((Ax_1)this.finally_.class_[55]).native_() != rRl_1.SPECTATOR || this.class_((rjG_2)this.finally_.class_[64]))) {
         if (var2.R && !var2.g && !((cb_3)this.finally_.class_[57]).sW() && !var2.switch_) {
            RenderSystem.pushMatrix();
            RenderSystem.translatef((float)(this.void_ / 2), (float)(this.static_ / 2), (float)this.h_());
            ly_3 var8 = ((Hh_1)this.finally_.class_[16]).finally_();
            RenderSystem.rotatef(var8.protected_(), -1.0F, 0.0F, 0.0F);
            RenderSystem.rotatef(var8.throws_(), 0.0F, 1.0F, 0.0F);
            RenderSystem.scalef(-1.0F, -1.0F, -1.0F);
            RenderSystem.renderCrosshair(10);
            RenderSystem.popMatrix();
         } else {
            RenderSystem.blendFuncSeparate(OP.ONE_MINUS_DST_COLOR, MK.ONE_MINUS_SRC_COLOR, OP.ONE, MK.ZERO);
            if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAa_1.class_()).byte_()) {
               this.break_(var1, (this.void_ - 15) / 2, (this.static_ - 15) / 2, 0, 0, 15, 15);
               if (((Qw_1)this.finally_.class_[20]).interface_ == VX.CROSSHAIR) {
                  float var3 = ((cb_3)this.finally_.class_[57]).class_(0.0F, false);
                  boolean var4 = false;
                  if ((an_3)this.finally_.class_[63] != null && (an_3)this.finally_.class_[63] instanceof iB_2 && var3 >= 1.0F) {
                     var4 = ((cb_3)this.finally_.class_[57]).byte_(false) > 5.0F;
                     var4 &= ((an_3)this.finally_.class_[63]).BM();
                  }

                  int var5 = this.static_ / 2 - 7 + 16;
                  int var6 = this.void_ / 2 - 8;
                  if (var4) {
                     this.break_(var1, var6, var5, 68, 94, 16, 16);
                  } else if (var3 < 1.0F) {
                     int var7 = (int)(var3 * 17.0F);
                     this.break_(var1, var6, var5, 36, 94, 16, 4);
                     this.break_(var1, var6, var5, 52, 94, var7, 4);
                  }
               }
            }
         }
      }
   }

   public int int_() {
      return this.import_;
   }

   public cq_3(QY var1) {
      this.finally_ = var1;
      this.extends_ = var1.float_();
      this.this_ = new uV_2(var1);
      this.synchronized_ = new cY_2(var1);
      this.native_ = new cI_2(var1);
      this.return_ = new uR_2(var1, this);
      this.public_ = new uj_3(var1);
      this.else_ = new uo_3(var1);

      for (rVU var5 : rVU.values()) {
         this.short_.put(var5, Lists.newArrayList());
      }

      this.short_.get(rVU.CHAT).add(new uP_2(var1));
      this.short_.get(rVU.SYSTEM).add(new uP_2(var1));
      this.short_.get(rVU.GAME_INFO).add(new uB_2(var1));
      this.class_();
   }

   private iB_2 this_() {
      rhd_3 var1 = this.super_();
      if (var1 != null) {
         an_3 var2 = var1.ra();
         if (var2 == null) {
            return null;
         }

         if (var2 instanceof iB_2) {
            return (iB_2)var2;
         }
      }

      return null;
   }

   public void class_(float var1, float var2, float var3, rhd_3 var4, rdn_3 var5, boolean var6) {
      if (!var5.class_()) {
         int var7 = var5.interface_();
         float var8 = (float)var7 - var3;
         if (var8 > 0.0F) {
            RenderSystem.pushMatrix();
            float var9 = 1.0F + var8 / 5.0F;
            RenderSystem.translatef(var1 + 8.0F, var2 + 12.0F, 0.0F);
            RenderSystem.scalef(1.0F / var9, (var9 + 1.0F) / 2.0F, 1.0F);
            RenderSystem.translatef(-(var1 + 8.0F), -(var2 + 12.0F), 0.0F);
         }

         this.extends_.class_(var4, var5, var1, var2);
         if (var8 > 0.0F) {
            RenderSystem.popMatrix();
         }

         this.extends_.class_((cm_3)this.finally_.class_[15], var5, var1, var2);
         if (var6) {
            int var10 = var5.class_((rhd_3)((cb_3)this.finally_.class_[57]));
            this.extends_.class_((cm_3)this.finally_.class_[15], var5, var1, var2, var10 + "");
         }
      }
   }

   public void class_(Ml_1 var1, float var2) {
      this.void_ = this.finally_.else_().super_();
      this.static_ = this.finally_.else_().this_();
      cm_3 var3 = this.catch_();
      RenderSystem.enableBlend();
      if (rrbb_3.A()) {
         this.break_(this.finally_.catch_());
      } else {
         RenderSystem.enableDepthTest();
         RenderSystem.defaultBlendFunc();
      }

      rrnE_2.class_(var1, var2);
      if (((Ax_1)this.finally_.class_[55]).native_() == rRl_1.SPECTATOR) {
         this.synchronized_.class_(var1, var2);
      } else if (!((Qw_1)this.finally_.class_[20]).g) {
         this.class_(var2, var1);
      }

      if (!((Qw_1)this.finally_.class_[20]).g) {
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.finally_.A().class_(protected_);
         RenderSystem.enableBlend();
         RenderSystem.enableAlphaTest();
         this.byte_(var1);
         MT.throws_();
         RenderSystem.defaultBlendFunc();
         if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().h().continue_()) {
            this.public_.class_(var1);
         }

         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.finally_.A().class_(protected_);
         if (((Ax_1)this.finally_.class_[55]).class_()) {
            this.protected_(var1);
         }

         this.throws_(var1);
         RenderSystem.disableBlend();
         int var4 = this.void_ / 2 - 91;
         if (((cb_3)this.finally_.class_[57]).L()) {
            this.class_(var1, var4);
         } else if (((Ax_1)this.finally_.class_[55]).throws_()) {
            this.break_(var1, var4);
         }

         if (((Qw_1)this.finally_.class_[20]).else_ && ((Ax_1)this.finally_.class_[55]).native_() != rRl_1.SPECTATOR) {
            this.class_(var1);
         } else if (((cb_3)this.finally_.class_[57]).native_()) {
            this.synchronized_.class_(var1);
         }

         this.synchronized_.class_(var1);
      }

      if (((cb_3)this.finally_.class_[57]).su() > 0) {
         RenderSystem.disableDepthTest();
         RenderSystem.disableAlphaTest();
         float var10 = (float)((cb_3)this.finally_.class_[57]).su();
         float var5 = var10 / 100.0F;
         if (var5 > 1.0F) {
            var5 = 1.0F - (var10 - 100.0F) / 10.0F;
         }

         int var6 = (int)(220.0F * var5) << 24 | 1052704;
         class_(var1, 0, 0, this.void_, this.static_, var6);
         RenderSystem.enableAlphaTest();
         RenderSystem.enableDepthTest();
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      }

      if (this.finally_.int_()) {
         this.break_(var1);
      }

      if (((Qw_1)this.finally_.class_[20]).R) {
         this.this_.class_(var1);
      }

      if (!((Qw_1)this.finally_.class_[20]).g) {
         boolean var11 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().h().new_();
         if (this.final_ != null && this.package_ > 0 && (var11 || this.final_ instanceof rVe_1)) {
            float var12 = (float)this.package_ - var2;
            int var15 = (int)(var12 * 255.0F / 20.0F);
            if (var15 > 255) {
               var15 = 255;
            }

            if (var15 > 8) {
               RenderSystem.pushMatrix();
               RenderSystem.translatef((float)(this.void_ / 2), (float)(this.static_ - 68 + this.import_ + 15), 0.0F);
               RenderSystem.enableBlend();
               RenderSystem.defaultBlendFunc();
               int var7 = 16777215;
               if (this.int_) {
                  var7 = rfU_2.case_(var12 / 50.0F, 0.7F, 0.6F) & 16777215;
               }

               int var8 = var15 << 24 & 0xFF000000;
               int var9 = var3.class_(this.final_);
               this.class_(var1, -4, var9, 16777215 | var8);
               if (this.new_) {
                  var3.break_(var1, this.final_, (float)(-var9 / 2), -4.0F, var7 | var8);
               } else {
                  var3.byte_(var1, this.final_, (float)(-var9 / 2), -4.0F, var7 | var8);
               }

               RenderSystem.disableBlend();
               RenderSystem.popMatrix();
            }
         }

         if (this.while_ != null && this.goto_ > 0 && (var11 || this.while_ instanceof rVe_1)) {
            float var13 = (float)this.goto_ - var2;
            int var16 = 255;
            if (this.goto_ > this.interface_ + this.throw_) {
               float var19 = (float)(this.instanceof_ + this.throw_ + this.interface_) - var13;
               var16 = (int)(var19 * 255.0F / (float)this.instanceof_);
            }

            if (this.goto_ <= this.interface_) {
               var16 = (int)(var13 * 255.0F / (float)this.interface_);
            }

            var16 = rfU_2.class_(var16, 0, 255);
            if (var16 > 8) {
               RenderSystem.pushMatrix();
               RenderSystem.translatef((float)(this.void_ / 2), (float)(this.static_ / 2), 0.0F);
               RenderSystem.enableBlend();
               RenderSystem.defaultBlendFunc();
               RenderSystem.pushMatrix();
               RenderSystem.scalef(4.0F, 4.0F, 4.0F);
               int var20 = var16 << 24 & 0xFF000000;
               int var22 = var3.class_(this.while_);
               this.class_(var1, -10, var22, 16777215 | var20);
               var3.break_(var1, this.while_, (float)(-var22 / 2), -10.0F, 16777215 | var20);
               RenderSystem.popMatrix();
               if (this.try_ != null) {
                  RenderSystem.pushMatrix();
                  RenderSystem.scalef(2.0F, 2.0F, 2.0F);
                  int var26 = var3.class_(this.try_);
                  this.class_(var1, 5, var26, 16777215 | var20);
                  var3.break_(var1, this.try_, (float)(-var26 / 2), 5.0F, 16777215 | var20);
                  RenderSystem.popMatrix();
               }

               RenderSystem.disableBlend();
               RenderSystem.popMatrix();
            }
         }

         this.else_.class_(var1);
         rns_3 var14 = ((gm_3)this.finally_.class_[56]).package_();
         rnP_2 var18 = null;
         rnB_2 var21 = var14.private_(((cb_3)this.finally_.class_[57]).i());
         if (var21 != null) {
            int var23 = var21.volatile_().class_();
            if (var23 >= 0) {
               var18 = var14.class_(3 + var23);
            }
         }

         rnP_2 var24 = var18 != null ? var18 : var14.class_(1);
         this.const_ = var24;
         this.default_.clear();
         if (var24 != null) {
            this.class_(var1, var24);
         }

         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableAlphaTest();
         RenderSystem.pushMatrix();
         RenderSystem.translatef(0.0F, (float)(this.static_ - 48) - ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().w().new_(), 0.0F);
         this.native_.class_(var1, this.volatile_);
         RenderSystem.popMatrix();
         var24 = var14.class_(0);
         rrnB_2.class_(var1, var2);
         if (!((Qw_1)this.finally_.class_[20]).F.protected_()
            || this.finally_.switch_() && ((Aq_1)((cb_3)this.finally_.class_[57]).break_[0]).throws_().size() <= 1 && var24 == null) {
            this.return_.class_(false);
         } else {
            this.return_.class_(true);
            this.return_.class_(var1, this.void_, var14, var24);
         }
      }

      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableAlphaTest();
   }

   public void class_(rgP_2 var1) {
      this.class_(new rgn_3("record.nowPlaying", var1), true, false);
   }

   private void class_(an_3 var1) {
      if (var1 != null) {
         float var2 = rfU_2.class_(1.0F - var1.rX(), 0.0F, 1.0F);
         this.class_ = (float)((double)this.class_ + (double)(var2 - this.class_) * 0.01);
      }
   }

   private int class_(iB_2 var1) {
      if (var1 != null && var1.R()) {
         float var2 = var1.SK();
         int var3 = (int)(var2 + 0.5F) / 2;
         if (var3 > 30) {
            var3 = 30;
         }

         return var3;
      } else {
         return 0;
      }
   }

   public void class_() {
      this.instanceof_ = 10;
      this.throw_ = 70;
      this.interface_ = 20;
   }

   public void class_(rVU var1, rgP_2 var2, UUID var3) {
      if (!this.finally_.class_(var3) && (!((Qw_1)this.finally_.class_[20]).M || !this.finally_.class_(this.break_(var2)))) {
         for (ur_3 var5 : this.short_.get(var1)) {
            var5.class_(var1, var2, var3);
         }
      }
   }

   public void class_(rgP_2 var1, rgP_2 var2, int var3, int var4, int var5) {
      if (var1 == null && var2 == null && var3 < 0 && var4 < 0 && var5 < 0) {
         this.while_ = null;
         this.try_ = null;
         this.goto_ = 0;
      } else if (var1 != null) {
         this.while_ = var1;
         this.goto_ = this.instanceof_ + this.throw_ + this.interface_;
      } else if (var2 != null) {
         this.try_ = var2;
      } else {
         if (var3 >= 0) {
            this.instanceof_ = var3;
         }

         if (var4 >= 0) {
            this.throw_ = var4;
         }

         if (var5 >= 0) {
            this.interface_ = var5;
         }

         if (this.goto_ > 0) {
            this.goto_ = this.instanceof_ + this.throw_ + this.interface_;
         }
      }
   }

   public void class_(rgP_2 var1, boolean var2, boolean var3) {
      this.final_ = var1;
      this.package_ = 60;
      this.int_ = var2;
      this.new_ = var3;
   }

   public void class_(Ml_1 var1, int var2) {
      this.finally_.A().class_(ch_3.protected_);
      float var3 = ((cb_3)this.finally_.class_[57]).E();
      short var4 = 182;
      int var5 = (int)(var3 * 183.0F);
      int var6 = this.static_ - 32 + 3;
      this.break_(var1, var2, var6, 0, 84, 182, 5);
      if (var5 > 0) {
         this.break_(var1, var2, var6, 0, 89, var5, 5);
      }
   }

   private void class_(Ml_1 var1, rnP_2 var2) {
      rns_3 var3 = var2.class_();
      Collection var4 = var3.class_(var2);
      List var5 = var4.stream().filter(var0 -> var0.throws_() != null && !var0.throws_().startsWith("#")).collect(Collectors.toList());
      if (var5.size() > 15) {
         var4 = Lists.newArrayList(Iterables.skip(var5, var4.size() - 15));
      } else {
         var4 = var5;
      }

      ArrayList var6 = Lists.newArrayListWithCapacity(var4.size());
      boolean var7 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().throws_().continue_();
      rgP_2 var8 = var2.protected_();
      int var9 = this.catch_().class_(var8);
      int var10 = var9;
      int var11 = this.catch_().break_(": ");

      for (rAa_1 var13 : var4) {
         rnB_2 var14 = var3.private_(var13.throws_());
         rVi_1 var15 = rnB_2.class_(var14, new rgN_2(var13.throws_()), rnO_2.values());
         var6.add(Pair.of(var13, var15));
         var10 = Math.max(var10, this.catch_().class_(var15) + var11 + this.catch_().break_(Integer.toString(var13.break_())));
         this.default_.add(var15.getString());
      }

      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().h().this_()) {
         int var26 = var4.size() * 9;
         int var27 = this.static_ / 2 + var26 / 2;
         int var28 = this.void_ - var10 - 3;
         int var29 = 0;
         int var16 = ((Qw_1)this.finally_.class_[20]).break_(0.3F);
         int var17 = ((Qw_1)this.finally_.class_[20]).break_(0.4F);

         for (Pair var19 : var6) {
            var29++;
            rAa_1 var20 = (rAa_1)var19.getFirst();
            rgP_2 var21 = (rgP_2)var19.getSecond();
            String var22 = "" + rgF_2.RED + var20.break_();
            int var23 = var27 - var29 * 9;
            int var24 = this.void_ - 3 + 2;
            class_(var1, var28 - 2, var23, var24, var23 + 9, var16);
            this.catch_().byte_(var1, var21, (float)var28, (float)var23, -1);
            this.catch_().break_(var1, var22, (float)(var24 - this.catch_().break_(var22)), (float)var23, -1);
            if (var29 == var4.size()) {
               class_(var1, var28 - 2, var23 - (var7 ? 2 : 1), var24, var23, var16);
               if (!var7) {
                  class_(var1, var28 - 2, var23 - 9 - 1, var24, var23 - 1, var17);
                  this.catch_().byte_(var1, var8, (float)(var28 + var10 / 2 - var9 / 2), (float)(var23 - 9), -1);
               }
            }
         }
      }
   }

   private boolean class_(rjG_2 var1) {
      if (var1 == null) {
         return false;
      } else if (var1.byte_() == rjM_2.ENTITY) {
         return ((rfo_3)var1).class_() instanceof rJZ;
      } else if (var1.byte_() == rjM_2.BLOCK) {
         rfH_2 var2 = ((rff_3)var1).class_();
         gm_3 var3 = (gm_3)this.finally_.class_[56];
         return var3.byte_(var2).break_(var3, var2) != null;
      } else {
         return false;
      }
   }

   public void class_(Ml_1 var1) {
      if (this.continue_ > 0 && !this.super_.class_()) {
         rVi_1 var2 = new rgN_2("").class_(this.super_.continue_()).class_(this.super_.synchronized_().color);
         if (this.super_.this_()) {
            var2.class_(rgF_2.ITALIC);
         }

         Object var3 = var2;
         if (rrxr_3.PQ.byte_()) {
            var3 = (rgP_2)rrxr_3.private_(this.super_, rrxr_3.PQ, var2);
         }

         int var4 = this.catch_().class_((rgS_2)var3);
         int var5 = (this.void_ - var4) / 2;
         int var6 = this.static_ - 59;
         if (!((Ax_1)this.finally_.class_[55]).class_()) {
            var6 += 14;
         }

         int var7 = (int)((float)this.continue_ * 256.0F / 10.0F);
         if (var7 > 255) {
            var7 = 255;
         }

         if (var7 > 0) {
            RenderSystem.pushMatrix();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            class_(var1, var5 - 2, var6 - 2, var5 + var4 + 2, var6 + 9 + 2, ((Qw_1)this.finally_.class_[20]).class_(0));
            cm_3 var8 = null;
            if (rrxr_3.PG.byte_()) {
               var8 = (cm_3)rrxr_3.private_(this.super_.break_(), rrxr_3.PG, this.super_);
            }

            if (var8 != null) {
               var4 = (this.void_ - var8.class_((rgS_2)var3)) / 2;
               var8.break_(var1, ((rgP_2)var3).catch_(), (float)var5, (float)var6, 16777215 + (var7 << 24));
            } else {
               this.catch_().break_(var1, (rgP_2)var3, (float)var5, (float)var6, 16777215 + (var7 << 24));
            }

            RenderSystem.disableBlend();
            RenderSystem.popMatrix();
         }
      }
   }

   private void class_(Ml_1 var1, int var2, int var3, int var4) {
      int var5 = ((Qw_1)this.finally_.class_[20]).break_(0.0F);
      if (var5 != 0) {
         int var6 = -var3 / 2;
         class_(var1, var6 - 2, var2 - 2, var6 + var3 + 2, var2 + 9 + 2, ryj_3.class_(var5, var4));
      }
   }

   protected void class_(float var1, Ml_1 var2) {
      rhd_3 var3 = this.super_();
      if (var3 != null) {
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.finally_.A().class_(case_);
         rdn_3 var4 = var3.Sn();
         rpZ_2 var5 = var3.Su().class_();
         int var6 = this.void_ / 2;
         int var7 = this.h_();
         this.class_(-90);
         int var8 = this.static_ - 22;
         this.break_(var2, var6 - 91, var8, 0, 0, 182, 22);
         this.break_(var2, var6 - 91 - 1 + ((rhz_3)var3.implements_[1]).protected_ * 20, this.static_ - 22 - 1, 0, 22, 24, 22);
         if (!var4.class_()) {
            if (var5 == rpZ_2.LEFT) {
               this.break_(var2, var6 - 91 - 29, this.static_ - 23, 24, 22, 29, 24);
            } else {
               this.break_(var2, var6 + 91, this.static_ - 23, 53, 22, 29, 24);
            }
         }

         this.class_(var7);
         RenderSystem.enableRescaleNormal();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         rrby_3.class_(false);

         for (int var9 = 0; var9 < 9; var9++) {
            int var10 = var6 - 90 + var9 * 20 + 2;
            int var11 = this.static_ - 16 - 3;
            this.class_((float)var10, (float)var11, var1, var3, ((rhz_3)var3.implements_[1]).class_.get(var9), false);
         }

         if (!var4.class_()) {
            rrby_3.class_(true);
            int var13 = this.static_ - 16 - 3;
            if (var5 == rpZ_2.LEFT) {
               this.class_((float)(var6 - 91 - 26), (float)var13, var1, var3, var4, false);
            } else {
               this.class_((float)(var6 + 91 + 10), (float)var13, var1, var3, var4, false);
            }

            rrby_3.class_(false);
         }

         if (((Qw_1)this.finally_.class_[20]).interface_ == VX.HOTBAR) {
            float var14 = ((cb_3)this.finally_.class_[57]).class_(0.0F, false);
            if (var14 < 1.0F) {
               int var15 = this.static_ - 20;
               int var16 = var6 + 91 + 6;
               if (var5 == rpZ_2.RIGHT) {
                  var16 = var6 - 91 - 22;
               }

               this.finally_.A().class_(ch_3.protected_);
               int var12 = (int)(var14 * 19.0F);
               RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
               this.break_(var2, var16, var15, 0, 94, 18, 18);
               this.break_(var2, var16, var15 + 18 - var12, 18, 112 - var12, 18, var12);
            }
         }

         RenderSystem.disableRescaleNormal();
         RenderSystem.disableBlend();
      }
   }

   public void break_(Ml_1 var1, int var2) {
      this.finally_.A().class_(ch_3.protected_);
      int var3 = ((cb_3)this.finally_.class_[57]).sn();
      if (var3 > 0) {
         short var4 = 182;
         int var5 = (int)((Float)((cb_3)this.finally_.class_[57]).implements_[21] * 183.0F);
         int var6 = this.static_ - 32 + 3;
         this.break_(var1, var2, var6, 0, 64, 182, 5);
         if (var5 > 0) {
            this.break_(var1, var2, var6, 0, 69, var5, 5);
         }
      }

      if ((Integer)((cb_3)this.finally_.class_[57]).implements_[19] > 0) {
         int var8 = 8453920;
         if (rrbb_3.K()) {
            var8 = rrbN_2.class_(var8);
         }

         String var9 = (Integer)((cb_3)this.finally_.class_[57]).implements_[19] + "";
         int var10 = (this.void_ - this.catch_().break_(var9)) / 2;
         int var7 = this.static_ - 31 - 4;
         this.catch_().break_(var1, var9, (float)(var10 + 1), (float)var7, 0);
         this.catch_().break_(var1, var9, (float)(var10 - 1), (float)var7, 0);
         this.catch_().break_(var1, var9, (float)var10, (float)(var7 + 1), 0);
         this.catch_().break_(var1, var9, (float)var10, (float)(var7 - 1), 0);
         this.catch_().break_(var1, var9, (float)var10, (float)var7, var8);
      }
   }

   public UUID break_(rgP_2 var1) {
      String var2 = rgL_2.class_(var1);
      String var3 = StringUtils.substringBetween(var2, "<", ">");
      return var3 == null ? rqR_2.break_ : this.finally_.volatile_().class_(var3);
   }

   private void break_(an_3 var1) {
      if (!rrbb_3.A()) {
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ONE, MK.ZERO);
      } else {
         roE_2 var2 = ((gm_3)this.finally_.class_[56]).instanceof_();
         float var3 = (float)var2.class_(var1);
         double var4 = Math.min(var2.int_() * (double)var2.new_() * 1000.0, Math.abs(var2.extends_() - var2.implements_()));
         double var6 = Math.max((double)var2.continue_(), var4);
         if ((double)var3 < var6) {
            var3 = 1.0F - (float)((double)var3 / var6);
         } else {
            var3 = 0.0F;
         }

         RenderSystem.disableDepthTest();
         RenderSystem.depthMask(false);
         RenderSystem.blendFuncSeparate(OP.ZERO, MK.ONE_MINUS_SRC_COLOR, OP.ONE, MK.ZERO);
         if (var3 > 0.0F) {
            RenderSystem.color4f(0.0F, var3, var3, 1.0F);
         } else {
            RenderSystem.color4f(this.class_, this.class_, this.class_, 1.0F);
         }

         this.finally_.A().class_(throws_);
         yb_3 var8 = yb_3.class_();
         lD_2 var9 = var8.byte_();
         var9.class_(7, ju_3.synchronized_);
         var9.class_(0.0, (double)this.static_, -90.0).class_(0.0F, 1.0F).class_();
         var9.class_((double)this.void_, (double)this.static_, -90.0).class_(1.0F, 1.0F).class_();
         var9.class_((double)this.void_, 0.0, -90.0).class_(1.0F, 0.0F).class_();
         var9.class_(0.0, 0.0, -90.0).class_(0.0F, 0.0F).class_();
         var8.break_();
         RenderSystem.depthMask(true);
         RenderSystem.enableDepthTest();
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.defaultBlendFunc();
      }
   }

   public void break_(Ml_1 var1) {
      Object var2;
      if (((gm_3)this.finally_.class_[56]).r() >= 120500L) {
         var2 = private_;
      } else {
         var2 = new rgn_3("demo.remainingTime", rql_3.class_((int)(120500L - ((gm_3)this.finally_.class_[56]).r())));
      }

      int var3 = this.catch_().class_((rgS_2)var2);
      this.catch_().break_(var1, (rgP_2)var2, (float)(this.void_ - var3 - 10), 5.0F, 16777215);
   }

   private int break_(int var1) {
      return (int)Math.ceil((double)var1 / 10.0);
   }

   public cI_2 throws_() {
      return this.native_;
   }

   private void throws_(Ml_1 var1) {
      iB_2 var2 = this.this_();
      if (var2 != null) {
         int var3 = this.class_(var2);
         if (var3 != 0) {
            int var4 = (int)Math.ceil((double)var2.Ss());
            int var5 = this.static_ - 39;
            int var6 = this.void_ / 2 + 91;
            int var7 = var5;
            byte var8 = 0;

            for (boolean var9 = false; var3 > 0; var8 += 20) {
               int var10 = Math.min(var3, 10);
               var3 -= var10;

               for (int var11 = 0; var11 < var10; var11++) {
                  byte var12 = 52;
                  byte var13 = 0;
                  int var14 = var6 - var11 * 8 - 9;
                  this.break_(var1, var14, var7, 52 + var13 * 9, 9, 9, 9);
                  if (var11 * 2 + 1 + var8 < var4) {
                     this.break_(var1, var14, var7, 88, 9, 9, 9);
                  }

                  if (var11 * 2 + 1 + var8 == var4) {
                     this.break_(var1, var14, var7, 97, 9, 9, 9);
                  }
               }

               var7 -= 10;
            }
         }
      }
   }

   public void finally_() {
      this.return_.throws_();
      this.public_.class_();
   }

   public cm_3 catch_() {
      return (cm_3)this.finally_.class_[15];
   }

   public uj_3 extends_() {
      return this.public_;
   }

   public int case_() {
      return this.volatile_;
   }

   public rnP_2 continue_() {
      return this.const_;
   }

   public uR_2 implements_() {
      return this.return_;
   }

   public Set<String> new_() {
      return this.default_;
   }

   public int package_() {
      return this.package_;
   }

   private rhd_3 super_() {
      return !(this.finally_.catch_() instanceof rhd_3) ? null : (rhd_3)this.finally_.catch_();
   }

   public void protected_() {
      if ((gm_3)this.finally_.class_[56] == null) {
         rrMd_1.byte_();
      }

      if (this.package_ > 0) {
         this.package_--;
      }

      if (this.goto_ > 0) {
         this.goto_--;
         if (this.goto_ <= 0) {
            this.while_ = null;
            this.try_ = null;
         }
      }

      this.volatile_++;
      an_3 var1 = this.finally_.catch_();
      if (var1 != null) {
         this.class_(var1);
      }

      if ((cb_3)this.finally_.class_[57] != null) {
         rdn_3 var2 = ((rhz_3)((cb_3)this.finally_.class_[57]).implements_[1]).byte_();
         boolean var3 = true;
         if (rrxr_3.PQ.byte_()) {
            rgP_2 var4 = (rgP_2)rrxr_3.private_(var2, rrxr_3.PQ, var2.continue_());
            rgP_2 var5 = (rgP_2)rrxr_3.private_(this.super_, rrxr_3.PQ, this.super_.continue_());
            var3 = rrbb_3.class_(var4, var5);
         }

         if (var2.class_()) {
            this.continue_ = 0;
         } else if (this.super_.class_() || var2.break_() != this.super_.break_() || !var2.continue_().equals(this.super_.continue_()) || !var3) {
            this.continue_ = 40;
         } else if (this.continue_ > 0) {
            this.continue_--;
         }

         this.super_ = var2;
      }
   }

   private void protected_(Ml_1 var1) {
      rhd_3 var2 = this.super_();
      if (var2 != null) {
         int var3 = rfU_2.case_(var2.Ss());
         boolean var4 = this.float_ > (long)this.volatile_ && (this.float_ - (long)this.volatile_) / 3L % 2L == 1L;
         long var5 = rqR_2.break_();
         if (var3 < this.char_ && (Integer)var2.throws_[47] > 0) {
            this.long_ = var5;
            this.float_ = (long)(this.volatile_ + 20);
         } else if (var3 > this.char_ && (Integer)var2.throws_[47] > 0) {
            this.long_ = var5;
            this.float_ = (long)(this.volatile_ + 10);
         }

         if (var5 - this.long_ > 1000L) {
            this.char_ = var3;
            this.abstract_ = var3;
            this.long_ = var5;
         }

         this.char_ = var3;
         int var7 = this.abstract_;
         this.implements_.setSeed((long)this.volatile_ * 312871L);
         rpQ_2 var8 = var2.sk();
         int var9 = var8.class_();
         int var10 = this.void_ / 2 - 91;
         int var11 = this.void_ / 2 + 91;
         int var12 = this.static_ - 39;
         float var13 = (float)var2.class_(iQ_2.class_);
         int var14 = rfU_2.case_(var2.Sd());
         int var15 = rfU_2.case_((var13 + (float)var14) / 2.0F / 10.0F);
         int var16 = Math.max(10 - (var15 - 2), 3);
         int var17 = var12 - (var15 - 1) * var16 - 10;
         int var18 = var12 - 10;
         int var19 = 0;
         int var20 = var14;
         int var21 = var2.Bq();
         int var22 = -1;
         if (var2.break_(rLD.finally_)) {
            var22 = this.volatile_ % rfU_2.case_(var13 + 5.0F);
         }

         for (int var23 = 0; var23 < 10; var23++) {
            if (var21 > 0) {
               int var24 = var10 + var23 * 8;
               if (var23 * 2 + 1 < var21) {
                  this.break_(var1, var24, var17, 34, 9, 9, 9);
               }

               if (var23 * 2 + 1 == var21) {
                  this.break_(var1, var24, var17, 25, 9, 9, 9);
               }

               if (var23 * 2 + 1 > var21) {
                  this.break_(var1, var24, var17, 16, 9, 9, 9);
               }
            }
         }

         boolean var36 = var2.break_(rLD.super_);

         for (int var37 = rfU_2.case_((var13 + (float)var14) / 2.0F) - 1; var37 >= 0; var37--) {
            byte var25 = 16;
            if (var36) {
               var25 += 36;
            }

            byte var26 = 0;
            if (var4) {
               var26 = 1;
            }

            int var27 = rfU_2.case_((float)(var37 + 1) / 10.0F) - 1;
            int var28 = var10 + var37 % 10 * 8;
            int var29 = var12 - var27 * var16;
            if (var3 <= 4) {
               var29 += this.implements_.nextInt(2);
            }

            if (var20 <= 0 && var37 == var22) {
               var29 -= 2;
            }

            byte var30 = 0;
            if (((rYB)var2.throws_[7]).public_().implements_()) {
               var30 = 5;
            }

            this.break_(var1, var28, var29, 16 + var26 * 9, 9 * var30, 9, 9);
            if (var4) {
               if (var37 * 2 + 1 < var7) {
                  this.break_(var1, var28, var29, var25 + 54, 9 * var30, 9, 9);
               }

               if (var37 * 2 + 1 == var7) {
                  this.break_(var1, var28, var29, var25 + 63, 9 * var30, 9, 9);
               }
            }

            if (var20 > 0) {
               if (var20 == var14 && var14 % 2 == 1) {
                  this.break_(var1, var28, var29, var25 + 153, 9 * var30, 9, 9);
                  var20--;
               } else {
                  this.break_(var1, var28, var29, var25 + 144, 9 * var30, 9, 9);
                  var20 -= 2;
               }
            } else {
               if (var37 * 2 + 1 < var3) {
                  this.break_(var1, var28, var29, var25 + 36, 9 * var30, 9, 9);
               }

               if (var37 * 2 + 1 == var3) {
                  this.break_(var1, var28, var29, var25 + 45, 9 * var30, 9, 9);
               }
            }
         }

         iB_2 var38 = this.this_();
         int var39 = this.class_(var38);
         boolean var40 = var2.break_(rLD.new_);
         if (var39 != 0) {
            var19 -= 10 * this.break_(var39);
         } else {
            for (int var41 = 0; var41 < 10; var41++) {
               int var44 = var12;
               byte var47 = 16;
               byte var50 = 0;
               if (var40) {
                  var47 += 36;
                  var50 = 13;
               }

               if (var2.sk().byte_() <= 0.0F && this.volatile_ % (var9 * 3 + 1) == 0) {
                  var44 = var12 + (this.implements_.nextInt(3) - 1);
               }

               int var31 = var11 - var41 * 8 - 9;
               this.break_(var1, var31, var44, 16 + var50 * 9, 27, 9, 9);
               if (var41 * 2 + 1 < var9) {
                  this.break_(var1, var31, var44, var47 + 36, 27, 9, 9);
               }

               if (var41 * 2 + 1 == var9) {
                  this.break_(var1, var31, var44, var47 + 45, 27, 9, 9);
               }
            }

            var18 -= 10;
            var19 -= 10;
            float var42 = var8.byte_();
            if (var42 > 0.0F) {
               int var45 = rfU_2.case_(var42 / 2.0F);

               for (int var48 = 0; var48 < var45; var48++) {
                  int var51 = var12 - 10;
                  byte var53 = 16;
                  byte var32 = 0;
                  if (var40) {
                     var53 += 36;
                     var32 = 13;
                  }

                  int var33 = var11 - var48 * 8 - 9;
                  this.break_(var1, var33, var51, 16 + var32 * 9, 27, 9, 9);
                  if ((float)(var48 * 2 + 1) < var42) {
                     this.break_(var1, var33, var51, var53 + 36, 27, 9, 9);
                  }

                  if (var48 * 2 + 1 == rfU_2.case_(var42)) {
                     this.break_(var1, var33, var51, var53 + 45, 27, 9, 9);
                  }
               }

               var18 -= 10;
               var19 -= 10;
            }
         }

         int var43 = var2.ri();
         int var46 = Math.min(var2.PA(), var43);
         if (var2.class_(rlG_2.break_) || var46 < var43) {
            int var49 = this.break_(var39) - 1;
            int var52 = var49 * 10;
            var18 -= var52;
            int var54 = rfU_2.throws_((double)(var46 - 2) * 10.0 / (double)var43);
            int var55 = rfU_2.throws_((double)var46 * 10.0 / (double)var43) - var54;

            for (int var56 = 0; var56 < var54 + var55; var56++) {
               if (var56 < var54) {
                  this.break_(var1, var11 - var56 * 8 - 9, var18, 16, 18, 9, 9);
               } else {
                  this.break_(var1, var11 - var56 * 8 - 9, var18, 25, 18, 9, 9);
               }
            }

            if (var2.PA() > 0) {
               var19 -= 10;
            }
         }

         this.import_ = var19;
      }
   }

   public cY_2 private_() {
      return this.synchronized_;
   }

   public rgP_2 final_() {
      return this.final_;
   }

   public String volatile_() {
      return this.while_ == null ? "" : this.while_.byte_();
   }

   public void native_() {
      this.this_.class_();
   }
}
