package celestial;

public class rrse_3 implements rrsq_3 {
   private final rrsV_2<?, ?> class_;
   private final rrsV_2<?, ?> break_;

   public rrse_3(rol_3 var1, boolean var2, boolean var3) {
      this.class_ = var2 ? new rrsH_2(var1) : null;
      this.break_ = var3 ? new rrso_3(var1) : null;
   }

   public rrsT_2 class_(rRo_1 var1) {
      if (var1 == rRo_1.BLOCK) {
         return (rrsT_2)(this.class_ == null ? rrst_3.INSTANCE : this.class_);
      } else {
         return (rrsT_2)(this.break_ == null ? rrst_3.INSTANCE : this.break_);
      }
   }

   public void class_(rfj_3 var1, boolean var2) {
      if (this.class_ != null) {
         this.class_.class_(var1, var2);
      }

      if (this.break_ != null) {
         this.break_.class_(var1, var2);
      }
   }

   @Override
   public void class_(rjh_3 var1, boolean var2) {
      if (this.class_ != null) {
         this.class_.class_(var1, var2);
      }

      if (this.break_ != null) {
         this.break_.class_(var1, var2);
      }
   }

   public String class_(rRo_1 var1, rjh_3 var2) {
      if (var1 == rRo_1.BLOCK) {
         if (this.class_ != null) {
            return this.class_.break_(var2.continue_());
         }
      } else if (this.break_ != null) {
         return this.break_.break_(var2.continue_());
      }

      return "n/a";
   }

   public void class_(rRo_1 var1, rjh_3 var2, roH_2 var3, boolean var4) {
      if (var1 == rRo_1.BLOCK) {
         if (this.class_ != null) {
            this.class_.class_(var2.continue_(), var3, var4);
         }
      } else if (this.break_ != null) {
         this.break_.class_(var2.continue_(), var3, var4);
      }
   }

   public void class_(rfH_2 var1) {
      if (this.class_ != null) {
         this.class_.break_(var1);
      }

      if (this.break_ != null) {
         this.break_.break_(var1);
      }
   }

   public void class_(rfH_2 var1, int var2) {
      if (this.class_ != null) {
         this.class_.class_(var1, var2);
      }
   }

   public boolean class_() {
      return this.break_ != null && this.break_.class_() ? true : this.class_ != null && this.class_.class_();
   }

   public int class_(int var1, boolean var2, boolean var3) {
      if (this.class_ != null && this.break_ != null) {
         int var4 = var1 / 2;
         int var5 = this.class_.class_(var4, var2, var3);
         int var6 = var1 - var4 + var5;
         int var7 = this.break_.class_(var6, var2, var3);
         return var5 == 0 && var7 > 0 ? this.class_.class_(var7, var2, var3) : var7;
      } else if (this.class_ != null) {
         return this.class_.class_(var1, var2, var3);
      } else {
         return this.break_ != null ? this.break_.class_(var1, var2, var3) : var1;
      }
   }

   public int break_(rfH_2 var1, int var2) {
      int var3 = this.break_ == null ? 0 : this.break_.class_(var1) - var2;
      int var4 = this.class_ == null ? 0 : this.class_.class_(var1);
      return Math.max(var4, var3);
   }

   public void break_(rfj_3 var1, boolean var2) {
      if (this.class_ != null) {
         this.class_.break_(var1, var2);
      }

      if (this.break_ != null) {
         this.break_.break_(var1, var2);
      }
   }
}
