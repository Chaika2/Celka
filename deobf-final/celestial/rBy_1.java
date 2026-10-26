package celestial;

import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;

public class rBy_1 extends rBk_1 {
   protected final aA_2 class_;
   private final double break_;
   private rLC byte_;
   private rfH_2 protected_;
   private final boolean throws_;
   private final List<rfH_2> case_ = Lists.newArrayList();
   private final int catch_;
   private final BooleanSupplier private_;

   @Override
   public void byte_() {
      this.class_.public_().class_(this.byte_, this.break_);
   }

   public rBy_1(aA_2 var1, double var2, boolean var4, int var5, BooleanSupplier var6) {
      this.class_ = var1;
      this.break_ = var2;
      this.throws_ = var4;
      this.catch_ = var5;
      this.private_ = var6;
      this.class_(EnumSet.of(rBW.MOVE));
      if (!rpc_3.class_(var1)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   private boolean class_(rfH_2 var1) {
      for (rfH_2 var3 : this.case_) {
         if (Objects.equals(var1, var3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean class_() {
      if (!rpc_3.class_(this.class_)) {
         return false;
      } else {
         this.catch_();
         if (this.throws_ && ((rYB)this.class_.throws_[7]).strictfp_()) {
            return false;
         } else {
            rrEm_1 var1 = (rrEm_1)((rYB)this.class_.throws_[7]);
            rfH_2 var2 = this.class_.Bs();
            if (!var1.byte_(var2, 6)) {
               return false;
            } else {
               rjU_2 var3 = iX_2.class_(this.class_, 15, 7, var3x -> {
                  if (!var1.throw_(var3x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional var4x = var1.d().byte_(rRP.break_, this::class_, var3x, 10, rRr_1.IS_OCCUPIED);
                     return !var4x.isPresent() ? Double.NEGATIVE_INFINITY : -((rfH_2)var4x.get()).private_(var2);
                  }
               });
               if (var3 == null) {
                  return false;
               } else {
                  Optional var4 = var1.d().byte_(rRP.break_, this::class_, new rfH_2(var3), 10, rRr_1.IS_OCCUPIED);
                  if (!var4.isPresent()) {
                     return false;
                  } else {
                     this.protected_ = ((rfH_2)var4.get()).int_();
                     rLA var5 = (rLA)this.class_.public_();
                     boolean var6 = var5.throws_();
                     var5.class_(this.private_.getAsBoolean());
                     this.byte_ = var5.class_(this.protected_, 0);
                     var5.class_(var6);
                     if (this.byte_ == null) {
                        rjU_2 var7 = iX_2.break_(this.class_, 10, 7, rjU_2.protected_(this.protected_));
                        if (var7 == null) {
                           return false;
                        }

                        var5.class_(this.private_.getAsBoolean());
                        this.byte_ = this.class_.public_().class_(var7.break_, var7.byte_, var7.protected_, 0);
                        var5.class_(var6);
                        if (this.byte_ == null) {
                           return false;
                        }
                     }

                     for (int var10 = 0; var10 < this.byte_.throws_(); var10++) {
                        rLq_1 var8 = this.byte_.class_(var10);
                        rfH_2 var9 = new rfH_2(var8.class_, var8.break_ + 1, var8.byte_);
                        if (dN_2.class_((rYB)this.class_.throws_[7], var9)) {
                           this.byte_ = this.class_.public_().class_((double)var8.class_, (double)var8.break_, (double)var8.byte_, 0);
                           break;
                        }
                     }

                     return this.byte_ != null;
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean break_() {
      return this.class_.public_().native_() ? false : !this.protected_.class_(this.class_.Ps(), (double)(this.class_.PN() + (float)this.catch_));
   }

   private void catch_() {
      if (this.case_.size() > 15) {
         this.case_.remove(0);
      }
   }

   @Override
   public void protected_() {
      if (this.class_.public_().native_() || this.protected_.class_(this.class_.Ps(), (double)this.catch_)) {
         this.case_.add(this.protected_);
      }
   }
}
