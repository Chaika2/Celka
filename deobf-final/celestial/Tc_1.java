package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class Tc_1<T extends iB_2, M extends tW_2<T>, A extends tW_2<T>> extends Tf_1<T, M> {
   private static final Map<String, rqO_2> class_ = Maps.newHashMap();
   private final A break_;
   private final A byte_;

   public Tc_1(qE_2<T, M> var1, A var2, A var3) {
      super(var1);
      this.break_ = (A)var2;
      this.byte_ = (A)var3;
   }

   private A class_(rXQ var1) {
      return this.break_(var1) ? this.break_ : this.byte_;
   }

   private rqO_2 class_(rxS_2 var1, boolean var2, String var3) {
      String var4 = "textures/models/armor/" + var1.throws_().protected_() + "_layer_" + (var2 ? 2 : 1) + (var3 == null ? "" : "_" + var3) + ".png";
      return class_.computeIfAbsent(var4, rqO_2::new);
   }

   protected A class_(T var1, rdn_3 var2, rXQ var3, A var4) {
      return (A)(rrxr_3.rQ.byte_() ? rrxr_3.rQ.class_(var1, var2, var3, var4) : var4);
   }

   public rqO_2 class_(an_3 var1, rdn_3 var2, rXQ var3, String var4) {
      rxS_2 var5 = (rxS_2)var2.break_();
      String var6 = var5.throws_().protected_();
      String var7 = "minecraft";
      int var8 = var6.indexOf(58);
      if (var8 != -1) {
         var7 = var6.substring(0, var8);
         var6 = var6.substring(var8 + 1);
      }

      String var9 = String.format(
         "%s:textures/models/armor/%s_layer_%d%s.png", var7, var6, this.break_(var3) ? 2 : 1, var4 == null ? "" : String.format("_%s", var4)
      );
      if (rrxr_3.rN.byte_()) {
         var9 = rrxr_3.catch_(rrxr_3.rN, var1, var2, var9, var3, var4);
      }

      rqO_2 var10 = class_.get(var9);
      if (var10 == null) {
         var10 = new rqO_2(var9);
         class_.put(var9, var10);
      }

      if (rrbb_3.rd()) {
         var10 = rrby_3.class_(var2, var3, var4, var10);
      }

      return var10;
   }

   private void class_(Ml_1 var1, Hx_1 var2, T var3, rXQ var4, int var5, A var6) {
      rdn_3 var7 = var3.class_(var4);
      if (var7.break_() instanceof rxS_2 var8 && var8.byte_() == var4) {
         if (rrxr_3.rb.byte_()) {
            var6 = this.class_((T)var3, var7, var4, (A)var6);
         }

         this.byte_().class_(var6);
         this.class_((A)var6, var4);
         boolean var14 = var7.else_();
         if (var8 instanceof rds_3) {
            int var10 = ((rds_3)var8).d_(var7);
            float var11 = (float)(var10 >> 16 & 0xFF) / 255.0F;
            float var12 = (float)(var10 >> 8 & 0xFF) / 255.0F;
            float var13 = (float)(var10 & 0xFF) / 255.0F;
            this.class_(var1, var2, var5, var14, (A)var6, var11, var12, var13, this.class_(var3, var7, var4, null));
            this.class_(var1, var2, var5, var14, (A)var6, 1.0F, 1.0F, 1.0F, this.class_(var3, var7, var4, "overlay"));
         } else {
            this.class_(var1, var2, var5, var14, (A)var6, 1.0F, 1.0F, 1.0F, this.class_(var3, var7, var4, null));
         }
      }
   }

   protected void class_(A var1, rXQ var2) {
      var1.b_(false);
      switch (var2) {
         case HEAD:
            var1.class_.finally_ = true;
            var1.break_.finally_ = true;
            break;
         case CHEST:
            var1.byte_.finally_ = true;
            var1.protected_.finally_ = true;
            var1.throws_.finally_ = true;
            break;
         case LEGS:
            var1.byte_.finally_ = true;
            var1.case_.finally_ = true;
            var1.catch_.finally_ = true;
            break;
         case FEET:
            var1.case_.finally_ = true;
            var1.catch_.finally_ = true;
      }
   }

   private void class_(Ml_1 var1, Hx_1 var2, int var3, rxS_2 var4, boolean var5, A var6, boolean var7, float var8, float var9, float var10, String var11) {
      this.class_(var1, var2, var3, var5, (A)var6, var8, var9, var10, this.class_(var4, var7, var11));
   }

   private void class_(Ml_1 var1, Hx_1 var2, int var3, boolean var4, A var5, float var6, float var7, float var8, rqO_2 var9) {
      Ok_1 var10 = Hz_1.class_(var2, HU.class_(var9), false, var4);
      var5.class_(var1, var10, var3, fZ_2.class_, var6, var7, var8, 1.0F);
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.class_(var1, var2, (T)var4, rXQ.CHEST, var3, this.class_(rXQ.CHEST));
      this.class_(var1, var2, (T)var4, rXQ.LEGS, var3, this.class_(rXQ.LEGS));
      this.class_(var1, var2, (T)var4, rXQ.FEET, var3, this.class_(rXQ.FEET));
      this.class_(var1, var2, (T)var4, rXQ.HEAD, var3, this.class_(rXQ.HEAD));
   }

   private boolean break_(rXQ var1) {
      return var1 == rXQ.LEGS;
   }
}
