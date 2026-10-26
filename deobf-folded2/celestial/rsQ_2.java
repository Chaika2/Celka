package celestial;

public abstract class rsQ_2 extends rsJ_2 implements rJZ, rXu_1 {
   private rqs_3<rdn_3> id_class = rqs_3.id_class(36, rdn_3.id_break);
   private boolean id_break = true;
   private rqO_2 id_protected;
   private long id_catch;

   @Override
   public boolean id_byte(rhd_3 var1) {
      return this.id_throws[27] ? false : !(var1.id_int(this) > 64.0);
   }

   protected rsQ_2(aI_2<?> var1, rYB var2) {
      super(var1, var2);
   }

   protected rsQ_2(aI_2<?> var1, double var2, double var4, double var6, rYB var8) {
      super(var1, var8, var2, var4, var6);
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      if (this.id_protected != null) {
         var1.id_class("LootTable", this.id_protected.toString());
         if (this.id_catch != 0L) {
            var1.id_class("LootTableSeed", this.id_catch);
         }
      } else {
         rXC.id_class(var1, this.id_class);
      }
   }

   @Override
   public an_3 id_class(rrEm_1 var1) {
      this.id_break = false;
      return super.id_class(var1);
   }

   @Override
   public boolean id_class(int var1, rdn_3 var2) {
      if (var1 >= 0 && var1 < this.id_else()) {
         this.id_break(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public ryZ_2 id_class(rhd_3 var1, rpm_3 var2) {
      var1.id_class((rJZ)this);
      if (!((rYB)var1.id_throws[7]).id_continue) {
         rbW_2.id_class(var1, true);
         return ryZ_2.CONSUME;
      } else {
         return ryZ_2.SUCCESS;
      }
   }

   public void id_class(rqO_2 var1, long var2) {
      this.id_protected = var1;
      this.id_catch = var2;
   }

   protected abstract rJr_1 id_class(int var1, rhz_3 var2);

   @Override
   public rdn_3 id_class(int var1, int var2) {
      this.id_protected((rhd_3)null);
      return rXC.id_class(this.id_class, var1, var2);
   }

   @Override
   protected void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_class = rqs_3.id_class(this.id_else(), rdn_3.id_break);
      if (var1.id_byte("LootTable", 8)) {
         this.id_protected = new rqO_2(var1.id_native("LootTable"));
         this.id_catch = var1.id_implements("LootTableSeed");
      } else {
         rXC.id_break(var1, this.id_class);
      }
   }

   @Override
   public void id_break(rye_3 var1) {
      super.id_break(var1);
      if (((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
         rXn_1.id_class((rYB)this.id_throws[7], this, this);
         if (!((rYB)this.id_throws[7]).id_continue) {
            an_3 var2 = var1.id_finally();
            if (var2 != null && var2.BC() == aI_2.rM) {
               rbW_2.id_class((rhd_3)var2, true);
            }
         }
      }
   }

   @Override
   public void id_break() {
   }

   @Override
   public void id_break(int var1, rdn_3 var2) {
      this.id_protected((rhd_3)null);
      this.id_class.set(var1, var2);
      if (!var2.id_class() && var2.id_char() > this.ab_()) {
         var2.id_throws(this.ab_());
      }
   }

   @Override
   public void PD() {
      if (!((rYB)this.id_throws[7]).id_continue && this.id_break) {
         rXn_1.id_class((rYB)this.id_throws[7], this, this);
      }

      super.PD();
   }

   @Override
   public rdn_3 id_extends(int var1) {
      this.id_protected((rhd_3)null);
      return this.id_class.get(var1);
   }

   @Override
   protected void id_case() {
      float var1 = 0.98F;
      if (this.id_protected == null) {
         int var2 = 15 - rJr_1.id_break(this);
         var1 += (float)var2 * 0.001F;
      }

      this.id_byte(this.rv().id_throws((double)var1, 0.0, (double)var1));
   }

   @Override
   public boolean id_return() {
      for (rdn_3 var2 : this.id_class) {
         if (!var2.id_class()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void id_public() {
      this.id_protected((rhd_3)null);
      this.id_class.clear();
   }

   public void id_protected(rhd_3 var1) {
      if (this.id_protected != null && ((rYB)this.id_throws[7]).id_const() != null) {
         rzL_2 var2 = ((rYB)this.id_throws[7]).id_const().o().id_class(this.id_protected);
         if (var1 instanceof rhN_2) {
            Oo_1.id_const.id_class((rhN_2)var1, this.id_protected);
         }

         this.id_protected = null;
         rzP_2 var3 = new rzP_2((rrEm_1)((rYB)this.id_throws[7])).id_class(rzQ_2.id_case, this.Ps()).id_class(this.id_catch);
         if (var1 != null) {
            var3.id_class(var1.sY()).id_class(rzQ_2.id_class, var1);
         }

         var2.id_class(this, var3.id_class(rzz_3.id_break));
      }
   }

   @Override
   public rdn_3 id_native(int var1) {
      this.id_protected((rhd_3)null);
      rdn_3 var2 = this.id_class.get(var1);
      if (var2.id_class()) {
         return rdn_3.id_break;
      } else {
         this.id_class.set(var1, rdn_3.id_break);
         return var2;
      }
   }

   @Override
   public rJr_1 createMenu(int var1, rhz_3 var2, rhd_3 var3) {
      if (this.id_protected != null && var3.id_native()) {
         return null;
      } else {
         this.id_protected(var2.id_throws);
         return this.id_class(var1, var2);
      }
   }
}
