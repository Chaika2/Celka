package celestial;

import com.mojang.serialization.Codec;

public class rLk_1 implements rLx_1 {
   public static final rLd_1<rLk_1> class_ = new rLW();
   private final rLz_1<rLk_1> break_;
   private final rdn_3 byte_;

   @Override
   public String byte_() {
      return rVL.switch_.break_(this.protected_()) + " " + new RY(this.byte_.break_(), this.byte_.package_()).break_();
   }

   public rLk_1(rLz_1<rLk_1> var1, rdn_3 var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public rdn_3 class_() {
      return this.byte_;
   }

   public static Codec<rLk_1> class_(rLz_1<rLk_1> var0) {
      return rdn_3.class_.xmap(var1 -> new rLk_1(var0, var1), var0x -> var0x.byte_);
   }

   @Override
   public void class_(ruu_3 var1) {
      var1.class_(this.byte_);
   }

   @Override
   public rLz_1<rLk_1> protected_() {
      return this.break_;
   }
}
