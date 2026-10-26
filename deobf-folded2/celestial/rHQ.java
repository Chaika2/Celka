package celestial;

import java.util.Arrays;

public class rHQ extends rHD implements rHf_1, rXF {
   private static final int[] id_break = new int[]{3};
   private static final int[] id_byte = new int[]{0, 1, 2, 3};
   private static final int[] id_protected = new int[]{0, 1, 2, 4};
   private rqs_3<rdn_3> id_throws = rqs_3.id_class(5, rdn_3.id_break);
   int id_case;
   private boolean[] id_catch;
   private rdb_3 id_private;
   int id_implements;
   protected final rpF_2 id_class = new rHN(this);

   @Override
   public boolean id_byte(rhd_3 var1) {
      return this.id_extends.id_class(this.id_native) != this
         ? false
         : !(var1.id_class((double)this.id_native.b_() + 0.5, (double)this.id_native.c_() + 0.5, (double)this.id_native.d_() + 0.5) > 64.0);
   }

   public rHQ() {
      super(ryW_2.id_extends);
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      this.id_throws = rqs_3.id_class(this.id_else(), rdn_3.id_break);
      rXC.id_break(var2, this.id_throws);
      this.id_case = var2.id_catch("BrewTime");
      this.id_implements = var2.id_case("Fuel");
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("BrewTime", (short)this.id_case);
      rXC.id_class(var1, this.id_throws);
      var1.id_class("Fuel", (byte)this.id_implements);
      return var1;
   }

   @Override
   public boolean id_class(int var1, rdn_3 var2, rpr_3 var3) {
      return this.a_(var1, var2);
   }

   @Override
   public int[] id_class(rpr_3 var1) {
      if (var1 == rpr_3.UP) {
         return id_break;
      } else {
         return var1 == rpr_3.DOWN ? id_byte : id_protected;
      }
   }

   @Override
   public rdn_3 id_class(int var1, int var2) {
      return rXC.id_class(this.id_throws, var1, var2);
   }

   @Override
   protected rJr_1 id_class(int var1, rhz_3 var2) {
      return new rXf_1(var1, var2, this, this.id_class);
   }

   @Override
   public void id_break(int var1, rdn_3 var2) {
      if (var1 >= 0 && var1 < this.id_throws.size()) {
         this.id_throws.set(var1, var2);
      }
   }

   @Override
   public boolean id_break(int var1, rdn_3 var2, rpr_3 var3) {
      return var1 == 3 ? var2.id_break() == rdy_3.Jn : true;
   }

   @Override
   public void id_throws() {
      rdn_3 var1 = this.id_throws.get(4);
      if (this.id_implements <= 0 && var1.id_break() == rdy_3.JH) {
         this.id_implements = 20;
         var1.id_catch(1);
         this.id_break();
      }

      boolean var2 = this.id_private();
      boolean var3 = this.id_case > 0;
      rdn_3 var4 = this.id_throws.get(3);
      if (var3) {
         this.id_case--;
         boolean var5 = this.id_case == 0;
         if (var5 && var2) {
            this.id_finally();
            this.id_break();
         } else if (!var2) {
            this.id_case = 0;
            this.id_break();
         } else if (this.id_private != var4.id_break()) {
            this.id_case = 0;
            this.id_break();
         }
      } else if (var2 && this.id_implements > 0) {
         this.id_implements--;
         this.id_case = 400;
         this.id_private = var4.id_break();
         this.id_break();
      }

      if (!this.id_extends.id_continue) {
         boolean[] var8 = this.id_catch();
         if (!Arrays.equals(var8, this.id_catch)) {
            this.id_catch = var8;
            xc_3 var6 = this.id_extends.id_byte(this.id_char());
            if (!(var6.id_break() instanceof xZ_2)) {
               return;
            }

            for (int var7 = 0; var7 < xZ_2.id_volatile.length; var7++) {
               var6 = var6.id_class(xZ_2.id_volatile[var7], Boolean.valueOf(var8[var7]));
            }

            this.id_extends.id_class(this.id_native, var6, 2);
         }
      }
   }

   private void id_finally() {
      rdn_3 var1 = this.id_throws.get(3);

      for (int var2 = 0; var2 < 3; var2++) {
         this.id_throws.set(var2, rAr_1.id_protected(var1, this.id_throws.get(var2)));
      }

      var1.id_catch(1);
      rfH_2 var4 = this.id_char();
      if (var1.id_break().id_int()) {
         rdn_3 var3 = new rdn_3(var1.id_break().id_package());
         if (var1.id_class()) {
            var1 = var3;
         } else if (!this.id_extends.id_continue) {
            rXn_1.id_class(this.id_extends, (double)var4.b_(), (double)var4.c_(), (double)var4.d_(), var3);
         }
      }

      this.id_throws.set(3, var1);
      this.id_extends.id_byte(1035, var4, 0);
   }

   public boolean[] id_catch() {
      boolean[] var1 = new boolean[3];

      for (int var2 = 0; var2 < 3; var2++) {
         if (!this.id_throws.get(var2).id_class()) {
            var1[var2] = true;
         }
      }

      return var1;
   }

   @Override
   public rdn_3 id_extends(int var1) {
      return var1 >= 0 && var1 < this.id_throws.size() ? this.id_throws.get(var1) : rdn_3.id_break;
   }

   @Override
   public int id_else() {
      return this.id_throws.size();
   }

   @Override
   public boolean id_return() {
      for (rdn_3 var2 : this.id_throws) {
         if (!var2.id_class()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void id_public() {
      this.id_throws.clear();
   }

   private boolean id_private() {
      rdn_3 var1 = this.id_throws.get(3);
      if (var1.id_class()) {
         return false;
      } else if (!rAr_1.id_class(var1)) {
         return false;
      } else {
         for (int var2 = 0; var2 < 3; var2++) {
            rdn_3 var3 = this.id_throws.get(var2);
            if (!var3.id_class() && rAr_1.id_class(var3, var1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public rdn_3 id_native(int var1) {
      return rXC.id_class(this.id_throws, var1);
   }

   @Override
   public boolean a_(int var1, rdn_3 var2) {
      if (var1 == 3) {
         return rAr_1.id_class(var2);
      } else {
         rdb_3 var3 = var2.id_break();
         return var1 == 4
            ? var3 == rdy_3.JH
            : (var3 == rdy_3.JA || var3 == rdy_3.kk || var3 == rdy_3.kQ || var3 == rdy_3.Jn) && this.id_extends(var1).id_class();
      }
   }

   @Override
   protected rgP_2 X_() {
      return new rgn_3("container.brewing");
   }
}
