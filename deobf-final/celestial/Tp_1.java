package celestial;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class Tp_1<T extends iB_2, M extends tp_3<T> & tY_2> extends Tf_1<T, M> {
   private final float class_;
   private final float break_;
   private final float byte_;

   public Tp_1(qE_2<T, M> var1) {
      this(var1, 1.0F, 1.0F, 1.0F);
   }

   public Tp_1(qE_2<T, M> var1, float var2, float var3, float var4) {
      super(var1);
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      rdn_3 var11 = var4.class_(rXQ.HEAD);
      if (!var11.class_()) {
         rdb_3 var12 = var11.break_();
         var1.class_();
         var1.class_(this.class_, this.break_, this.byte_);
         boolean var13 = var4 instanceof rsq_3 || var4 instanceof rbE_2;
         if (var4.n_() && !(var4 instanceof rsq_3)) {
            float var14 = 2.0F;
            float var15 = 1.4F;
            var1.class_(0.0, 0.03125, 0.0);
            var1.class_(0.7F, 0.7F, 0.7F);
            var1.class_(0.0, 1.0, 0.0);
         }

         this.byte_().byte_().class_(var1);
         if (var12 instanceof rxJ_2 && ((rxJ_2)var12).catch_() instanceof JU) {
            float var19 = 1.1875F;
            var1.class_(1.1875F, -1.1875F, -1.1875F);
            if (var13) {
               var1.class_(0.0, 0.0625, 0.0);
            }

            GameProfile var20 = null;
            if (var11.final_()) {
               rcd_3 var16 = var11.package_();
               if (var16.byte_("SkullOwner", 10)) {
                  var20 = rco_3.class_(var16.int_("SkullOwner"));
               } else if (var16.byte_("SkullOwner", 8)) {
                  String var17 = var16.native_("SkullOwner");
                  if (!StringUtils.isBlank(var17)) {
                     var20 = rys_3.break_(new GameProfile((UUID)null, var17));
                     var16.class_("SkullOwner", rco_3.class_(new rcd_3(), var20));
                  }
               }
            }

            var1.class_(-0.5, 0.0, -0.5);
            jx_3.class_((rpr_3)null, 180.0F, ((JU)((rxJ_2)var12).catch_()).break_(), var20, var5, var1, var2, var3);
         } else if (!(var12 instanceof rxS_2) || ((rxS_2)var12).byte_() != rXQ.HEAD) {
            float var18 = 0.625F;
            var1.class_(0.0, -0.25, 0.0);
            var1.class_(rje_3.protected_.byte_(180.0F));
            var1.class_(0.625F, -0.625F, -0.625F);
            if (var13) {
               var1.class_(0.0, 0.1875, 0.0);
            }

            QY.instanceof_().import_().class_(var4, var11, IQ.HEAD, false, var1, var2, var3);
         }

         var1.break_();
      }
   }
}
