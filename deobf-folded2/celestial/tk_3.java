package celestial;

import com.google.common.collect.ImmutableList;

public class tk_3<T extends rbF_2> extends tX_2<T> {
   private final Iq_1 id_class;
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

   public tk_3() {
      super(false, 24.0F, 0.0F);
      this.id_return = 64;
      this.id_public = 64;
      this.id_class = new Iq_1(this);
      this.id_class.id_class(0.0F, 19.0F, 0.0F);
      this.id_break = new Iq_1(this, 0, 0);
      this.id_break.id_class(0.0F, 0.0F, 0.0F);
      this.id_class.id_break(this.id_break);
      this.id_break.id_class(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F, 0.0F);
      this.id_private = new Iq_1(this, 26, 7);
      this.id_private.id_class(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F, 0.0F);
      this.id_break.id_break(this.id_private);
      this.id_implements = new Iq_1(this, 2, 0);
      this.id_implements.id_class(0.0F, -2.0F, -5.0F);
      this.id_implements.id_class(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F);
      this.id_finally = new Iq_1(this, 2, 3);
      this.id_finally.id_class(0.0F, -2.0F, -5.0F);
      this.id_finally.id_class(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F);
      this.id_break.id_break(this.id_implements);
      this.id_break.id_break(this.id_finally);
      this.id_byte = new Iq_1(this, 0, 18);
      this.id_byte.id_class(-1.5F, -4.0F, -3.0F);
      this.id_byte.id_case = 0.0F;
      this.id_byte.id_catch = -0.2618F;
      this.id_byte.id_private = 0.0F;
      this.id_class.id_break(this.id_byte);
      this.id_byte.id_class(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, 0.001F);
      this.id_protected = new Iq_1(this, 0, 18);
      this.id_protected.id_class(1.5F, -4.0F, -3.0F);
      this.id_protected.id_case = 0.0F;
      this.id_protected.id_catch = 0.2618F;
      this.id_protected.id_private = 0.0F;
      this.id_protected.id_implements = true;
      this.id_class.id_break(this.id_protected);
      this.id_protected.id_class(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, 0.001F);
      this.id_throws = new Iq_1(this);
      this.id_throws.id_class(1.5F, 3.0F, -2.0F);
      this.id_class.id_break(this.id_throws);
      this.id_throws.id_class("frontLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 1);
      this.id_case = new Iq_1(this);
      this.id_case.id_class(1.5F, 3.0F, 0.0F);
      this.id_class.id_break(this.id_case);
      this.id_case.id_class("midLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 3);
      this.id_catch = new Iq_1(this);
      this.id_catch.id_class(1.5F, 3.0F, 2.0F);
      this.id_class.id_break(this.id_catch);
      this.id_catch.id_class("backLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 5);
   }

   @Override
   protected Iterable<Iq_1> id_class() {
      return ImmutableList.of();
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_byte.id_case = 0.0F;
      this.id_implements.id_case = 0.0F;
      this.id_finally.id_case = 0.0F;
      this.id_class.id_case = 0.0F;
      this.id_class.id_protected = 19.0F;
      boolean var7 = var1.BL() && var1.rv().id_catch() < 1.0E-7;
      if (var7) {
         this.id_byte.id_catch = -0.2618F;
         this.id_byte.id_private = 0.0F;
         this.id_protected.id_case = 0.0F;
         this.id_protected.id_catch = 0.2618F;
         this.id_protected.id_private = 0.0F;
         this.id_throws.id_case = 0.0F;
         this.id_case.id_case = 0.0F;
         this.id_catch.id_case = 0.0F;
      } else {
         float var8 = var4 * 2.1F;
         this.id_byte.id_catch = 0.0F;
         this.id_byte.id_private = rfU_2.id_break(var8) * (float) Math.PI * 0.15F;
         this.id_protected.id_case = this.id_byte.id_case;
         this.id_protected.id_catch = this.id_byte.id_catch;
         this.id_protected.id_private = -this.id_byte.id_private;
         this.id_throws.id_case = (float) (Math.PI / 4);
         this.id_case.id_case = (float) (Math.PI / 4);
         this.id_catch.id_case = (float) (Math.PI / 4);
         this.id_class.id_case = 0.0F;
         this.id_class.id_catch = 0.0F;
         this.id_class.id_private = 0.0F;
      }

      if (!var1.T_()) {
         this.id_class.id_case = 0.0F;
         this.id_class.id_catch = 0.0F;
         this.id_class.id_private = 0.0F;
         if (!var7) {
            float var9 = rfU_2.id_break(var4 * 0.18F);
            this.id_class.id_case = 0.1F + var9 * (float) Math.PI * 0.025F;
            this.id_implements.id_case = var9 * (float) Math.PI * 0.03F;
            this.id_finally.id_case = var9 * (float) Math.PI * 0.03F;
            this.id_throws.id_case = -var9 * (float) Math.PI * 0.1F + (float) (Math.PI / 8);
            this.id_catch.id_case = -var9 * (float) Math.PI * 0.05F + (float) (Math.PI / 4);
            this.id_class.id_protected = 19.0F - rfU_2.id_break(var4 * 0.18F) * 0.9F;
         }
      }

      if (this.id_extends > 0.0F) {
         this.id_class.id_case = wP_2.id_class(this.id_class.id_case, 3.0915928F, this.id_extends);
      }
   }

   public void id_class(T var1, float var2, float var3, float var4) {
      super.id_class(var1, var2, var3, var4);
      this.id_extends = var1.id_throw(var4);
      this.id_private.id_finally = !var1.su();
   }

   @Override
   protected Iterable<Iq_1> id_break() {
      return ImmutableList.of(this.id_class);
   }
}
