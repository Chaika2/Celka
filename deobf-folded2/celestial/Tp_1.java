package celestial;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class Tp_1<T extends iB_2, M extends tp_3<T> & tY_2> extends Tf_1<T, M> {
   private final float id_class;
   private final float id_break;
   private final float id_byte;

   public Tp_1(qE_2<T, M> var1) {
      this(var1, 1.0F, 1.0F, 1.0F);
   }

   public Tp_1(qE_2<T, M> var1, float var2, float var3, float var4) {
      super(var1);
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
   }

   public void id_class(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      rdn_3 var11 = var4.id_class(rXQ.HEAD);
      if (!var11.id_class()) {
         rdb_3 var12 = var11.id_break();
         var1.id_class();
         var1.id_class(this.id_class, this.id_break, this.id_byte);
         boolean var13 = var4 instanceof rsq_3 || var4 instanceof rbE_2;
         if (var4.n_() && !(var4 instanceof rsq_3)) {
            float var14 = 2.0F;
            float var15 = 1.4F;
            var1.id_class(0.0, 0.03125, 0.0);
            var1.id_class(0.7F, 0.7F, 0.7F);
            var1.id_class(0.0, 1.0, 0.0);
         }

         this.id_byte().id_byte().id_class(var1);
         if (var12 instanceof rxJ_2 && ((rxJ_2)var12).id_catch() instanceof JU) {
            float var19 = 1.1875F;
            var1.id_class(1.1875F, -1.1875F, -1.1875F);
            if (var13) {
               var1.id_class(0.0, 0.0625, 0.0);
            }

            GameProfile var20 = null;
            if (var11.id_final()) {
               rcd_3 var16 = var11.id_package();
               if (var16.id_byte("SkullOwner", 10)) {
                  var20 = rco_3.id_class(var16.id_int("SkullOwner"));
               } else if (var16.id_byte("SkullOwner", 8)) {
                  String var17 = var16.id_native("SkullOwner");
                  if (!StringUtils.isBlank(var17)) {
                     var20 = rys_3.id_break(new GameProfile((UUID)null, var17));
                     var16.id_class("SkullOwner", rco_3.id_class(new rcd_3(), var20));
                  }
               }
            }

            var1.id_class(-0.5, 0.0, -0.5);
            jx_3.id_class((rpr_3)null, 180.0F, ((JU)((rxJ_2)var12).id_catch()).id_break(), var20, var5, var1, var2, var3);
         } else if (!(var12 instanceof rxS_2) || ((rxS_2)var12).id_byte() != rXQ.HEAD) {
            float var18 = 0.625F;
            var1.id_class(0.0, -0.25, 0.0);
            var1.id_class(rje_3.id_protected.id_byte(180.0F));
            var1.id_class(0.625F, -0.625F, -0.625F);
            if (var13) {
               var1.id_class(0.0, 0.1875, 0.0);
            }

            QY.id_instanceof().id_import().id_class(var4, var11, IQ.HEAD, false, var1, var2, var3);
         }

         var1.id_break();
      }
   }
}
