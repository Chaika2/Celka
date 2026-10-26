package celestial;

import com.google.common.collect.ImmutableList;

public class wV_2<T extends rOH> extends wy_3<T> {
   private final Iq_1 id_class = new Iq_1(this, 0, 0);
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;
   private final Iq_1 id_catch;
   private final Iq_1 id_private;
   private final Iq_1 id_implements;
   private final Iq_1 id_finally;

   public wV_2() {
      this.id_class.id_class(-1.0F, 13.5F, -7.0F);
      this.id_break = new Iq_1(this, 0, 0);
      this.id_break.id_class(-2.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F);
      this.id_class.id_break(this.id_break);
      this.id_byte = new Iq_1(this, 18, 14);
      this.id_byte.id_class(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F);
      this.id_byte.id_class(0.0F, 14.0F, 2.0F);
      this.id_finally = new Iq_1(this, 21, 0);
      this.id_finally.id_class(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F, 0.0F);
      this.id_finally.id_class(-1.0F, 14.0F, 2.0F);
      this.id_protected = new Iq_1(this, 0, 18);
      this.id_protected.id_class(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.id_protected.id_class(-2.5F, 16.0F, 7.0F);
      this.id_throws = new Iq_1(this, 0, 18);
      this.id_throws.id_class(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.id_throws.id_class(0.5F, 16.0F, 7.0F);
      this.id_case = new Iq_1(this, 0, 18);
      this.id_case.id_class(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.id_case.id_class(-2.5F, 16.0F, -4.0F);
      this.id_catch = new Iq_1(this, 0, 18);
      this.id_catch.id_class(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.id_catch.id_class(0.5F, 16.0F, -4.0F);
      this.id_private = new Iq_1(this, 9, 18);
      this.id_private.id_class(-1.0F, 12.0F, 8.0F);
      this.id_implements = new Iq_1(this, 9, 18);
      this.id_implements.id_class(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.id_private.id_break(this.id_implements);
      this.id_break.id_class(16, 14).id_class(-2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      this.id_break.id_class(16, 14).id_class(2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      this.id_break.id_class(0, 10).id_class(-0.5F, 0.0F, -5.0F, 3.0F, 3.0F, 4.0F, 0.0F);
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_class.id_case = var6 * (float) (Math.PI / 180.0);
      this.id_class.id_catch = var5 * (float) (Math.PI / 180.0);
      this.id_private.id_case = var4;
   }

   public void id_class(T var1, float var2, float var3, float var4) {
      if (var1.T_()) {
         this.id_private.id_catch = 0.0F;
      } else {
         this.id_private.id_catch = rfU_2.id_break(var2 * 0.6662F) * 1.4F * var3;
      }

      if (var1.Sc()) {
         this.id_finally.id_class(-1.0F, 16.0F, -3.0F);
         this.id_finally.id_case = (float) (Math.PI * 2.0 / 5.0);
         this.id_finally.id_catch = 0.0F;
         this.id_byte.id_class(0.0F, 18.0F, 0.0F);
         this.id_byte.id_case = (float) (Math.PI / 4);
         this.id_private.id_class(-1.0F, 21.0F, 6.0F);
         this.id_protected.id_class(-2.5F, 22.7F, 2.0F);
         this.id_protected.id_case = (float) (Math.PI * 3.0 / 2.0);
         this.id_throws.id_class(0.5F, 22.7F, 2.0F);
         this.id_throws.id_case = (float) (Math.PI * 3.0 / 2.0);
         this.id_case.id_case = 5.811947F;
         this.id_case.id_class(-2.49F, 17.0F, -4.0F);
         this.id_catch.id_case = 5.811947F;
         this.id_catch.id_class(0.51F, 17.0F, -4.0F);
      } else {
         this.id_byte.id_class(0.0F, 14.0F, 2.0F);
         this.id_byte.id_case = (float) (Math.PI / 2);
         this.id_finally.id_class(-1.0F, 14.0F, -3.0F);
         this.id_finally.id_case = this.id_byte.id_case;
         this.id_private.id_class(-1.0F, 12.0F, 8.0F);
         this.id_protected.id_class(-2.5F, 16.0F, 7.0F);
         this.id_throws.id_class(0.5F, 16.0F, 7.0F);
         this.id_case.id_class(-2.5F, 16.0F, -4.0F);
         this.id_catch.id_class(0.5F, 16.0F, -4.0F);
         this.id_protected.id_case = rfU_2.id_break(var2 * 0.6662F) * 1.4F * var3;
         this.id_throws.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
         this.id_case.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
         this.id_catch.id_case = rfU_2.id_break(var2 * 0.6662F) * 1.4F * var3;
      }

      this.id_break.id_private = var1.id_interface(var4) + var1.id_break(var4, 0.0F);
      this.id_finally.id_private = var1.id_break(var4, -0.08F);
      this.id_byte.id_private = var1.id_break(var4, -0.16F);
      this.id_implements.id_private = var1.id_break(var4, -0.2F);
   }

   @Override
   protected Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class);
   }

   @Override
   protected Iterable<Iq_1> id_break() {
      return ImmutableList.of(this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_finally);
   }
}
