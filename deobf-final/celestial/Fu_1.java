package celestial;

import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class Fu_1<T extends rJr_1> extends vm_3 implements Zg_1, cl_3<T> {
   public static final rqO_2 else_ = new rqO_2("textures/gui/container/inventory.png");
   public int synchronized_ = 176;
   public int return_ = 166;
   protected int public_;
   protected int goto_;
   protected int while_;
   protected int try_;
   protected final T instanceof_;
   @Nullable
   protected final rhz_3 throw_;
   protected rJY interface_;
   private rJY class_;
   private rJY throws_;
   private rJY case_;
   private rJY catch_;
   protected int char_;
   protected int abstract_;
   private boolean private_;
   private rdn_3 implements_ = rdn_3.break_;
   private int finally_;
   private int boolean_;
   private long transient_;
   private rdn_3 for_ = rdn_3.break_;
   private long double_;
   protected final Set<rJY> long_ = Sets.newHashSet();
   protected boolean float_;
   private int switch_;
   private int r;
   private boolean P;
   private int B;
   private long S;
   private int s;
   private boolean E;
   private rdn_3 G = rdn_3.break_;

   @Override
   public rdn_3 byte_() {
      return this.interface_ != null ? this.interface_.class_() : null;
   }

   public rJY int_() {
      return this.interface_;
   }

   public Fu_1(T var1, rhz_3 var2, rgP_2 var3) {
      super(var3);
      this.instanceof_ = (T)var1;
      this.throw_ = var2;
      this.P = true;
      this.public_ = 8;
      this.goto_ = 6;
      this.while_ = 8;
      this.try_ = this.return_ - 94;
   }

   public void class_(rJY var1, int var2, int var3, rXa_1 var4) {
      if (var1 != null) {
         var2 = var1.protected_;
      }

      ((Ax_1)this.volatile_.class_[55]).class_(this.instanceof_.case_, var2, var3, var4, true);
   }

   protected boolean class_(int var1, int var2, int var3, int var4, double var5, double var7) {
      int var9 = this.char_;
      int var10 = this.abstract_;
      var5 -= (double)var9;
      var7 -= (double)var10;
      return var5 >= (double)(var1 - 1) && var5 < (double)(var1 + var3 + 1) && var7 >= (double)(var2 - 1) && var7 < (double)(var2 + var4 + 1);
   }

   public boolean class_(rJY var1, double var2, double var4) {
      return this.class_(var1.throws_, var1.case_, 16, 16, var2, var4);
   }

   @Override
   public boolean class_(double var1, double var3, int var5, double var6, double var8) {
      super.class_(var1, var3, var5, var6, var8);
      rJY var10 = this.protected_(var1, var3);
      rdn_3 var11 = ((rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1]).finally_();
      if (this.class_ != null && ((Qw_1)this.volatile_.class_[20]).S) {
         if (var5 == 0 || var5 == 1) {
            if (this.implements_.class_()) {
               if (var10 != this.class_ && !this.class_.class_().class_()) {
                  this.implements_ = this.class_.class_().implements_();
               }
            } else if (this.implements_.char_() > 1 && var10 != null && rJr_1.class_(var10, this.implements_, false)) {
               long var12 = rqR_2.break_();
               if (this.case_ == var10) {
                  if (var12 - this.double_ > 500L) {
                     this.class_(this.class_, this.class_.protected_, 0, rXa_1.PICKUP);
                     this.class_(var10, var10.protected_, 1, rXa_1.PICKUP);
                     this.class_(this.class_, this.class_.protected_, 0, rXa_1.PICKUP);
                     this.double_ = var12 + 750L;
                     this.implements_.catch_(1);
                  }
               } else {
                  this.case_ = var10;
                  this.double_ = var12;
               }
            }
         }
      } else if (this.float_
         && var10 != null
         && !var11.class_()
         && (var11.char_() > this.long_.size() || this.switch_ == 2)
         && rJr_1.class_(var10, var11, true)
         && var10.class_(var11)
         && this.instanceof_.class_(var10)) {
         this.long_.add(var10);
         this.finally_();
      }

      return true;
   }

   protected boolean class_(double var1, double var3, int var5, int var6, int var7) {
      return var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.synchronized_) || var3 >= (double)(var6 + this.return_);
   }

   @Override
   public boolean class_(double var1, double var3, int var5) {
      rJY var6 = this.protected_(var1, var3);
      int var7 = this.char_;
      int var8 = this.abstract_;
      boolean var9 = this.class_(var1, var3, var7, var8, var5);
      int var10 = -1;
      if (var6 != null) {
         var10 = var6.protected_;
      }

      if (var9) {
         var10 = -999;
      }

      if (this.E && var6 != null && var5 == 0 && this.instanceof_.class_(rdn_3.break_, var6)) {
         if (synchronized_()) {
            if (!this.G.class_()) {
               for (rJY var16 : this.instanceof_.throws_) {
                  if (var16 != null
                     && var16.class_((cb_3)this.volatile_.class_[57])
                     && var16.break_()
                     && var16.byte_ == var6.byte_
                     && rJr_1.class_(var16, this.G, true)) {
                     this.class_(var16, var16.protected_, var5, rXa_1.QUICK_MOVE);
                  }
               }
            }
         } else {
            this.class_(var6, var10, var5, rXa_1.PICKUP_ALL);
         }

         this.E = false;
         this.S = 0L;
      } else {
         if (this.float_ && this.r != var5) {
            this.float_ = false;
            this.long_.clear();
            this.P = true;
            return true;
         }

         if (this.P) {
            this.P = false;
            return true;
         }

         if (this.class_ != null && ((Qw_1)this.volatile_.class_[20]).S) {
            if (var5 == 0 || var5 == 1) {
               if (this.implements_.class_() && var6 != this.class_) {
                  this.implements_ = this.class_.class_();
               }

               boolean var14 = rJr_1.class_(var6, this.implements_, false);
               if (var10 != -1 && !this.implements_.class_() && var14) {
                  this.class_(this.class_, this.class_.protected_, var5, rXa_1.PICKUP);
                  this.class_(var6, var10, 0, rXa_1.PICKUP);
                  if (((rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1]).finally_().class_()) {
                     this.for_ = rdn_3.break_;
                  } else {
                     this.class_(this.class_, this.class_.protected_, var5, rXa_1.PICKUP);
                     this.finally_ = rfU_2.byte_(var1 - (double)var7);
                     this.boolean_ = rfU_2.byte_(var3 - (double)var8);
                     this.throws_ = this.class_;
                     this.for_ = this.implements_;
                     this.transient_ = rqR_2.break_();
                  }
               } else if (!this.implements_.class_()) {
                  this.finally_ = rfU_2.byte_(var1 - (double)var7);
                  this.boolean_ = rfU_2.byte_(var3 - (double)var8);
                  this.throws_ = this.class_;
                  this.for_ = this.implements_;
                  this.transient_ = rqR_2.break_();
               }

               this.implements_ = rdn_3.break_;
               this.class_ = null;
            }
         } else if (this.float_ && !this.long_.isEmpty()) {
            this.class_(null, -999, rJr_1.byte_(0, this.switch_), rXa_1.QUICK_CRAFT);

            for (rJY var12 : this.long_) {
               this.class_(var12, var12.protected_, rJr_1.byte_(1, this.switch_), rXa_1.QUICK_CRAFT);
            }

            this.class_(null, -999, rJr_1.byte_(2, this.switch_), rXa_1.QUICK_CRAFT);
         } else if (!((rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1]).finally_().class_()) {
            if (((Qw_1)this.volatile_.class_[20]).Z.class_(var5)) {
               this.class_(var6, var10, var5, rXa_1.CLONE);
            } else {
               boolean var11 = var10 != -999
                  && (Ve_1.class_(QY.instanceof_().else_().implements_(), 340) || Ve_1.class_(QY.instanceof_().else_().implements_(), 344));
               if (var11) {
                  this.G = var6 != null && var6.break_() ? var6.class_().implements_() : rdn_3.break_;
               }

               this.class_(var6, var10, var5, var11 ? rXa_1.QUICK_MOVE : rXa_1.PICKUP);
            }
         }
      }

      if (((rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1]).finally_().class_()) {
         this.S = 0L;
      }

      this.float_ = false;
      return super.class_(var1, var3, var5);
   }

   protected boolean class_(int var1, int var2) {
      if (((rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1]).finally_().class_() && this.interface_ != null) {
         if (((Qw_1)this.volatile_.class_[20]).Q.class_(var1, var2)) {
            this.class_(this.interface_, this.interface_.protected_, 40, rXa_1.SWAP);
            return true;
         }

         for (int var3 = 0; var3 < 9; var3++) {
            if (((Qw_1)this.volatile_.class_[20]).t[var3].class_(var1, var2)) {
               this.class_(this.interface_, this.interface_.protected_, var3, rXa_1.SWAP);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      String var5 = this.extends_.byte_();
      rrns_3 var6 = rrns_3.class_(this, this.instanceof_.throws_, var5, (float)var2, (float)var3, this.char_, this.abstract_);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var6);
      if (!var6.byte_()) {
         int var7 = var6.protected_();
         int var8 = var6.private_();
         this.class_(var1, var4, var2, var3);
         RenderSystem.disableRescaleNormal();
         RenderSystem.disableDepthTest();
         super.class_(var1, var2, var3, var4);
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)var7, (float)var8, 0.0F);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.enableRescaleNormal();
         this.interface_ = null;
         RenderSystem.glMultiTexCoord2f(33986, 240.0F, 240.0F);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);

         for (rJY var11 : var6.throws_()) {
            if (var11.case_()) {
               this.class_(var1, var11);
            }

            if (this.class_(var11, (double)var2, (double)var3) && var11.case_()) {
               this.interface_ = var11;
               RenderSystem.disableDepthTest();
               int var12 = var11.throws_;
               int var13 = var11.case_;
               RenderSystem.colorMask(true, true, true, false);
               this.class_(var1, var12, var13, var12 + 16, var13 + 16, -2130706433, -2130706433);
               RenderSystem.colorMask(true, true, true, true);
               RenderSystem.enableDepthTest();
            }
         }

         this.class_(var1, var2, var3);
         rhz_3 var17 = (rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1];
         rdn_3 var18 = this.implements_.class_() ? var17.finally_() : this.implements_;
         if (!var18.class_()) {
            int var19 = this.implements_.class_() ? 8 : 16;
            String var21 = null;
            if (!this.implements_.class_() && this.private_) {
               var18 = var18.implements_();
               var18.throws_(rfU_2.case_((float)var18.char_() / 2.0F));
            } else if (this.float_ && this.long_.size() > 1) {
               var18 = var18.implements_();
               var18.throws_(this.B);
               if (var18.class_()) {
                  var21 = rgF_2.YELLOW + "0";
               }
            }

            this.class_(var18, var2 - var7 - 8, var3 - var8 - var19, var21);
         }

         if (!this.for_.class_()) {
            float var20 = (float)(rqR_2.break_() - this.transient_) / 100.0F;
            if (var20 >= 1.0F) {
               var20 = 1.0F;
               this.for_ = rdn_3.break_;
            }

            int var22 = this.throws_.throws_ - this.finally_;
            int var14 = this.throws_.case_ - this.boolean_;
            int var15 = this.finally_ + (int)((float)var22 * var20);
            int var16 = this.boolean_ + (int)((float)var14 * var20);
            this.class_(this.for_, var15, var16, null);
         }

         RenderSystem.popMatrix();
         RenderSystem.enableDepthTest();
      }
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (super.class_(var1, var2, var3)) {
         return true;
      } else if (((Qw_1)this.volatile_.class_[20]).z.class_(var1, var2)) {
         if (!rrFY.class_(this).byte_()) {
            this.volatile_();
            return true;
         } else {
            return false;
         }
      } else {
         this.class_(var1, var2);
         if (this.interface_ != null && this.interface_.break_()) {
            if (((Qw_1)this.volatile_.class_[20]).Z.class_(var1, var2)) {
               this.class_(this.interface_, this.interface_.protected_, 0, rXa_1.CLONE);
            } else if (((Qw_1)this.volatile_.class_[20]).N.class_(var1, var2)) {
               rdn_3 var4 = this.interface_.class_().implements_();
               this.class_(this.interface_, this.interface_.protected_, else_() ? 1 : 0, rXa_1.THROW);
               rrLV.class_(var4, this, (rrLg_1)rrLg_1.staticFields83bfa4843c3c3647913690fe22963b15[0]);
            }
         }

         return true;
      }
   }

   public void class_(rdn_3 var1, int var2, int var3, String var4) {
      RenderSystem.translatef(0.0F, 0.0F, 32.0F);
      this.class_(200);
      this.final_.break_ = 200.0F;
      this.final_.class_(var1, var2, var3);
      this.final_.class_(this.super_, var1, (float)var2, (float)(var3 - (this.implements_.class_() ? 0 : 8)), var4);
      this.class_(0);
      this.final_.break_ = 0.0F;
   }

   protected abstract void class_(Ml_1 var1, float var2, int var3, int var4);

   private void class_(Ml_1 var1, rJY var2) {
      int var3 = var2.throws_;
      int var4 = var2.case_;
      rdn_3 var5 = var2.class_();
      boolean var6 = false;
      boolean var7 = var2 == this.class_ && !this.implements_.class_() && !this.private_;
      rdn_3 var8 = ((rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1]).finally_();
      String var9 = null;
      if (var2 == this.class_ && !this.implements_.class_() && this.private_ && !var5.class_()) {
         var5 = var5.implements_();
         var5.throws_(var5.char_() / 2);
      } else if (this.float_ && this.long_.contains(var2) && !var8.class_()) {
         if (this.long_.size() == 1) {
            return;
         }

         if (rJr_1.class_(var2, var8, true) && this.instanceof_.class_(var2)) {
            var5 = var8.implements_();
            var6 = true;
            rJr_1.class_(this.long_, this.switch_, var5, var2.class_().class_() ? 0 : var2.class_().char_());
            int var10 = Math.min(var5.byte_(), var2.byte_(var5));
            if (var5.char_() > var10) {
               var9 = rgF_2.YELLOW.toString() + var10;
               var5.throws_(var10);
            }
         } else {
            this.long_.remove(var2);
            this.finally_();
         }
      }

      this.class_(100);
      this.final_.break_ = 100.0F;
      if (var5.class_() && var2.case_()) {
         Pair var12 = var2.throws_();
         if (var12 != null) {
            fj_3 var11 = this.volatile_.class_((rqO_2)var12.getFirst()).apply((rqO_2)var12.getSecond());
            this.volatile_.A().class_(var11.extends_().protected_());
            class_(var1, var3, var4, this.h_(), 16, 16, var11);
            var7 = true;
         }
      }

      if (!var7) {
         if (var6) {
            class_(var1, var3, var4, var3 + 16, var4 + 16, -2130706433);
         }

         RenderSystem.enableDepthTest();
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAD.class_(var1, var2, var3, var4, 16, 16));
         this.final_.class_((cb_3)this.volatile_.class_[57], var5, (float)var3, (float)var4);
         this.final_.class_(this.super_, var5, (float)var3, (float)var4, var9);
      }

      this.final_.break_ = 0.0F;
      this.class_(0);
   }

   protected void class_(Ml_1 var1, int var2, int var3) {
      this.super_.byte_(var1, this.extends_, (float)this.public_, (float)this.goto_, 4210752);
      if (this.throw_ != null) {
         this.super_.byte_(var1, this.throw_.L_(), (float)this.while_, (float)this.try_, 4210752);
      }
   }

   protected void break_(Ml_1 var1, int var2, int var3) {
      if (((rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1]).finally_().class_() && this.interface_ != null && this.interface_.break_()) {
         this.class_(var1, this.interface_.class_(), var2, var3);
      }
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (super.break_(var1, var3, var5)) {
         return true;
      } else {
         boolean var6 = ((Qw_1)this.volatile_.class_[20]).Z.class_(var5);
         rJY var7 = this.protected_(var1, var3);
         long var8 = rqR_2.break_();
         this.E = this.catch_ == var7 && var8 - this.S < 250L && this.s == var5;
         this.P = false;
         if (var5 != 0 && var5 != 1 && !var6) {
            this.break_(var5);
         } else {
            int var10 = this.char_;
            int var11 = this.abstract_;
            boolean var12 = this.class_(var1, var3, var10, var11, var5);
            int var13 = -1;
            if (var7 != null) {
               var13 = var7.protected_;
            }

            if (var12) {
               var13 = -999;
            }

            if (((Qw_1)this.volatile_.class_[20]).S && var12 && ((rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1]).finally_().class_()) {
               this.volatile_.break_(null);
               return true;
            }

            if (var13 != -1) {
               if (((Qw_1)this.volatile_.class_[20]).S) {
                  if (var7 != null && var7.break_()) {
                     this.class_ = var7;
                     this.implements_ = rdn_3.break_;
                     this.private_ = var5 == 1;
                  } else {
                     this.class_ = null;
                  }
               } else if (!this.float_) {
                  if (((rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1]).finally_().class_()) {
                     if (((Qw_1)this.volatile_.class_[20]).Z.class_(var5)) {
                        this.class_(var7, var13, var5, rXa_1.CLONE);
                     } else {
                        boolean var14 = var13 != -999
                           && (Ve_1.class_(QY.instanceof_().else_().implements_(), 340) || Ve_1.class_(QY.instanceof_().else_().implements_(), 344));
                        rXa_1 var15 = rXa_1.PICKUP;
                        if (var14) {
                           this.G = var7 != null && var7.break_() ? var7.class_().implements_() : rdn_3.break_;
                           var15 = rXa_1.QUICK_MOVE;
                        } else if (var13 == -999) {
                           var15 = rXa_1.THROW;
                        }

                        this.class_(var7, var13, var5, var15);
                     }

                     this.P = true;
                  } else {
                     this.float_ = true;
                     this.r = var5;
                     this.long_.clear();
                     if (var5 == 0) {
                        this.switch_ = 0;
                     } else if (var5 == 1) {
                        this.switch_ = 1;
                     } else if (((Qw_1)this.volatile_.class_[20]).Z.class_(var5)) {
                        this.switch_ = 2;
                     }
                  }
               }
            }
         }

         this.catch_ = var7;
         this.S = var8;
         this.s = var5;
         return true;
      }
   }

   private void break_(int var1) {
      if (this.interface_ != null && ((rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1]).finally_().class_()) {
         if (((Qw_1)this.volatile_.class_[20]).Q.class_(var1)) {
            this.class_(this.interface_, this.interface_.protected_, 40, rXa_1.SWAP);
            return;
         }

         for (int var2 = 0; var2 < 9; var2++) {
            if (((Qw_1)this.volatile_.class_[20]).t[var2].class_(var1)) {
               this.class_(this.interface_, this.interface_.protected_, var2, rXa_1.SWAP);
            }
         }
      }
   }

   private void finally_() {
      rdn_3 var1 = ((rhz_3)((cb_3)this.volatile_.class_[57]).implements_[1]).finally_();
      if (!var1.class_() && this.float_) {
         if (this.switch_ == 2) {
            this.B = var1.byte_();
         } else {
            this.B = var1.char_();

            for (rJY var3 : this.long_) {
               rdn_3 var4 = var1.implements_();
               rdn_3 var5 = var3.class_();
               int var6 = var5.class_() ? 0 : var5.char_();
               rJr_1.class_(this.long_, this.switch_, var4, var6);
               int var7 = Math.min(var4.byte_(), var3.byte_(var4));
               if (var4.char_() > var7) {
                  var4.throws_(var7);
               }

               this.B = this.B - (var4.char_() - var6);
            }
         }
      }
   }

   private rJY protected_(double var1, double var3) {
      for (int var5 = 0; var5 < this.instanceof_.throws_.size(); var5++) {
         rJY var6 = this.instanceof_.throws_.get(var5);
         if (this.class_(var6, var1, var3) && var6.case_()) {
            return var6;
         }
      }

      return null;
   }

   @Override
   public void private_() {
      super.private_();
      if (!((cb_3)this.volatile_.class_[57]).BM() || (Boolean)((cb_3)this.volatile_.class_[57]).throws_[27]) {
         ((cb_3)this.volatile_.class_[57]).strictfp_();
      }
   }

   @Override
   public void volatile_() {
      ((cb_3)this.volatile_.class_[57]).strictfp_();
      super.volatile_();
   }

   @Override
   protected void v_() {
      super.v_();
      this.char_ = (this.package_ - this.synchronized_) / 2;
      this.abstract_ = (this.int_ - this.return_) / 2;
   }

   @Override
   public boolean z_() {
      return false;
   }

   @Override
   public void w_() {
      super.w_();
      if ((cb_3)this.volatile_.class_[57] != null) {
         this.instanceof_.break_((cb_3)this.volatile_.class_[57]);
      }
   }

   @Override
   public T G_() {
      return this.instanceof_;
   }
}
