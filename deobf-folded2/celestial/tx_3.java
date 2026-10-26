package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class tx_3 extends tJ_2 {
   private final Iq_1 id_native;
   private final Iq_1 id_volatile;
   private final Iq_1 id_new;
   private final Iq_1 id_continue;

   public tx_3() {
      this(0.0F);
   }

   public tx_3(float var1) {
      super(var1, 64, 64);
      this.id_class = new Iq_1(this, 0, 0);
      this.id_class.id_class(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, var1);
      this.id_class.id_class(0.0F, 0.0F, 0.0F);
      this.id_byte = new Iq_1(this, 0, 26);
      this.id_byte.id_class(-6.0F, 0.0F, -1.5F, 12.0F, 3.0F, 3.0F, var1);
      this.id_byte.id_class(0.0F, 0.0F, 0.0F);
      this.id_protected = new Iq_1(this, 24, 0);
      this.id_protected.id_class(-2.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
      this.id_protected.id_class(-5.0F, 2.0F, 0.0F);
      this.id_throws = new Iq_1(this, 32, 16);
      this.id_throws.id_implements = true;
      this.id_throws.id_class(0.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
      this.id_throws.id_class(5.0F, 2.0F, 0.0F);
      this.id_case = new Iq_1(this, 8, 0);
      this.id_case.id_class(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, var1);
      this.id_case.id_class(-1.9F, 12.0F, 0.0F);
      this.id_catch = new Iq_1(this, 40, 16);
      this.id_catch.id_implements = true;
      this.id_catch.id_class(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, var1);
      this.id_catch.id_class(1.9F, 12.0F, 0.0F);
      this.id_native = new Iq_1(this, 16, 0);
      this.id_native.id_class(-3.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F, var1);
      this.id_native.id_class(0.0F, 0.0F, 0.0F);
      this.id_native.id_finally = true;
      this.id_volatile = new Iq_1(this, 48, 16);
      this.id_volatile.id_class(1.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F, var1);
      this.id_volatile.id_class(0.0F, 0.0F, 0.0F);
      this.id_new = new Iq_1(this, 0, 48);
      this.id_new.id_class(-4.0F, 10.0F, -1.0F, 8.0F, 2.0F, 2.0F, var1);
      this.id_new.id_class(0.0F, 0.0F, 0.0F);
      this.id_continue = new Iq_1(this, 0, 32);
      this.id_continue.id_class(-6.0F, 11.0F, -6.0F, 12.0F, 1.0F, 12.0F, var1);
      this.id_continue.id_class(0.0F, 12.0F, 0.0F);
      this.id_break.id_finally = false;
   }

   public void id_class(rSY var1, float var2, float var3, float var4) {
      this.id_continue.id_case = 0.0F;
      this.id_continue.id_catch = (float) (Math.PI / 180.0) * -rfU_2.id_private(var4, (Float)var1.id_throws[17], (Float)var1.id_throws[15]);
      this.id_continue.id_private = 0.0F;
   }

   @Override
   public void id_class(rSY var1, float var2, float var3, float var4, float var5, float var6) {
      super.id_class(var1, var2, var3, var4, var5, var6);
      this.id_throws.id_finally = var1.id_catch();
      this.id_protected.id_finally = var1.id_catch();
      this.id_continue.id_finally = !var1.id_private();
      this.id_catch.id_class(1.9F, 12.0F, 0.0F);
      this.id_case.id_class(-1.9F, 12.0F, 0.0F);
      this.id_native.id_case = (float) (Math.PI / 180.0) * var1.id_package().id_break();
      this.id_native.id_catch = (float) (Math.PI / 180.0) * var1.id_package().id_byte();
      this.id_native.id_private = (float) (Math.PI / 180.0) * var1.id_package().id_protected();
      this.id_volatile.id_case = (float) (Math.PI / 180.0) * var1.id_package().id_break();
      this.id_volatile.id_catch = (float) (Math.PI / 180.0) * var1.id_package().id_byte();
      this.id_volatile.id_private = (float) (Math.PI / 180.0) * var1.id_package().id_protected();
      this.id_new.id_case = (float) (Math.PI / 180.0) * var1.id_package().id_break();
      this.id_new.id_catch = (float) (Math.PI / 180.0) * var1.id_package().id_byte();
      this.id_new.id_private = (float) (Math.PI / 180.0) * var1.id_package().id_protected();
   }

   @Override
   public void id_class(rpZ_2 var1, Ml_1 var2) {
      Iq_1 var3 = this.id_class(var1);
      boolean var4 = var3.id_finally;
      var3.id_finally = true;
      super.id_class(var1, var2);
      var3.id_finally = var4;
   }

   @Override
   protected Iterable<Iq_1> id_break() {
      return Iterables.concat(super.id_break(), ImmutableList.of(this.id_native, this.id_volatile, this.id_new, this.id_continue));
   }
}
