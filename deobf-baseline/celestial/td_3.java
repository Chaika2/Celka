package celestial;

import com.google.common.collect.ImmutableList;

public class td_3 extends wN_2<rbv_3> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;

   public td_3() {
      this.id_return = 64;
      this.id_public = 64;
      this.id_class = new Iq_1(this, 0, 0);
      this.id_class.id_class(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F);
      Iq_1 var1 = new Iq_1(this, 24, 0);
      var1.id_class(-4.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F);
      this.id_class.id_break(var1);
      Iq_1 var2 = new Iq_1(this, 24, 0);
      var2.id_implements = true;
      var2.id_class(1.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F);
      this.id_class.id_break(var2);
      this.id_break = new Iq_1(this, 0, 16);
      this.id_break.id_class(-3.0F, 4.0F, -3.0F, 6.0F, 12.0F, 6.0F);
      this.id_break.id_class(0, 34).id_class(-5.0F, 16.0F, 0.0F, 10.0F, 6.0F, 1.0F);
      this.id_byte = new Iq_1(this, 42, 0);
      this.id_byte.id_class(-12.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F);
      this.id_throws = new Iq_1(this, 24, 16);
      this.id_throws.id_class(-12.0F, 1.0F, 1.5F);
      this.id_throws.id_class(-8.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F);
      this.id_protected = new Iq_1(this, 42, 0);
      this.id_protected.id_implements = true;
      this.id_protected.id_class(2.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F);
      this.id_case = new Iq_1(this, 24, 16);
      this.id_case.id_implements = true;
      this.id_case.id_class(12.0F, 1.0F, 1.5F);
      this.id_case.id_class(0.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F);
      this.id_break.id_break(this.id_byte);
      this.id_break.id_break(this.id_protected);
      this.id_byte.id_break(this.id_throws);
      this.id_protected.id_break(this.id_case);
   }

   public void id_class(rbv_3 var1, float var2, float var3, float var4, float var5, float var6) {
      if (var1.id_catch()) {
         this.id_class.id_case = var6 * (float) (Math.PI / 180.0);
         this.id_class.id_catch = (float) Math.PI - var5 * (float) (Math.PI / 180.0);
         this.id_class.id_private = (float) Math.PI;
         this.id_class.id_class(0.0F, -2.0F, 0.0F);
         this.id_byte.id_class(-3.0F, 0.0F, 3.0F);
         this.id_protected.id_class(3.0F, 0.0F, 3.0F);
         this.id_break.id_case = (float) Math.PI;
         this.id_byte.id_case = (float) (-Math.PI / 20);
         this.id_byte.id_catch = (float) (-Math.PI * 2.0 / 5.0);
         this.id_throws.id_catch = -1.7278761F;
         this.id_protected.id_case = this.id_byte.id_case;
         this.id_protected.id_catch = -this.id_byte.id_catch;
         this.id_case.id_catch = -this.id_throws.id_catch;
      } else {
         this.id_class.id_case = var6 * (float) (Math.PI / 180.0);
         this.id_class.id_catch = var5 * (float) (Math.PI / 180.0);
         this.id_class.id_private = 0.0F;
         this.id_class.id_class(0.0F, 0.0F, 0.0F);
         this.id_byte.id_class(0.0F, 0.0F, 0.0F);
         this.id_protected.id_class(0.0F, 0.0F, 0.0F);
         this.id_break.id_case = (float) (Math.PI / 4) + rfU_2.id_break(var4 * 0.1F) * 0.15F;
         this.id_break.id_catch = 0.0F;
         this.id_byte.id_catch = rfU_2.id_break(var4 * 1.3F) * (float) Math.PI * 0.25F;
         this.id_protected.id_catch = -this.id_byte.id_catch;
         this.id_throws.id_catch = this.id_byte.id_catch * 0.5F;
         this.id_case.id_catch = -this.id_byte.id_catch * 0.5F;
      }
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class, this.id_break);
   }
}
