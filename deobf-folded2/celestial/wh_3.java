package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class wh_3<T extends iB_2> extends tW_2<T> implements rruP {
   private List<Iq_1> id_native = Lists.newArrayList();
   public final Iq_1 id_new;
   public final Iq_1 id_continue;
   public final Iq_1 id_super;
   public final Iq_1 id_this;
   public final Iq_1 id_else;
   private final Iq_1 id_volatile;
   private final Iq_1 id_goto;
   private final boolean id_while;

   public wh_3(float var1, boolean var2) {
      super(HU::id_private, var1, 0.0F, 64, 64);
      this.id_while = var2;
      this.id_goto = new Iq_1(this, 24, 0);
      this.id_goto.id_class(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, var1);
      this.id_volatile = new Iq_1(this, 0, 0);
      this.id_volatile.id_break(64, 32);
      this.id_volatile.id_class(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F, var1);
      if (var2) {
         this.id_throws = new Iq_1(this, 32, 48);
         this.id_throws.id_class(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var1);
         this.id_throws.id_class(5.0F, 2.5F, 0.0F);
         this.id_protected = new Iq_1(this, 40, 16);
         this.id_protected.id_class(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var1);
         this.id_protected.id_class(-5.0F, 2.5F, 0.0F);
         this.id_new = new Iq_1(this, 48, 48);
         this.id_new.id_class(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var1 + 0.25F);
         this.id_new.id_class(5.0F, 2.5F, 0.0F);
         this.id_continue = new Iq_1(this, 40, 32);
         this.id_continue.id_class(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var1 + 0.25F);
         this.id_continue.id_class(-5.0F, 2.5F, 10.0F);
      } else {
         this.id_throws = new Iq_1(this, 32, 48);
         this.id_throws.id_class(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.id_throws.id_class(5.0F, 2.0F, 0.0F);
         this.id_new = new Iq_1(this, 48, 48);
         this.id_new.id_class(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.25F);
         this.id_new.id_class(5.0F, 2.0F, 0.0F);
         this.id_continue = new Iq_1(this, 40, 32);
         this.id_continue.id_class(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.25F);
         this.id_continue.id_class(-5.0F, 2.0F, 10.0F);
      }

      this.id_catch = new Iq_1(this, 16, 48);
      this.id_catch.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.id_catch.id_class(1.9F, 12.0F, 0.0F);
      this.id_super = new Iq_1(this, 0, 48);
      this.id_super.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.25F);
      this.id_super.id_class(1.9F, 12.0F, 0.0F);
      this.id_this = new Iq_1(this, 0, 32);
      this.id_this.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.25F);
      this.id_this.id_class(-1.9F, 12.0F, 0.0F);
      this.id_else = new Iq_1(this, 16, 32);
      this.id_else.id_class(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1 + 0.25F);
      this.id_else.id_class(0.0F, 0.0F, 0.0F);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.id_class((T)var1, var2, var3, var4, var5, var6);
      this.id_super.id_class(this.id_catch);
      this.id_this.id_class(this.id_case);
      this.id_new.id_class(this.id_throws);
      this.id_continue.id_class(this.id_protected);
      this.id_else.id_class(this.id_byte);
      if (var1.id_class(rXQ.CHEST).id_class()) {
         if (var1.x()) {
            this.id_volatile.id_throws = 1.4F;
            this.id_volatile.id_protected = 1.85F;
         } else {
            this.id_volatile.id_throws = 0.0F;
            this.id_volatile.id_protected = 0.0F;
         }
      } else if (var1.x()) {
         this.id_volatile.id_throws = 0.3F;
         this.id_volatile.id_protected = 0.8F;
      } else {
         this.id_volatile.id_throws = -1.1F;
         this.id_volatile.id_protected = -0.85F;
      }
   }

   @Override
   public void id_class(rpZ_2 var1, Ml_1 var2) {
      Iq_1 var3 = this.id_class(var1);
      if (this.id_while) {
         float var4 = 0.5F * (float)(var1 == rpZ_2.RIGHT ? 1 : -1);
         var3.id_byte += var4;
         var3.id_class(var2);
         var3.id_byte -= var4;
      } else {
         var3.id_class(var2);
      }
   }

   public Iq_1 id_class(Random var1) {
      return this.id_native.get(var1.nextInt(this.id_native.size()));
   }

   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4) {
      this.id_goto.id_class(this.id_class);
      this.id_goto.id_byte = 0.0F;
      this.id_goto.id_protected = 0.0F;
      this.id_goto.id_class(var1, var2, var3, var4);
   }

   public void id_break(Ml_1 var1, Ok_1 var2, int var3, int var4) {
      this.id_volatile.id_class(var1, var2, var3, var4);
   }

   @Override
   protected Iterable<Iq_1> id_break() {
      return Iterables.concat(super.id_break(), ImmutableList.of(this.id_super, this.id_this, this.id_new, this.id_continue, this.id_else));
   }

   @Override
   public Iq_1 id_protected() {
      return this.id_volatile;
   }

   @Override
   public void a_(Iq_1 var1) {
      if (this.id_native == null) {
         this.id_native = Lists.newArrayList();
      }

      this.id_native.add(var1);
   }

   @Override
   public void b_(boolean var1) {
      super.b_(var1);
      this.id_new.id_finally = var1;
      this.id_continue.id_finally = var1;
      this.id_super.id_finally = var1;
      this.id_this.id_finally = var1;
      this.id_else.id_finally = var1;
      this.id_volatile.id_finally = var1;
      this.id_goto.id_finally = var1;
   }
}
