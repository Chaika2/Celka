package celestial;

import com.google.common.collect.ImmutableList;

public class wI_2<T extends an_3> extends wN_2<T> implements tY_2, to_3 {
   protected Iq_1 id_class;
   protected Iq_1 id_break;
   protected final Iq_1 id_byte;
   protected final Iq_1 id_protected;
   protected final Iq_1 id_throws;
   protected final Iq_1 id_case;
   protected final Iq_1 id_catch;
   protected final Iq_1 id_private;
   protected final Iq_1 id_implements;

   @Override
   public Iq_1 id_byte() {
      return this.id_class;
   }

   public wI_2(float var1) {
      this(var1, 64, 64);
   }

   public wI_2(float var1, int var2, int var3) {
      float var4 = 0.5F;
      this.id_class = new Iq_1(this).id_break(var2, var3);
      this.id_class.id_class(0.0F, 0.0F, 0.0F);
      this.id_class.id_class(0, 0).id_class(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
      this.id_break = new Iq_1(this).id_break(var2, var3);
      this.id_break.id_class(0.0F, 0.0F, 0.0F);
      this.id_break.id_class(32, 0).id_class(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1 + 0.5F);
      this.id_class.id_break(this.id_break);
      this.id_byte = new Iq_1(this).id_break(var2, var3);
      this.id_byte.id_class(0.0F, 0.0F, 0.0F);
      this.id_byte.id_class(30, 47).id_class(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F, var1);
      this.id_byte.id_case = (float) (-Math.PI / 2);
      this.id_break.id_break(this.id_byte);
      this.id_implements = new Iq_1(this).id_break(var2, var3);
      this.id_implements.id_class(0.0F, -2.0F, 0.0F);
      this.id_implements.id_class(24, 0).id_class(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, var1);
      this.id_class.id_break(this.id_implements);
      this.id_protected = new Iq_1(this).id_break(var2, var3);
      this.id_protected.id_class(0.0F, 0.0F, 0.0F);
      this.id_protected.id_class(16, 20).id_class(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, var1);
      this.id_throws = new Iq_1(this).id_break(var2, var3);
      this.id_throws.id_class(0.0F, 0.0F, 0.0F);
      this.id_throws.id_class(0, 38).id_class(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, var1 + 0.5F);
      this.id_protected.id_break(this.id_throws);
      this.id_case = new Iq_1(this).id_break(var2, var3);
      this.id_case.id_class(0.0F, 2.0F, 0.0F);
      this.id_case.id_class(44, 22).id_class(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1);
      this.id_case.id_class(44, 22).id_class(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1, true);
      this.id_case.id_class(40, 38).id_class(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, var1);
      this.id_catch = new Iq_1(this, 0, 22).id_break(var2, var3);
      this.id_catch.id_class(-2.0F, 12.0F, 0.0F);
      this.id_catch.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.id_private = new Iq_1(this, 0, 22).id_break(var2, var3);
      this.id_private.id_implements = true;
      this.id_private.id_class(2.0F, 12.0F, 0.0F);
      this.id_private.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
   }

   @Override
   public void id_class(boolean var1) {
      this.id_class.id_finally = var1;
      this.id_break.id_finally = var1;
      this.id_byte.id_finally = var1;
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var7 = false;
      if (var1 instanceof rsy_3) {
         var7 = ((rsy_3)var1).L() > 0;
      }

      this.id_class.id_catch = var5 * (float) (Math.PI / 180.0);
      this.id_class.id_case = var6 * (float) (Math.PI / 180.0);
      if (var7) {
         this.id_class.id_private = 0.3F * rfU_2.id_class(0.45F * var4);
         this.id_class.id_case = 0.4F;
      } else {
         this.id_class.id_private = 0.0F;
      }

      this.id_case.id_protected = 3.0F;
      this.id_case.id_throws = -1.0F;
      this.id_case.id_case = -0.75F;
      this.id_catch.id_case = rfU_2.id_break(var2 * 0.6662F) * 1.4F * var3 * 0.5F;
      this.id_private.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3 * 0.5F;
      this.id_catch.id_catch = 0.0F;
      this.id_private.id_catch = 0.0F;
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class, this.id_protected, this.id_catch, this.id_private, this.id_case);
   }
}
