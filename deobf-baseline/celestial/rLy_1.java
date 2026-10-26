package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class rLy_1 {
   protected final is_3 id_break;
   protected final rYB id_byte;
   protected rLC id_protected;
   protected double id_throws;
   protected int id_case;
   protected int id_catch;
   protected rjU_2 id_private = rjU_2.id_class;
   protected rja_3 id_implements = rja_3.id_case;
   protected long id_finally;
   protected long id_extends;
   protected double id_native;
   protected float id_volatile = 0.5F;
   protected boolean id_final;
   protected long id_package;
   protected rLn_1 id_int;
   private rfH_2 id_class;
   private int id_new;
   private float id_continue = 1.0F;
   private final rLl_1 id_super;
   private boolean id_this;

   public void id_byte(boolean var1) {
      this.id_int.id_byte(var1);
   }

   protected abstract rjU_2 id_byte();

   public rLn_1 id_int() {
      return this.id_int;
   }

   public rLy_1(is_3 var1, rYB var2) {
      this.id_break = var1;
      this.id_byte = var2;
      int var3 = rfU_2.id_byte(var1.id_class(iQ_2.id_break) * 16.0);
      this.id_super = this.id_class(var3);
   }

   public void id_class() {
      this.id_case++;
      if (this.id_final) {
         this.id_implements();
      }

      if (!this.id_native()) {
         if (this.id_break()) {
            this.id_extends();
         } else if (this.id_protected != null && !this.id_protected.id_byte()) {
            rjU_2 var1 = this.id_byte();
            rjU_2 var2 = this.id_protected.id_class(this.id_break);
            if (var1.id_byte > var2.id_byte
               && !this.id_break.BL()
               && rfU_2.id_byte(var1.id_break) == rfU_2.id_byte(var2.id_break)
               && rfU_2.id_byte(var1.id_protected) == rfU_2.id_byte(var2.id_protected)) {
               this.id_protected.id_class();
            }
         }

         ruP_2.id_class(this.id_byte, this.id_break, this.id_protected, this.id_volatile);
         if (!this.id_native()) {
            rjU_2 var3 = this.id_protected.id_class(this.id_break);
            rfH_2 var4 = new rfH_2(var3);
            this.id_break
               .id_super()
               .id_class(
                  var3.id_break,
                  this.id_byte.id_byte(var4.id_break()).id_catch() ? var3.id_byte : rLf_1.id_class(this.id_byte, var4),
                  var3.id_protected,
                  this.id_throws
               );
         }
      }
   }

   public boolean id_class(rLC var1, double var2) {
      if (var1 == null) {
         this.id_protected = null;
         return false;
      } else {
         if (!var1.id_class(this.id_protected)) {
            this.id_protected = var1;
         }

         if (this.id_native()) {
            return false;
         } else {
            this.id_protected();
            if (this.id_protected.id_throws() <= 0) {
               return false;
            } else {
               this.id_throws = var2;
               rjU_2 var4 = this.id_byte();
               this.id_catch = this.id_case;
               this.id_private = var4;
               return true;
            }
         }
      }
   }

   public boolean id_class(an_3 var1, double var2) {
      rLC var4 = this.id_class(var1, 1);
      return var4 != null && this.id_class(var4, var2);
   }

   public boolean id_class(double var1, double var3, double var5, double var7) {
      return this.id_class(this.id_class(var1, var3, var5, 1), var7);
   }

   public rLC id_class(an_3 var1, int var2) {
      return this.id_class(ImmutableSet.of(var1.Bs()), 16, true, var2);
   }

   protected rLC id_class(Set<rfH_2> var1, int var2, boolean var3, int var4) {
      if (var1.isEmpty()) {
         return null;
      } else if (this.id_break.re() < 0.0) {
         return null;
      } else if (!this.id_break()) {
         return null;
      } else if (this.id_protected != null && !this.id_protected.id_byte() && var1.contains(this.id_class)) {
         return this.id_protected;
      } else {
         float var5 = (float)this.id_break.id_class(iQ_2.id_break);
         rfH_2 var6 = var3 ? this.id_break.Bs().id_final() : this.id_break.Bs();
         int var7 = (int)(var5 + (float)var2);
         rRU var8 = new rRU(this.id_byte, var6.id_break(-var7, -var7, -var7), var6.id_break(var7, var7, var7));
         rLC var9 = this.id_super.id_class(var8, this.id_break, var1, var5, var4, this.id_continue);
         if (var9 != null && var9.id_volatile() != null) {
            this.id_class = var9.id_volatile();
            this.id_new = var4;
            this.id_super();
         }

         return var9;
      }
   }

   protected abstract boolean id_class(rjU_2 var1, rjU_2 var2, int var3, int var4, int var5);

   protected void id_class(rjU_2 var1) {
      if (this.id_case - this.id_catch > 100) {
         if (var1.id_implements(this.id_private) < 2.25) {
            this.id_this = true;
            this.id_final();
         } else {
            this.id_this = false;
         }

         this.id_catch = this.id_case;
         this.id_private = var1;
      }

      if (this.id_protected != null && !this.id_protected.id_byte()) {
         rfH_2 var2 = this.id_protected.id_catch();
         if (var2.equals(this.id_implements)) {
            this.id_finally = this.id_finally + (rqR_2.id_break() - this.id_extends);
         } else {
            this.id_implements = var2;
            double var3 = var1.id_case(rjU_2.id_protected(this.id_implements));
            this.id_native = this.id_break.sB() > 0.0F ? var3 / (double)this.id_break.sB() * 1000.0 : 0.0;
         }

         if (this.id_native > 0.0 && (double)this.id_finally > this.id_native * 3.0) {
            this.id_throws();
         }

         this.id_extends = rqR_2.id_break();
      }
   }

   public boolean id_class(rfH_2 var1) {
      rfH_2 var2 = var1.id_break();
      return this.id_byte.id_byte(var2).id_implements(this.id_byte, var2);
   }

   public rLC id_class(Stream<rfH_2> var1, int var2) {
      return this.id_class(var1.collect(Collectors.toSet()), 8, false, var2);
   }

   public final rLC id_class(double var1, double var3, double var5, int var7) {
      return this.id_class(new rfH_2(var1, var3, var5), var7);
   }

   protected abstract rLl_1 id_class(int var1);

   public void id_class(double var1) {
      this.id_throws = var1;
   }

   public rLC id_class(rfH_2 var1, int var2) {
      return this.id_class(ImmutableSet.of(var1), 8, false, var2);
   }

   public rLC id_class(Set<rfH_2> var1, int var2) {
      return this.id_class(var1, 8, false, var2);
   }

   public void id_class(float var1) {
      this.id_continue = var1;
   }

   public void id_break(rfH_2 var1) {
      if (this.id_protected != null && !this.id_protected.id_byte() && this.id_protected.id_throws() != 0) {
         rLq_1 var2 = this.id_protected.id_protected();
         rjU_2 var3 = new rjU_2(
            ((double)var2.id_class + this.id_break.rx()) / 2.0,
            ((double)var2.id_break + this.id_break.re()) / 2.0,
            ((double)var2.id_byte + this.id_break.BO()) / 2.0
         );
         if (var1.id_class(var3, (double)(this.id_protected.id_throws() - this.id_protected.id_case()))) {
            this.id_implements();
         }
      }
   }

   protected abstract boolean id_break();

   private boolean id_break(rjU_2 var1) {
      if (this.id_protected.id_case() + 1 >= this.id_protected.id_throws()) {
         return false;
      } else {
         rjU_2 var2 = rjU_2.id_protected(this.id_protected.id_catch());
         if (!var1.id_class(var2, 2.0)) {
            return false;
         } else {
            rjU_2 var3 = rjU_2.id_protected(this.id_protected.id_protected(this.id_protected.id_case() + 1));
            rjU_2 var4 = var3.id_protected(var2);
            rjU_2 var5 = var1.id_protected(var2);
            return var4.id_break(var5) > 0.0;
         }
      }
   }

   private void id_throws() {
      this.id_super();
      this.id_final();
   }

   public rLC id_finally() {
      return this.id_protected;
   }

   public rfH_2 id_catch() {
      return this.id_class;
   }

   protected void id_extends() {
      rjU_2 var1 = this.id_byte();
      this.id_volatile = this.id_break.PN() > 0.75F ? this.id_break.PN() / 2.0F : 0.75F - this.id_break.PN() / 2.0F;
      rfH_2 var2 = this.id_protected.id_catch();
      double var3 = Math.abs(this.id_break.rx() - ((double)var2.b_() + 0.5));
      double var5 = Math.abs(this.id_break.re() - (double)var2.c_());
      double var7 = Math.abs(this.id_break.BO() - ((double)var2.d_() + 0.5));
      boolean var9 = var3 < (double)this.id_volatile && var7 < (double)this.id_volatile && var5 < 1.0;
      if (var9 || this.id_break.id_break(this.id_protected.id_private().id_native) && this.id_break(var1)) {
         this.id_protected.id_class();
      }

      this.id_class(var1);
   }

   public void id_case() {
      this.id_continue = 1.0F;
   }

   public boolean id_continue() {
      return this.id_this;
   }

   public void id_implements() {
      if (this.id_byte.r() - this.id_package > 20L) {
         if (this.id_class != null) {
            this.id_protected = null;
            this.id_protected = this.id_class(this.id_class, this.id_new);
            this.id_package = this.id_byte.r();
            this.id_final = false;
         }
      } else {
         this.id_final = true;
      }
   }

   public boolean id_new() {
      return this.id_int.id_throws();
   }

   protected boolean id_package() {
      return this.id_break.Pa() || this.id_break.ry();
   }

   private void id_super() {
      this.id_implements = rja_3.id_case;
      this.id_finally = 0L;
      this.id_native = 0.0;
      this.id_this = false;
   }

   protected void id_protected() {
      if (this.id_protected != null) {
         for (int var1 = 0; var1 < this.id_protected.id_throws(); var1++) {
            rLq_1 var2 = this.id_protected.id_class(var1);
            rLq_1 var3 = var1 + 1 < this.id_protected.id_throws() ? this.id_protected.id_class(var1 + 1) : null;
            xc_3 var4 = this.id_byte.id_byte(new rfH_2(var2.id_class, var2.id_break, var2.id_byte));
            if (var4.id_class(xu_3.Sb)) {
               this.id_protected.id_class(var1, var2.id_class(var2.id_class, var2.id_break + 1, var2.id_byte));
               if (var3 != null && var2.id_break >= var3.id_break) {
                  this.id_protected.id_class(var1 + 1, var2.id_class(var3.id_class, var2.id_break + 1, var3.id_byte));
               }
            }
         }
      }
   }

   public boolean id_private() {
      return this.id_final;
   }

   public void id_final() {
      this.id_protected = null;
   }

   public boolean id_volatile() {
      return !this.id_native();
   }

   public boolean id_native() {
      return this.id_protected == null || this.id_protected.id_byte();
   }
}
