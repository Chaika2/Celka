package celestial;

public class rsW_2 extends rsJ_2 {
   static final rut_3<String> id_class = rmE_2.id_class(rsW_2.class, ruw_3.id_protected);
   static final rut_3<rgP_2> id_break = rmE_2.id_class(rsW_2.class, ruw_3.id_throws);
   private final rHm_1 id_protected = new rsz_3(this);
   private int id_catch;

   @Override
   public xc_3 id_int() {
      return xu_3.SZ.id_continue();
   }

   public rsW_2(aI_2<? extends rsW_2> var1, rYB var2) {
      super(var1, var2);
   }

   public rsW_2(rYB var1, double var2, double var4, double var6) {
      super(aI_2.P, var1, var2, var4, var6);
   }

   @Override
   public ryZ_2 id_class(rhd_3 var1, rpm_3 var2) {
      return this.id_protected.id_class(var1);
   }

   @Override
   public void id_class(int var1, int var2, int var3, boolean var4) {
      if (var4 && (Integer)this.id_throws[41] - this.id_catch >= 4) {
         this.id_else().id_class((rYB)this.id_throws[7]);
         this.id_catch = (Integer)this.id_throws[41];
      }
   }

   @Override
   public void id_class(rut_3<?> var1) {
      super.id_class(var1);
      if (id_break.equals(var1)) {
         try {
            this.id_protected.id_break(this.BQ().id_class(id_break));
         } catch (Throwable var3) {
         }
      } else if (id_class.equals(var1)) {
         this.id_protected.id_class(this.BQ().id_class(id_class));
      }
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      this.id_protected.id_class(var1);
   }

   @Override
   public boolean o() {
      return true;
   }

   @Override
   protected void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_protected.id_break(var1);
      this.BQ().id_break(id_class, this.id_else().id_private());
      this.BQ().id_break(id_break, this.id_else().id_catch());
   }

   public rHm_1 id_else() {
      return this.id_protected;
   }

   @Override
   public rsd_3 id_final() {
      return rsd_3.COMMAND_BLOCK;
   }

   @Override
   protected void m_() {
      super.m_();
      this.BQ().id_class(id_class, "");
      this.BQ().id_class(id_break, rgN_2.id_byte);
   }
}
