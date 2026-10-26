package celestial;

public class rrse_3 implements rrsq_3 {
   private final rrsV_2<?, ?> id_class;
   private final rrsV_2<?, ?> id_break;

   public rrse_3(rol_3 var1, boolean var2, boolean var3) {
      this.id_class = var2 ? new rrsH_2(var1) : null;
      this.id_break = var3 ? new rrso_3(var1) : null;
   }

   public rrsT_2 id_class(rRo_1 var1) {
      if (var1 == rRo_1.BLOCK) {
         return (rrsT_2)(this.id_class == null ? rrst_3.INSTANCE : this.id_class);
      } else {
         return (rrsT_2)(this.id_break == null ? rrst_3.INSTANCE : this.id_break);
      }
   }

   public void id_class(rfj_3 var1, boolean var2) {
      if (this.id_class != null) {
         this.id_class.id_class(var1, var2);
      }

      if (this.id_break != null) {
         this.id_break.id_class(var1, var2);
      }
   }

   @Override
   public void id_class(rjh_3 var1, boolean var2) {
      if (this.id_class != null) {
         this.id_class.id_class(var1, var2);
      }

      if (this.id_break != null) {
         this.id_break.id_class(var1, var2);
      }
   }

   public String id_class(rRo_1 var1, rjh_3 var2) {
      if (var1 == rRo_1.BLOCK) {
         if (this.id_class != null) {
            return this.id_class.id_break(var2.id_continue());
         }
      } else if (this.id_break != null) {
         return this.id_break.id_break(var2.id_continue());
      }

      return "n/a";
   }

   public void id_class(rRo_1 var1, rjh_3 var2, roH_2 var3, boolean var4) {
      if (var1 == rRo_1.BLOCK) {
         if (this.id_class != null) {
            this.id_class.id_class(var2.id_continue(), var3, var4);
         }
      } else if (this.id_break != null) {
         this.id_break.id_class(var2.id_continue(), var3, var4);
      }
   }

   public void id_class(rfH_2 var1) {
      if (this.id_class != null) {
         this.id_class.id_break(var1);
      }

      if (this.id_break != null) {
         this.id_break.id_break(var1);
      }
   }

   public void id_class(rfH_2 var1, int var2) {
      if (this.id_class != null) {
         this.id_class.id_class(var1, var2);
      }
   }

   public boolean id_class() {
      return this.id_break != null && this.id_break.id_class() ? true : this.id_class != null && this.id_class.id_class();
   }

   public int id_class(int var1, boolean var2, boolean var3) {
      if (this.id_class != null && this.id_break != null) {
         int var4 = var1 / 2;
         int var5 = this.id_class.id_class(var4, var2, var3);
         int var6 = var1 - var4 + var5;
         int var7 = this.id_break.id_class(var6, var2, var3);
         return var5 == 0 && var7 > 0 ? this.id_class.id_class(var7, var2, var3) : var7;
      } else if (this.id_class != null) {
         return this.id_class.id_class(var1, var2, var3);
      } else {
         return this.id_break != null ? this.id_break.id_class(var1, var2, var3) : var1;
      }
   }

   public int id_break(rfH_2 var1, int var2) {
      int var3 = this.id_break == null ? 0 : this.id_break.id_class(var1) - var2;
      int var4 = this.id_class == null ? 0 : this.id_class.id_class(var1);
      return Math.max(var4, var3);
   }

   public void id_break(rfj_3 var1, boolean var2) {
      if (this.id_class != null) {
         this.id_class.id_break(var1, var2);
      }

      if (this.id_break != null) {
         this.id_break.id_break(var1, var2);
      }
   }
}
