package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;

public class ts_3<T extends iB_2 & rha_3, M extends tp_3<T> & to_3> extends Tf_1<T, M> implements rAn_1 {
   private static final Int2ObjectMap<rqO_2> id_class = rqR_2.id_class(new Int2ObjectOpenHashMap(), var0 -> {
      var0.put(1, new rqO_2("stone"));
      var0.put(2, new rqO_2("iron"));
      var0.put(3, new rqO_2("gold"));
      var0.put(4, new rqO_2("emerald"));
      var0.put(5, new rqO_2("diamond"));
   });
   private final Object2ObjectMap<rhi_3, Vb_1> id_break = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<rsT_2, Vb_1> id_byte = new Object2ObjectOpenHashMap();
   private final rAv_1 id_protected;
   private final String id_throws;

   public ts_3(qE_2<T, M> var1, rAv_1 var2, String var3) {
      super(var1);
      this.id_protected = var2;
      this.id_throws = var3;
      var2.id_class(this);
   }

   @Override
   public void id_class(rAL var1) {
      this.id_byte.clear();
      this.id_break.clear();
   }

   public void id_class(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.Pp()) {
         rsp_3 var11 = ((rha_3)var4).su();
         rhi_3 var12 = var11.id_class();
         rsT_2 var13 = var11.id_break();
         Vb_1 var14 = this.id_class(this.id_break, "type", rVL.X, var12);
         Vb_1 var15 = this.id_class(this.id_byte, "profession", rVL.J, var13);
         tp_3 var16 = this.id_byte();
         ((to_3)var16).id_class(var15 == Vb_1.NONE || var15 == Vb_1.PARTIAL && var14 != Vb_1.FULL);
         rqO_2 var17 = this.id_class("type", rVL.X.id_break(var12));
         id_class(var16, var17, var1, var2, var3, var4, 1.0F, 1.0F, 1.0F);
         ((to_3)var16).id_class(true);
         if (var13 != rsT_2.id_class && !var4.n_()) {
            rqO_2 var18 = this.id_class("profession", rVL.J.id_break(var13));
            id_class(var16, var18, var1, var2, var3, var4, 1.0F, 1.0F, 1.0F);
            if (var13 != rsT_2.id_native) {
               rqO_2 var19 = this.id_class("profession_level", (rqO_2)id_class.get(rfU_2.id_class(var11.id_byte(), 1, id_class.size())));
               id_class(var16, var19, var1, var2, var3, var4, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   public <K> Vb_1 id_class(Object2ObjectMap<K, Vb_1> var1, String var2, rVu_1<K> var3, K var4) {
      return (Vb_1)var1.computeIfAbsent(var4, var4x -> {
         try (rAF var5 = this.id_protected.id_class(this.id_class(var2, var3.id_break(var4)))) {
            VG var6 = var5.id_class(VG.id_class);
            return var6 != null ? var6.id_class() : Vb_1.NONE;
         } catch (IOException var10) {
            return Vb_1.NONE;
         }
      });
   }

   private rqO_2 id_class(String var1, rqO_2 var2) {
      return new rqO_2(var2.id_byte(), "textures/entity/" + this.id_throws + "/" + var1 + "/" + var2.id_break() + ".png");
   }
}
