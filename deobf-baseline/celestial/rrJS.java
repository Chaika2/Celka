package celestial;

public class rrJS extends rrJM {
   private vm_3 id_class;
   private Qw_1 id_private;
   private rrJX id_implements = new rrJX(this, new rrJd_1());

   @Override
   public void id_byte(boolean var1) {
      if (var1) {
         ((Qw_1)this.id_volatile.id_class[20]).id_finally();
      }

      this.id_volatile.id_break(this);
   }

   public rrJS(vm_3 var1, Qw_1 var2) {
      super(new rgN_2(jI_2.id_class("of.options.otherTitle")));
      this.id_class = var1;
      this.id_private = var2;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_case, this.id_extends, this.id_package / 2, 15, 16777215);
      super.id_class(var1, var2, var3, var4);
      this.id_implements.id_class(var1, var2, var3, this.id_throws);
   }

   @Override
   protected void id_break(LZ var1) {
      if (var1 instanceof rrXi_1 var2 && var2.id_int) {
         if (var2.id_class == 200) {
            ((Qw_1)this.id_volatile.id_class[20]).id_break();
            this.id_volatile.id_else().id_catch();
            this.id_volatile.id_break(this.id_class);
         }

         if (var2.id_class == 210) {
            ((Qw_1)this.id_volatile.id_class[20]).id_break();
            String var3 = jI_2.id_class("of.message.other.reset");
            mT_2 var4 = new mT_2(this::id_byte, new rgN_2(var3), new rgN_2(""));
            this.id_volatile.id_break(var4);
         }
      }
   }

   @Override
   public void v_() {
      this.id_throws.clear();
      QH var1 = new QH(this.id_volatile.id_else());
      QF[] var2 = new QF[]{QF.k, QF.j, QF.W, QF.rz, QF.Z, QF.l, QF.r, QF.z, QF.rQ, QF.ru, var1, null};

      for (int var3 = 0; var3 < var2.length; var3++) {
         QF var4 = var2[var3];
         int var5 = this.id_package / 2 - 155 + var3 % 2 * 160;
         int var6 = this.id_int / 6 + 21 * (var3 / 2) - 12;
         LZ var7 = this.id_class(var4.id_class((Qw_1)this.id_volatile.id_class[20], var5, var6, 150));
         if (var4 == var1) {
            var7.id_int(310);
            var3++;
         }
      }

      this.id_class(new rrXi_1(210, this.id_package / 2 - 100, this.id_int / 6 + 168 + 11 - 44, jI_2.id_class("of.options.other.reset")));
      this.id_class(new rrXi_1(200, this.id_package / 2 - 100, this.id_int / 6 + 168 + 11, jI_2.id_class("gui.done")));
   }

   @Override
   public void w_() {
      super.w_();
      ((Qw_1)this.id_volatile.id_class[20]).id_break();
      this.id_volatile.id_else().id_catch();
   }
}
