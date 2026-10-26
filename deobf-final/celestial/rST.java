package celestial;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class rST<T extends rSl_1> {
   private static rST<?>[] native_ = new rST[0];
   public static final rST<rSn_1> class_ = class_(rSn_1.class, "HoldingPattern");
   public static final rST<rSI> break_ = class_(rSI.class, "StrafePlayer");
   public static final rST<rSH> byte_ = class_(rSH.class, "LandingApproach");
   public static final rST<rSy_1> protected_ = class_(rSy_1.class, "Landing");
   public static final rST<rSf_1> throws_ = class_(rSf_1.class, "Takeoff");
   public static final rST<rSA> case_ = class_(rSA.class, "SittingFlaming");
   public static final rST<rSt_1> catch_ = class_(rSt_1.class, "SittingScanning");
   public static final rST<rSv_1> private_ = class_(rSv_1.class, "SittingAttacking");
   public static final rST<rSF> implements_ = class_(rSF.class, "ChargingPlayer");
   public static final rST<rSL> finally_ = class_(rSL.class, "Dying");
   public static final rST<rSC> extends_ = class_(rSC.class, "Hover");
   private final Class<? extends rSl_1> volatile_;
   private final int final_;
   private final String package_;

   public static int byte_() {
      return native_.length;
   }

   private rST(int var1, Class<? extends rSl_1> var2, String var3) {
      this.final_ = var1;
      this.volatile_ = var2;
      this.package_ = var3;
   }

   @Override
   public String toString() {
      return this.package_ + " (#" + this.final_ + ")";
   }

   private static <T extends rSl_1> rST<T> class_(Class<T> var0, String var1) {
      rST var2 = new rST(native_.length, var0, var1);
      native_ = Arrays.copyOf(native_, native_.length + 1);
      native_[var2.break_()] = var2;
      return var2;
   }

   public rSl_1 class_(rSu_1 var1) {
      try {
         Constructor var2 = this.class_();
         return (rSl_1)var2.newInstance(var1);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   public static rST<?> class_(int var0) {
      return var0 >= 0 && var0 < native_.length ? native_[var0] : class_;
   }

   protected Constructor<? extends rSl_1> class_() throws NoSuchMethodException {
      return this.volatile_.getConstructor(rSu_1.class);
   }

   public int break_() {
      return this.final_;
   }
}
