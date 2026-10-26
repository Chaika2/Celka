package celestial;

import com.google.common.collect.ImmutableList;

public class wB_2<T extends an_3> extends tX_2<T> {
   protected final Iq_1 id_class;
   protected final Iq_1 id_break;
   protected final Iq_1 id_byte;
   protected final Iq_1 id_protected;
   protected final Iq_1 id_throws;
   protected final Iq_1 id_case;
   protected final Iq_1 id_catch;
   protected final Iq_1 id_private;
   protected int id_implements = 1;

   public wB_2(float var1) {
      super(true, 10.0F, 4.0F);
      this.id_catch = new Iq_1(this);
      this.id_catch.id_class("main", -2.5F, -2.0F, -3.0F, 5, 4, 5, var1, 0, 0);
      this.id_catch.id_class("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2, var1, 0, 24);
      this.id_catch.id_class("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2, var1, 0, 10);
      this.id_catch.id_class("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2, var1, 6, 10);
      this.id_catch.id_class(0.0F, 15.0F, -9.0F);
      this.id_private = new Iq_1(this, 20, 0);
      this.id_private.id_class(-2.0F, 3.0F, -8.0F, 4.0F, 16.0F, 6.0F, var1);
      this.id_private.id_class(0.0F, 12.0F, -10.0F);
      this.id_throws = new Iq_1(this, 0, 15);
      this.id_throws.id_class(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, var1);
      this.id_throws.id_case = 0.9F;
      this.id_throws.id_class(0.0F, 15.0F, 8.0F);
      this.id_case = new Iq_1(this, 4, 15);
      this.id_case.id_class(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, var1);
      this.id_case.id_class(0.0F, 20.0F, 14.0F);
      this.id_class = new Iq_1(this, 8, 13);
      this.id_class.id_class(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, var1);
      this.id_class.id_class(1.1F, 18.0F, 5.0F);
      this.id_break = new Iq_1(this, 8, 13);
      this.id_break.id_class(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, var1);
      this.id_break.id_class(-1.1F, 18.0F, 5.0F);
      this.id_byte = new Iq_1(this, 40, 0);
      this.id_byte.id_class(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, var1);
      this.id_byte.id_class(1.2F, 14.1F, -5.0F);
      this.id_protected = new Iq_1(this, 40, 0);
      this.id_protected.id_class(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, var1);
      this.id_protected.id_class(-1.2F, 14.1F, -5.0F);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_catch.id_case = var6 * (float) (Math.PI / 180.0);
      this.id_catch.id_catch = var5 * (float) (Math.PI / 180.0);
      if (this.id_implements != 3) {
         this.id_private.id_case = (float) (Math.PI / 2);
         if (this.id_implements == 2) {
            this.id_class.id_case = rfU_2.id_break(var2 * 0.6662F) * var3;
            this.id_break.id_case = rfU_2.id_break(var2 * 0.6662F + 0.3F) * var3;
            this.id_byte.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI + 0.3F) * var3;
            this.id_protected.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * var3;
            this.id_case.id_case = 1.7278761F + (float) (Math.PI / 10) * rfU_2.id_break(var2) * var3;
         } else {
            this.id_class.id_case = rfU_2.id_break(var2 * 0.6662F) * var3;
            this.id_break.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * var3;
            this.id_byte.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * var3;
            this.id_protected.id_case = rfU_2.id_break(var2 * 0.6662F) * var3;
            if (this.id_implements == 1) {
               this.id_case.id_case = 1.7278761F + (float) (Math.PI / 4) * rfU_2.id_break(var2) * var3;
            } else {
               this.id_case.id_case = 1.7278761F + 0.47123894F * rfU_2.id_break(var2) * var3;
            }
         }
      }
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4) {
      this.id_private.id_protected = 12.0F;
      this.id_private.id_throws = -10.0F;
      this.id_catch.id_protected = 15.0F;
      this.id_catch.id_throws = -9.0F;
      this.id_throws.id_protected = 15.0F;
      this.id_throws.id_throws = 8.0F;
      this.id_case.id_protected = 20.0F;
      this.id_case.id_throws = 14.0F;
      this.id_byte.id_protected = 14.1F;
      this.id_byte.id_throws = -5.0F;
      this.id_protected.id_protected = 14.1F;
      this.id_protected.id_throws = -5.0F;
      this.id_class.id_protected = 18.0F;
      this.id_class.id_throws = 5.0F;
      this.id_break.id_protected = 18.0F;
      this.id_break.id_throws = 5.0F;
      this.id_throws.id_case = 0.9F;
      if (var1.x()) {
         this.id_private.id_protected++;
         this.id_catch.id_protected += 2.0F;
         this.id_throws.id_protected++;
         this.id_case.id_protected += -4.0F;
         this.id_case.id_throws += 2.0F;
         this.id_throws.id_case = (float) (Math.PI / 2);
         this.id_case.id_case = (float) (Math.PI / 2);
         this.id_implements = 0;
      } else if (var1.PF()) {
         this.id_case.id_protected = this.id_throws.id_protected;
         this.id_case.id_throws += 2.0F;
         this.id_throws.id_case = (float) (Math.PI / 2);
         this.id_case.id_case = (float) (Math.PI / 2);
         this.id_implements = 2;
      } else {
         this.id_implements = 1;
      }
   }

   @Override
   protected Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_catch);
   }

   @Override
   protected Iterable<Iq_1> id_break() {
      return ImmutableList.of(this.id_private, this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case);
   }
}
