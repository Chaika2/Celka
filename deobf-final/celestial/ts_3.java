package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;

public class ts_3<T extends iB_2 & rha_3, M extends tp_3<T> & to_3> extends Tf_1<T, M> implements rAn_1 {
   private static final Int2ObjectMap<rqO_2> class_ = rqR_2.class_(new Int2ObjectOpenHashMap(), var0 -> {
      var0.put(1, new rqO_2("stone"));
      var0.put(2, new rqO_2("iron"));
      var0.put(3, new rqO_2("gold"));
      var0.put(4, new rqO_2("emerald"));
      var0.put(5, new rqO_2("diamond"));
   });
   private final Object2ObjectMap<rhi_3, Vb_1> break_ = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<rsT_2, Vb_1> byte_ = new Object2ObjectOpenHashMap();
   private final rAv_1 protected_;
   private final String throws_;

   public ts_3(qE_2<T, M> var1, rAv_1 var2, String var3) {
      super(var1);
      this.protected_ = var2;
      this.throws_ = var3;
      var2.class_(this);
   }

   @Override
   public void class_(rAL var1) {
      this.byte_.clear();
      this.break_.clear();
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.Pp()) {
         rsp_3 var11 = ((rha_3)var4).su();
         rhi_3 var12 = var11.class_();
         rsT_2 var13 = var11.break_();
         Vb_1 var14 = this.class_(this.break_, "type", rVL.X, var12);
         Vb_1 var15 = this.class_(this.byte_, "profession", rVL.J, var13);
         tp_3 var16 = this.byte_();
         ((to_3)var16).class_(var15 == Vb_1.NONE || var15 == Vb_1.PARTIAL && var14 != Vb_1.FULL);
         rqO_2 var17 = this.class_("type", rVL.X.break_(var12));
         class_(var16, var17, var1, var2, var3, var4, 1.0F, 1.0F, 1.0F);
         ((to_3)var16).class_(true);
         if (var13 != rsT_2.class_ && !var4.n_()) {
            rqO_2 var18 = this.class_("profession", rVL.J.break_(var13));
            class_(var16, var18, var1, var2, var3, var4, 1.0F, 1.0F, 1.0F);
            if (var13 != rsT_2.native_) {
               rqO_2 var19 = this.class_("profession_level", (rqO_2)class_.get(rfU_2.class_(var11.byte_(), 1, class_.size())));
               class_(var16, var19, var1, var2, var3, var4, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   public <K> Vb_1 class_(Object2ObjectMap<K, Vb_1> var1, String var2, rVu_1<K> var3, K var4) {
      return (Vb_1)var1.computeIfAbsent(var4, var4x -> {
         try (rAF var5 = this.protected_.class_(this.class_(var2, var3.break_(var4)))) {
            VG var6 = var5.class_(VG.class_);
            return var6 != null ? var6.class_() : Vb_1.NONE;
         } catch (IOException var10) {
            return Vb_1.NONE;
         }
      });
   }

   private rqO_2 class_(String var1, rqO_2 var2) {
      return new rqO_2(var2.byte_(), "textures/entity/" + this.throws_ + "/" + var1 + "/" + var2.break_() + ".png");
   }
}
