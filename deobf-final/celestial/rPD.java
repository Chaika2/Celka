package celestial;

import java.util.EnumSet;
import java.util.function.Predicate;

public class rPD<T extends iB_2> extends rBk_1 {
   protected final aA_2 class_;
   private final double implements_;
   private final double finally_;
   protected T break_;
   protected final float byte_;
   protected rLC protected_;
   protected final rLy_1 throws_;
   protected final Class<T> case_;
   protected final Predicate<iB_2> catch_;
   protected final Predicate<iB_2> private_;
   private final ay_3 extends_;

   @Override
   public void byte_() {
      this.throws_.class_(this.protected_, this.implements_);
   }

   public rPD(aA_2 var1, Class<T> var2, float var3, double var4, double var6) {
      this(var1, var2, var0 -> true, var3, var4, var6, rpJ_2.throws_::test);
   }

   public rPD(aA_2 var1, Class<T> var2, float var3, double var4, double var6, Predicate<iB_2> var8) {
      this(var1, var2, var0 -> true, var3, var4, var6, var8);
   }

   public rPD(aA_2 var1, Class<T> var2, Predicate<iB_2> var3, float var4, double var5, double var7, Predicate<iB_2> var9) {
      this.class_ = var1;
      this.case_ = var2;
      this.catch_ = var3;
      this.byte_ = var4;
      this.implements_ = var5;
      this.finally_ = var7;
      this.private_ = var9;
      this.throws_ = var1.public_();
      this.class_(EnumSet.of(rBW.MOVE));
      this.extends_ = new ay_3().class_((double)var4).class_(var9.and(var3));
   }

   @Override
   public boolean class_() {
      this.break_ = ((rYB)this.class_.throws_[7])
         .break_(
            this.case_,
            this.extends_,
            this.class_,
            this.class_.rx(),
            this.class_.re(),
            this.class_.BO(),
            this.class_.rN().byte_((double)this.byte_, 3.0, (double)this.byte_)
         );
      if (this.break_ == null) {
         return false;
      } else {
         rjU_2 var1 = iX_2.byte_(this.class_, 16, 7, this.break_.Ps());
         if (var1 == null) {
            return false;
         } else if (this.break_.class_(var1.break_, var1.byte_, var1.protected_) < this.break_.int_(this.class_)) {
            return false;
         } else {
            this.protected_ = this.throws_.class_(var1.break_, var1.byte_, var1.protected_, 0);
            return this.protected_ != null;
         }
      }
   }

   @Override
   public boolean break_() {
      return !this.throws_.native_();
   }

   @Override
   public void throws_() {
      if (this.class_.int_(this.break_) < 49.0) {
         this.class_.public_().class_(this.finally_);
      } else {
         this.class_.public_().class_(this.implements_);
      }
   }

   @Override
   public void protected_() {
      this.break_ = null;
   }
}
