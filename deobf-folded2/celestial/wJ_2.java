package celestial;

import com.google.common.collect.ImmutableList;

public class wJ_2<T extends an_3> extends wN_2<T> {
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
   private final Iq_1 id_native;
   private final Iq_1 id_volatile;

   public wJ_2() {
      this.id_return = 32;
      this.id_public = 32;
      byte var1 = 22;
      this.id_class = new Iq_1(this, 0, 0);
      this.id_class.id_class(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      this.id_class.id_class(0.0F, 22.0F, 0.0F);
      this.id_break = new Iq_1(this, 24, 0);
      this.id_break.id_class(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F);
      this.id_break.id_class(-4.0F, 15.0F, -2.0F);
      this.id_byte = new Iq_1(this, 24, 3);
      this.id_byte.id_class(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F);
      this.id_byte.id_class(4.0F, 15.0F, -2.0F);
      this.id_protected = new Iq_1(this, 15, 17);
      this.id_protected.id_class(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.id_protected.id_class(0.0F, 14.0F, -4.0F);
      this.id_protected.id_case = (float) (Math.PI / 4);
      this.id_throws = new Iq_1(this, 14, 16);
      this.id_throws.id_class(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 1.0F);
      this.id_throws.id_class(0.0F, 14.0F, 0.0F);
      this.id_case = new Iq_1(this, 23, 18);
      this.id_case.id_class(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.id_case.id_class(0.0F, 14.0F, 4.0F);
      this.id_case.id_case = (float) (-Math.PI / 4);
      this.id_catch = new Iq_1(this, 5, 17);
      this.id_catch.id_class(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.id_catch.id_class(-4.0F, 22.0F, -4.0F);
      this.id_catch.id_catch = (float) (-Math.PI / 4);
      this.id_private = new Iq_1(this, 1, 17);
      this.id_private.id_class(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.id_private.id_class(4.0F, 22.0F, -4.0F);
      this.id_private.id_catch = (float) (Math.PI / 4);
      this.id_implements = new Iq_1(this, 15, 20);
      this.id_implements.id_class(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.id_implements.id_class(0.0F, 22.0F, -4.0F);
      this.id_implements.id_case = (float) (-Math.PI / 4);
      this.id_extends = new Iq_1(this, 15, 20);
      this.id_extends.id_class(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.id_extends.id_class(0.0F, 22.0F, 0.0F);
      this.id_finally = new Iq_1(this, 15, 20);
      this.id_finally.id_class(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.id_finally.id_class(0.0F, 22.0F, 4.0F);
      this.id_finally.id_case = (float) (Math.PI / 4);
      this.id_native = new Iq_1(this, 9, 17);
      this.id_native.id_class(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.id_native.id_class(-4.0F, 22.0F, 4.0F);
      this.id_native.id_catch = (float) (Math.PI / 4);
      this.id_volatile = new Iq_1(this, 9, 17);
      this.id_volatile.id_class(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.id_volatile.id_class(4.0F, 22.0F, 4.0F);
      this.id_volatile.id_catch = (float) (-Math.PI / 4);
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
         this.id_extends,
         this.id_finally,
         this.id_native,
         new Iq_1[]{this.id_volatile}
      );
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_break.id_private = -0.2F + 0.4F * rfU_2.id_class(var4 * 0.2F);
      this.id_byte.id_private = 0.2F - 0.4F * rfU_2.id_class(var4 * 0.2F);
   }
}
