package celestial;

public class ze_3 extends Ww_1 {
   private static Qh_1 id_package;
   private static Qh_1 id_int;

   protected ze_3(Jq_1 var1) {
      super(Wf_1.WITHER_SKELETON, var1);
   }

   public static void id_class(rYB var0, rfH_2 var1, rys_3 var2) {
      if (!var0.id_continue) {
         xc_3 var3 = var2.id_abstract();
         boolean var4 = var3.id_class(xu_3.sh) || var3.id_class(xu_3.sX);
         if (var4 && var1.c_() >= 0 && var0.id_abstract() != rRO.PEACEFUL) {
            Qh_1 var5 = id_implements();
            QJ var6 = var5.id_class(var0, var1);
            if (var6 != null) {
               for (int var7 = 0; var7 < var5.id_byte(); var7++) {
                  for (int var8 = 0; var8 < var5.id_break(); var8++) {
                     ryw_3 var9 = var6.id_class(var7, var8, 0);
                     var0.id_class(var9.id_protected(), xu_3.id_class.id_continue(), 2);
                     var0.id_byte(2001, var9.id_protected(), xd_3.id_finally(var9.id_class()));
                  }
               }

               rSN var16 = aI_2.i.id_class(var0);
               rfH_2 var17 = var6.id_class(1, 2, 0).id_protected();
               var16.id_class(
                  (double)var17.b_() + 0.5, (double)var17.c_() + 0.55, (double)var17.d_() + 0.5, var6.id_break().id_final() == rpB_2.X ? 0.0F : 90.0F, 0.0F
               );
               Float var15 = var6.id_break().id_final() == rpB_2.X ? 0.0F : 90.0F;
               var16.id_private[23] = var15;
               var16.id_throws();

               for (rhN_2 var10 : var0.id_class(rhN_2.class, var16.rN().id_class(50.0))) {
                  Oo_1.id_final.id_class(var10, var16);
               }

               var0.a_(var16);

               for (int var19 = 0; var19 < var5.id_byte(); var19++) {
                  for (int var20 = 0; var20 < var5.id_break(); var20++) {
                     var0.id_class(var6.id_class(var19, var20, 0).id_protected(), xu_3.id_class);
                  }
               }
            }
         }
      }
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      super.id_class(var1, var2, var3, var4, var5);
      ryO_2 var6 = var1.id_class(var2);
      if (var6 instanceof rys_3) {
         id_class(var1, var2, (rys_3)var6);
      }
   }

   public static boolean id_break(rYB var0, rfH_2 var1, rdn_3 var2) {
      return var2.id_break() == rdy_3.dX && var1.c_() >= 2 && var0.id_abstract() != rRO.PEACEFUL && !var0.id_continue
         ? id_finally().id_class(var0, var1) != null
         : false;
   }

   private static Qh_1 id_finally() {
      if (id_int == null) {
         id_int = Qx_1.id_class()
            .id_class("   ", "###", "~#~")
            .id_class('#', var0 -> var0.id_class().id_class(rls_3.d))
            .id_class('~', ryw_3.id_class(QM.id_class(QP.id_class)))
            .id_break();
      }

      return id_int;
   }

   private static Qh_1 id_implements() {
      if (id_package == null) {
         id_package = Qx_1.id_class()
            .id_class("^^^", "###", "~#~")
            .id_class('#', var0 -> var0.id_class().id_class(rls_3.d))
            .id_class('^', ryw_3.id_class(Qd_1.id_class(xu_3.sh).or(Qd_1.id_class(xu_3.sX))))
            .id_class('~', ryw_3.id_class(QM.id_class(QP.id_class)))
            .id_break();
      }

      return id_package;
   }
}
