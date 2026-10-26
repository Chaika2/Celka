package celestial;

public class ly_3 {
   private boolean id_class;
   private rRq_1 id_break;
   private an_3 id_byte;
   private rjU_2 id_protected = rjU_2.id_class;
   private rjU_2 id_throws = rjU_2.id_class;
   private final rfw_3 id_case = new rfw_3();
   private final rje_3 id_catch = new rje_3(0.0F, 0.0F, 1.0F);
   private final rje_3 id_private = new rje_3(0.0F, 1.0F, 0.0F);
   private final rje_3 id_implements = new rje_3(1.0F, 0.0F, 0.0F);
   private float id_finally;
   private float id_extends;
   private final rjY_2 id_native = new rjY_2(0.0F, 0.0F, 0.0F, 1.0F);
   private boolean id_volatile;
   private boolean id_final;
   private float id_package;
   private float id_int;

   public rfH_2 id_byte() {
      return this.id_case;
   }

   public float id_int() {
      return this.id_package;
   }

   public float id_class(float var1) {
      return rfU_2.id_catch(var1, this.id_int, this.id_package);
   }

   protected void id_class(rjU_2 var1) {
      this.id_protected = var1;
      this.id_case.id_break(var1.id_break, var1.id_byte, var1.id_protected);
   }

   public void id_class(float var1, float var2) {
      this.id_finally = var2;
      this.id_extends = var1;
      this.id_native.id_class(0.0F, 0.0F, 0.0F, 1.0F);
      this.id_native.id_class(rje_3.id_protected.id_byte(-var1));
      this.id_native.id_class(rje_3.id_break.id_byte(var2));
      this.id_catch.id_break(0.0F, 0.0F, 1.0F);
      this.id_catch.id_class(this.id_native);
      this.id_private.id_break(0.0F, 1.0F, 0.0F);
      this.id_private.id_class(this.id_native);
      this.id_implements.id_break(1.0F, 0.0F, 0.0F);
      this.id_implements.id_class(this.id_native);
   }

   private double id_class(double var1) {
      return var1;
   }

   public void id_class(QY var1, rRq_1 var2, an_3 var3, boolean var4, boolean var5, float var6) {
      this.id_class = true;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_volatile = var4;
      this.id_final = var5;
      rrLt_1 var7 = rrLt_1.id_class(var3.Pt(), var3.Ps(), false);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var7);
      rjU_2 var8 = var7.id_break();
      rjU_2 var9 = var7.id_class();
      boolean var10 = var7.id_byte();
      cb_3 var11 = (cb_3)var1.id_class[57];
      if (var3 == var11 && var11.s() != null) {
         PX var12 = var11.s().id_class();
         this.id_class(var12.id_throws(), var12.id_protected());
      } else {
         this.id_class(var3.id_throws(var6), var3.id_case(var6));
      }

      this.id_break(
         rfU_2.id_protected((double)var6, var8.id_break, var9.id_break),
         rfU_2.id_protected((double)var6, var8.id_byte, var9.id_byte) + (double)rfU_2.id_catch(var6, this.id_int, this.id_package),
         rfU_2.id_protected((double)var6, var8.id_protected, var9.id_protected)
      );
      this.id_throws = this.id_protected;
      if (!var10) {
         if (var4) {
            if (var5) {
               this.id_class(this.id_extends + 180.0F, -this.id_finally);
            }

            this.id_class(-this.id_class(4.0), 0.0, 0.0);
         } else if (var3 instanceof iB_2 && ((iB_2)var3).Sc()) {
            rpr_3 var13 = ((iB_2)var3).Bi();
            this.id_class(var13 != null ? var13.id_package() - 180.0F : 0.0F, 0.0F);
            this.id_class(0.0, 0.3, 0.0);
         }
      }
   }

   public void id_class(double var1, double var3, double var5) {
      double var7 = (double)this.id_catch.id_class() * var1 + (double)this.id_private.id_class() * var3 + (double)this.id_implements.id_class() * var5;
      double var9 = (double)this.id_catch.id_break() * var1 + (double)this.id_private.id_break() * var3 + (double)this.id_implements.id_break() * var5;
      double var11 = (double)this.id_catch.id_byte() * var1 + (double)this.id_private.id_byte() * var3 + (double)this.id_implements.id_byte() * var5;
      this.id_class(new rjU_2(this.id_protected.id_break + var7, this.id_protected.id_byte + var9, this.id_protected.id_protected + var11));
   }

   public void id_class() {
      if (this.id_byte != null) {
         this.id_int = this.id_package;
         this.id_package = this.id_package + (this.id_byte.Bx() - this.id_package) * 0.5F;
      }
   }

   public void id_break(float var1, float var2) {
      this.id_extends = var1;
      this.id_finally = var2;
   }

   public rjU_2 id_break() {
      return this.id_protected;
   }

   protected void id_break(double var1, double var3, double var5) {
      this.id_class(new rjU_2(var1, var3, var5));
   }

   public float id_throws() {
      return this.id_extends;
   }

   public rXE id_finally() {
      if (!this.id_class) {
         return rXG.id_class.id_private();
      } else {
         rXE var1 = this.id_break.id_break(this.id_case);
         return !var1.id_byte() && this.id_protected.id_byte >= (double)((float)this.id_case.c_() + var1.id_class(this.id_break, this.id_case))
            ? rXG.id_class.id_private()
            : var1;
      }
   }

   public an_3 id_catch() {
      return this.id_byte;
   }

   public xc_3 id_extends() {
      return !this.id_class ? xu_3.id_class.id_continue() : this.id_break.id_byte(this.id_case);
   }

   public rjY_2 id_case() {
      return this.id_native;
   }

   public boolean id_implements() {
      return this.id_volatile;
   }

   public rjU_2 id_new() {
      return this.id_throws;
   }

   public void id_package() {
      this.id_break = null;
      this.id_byte = null;
      this.id_class = false;
   }

   public float id_protected() {
      return this.id_finally;
   }

   public boolean id_private() {
      return this.id_class;
   }

   public final rje_3 id_final() {
      return this.id_private;
   }

   public final rje_3 id_volatile() {
      return this.id_catch;
   }

   public xc_3 id_native() {
      if (!this.id_class) {
         return xu_3.id_class.id_continue();
      } else {
         xc_3 var1 = this.id_break.id_byte(this.id_case);
         if (rrxr_3.u.id_byte()) {
            var1 = (xc_3)rrxr_3.id_private(var1, rrxr_3.u, this.id_break, this.id_case, this.id_protected);
         }

         return var1;
      }
   }
}
