package celestial;

import com.mojang.authlib.GameProfile;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class jG_2 {
   private static final ryr_3[] id_byte = Arrays.stream(rxL_2.values()).sorted(Comparator.comparingInt(rxL_2::id_break)).map(ryr_3::new).toArray(ryr_3[]::new);
   private static final ryr_3 id_protected = new ryr_3((rxL_2)null);
   public static final jG_2 id_class = new jG_2();
   private final rHu_1 id_throws = new rHu_1();
   private final rHu_1 id_case = new ryQ_2();
   private final rHq_1 id_catch = new rHq_1();
   private final rHb_1 id_private = new rHb_1();
   private final rHJ id_implements = new rHJ();
   private final rHA id_finally = new rHA();
   private final wm_3 id_extends = new wm_3();
   public wp_3 id_break = new wp_3();

   public void id_class(rdn_3 var1, IQ var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      if (rrbY_2.id_class()) {
         rrbY_2.id_byte();
      }

      this.id_class(var1, var3, var4, var5, var6);
      if (rrbY_2.id_class()) {
         if (rrbY_2.id_protected()) {
            rrbY_2.id_throws();
            this.id_class(var1, var3, var4, HQ.id_class, var6);
            rrbY_2.id_catch();
         }

         rrbY_2.id_private();
      }
   }

   public void id_class(rdn_3 var1, Ml_1 var2, Hx_1 var3, int var4, int var5) {
      rdb_3 var6 = var1.id_break();
      if (var6 instanceof rxJ_2) {
         xd_3 var7 = ((rxJ_2)var6).id_catch();
         if (var7 instanceof JU) {
            GameProfile var8 = null;
            if (var1.id_final()) {
               rcd_3 var9 = var1.id_package();
               if (var9.id_byte("SkullOwner", 10)) {
                  var8 = rco_3.id_class(var9.id_int("SkullOwner"));
               } else if (var9.id_byte("SkullOwner", 8) && !StringUtils.isBlank(var9.id_native("SkullOwner"))) {
                  GameProfile var10 = new GameProfile((UUID)null, var9.id_native("SkullOwner"));
                  var8 = rys_3.id_break(var10);
                  var9.id_continue("SkullOwner");
                  var9.id_class("SkullOwner", rco_3.id_class(new rcd_3(), var8));
               }
            }

            jx_3.id_class((rpr_3)null, 180.0F, ((JU)var7).id_break(), var8, 0.0F, var2, var3, var4);
         } else {
            Object var13;
            if (var7 instanceof JL) {
               this.id_private.id_class(var1, ((JL)var7).id_break());
               var13 = this.id_private;
            } else if (var7 instanceof xb_3) {
               this.id_implements.id_class(((xb_3)var7).id_break());
               var13 = this.id_implements;
            } else if (var7 == xu_3.hB) {
               var13 = this.id_finally;
            } else if (var7 == xu_3.re) {
               var13 = this.id_throws;
            } else if (var7 == xu_3.SW) {
               var13 = this.id_catch;
            } else if (var7 == xu_3.sZ) {
               var13 = this.id_case;
            } else {
               if (!(var7 instanceof Wp_1)) {
                  return;
               }

               rxL_2 var15 = Wp_1.id_break(var6);
               if (var15 == null) {
                  var13 = id_protected;
               } else {
                  var13 = id_byte[var15.id_break()];
               }
            }

            jz_3.id_break.id_class((ryO_2)var13, var2, var3, var4, var5);
         }
      } else if (var6 == rdy_3.kN) {
         boolean var11 = var1.id_break("BlockEntityTag") != null;
         var2.id_class();
         var2.id_class(1.0F, -1.0F, -1.0F);
         Ig_1 var14 = var11 ? IC.id_catch : IC.id_private;
         Ok_1 var16 = var14.id_byte().id_class(Hz_1.id_byte(var3, this.id_extends.id_class(var14.id_class()), true, var1.id_else()));
         this.id_extends.id_break().id_class(var2, var16, var4, var5, 1.0F, 1.0F, 1.0F, 1.0F);
         if (var11) {
            List var17 = rHb_1.id_class(rkP_2.id_protected(var1), rHb_1.id_class(var1));
            fD_2.id_class(var2, var3, var4, var5, this.id_extends.id_class(), var14, false, var17, var1.id_else());
         } else {
            this.id_extends.id_class().id_class(var2, var16, var4, var5, 1.0F, 1.0F, 1.0F, 1.0F);
         }

         var2.id_break();
      } else if (var6 == rdy_3.kY) {
         var2.id_class();
         var2.id_class(1.0F, -1.0F, -1.0F);
         Ok_1 var12 = Hz_1.id_byte(var3, this.id_break.id_class(wp_3.id_class), false, var1.id_else());
         this.id_break.id_class(var2, var12, var4, var5, 1.0F, 1.0F, 1.0F, 1.0F);
         var2.id_break();
      }
   }
}
