package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rlI_2 {
   private static final Logger class_ = LogManager.getLogger();
   private final rfH_2 break_;
   private final rrEm_1 byte_;
   private final rlT_2 protected_;
   private final int throws_;
   private final List<rle_3> case_ = Lists.newArrayList();
   private final Map<rle_3, rfH_2> catch_ = Maps.newHashMap();
   private final List<Pair<rlp_3, Collection<rle_3>>> private_ = Lists.newArrayList();
   private rlY_2 implements_;
   private int finally_ = 0;
   private rfw_3 extends_;

   public rlI_2(Collection<rlp_3> var1, rfH_2 var2, rqd_3 var3, rrEm_1 var4, rlT_2 var5, int var6) {
      this.extends_ = var2.new_();
      this.break_ = var2;
      this.byte_ = var4;
      this.protected_ = var5;
      this.throws_ = var6;
      var1.forEach(var3x -> {
         ArrayList var4x = Lists.newArrayList();

         for (rlj_3 var6x : var3x.break_()) {
            rle_3 var7 = new rle_3(var6x, var3, var4);
            var4x.add(var7);
            this.case_.add(var7);
         }

         this.private_.add(Pair.of(var3x, var4x));
      });
   }

   void class_(rle_3 var1) {
      if (this.implements_.catch_()) {
         this.class_(this.finally_ + 1);
      }
   }

   public List<rle_3> class_() {
      return this.case_;
   }

   private void class_(Collection<rle_3> var1) {
      int var2 = 0;
      rfl_3 var3 = new rfl_3(this.extends_);

      for (rle_3 var5 : var1) {
         rfH_2 var6 = new rfH_2(this.extends_);
         ryG_2 var7 = rlH_2.class_(var5.volatile_(), var6, var5.final_(), 2, this.byte_, true);
         rfl_3 var8 = rlH_2.class_(var7);
         var5.class_(var7.char_());
         this.catch_.put(var5, new rfH_2(this.extends_));
         var3 = var3.break_(var8);
         this.extends_.byte_((int)var8.break_() + 5, 0, 0);
         if (var2++ % this.throws_ == this.throws_ - 1) {
            this.extends_.byte_(0, 0, (int)var3.protected_() + 6);
            this.extends_.a_(this.break_.b_());
            var3 = new rfl_3(this.extends_);
         }
      }
   }

   private void class_(int var1) {
      this.finally_ = var1;
      this.implements_ = new rlY_2();
      if (var1 < this.private_.size()) {
         Pair var2 = this.private_.get(this.finally_);
         rlp_3 var3 = (rlp_3)var2.getFirst();
         Collection var4 = (Collection)var2.getSecond();
         this.class_(var4);
         var3.class_(this.byte_);
         String var5 = var3.class_();
         class_.info("Running test batch '" + var5 + "' (" + var4.size() + " tests)...");
         var4.forEach(var1x -> {
            this.implements_.class_(var1x);
            this.implements_.class_(new rlf_3(this));
            rfH_2 var2x = this.catch_.get(var1x);
            rHr_1.class_(var1x, var2x, this.protected_);
         });
      }
   }

   public void break_() {
      this.class_(0);
   }
}
