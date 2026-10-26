package celestial;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Zl_1 extends vm_3 {
   private static final Logger id_class = LogManager.getLogger();
   static final List<ZH> id_throws = Lists.newArrayList();
   final mg_3 id_case;
   private rgP_2 id_catch;
   private rgP_2 id_private;
   private Zy_1 id_implements;
   private LF id_finally;
   Lu_1 id_else;
   rKQ id_synchronized;

   @Override
   public void id_byte(boolean var1) {
      this.id_finally.id_int = var1 || this.id_else.id_private().length() > 1;
   }

   public Zl_1(mg_3 var1) {
      super(new rgn_3("createWorld.customize.presets.title"));
      this.id_case = var1;
   }

   static {
      id_class(
         new rgn_3("createWorld.customize.preset.classic_flat"),
         xu_3.id_implements,
         rYl_1.id_break,
         Arrays.asList(rrrZ.id_new),
         false,
         false,
         false,
         new rKN(1, xu_3.id_implements),
         new rKN(2, xu_3.id_finally),
         new rKN(1, xu_3.id_while)
      );
      id_class(
         new rgn_3("createWorld.customize.preset.tunnelers_dream"),
         xu_3.id_break,
         rYl_1.id_protected,
         Arrays.asList(rrrZ.id_byte),
         true,
         true,
         false,
         new rKN(1, xu_3.id_implements),
         new rKN(5, xu_3.id_finally),
         new rKN(230, xu_3.id_break),
         new rKN(1, xu_3.id_while)
      );
      id_class(
         new rgn_3("createWorld.customize.preset.water_world"),
         rdy_3.hR,
         rYl_1.id_goto,
         Arrays.asList(rrrZ.id_volatile, rrrZ.id_implements, rrrZ.id_native),
         false,
         false,
         false,
         new rKN(90, xu_3.id_try),
         new rKN(5, xu_3.id_throw),
         new rKN(5, xu_3.id_finally),
         new rKN(5, xu_3.id_break),
         new rKN(1, xu_3.id_while)
      );
      id_class(
         new rgn_3("createWorld.customize.preset.overworld"),
         xu_3.e,
         rYl_1.id_break,
         Arrays.asList(rrrZ.id_new, rrrZ.id_byte, rrrZ.id_break, rrrZ.id_private),
         true,
         true,
         true,
         new rKN(1, xu_3.id_implements),
         new rKN(3, xu_3.id_finally),
         new rKN(59, xu_3.id_break),
         new rKN(1, xu_3.id_while)
      );
      id_class(
         new rgn_3("createWorld.customize.preset.snowy_kingdom"),
         xu_3.Pq,
         rYl_1.id_volatile,
         Arrays.asList(rrrZ.id_new, rrrZ.id_catch),
         false,
         false,
         false,
         new rKN(1, xu_3.Pq),
         new rKN(1, xu_3.id_implements),
         new rKN(3, xu_3.id_finally),
         new rKN(59, xu_3.id_break),
         new rKN(1, xu_3.id_while)
      );
      id_class(
         new rgn_3("createWorld.customize.preset.bottomless_pit"),
         rdy_3.Oi,
         rYl_1.id_break,
         Arrays.asList(rrrZ.id_new),
         false,
         false,
         false,
         new rKN(1, xu_3.id_implements),
         new rKN(3, xu_3.id_finally),
         new rKN(2, xu_3.id_volatile)
      );
      id_class(
         new rgn_3("createWorld.customize.preset.desert"),
         xu_3.id_throw,
         rYl_1.id_byte,
         Arrays.asList(rrrZ.id_new, rrrZ.id_case, rrrZ.id_byte),
         true,
         true,
         false,
         new rKN(8, xu_3.id_throw),
         new rKN(52, xu_3.F),
         new rKN(3, xu_3.id_break),
         new rKN(1, xu_3.id_while)
      );
      id_class(
         new rgn_3("createWorld.customize.preset.redstone_ready"),
         rdy_3.hD,
         rYl_1.id_byte,
         Collections.emptyList(),
         false,
         false,
         false,
         new rKN(52, xu_3.F),
         new rKN(3, xu_3.id_break),
         new rKN(1, xu_3.id_while)
      );
      id_class(new rgn_3("createWorld.customize.preset.the_void"), xu_3.Ec, rYl_1.E, Collections.emptyList(), false, true, false, new rKN(1, xu_3.id_class));
   }

   private static void id_class(rgP_2 var0, rpL_2 var1, rqM_2<rYG> var2, List<rrrZ<?>> var3, boolean var4, boolean var5, boolean var6, rKN... var7) {
      id_throws.add(new ZH(var1.id_case(), var0, var6x -> {
         HashMap var7x = Maps.newHashMap();

         for (rrrZ var9 : var3) {
            var7x.put(var9, (rrSI)rrSq_1.id_break.get(var9));
         }

         rrSq_1 var11 = new rrSq_1(var4 ? Optional.of(rrSq_1.id_byte) : Optional.empty(), var7x);
         rKQ var12 = new rKQ(var11, var6x);
         if (var5) {
            var12.id_class();
         }

         if (var6) {
            var12.id_break();
         }

         for (int var10 = var7.length - 1; var10 >= 0; var10--) {
            var12.id_case().add(var7[var10]);
         }

         var12.id_class(() -> (rYG)var6x.id_byte(var2));
         var12.id_private();
         return var12.id_class(var11);
      }));
   }

   private static rKN id_class(String var0, int var1) {
      String[] var2 = var0.split("\\*", 2);
      int var3;
      if (var2.length == 2) {
         try {
            var3 = Math.max(Integer.parseInt(var2[0]), 0);
         } catch (NumberFormatException var10) {
            id_class.error("Error while parsing flat world string => {}", var10.getMessage());
            return null;
         }
      } else {
         var3 = 1;
      }

      int var4 = Math.min(var1 + var3, 256);
      int var5 = var4 - var1;
      String var6 = var2[var2.length - 1];

      xd_3 var7;
      try {
         var7 = rVL.id_strictfp.id_break(new rqO_2(var6)).orElse((xd_3)null);
      } catch (Exception var9) {
         id_class.error("Error while parsing flat world string => {}", var9.getMessage());
         return null;
      }

      if (var7 == null) {
         id_class.error("Error while parsing flat world string => Unknown block, {}", var6);
         return null;
      } else {
         rKN var8 = new rKN(var5, var7);
         var8.id_class(var1);
         return var8;
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      this.id_implements.id_class(var1, var2, var3, var4);
      RenderSystem.pushMatrix();
      RenderSystem.translatef(0.0F, 0.0F, 400.0F);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 8, 16777215);
      id_break(var1, this.id_super, this.id_catch, 50, 30, 10526880);
      id_break(var1, this.id_super, this.id_private, 50, 70, 10526880);
      RenderSystem.popMatrix();
      this.id_else.id_class(var1, var2, var3, var4);
      super.id_class(var1, var2, var3, var4);
   }

   static String id_class(rVL<rYG> var0, rKQ var1) {
      StringBuilder var2 = new StringBuilder();

      for (int var3 = 0; var3 < var1.id_case().size(); var3++) {
         if (var3 > 0) {
            var2.append(",");
         }

         var2.append(var1.id_case().get(var3));
      }

      var2.append(";");
      var2.append(var0.id_break(var1.id_throws()));
      return var2.toString();
   }

   public static rKQ id_class(rVL<rYG> var0, String var1, rKQ var2) {
      Iterator var3 = Splitter.on(';').split(var1).iterator();
      if (!var3.hasNext()) {
         return rKQ.id_class(var0);
      } else {
         List var4 = id_class((String)var3.next());
         if (var4.isEmpty()) {
            return rKQ.id_class(var0);
         } else {
            rKQ var5 = var2.id_class(var4, var2.id_protected());
            rqM_2 var6 = rYl_1.id_break;
            if (var3.hasNext()) {
               try {
                  rqO_2 var7 = new rqO_2((String)var3.next());
                  var6 = rqM_2.id_class(rVL.n, var7);
                  var0.id_break(var6).orElseThrow(() -> new IllegalArgumentException("Invalid Biome: " + var7));
               } catch (Exception var8) {
                  id_class.error("Error while parsing flat world string => {}", var8.getMessage());
               }
            }

            rqM_2 var9 = var6;
            var5.id_class(() -> (rYG)var0.id_byte(var9));
            return var5;
         }
      }
   }

   @Override
   public void id_class(QY var1, int var2, int var3) {
      String var4 = this.id_else.id_private();
      this.id_break(var1, var2, var3);
      this.id_else.id_class(var4);
   }

   private static List<rKN> id_class(String var0) {
      ArrayList var1 = Lists.newArrayList();
      String[] var2 = var0.split(",");
      int var3 = 0;

      for (String var7 : var2) {
         rKN var8 = id_class(var7, var3);
         if (var8 == null) {
            return Collections.emptyList();
         }

         var1.add(var8);
         var3 += var8.id_class();
      }

      return var1;
   }

   @Override
   public boolean id_class(double var1, double var3, double var5) {
      return this.id_implements.id_class(var1, var3, var5);
   }

   @Override
   public void id_private() {
      this.id_else.id_catch();
      super.id_private();
   }

   @Override
   public void id_volatile() {
      this.id_volatile.id_break(this.id_case);
   }

   @Override
   protected void v_() {
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      this.id_catch = new rgn_3("createWorld.customize.presets.share");
      this.id_private = new rgn_3("createWorld.customize.presets.list");
      this.id_else = new Lu_1(this.id_super, 50, 40, this.id_package - 100, 20, this.id_catch);
      this.id_else.id_implements(1230);
      rVF var1 = this.id_case.id_class.id_case.id_break().id_break(rVL.n);
      this.id_else.id_class(id_class(var1, this.id_case.id_finally()));
      this.id_synchronized = this.id_case.id_finally();
      this.id_native.add(this.id_else);
      this.id_implements = new Zy_1(this);
      this.id_native.add(this.id_implements);
      this.id_finally = this.id_class(
         (LF)(new LF(this.id_package / 2 - 155, this.id_int - 28, 150, 20, new rgn_3("createWorld.customize.presets.select"), var2 -> {
            rKQ var3 = id_class(var1, this.id_else.id_private(), this.id_synchronized);
            this.id_case.id_class(var3);
            this.id_volatile.id_break(this.id_case);
         }))
      );
      this.id_class((LF)(new LF(this.id_package / 2 + 5, this.id_int - 28, 150, 20, cN_2.id_protected, var1x -> this.id_volatile.id_break(this.id_case))));
      this.id_byte(this.id_implements.id_finally() != null);
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
   }
}
