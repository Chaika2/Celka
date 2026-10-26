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
   public static final rCN id_class = rCT.id_implements;
   public static final rCm_1 id_break = rCT.F;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<xz_3>> id_throws = ThreadLocal.withInitial(() -> {
      rXS var0 = new rXS(200);
      var0.defaultReturnValue((byte)127);
      return var0;
   });
   private final Map<rXE, rjC_2> id_case = Maps.newIdentityHashMap();

   protected abstract int id_byte(rRR var1);

   private static boolean id_byte(rXE var0, rRq_1 var1, rfH_2 var2) {
      return var0.id_class().id_class(var1.id_break(var2.id_final()).id_class());
   }

   private boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, rXs_1 var4) {
      xd_3 var5 = var3.id_break();
      if (var5 instanceof kJ_2) {
         return ((kJ_2)var5).id_class(var1, var2, var3, var4);
      } else if (!(var5 instanceof dN_2) && !var5.id_class(rls_3.X) && var5 != xu_3.PJ && var5 != xu_3.Pf && var5 != xu_3.hM) {
         QP var6 = var3.id_byte();
         return var6 != QP.id_byte && var6 != QP.id_break && var6 != QP.id_case && var6 != QP.id_implements ? !var6.id_byte() : false;
      } else {
         return false;
      }
   }

   protected boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, rpr_3 var4, rfH_2 var5, xc_3 var6, rXE var7, rXs_1 var8) {
      return var7.id_class(var1, var5, var8, var4) && this.id_class(var4, var1, var2, var3, var5, var6) && this.id_class(var1, var5, var6, var8);
   }

   @Override
   public rjU_2 id_class(rRq_1 var1, rfH_2 var2, rXE var3) {
      double var4 = 0.0;
      double var6 = 0.0;
      rfw_3 var8 = new rfw_3();

      for (rpr_3 var10 : rpb_3.HORIZONTAL) {
         var8.id_class(var2, var10);
         rXE var11 = var1.id_break(var8);
         if (this.id_catch(var11)) {
            float var12 = var11.id_protected();
            float var13 = 0.0F;
            if (var12 == 0.0F) {
               if (!var1.id_byte(var8).id_byte().id_byte()) {
                  rfH_2 var14 = var8.id_break();
                  rXE var15 = var1.id_break(var14);
                  if (this.id_catch(var15)) {
                     var12 = var15.id_protected();
                     if (var12 > 0.0F) {
                        var13 = var3.id_protected() - (var12 - 0.8888889F);
                     }
                  }
               }
            } else if (var12 > 0.0F) {
               var13 = var3.id_protected() - var12;
            }

            if (var13 != 0.0F) {
               var4 += (double)((float)var10.id_implements() * var13);
               var6 += (double)((float)var10.id_extends() * var13);
            }
         }
      }

      rjU_2 var16 = new rjU_2(var4, 0.0, var6);
      if (var3.id_byte(id_class)) {
         for (rpr_3 var18 : rpb_3.HORIZONTAL) {
            var8.id_class(var2, var18);
            if (this.id_class(var1, var8, var18) || this.id_class(var1, var8.id_final(), var18)) {
               var16 = var16.id_protected().id_break(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return var16.id_protected();
   }

   protected int id_class(rYB var1, rfH_2 var2, rXE var3, rXE var4) {
      return this.id_class(var1);
   }

   private int id_class(rRR var1, rfH_2 var2) {
      int var3 = 0;

      for (rpr_3 var5 : rpb_3.HORIZONTAL) {
         rfH_2 var6 = var2.id_break(var5);
         rXE var7 = var1.id_break(var6);
         if (this.id_private(var7)) {
            var3++;
         }
      }

      return var3;
   }

   private boolean id_class(rRq_1 var1, rXs_1 var2, rfH_2 var3, xc_3 var4, rpr_3 var5, rfH_2 var6, xc_3 var7, rXE var8) {
      return !this.id_private(var8) && this.id_class(var5, var1, var3, var4, var6, var7) && this.id_class(var1, var6, var7, var2);
   }

   private boolean id_class(rRq_1 var1, rXs_1 var2, rfH_2 var3, xc_3 var4, rfH_2 var5, xc_3 var6) {
      if (!this.id_class(rpr_3.DOWN, var1, var3, var4, var5, var6)) {
         return false;
      } else {
         return var6.id_volatile().id_class().id_class(this) ? true : this.id_class(var1, var5, var6, var2);
      }
   }

   @Override
   public float id_class(rXE var1) {
      return (float)var1.id_throws() / 9.0F;
   }

   @Override
   public float id_class(rXE var1, rRq_1 var2, rfH_2 var3) {
      return id_byte(var1, var2, var3) ? 1.0F : var1.id_protected();
   }

   @Override
   protected void id_class(rCL<rXs_1, rXE> var1) {
      var1.id_class(id_class);
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, rXE var3) {
      if (!var3.id_break()) {
         rXE var4 = this.id_class((rRR)var1, var2, var1.id_byte(var2));
         int var5 = this.id_class(var1, var2, var3, var4);
         if (var4.id_byte()) {
            var3 = var4;
            var1.id_class(var2, xu_3.id_class.id_continue(), 3);
         } else if (!var4.equals(var3)) {
            var3 = var4;
            xc_3 var6 = var4.id_catch();
            var1.id_class(var2, var6, 2);
            var1.id_extends().id_class(var2, var4.id_class(), var5);
            var1.id_break(var2, var6.id_break());
         }
      }

      this.id_class((rRg_1)var1, var2, var3);
   }

   public rXE id_class(int var1, boolean var2) {
      return this.id_protected().id_private().id_class(id_break, var1).id_class(id_class, var2);
   }

   protected void id_class(rRg_1 var1, rfH_2 var2, rXE var3) {
      if (!var3.id_byte()) {
         xc_3 var4 = var1.id_byte(var2);
         rfH_2 var5 = var2.id_break();
         xc_3 var6 = var1.id_byte(var5);
         rXE var7 = this.id_class((rRR)var1, var5, var6);
         if (this.id_class(var1, var2, var4, rpr_3.DOWN, var5, var6, var1.id_break(var5), var7.id_class())) {
            this.id_class(var1, var5, var6, rpr_3.DOWN, var7);
            if (this.id_class(var1, var2) >= 3) {
               this.id_class(var1, var2, var3, var4);
            }
         } else if (var3.id_break() || !this.id_class(var1, var7.id_class(), var2, var4, var5, var6)) {
            this.id_class(var1, var2, var3, var4);
         }
      }
   }

   public rXE id_class(boolean var1) {
      return this.id_throws().id_private().id_class(id_class, var1);
   }

   protected boolean id_class(rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      xc_3 var4 = var1.id_byte(var2);
      rXE var5 = var1.id_break(var2);
      if (var5.id_class().id_class(this)) {
         return false;
      } else if (var3 == rpr_3.UP) {
         return true;
      } else {
         return var4.id_byte() == QP.id_long ? false : var4.id_protected(var1, var2, var3);
      }
   }

   private void id_class(rRg_1 var1, rfH_2 var2, rXE var3, xc_3 var4) {
      int var5 = var3.id_throws() - this.id_byte(var1);
      if (var3.id_byte(id_class)) {
         var5 = 7;
      }

      if (var5 > 0) {
         Map var6 = this.id_break(var1, var2, var4);

         for (Entry var8 : var6.entrySet()) {
            rpr_3 var9 = (rpr_3)var8.getKey();
            rXE var10 = (rXE)var8.getValue();
            rfH_2 var11 = var2.id_break(var9);
            xc_3 var12 = var1.id_byte(var11);
            if (this.id_class(var1, var2, var4, var9, var11, var12, var1.id_break(var11), var10.id_class())) {
               this.id_class(var1, var11, var12, var9, var10);
            }
         }
      }
   }

   private boolean id_class(rpr_3 var1, rRq_1 var2, rfH_2 var3, xc_3 var4, rfH_2 var5, xc_3 var6) {
      Object2ByteLinkedOpenHashMap var7;
      if (!var4.id_break().id_super() && !var6.id_break().id_super()) {
         var7 = id_throws.get();
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

      rjC_2 var12 = var4.id_extends(var2, var3);
      rjC_2 var10 = var6.id_extends(var2, var5);
      boolean var11 = !rjw_3.id_break(var12, var10, var1);
      if (var7 != null) {
         if (var7.size() == 200) {
            var7.removeLastByte();
         }

         var7.putAndMoveToFirst(var8, (byte)(var11 ? 1 : 0));
      }

      return var11;
   }

   protected rXE id_class(rRR var1, rfH_2 var2, xc_3 var3) {
      int var4 = 0;
      int var5 = 0;

      for (rpr_3 var7 : rpb_3.HORIZONTAL) {
         rfH_2 var8 = var2.id_break(var7);
         xc_3 var9 = var1.id_byte(var8);
         rXE var10 = var9.id_volatile();
         if (var10.id_class().id_class(this) && this.id_class(var7, var1, var2, var3, var8, var9)) {
            if (var10.id_break()) {
               var5++;
            }

            var4 = Math.max(var4, var10.id_throws());
         }
      }

      if (this.id_case() && var5 >= 2) {
         xc_3 var11 = var1.id_byte(var2.id_break());
         rXE var13 = var11.id_volatile();
         if (var11.id_byte().id_break() || this.id_private(var13)) {
            return this.id_class(false);
         }
      }

      rfH_2 var12 = var2.id_final();
      xc_3 var14 = var1.id_byte(var12);
      rXE var15 = var14.id_volatile();
      if (!var15.id_byte() && var15.id_class().id_class(this) && this.id_class(rpr_3.UP, var1, var2, var3, var12, var14)) {
         return this.id_class(8, true);
      } else {
         int var16 = var4 - this.id_byte(var1);
         return var16 <= 0 ? rXG.id_class.id_private() : this.id_class(var16, false);
      }
   }

   private static short id_class(rfH_2 var0, rfH_2 var1) {
      int var2 = var1.b_() - var0.b_();
      int var3 = var1.d_() - var0.d_();
      return (short)((var2 + 128 & 0xFF) << 8 | var3 + 128 & 0xFF);
   }

   protected int id_class(rRR var1, rfH_2 var2, int var3, rpr_3 var4, xc_3 var5, rfH_2 var6, Short2ObjectMap<Pair<xc_3, rXE>> var7, Short2BooleanMap var8) {
      int var9 = 1000;

      for (rpr_3 var11 : rpb_3.HORIZONTAL) {
         if (var11 != var4) {
            rfH_2 var12 = var2.id_break(var11);
            short var13 = id_class(var6, var12);
            Pair var14 = (Pair)var7.computeIfAbsent(var13, var2x -> {
               xc_3 var3x = var1.id_byte(var12);
               return Pair.of(var3x, var3x.id_volatile());
            });
            xc_3 var15 = (xc_3)var14.getFirst();
            rXE var16 = (rXE)var14.getSecond();
            if (this.id_class(var1, this.id_protected(), var2, var5, var11, var12, var15, var16)) {
               boolean var17 = var8.computeIfAbsent(var13, var4x -> {
                  rfH_2 var5x = var12.id_break();
                  xc_3 var6x = var1.id_byte(var5x);
                  return this.id_class(var1, this.id_protected(), var12, var15, var5x, var6x);
               });
               if (var17) {
                  return var3;
               }

               if (var3 < this.id_break(var1)) {
                  int var18 = this.id_class(var1, var12, var3 + 1, var11.id_case(), var15, var6, var7, var8);
                  if (var18 < var9) {
                     var9 = var18;
                  }
               }
            }
         }
      }

      return var9;
   }

   protected abstract void id_class(rRg_1 var1, rfH_2 var2, xc_3 var3);

   protected void id_class(rRg_1 var1, rfH_2 var2, xc_3 var3, rpr_3 var4, rXE var5) {
      if (var3.id_break() instanceof kJ_2) {
         ((kJ_2)var3.id_break()).id_class(var1, var2, var3, var5);
      } else {
         if (!var3.id_catch()) {
            this.id_class(var1, var2, var3);
         }

         var1.id_class(var2, var5.id_catch(), 3);
      }
   }

   @Override
   public rjC_2 id_break(rXE var1, rRq_1 var2, rfH_2 var3) {
      return var1.id_throws() == 9 && id_byte(var1, var2, var3)
         ? rjw_3.id_break()
         : this.id_case.computeIfAbsent(var1, var2x -> rjw_3.id_class(0.0, 0.0, 0.0, 1.0, (double)var2x.id_class(var2, var3), 1.0));
   }

   protected abstract int id_break(rRR var1);

   protected Map<rpr_3, rXE> id_break(rRR var1, rfH_2 var2, xc_3 var3) {
      int var4 = 1000;
      EnumMap var5 = Maps.newEnumMap(rpr_3.class);
      Short2ObjectOpenHashMap var6 = new Short2ObjectOpenHashMap();
      Short2BooleanOpenHashMap var7 = new Short2BooleanOpenHashMap();

      for (rpr_3 var9 : rpb_3.HORIZONTAL) {
         rfH_2 var10 = var2.id_break(var9);
         short var11 = id_class(var2, var10);
         Pair var12 = (Pair)var6.computeIfAbsent(var11, var2x -> {
            xc_3 var3x = var1.id_byte(var10);
            return Pair.of(var3x, var3x.id_volatile());
         });
         xc_3 var13 = (xc_3)var12.getFirst();
         rXE var14 = (rXE)var12.getSecond();
         rXE var15 = this.id_class(var1, var10, var13);
         if (this.id_class(var1, var15.id_class(), var2, var3, var9, var10, var13, var14)) {
            rfH_2 var16 = var10.id_break();
            boolean var17 = var7.computeIfAbsent(var11, var5x -> {
               xc_3 var6x = var1.id_byte(var16);
               return this.id_class(var1, this.id_protected(), var10, var13, var16, var6x);
            });
            int var18;
            if (var17) {
               var18 = 0;
            } else {
               var18 = this.id_class(var1, var10, 1, var9.id_case(), var13, var2, var6, var7);
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

   public abstract rXs_1 id_throws();

   protected static int id_throws(rXE var0) {
      return var0.id_break() ? 0 : 8 - Math.min(var0.id_throws(), 8) + (var0.id_byte(id_class) ? 8 : 0);
   }

   private boolean id_catch(rXE var1) {
      return var1.id_byte() || var1.id_class().id_class(this);
   }

   protected abstract boolean id_case();

   public abstract rXs_1 id_protected();

   private boolean id_private(rXE var1) {
      return var1.id_class().id_class(this) && var1.id_break();
   }
}
