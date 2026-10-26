package celestial;

public class Li_1 extends LV<Ar_1> {
   static final rqO_2 id_throws = new rqO_2("textures/gui/resource_packs.png");
   static final rgP_2 id_case = new rgn_3("pack.incompatible");
   private static final rgP_2 id_catch = new rgn_3("pack.incompatible.confirm.title");
   public final rgP_2 id_class;

   public Li_1(QY var1, int var2, int var3, rgP_2 var4) {
      super(var1, var2, var3, 32, var3 - 55 + 4, 36);
      this.id_class = var4;
      this.id_this = false;
      this.id_class(true, 13);
   }

   @Override
   protected void id_class(Ml_1 var1, int var2, int var3, yb_3 var4) {
      rVi_1 var5 = new rgN_2("").id_class(this.id_class).id_class(rgF_2.UNDERLINE, rgF_2.BOLD);
      ((cm_3)this.id_native.id_class[15])
         .id_byte(
            var1,
            var5,
            (float)(var2 + this.id_final / 2 - ((cm_3)this.id_native.id_class[15]).id_class(var5) / 2),
            (float)Math.min(this.id_int + 3, var3),
            16777215
         );
   }

   @Override
   protected int id_protected() {
      return this.id_continue - 6;
   }

   public int id_private() {
      return this.id_package;
   }

   @Override
   public int F_() {
      return this.id_final;
   }
}
