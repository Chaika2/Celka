package celestial;

public interface rlQ_2 {
   rlQ_2 class_ = class_(rlW_2.byte_(), rlW_2.byte_(), rlW_2.byte_(), rlW_2.byte_());

   rlW_2<rXs_1> byte_();

   static rlQ_2 class_(rlW_2<xd_3> var0, rlW_2<rdb_3> var1, rlW_2<rXs_1> var2, rlW_2<aI_2<?>> var3) {
      return new rlN_2(var0, var1, var2, var3);
   }

   default void class_(ruu_3 var1) {
      this.class_().class_(var1, rVL.strictfp_);
      this.break_().class_(var1, rVL.for_);
      this.byte_().class_(var1, rVL.default_);
      this.protected_().class_(var1, rVL.transient_);
   }

   rlW_2<xd_3> class_();

   rlW_2<rdb_3> break_();

   static rlQ_2 break_(ruu_3 var0) {
      rlW_2 var1 = rlW_2.class_(var0, rVL.strictfp_);
      rlW_2 var2 = rlW_2.class_(var0, rVL.for_);
      rlW_2 var3 = rlW_2.class_(var0, rVL.default_);
      rlW_2 var4 = rlW_2.class_(var0, rVL.transient_);
      return class_(var1, var2, var3, var4);
   }

   default void throws_() {
      rlA_2.class_(this);
      xu_3.class_();
   }

   rlW_2<aI_2<?>> protected_();
}
