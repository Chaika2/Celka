package celestial;

import com.mojang.serialization.Codec;

public class rLX implements rLx_1 {
   public static final rLd_1<rLX> class_ = new rLJ();
   private final rLz_1<rLX> break_;
   private final xc_3 byte_;

   @Override
   public String byte_() {
      return rVL.switch_.break_(this.protected_()) + " " + Rk_1.class_(this.byte_);
   }

   public rLX(rLz_1<rLX> var1, xc_3 var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public xc_3 class_() {
      return this.byte_;
   }

   public static Codec<rLX> class_(rLz_1<rLX> var0) {
      return xc_3.break_.xmap(var1 -> new rLX(var0, var1), var0x -> var0x.byte_);
   }

   @Override
   public void class_(ruu_3 var1) {
      var1.protected_(xd_3.char_.class_(this.byte_));
   }

   @Override
   public rLz_1<rLX> protected_() {
      return this.break_;
   }
}
