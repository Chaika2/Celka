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
   private static final Logger class_ = LogManager.getLogger();
   private static final Object2IntMap<rqM_2<rYB>> throws_ = rqR_2.class_(new Object2IntOpenCustomHashMap(rqR_2.extends_()), var0 -> {
      var0.put(rYB.byte_, -13408734);
      var0.put(rYB.protected_, -10075085);
      var0.put(rYB.throws_, -8943531);
      var0.defaultReturnValue(-2236963);
   });
   private final BooleanConsumer case_;
   private final rTM catch_;

   private vb_3(BooleanConsumer var1, DataFixer var2, rrGk_1 var3, rYE var4, boolean var5, ImmutableSet<rqM_2<rYB>> var6) {
      super(new rgn_3("optimizeWorld.title", var4.class_()));
      this.case_ = var1;
      this.catch_ = new rTM(var3, var2, var6, var5);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 20, 16777215);
      int var5 = this.package_ / 2 - 150;
      int var6 = this.package_ / 2 + 150;
      int var7 = this.int_ / 4 + 100;
      int var8 = var7 + 10;
      class_(var1, this.super_, this.catch_.private_(), this.package_ / 2, var7 - 9 - 2, 10526880);
      if (this.catch_.throws_() > 0) {
         class_(var1, var5 - 1, var7 - 1, var6 + 1, var8 + 1, -16777216);
         break_(var1, this.super_, new rgn_3("optimizeWorld.info.converted", this.catch_.case_()), var5, 40, 10526880);
         break_(var1, this.super_, new rgn_3("optimizeWorld.info.skipped", this.catch_.catch_()), var5, 52, 10526880);
         break_(var1, this.super_, new rgn_3("optimizeWorld.info.total", this.catch_.throws_()), var5, 64, 10526880);
         int var9 = 0;
         UnmodifiableIterator var10 = this.catch_.byte_().iterator();

         while (var10.hasNext()) {
            rqM_2 var11 = (rqM_2)var10.next();
            int var12 = rfU_2.protected_(this.catch_.class_(var11) * (float)(var6 - var5));
            class_(var1, var5 + var9, var7, var5 + var9 + var12, var8, throws_.getInt(var11));
            var9 += var12;
         }

         int var13 = this.catch_.case_() + this.catch_.catch_();
         class_(var1, this.super_, var13 + " / " + this.catch_.throws_(), this.package_ / 2, var7 + 18 + 2, 10526880);
         class_(var1, this.super_, rfU_2.protected_(this.catch_.protected_() * 100.0F) + "%", this.package_ / 2, var7 + (var8 - var7) / 2 - 4, 10526880);
      }

      super.class_(var1, var2, var3, var4);
   }

   public static vb_3 class_(QY var0, BooleanConsumer var1, DataFixer var2, rrGk_1 var3, boolean var4) {
      rVv_1 var5 = rVm_1.break_();

      try {
         vb_3 var9;
         try (QK var6 = var0.class_(var5, QY::class_, QY::class_, false, var3)) {
            rrGP var7 = var6.byte_();
            var3.class_(var5, var7);
            ImmutableSet var8 = var7.long_().case_();
            var9 = new vb_3(var1, var2, var3, var7.throw_(), var4, var8);
         }

         return var9;
      } catch (Exception var12) {
         class_.warn("Failed to load datapacks, can't optimize world", var12);
         return null;
      }
   }

   @Override
   public void private_() {
      if (this.catch_.break_()) {
         this.case_.accept(true);
      }
   }

   @Override
   public void volatile_() {
      this.case_.accept(false);
   }

   @Override
   protected void v_() {
      super.v_();
      this.class_((LF)(new LF(this.package_ / 2 - 100, this.int_ / 4 + 150, 200, 20, cN_2.protected_, var1 -> {
         this.catch_.class_();
         this.case_.accept(false);
      })));
   }

   @Override
   public void w_() {
      super.w_();
      this.catch_.class_();
   }
}
