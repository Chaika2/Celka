package celestial;

import com.mojang.serialization.Codec;

public class rLO extends rLz_1<rLO> implements rLx_1 {
   private static final rLd_1<rLO> class_ = new rLh_1();
   private final Codec<rLO> break_ = Codec.unit(this::class_);

   @Override
   public String byte_() {
      return rVL.switch_.break_(this).toString();
   }

   protected rLO(boolean var1) {
      super(var1, class_);
   }

   @Override
   public void class_(ruu_3 var1) {
   }

   public rLO class_() {
      return this;
   }

   @Override
   public Codec<rLO> break_() {
      return this.break_;
   }
}
