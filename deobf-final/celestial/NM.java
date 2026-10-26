package celestial;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import java.util.Random;

public class NM implements NW {
   private final cb_3 class_;
   private final Nf_1 break_;
   private final rYA byte_;
   private final Random protected_;
   private Object2ObjectArrayMap<rYG, NO> throws_ = new Object2ObjectArrayMap();
   private Optional<rYj_1> case_ = Optional.empty();
   private Optional<rYg_1> catch_ = Optional.empty();
   private float private_;
   private rYG implements_;

   public NM(cb_3 var1, Nf_1 var2, rYA var3) {
      this.protected_ = ((rYB)var1.throws_[7]).long_();
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public float class_() {
      return this.private_;
   }

   @Override
   public void break_() {
      this.throws_.values().removeIf(cr_3::continue_);
      rYG var1 = this.byte_.class_(this.class_.rx(), this.class_.re(), this.class_.BO());
      if (var1 != this.implements_) {
         this.implements_ = var1;
         this.case_ = var1.new_();
         this.catch_ = var1.continue_();
         this.throws_.values().forEach(NO::class_);
         var1.int_().ifPresent(var2 -> {
            NO var3 = (NO)this.throws_.compute(var1, (var2x, var3x) -> {
               if (var3x == null) {
                  var3x = new NO(var2);
                  this.break_.class_((NQ)var3x);
               }

               var3x.break_();
               return var3x;
            });
         });
      }

      this.catch_.ifPresent(var1x -> {
         if (this.protected_.nextDouble() < var1x.break_()) {
            this.break_.class_(Np_1.break_(var1x.class_()));
         }
      });
      this.case_
         .ifPresent(
            var1x -> {
               rYB var2 = (rYB)this.class_.throws_[7];
               int var3 = var1x.byte_() * 2 + 1;
               rfH_2 var4 = new rfH_2(
                  this.class_.rx() + (double)this.protected_.nextInt(var3) - (double)var1x.byte_(),
                  this.class_.rH() + (double)this.protected_.nextInt(var3) - (double)var1x.byte_(),
                  this.class_.BO() + (double)this.protected_.nextInt(var3) - (double)var1x.byte_()
               );
               int var5 = var2.class_(rRo_1.SKY, var4);
               if (var5 > 0) {
                  this.private_ = this.private_ - (float)var5 / (float)var2.while_() * 0.001F;
               } else {
                  this.private_ = this.private_ - (float)(var2.class_(rRo_1.BLOCK, var4) - 1) / (float)var1x.break_();
               }

               if (this.private_ >= 1.0F) {
                  double var6 = (double)var4.b_() + 0.5;
                  double var8 = (double)var4.c_() + 0.5;
                  double var10 = (double)var4.d_() + 0.5;
                  double var12 = var6 - this.class_.rx();
                  double var14 = var8 - this.class_.rH();
                  double var16 = var10 - this.class_.BO();
                  double var18 = (double)rfU_2.class_(var12 * var12 + var14 * var14 + var16 * var16);
                  double var20 = var18 + var1x.protected_();
                  Np_1 var22 = Np_1.break_(
                     var1x.class_(),
                     this.class_.rx() + var12 / var18 * var20,
                     this.class_.rH() + var14 / var18 * var20,
                     this.class_.BO() + var16 / var18 * var20
                  );
                  this.break_.class_(var22);
                  this.private_ = 0.0F;
               } else {
                  this.private_ = Math.max(this.private_, 0.0F);
               }
            }
         );
   }
}
