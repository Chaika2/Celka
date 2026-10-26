package celestial;

import com.google.common.collect.ImmutableList;

public class tT_2<T extends rba_3> extends tX_2<T> {
   public final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;
   private final Iq_1 id_catch;
   private final Iq_1 id_private;
   private final Iq_1 id_implements;
   private final Iq_1 id_finally;
   private float id_extends;

   public tT_2() {
      super(true, 8.0F, 3.35F);
      this.id_return = 48;
      this.id_public = 32;
      this.id_class = new Iq_1(this, 1, 5);
      this.id_class.id_class(-3.0F, -2.0F, -5.0F, 8.0F, 6.0F, 6.0F);
      this.id_class.id_class(-1.0F, 16.5F, -3.0F);
      this.id_break = new Iq_1(this, 8, 1);
      this.id_break.id_class(-3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F);
      this.id_byte = new Iq_1(this, 15, 1);
      this.id_byte.id_class(3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F);
      this.id_protected = new Iq_1(this, 6, 18);
      this.id_protected.id_class(-1.0F, 2.01F, -8.0F, 4.0F, 2.0F, 3.0F);
      this.id_class.id_break(this.id_break);
      this.id_class.id_break(this.id_byte);
      this.id_class.id_break(this.id_protected);
      this.id_throws = new Iq_1(this, 24, 15);
      this.id_throws.id_class(-3.0F, 3.999F, -3.5F, 6.0F, 11.0F, 6.0F);
      this.id_throws.id_class(0.0F, 16.0F, -6.0F);
      float var1 = 0.001F;
      this.id_case = new Iq_1(this, 13, 24);
      this.id_case.id_class(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
      this.id_case.id_class(-5.0F, 17.5F, 7.0F);
      this.id_catch = new Iq_1(this, 4, 24);
      this.id_catch.id_class(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
      this.id_catch.id_class(-1.0F, 17.5F, 7.0F);
      this.id_private = new Iq_1(this, 13, 24);
      this.id_private.id_class(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
      this.id_private.id_class(-5.0F, 17.5F, 0.0F);
      this.id_implements = new Iq_1(this, 4, 24);
      this.id_implements.id_class(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
      this.id_implements.id_class(-1.0F, 17.5F, 0.0F);
      this.id_finally = new Iq_1(this, 30, 0);
      this.id_finally.id_class(2.0F, 0.0F, -1.0F, 4.0F, 9.0F, 5.0F);
      this.id_finally.id_class(-4.0F, 15.0F, -1.0F);
      this.id_throws.id_break(this.id_finally);
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      if (!var1.Sc() && !var1.sx() && !var1.x()) {
         this.id_class.id_case = var6 * (float) (Math.PI / 180.0);
         this.id_class.id_catch = var5 * (float) (Math.PI / 180.0);
      }

      if (var1.Sc()) {
         this.id_class.id_case = 0.0F;
         this.id_class.id_catch = (float) (-Math.PI * 2.0 / 3.0);
         this.id_class.id_private = rfU_2.id_break(var4 * 0.027F) / 22.0F;
      }

      if (var1.x()) {
         float var7 = rfU_2.id_break(var4) * 0.01F;
         this.id_throws.id_catch = var7;
         this.id_case.id_private = var7;
         this.id_catch.id_private = var7;
         this.id_private.id_private = var7 / 2.0F;
         this.id_implements.id_private = var7 / 2.0F;
      }

      if (var1.sx()) {
         float var8 = 0.1F;
         this.id_extends += 0.67F;
         this.id_case.id_case = rfU_2.id_break(this.id_extends * 0.4662F) * 0.1F;
         this.id_catch.id_case = rfU_2.id_break(this.id_extends * 0.4662F + (float) Math.PI) * 0.1F;
         this.id_private.id_case = rfU_2.id_break(this.id_extends * 0.4662F + (float) Math.PI) * 0.1F;
         this.id_implements.id_case = rfU_2.id_break(this.id_extends * 0.4662F) * 0.1F;
      }
   }

   @Override
   protected Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class);
   }

   public void id_class(T var1, float var2, float var3, float var4) {
      this.id_throws.id_case = (float) (Math.PI / 2);
      this.id_finally.id_case = -0.05235988F;
      this.id_case.id_case = rfU_2.id_break(var2 * 0.6662F) * 1.4F * var3;
      this.id_catch.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.id_private.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.id_implements.id_case = rfU_2.id_break(var2 * 0.6662F) * 1.4F * var3;
      this.id_class.id_class(-1.0F, 16.5F, -3.0F);
      this.id_class.id_catch = 0.0F;
      this.id_class.id_private = var1.id_throw(var4);
      this.id_case.id_finally = true;
      this.id_catch.id_finally = true;
      this.id_private.id_finally = true;
      this.id_implements.id_finally = true;
      this.id_throws.id_class(0.0F, 16.0F, -6.0F);
      this.id_throws.id_private = 0.0F;
      this.id_case.id_class(-5.0F, 17.5F, 7.0F);
      this.id_catch.id_class(-1.0F, 17.5F, 7.0F);
      if (var1.x()) {
         this.id_throws.id_case = 1.6755161F;
         float var5 = var1.id_interface(var4);
         this.id_throws.id_class(0.0F, 16.0F + var1.id_interface(var4), -6.0F);
         this.id_class.id_class(-1.0F, 16.5F + var5, -3.0F);
         this.id_class.id_catch = 0.0F;
      } else if (var1.Sc()) {
         this.id_throws.id_private = (float) (-Math.PI / 2);
         this.id_throws.id_class(0.0F, 21.0F, -6.0F);
         this.id_finally.id_case = (float) (-Math.PI * 5.0 / 6.0);
         if (this.id_int) {
            this.id_finally.id_case = -2.1816616F;
            this.id_throws.id_class(0.0F, 21.0F, -2.0F);
         }

         this.id_class.id_class(1.0F, 19.49F, -3.0F);
         this.id_class.id_case = 0.0F;
         this.id_class.id_catch = (float) (-Math.PI * 2.0 / 3.0);
         this.id_class.id_private = 0.0F;
         this.id_case.id_finally = false;
         this.id_catch.id_finally = false;
         this.id_private.id_finally = false;
         this.id_implements.id_finally = false;
      } else if (var1.sJ()) {
         this.id_throws.id_case = (float) (Math.PI / 6);
         this.id_throws.id_class(0.0F, 9.0F, -3.0F);
         this.id_finally.id_case = (float) (Math.PI / 4);
         this.id_finally.id_class(-4.0F, 15.0F, -2.0F);
         this.id_class.id_class(-1.0F, 10.0F, -0.25F);
         this.id_class.id_case = 0.0F;
         this.id_class.id_catch = 0.0F;
         if (this.id_int) {
            this.id_class.id_class(-1.0F, 13.0F, -3.75F);
         }

         this.id_case.id_case = (float) (-Math.PI * 5.0 / 12.0);
         this.id_case.id_class(-5.0F, 21.5F, 6.75F);
         this.id_catch.id_case = (float) (-Math.PI * 5.0 / 12.0);
         this.id_catch.id_class(-1.0F, 21.5F, 6.75F);
         this.id_private.id_case = (float) (-Math.PI / 12);
         this.id_implements.id_case = (float) (-Math.PI / 12);
      }
   }

   @Override
   protected Iterable<Iq_1> id_break() {
      return ImmutableList.of(this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements);
   }
}
