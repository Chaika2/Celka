package celestial;

import java.util.EnumSet;

public class rBc_1 extends rSM {
   private static final ay_3 class_ = new ay_3().byte_().throws_();
   private boolean break_;
   private int byte_;
   private final Class<?>[] protected_;
   private Class<?>[] implements_;

   @Override
   public void byte_() {
      this.throws_.byte_(this.throws_.Sr());
      this.catch_ = this.throws_.I_();
      this.byte_ = this.throws_.Sb();
      this.private_ = 300;
      if (this.break_) {
         this.catch_();
      }

      super.byte_();
   }

   public rBc_1(aA_2 var1, Class<?>... var2) {
      super(var1, true);
      this.protected_ = var2;
      this.class_(EnumSet.of(rBW.TARGET));
   }

   protected void class_(is_3 var1, iB_2 var2) {
      var1.byte_(var2);
   }

   public rBc_1 class_(Class<?>... var1) {
      this.break_ = true;
      this.implements_ = var1;
      return this;
   }

   @Override
   public boolean class_() {
      int var1 = this.throws_.Sb();
      iB_2 var2 = this.throws_.Sr();
      if (var1 != this.byte_ && var2 != null) {
         if (var2.BC() == aI_2.rM && ((rYB)this.throws_.throws_[7]).B().break_(rRu_1.long_)) {
            return false;
         } else {
            for (Class var6 : this.protected_) {
               if (var6.isAssignableFrom(var2.getClass())) {
                  return false;
               }
            }

            return this.class_(var2, class_);
         }
      } else {
         return false;
      }
   }

   protected void catch_() {
      double var1 = this.extends_();
      rfl_3 var3 = rfl_3.class_(this.throws_.Ps()).byte_(var1, 10.0, var1);

      label56:
      for (is_3 var6 : ((rYB)this.throws_.throws_[7]).break_(this.throws_.getClass(), var3)) {
         if (this.throws_ != var6
            && var6.I_() == null
            && (!(this.throws_ instanceof rOQ) || ((rOQ)this.throws_).sF() == ((rOQ)var6).sF())
            && !var6.final_(this.throws_.Sr())) {
            if (this.implements_ != null) {
               boolean var7 = false;
               Class[] var8 = this.implements_;
               int var9 = var8.length;
               int var10 = 0;

               while (true) {
                  if (var10 < var9) {
                     Class var11 = var8[var10];
                     if (var6.getClass() != var11) {
                        var10++;
                        continue;
                     }

                     var7 = true;
                  }

                  if (!var7) {
                     break;
                  }
                  continue label56;
               }
            }

            this.class_(var6, this.throws_.Sr());
         }
      }
   }
}
