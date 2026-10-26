package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class Tc_1<T extends iB_2, M extends tW_2<T>, A extends tW_2<T>> extends Tf_1<T, M> {
   private static final Map<String, rqO_2> id_class = Maps.newHashMap();
   private final A id_break;
   private final A id_byte;

   public Tc_1(qE_2<T, M> var1, A var2, A var3) {
      super(var1);
      this.id_break = (A)var2;
      this.id_byte = (A)var3;
   }

   private A id_class(rXQ var1) {
      return this.id_break(var1) ? this.id_break : this.id_byte;
   }

   private rqO_2 id_class(rxS_2 var1, boolean var2, String var3) {
      String var4 = "textures/models/armor/" + var1.id_throws().id_protected() + "_layer_" + (var2 ? 2 : 1) + (var3 == null ? "" : "_" + var3) + ".png";
      return id_class.computeIfAbsent(var4, rqO_2::new);
   }

   protected A id_class(T var1, rdn_3 var2, rXQ var3, A var4) {
      return (A)(rrxr_3.rQ.id_byte() ? rrxr_3.rQ.id_class(var1, var2, var3, var4) : var4);
   }

   public rqO_2 id_class(an_3 var1, rdn_3 var2, rXQ var3, String var4) {
      rxS_2 var5 = (rxS_2)var2.id_break();
      String var6 = var5.id_throws().id_protected();
      String var7 = "minecraft";
      int var8 = var6.indexOf(58);
      if (var8 != -1) {
         var7 = var6.substring(0, var8);
         var6 = var6.substring(var8 + 1);
      }

      String var9 = String.format(
         "%s:textures/models/armor/%s_layer_%d%s.png", var7, var6, this.id_break(var3) ? 2 : 1, var4 == null ? "" : String.format("_%s", var4)
      );
      if (rrxr_3.rN.id_byte()) {
         var9 = rrxr_3.id_catch(rrxr_3.rN, var1, var2, var9, var3, var4);
      }

      rqO_2 var10 = id_class.get(var9);
      if (var10 == null) {
         var10 = new rqO_2(var9);
         id_class.put(var9, var10);
      }

      if (rrbb_3.rd()) {
         var10 = rrby_3.id_class(var2, var3, var4, var10);
      }

      return var10;
   }

   private void id_class(Ml_1 var1, Hx_1 var2, T var3, rXQ var4, int var5, A var6) {
      rdn_3 var7 = var3.id_class(var4);
      if (var7.id_break() instanceof rxS_2 var8 && var8.id_byte() == var4) {
         if (rrxr_3.rb.id_byte()) {
            var6 = this.id_class((T)var3, var7, var4, (A)var6);
         }

         this.id_byte().id_class(var6);
         this.id_class((A)var6, var4);
         boolean var14 = var7.id_else();
         if (var8 instanceof rds_3) {
            int var10 = ((rds_3)var8).d_(var7);
            float var11 = (float)(var10 >> 16 & 0xFF) / 255.0F;
            float var12 = (float)(var10 >> 8 & 0xFF) / 255.0F;
            float var13 = (float)(var10 & 0xFF) / 255.0F;
            this.id_class(var1, var2, var5, var14, (A)var6, var11, var12, var13, this.id_class(var3, var7, var4, null));
            this.id_class(var1, var2, var5, var14, (A)var6, 1.0F, 1.0F, 1.0F, this.id_class(var3, var7, var4, "overlay"));
         } else {
            this.id_class(var1, var2, var5, var14, (A)var6, 1.0F, 1.0F, 1.0F, this.id_class(var3, var7, var4, null));
         }
      }
   }

   protected void id_class(A var1, rXQ var2) {
      var1.b_(false);
      switch (var2) {
         case HEAD:
            var1.id_class.id_finally = true;
            var1.id_break.id_finally = true;
            break;
         case CHEST:
            var1.id_byte.id_finally = true;
            var1.id_protected.id_finally = true;
            var1.id_throws.id_finally = true;
            break;
         case LEGS:
            var1.id_byte.id_finally = true;
            var1.id_case.id_finally = true;
            var1.id_catch.id_finally = true;
            break;
         case FEET:
            var1.id_case.id_finally = true;
            var1.id_catch.id_finally = true;
      }
   }

   private void id_class(Ml_1 var1, Hx_1 var2, int var3, rxS_2 var4, boolean var5, A var6, boolean var7, float var8, float var9, float var10, String var11) {
      this.id_class(var1, var2, var3, var5, (A)var6, var8, var9, var10, this.id_class(var4, var7, var11));
   }

   private void id_class(Ml_1 var1, Hx_1 var2, int var3, boolean var4, A var5, float var6, float var7, float var8, rqO_2 var9) {
      Ok_1 var10 = Hz_1.id_class(var2, HU.id_class(var9), false, var4);
      var5.id_class(var1, var10, var3, fZ_2.id_class, var6, var7, var8, 1.0F);
   }

   public void id_class(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.id_class(var1, var2, (T)var4, rXQ.CHEST, var3, this.id_class(rXQ.CHEST));
      this.id_class(var1, var2, (T)var4, rXQ.LEGS, var3, this.id_class(rXQ.LEGS));
      this.id_class(var1, var2, (T)var4, rXQ.FEET, var3, this.id_class(rXQ.FEET));
      this.id_class(var1, var2, (T)var4, rXQ.HEAD, var3, this.id_class(rXQ.HEAD));
   }

   private boolean id_break(rXQ var1) {
      return var1 == rXQ.LEGS;
   }
}
