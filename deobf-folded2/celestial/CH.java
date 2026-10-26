package celestial;

import java.util.Random;
import java.util.stream.Stream;

public abstract class CH {
   private static final rfl_3 id_class = new rfl_3(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   protected final gm_3 id_byte;
   protected double id_protected;
   protected double id_throws;
   protected double id_case;
   protected double id_catch;
   protected double id_private;
   protected double id_implements;
   protected double id_finally;
   protected double id_extends;
   protected double id_native;
   private rfl_3 id_break = id_class;
   protected boolean id_volatile;
   protected boolean id_final = true;
   private boolean id_instanceof;
   protected boolean id_package;
   protected float id_int = 0.6F;
   protected float id_new = 1.8F;
   protected final Random id_continue = new Random();
   protected int id_super;
   protected int id_this;
   protected float id_else;
   protected float id_synchronized = 1.0F;
   protected float id_return = 1.0F;
   protected float id_public = 1.0F;
   protected float id_goto = 1.0F;
   protected float id_while;
   protected float id_try;
   private rrGi_1 id_throw = new rrGi_1();

   public CH id_byte(float var1) {
      this.id_finally *= (double)var1;
      this.id_extends = (this.id_extends - 0.1F) * (double)var1 + 0.1F;
      this.id_native *= (double)var1;
      return this;
   }

   private boolean id_byte(double var1, double var3, double var5) {
      if (!(this.id_int > 1.0F) && !(this.id_new > 1.0F)) {
         int var7 = rfU_2.id_byte(this.id_catch);
         int var8 = rfU_2.id_byte(this.id_private);
         int var9 = rfU_2.id_byte(this.id_implements);
         this.id_throw.id_class(var7, var8, var9);
         xc_3 var10 = this.id_byte.id_byte(this.id_throw);
         if (!var10.id_catch()) {
            return true;
         } else {
            double var11 = var1 > 0.0 ? this.id_break.id_protected : (var1 < 0.0 ? this.id_break.id_class : this.id_catch);
            double var13 = var3 > 0.0 ? this.id_break.id_throws : (var3 < 0.0 ? this.id_break.id_break : this.id_private);
            double var15 = var5 > 0.0 ? this.id_break.id_case : (var5 < 0.0 ? this.id_break.id_byte : this.id_implements);
            int var17 = rfU_2.id_byte(var11 + var1);
            int var18 = rfU_2.id_byte(var13 + var3);
            int var19 = rfU_2.id_byte(var15 + var5);
            if (var17 != var7 || var18 != var8 || var19 != var9) {
               this.id_throw.id_class(var17, var18, var19);
               xc_3 var20 = this.id_byte.id_byte(this.id_throw);
               if (!var20.id_catch()) {
                  return true;
               }
            }

            return false;
         }
      } else {
         return true;
      }
   }

   protected CH(gm_3 var1, double var2, double var4, double var6) {
      this.id_byte = var1;
      this.id_class(0.2F, 0.2F);
      this.id_break(var2, var4, var6);
      this.id_protected = var2;
      this.id_throws = var4;
      this.id_case = var6;
      this.id_this = (int)(4.0F / (this.id_continue.nextFloat() * 0.9F + 0.1F));
   }

   public CH(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6);
      this.id_finally = var8 + (Math.random() * 2.0 - 1.0) * 0.4F;
      this.id_extends = var10 + (Math.random() * 2.0 - 1.0) * 0.4F;
      this.id_native = var12 + (Math.random() * 2.0 - 1.0) * 0.4F;
      float var14 = (float)(Math.random() + Math.random() + 1.0) * 0.15F;
      float var15 = rfU_2.id_class(this.id_finally * this.id_finally + this.id_extends * this.id_extends + this.id_native * this.id_native);
      this.id_finally = this.id_finally / (double)var15 * (double)var14 * 0.4F;
      this.id_extends = this.id_extends / (double)var15 * (double)var14 * 0.4F + 0.1F;
      this.id_native = this.id_native / (double)var15 * (double)var14 * 0.4F;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName()
         + ", Pos ("
         + this.id_catch
         + ","
         + this.id_private
         + ","
         + this.id_implements
         + "), RGBA ("
         + this.id_synchronized
         + ","
         + this.id_return
         + ","
         + this.id_public
         + ","
         + this.id_goto
         + "), Age "
         + this.id_super;
   }

   public abstract void id_class(Ok_1 var1, ly_3 var2, float var3);

   public void id_class(double var1, double var3, double var5) {
      if (!this.id_instanceof) {
         double var7 = var1;
         double var9 = var3;
         double var11 = var5;
         if (this.id_final && (var1 != 0.0 || var3 != 0.0 || var5 != 0.0) && this.id_byte(var1, var3, var5)) {
            rjU_2 var13 = an_3.id_class(
               (an_3)null, new rjU_2(var1, var3, var5), this.id_volatile(), this.id_byte, rjm_3.id_break(), new rqJ_2<>(Stream.empty()), false, false
            );
            var1 = var13.id_break;
            var3 = var13.id_byte;
            var5 = var13.id_protected;
         }

         if (var1 != 0.0 || var3 != 0.0 || var5 != 0.0) {
            this.id_class(this.id_volatile().id_protected(var1, var3, var5));
            this.id_extends();
         }

         if (Math.abs(var9) >= 1.0E-5F && Math.abs(var3) < 1.0E-5F) {
            this.id_instanceof = true;
         }

         this.id_volatile = var9 != var3 && var9 < 0.0;
         if (var7 != var1) {
            this.id_finally = 0.0;
         }

         if (var11 != var5) {
            this.id_native = 0.0;
         }
      }
   }

   protected void id_class(float var1, float var2) {
      if (var1 != this.id_int || var2 != this.id_new) {
         this.id_int = var1;
         this.id_new = var2;
         rfl_3 var3 = this.id_volatile();
         double var4 = (var3.id_class + var3.id_protected - (double)var1) / 2.0;
         double var6 = (var3.id_byte + var3.id_case - (double)var1) / 2.0;
         this.id_class(new rfl_3(var4, var3.id_break, var6, var4 + (double)this.id_int, var3.id_break + (double)this.id_new, var6 + (double)this.id_int));
      }
   }

   public void id_class(float var1, float var2, float var3) {
      this.id_synchronized = var1;
      this.id_return = var2;
      this.id_public = var3;
   }

   public abstract CJ id_class();

   public void id_class(rfl_3 var1) {
      this.id_break = var1;
   }

   public void id_class(int var1) {
      this.id_this = var1;
   }

   public void id_break(double var1, double var3, double var5) {
      this.id_catch = var1;
      this.id_private = var3;
      this.id_implements = var5;
      float var7 = this.id_int / 2.0F;
      float var8 = this.id_new;
      this.id_class(new rfl_3(var1 - (double)var7, var3, var5 - (double)var7, var1 + (double)var7, var3 + (double)var8, var5 + (double)var7));
   }

   protected int id_break(float var1) {
      rfH_2 var2 = new rfH_2(this.id_catch, this.id_private, this.id_implements);
      return this.id_byte.id_int(var2) ? yX_2.id_class(this.id_byte, var2) : 0;
   }

   protected void id_throws(float var1) {
      this.id_goto = var1;
   }

   public void id_finally() {
      this.id_package = true;
   }

   protected void id_extends() {
      rfl_3 var1 = this.id_volatile();
      this.id_catch = (var1.id_class + var1.id_protected) / 2.0;
      this.id_private = var1.id_break;
      this.id_implements = (var1.id_byte + var1.id_case) / 2.0;
   }

   public void id_case() {
      this.id_protected = this.id_catch;
      this.id_throws = this.id_private;
      this.id_case = this.id_implements;
      if (this.id_super++ >= this.id_this) {
         this.id_finally();
      } else {
         this.id_extends = this.id_extends - 0.04 * (double)this.id_else;
         this.id_class(this.id_finally, this.id_extends, this.id_native);
         this.id_finally *= 0.98F;
         this.id_extends *= 0.98F;
         this.id_native *= 0.98F;
         if (this.id_volatile) {
            this.id_finally *= 0.7F;
            this.id_native *= 0.7F;
         }
      }
   }

   public int id_implements() {
      return this.id_this;
   }

   public CH id_protected(float var1) {
      this.id_class(0.2F * var1, 0.2F * var1);
      return this;
   }

   public boolean id_final() {
      return !(this instanceof CA);
   }

   public rfl_3 id_volatile() {
      return this.id_break;
   }

   public boolean id_native() {
      return !this.id_package;
   }
}
