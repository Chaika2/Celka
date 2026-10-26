package celestial;

import java.util.Random;

public abstract class rHK extends rHD {
   protected rqO_2 id_protected;
   protected long id_throws;

   protected boolean id_byte(rcd_3 var1) {
      if (this.id_protected == null) {
         return false;
      } else {
         var1.id_class("LootTable", this.id_protected.toString());
         if (this.id_throws != 0L) {
            var1.id_class("LootTableSeed", this.id_throws);
         }

         return true;
      }
   }

   @Override
   public boolean id_byte(rhd_3 var1) {
      return this.id_extends.id_class(this.id_native) != this
         ? false
         : !(var1.id_class((double)this.id_native.b_() + 0.5, (double)this.id_native.c_() + 0.5, (double)this.id_native.d_() + 0.5) > 64.0);
   }

   protected rHK(ryW_2<?> var1) {
      super(var1);
   }

   protected abstract void id_class(rqs_3<rdn_3> var1);

   @Override
   public rdn_3 id_class(int var1, int var2) {
      this.id_protected((rhd_3)null);
      rdn_3 var3 = rXC.id_class(this.ad_(), var1, var2);
      if (!var3.id_class()) {
         this.id_break();
      }

      return var3;
   }

   public void id_class(rqO_2 var1, long var2) {
      this.id_protected = var1;
      this.id_throws = var2;
   }

   public static void id_class(rRq_1 var0, Random var1, rfH_2 var2, rqO_2 var3) {
      ryO_2 var4 = var0.id_class(var2);
      if (var4 instanceof rHK) {
         ((rHK)var4).id_class(var3, var1.nextLong());
      }
   }

   @Override
   public void id_break(int var1, rdn_3 var2) {
      this.id_protected((rhd_3)null);
      this.ad_().set(var1, var2);
      if (var2.id_char() > this.ab_()) {
         var2.id_throws(this.ab_());
      }

      this.id_break();
   }

   protected boolean id_break(rcd_3 var1) {
      if (var1.id_byte("LootTable", 8)) {
         this.id_protected = new rqO_2(var1.id_native("LootTable"));
         this.id_throws = var1.id_implements("LootTableSeed");
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean id_throws(rhd_3 var1) {
      return super.id_throws(var1) && (this.id_protected == null || !var1.id_native());
   }

   @Override
   public rdn_3 id_extends(int var1) {
      this.id_protected((rhd_3)null);
      return this.ad_().get(var1);
   }

   @Override
   public boolean id_return() {
      this.id_protected((rhd_3)null);
      return this.ad_().stream().allMatch(rdn_3::id_class);
   }

   @Override
   public void id_public() {
      this.ad_().clear();
   }

   public void id_protected(rhd_3 var1) {
      if (this.id_protected != null && this.id_extends.id_const() != null) {
         rzL_2 var2 = this.id_extends.id_const().o().id_class(this.id_protected);
         if (var1 instanceof rhN_2) {
            Oo_1.id_const.id_class((rhN_2)var1, this.id_protected);
         }

         this.id_protected = null;
         rzP_2 var3 = new rzP_2((rrEm_1)this.id_extends).id_class(rzQ_2.id_case, rjU_2.id_class((rja_3)this.id_native)).id_class(this.id_throws);
         if (var1 != null) {
            var3.id_class(var1.sY()).id_class(rzQ_2.id_class, var1);
         }

         var2.id_class(this, var3.id_class(rzz_3.id_break));
      }
   }

   @Override
   public rdn_3 id_native(int var1) {
      this.id_protected((rhd_3)null);
      return rXC.id_class(this.ad_(), var1);
   }

   protected abstract rqs_3<rdn_3> ad_();

   @Override
   public rJr_1 createMenu(int var1, rhz_3 var2, rhd_3 var3) {
      if (this.id_throws(var3)) {
         this.id_protected(var2.id_throws);
         return this.id_class(var1, var2);
      } else {
         return null;
      }
   }
}
