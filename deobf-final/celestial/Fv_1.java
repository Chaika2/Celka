package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

public class Fv_1 extends cc_3<FF> {
   private static final rqO_2 throws_ = new rqO_2("textures/gui/container/creative_inventory/tabs.png");
   static final rXA case_ = new rXA(45);
   private static final rgP_2 catch_ = new rgn_3("inventory.binSlot");
   private static int private_ = rdX_2.break_.class_();
   private float implements_;
   private boolean finally_;
   private Lu_1 boolean_;
   private List<rJY> transient_;
   private rJY for_;
   private FZ double_;
   private boolean switch_;
   private boolean r;
   private final Map<rqO_2, rlb_3<rdb_3>> P = Maps.newTreeMap();

   private void char_() {
      this.instanceof_.class_.clear();
      this.P.clear();
      String var1 = this.boolean_.private_();
      if (var1.isEmpty()) {
         for (rdb_3 var3 : rVL.for_) {
            var3.class_(rdX_2.catch_, this.instanceof_.class_);
         }
      } else {
         Vo_1 var4;
         if (var1.startsWith("#")) {
            var1 = var1.substring(1);
            var4 = this.volatile_.class_(gJ_2.break_);
            this.class_(var1);
         } else {
            var4 = this.volatile_.class_(gJ_2.class_);
         }

         this.instanceof_.class_.addAll(var4.class_(var1.toLowerCase(Locale.ROOT)));
      }

      this.implements_ = 0.0F;
      this.instanceof_.class_(0.0F);
   }

   public Fv_1(rhd_3 var1) {
      super(new FF(var1), (rhz_3)var1.implements_[1], rgN_2.byte_);
      rJr_1 var6 = this.instanceof_;
      var1.implements_[4] = var6;
      this.continue_ = true;
      this.return_ = 136;
      this.synchronized_ = 195;
   }

   public int interface_() {
      return private_;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      super.class_(var1, var2, var3, var4);

      for (rdX_2 var8 : rdX_2.class_) {
         if (this.class_(var1, var8, var2, var3)) {
            break;
         }
      }

      if (this.for_ != null && private_ == rdX_2.final_.class_() && this.class_(this.for_.throws_, this.for_.case_, 16, 16, (double)var2, (double)var3)) {
         this.class_(var1, catch_, var2, var3);
      }

      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.break_(var1, var2, var3);
   }

   @Override
   protected void class_(Ml_1 var1, rdn_3 var2, int var3, int var4) {
      if (private_ == rdX_2.catch_.class_()) {
         List var5 = var2.class_((cb_3)this.volatile_.class_[57], ((Qw_1)this.volatile_.class_[20]).int_ ? VU.ADVANCED : VU.NORMAL);
         ArrayList var6 = Lists.newArrayList(var5);
         rdb_3 var7 = var2.break_();
         rdX_2 var8 = var7.new_();
         if (var8 == null && var7 == rdy_3.dm) {
            Map var9 = eA_2.class_(var2);
            if (var9.size() == 1) {
               ev_3 var10 = (ev_3)var9.keySet().iterator().next();

               for (rdX_2 var14 : rdX_2.class_) {
                  if (var14.class_(var10.break_)) {
                     var8 = var14;
                     break;
                  }
               }
            }
         }

         this.P.forEach((var2x, var3x) -> {
            if (var3x.class_(var7)) {
               var6.add(1, new rgN_2("#" + var2x).class_(rgF_2.DARK_PURPLE));
            }
         });
         if (var8 != null) {
            var6.add(1, var8.byte_().case_().class_(rgF_2.BLUE));
         }

         this.class_(var1, var6, var3, var4);
      } else {
         super.class_(var1, var2, var3, var4);
      }
   }

   @Override
   protected void class_(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      rdX_2 var5 = rdX_2.class_[private_];

      for (rdX_2 var9 : rdX_2.class_) {
         this.volatile_.A().class_(throws_);
         if (var9.class_() != private_) {
            this.class_(var1, var9);
         }
      }

      this.volatile_.A().class_(new rqO_2("textures/gui/container/creative_inventory/tab_" + var5.case_()));
      this.break_(var1, this.char_, this.abstract_, 0, 0, this.synchronized_, this.return_);
      this.boolean_.class_(var1, var3, var4, var2);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      int var10 = this.char_ + 175;
      int var11 = this.abstract_ + 18;
      int var12 = var11 + 112;
      this.volatile_.A().class_(throws_);
      if (var5.implements_()) {
         this.break_(var1, var10, var11 + (int)((float)(var12 - var11 - 17) * this.implements_), 232 + (this.abstract_() ? 0 : 12), 0, 12, 15);
      }

      this.class_(var1, var5);
      if (var5 == rdX_2.final_) {
         FH.class_(
            this.char_ + 88,
            this.abstract_ + 45,
            20,
            (float)(this.char_ + 88 - var3),
            (float)(this.abstract_ + 45 - 30 - var4),
            (cb_3)this.volatile_.class_[57]
         );
      }
   }

   protected boolean class_(rdX_2 var1, double var2, double var4) {
      int var6 = var1.extends_();
      int var7 = 28 * var6;
      int var8 = 0;
      if (var1.volatile_()) {
         var7 = this.synchronized_ - 28 * (6 - var6) + 2;
      } else if (var6 > 0) {
         var7 += var6;
      }

      if (var1.native_()) {
         var8 -= 32;
      } else {
         var8 += this.return_;
      }

      return var2 >= (double)var7 && var2 <= (double)(var7 + 28) && var4 >= (double)var8 && var4 <= (double)(var8 + 32);
   }

   private void class_(rdX_2 var1) {
      int var2 = private_;
      private_ = var1.class_();
      this.long_.clear();
      this.instanceof_.class_.clear();
      if (var1 == rdX_2.volatile_) {
         Vk_1 var3 = this.volatile_.super_();

         for (int var4 = 0; var4 < 9; var4++) {
            VQ var5 = var3.class_(var4);
            if (var5.isEmpty()) {
               for (int var6 = 0; var6 < 9; var6++) {
                  if (var6 == var4) {
                     rdn_3 var7 = new rdn_3(rdy_3.Xb);
                     var7.class_("CustomCreativeLock");
                     rgP_2 var8 = ((Qw_1)this.volatile_.class_[20]).t[var4].native_();
                     rgP_2 var9 = ((Qw_1)this.volatile_.class_[20]).w.native_();
                     var7.class_(new rgn_3("inventory.hotbarInfo", var9, var8));
                     this.instanceof_.class_.add(var7);
                  } else {
                     this.instanceof_.class_.add(rdn_3.break_);
                  }
               }
            } else {
               this.instanceof_.class_.addAll(var5);
            }
         }
      } else if (var1 != rdX_2.catch_) {
         var1.class_(this.instanceof_.class_);
      }

      if (var1 == rdX_2.final_) {
         rJT var10 = (rJT)((cb_3)this.volatile_.class_[57]).implements_[3];
         if (this.transient_ == null) {
            this.transient_ = ImmutableList.copyOf(this.instanceof_.throws_);
         }

         this.instanceof_.throws_.clear();

         for (int var11 = 0; var11 < var10.throws_.size(); var11++) {
            int var12;
            int var13;
            if (var11 >= 5 && var11 < 9) {
               int var15 = var11 - 5;
               int var18 = var15 / 2;
               int var20 = var15 % 2;
               var12 = 54 + var18 * 54;
               var13 = 6 + var20 * 27;
            } else if (var11 >= 0 && var11 < 5) {
               var12 = -2000;
               var13 = -2000;
            } else if (var11 == 45) {
               var12 = 35;
               var13 = 20;
            } else {
               int var14 = var11 - 9;
               int var17 = var14 % 9;
               int var19 = var14 / 9;
               var12 = 9 + var17 * 18;
               if (var11 >= 36) {
                  var13 = 112;
               } else {
                  var13 = 54 + var19 * 18;
               }
            }

            FL var16 = new FL(var10.throws_.get(var11), var11, var12, var13);
            this.instanceof_.throws_.add(var16);
         }

         this.for_ = new rJY(case_, 0, 173, 112);
         this.instanceof_.throws_.add(this.for_);
      } else if (var2 == rdX_2.final_.class_()) {
         this.instanceof_.throws_.clear();
         this.instanceof_.throws_.addAll(this.transient_);
         this.transient_ = null;
      }

      if (this.boolean_ != null) {
         if (var1 == rdX_2.catch_) {
            this.boolean_.private_(true);
            this.boolean_.catch_(false);
            this.boolean_.byte_(true);
            if (var2 != var1.class_()) {
               this.boolean_.class_("");
            }

            this.char_();
         } else {
            this.boolean_.private_(false);
            this.boolean_.catch_(true);
            this.boolean_.byte_(false);
            this.boolean_.class_("");
         }
      }

      this.implements_ = 0.0F;
      this.instanceof_.class_(0.0F);
   }

   @Override
   public boolean class_(double var1, double var3, double var5) {
      if (!this.abstract_()) {
         return false;
      } else {
         int var7 = (this.instanceof_.class_.size() + 9 - 1) / 9 - 5;
         this.implements_ = (float)((double)this.implements_ - var5 / (double)var7);
         this.implements_ = rfU_2.class_(this.implements_, 0.0F, 1.0F);
         this.instanceof_.class_(this.implements_);
         return true;
      }
   }

   @Override
   protected boolean class_(double var1, double var3, int var5, int var6, int var7) {
      boolean var8 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.synchronized_) || var3 >= (double)(var6 + this.return_);
      this.r = var8 && !this.class_(rdX_2.class_[private_], var1, var3);
      return this.r;
   }

   @Override
   public boolean class_(double var1, double var3, int var5, double var6, double var8) {
      if (this.finally_) {
         int var10 = this.abstract_ + 18;
         int var11 = var10 + 112;
         this.implements_ = ((float)var3 - (float)var10 - 7.5F) / ((float)(var11 - var10) - 15.0F);
         this.implements_ = rfU_2.class_(this.implements_, 0.0F, 1.0F);
         this.instanceof_.class_(this.implements_);
         return true;
      } else {
         return super.class_(var1, var3, var5, var6, var8);
      }
   }

   public static void class_(QY var0, int var1, boolean var2, boolean var3) {
      cb_3 var4 = (cb_3)var0.class_[57];
      Vk_1 var5 = var0.super_();
      VQ var6 = var5.class_(var1);
      if (var2) {
         for (int var7 = 0; var7 < rhz_3.protected_(); var7++) {
            rdn_3 var8 = ((rdn_3)var6.get(var7)).implements_();
            ((rhz_3)var4.implements_[1]).break_(var7, var8);
            ((Ax_1)var0.class_[55]).class_(var8, 36 + var7);
         }

         ((rJT)var4.implements_[3]).native_();
      } else if (var3) {
         for (int var9 = 0; var9 < rhz_3.protected_(); var9++) {
            var6.set(var9, ((rhz_3)var4.implements_[1]).extends_(var9).implements_());
         }

         rgP_2 var10 = ((Qw_1)var0.class_[20]).t[var1].native_();
         rgP_2 var11 = ((Qw_1)var0.class_[20]).I.native_();
         ((cq_3)var0.class_[19]).class_(new rgn_3("inventory.hotbarSaved", var11, var10), false, false);
         var5.class_();
      }
   }

   protected void class_(Ml_1 var1, rdX_2 var2) {
      boolean var3 = var2.class_() == private_;
      boolean var4 = var2.native_();
      int var5 = var2.extends_();
      int var6 = var5 * 28;
      byte var7 = 0;
      int var8 = this.char_ + 28 * var5;
      int var9 = this.abstract_;
      byte var10 = 32;
      if (var3) {
         var7 += 32;
      }

      if (var2.volatile_()) {
         var8 = this.char_ + this.synchronized_ - 28 * (6 - var5);
      } else if (var5 > 0) {
         var8 += var5;
      }

      if (var4) {
         var9 -= 28;
      } else {
         var7 += 64;
         var9 += this.return_ - 4;
      }

      this.break_(var1, var8, var9, var6, var7, 28, 32);
      this.final_.break_ = 100.0F;
      var8 += 6;
      var9 = var9 + 8 + (var4 ? 1 : -1);
      RenderSystem.enableRescaleNormal();
      rdn_3 var11 = var2.protected_();
      this.final_.class_(var11, var8, var9);
      this.final_.class_(this.super_, var11, (float)var8, (float)var9);
      this.final_.break_ = 0.0F;
   }

   protected boolean class_(Ml_1 var1, rdX_2 var2, int var3, int var4) {
      int var5 = var2.extends_();
      int var6 = 28 * var5;
      int var7 = 0;
      if (var2.volatile_()) {
         var6 = this.synchronized_ - 28 * (6 - var5) + 2;
      } else if (var5 > 0) {
         var6 += var5;
      }

      if (var2.native_()) {
         var7 -= 32;
      } else {
         var7 += this.return_;
      }

      if (this.class_(var6 + 3, var7 + 3, 23, 27, (double)var3, (double)var4)) {
         this.class_(var1, var2.byte_(), var3, var4);
         return true;
      } else {
         return false;
      }
   }

   private void class_(String var1) {
      int var2 = var1.indexOf(58);
      Predicate var3;
      if (var2 == -1) {
         var3 = var1x -> var1x.break_().contains(var1);
      } else {
         String var4 = var1.substring(0, var2).trim();
         String var5 = var1.substring(var2 + 1).trim();
         var3 = var2x -> var2x.byte_().contains(var4) && var2x.break_().contains(var5);
      }

      rlW_2 var6 = rlc_3.class_();
      var6.break_().stream().filter(var3).forEach(var2x -> {
         rlb_3 var3x = this.P.put(var2x, var6.class_(var2x));
      });
   }

   @Override
   public void class_(rJY var1, int var2, int var3, rXa_1 var4) {
      if (this.class_(var1)) {
         this.boolean_.native_();
         this.boolean_.native_(0);
      }

      boolean var5 = var4 == rXa_1.QUICK_MOVE;
      var4 = var2 == -999 && var4 == rXa_1.PICKUP ? rXa_1.THROW : var4;
      if (var1 == null && private_ != rdX_2.final_.class_() && var4 != rXa_1.QUICK_CRAFT) {
         rhz_3 var14 = (rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1];
         if (!var14.finally_().class_() && this.r) {
            if (var3 == 0) {
               ((cb_3)this.volatile_.class_[57]).class_(var14.finally_(), true);
               ((Ax_1)this.volatile_.class_[55]).class_(var14.finally_());
               var14.private_(rdn_3.break_);
            }

            if (var3 == 1) {
               rdn_3 var19 = var14.finally_().class_(1);
               ((cb_3)this.volatile_.class_[57]).class_(var19, true);
               ((Ax_1)this.volatile_.class_[55]).class_(var19);
            }
         }
      } else {
         if (var1 != null && !var1.class_((cb_3)this.volatile_.class_[57])) {
            return;
         }

         if (var1 == this.for_ && var5) {
            for (int var13 = 0; var13 < ((rJT)((cb_3)this.volatile_.class_[57]).implements_[3]).extends_().size(); var13++) {
               ((Ax_1)this.volatile_.class_[55]).class_(rdn_3.break_, var13);
            }
         } else if (private_ == rdX_2.final_.class_()) {
            if (var1 == this.for_) {
               ((rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1]).private_(rdn_3.break_);
            } else if (var4 == rXa_1.THROW && var1 != null && var1.break_()) {
               rdn_3 var6 = var1.class_(var3 == 0 ? 1 : var1.class_().byte_());
               rdn_3 var7 = var1.class_();
               ((cb_3)this.volatile_.class_[57]).class_(var6, true);
               ((Ax_1)this.volatile_.class_[55]).class_(var6);
               ((Ax_1)this.volatile_.class_[55]).class_(var7, ((FL)var1).class_.protected_);
            } else if (var4 == rXa_1.THROW && !((rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1]).finally_().class_()) {
               ((cb_3)this.volatile_.class_[57]).class_(((rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1]).finally_(), true);
               ((Ax_1)this.volatile_.class_[55]).class_(((rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1]).finally_());
               ((rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1]).private_(rdn_3.break_);
            } else {
               ((rJT)((cb_3)this.volatile_.class_[57]).implements_[3])
                  .class_(var1 == null ? var2 : ((FL)var1).class_.protected_, var3, var4, (cb_3)this.volatile_.class_[57]);
               ((rJT)((cb_3)this.volatile_.class_[57]).implements_[3]).native_();
            }
         } else if (var4 != rXa_1.QUICK_CRAFT && var1.byte_ == case_) {
            rhz_3 var12 = (rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1];
            rdn_3 var17 = var12.finally_();
            rdn_3 var20 = var1.class_();
            if (var4 == rXa_1.SWAP) {
               if (!var20.class_()) {
                  rdn_3 var23 = var20.implements_();
                  var23.throws_(var23.byte_());
                  ((rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1]).break_(var3, var23);
                  ((rJT)((cb_3)this.volatile_.class_[57]).implements_[3]).native_();
               }

               return;
            }

            if (var4 == rXa_1.CLONE) {
               if (var12.finally_().class_() && var1.break_()) {
                  rdn_3 var22 = var1.class_().implements_();
                  var22.throws_(var22.byte_());
                  var12.private_(var22);
               }

               return;
            }

            if (var4 == rXa_1.THROW) {
               if (!var20.class_()) {
                  rdn_3 var21 = var20.implements_();
                  var21.throws_(var3 == 0 ? 1 : var21.byte_());
                  ((cb_3)this.volatile_.class_[57]).class_(var21, true);
                  ((Ax_1)this.volatile_.class_[55]).class_(var21);
               }

               return;
            }

            if (!var17.class_() && !var20.class_() && var17.class_(var20) && rdn_3.class_(var17, var20)) {
               if (var3 == 0) {
                  if (var5) {
                     var17.throws_(var17.byte_());
                  } else if (var17.char_() < var17.byte_()) {
                     var17.case_(1);
                  }
               } else {
                  var17.catch_(1);
               }
            } else if (!var20.class_() && var17.class_()) {
               var12.private_(var20.implements_());
               var17 = var12.finally_();
               if (var5) {
                  var17.throws_(var17.byte_());
               }
            } else if (var3 == 0) {
               var12.private_(rdn_3.break_);
            } else {
               var12.finally_().catch_(1);
            }
         } else if (this.instanceof_ != null) {
            rdn_3 var11 = var1 == null ? rdn_3.break_ : this.instanceof_.class_(var1.protected_).class_();
            this.instanceof_.class_(var1 == null ? var2 : var1.protected_, var3, var4, (cb_3)this.volatile_.class_[57]);
            if (rJr_1.byte_(var3) == 2) {
               for (int var15 = 0; var15 < 9; var15++) {
                  ((Ax_1)this.volatile_.class_[55]).class_(this.instanceof_.class_(45 + var15).class_(), 36 + var15);
               }
            } else if (var1 != null) {
               rdn_3 var16 = this.instanceof_.class_(var1.protected_).class_();
               ((Ax_1)this.volatile_.class_[55]).class_(var16, var1.protected_ - this.instanceof_.throws_.size() + 9 + 36);
               int var8 = 45 + var3;
               if (var4 == rXa_1.SWAP) {
                  ((Ax_1)this.volatile_.class_[55]).class_(var11, var8 - this.instanceof_.throws_.size() + 9 + 36);
               } else if (var4 == rXa_1.THROW && !var11.class_()) {
                  rdn_3 var9 = var11.implements_();
                  var9.throws_(var3 == 0 ? 1 : var9.byte_());
                  ((cb_3)this.volatile_.class_[57]).class_(var9, true);
                  ((Ax_1)this.volatile_.class_[55]).class_(var9);
               }

               ((rJT)((cb_3)this.volatile_.class_[57]).implements_[3]).native_();
            }
         }
      }
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      this.switch_ = false;
      if (private_ != rdX_2.catch_.class_()) {
         if (((Qw_1)this.volatile_.class_[20]).v.class_(var1, var2)) {
            this.switch_ = true;
            this.class_(rdX_2.catch_);
            return true;
         } else {
            return super.class_(var1, var2, var3);
         }
      } else {
         boolean var4 = !this.class_(this.interface_) || this.interface_.break_();
         boolean var5 = Ve_1.class_(var1, var2).throws_().isPresent();
         if (var4 && var5 && this.class_(var1, var2)) {
            this.switch_ = true;
            return true;
         } else {
            String var6 = this.boolean_.private_();
            if (this.boolean_.class_(var1, var2, var3)) {
               if (!Objects.equals(var6, this.boolean_.private_())) {
                  this.char_();
               }

               return true;
            } else {
               return this.boolean_.aO_() && this.boolean_.int_() && var1 != 256 ? true : super.class_(var1, var2, var3);
            }
         }
      }
   }

   private boolean class_(rJY var1) {
      return var1 != null && var1.byte_ == case_;
   }

   @Override
   public void class_(QY var1, int var2, int var3) {
      String var4 = this.boolean_.private_();
      this.break_(var1, var2, var3);
      this.boolean_.class_(var4);
      if (!this.boolean_.private_().isEmpty()) {
         this.char_();
      }
   }

   @Override
   public boolean class_(char var1, int var2) {
      if (this.switch_) {
         return false;
      } else if (private_ != rdX_2.catch_.class_()) {
         return false;
      } else {
         String var3 = this.boolean_.private_();
         if (this.boolean_.class_(var1, var2)) {
            if (!Objects.equals(var3, this.boolean_.private_())) {
               this.char_();
            }

            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean class_(double var1, double var3, int var5) {
      if (var5 == 0) {
         double var6 = var1 - (double)this.char_;
         double var8 = var3 - (double)this.abstract_;
         this.finally_ = false;

         for (rdX_2 var13 : rdX_2.class_) {
            if (this.class_(var13, var6, var8)) {
               this.class_(var13);
               return true;
            }
         }
      }

      return super.class_(var1, var3, var5);
   }

   @Override
   protected void class_(Ml_1 var1, int var2, int var3) {
      rdX_2 var4 = rdX_2.class_[private_];
      if (var4.catch_()) {
         RenderSystem.disableBlend();
         this.super_.byte_(var1, var4.byte_(), 8.0F, 6.0F, 4210752);
      }
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      this.switch_ = false;
      return super.break_(var1, var2, var3);
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (var5 == 0) {
         double var6 = var1 - (double)this.char_;
         double var8 = var3 - (double)this.abstract_;

         for (rdX_2 var13 : rdX_2.class_) {
            if (this.class_(var13, var6, var8)) {
               return true;
            }
         }

         if (private_ != rdX_2.final_.class_() && this.protected_(var1, var3)) {
            this.finally_ = this.abstract_();
            return true;
         }
      }

      return super.break_(var1, var3, var5);
   }

   @Override
   protected void throws_() {
      int var1 = this.char_;
      super.throws_();
      if (this.boolean_ != null && this.char_ != var1) {
         this.boolean_.final_(this.char_ - 125);
      }
   }

   @Override
   public boolean finally_() {
      return false;
   }

   protected boolean protected_(double var1, double var3) {
      int var5 = this.char_;
      int var6 = this.abstract_;
      int var7 = var5 + 175;
      int var8 = var6 + 18;
      int var9 = var7 + 14;
      int var10 = var8 + 112;
      return var1 >= (double)var7 && var3 >= (double)var8 && var1 < (double)var9 && var3 < (double)var10;
   }

   @Override
   public void private_() {
      if (!((Ax_1)this.volatile_.class_[55]).catch_()) {
         this.volatile_.break_(new FH((cb_3)this.volatile_.class_[57]));
      } else if (this.boolean_ != null) {
         this.boolean_.catch_();
      }
   }

   private boolean abstract_() {
      return private_ != rdX_2.final_.class_() && rdX_2.class_[private_].implements_() && this.instanceof_.class_();
   }

   @Override
   public List<LZ> native_() {
      return null;
   }

   @Override
   protected void v_() {
      if (((Ax_1)this.volatile_.class_[55]).catch_()) {
         super.v_();
         ((Qj_1)this.volatile_.class_[23]).class_(true);
         this.boolean_ = new Lu_1(this.super_, this.char_ + 82, this.abstract_ + 6, 80, 9, new rgn_3("itemGroup.search"));
         this.boolean_.implements_(50);
         this.boolean_.protected_(false);
         this.boolean_.private_(false);
         this.boolean_.finally_(16777215);
         this.native_.add(this.boolean_);
         int var1 = private_;
         private_ = -1;
         this.class_(rdX_2.class_[var1]);
         ((rJT)((cb_3)this.volatile_.class_[57]).implements_[3]).break_(this.double_);
         this.double_ = new FZ(this.volatile_);
         ((rJT)((cb_3)this.volatile_.class_[57]).implements_[3]).class_(this.double_);
      } else {
         this.volatile_.break_(new FH((cb_3)this.volatile_.class_[57]));
      }
   }

   @Override
   public void w_() {
      super.w_();
      if ((cb_3)this.volatile_.class_[57] != null && (rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1] != null) {
         ((rJT)((cb_3)this.volatile_.class_[57]).implements_[3]).break_(this.double_);
      }

      ((Qj_1)this.volatile_.class_[23]).class_(false);
   }
}
