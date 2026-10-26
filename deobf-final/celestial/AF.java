package celestial;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.Objects;
import org.apache.commons.lang3.ArrayUtils;

class AF implements Af_1 {
   private boolean throws_;
   private boolean case_;
   private long catch_;

   AF(Av_1 var1, rud_3 var2, Ak_1 var3, Runnable var4) {
      this.protected_ = var1;
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
   }

   @Override
   public rud_3 class_() {
      return this.class_;
   }

   @Override
   public void class_(rgP_2 var1, rgP_2 var2) {
      if (!this.throws_) {
         Av_1.break_.error("Can't ping {}: {}", this.break_.break_, var2.getString());
         this.break_.protected_ = new rgn_3("multiplayer.status.cannot_connect").class_(rgF_2.DARK_RED);
         this.break_.byte_ = rgN_2.byte_;
         this.protected_.class_(this.break_);
      }
   }

   @Override
   public void class_(rLG var1) {
      long var2 = this.catch_;
      long var4 = rqR_2.break_();
      this.break_.throws_ = var4 - var2;
      this.class_.class_(new rgn_3("multiplayer.status.finished"));
   }

   @Override
   public void class_(rLb_1 var1) {
      if (this.case_) {
         this.class_.class_(new rgn_3("multiplayer.status.unrequested"));
      } else {
         this.case_ = true;
         run_3 var2 = var1.break_();
         if (var2.class_() != null) {
            this.break_.protected_ = var2.class_();
         } else {
            this.break_.protected_ = rgN_2.byte_;
         }

         if (var2.byte_() != null) {
            this.break_.catch_ = new rgN_2(var2.byte_().class_());
            this.break_.case_ = var2.byte_().break_();
         } else {
            this.break_.catch_ = new rgn_3("multiplayer.status.old");
            this.break_.case_ = 0;
         }

         if (var2.break_() == null) {
            this.break_.byte_ = new rgn_3("multiplayer.status.unknown").class_(rgF_2.DARK_GRAY);
         } else {
            this.break_.byte_ = Av_1.class_(var2.break_().break_(), var2.break_().class_());
            ArrayList var3 = Lists.newArrayList();
            if (ArrayUtils.isNotEmpty(var2.break_().byte_())) {
               for (GameProfile var7 : var2.break_().byte_()) {
                  var3.add(new rgN_2(var7.getName()));
               }

               if (var2.break_().byte_().length < var2.break_().break_()) {
                  var3.add(new rgn_3("multiplayer.status.and_more", var2.break_().break_() - var2.break_().byte_().length));
               }

               this.break_.implements_ = var3;
            }
         }

         String var8 = null;
         if (var2.protected_() != null) {
            String var9 = var2.protected_();
            if (var9.startsWith("data:image/png;base64,")) {
               var8 = var9.substring("data:image/png;base64,".length());
            } else {
               Av_1.break_.error("Invalid server icon (unknown format)");
            }
         }

         if (!Objects.equals(var8, this.break_.byte_())) {
            this.break_.class_(var8);
            this.byte_.run();
         }

         this.catch_ = rqR_2.break_();
         this.class_.class_(new rLB(this.catch_));
         this.throws_ = true;
      }
   }
}
