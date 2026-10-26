package celestial;

import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.Map;

public class jx_3 extends jW_2<rys_3> {
   private static final Map<WI, tt_3> class_ = rqR_2.class_(Maps.newHashMap(), var0 -> {
      tt_3 var1 = new tt_3(0, 0, 64, 32);
      tg_3 var2 = new tg_3();
      jQ_2 var3 = new jQ_2(0.0F);
      var0.put(Wf_1.SKELETON, var1);
      var0.put(Wf_1.WITHER_SKELETON, var1);
      var0.put(Wf_1.PLAYER, var2);
      var0.put(Wf_1.ZOMBIE, var2);
      var0.put(Wf_1.CREEPER, var1);
      var0.put(Wf_1.DRAGON, var3);
   });
   private static final Map<WI, rqO_2> break_ = rqR_2.class_(Maps.newHashMap(), var0 -> {
      var0.put(Wf_1.SKELETON, new rqO_2("textures/entity/skeleton/skeleton.png"));
      var0.put(Wf_1.WITHER_SKELETON, new rqO_2("textures/entity/skeleton/wither_skeleton.png"));
      var0.put(Wf_1.ZOMBIE, new rqO_2("textures/entity/zombie/zombie.png"));
      var0.put(Wf_1.CREEPER, new rqO_2("textures/entity/creeper/creeper.png"));
      var0.put(Wf_1.DRAGON, new rqO_2("textures/entity/enderdragon/dragon.png"));
      var0.put(Wf_1.PLAYER, jH_2.class_());
   });

   public jx_3(jz_3 var1) {
      super(var1);
   }

   public void class_(rys_3 var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      float var7 = var1.class_(var2);
      xc_3 var8 = var1.abstract_();
      boolean var9 = var8.break_() instanceof zV_2;
      rpr_3 var10 = var9 ? var8.byte_(zV_2.volatile_) : null;
      float var11 = 22.5F * (float)(var9 ? (2 + var10.protected_()) * 4 : var8.byte_(Ww_1.volatile_));
      class_(var10, var11, ((JU)var8.break_()).break_(), var1.catch_(), var7, var3, var4, var5);
   }

   private static HU class_(WI var0, GameProfile var1) {
      rqO_2 var2 = break_.get(var0);
      if (var0 == Wf_1.PLAYER && var1 != null) {
         QY var3 = QY.instanceof_();
         Map var4 = var3.throws_().class_(var1);
         return var4.containsKey(Type.SKIN)
            ? HU.private_(var3.throws_().class_((MinecraftProfileTexture)var4.get(Type.SKIN), Type.SKIN))
            : HU.protected_(jH_2.class_(rhd_3.class_(var1)));
      } else {
         return HU.throws_(var2);
      }
   }

   public static void class_(rpr_3 var0, float var1, WI var2, GameProfile var3, float var4, Ml_1 var5, Hx_1 var6, int var7) {
      tt_3 var8 = class_.get(var2);
      var5.class_();
      if (var0 == null) {
         var5.class_(0.5, 0.0, 0.5);
      } else {
         float var9 = 0.25F;
         var5.class_((double)(0.5F - (float)var0.implements_() * 0.25F), 0.25, (double)(0.5F - (float)var0.extends_() * 0.25F));
      }

      var5.class_(-1.0F, -1.0F, 1.0F);
      Ok_1 var10 = var6.getBuffer(class_(var2, var3));
      var8.class_(var4, var1, 0.0F);
      var8.class_(var5, var10, var7, fZ_2.class_, 1.0F, 1.0F, 1.0F, 1.0F);
      var5.break_();
   }
}
