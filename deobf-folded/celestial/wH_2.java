package celestial;

import com.google.common.collect.ImmutableList;

public class wH_2<T extends rOk_1> extends wN_2<T> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;
   private final Iq_1 id_catch;
   private final Iq_1 id_private;
   private final Iq_1 id_implements;

   public wH_2() {
      this.id_return = 64;
      this.id_public = 128;
      this.id_class = new Iq_1(this, 0, 32);
      this.id_class.id_class(-4.0F, 8.0F, 0.0F);
      this.id_class.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F);
      this.id_break = new Iq_1(this, 0, 55);
      this.id_break.id_class(4.0F, 8.0F, 0.0F);
      this.id_break.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F);
      this.id_byte = new Iq_1(this, 0, 0);
      this.id_byte.id_class(0.0F, 1.0F, 0.0F);
      this.id_byte.id_class(-8.0F, -6.0F, -8.0F, 16.0F, 14.0F, 16.0F, 0.0F);
      this.id_protected = new Iq_1(this, 16, 65);
      this.id_protected.id_class(-8.0F, 4.0F, -8.0F);
      this.id_protected.id_class(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
      this.id_class(this.id_protected, 0.0F, 0.0F, -1.2217305F);
      this.id_throws = new Iq_1(this, 16, 49);
      this.id_throws.id_class(-8.0F, -1.0F, -8.0F);
      this.id_throws.id_class(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
      this.id_class(this.id_throws, 0.0F, 0.0F, -1.134464F);
      this.id_case = new Iq_1(this, 16, 33);
      this.id_case.id_class(-8.0F, -5.0F, -8.0F);
      this.id_case.id_class(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
      this.id_class(this.id_case, 0.0F, 0.0F, -0.87266463F);
      this.id_catch = new Iq_1(this, 16, 33);
      this.id_catch.id_class(8.0F, -6.0F, -8.0F);
      this.id_catch.id_class(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
      this.id_class(this.id_catch, 0.0F, 0.0F, 0.87266463F);
      this.id_private = new Iq_1(this, 16, 49);
      this.id_private.id_class(8.0F, -2.0F, -8.0F);
      this.id_private.id_class(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
      this.id_class(this.id_private, 0.0F, 0.0F, 1.134464F);
      this.id_implements = new Iq_1(this, 16, 65);
      this.id_implements.id_class(8.0F, 3.0F, -8.0F);
      this.id_implements.id_class(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
      this.id_class(this.id_implements, 0.0F, 0.0F, 1.2217305F);
      this.id_byte.id_break(this.id_protected);
      this.id_byte.id_break(this.id_throws);
      this.id_byte.id_break(this.id_case);
      this.id_byte.id_break(this.id_catch);
      this.id_byte.id_break(this.id_private);
      this.id_byte.id_break(this.id_implements);
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_byte, this.id_break, this.id_class);
   }

   public void id_class(Iq_1 var1, float var2, float var3, float var4) {
      var1.id_case = var2;
      var1.id_catch = var3;
      var1.id_private = var4;
   }

   public void id_class(rOk_1 var1, float var2, float var3, float var4, float var5, float var6) {
      var3 = Math.min(0.25F, var3);
      if (var1.Bh().size() <= 0) {
         this.id_byte.id_case = var6 * (float) (Math.PI / 180.0);
         this.id_byte.id_catch = var5 * (float) (Math.PI / 180.0);
      } else {
         this.id_byte.id_case = 0.0F;
         this.id_byte.id_catch = 0.0F;
      }

      float var7 = 1.5F;
      this.id_byte.id_private = 0.1F * rfU_2.id_class(var2 * 1.5F) * 4.0F * var3;
      this.id_byte.id_protected = 2.0F;
      this.id_byte.id_protected = this.id_byte.id_protected - 2.0F * rfU_2.id_break(var2 * 1.5F) * 2.0F * var3;
      this.id_break.id_case = rfU_2.id_class(var2 * 1.5F * 0.5F) * 2.0F * var3;
      this.id_class.id_case = rfU_2.id_class(var2 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * var3;
      this.id_break.id_private = (float) (Math.PI / 18) * rfU_2.id_break(var2 * 1.5F * 0.5F) * var3;
      this.id_class.id_private = (float) (Math.PI / 18) * rfU_2.id_break(var2 * 1.5F * 0.5F + (float) Math.PI) * var3;
      this.id_break.id_protected = 8.0F + 2.0F * rfU_2.id_class(var2 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * var3;
      this.id_class.id_protected = 8.0F + 2.0F * rfU_2.id_class(var2 * 1.5F * 0.5F) * 2.0F * var3;
      this.id_protected.id_private = -1.2217305F;
      this.id_throws.id_private = -1.134464F;
      this.id_case.id_private = -0.87266463F;
      this.id_catch.id_private = 0.87266463F;
      this.id_private.id_private = 1.134464F;
      this.id_implements.id_private = 1.2217305F;
      float var8 = rfU_2.id_break(var2 * 1.5F + (float) Math.PI) * var3;
      this.id_protected.id_private += var8 * 1.3F;
      this.id_throws.id_private += var8 * 1.2F;
      this.id_case.id_private += var8 * 0.6F;
      this.id_catch.id_private += var8 * 0.6F;
      this.id_private.id_private += var8 * 1.2F;
      this.id_implements.id_private += var8 * 1.3F;
      float var9 = 1.0F;
      float var10 = 1.0F;
      this.id_protected.id_private = this.id_protected.id_private + 0.05F * rfU_2.id_class(var4 * 1.0F * -0.4F);
      this.id_throws.id_private = this.id_throws.id_private + 0.1F * rfU_2.id_class(var4 * 1.0F * 0.2F);
      this.id_case.id_private = this.id_case.id_private + 0.1F * rfU_2.id_class(var4 * 1.0F * 0.4F);
      this.id_catch.id_private = this.id_catch.id_private + 0.1F * rfU_2.id_class(var4 * 1.0F * 0.4F);
      this.id_private.id_private = this.id_private.id_private + 0.1F * rfU_2.id_class(var4 * 1.0F * 0.2F);
      this.id_implements.id_private = this.id_implements.id_private + 0.05F * rfU_2.id_class(var4 * 1.0F * -0.4F);
   }
}
