package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.DataFixer;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vb_3 extends vm_3 {
   private static final Logger id_class = LogManager.getLogger();
   private static final Object2IntMap<rqM_2<rYB>> id_throws = rqR_2.id_class(new Object2IntOpenCustomHashMap(rqR_2.id_extends()), var0 -> {
      var0.put(rYB.id_byte, -13408734);
      var0.put(rYB.id_protected, -10075085);
      var0.put(rYB.id_throws, -8943531);
      var0.defaultReturnValue(-2236963);
   });
   private final BooleanConsumer id_case;
   private final rTM id_catch;

   private vb_3(BooleanConsumer var1, DataFixer var2, rrGk_1 var3, rYE var4, boolean var5, ImmutableSet<rqM_2<rYB>> var6) {
      super(new rgn_3("optimizeWorld.title", var4.id_class()));
      this.id_case = var1;
      this.id_catch = new rTM(var3, var2, var6, var5);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 20, 16777215);
      int var5 = this.id_package / 2 - 150;
      int var6 = this.id_package / 2 + 150;
      int var7 = this.id_int / 4 + 100;
      int var8 = var7 + 10;
      id_class(var1, this.id_super, this.id_catch.id_private(), this.id_package / 2, var7 - 9 - 2, 10526880);
      if (this.id_catch.id_throws() > 0) {
         id_class(var1, var5 - 1, var7 - 1, var6 + 1, var8 + 1, -16777216);
         id_break(var1, this.id_super, new rgn_3("optimizeWorld.info.converted", this.id_catch.id_case()), var5, 40, 10526880);
         id_break(var1, this.id_super, new rgn_3("optimizeWorld.info.skipped", this.id_catch.id_catch()), var5, 52, 10526880);
         id_break(var1, this.id_super, new rgn_3("optimizeWorld.info.total", this.id_catch.id_throws()), var5, 64, 10526880);
         int var9 = 0;
         UnmodifiableIterator var10 = this.id_catch.id_byte().iterator();

         while (var10.hasNext()) {
            rqM_2 var11 = (rqM_2)var10.next();
            int var12 = rfU_2.id_protected(this.id_catch.id_class(var11) * (float)(var6 - var5));
            id_class(var1, var5 + var9, var7, var5 + var9 + var12, var8, id_throws.getInt(var11));
            var9 += var12;
         }

         int var13 = this.id_catch.id_case() + this.id_catch.id_catch();
         id_class(var1, this.id_super, var13 + " / " + this.id_catch.id_throws(), this.id_package / 2, var7 + 18 + 2, 10526880);
         id_class(
            var1, this.id_super, rfU_2.id_protected(this.id_catch.id_protected() * 100.0F) + "%", this.id_package / 2, var7 + (var8 - var7) / 2 - 4, 10526880
         );
      }

      super.id_class(var1, var2, var3, var4);
   }

   public static vb_3 id_class(QY var0, BooleanConsumer var1, DataFixer var2, rrGk_1 var3, boolean var4) {
      rVv_1 var5 = rVm_1.id_break();

      try {
         vb_3 var9;
         try (QK var6 = var0.id_class(var5, QY::id_class, QY::id_class, false, var3)) {
            rrGP var7 = var6.id_byte();
            var3.id_class(var5, var7);
            ImmutableSet var8 = var7.id_long().id_case();
            var9 = new vb_3(var1, var2, var3, var7.id_throw(), var4, var8);
         }

         return var9;
      } catch (Exception var12) {
         id_class.warn("Failed to load datapacks, can't optimize world", var12);
         return null;
      }
   }

   @Override
   public void id_private() {
      if (this.id_catch.id_break()) {
         this.id_case.accept(true);
      }
   }

   @Override
   public void id_volatile() {
      this.id_case.accept(false);
   }

   @Override
   protected void v_() {
      super.v_();
      this.id_class((LF)(new LF(this.id_package / 2 - 100, this.id_int / 4 + 150, 200, 20, cN_2.id_protected, var1 -> {
         this.id_catch.id_class();
         this.id_case.accept(false);
      })));
   }

   @Override
   public void w_() {
      super.w_();
      this.id_catch.id_class();
   }
}
