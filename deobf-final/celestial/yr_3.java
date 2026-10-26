package celestial;

import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

final class yr_3 extends HU {
   private static final ObjectOpenCustomHashSet<yr_3> E = new ObjectOpenCustomHashSet(yP_2.INSTANCE);
   final Ha_1 G;
   final int b;
   private final Optional<HU> M;
   private final boolean O;
   private Map<rqO_2, yr_3> h = new HashMap<>();

   @Override
   public rqO_2 float_() {
      Optional var1 = this.G.class_.protected_();
      return !var1.isPresent() ? null : (rqO_2)var1.get();
   }

   private yr_3(String var1, jZ_2 var2, int var3, int var4, boolean var5, boolean var6, Ha_1 var7) {
      super(var1, var2, var3, var4, var5, var6, () -> rrxL_2.class_(var7.new_), () -> rrxL_2.break_(var7.new_));
      this.G = var7;
      this.M = var7.int_ == He_1.AFFECTS_OUTLINE ? var7.class_.protected_().map(var1x -> class_(var1x, var7.catch_)) : Optional.empty();
      this.O = var7.int_ == He_1.IS_OUTLINE;
      this.b = rrWX.class_(super.hashCode(), var7);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1;
   }

   @Override
   public String toString() {
      return this.class_ + ":RenderType[" + this.G + ", ]";
   }

   @Override
   public int hashCode() {
      return this.b;
   }

   static yr_3 break_(String var0, jZ_2 var1, int var2, int var3, boolean var4, boolean var5, Ha_1 var6) {
      return (yr_3)E.addOrGet(new yr_3(var0, var1, var2, var3, var4, var5, var6));
   }

   @Override
   public Optional<HU> instanceof_() {
      return this.M;
   }

   public yr_3 super_(rqO_2 var1) {
      if (var1 == null) {
         return this;
      } else {
         Optional var2 = this.G.class_.protected_();
         if (!var2.isPresent()) {
            return this;
         } else {
            rqO_2 var3 = (rqO_2)var2.get();
            if (var3 == null) {
               return this;
            } else if (var1.equals(var3)) {
               return this;
            } else {
               yr_3 var4 = this.h.get(var1);
               if (var4 == null) {
                  Hi_1 var5 = this.G.break_();
                  var5.class_(new HR(var1, this.G.class_.throws_(), this.G.class_.case_()));
                  Ha_1 var6 = var5.class_(this.O);
                  var4 = class_(this.class_, this.while_(), this.try_(), this.goto_(), this.interface_(), this.throws_(), var6);
                  this.h.put(var1, var4);
               }

               return var4;
            }
         }
      }
   }

   @Override
   public boolean throw_() {
      return this.O;
   }
}
