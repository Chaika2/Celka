package celestial;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.Objects;
import org.apache.commons.lang3.ArrayUtils;

class AF implements Af_1 {
   private boolean id_throws;
   private boolean id_case;
   private long id_catch;

   AF(Av_1 var1, rud_3 var2, Ak_1 var3, Runnable var4) {
      this.id_protected = var1;
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
   }

   @Override
   public rud_3 id_class() {
      return this.id_class;
   }

   @Override
   public void id_class(rgP_2 var1, rgP_2 var2) {
      if (!this.id_throws) {
         Av_1.id_break.error("Can't ping {}: {}", this.id_break.id_break, var2.getString());
         this.id_break.id_protected = new rgn_3("multiplayer.status.cannot_connect").id_class(rgF_2.DARK_RED);
         this.id_break.id_byte = rgN_2.id_byte;
         this.id_protected.id_class(this.id_break);
      }
   }

   @Override
   public void id_class(rLG var1) {
      long var2 = this.id_catch;
      long var4 = rqR_2.id_break();
      this.id_break.id_throws = var4 - var2;
      this.id_class.id_class(new rgn_3("multiplayer.status.finished"));
   }

   @Override
   public void id_class(rLb_1 var1) {
      if (this.id_case) {
         this.id_class.id_class(new rgn_3("multiplayer.status.unrequested"));
      } else {
         this.id_case = true;
         run_3 var2 = var1.id_break();
         if (var2.id_class() != null) {
            this.id_break.id_protected = var2.id_class();
         } else {
            this.id_break.id_protected = rgN_2.id_byte;
         }

         if (var2.id_byte() != null) {
            this.id_break.id_catch = new rgN_2(var2.id_byte().id_class());
            this.id_break.id_case = var2.id_byte().id_break();
         } else {
            this.id_break.id_catch = new rgn_3("multiplayer.status.old");
            this.id_break.id_case = 0;
         }

         if (var2.id_break() == null) {
            this.id_break.id_byte = new rgn_3("multiplayer.status.unknown").id_class(rgF_2.DARK_GRAY);
         } else {
            this.id_break.id_byte = Av_1.id_class(var2.id_break().id_break(), var2.id_break().id_class());
            ArrayList var3 = Lists.newArrayList();
            if (ArrayUtils.isNotEmpty(var2.id_break().id_byte())) {
               for (GameProfile var7 : var2.id_break().id_byte()) {
                  var3.add(new rgN_2(var7.getName()));
               }

               if (var2.id_break().id_byte().length < var2.id_break().id_break()) {
                  var3.add(new rgn_3("multiplayer.status.and_more", var2.id_break().id_break() - var2.id_break().id_byte().length));
               }

               this.id_break.id_implements = var3;
            }
         }

         String var8 = null;
         if (var2.id_protected() != null) {
            String var9 = var2.id_protected();
            if (var9.startsWith("data:image/png;base64,")) {
               var8 = var9.substring("data:image/png;base64,".length());
            } else {
               Av_1.id_break.error("Invalid server icon (unknown format)");
            }
         }

         if (!Objects.equals(var8, this.id_break.id_byte())) {
            this.id_break.id_class(var8);
            this.id_byte.run();
         }

         this.id_catch = rqR_2.id_break();
         this.id_class.id_class(new rLB(this.id_catch));
         this.id_throws = true;
      }
   }
}
