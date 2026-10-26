package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class ww_3 extends tW_2<rGg_1> {
   private final Iq_1 id_native;
   private final Iq_1 id_volatile;

   public ww_3() {
      super(0.0F, 0.0F, 64, 64);
      this.id_catch.id_finally = false;
      this.id_break.id_finally = false;
      this.id_case = new Iq_1(this, 32, 0);
      this.id_case.id_class(-1.0F, -1.0F, -2.0F, 6.0F, 10.0F, 4.0F, 0.0F);
      this.id_case.id_class(-1.9F, 12.0F, 0.0F);
      this.id_volatile = new Iq_1(this, 0, 32);
      this.id_volatile.id_class(-20.0F, 0.0F, 0.0F, 20.0F, 12.0F, 1.0F);
      this.id_native = new Iq_1(this, 0, 32);
      this.id_native.id_implements = true;
      this.id_native.id_class(0.0F, 0.0F, 0.0F, 20.0F, 12.0F, 1.0F);
   }

   public void id_class(rGg_1 var1, float var2, float var3, float var4, float var5, float var6) {
      super.id_class((rGg_1)var1, var2, var3, var4, var5, var6);
      if (var1.sx()) {
         if (var1.ss().id_class()) {
            this.id_protected.id_case = (float) (Math.PI * 3.0 / 2.0);
            this.id_throws.id_case = (float) (Math.PI * 3.0 / 2.0);
         } else if (var1.Su() == rpZ_2.RIGHT) {
            this.id_protected.id_case = 3.7699115F;
         } else {
            this.id_throws.id_case = 3.7699115F;
         }
      }

      this.id_case.id_case += (float) (Math.PI / 5);
      this.id_volatile.id_throws = 2.0F;
      this.id_native.id_throws = 2.0F;
      this.id_volatile.id_protected = 1.0F;
      this.id_native.id_protected = 1.0F;
      this.id_volatile.id_catch = 0.47123894F + rfU_2.id_break(var4 * 0.8F) * (float) Math.PI * 0.05F;
      this.id_native.id_catch = -this.id_volatile.id_catch;
      this.id_native.id_private = -0.47123894F;
      this.id_native.id_case = 0.47123894F;
      this.id_volatile.id_case = 0.47123894F;
      this.id_volatile.id_private = 0.47123894F;
   }

   @Override
   protected Iterable<Iq_1> id_break() {
      return Iterables.concat(super.id_break(), ImmutableList.of(this.id_volatile, this.id_native));
   }
}
