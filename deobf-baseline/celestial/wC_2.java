package celestial;

import com.google.common.collect.ImmutableList;

public class wC_2<T extends an_3> extends wN_2<T> {
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
   private final Iq_1 id_extends;

   public wC_2() {
      float var1 = 0.0F;
      byte var2 = 15;
      this.id_class = new Iq_1(this, 32, 4);
      this.id_class.id_class(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F);
      this.id_class.id_class(0.0F, 15.0F, -3.0F);
      this.id_break = new Iq_1(this, 0, 0);
      this.id_break.id_class(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F);
      this.id_break.id_class(0.0F, 15.0F, 0.0F);
      this.id_byte = new Iq_1(this, 0, 12);
      this.id_byte.id_class(-5.0F, -4.0F, -6.0F, 10.0F, 8.0F, 12.0F, 0.0F);
      this.id_byte.id_class(0.0F, 15.0F, 9.0F);
      this.id_protected = new Iq_1(this, 18, 0);
      this.id_protected.id_class(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.id_protected.id_class(-4.0F, 15.0F, 2.0F);
      this.id_throws = new Iq_1(this, 18, 0);
      this.id_throws.id_class(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.id_throws.id_class(4.0F, 15.0F, 2.0F);
      this.id_case = new Iq_1(this, 18, 0);
      this.id_case.id_class(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.id_case.id_class(-4.0F, 15.0F, 1.0F);
      this.id_catch = new Iq_1(this, 18, 0);
      this.id_catch.id_class(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.id_catch.id_class(4.0F, 15.0F, 1.0F);
      this.id_private = new Iq_1(this, 18, 0);
      this.id_private.id_class(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.id_private.id_class(-4.0F, 15.0F, 0.0F);
      this.id_implements = new Iq_1(this, 18, 0);
      this.id_implements.id_class(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.id_implements.id_class(4.0F, 15.0F, 0.0F);
      this.id_finally = new Iq_1(this, 18, 0);
      this.id_finally.id_class(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.id_finally.id_class(-4.0F, 15.0F, -1.0F);
      this.id_extends = new Iq_1(this, 18, 0);
      this.id_extends.id_class(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.id_extends.id_class(4.0F, 15.0F, -1.0F);
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(
         this.id_class,
         this.id_break,
         this.id_byte,
         this.id_protected,
         this.id_throws,
         this.id_case,
         this.id_catch,
         this.id_private,
         this.id_implements,
         this.id_finally,
         this.id_extends
      );
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_class.id_catch = var5 * (float) (Math.PI / 180.0);
      this.id_class.id_case = var6 * (float) (Math.PI / 180.0);
      float var7 = (float) (Math.PI / 4);
      this.id_protected.id_private = (float) (-Math.PI / 4);
      this.id_throws.id_private = (float) (Math.PI / 4);
      this.id_case.id_private = -0.58119464F;
      this.id_catch.id_private = 0.58119464F;
      this.id_private.id_private = -0.58119464F;
      this.id_implements.id_private = 0.58119464F;
      this.id_finally.id_private = (float) (-Math.PI / 4);
      this.id_extends.id_private = (float) (Math.PI / 4);
      float var8 = -0.0F;
      float var9 = (float) (Math.PI / 8);
      this.id_protected.id_catch = (float) (Math.PI / 4);
      this.id_throws.id_catch = (float) (-Math.PI / 4);
      this.id_case.id_catch = (float) (Math.PI / 8);
      this.id_catch.id_catch = (float) (-Math.PI / 8);
      this.id_private.id_catch = (float) (-Math.PI / 8);
      this.id_implements.id_catch = (float) (Math.PI / 8);
      this.id_finally.id_catch = (float) (-Math.PI / 4);
      this.id_extends.id_catch = (float) (Math.PI / 4);
      float var10 = -(rfU_2.id_break(var2 * 0.6662F * 2.0F + 0.0F) * 0.4F) * var3;
      float var11 = -(rfU_2.id_break(var2 * 0.6662F * 2.0F + (float) Math.PI) * 0.4F) * var3;
      float var12 = -(rfU_2.id_break(var2 * 0.6662F * 2.0F + (float) (Math.PI / 2)) * 0.4F) * var3;
      float var13 = -(rfU_2.id_break(var2 * 0.6662F * 2.0F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * var3;
      float var14 = Math.abs(rfU_2.id_class(var2 * 0.6662F + 0.0F) * 0.4F) * var3;
      float var15 = Math.abs(rfU_2.id_class(var2 * 0.6662F + (float) Math.PI) * 0.4F) * var3;
      float var16 = Math.abs(rfU_2.id_class(var2 * 0.6662F + (float) (Math.PI / 2)) * 0.4F) * var3;
      float var17 = Math.abs(rfU_2.id_class(var2 * 0.6662F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * var3;
      this.id_protected.id_catch += var10;
      this.id_throws.id_catch += -var10;
      this.id_case.id_catch += var11;
      this.id_catch.id_catch += -var11;
      this.id_private.id_catch += var12;
      this.id_implements.id_catch += -var12;
      this.id_finally.id_catch += var13;
      this.id_extends.id_catch += -var13;
      this.id_protected.id_private += var14;
      this.id_throws.id_private += -var14;
      this.id_case.id_private += var15;
      this.id_catch.id_private += -var15;
      this.id_private.id_private += var16;
      this.id_implements.id_private += -var16;
      this.id_finally.id_private += var17;
      this.id_extends.id_private += -var17;
   }
}
