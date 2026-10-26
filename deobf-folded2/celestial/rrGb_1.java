package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Dynamic;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrGb_1 extends rrGc_1 {
   private static final Logger id_extends = LogManager.getLogger();
   public int id_class;
   public int id_break;
   public rqM_2<rYB> id_byte;
   public boolean id_protected;
   public boolean id_throws;
   public byte id_case;
   public byte[] id_catch = new byte[16384];
   public boolean id_private;
   public final List<rrGM> id_implements = Lists.newArrayList();
   private final Map<rhd_3, rrGM> id_native = Maps.newHashMap();
   private final Map<String, rrGE> id_volatile = Maps.newHashMap();
   public final Map<String, rrGO> id_finally = Maps.newLinkedHashMap();
   private final Map<String, rrGX> id_final = Maps.newHashMap();

   @Override
   public rcd_3 id_byte(rcd_3 var1) {
      rqO_2.id_class
         .encodeStart(rcf_3.id_class, this.id_byte.id_class())
         .resultOrPartial(id_extends::error)
         .ifPresent(var1x -> var1.id_class("dimension", var1x));
      var1.id_break("xCenter", this.id_class);
      var1.id_break("zCenter", this.id_break);
      var1.id_class("scale", this.id_case);
      var1.id_class("colors", this.id_catch);
      var1.id_class("trackingPosition", this.id_protected);
      var1.id_class("unlimitedTracking", this.id_throws);
      var1.id_class("locked", this.id_private);
      rcy_3 var2 = new rcy_3();

      for (rrGE var4 : this.id_volatile.values()) {
         var2.add(var4.id_protected());
      }

      var1.id_class("banners", var2);
      rcy_3 var6 = new rcy_3();

      for (rrGX var5 : this.id_final.values()) {
         var6.add(var5.id_class());
      }

      var1.id_class("frames", var6);
      return var1;
   }

   public rrGb_1(String var1) {
      super(var1);
   }

   public void id_class(rRq_1 var1, int var2, int var3) {
      Iterator var4 = this.id_volatile.values().iterator();

      while (var4.hasNext()) {
         rrGE var5 = (rrGE)var4.next();
         if (var5.id_class().b_() == var2 && var5.id_class().d_() == var3) {
            rrGE var6 = rrGE.id_class(var1, var5.id_class());
            if (!var5.equals(var6)) {
               var4.remove();
               this.id_finally.remove(var5.id_throws());
            }
         }
      }
   }

   public void id_class(rRg_1 var1, rfH_2 var2) {
      double var3 = (double)var2.b_() + 0.5;
      double var5 = (double)var2.d_() + 0.5;
      int var7 = 1 << this.id_case;
      double var8 = (var3 - (double)this.id_class) / (double)var7;
      double var10 = (var5 - (double)this.id_break) / (double)var7;
      byte var12 = 63;
      boolean var13 = false;
      if (var8 >= -63.0 && var10 >= -63.0 && var8 <= 63.0 && var10 <= 63.0) {
         rrGE var14 = rrGE.id_class(var1, var2);
         if (var14 == null) {
            return;
         }

         boolean var15 = true;
         if (this.id_volatile.containsKey(var14.id_throws()) && this.id_volatile.get(var14.id_throws()).equals(var14)) {
            this.id_volatile.remove(var14.id_throws());
            this.id_finally.remove(var14.id_throws());
            var15 = false;
            var13 = true;
         }

         if (var15) {
            this.id_volatile.put(var14.id_throws(), var14);
            this.id_class(var14.id_break(), var1, var14.id_throws(), var3, var5, 180.0, var14.id_byte());
            var13 = true;
         }

         if (var13) {
            this.id_byte();
         }
      }
   }

   public rrGM id_class(rhd_3 var1) {
      rrGM var2 = this.id_native.get(var1);
      if (var2 == null) {
         var2 = new rrGM(this, var1);
         this.id_native.put(var1, var2);
         this.id_implements.add(var2);
      }

      return var2;
   }

   public void id_class(int var1, int var2) {
      this.id_byte();

      for (rrGM var4 : this.id_implements) {
         var4.id_class(var1, var2);
      }
   }

   public void id_class(rfH_2 var1, int var2) {
      this.id_finally.remove("frame-" + var2);
      this.id_final.remove(rrGX.id_class(var1));
   }

   public ruS_2<?> id_class(rdn_3 var1, rRq_1 var2, rhd_3 var3) {
      rrGM var4 = this.id_native.get(var3);
      return var4 == null ? null : var4.id_class(var1);
   }

   public void id_class(rhd_3 var1, rdn_3 var2) {
      if (!this.id_native.containsKey(var1)) {
         rrGM var3 = new rrGM(this, var1);
         this.id_native.put(var1, var3);
         this.id_implements.add(var3);
      }

      if (!((rhz_3)var1.id_implements[1]).id_implements(var2)) {
         this.id_finally.remove(var1.g().getString());
      }

      for (int var7 = 0; var7 < this.id_implements.size(); var7++) {
         rrGM var4 = this.id_implements.get(var7);
         String var5 = var4.id_class.g().getString();
         if (!(Boolean)var4.id_class.id_throws[27] && (((rhz_3)var4.id_class.id_implements[1]).id_implements(var2) || var2.id_goto())) {
            if (!var2.id_goto() && ((rYB)var4.id_class.id_throws[7]).E() == this.id_byte && this.id_protected) {
               this.id_class(
                  rrGh_1.PLAYER,
                  (rYB)var4.id_class.id_throws[7],
                  var5,
                  var4.id_class.rx(),
                  var4.id_class.BO(),
                  (double)((Float)var4.id_class.id_throws[15]).floatValue(),
                  (rgP_2)null
               );
            }
         } else {
            this.id_native.remove(var4.id_class);
            this.id_implements.remove(var4);
            this.id_finally.remove(var5);
         }
      }

      if (var2.id_goto() && this.id_protected) {
         rsG_2 var8 = var2.id_while();
         rfH_2 var10 = var8.id_implements();
         rrGX var12 = this.id_final.get(rrGX.id_class(var10));
         if (var12 != null && var8.V() != var12.id_protected() && this.id_final.containsKey(var12.id_throws())) {
            this.id_finally.remove("frame-" + var12.id_protected());
         }

         rrGX var6 = new rrGX(var10, var8.Pg().id_protected() * 90, var8.V());
         this.id_class(
            rrGh_1.FRAME,
            (rYB)var1.id_throws[7],
            "frame-" + var8.V(),
            (double)var10.b_(),
            (double)var10.d_(),
            (double)(var8.Pg().id_protected() * 90),
            (rgP_2)null
         );
         this.id_final.put(var6.id_throws(), var6);
      }

      rcd_3 var9 = var2.id_package();
      if (var9 != null && var9.id_byte("Decorations", 9)) {
         rcy_3 var11 = var9.id_protected("Decorations", 10);

         for (int var13 = 0; var13 < var11.size(); var13++) {
            rcd_3 var14 = var11.id_class(var13);
            if (!this.id_finally.containsKey(var14.id_native("id"))) {
               this.id_class(
                  rrGh_1.id_class(var14.id_case("type")),
                  (rYB)var1.id_throws[7],
                  var14.id_native("id"),
                  var14.id_extends("x"),
                  var14.id_extends("z"),
                  var14.id_extends("rot"),
                  (rgP_2)null
               );
            }
         }
      }
   }

   public void id_class(rrGb_1 var1) {
      this.id_private = true;
      this.id_class = var1.id_class;
      this.id_break = var1.id_break;
      this.id_volatile.putAll(var1.id_volatile);
      this.id_finally.putAll(var1.id_finally);
      System.arraycopy(var1.id_catch, 0, this.id_catch, 0, var1.id_catch.length);
      this.id_byte();
   }

   public void id_class(double var1, double var3, int var5) {
      int var6 = 128 * (1 << var5);
      int var7 = rfU_2.id_byte((var1 + 64.0) / (double)var6);
      int var8 = rfU_2.id_byte((var3 + 64.0) / (double)var6);
      this.id_class = var7 * var6 + var6 / 2 - 64;
      this.id_break = var8 * var6 + var6 / 2 - 64;
   }

   @Override
   public void id_class(rcd_3 var1) {
      this.id_byte = (rqM_2<rYB>)rRJ.id_class(new Dynamic(rcf_3.id_class, var1.id_byte("dimension")))
         .resultOrPartial(id_extends::error)
         .orElseThrow(() -> new IllegalArgumentException("Invalid map dimension: " + var1.id_byte("dimension")));
      this.id_class = var1.id_private("xCenter");
      this.id_break = var1.id_private("zCenter");
      this.id_case = (byte)rfU_2.id_class(var1.id_case("scale"), 0, 4);
      this.id_protected = !var1.id_byte("trackingPosition", 1) || var1.id_new("trackingPosition");
      this.id_throws = var1.id_new("unlimitedTracking");
      this.id_private = var1.id_new("locked");
      this.id_catch = var1.id_volatile("colors");
      if (this.id_catch.length != 16384) {
         this.id_catch = new byte[16384];
      }

      rcy_3 var2 = var1.id_protected("banners", 10);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         rrGE var4 = rrGE.id_class(var2.id_class(var3));
         this.id_volatile.put(var4.id_throws(), var4);
         this.id_class(var4.id_break(), (rRg_1)null, var4.id_throws(), (double)var4.id_class().b_(), (double)var4.id_class().d_(), 180.0, var4.id_byte());
      }

      rcy_3 var6 = var1.id_protected("frames", 10);

      for (int var7 = 0; var7 < var6.size(); var7++) {
         rrGX var5 = rrGX.id_class(var6.id_class(var7));
         this.id_final.put(var5.id_throws(), var5);
         this.id_class(
            rrGh_1.FRAME,
            (rRg_1)null,
            "frame-" + var5.id_protected(),
            (double)var5.id_break().b_(),
            (double)var5.id_break().d_(),
            (double)var5.id_byte(),
            (rgP_2)null
         );
      }
   }

   public void id_class(int var1, int var2, int var3, boolean var4, boolean var5, rqM_2<rYB> var6) {
      this.id_case = (byte)var3;
      this.id_class((double)var1, (double)var2, this.id_case);
      this.id_byte = var6;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_byte();
   }

   private void id_class(rrGh_1 var1, rRg_1 var2, String var3, double var4, double var6, double var8, rgP_2 var10) {
      int var11 = 1 << this.id_case;
      float var12 = (float)(var4 - (double)this.id_class) / (float)var11;
      float var13 = (float)(var6 - (double)this.id_break) / (float)var11;
      byte var14 = (byte)((int)((double)(var12 * 2.0F) + 0.5));
      byte var15 = (byte)((int)((double)(var13 * 2.0F) + 0.5));
      byte var16 = 63;
      byte var17;
      if (var12 >= -63.0F && var13 >= -63.0F && var12 <= 63.0F && var13 <= 63.0F) {
         var8 += var8 < 0.0 ? -8.0 : 8.0;
         var17 = (byte)((int)(var8 * 16.0 / 360.0));
         if (this.id_byte == rYB.id_protected && var2 != null) {
            int var20 = (int)(var2.id_public().id_case() / 10L);
            var17 = (byte)(var20 * var20 * 34187121 + var20 * 121 >> 15 & 15);
         }
      } else {
         if (var1 != rrGh_1.PLAYER) {
            this.id_finally.remove(var3);
            return;
         }

         short var18 = 320;
         if (Math.abs(var12) < 320.0F && Math.abs(var13) < 320.0F) {
            var1 = rrGh_1.PLAYER_OFF_MAP;
         } else {
            if (!this.id_throws) {
               this.id_finally.remove(var3);
               return;
            }

            var1 = rrGh_1.PLAYER_OFF_LIMITS;
         }

         var17 = 0;
         if (var12 <= -63.0F) {
            var14 = -128;
         }

         if (var13 <= -63.0F) {
            var15 = -128;
         }

         if (var12 >= 63.0F) {
            var14 = 127;
         }

         if (var13 >= 63.0F) {
            var15 = 127;
         }
      }

      this.id_finally.put(var3, new rrGO(var1, var14, var15, var17, var10));
   }

   public static void id_class(rdn_3 var0, rfH_2 var1, String var2, rrGh_1 var3) {
      rcy_3 var4;
      if (var0.id_final() && var0.id_package().id_byte("Decorations", 9)) {
         var4 = var0.id_package().id_protected("Decorations", 10);
      } else {
         var4 = new rcy_3();
         var0.id_class("Decorations", var4);
      }

      rcd_3 var5 = new rcd_3();
      var5.id_class("type", var3.id_class());
      var5.id_class("id", var2);
      var5.id_class("x", (double)var1.b_());
      var5.id_class("z", (double)var1.d_());
      var5.id_class("rot", 180.0);
      var4.add(var5);
      if (var3.id_byte()) {
         rcd_3 var6 = var0.id_class("display");
         var6.id_break("MapColor", var3.id_protected());
      }
   }
}
