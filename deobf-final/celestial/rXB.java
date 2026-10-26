package celestial;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class rXB extends rXs_1 {
   public static final rCN class_ = rCT.implements_;
   public static final rCm_1 break_ = rCT.F;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<xz_3>> throws_ = ThreadLocal.withInitial(() -> {
      rXS var0 = new rXS(200);
      var0.defaultReturnValue((byte)127);
      return var0;
   });
   private final Map<rXE, rjC_2> case_ = Maps.newIdentityHashMap();

   protected abstract int byte_(rRR var1);

   private static boolean byte_(rXE var0, rRq_1 var1, rfH_2 var2) {
      return var0.class_().class_(var1.break_(var2.final_()).class_());
   }

   private boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, rXs_1 var4) {
      xd_3 var5 = var3.break_();
      if (var5 instanceof kJ_2) {
         return ((kJ_2)var5).class_(var1, var2, var3, var4);
      } else if (!(var5 instanceof dN_2) && !var5.class_(rls_3.X) && var5 != xu_3.PJ && var5 != xu_3.Pf && var5 != xu_3.hM) {
         QP var6 = var3.byte_();
         return var6 != QP.byte_ && var6 != QP.break_ && var6 != QP.case_ && var6 != QP.implements_ ? !var6.byte_() : false;
      } else {
         return false;
      }
   }

   protected boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, rpr_3 var4, rfH_2 var5, xc_3 var6, rXE var7, rXs_1 var8) {
      return var7.class_(var1, var5, var8, var4) && this.class_(var4, var1, var2, var3, var5, var6) && this.class_(var1, var5, var6, var8);
   }

   @Override
   public rjU_2 class_(rRq_1 var1, rfH_2 var2, rXE var3) {
      double var4 = 0.0;
      double var6 = 0.0;
      rfw_3 var8 = new rfw_3();

      for (rpr_3 var10 : rpb_3.HORIZONTAL) {
         var8.class_(var2, var10);
         rXE var11 = var1.break_(var8);
         if (this.catch_(var11)) {
            float var12 = var11.protected_();
            float var13 = 0.0F;
            if (var12 == 0.0F) {
               if (!var1.byte_(var8).byte_().byte_()) {
                  rfH_2 var14 = var8.break_();
                  rXE var15 = var1.break_(var14);
                  if (this.catch_(var15)) {
                     var12 = var15.protected_();
                     if (var12 > 0.0F) {
                        var13 = var3.protected_() - (var12 - 0.8888889F);
                     }
                  }
               }
            } else if (var12 > 0.0F) {
               var13 = var3.protected_() - var12;
            }

            if (var13 != 0.0F) {
               var4 += (double)((float)var10.implements_() * var13);
               var6 += (double)((float)var10.extends_() * var13);
            }
         }
      }

      rjU_2 var16 = new rjU_2(var4, 0.0, var6);
      if (var3.byte_(class_)) {
         for (rpr_3 var18 : rpb_3.HORIZONTAL) {
            var8.class_(var2, var18);
            if (this.class_(var1, var8, var18) || this.class_(var1, var8.final_(), var18)) {
               var16 = var16.protected_().break_(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return var16.protected_();
   }

   protected int class_(rYB var1, rfH_2 var2, rXE var3, rXE var4) {
      return this.class_(var1);
   }

   private int class_(rRR var1, rfH_2 var2) {
      int var3 = 0;

      for (rpr_3 var5 : rpb_3.HORIZONTAL) {
         rfH_2 var6 = var2.break_(var5);
         rXE var7 = var1.break_(var6);
         if (this.private_(var7)) {
            var3++;
         }
      }

      return var3;
   }

   private boolean class_(rRq_1 var1, rXs_1 var2, rfH_2 var3, xc_3 var4, rpr_3 var5, rfH_2 var6, xc_3 var7, rXE var8) {
      return !this.private_(var8) && this.class_(var5, var1, var3, var4, var6, var7) && this.class_(var1, var6, var7, var2);
   }

   private boolean class_(rRq_1 var1, rXs_1 var2, rfH_2 var3, xc_3 var4, rfH_2 var5, xc_3 var6) {
      if (!this.class_(rpr_3.DOWN, var1, var3, var4, var5, var6)) {
         return false;
      } else {
         return var6.volatile_().class_().class_(this) ? true : this.class_(var1, var5, var6, var2);
      }
   }

   @Override
   public float class_(rXE var1) {
      return (float)var1.throws_() / 9.0F;
   }

   @Override
   public float class_(rXE var1, rRq_1 var2, rfH_2 var3) {
      return byte_(var1, var2, var3) ? 1.0F : var1.protected_();
   }

   @Override
   protected void class_(rCL<rXs_1, rXE> var1) {
      var1.class_(class_);
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, rXE var3) {
      if (!var3.break_()) {
         rXE var4 = this.class_((rRR)var1, var2, var1.byte_(var2));
         int var5 = this.class_(var1, var2, var3, var4);
         if (var4.byte_()) {
            var3 = var4;
            var1.class_(var2, xu_3.class_.continue_(), 3);
         } else if (!var4.equals(var3)) {
            var3 = var4;
            xc_3 var6 = var4.catch_();
            var1.class_(var2, var6, 2);
            var1.extends_().class_(var2, var4.class_(), var5);
            var1.break_(var2, var6.break_());
         }
      }

      this.class_((rRg_1)var1, var2, var3);
   }

   public rXE class_(int var1, boolean var2) {
      return this.protected_().private_().class_(break_, var1).class_(class_, var2);
   }

   protected void class_(rRg_1 var1, rfH_2 var2, rXE var3) {
      if (!var3.byte_()) {
         xc_3 var4 = var1.byte_(var2);
         rfH_2 var5 = var2.break_();
         xc_3 var6 = var1.byte_(var5);
         rXE var7 = this.class_((rRR)var1, var5, var6);
         if (this.class_(var1, var2, var4, rpr_3.DOWN, var5, var6, var1.break_(var5), var7.class_())) {
            this.class_(var1, var5, var6, rpr_3.DOWN, var7);
            if (this.class_(var1, var2) >= 3) {
               this.class_(var1, var2, var3, var4);
            }
         } else if (var3.break_() || !this.class_(var1, var7.class_(), var2, var4, var5, var6)) {
            this.class_(var1, var2, var3, var4);
         }
      }
   }

   public rXE class_(boolean var1) {
      return this.throws_().private_().class_(class_, var1);
   }

   protected boolean class_(rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      xc_3 var4 = var1.byte_(var2);
      rXE var5 = var1.break_(var2);
      if (var5.class_().class_(this)) {
         return false;
      } else if (var3 == rpr_3.UP) {
         return true;
      } else {
         return var4.byte_() == QP.long_ ? false : var4.protected_(var1, var2, var3);
      }
   }

   private void class_(rRg_1 var1, rfH_2 var2, rXE var3, xc_3 var4) {
      int var5 = var3.throws_() - this.byte_(var1);
      if (var3.byte_(class_)) {
         var5 = 7;
      }

      if (var5 > 0) {
         Map var6 = this.break_(var1, var2, var4);

         for (Entry var8 : var6.entrySet()) {
            rpr_3 var9 = (rpr_3)var8.getKey();
            rXE var10 = (rXE)var8.getValue();
            rfH_2 var11 = var2.break_(var9);
            xc_3 var12 = var1.byte_(var11);
            if (this.class_(var1, var2, var4, var9, var11, var12, var1.break_(var11), var10.class_())) {
               this.class_(var1, var11, var12, var9, var10);
            }
         }
      }
   }

   private boolean class_(rpr_3 var1, rRq_1 var2, rfH_2 var3, xc_3 var4, rfH_2 var5, xc_3 var6) {
      Object2ByteLinkedOpenHashMap var7;
      if (!var4.break_().super_() && !var6.break_().super_()) {
         var7 = throws_.get();
      } else {
         var7 = null;
      }

      xz_3 var8;
      if (var7 != null) {
         var8 = new xz_3(var4, var6, var1);
         byte var9 = var7.getAndMoveToFirst(var8);
         if (var9 != 127) {
            return var9 != 0;
         }
      } else {
         var8 = null;
      }

      rjC_2 var12 = var4.extends_(var2, var3);
      rjC_2 var10 = var6.extends_(var2, var5);
      boolean var11 = !rjw_3.break_(var12, var10, var1);
      if (var7 != null) {
         if (var7.size() == 200) {
            var7.removeLastByte();
         }

         var7.putAndMoveToFirst(var8, (byte)(var11 ? 1 : 0));
      }

      return var11;
   }

   protected rXE class_(rRR var1, rfH_2 var2, xc_3 var3) {
      int var4 = 0;
      int var5 = 0;

      for (rpr_3 var7 : rpb_3.HORIZONTAL) {
         rfH_2 var8 = var2.break_(var7);
         xc_3 var9 = var1.byte_(var8);
         rXE var10 = var9.volatile_();
         if (var10.class_().class_(this) && this.class_(var7, var1, var2, var3, var8, var9)) {
            if (var10.break_()) {
               var5++;
            }

            var4 = Math.max(var4, var10.throws_());
         }
      }

      if (this.case_() && var5 >= 2) {
         xc_3 var11 = var1.byte_(var2.break_());
         rXE var13 = var11.volatile_();
         if (var11.byte_().break_() || this.private_(var13)) {
            return this.class_(false);
         }
      }

      rfH_2 var12 = var2.final_();
      xc_3 var14 = var1.byte_(var12);
      rXE var15 = var14.volatile_();
      if (!var15.byte_() && var15.class_().class_(this) && this.class_(rpr_3.UP, var1, var2, var3, var12, var14)) {
         return this.class_(8, true);
      } else {
         int var16 = var4 - this.byte_(var1);
         return var16 <= 0 ? rXG.class_.private_() : this.class_(var16, false);
      }
   }

   private static short class_(rfH_2 var0, rfH_2 var1) {
      int var2 = var1.b_() - var0.b_();
      int var3 = var1.d_() - var0.d_();
      return (short)((var2 + 128 & 0xFF) << 8 | var3 + 128 & 0xFF);
   }

   protected int class_(rRR var1, rfH_2 var2, int var3, rpr_3 var4, xc_3 var5, rfH_2 var6, Short2ObjectMap<Pair<xc_3, rXE>> var7, Short2BooleanMap var8) {
      int var9 = 1000;

      for (rpr_3 var11 : rpb_3.HORIZONTAL) {
         if (var11 != var4) {
            rfH_2 var12 = var2.break_(var11);
            short var13 = class_(var6, var12);
            Pair var14 = (Pair)var7.computeIfAbsent(var13, var2x -> {
               xc_3 var3x = var1.byte_(var12);
               return Pair.of(var3x, var3x.volatile_());
            });
            xc_3 var15 = (xc_3)var14.getFirst();
            rXE var16 = (rXE)var14.getSecond();
            if (this.class_(var1, this.protected_(), var2, var5, var11, var12, var15, var16)) {
               boolean var17 = var8.computeIfAbsent(var13, var4x -> {
                  rfH_2 var5x = var12.break_();
                  xc_3 var6x = var1.byte_(var5x);
                  return this.class_(var1, this.protected_(), var12, var15, var5x, var6x);
               });
               if (var17) {
                  return var3;
               }

               if (var3 < this.break_(var1)) {
                  int var18 = this.class_(var1, var12, var3 + 1, var11.case_(), var15, var6, var7, var8);
                  if (var18 < var9) {
                     var9 = var18;
                  }
               }
            }
         }
      }

      return var9;
   }

   protected abstract void class_(rRg_1 var1, rfH_2 var2, xc_3 var3);

   protected void class_(rRg_1 var1, rfH_2 var2, xc_3 var3, rpr_3 var4, rXE var5) {
      if (var3.break_() instanceof kJ_2) {
         ((kJ_2)var3.break_()).class_(var1, var2, var3, var5);
      } else {
         if (!var3.catch_()) {
            this.class_(var1, var2, var3);
         }

         var1.class_(var2, var5.catch_(), 3);
      }
   }

   @Override
   public rjC_2 break_(rXE var1, rRq_1 var2, rfH_2 var3) {
      return var1.throws_() == 9 && byte_(var1, var2, var3)
         ? rjw_3.break_()
         : this.case_.computeIfAbsent(var1, var2x -> rjw_3.class_(0.0, 0.0, 0.0, 1.0, (double)var2x.class_(var2, var3), 1.0));
   }

   protected abstract int break_(rRR var1);

   protected Map<rpr_3, rXE> break_(rRR var1, rfH_2 var2, xc_3 var3) {
      int var4 = 1000;
      EnumMap var5 = Maps.newEnumMap(rpr_3.class);
      Short2ObjectOpenHashMap var6 = new Short2ObjectOpenHashMap();
      Short2BooleanOpenHashMap var7 = new Short2BooleanOpenHashMap();

      for (rpr_3 var9 : rpb_3.HORIZONTAL) {
         rfH_2 var10 = var2.break_(var9);
         short var11 = class_(var2, var10);
         Pair var12 = (Pair)var6.computeIfAbsent(var11, var2x -> {
            xc_3 var3x = var1.byte_(var10);
            return Pair.of(var3x, var3x.volatile_());
         });
         xc_3 var13 = (xc_3)var12.getFirst();
         rXE var14 = (rXE)var12.getSecond();
         rXE var15 = this.class_(var1, var10, var13);
         if (this.class_(var1, var15.class_(), var2, var3, var9, var10, var13, var14)) {
            rfH_2 var16 = var10.break_();
            boolean var17 = var7.computeIfAbsent(var11, var5x -> {
               xc_3 var6x = var1.byte_(var16);
               return this.class_(var1, this.protected_(), var10, var13, var16, var6x);
            });
            int var18;
            if (var17) {
               var18 = 0;
            } else {
               var18 = this.class_(var1, var10, 1, var9.case_(), var13, var2, var6, var7);
            }

            if (var18 < var4) {
               var5.clear();
            }

            if (var18 <= var4) {
               var5.put(var9, var15);
               var4 = var18;
            }
         }
      }

      return var5;
   }

   public abstract rXs_1 throws_();

   protected static int throws_(rXE var0) {
      return var0.break_() ? 0 : 8 - Math.min(var0.throws_(), 8) + (var0.byte_(class_) ? 8 : 0);
   }

   private boolean catch_(rXE var1) {
      return var1.byte_() || var1.class_().class_(this);
   }

   protected abstract boolean case_();

   public abstract rXs_1 protected_();

   private boolean private_(rXE var1) {
      return var1.class_().class_(this) && var1.break_();
   }
}
