package celestial;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import java.util.List;

public class rvg_3 implements ruS_2<At_1> {
   private rvY_2 class_;
   private final List<rvo_3> break_ = Lists.newArrayList();

   public rvY_2 byte_() {
      return this.class_;
   }

   public rvg_3() {
   }

   public rvg_3(rvY_2 var1, Iterable<rhN_2> var2) {
      this.class_ = var1;

      for (rhN_2 var4 : var2) {
         this.break_.add(new rvo_3(this, var4.sv(), var4.native_, var4.finally_.break_(), var4.boolean_()));
      }
   }

   public rvg_3(rvY_2 var1, rhN_2... var2) {
      this.class_ = var1;

      for (rhN_2 var6 : var2) {
         this.break_.add(new rvo_3(this, var6.sv(), var6.native_, var6.finally_.break_(), var6.boolean_()));
      }
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("action", this.class_).add("entries", this.break_).toString();
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.class_(rvY_2.class);
      int var2 = var1.case_();

      for (int var3 = 0; var3 < var2; var3++) {
         GameProfile var4 = null;
         int var5 = 0;
         rRl_1 var6 = null;
         rgP_2 var7 = null;
         switch (this.class_) {
            case ADD_PLAYER:
               var4 = new GameProfile(var1.private_(), var1.throws_(16));
               int var8 = var1.case_();
               int var9 = 0;

               for (; var9 < var8; var9++) {
                  String var10 = var1.throws_(32767);
                  String var11 = var1.throws_(32767);
                  if (var1.readBoolean()) {
                     var4.getProperties().put(var10, new Property(var10, var11, var1.throws_(32767)));
                  } else {
                     var4.getProperties().put(var10, new Property(var10, var11));
                  }
               }

               var6 = rRl_1.class_(var1.case_());
               var5 = var1.case_();
               if (var1.readBoolean()) {
                  var7 = var1.throws_();
               }
               break;
            case UPDATE_GAME_MODE:
               var4 = new GameProfile(var1.private_(), (String)null);
               var6 = rRl_1.class_(var1.case_());
               break;
            case UPDATE_LATENCY:
               var4 = new GameProfile(var1.private_(), (String)null);
               var5 = var1.case_();
               break;
            case UPDATE_DISPLAY_NAME:
               var4 = new GameProfile(var1.private_(), (String)null);
               if (var1.readBoolean()) {
                  var7 = var1.throws_();
               }
               break;
            case REMOVE_PLAYER:
               var4 = new GameProfile(var1.private_(), (String)null);
         }

         this.break_.add(new rvo_3(this, var4, var5, var6, var7));
      }
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   public List<rvo_3> break_() {
      return this.break_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.protected_(this.break_.size());

      for (rvo_3 var3 : this.break_) {
         switch (this.class_) {
            case ADD_PLAYER:
               var1.class_(var3.class_().getId());
               var1.class_(var3.class_().getName());
               var1.protected_(var3.class_().getProperties().size());

               for (Property var5 : var3.class_().getProperties().values()) {
                  var1.class_(var5.getName());
                  var1.class_(var5.getValue());
                  if (var5.hasSignature()) {
                     var1.writeBoolean(true);
                     var1.class_(var5.getSignature());
                  } else {
                     var1.writeBoolean(false);
                  }
               }

               var1.protected_(var3.byte_().class_());
               var1.protected_(var3.break_());
               if (var3.protected_() == null) {
                  var1.writeBoolean(false);
               } else {
                  var1.writeBoolean(true);
                  var1.class_(var3.protected_());
               }
               break;
            case UPDATE_GAME_MODE:
               var1.class_(var3.class_().getId());
               var1.protected_(var3.byte_().class_());
               break;
            case UPDATE_LATENCY:
               var1.class_(var3.class_().getId());
               var1.protected_(var3.break_());
               break;
            case UPDATE_DISPLAY_NAME:
               var1.class_(var3.class_().getId());
               if (var3.protected_() == null) {
                  var1.writeBoolean(false);
               } else {
                  var1.writeBoolean(true);
                  var1.class_(var3.protected_());
               }
               break;
            case REMOVE_PLAYER:
               var1.class_(var3.class_().getId());
         }
      }
   }
}
