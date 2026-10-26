package celestial;

import com.mojang.authlib.GameProfile;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class jG_2 {
   private static final ryr_3[] byte_ = Arrays.stream(rxL_2.values()).sorted(Comparator.comparingInt(rxL_2::break_)).map(ryr_3::new).toArray(ryr_3[]::new);
   private static final ryr_3 protected_ = new ryr_3((rxL_2)null);
   public static final jG_2 class_ = new jG_2();
   private final rHu_1 throws_ = new rHu_1();
   private final rHu_1 case_ = new ryQ_2();
   private final rHq_1 catch_ = new rHq_1();
   private final rHb_1 private_ = new rHb_1();
   private final rHJ implements_ = new rHJ();
   private final rHA finally_ = new rHA();
   private final wm_3 extends_ = new wm_3();
   public wp_3 break_ = new wp_3();

   public void class_(rdn_3 var1, IQ var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      if (rrbY_2.class_()) {
         rrbY_2.byte_();
      }

      this.class_(var1, var3, var4, var5, var6);
      if (rrbY_2.class_()) {
         if (rrbY_2.protected_()) {
            rrbY_2.throws_();
            this.class_(var1, var3, var4, HQ.class_, var6);
            rrbY_2.catch_();
         }

         rrbY_2.private_();
      }
   }

   public void class_(rdn_3 var1, Ml_1 var2, Hx_1 var3, int var4, int var5) {
      rdb_3 var6 = var1.break_();
      if (var6 instanceof rxJ_2) {
         xd_3 var7 = ((rxJ_2)var6).catch_();
         if (var7 instanceof JU) {
            GameProfile var8 = null;
            if (var1.final_()) {
               rcd_3 var9 = var1.package_();
               if (var9.byte_("SkullOwner", 10)) {
                  var8 = rco_3.class_(var9.int_("SkullOwner"));
               } else if (var9.byte_("SkullOwner", 8) && !StringUtils.isBlank(var9.native_("SkullOwner"))) {
                  GameProfile var10 = new GameProfile((UUID)null, var9.native_("SkullOwner"));
                  var8 = rys_3.break_(var10);
                  var9.continue_("SkullOwner");
                  var9.class_("SkullOwner", rco_3.class_(new rcd_3(), var8));
               }
            }

            jx_3.class_((rpr_3)null, 180.0F, ((JU)var7).break_(), var8, 0.0F, var2, var3, var4);
         } else {
            Object var13;
            if (var7 instanceof JL) {
               this.private_.class_(var1, ((JL)var7).break_());
               var13 = this.private_;
            } else if (var7 instanceof xb_3) {
               this.implements_.class_(((xb_3)var7).break_());
               var13 = this.implements_;
            } else if (var7 == xu_3.hB) {
               var13 = this.finally_;
            } else if (var7 == xu_3.re) {
               var13 = this.throws_;
            } else if (var7 == xu_3.SW) {
               var13 = this.catch_;
            } else if (var7 == xu_3.sZ) {
               var13 = this.case_;
            } else {
               if (!(var7 instanceof Wp_1)) {
                  return;
               }

               rxL_2 var15 = Wp_1.break_(var6);
               if (var15 == null) {
                  var13 = protected_;
               } else {
                  var13 = byte_[var15.break_()];
               }
            }

            jz_3.break_.class_((ryO_2)var13, var2, var3, var4, var5);
         }
      } else if (var6 == rdy_3.kN) {
         boolean var11 = var1.break_("BlockEntityTag") != null;
         var2.class_();
         var2.class_(1.0F, -1.0F, -1.0F);
         Ig_1 var14 = var11 ? IC.catch_ : IC.private_;
         Ok_1 var16 = var14.byte_().class_(Hz_1.byte_(var3, this.extends_.class_(var14.class_()), true, var1.else_()));
         this.extends_.break_().class_(var2, var16, var4, var5, 1.0F, 1.0F, 1.0F, 1.0F);
         if (var11) {
            List var17 = rHb_1.class_(rkP_2.protected_(var1), rHb_1.class_(var1));
            fD_2.class_(var2, var3, var4, var5, this.extends_.class_(), var14, false, var17, var1.else_());
         } else {
            this.extends_.class_().class_(var2, var16, var4, var5, 1.0F, 1.0F, 1.0F, 1.0F);
         }

         var2.break_();
      } else if (var6 == rdy_3.kY) {
         var2.class_();
         var2.class_(1.0F, -1.0F, -1.0F);
         Ok_1 var12 = Hz_1.byte_(var3, this.break_.class_(wp_3.class_), false, var1.else_());
         this.break_.class_(var2, var12, var4, var5, 1.0F, 1.0F, 1.0F, 1.0F);
         var2.break_();
      }
   }
}
