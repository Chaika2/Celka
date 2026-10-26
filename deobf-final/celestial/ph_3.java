package celestial;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ph_3 implements yD_2 {
   private final QY class_;
   private final Map<rRJ, Map<String, rfi_3>> break_ = Maps.newIdentityHashMap();
   private final Map<rRJ, Map<String, rfi_3>> byte_ = Maps.newIdentityHashMap();
   private final Map<rRJ, Map<String, Boolean>> protected_ = Maps.newIdentityHashMap();

   public ph_3(QY var1) {
      this.class_ = var1;
   }

   @Override
   public void class_() {
      this.break_.clear();
      this.byte_.clear();
      this.protected_.clear();
   }

   public void class_(rfi_3 var1, List<rfi_3> var2, List<Boolean> var3, rRJ var4) {
      if (!this.break_.containsKey(var4)) {
         this.break_.put(var4, Maps.newHashMap());
      }

      if (!this.byte_.containsKey(var4)) {
         this.byte_.put(var4, Maps.newHashMap());
         this.protected_.put(var4, Maps.newHashMap());
      }

      this.break_.get(var4).put(var1.toString(), var1);

      for (int var5 = 0; var5 < var2.size(); var5++) {
         rfi_3 var6 = (rfi_3)var2.get(var5);
         Boolean var7 = (Boolean)var3.get(var5);
         this.byte_.get(var4).put(var6.toString(), var6);
         this.protected_.get(var4).put(var6.toString(), var7);
      }
   }

   @Override
   public void class_(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      ly_3 var9 = ((Hh_1)this.class_.class_[16]).finally_();
      gm_3 var10 = (gm_3)this.class_.class_[56];
      rRJ var11 = var10.default_();
      rfH_2 var12 = new rfH_2(var9.break_().break_, 0.0, var9.break_().protected_);
      Ok_1 var13 = var2.getBuffer(HU.return_());
      if (this.break_.containsKey(var11)) {
         for (rfi_3 var15 : this.break_.get(var11).values()) {
            if (var12.class_(var15.catch_(), 500.0)) {
               yX_2.class_(
                  var1,
                  var13,
                  (double)var15.class_ - var3,
                  (double)var15.break_ - var5,
                  (double)var15.byte_ - var7,
                  (double)(var15.protected_ + 1) - var3,
                  (double)(var15.throws_ + 1) - var5,
                  (double)(var15.case_ + 1) - var7,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F
               );
            }
         }
      }

      if (this.byte_.containsKey(var11)) {
         for (Entry var20 : this.byte_.get(var11).entrySet()) {
            String var16 = (String)var20.getKey();
            rfi_3 var17 = (rfi_3)var20.getValue();
            Boolean var18 = this.protected_.get(var11).get(var16);
            if (var12.class_(var17.catch_(), 500.0)) {
               if (var18) {
                  yX_2.class_(
                     var1,
                     var13,
                     (double)var17.class_ - var3,
                     (double)var17.break_ - var5,
                     (double)var17.byte_ - var7,
                     (double)(var17.protected_ + 1) - var3,
                     (double)(var17.throws_ + 1) - var5,
                     (double)(var17.case_ + 1) - var7,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F
                  );
               } else {
                  yX_2.class_(
                     var1,
                     var13,
                     (double)var17.class_ - var3,
                     (double)var17.break_ - var5,
                     (double)var17.byte_ - var7,
                     (double)(var17.protected_ + 1) - var3,
                     (double)(var17.throws_ + 1) - var5,
                     (double)(var17.case_ + 1) - var7,
                     0.0F,
                     0.0F,
                     1.0F,
                     1.0F,
                     0.0F,
                     0.0F,
                     1.0F
                  );
               }
            }
         }
      }
   }
}
