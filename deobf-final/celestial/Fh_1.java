package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Fh_1 extends Fu_1<rXT> {
   static final rqO_2 class_ = new rqO_2("textures/gui/container/beacon.png");
   private static final rgP_2 throws_ = new rgn_3("block.minecraft.beacon.primary");
   private static final rgP_2 case_ = new rgn_3("block.minecraft.beacon.secondary");
   private Fd_1 catch_;
   boolean private_;
   rLR implements_;
   rLR finally_;

   public Fh_1(rXT var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
      this.synchronized_ = 230;
      this.return_ = 219;
      var1.class_(new FX(this, var1));
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      super.class_(var1, var2, var3, var4);
      this.break_(var1, var2, var3);
   }

   @Override
   protected void class_(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.volatile_.A().class_(class_);
      int var5 = (this.package_ - this.synchronized_) / 2;
      int var6 = (this.int_ - this.return_) / 2;
      this.break_(var1, var5, var6, 0, 0, this.synchronized_, this.return_);
      this.final_.break_ = 100.0F;
      this.final_.class_(new rdn_3(rdy_3.Ok), var5 + 20, var6 + 109);
      this.final_.class_(new rdn_3(rdy_3.dP), var5 + 41, var6 + 109);
      this.final_.class_(new rdn_3(rdy_3.OJ), var5 + 41 + 22, var6 + 109);
      this.final_.class_(new rdn_3(rdy_3.Od), var5 + 42 + 44, var6 + 109);
      this.final_.class_(new rdn_3(rdy_3.Ox), var5 + 42 + 66, var6 + 109);
      this.final_.break_ = 0.0F;
   }

   @Override
   protected void class_(Ml_1 var1, int var2, int var3) {
      class_(var1, this.super_, throws_, 62, 10, 14737632);
      class_(var1, this.super_, case_, 169, 10, 14737632);

      for (LZ var5 : this.new_) {
         if (var5.B_()) {
            var5.class_(var1, var2 - this.char_, var3 - this.abstract_);
            break;
         }
      }
   }

   @Override
   public void private_() {
      super.private_();
      int var1 = this.instanceof_.class_();
      if (this.private_ && var1 >= 0) {
         this.private_ = false;

         for (int var2 = 0; var2 <= 2; var2++) {
            int var3 = rHO.class_[var2].length;
            int var4 = var3 * 22 + (var3 - 1) * 2;

            for (int var5 = 0; var5 < var3; var5++) {
               rLR var6 = rHO.class_[var2][var5];
               Fk_1 var7 = new Fk_1(this, this.char_ + 76 + var5 * 24 - var4 / 2, this.abstract_ + 22 + var2 * 25, var6, true);
               this.class_(var7);
               if (var2 >= var1) {
                  var7.int_ = false;
               } else if (var6 == this.implements_) {
                  var7.class_(true);
               }
            }
         }

         byte var8 = 3;
         int var9 = rHO.class_[3].length + 1;
         int var10 = var9 * 22 + (var9 - 1) * 2;

         for (int var11 = 0; var11 < var9 - 1; var11++) {
            rLR var13 = rHO.class_[3][var11];
            Fk_1 var14 = new Fk_1(this, this.char_ + 167 + var11 * 24 - var10 / 2, this.abstract_ + 47, var13, false);
            this.class_(var14);
            if (3 >= var1) {
               var14.int_ = false;
            } else if (var13 == this.finally_) {
               var14.class_(true);
            }
         }

         if (this.implements_ != null) {
            Fk_1 var12 = new Fk_1(this, this.char_ + 167 + (var9 - 1) * 24 - var10 / 2, this.abstract_ + 47, this.implements_, false);
            this.class_(var12);
            if (3 >= var1) {
               var12.int_ = false;
            } else if (this.implements_ == this.finally_) {
               var12.class_(true);
            }
         }
      }

      this.catch_.int_ = this.instanceof_.protected_() && this.implements_ != null;
   }

   @Override
   protected void v_() {
      super.v_();
      this.catch_ = this.class_(new Fd_1(this, this.char_ + 164, this.abstract_ + 107));
      this.class_(new Fx_1(this, this.char_ + 190, this.abstract_ + 107));
      this.private_ = true;
      this.catch_.int_ = false;
   }
}
